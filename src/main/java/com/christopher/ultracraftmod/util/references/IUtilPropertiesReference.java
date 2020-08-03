package com.christopher.ultracraftmod.util.references;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public interface IUtilPropertiesReference {
    public Item.Properties TOOLS = new Item.Properties().group(ItemGroup.TOOLS);
    public Item.Properties COMBAT = new Item.Properties().group(ItemGroup.COMBAT);
    public Item.Properties TOOLS_NETHERITE = new Item.Properties().isBurnable().group(ItemGroup.TOOLS);
}
