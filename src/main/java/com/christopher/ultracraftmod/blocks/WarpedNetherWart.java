package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.items.ItemInit;
import com.christopher.ultracraftmod.util.references.NetherWartColor;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherWartBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class WarpedNetherWart extends NetherWartBlock {
    public WarpedNetherWart() {
        super(Block.Properties.create(Material.PLANTS, NetherWartColor.WARPED).doesNotBlockMovement().tickRandomly().sound(SoundType.NETHER_WART));
    }
    @Override
    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(ItemInit.WARPED_WART.get());
    }
}
