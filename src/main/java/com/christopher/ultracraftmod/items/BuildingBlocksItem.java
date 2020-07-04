package com.christopher.ultracraftmod.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BuildingBlocksItem extends BlockItem {
    public BuildingBlocksItem(Block block) {
        super(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
    }
}