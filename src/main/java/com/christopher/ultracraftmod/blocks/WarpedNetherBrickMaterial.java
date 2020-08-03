package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.util.references.NetherWartColor;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WarpedNetherBrickMaterial extends Block {

    public WarpedNetherBrickMaterial() {
        super(Block.Properties.create(Material.ROCK, NetherWartColor.WARPED).setRequiresTool().hardnessAndResistance(2.0F, 6.0F).sound(SoundType.NETHER_BRICK));
    }
}
