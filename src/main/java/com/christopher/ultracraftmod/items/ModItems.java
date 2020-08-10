package com.christopher.ultracraftmod.items;

import com.christopher.ultracraftmod.Ultracraft;
import com.christopher.ultracraftmod.blocks.ModBlocks;
import com.christopher.ultracraftmod.items.hammer.DiamondHammer;
import com.christopher.ultracraftmod.items.hammer.EmeraldHammer;
import com.christopher.ultracraftmod.items.hammer.GoldHammer;
import com.christopher.ultracraftmod.items.hammer.IronHammer;
import com.christopher.ultracraftmod.items.hammer.NetheriteHammer;
import com.christopher.ultracraftmod.items.hammer.StoneHammer;
import com.christopher.ultracraftmod.items.hammer.WoodenHammer;
import com.christopher.ultracraftmod.items.netherite_groups.NetheriteNew;
import com.christopher.ultracraftmod.items.special_powerups.LifeShroomItem;
import com.christopher.ultracraftmod.util.enums.ModArmorMaterial;
import com.christopher.ultracraftmod.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Foods;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("ALL")
public abstract class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ultracraft.MOD_ID);
    public static final RegistryObject<Item> PIGLIN_EYE = ITEMS.register("piglin_eye", PiglinEyeItem::new);
    public static final RegistryObject<Item> PORTAL_EYE = ITEMS.register("portal_eye", PortalEyeItem::new);
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", NetheriteNew::new);
    public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", BasicItem::new);
    public static final RegistryObject<Item> WARPED_WART = ITEMS.register("warped_wart", () -> new BlockNamedItem(ModBlocks.WARPED_WART.get(), (new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> COW_LEATHER = ITEMS.register("cow_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> LLAMA_LEATHER = ITEMS.register("llama_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> HOGLIN_LEATHER = ITEMS.register("hoglin_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> HORSE_LEATHER = ITEMS.register("horse_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> MULE_LEATHER = ITEMS.register("mule_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> DONKEY_LEATHER = ITEMS.register("donkey_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> RED_MOOSHROOM_LEATHER = ITEMS.register("red_mooshroom_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BROWN_MOOSHROOM_LEATHER = ITEMS.register("brown_mooshroom_leather", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> CRIMSON_BERRIES = ITEMS.register("crimson_berries", () -> new BlockNamedItem(ModBlocks.CRIMSON_BERRY_BUSH.get(), (new Item.Properties()).group(ItemGroup.FOOD).food(Foods.SWEET_BERRIES)));
    public static final RegistryObject<Item> WARPED_BERRIES = ITEMS.register("warped_berries", () -> new BlockNamedItem(ModBlocks.WARPED_BERRY_BUSH.get(), (new Item.Properties()).group(ItemGroup.FOOD).food(Foods.SWEET_BERRIES)));
    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer", WoodenHammer::new);
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer", StoneHammer::new);
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", IronHammer::new);
    public static final RegistryObject<Item> GOLDEN_HAMMER = ITEMS.register("golden_hammer", GoldHammer::new);
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", DiamondHammer::new);
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", NetheriteHammer::new);
    public static final RegistryObject<HammerItem> EMERALD_HAMMER = ITEMS.register("emerald_hammer", EmeraldHammer::new);
    public static final RegistryObject<Item> CINNAMON_STICK = ITEMS.register("cinnamon_stick", () -> new BlockNamedItem(ModBlocks.CINNAMON.get(), (new Item.Properties()).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> CINNAMON_SUGAR = ITEMS.register("cinnamon_sugar", () -> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> CINNAMON_BUN = ITEMS.register("cinnamon_bun", CinnamonBun::new);
    public static final RegistryObject<Item> LIFE_MUSHROOM = ITEMS.register("life_mushroom", LifeShroomItem::new);

    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModItemTier.EMERALD, 5, -1.2F, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModItemTier.EMERALD, 0, -2.8F, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModItemTier.EMERALD, 1.0F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModItemTier.EMERALD, 6, -3.0F, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModItemTier.EMERALD,-5, 0.0F, new Item.Properties().group(ItemGroup.TOOLS)));

    // Armor
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> EMERALD_INGOT = ITEMS.register("emerald_ingot", BasicItem::new);
}

