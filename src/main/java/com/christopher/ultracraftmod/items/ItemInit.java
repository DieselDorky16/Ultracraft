package com.christopher.ultracraftmod.items;

import com.christopher.ultracraftmod.UltraCraftMod;
import com.christopher.ultracraftmod.blocks.BlockInit;
import com.christopher.ultracraftmod.items.hammer.DiamondHammer;
import com.christopher.ultracraftmod.items.hammer.GoldHammer;
import com.christopher.ultracraftmod.items.hammer.IronHammer;
import com.christopher.ultracraftmod.items.hammer.NetheriteHammer;
import com.christopher.ultracraftmod.items.hammer.StoneHammer;
import com.christopher.ultracraftmod.items.hammer.WoodenHammer;
import com.christopher.ultracraftmod.items.netherite_groups.NetheriteNew;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("deprecation")
public abstract class  ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UltraCraftMod.MOD_ID);
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", NetheriteNew::new);
    public static final RegistryObject<Item> WARPED_WART = ITEMS.register("warped_wart", () -> new BlockNamedItem(BlockInit.WARPED_WART.get(), (new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> COW_LEATHER = ITEMS.register("cow_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> LLAMA_LEATHER = ITEMS.register("llama_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> HOGLIN_LEATHER = ITEMS.register("hoglin_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> HORSE_LEATHER = ITEMS.register("horse_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> MULE_LEATHER = ITEMS.register("mule_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> DONKEY_LEATHER = ITEMS.register("donkey_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> RED_MOOSHROOM_LEATHER = ITEMS.register("red_mooshroom_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BROWN_MOOSHROOM_LEATHER = ITEMS.register("brown_mooshroom_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> CRIMSON_BERRIES = ITEMS.register("crimson_berries", () -> new BlockNamedItem(BlockInit.CRIMSON_BERRY_BUSH.get(), (new Item.Properties()).group(ItemGroup.FOOD).food(Foods.SWEET_BERRIES)));
    public static final RegistryObject<Item> WARPED_BERRIES = ITEMS.register("warped_berries", () -> new BlockNamedItem(BlockInit.WARPED_BERRY_BUSH.get(), (new Item.Properties()).group(ItemGroup.FOOD).food(Foods.SWEET_BERRIES)));
    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer", WoodenHammer::new);
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer", StoneHammer::new);
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", IronHammer::new);
    public static final RegistryObject<Item> GOLDEN_HAMMER = ITEMS.register("golden_hammer", GoldHammer::new);
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", DiamondHammer::new);
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", NetheriteHammer::new);
    public static final RegistryObject<Item> CINNAMON_STICK = ITEMS.register("cinnamon_stick", () -> new BlockNamedItem(BlockInit.CINNAMON.get(), (new Item.Properties()).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> CINNAMON_SUGAR = ITEMS.register("cinnamon_sugar", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> CINNAMON_BUN = ITEMS.register("cinnamon_bun", CinnamonBun::new);
}
