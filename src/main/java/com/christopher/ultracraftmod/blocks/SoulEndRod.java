package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.customInterface.BlockLightingRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.EndRodBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SoulEndRod extends EndRodBlock {
    public SoulEndRod() {
        super(Block.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().func_235838_a_((p_235454_0_) -> {
            return BlockLightingRegistries.soul_fire;
        }).sound(SoundType.WOOD).notSolid());
    }
}
