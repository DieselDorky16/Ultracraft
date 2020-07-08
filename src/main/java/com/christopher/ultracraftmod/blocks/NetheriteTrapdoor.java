package com.christopher.ultracraftmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class NetheriteTrapdoor extends TrapDoorBlock {
    public NetheriteTrapdoor() {
        super(Block.Properties.create(Material.IRON, MaterialColor.BLACK).func_235861_h_().hardnessAndResistance(50.0F, 1200.0F).sound(SoundType.field_235594_P_).notSolid());

    }

}
