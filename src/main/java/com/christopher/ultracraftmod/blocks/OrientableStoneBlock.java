package com.christopher.ultracraftmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OrientableStoneBlock extends RotatedPillarBlock {
    public OrientableStoneBlock() {
        super(Block.Properties.create(Material.EARTH)
                .hardnessAndResistance(1.25F,4.2F)
                .sound(SoundType.STONE)
                .harvestTool(ToolType.PICKAXE));
    }
}
