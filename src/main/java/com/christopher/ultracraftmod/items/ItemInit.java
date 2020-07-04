package com.christopher.ultracraftmod.items;

import com.christopher.ultracraftmod.UltraCraftMod;
import com.christopher.ultracraftmod.blocks.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UltraCraftMod.MOD_ID);
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget",NetheriteNew::new);
    public static final RegistryObject<Item> WARPED_WART = ITEMS.register("warped_wart", () -> new BlockNamedItem(BlockInit.WARPED_WART.get(), (new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> COW_LEATHER = ITEMS.register("cow_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> LLAMA_LEATHER = ITEMS.register("llama_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> HOGLIN_LEATHER = ITEMS.register("hoglin_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> HORSE_LEATHER = ITEMS.register("horse_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> MULE_LEATHER = ITEMS.register("mule_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> DONKEY_LEATHER = ITEMS.register("donkey_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> RED_MOOSHROOM_LEATHER = ITEMS.register("red_mooshroom_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BROWN_MOOSHROOM_LEATHER = ITEMS.register("brown_mooshroom_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
}
