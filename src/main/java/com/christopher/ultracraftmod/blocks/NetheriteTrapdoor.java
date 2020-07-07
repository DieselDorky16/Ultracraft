package com.christopher.ultracraftmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.fluid.Fluids;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class NetheriteTrapdoor extends TrapDoorBlock {
    public NetheriteTrapdoor() {
        super(Block.Properties.create(Material.IRON, MaterialColor.BLACK).func_235861_h_().hardnessAndResistance(50.0F, 1200.0F).sound(SoundType.field_235594_P_).notSolid());

    }

}
