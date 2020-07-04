package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.customInterface.BlockLightingRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

@SuppressWarnings("deprecation")
public class RedstoneLantern extends LanternBlock {
    public RedstoneLantern() {
        super(Block.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(3.5F).sound(SoundType.LANTERN).func_235838_a_((p_235447_0_) -> {
            return BlockLightingRegistries.redstone;
        }).notSolid());
    }
    public boolean canProvidePower(BlockState state) {
        return true;
    }

    public int getWeakPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
        return 15;
    }
}
