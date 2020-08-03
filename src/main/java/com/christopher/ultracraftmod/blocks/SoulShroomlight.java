package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.util.references.BlockLightingRegistries;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class SoulShroomlight extends Block {
    public SoulShroomlight() {
        super(Block.Properties.create(Material.ORGANIC, MaterialColor.CYAN)
                .hardnessAndResistance(1.0F)
                .sound(SoundType.SHROOMLIGHT)
                .harvestTool(ToolType.HOE)
                .setLightLevel((p_235439_0_) -> {
            return BlockLightingRegistries.soul_fire;
        }));
    }
}
