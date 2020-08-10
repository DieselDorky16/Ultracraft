package com.christopher.ultracraftmod.items;

import com.christopher.ultracraftmod.Ultracraft;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSpawnEggItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ultracraft.MOD_ID);
    public static final RegistryObject<Item> ENDER_DRAGON_SPAWN_EGG = ITEMS.register("ender_dragon_spawn_egg", () -> new SpawnEggItem(EntityType.ENDER_DRAGON, 0x000000, 0x2A093B, (new Item.Properties()).group(ItemGroup.MISC)));
    public static final RegistryObject<Item> ILLUSIONER_SPAWN_EGG = ITEMS.register("illusioner_spawn_egg", () -> new SpawnEggItem(EntityType.ILLUSIONER, 0x005597, 0x949B9B, (new Item.Properties()).group(ItemGroup.MISC)));
    public static final RegistryObject<Item> IRON_GOLEM_SPAWN_EGG = ITEMS.register("iron_golem_spawn_egg", () -> new SpawnEggItem(EntityType.IRON_GOLEM, 0xEEEEEE, 0xEB4D3D, (new Item.Properties()).group(ItemGroup.MISC)));
    public static final RegistryObject<Item> SNOW_GOLEM_SPAWN_EGG = ITEMS.register("snow_golem_spawn_egg", () -> new SpawnEggItem(EntityType.SNOW_GOLEM, 0xFFFFFF, 0xEBA351, (new Item.Properties()).group(ItemGroup.MISC)));
    public static final RegistryObject<Item> WITHER_SPAWN_EGG = ITEMS.register("wither_spawn_egg", () -> new SpawnEggItem(EntityType.WITHER, 0x000000, 0x2B1F2B, (new Item.Properties()).group(ItemGroup.MISC)));
}
