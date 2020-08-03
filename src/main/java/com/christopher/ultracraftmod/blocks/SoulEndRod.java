package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.util.references.BlockLightingRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.EndRodBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SoulEndRod extends EndRodBlock {
    public SoulEndRod() {
        super(Block.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().setLightLevel((p_235454_0_) -> {
            return BlockLightingRegistries.soul_fire;
        }).sound(SoundType.WOOD).notSolid());
    }
}
