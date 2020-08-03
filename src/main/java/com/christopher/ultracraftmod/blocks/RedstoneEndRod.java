package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.util.references.BlockLightingRegistries;
import net.minecraft.block.BlockState;
import net.minecraft.block.EndRodBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

@SuppressWarnings("deprecation")
public class RedstoneEndRod extends EndRodBlock {
    public RedstoneEndRod() {
        super(Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().setLightLevel((p_235454_0_) -> {
            return BlockLightingRegistries.redstone;
        }).sound(SoundType.WOOD).notSolid());
    }
    public boolean canProvidePower(BlockState state) {
        return true;
    }

    public int getWeakPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
        return 15;
    }
}
