//This concept was taken from the 20w14infinite April Fools snapshot...
package com.christopher.ultracraftmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

@SuppressWarnings("deprecation")
public class BookBox extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;


    public BookBox() {
        super(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F).sound(SoundType.WOOD));
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!player.isSpectator()) {
            this.dropBook(worldIn, pos);
             return ActionResultType.func_233537_a_(worldIn.isRemote);
        } else
        {
            return ActionResultType.PASS;
        }
    }


        private void dropBook(World worldIn, BlockPos pos) {
        if (!worldIn.isRemote) {
                ItemStack itemstack = new ItemStack(Items.BOOK.asItem());
                    Direction direction = this.getDefaultState().getBlockState().get(FACING);
            float f = 0.7F;
            double d0 = (double)(worldIn.rand.nextFloat() * 0.7F) + (double)0.15F;
            double d1 = (double)(worldIn.rand.nextFloat() * 0.7F) + (double)0.060000002F + 0.6D;
            double d2 = (double)(worldIn.rand.nextFloat() * 0.7F) + (double)0.15F;
            ItemStack itemstack1 = itemstack.copy();
            ItemEntity itementity = new ItemEntity(worldIn, (double)pos.getX() + d0, (double)pos.getY() + d1, (double)pos.getZ() + d2, itemstack1);
                    itementity.setDefaultPickupDelay();
                    worldIn.addEntity(itementity);
                }
            }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
