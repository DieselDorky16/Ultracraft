package com.christopher.ultracraftmod.items;

import com.christopher.ultracraftmod.blocks.BlockInit;
import com.christopher.ultracraftmod.common.ModToolTypes;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ToolItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Map;
import java.util.Set;

public class HammerItem extends ToolItem {
    private static final Set<Material> field_234662_c_ = Sets.newHashSet(Material.ROCK);
    private static final Set<Block> field_150917_d_ = Sets.newHashSet(Blocks.OBSIDIAN);
    protected static final Map<Block, Block> STONE_CRACKING_MAP = (new ImmutableMap.Builder<Block, Block>()).put(Blocks.STONE_BRICKS, Blocks.CRACKED_STONE_BRICKS).put(Blocks.INFESTED_STONE_BRICKS, Blocks.INFESTED_CRACKED_STONE_BRICKS).put(Blocks.NETHER_BRICKS, Blocks.field_235394_nH_).put(Blocks.field_235411_nu_, Blocks.field_235412_nv_).put(BlockInit.WARPED_NETHER_BRICKS.get(), BlockInit.CRACKED_WARPED_NETHER_BRICKS.get()).put(Blocks.RED_NETHER_BRICKS, BlockInit.CRACKED_RED_NETHER_BRICKS.get()).build();
    public HammerItem(
    IItemTier tier, float attackDamageIn, float attackSpeedIn, Item.Properties builder) {
        super(attackDamageIn, attackSpeedIn, tier, field_150917_d_, builder.addToolType(ToolType.get(ModToolTypes.HAMMER), tier.getHarvestLevel()));
    }

    public float getDestroySpeed(ItemStack stack, BlockState state) {
        Material material = state.getMaterial();
        return field_234662_c_.contains(material) ? this.efficiency : super.getDestroySpeed(stack, state);
    }

    /**
     * Called when this item is used when targetting a Block
     */
    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos blockpos = context.getPos();
        BlockState blockstate = world.getBlockState(blockpos);
        Block block = STONE_CRACKING_MAP.get(blockstate.getBlock());
        if (block != null) {
            PlayerEntity playerentity = context.getPlayer();
            world.playSound(playerentity, blockpos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS, 1.0F, 1.0F);
            if (!world.isRemote) {
                world.setBlockState(blockpos, block.getDefaultState(), 11);
                if (playerentity != null) {
                    context.getItem().damageItem(1, playerentity, (p_220040_1_) -> {
                        p_220040_1_.sendBreakAnimation(context.getHand());
                    });
                }
            }

            return ActionResultType.func_233537_a_(world.isRemote);
        } else {
            return ActionResultType.PASS;
        }
    }
}
