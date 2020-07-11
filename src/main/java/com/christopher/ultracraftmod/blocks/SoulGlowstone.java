package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.util.references.BlockLightingRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class SoulGlowstone extends Block {
    public SoulGlowstone() {
        super(Block.Properties.create(Material.GLASS, MaterialColor.CYAN).hardnessAndResistance(0.3F).sound(SoundType.GLASS).func_235838_a_((p_235464_0_) -> {
            return BlockLightingRegistries.soul_fire;
        }));
    }
}
