package com.christopher.ultracraftmod.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class RedstoneBlocksItem extends BlockItem {
    public RedstoneBlocksItem(Block block) {
        super(block, new Properties().group(ItemGroup.REDSTONE));
    }
}