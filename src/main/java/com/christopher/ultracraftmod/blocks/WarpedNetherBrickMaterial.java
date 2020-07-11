package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.util.references.NetherWartColor;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WarpedNetherBrickMaterial extends Block {

    public WarpedNetherBrickMaterial() {
        super(Block.Properties.create(Material.ROCK, NetherWartColor.WARPED).func_235861_h_().hardnessAndResistance(2.0F, 6.0F).sound(SoundType.field_235590_L_));
    }
}
