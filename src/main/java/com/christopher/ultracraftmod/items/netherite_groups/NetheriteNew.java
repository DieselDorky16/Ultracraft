package com.christopher.ultracraftmod.items.netherite_groups;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class NetheriteNew extends Item {
    public NetheriteNew() {
        super(new Item.Properties().group(ItemGroup.MATERIALS).isBurnable());
    }
}
