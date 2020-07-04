package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.customInterface.BlockLightingRegistries;
import com.christopher.ultracraftmod.customInterface.SurfaceDamageFloat;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CampfireCookingRecipe;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.CampfireTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.Random;
import java.util.function.ToIntFunction;

@SuppressWarnings("deprecation")
public class RedstoneCampfire extends CampfireBlock {
    public RedstoneCampfire() {
        super(true, 1, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD).func_235838_a_(func_235420_a_()).notSolid());;
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(LIT, Boolean.valueOf(context.getWorld().isBlockPowered(context.getPos())));
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!state.isIn(newState.getBlock())) {
            TileEntity tileentity = worldIn.getTileEntity(pos);
            if (tileentity instanceof CampfireTileEntity) {
                InventoryHelper.dropItems(worldIn, pos, ((CampfireTileEntity)tileentity).getInventory());
            }

            super.onReplaced(state, worldIn, pos, newState, isMoving);
        }
    }
    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        TileEntity tileentity = worldIn.getTileEntity(pos);
        if (tileentity instanceof CampfireTileEntity) {
            CampfireTileEntity campfiretileentity = (CampfireTileEntity)tileentity;
            ItemStack itemstack = player.getHeldItem(handIn);
            Optional<CampfireCookingRecipe> optional = campfiretileentity.findMatchingRecipe(itemstack);
            if (optional.isPresent()) {
                if (!worldIn.isRemote && campfiretileentity.addItem(player.abilities.isCreativeMode ? itemstack.copy() : itemstack, optional.get().getCookTime())) {
                    player.addStat(Stats.INTERACT_WITH_CAMPFIRE);
                    return ActionResultType.SUCCESS;
                }

                return ActionResultType.CONSUME;
            }
        }

        return ActionResultType.PASS;
    }
    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if (!entityIn.func_230279_az_() && state.get(LIT) && entityIn instanceof LivingEntity) {
            entityIn.attackEntityFrom(new DamageSource("fatal_shock").setDamageIsAbsolute().setDamageBypassesArmor().setDamageIsAbsolute(), SurfaceDamageFloat.fatal_redstone_shock);
        }

        super.onEntityCollision(state, worldIn, pos, entityIn);
    }

    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        if (!worldIn.isRemote) {
            boolean flag = state.get(LIT);
            if (flag != worldIn.isBlockPowered(pos)) {
                if (flag) {
                    worldIn.getPendingBlockTicks().scheduleTick(pos, this, 4);
                } else {
                    worldIn.setBlockState(pos, state.func_235896_a_(LIT), 2);
                }
            }

        }
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        if (state.get(LIT) && !worldIn.isBlockPowered(pos)) {
            worldIn.setBlockState(pos, state.func_235896_a_(LIT), 2);
        }

    }
    private static ToIntFunction<BlockState> func_235420_a_() {
        return (p_235421_1_) -> {
            return p_235421_1_.get(BlockStateProperties.LIT) ? BlockLightingRegistries.redstone : 0;
        };
    }
    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(WATERLOGGED)) {
        }

        return facing == Direction.DOWN ? stateIn.with(SIGNAL_FIRE, Boolean.valueOf(this.isHayBlock(facingState))) : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }
    //This is an AccessTransformer Alternative. Please do not remove, or it will break the mod.
    private boolean isHayBlock(BlockState stateIn) {
        return stateIn.isIn(Blocks.HAY_BLOCK);
    }
}
