package com.christopher.ultracraftmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CinnamonBun extends Item {
    public CinnamonBun() {
        super((new Item.Properties()).group(ItemGroup.FOOD).food(ModFoods.CINNAMON_BUN));
    }
}
