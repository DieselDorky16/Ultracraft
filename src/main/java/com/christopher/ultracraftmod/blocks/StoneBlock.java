package com.christopher.ultracraftmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class StoneBlock extends Block {
    public StoneBlock() {
        super(Block.Properties.from(Blocks.field_235410_nt_).hardnessAndResistance(1.5F, 6.0F));
    }
}
