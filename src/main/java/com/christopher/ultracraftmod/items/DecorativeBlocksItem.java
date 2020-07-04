package com.christopher.ultracraftmod.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class DecorativeBlocksItem extends BlockItem {
    public DecorativeBlocksItem(Block block) {
        super(block, new Properties().group(ItemGroup.DECORATIONS));
    }
}