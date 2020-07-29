package com.christopher.ultracraftmod.items;

import com.christopher.ultracraftmod.UltraCraftMod;
import com.christopher.ultracraftmod.blocks.BlockInit;
import com.christopher.ultracraftmod.items.netherite_groups.RedstoneBlocksItem_NETHERITE;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallOrFloorItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class BlockItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UltraCraftMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UltraCraftMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> SOUL_ROOTS = ITEMS.register("soul_root", () -> new BuildingBlocksItem(BlockInit.SOUL_ROOTS.get()));
    public static final RegistryObject<Item> SOUL_MAGMA = ITEMS.register("soul_magma_block", () -> new BuildingBlocksItem(BlockInit.SOUL_MAGMA.get()));
    public static final RegistryObject<Item> SOUL_END_ROD = ITEMS.register("soul_end_rod", () -> new DecorativeBlocksItem(BlockInit.SOUL_END_ROD.get()));
    public static final RegistryObject<Item> SOUL_GLOWSTONE = ITEMS.register("soul_glowstone", () -> new BuildingBlocksItem(BlockInit.SOUL_GLOWSTONE.get()));
    public static final RegistryObject<Item> SOUL_SHROOMLIGHT = ITEMS.register("soul_shroomlight", () -> new BuildingBlocksItem(BlockInit.SOUL_SHROOMLIGHT.get()));
    public static final RegistryObject<Item> WARPED_NETHER_BRICKS = ITEMS.register("warped_nether_bricks", () -> new BuildingBlocksItem(BlockInit.WARPED_NETHER_BRICKS.get()));
    public static final RegistryObject<Item> WARPED_NETHER_BRICK_WALL = ITEMS.register("warped_nether_brick_wall", () -> new BuildingBlocksItem(BlockInit.WARPED_NETHER_BRICK_WALL.get()));
    public static final RegistryObject<Item> WARPED_NETHER_BRICK_SLAB = ITEMS.register("warped_nether_brick_slab", () -> new BuildingBlocksItem(BlockInit.WARPED_NETHER_BRICK_SLAB.get()));
    public static final RegistryObject<Item> WARPED_NETHER_BRICK_STAIRS = ITEMS.register("warped_nether_brick_stairs", () -> new BuildingBlocksItem(BlockInit.WARPED_NETHER_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> CRACKED_WARPED_NETHER_BRICKS = ITEMS.register("cracked_warped_nether_bricks", () -> new BuildingBlocksItem(BlockInit.CRACKED_WARPED_NETHER_BRICKS.get()));
    public static final RegistryObject<Item> CHISELED_WARPED_NETHER_BRICKS = ITEMS.register("chiseled_warped_nether_bricks", () -> new BuildingBlocksItem(BlockInit.CHISELED_WARPED_NETHER_BRICKS.get()));
    public static final RegistryObject<Item> CRACKED_RED_NETHER_BRICKS = ITEMS.register("cracked_red_nether_bricks", () -> new BuildingBlocksItem(BlockInit.CRACKED_RED_NETHER_BRICKS.get()));
    public static final RegistryObject<Item> CHISELED_RED_NETHER_BRICKS = ITEMS.register("chiseled_red_nether_bricks", () -> new BuildingBlocksItem(BlockInit.CHISELED_RED_NETHER_BRICKS.get()));
    public static final RegistryObject<Item> REDSTONE_LANTERN = ITEMS.register("redstone_lantern", () -> new RedstoneBlocksItem(BlockInit.REDSTONE_LANTERN.get()));
    public static final RegistryObject<Item> REDSTONE_CAMPFIRE = ITEMS.register("redstone_campfire", () -> new RedstoneBlocksItem(BlockInit.REDSTONE_CAMPFIRE.get()));
    public static final RegistryObject<Item> REDSTONE_END_ROD = ITEMS.register("redstone_end_rod", () -> new RedstoneBlocksItem(BlockInit.REDSTONE_END_ROD.get()));
    public static final RegistryObject<Item> NETHERITE_TRAPDOOR = ITEMS.register("netherite_trapdoor", () -> new RedstoneBlocksItem_NETHERITE(BlockInit.NETHERITE_TRAPDOOR.get()));
    public static final RegistryObject<Item> NETHER_IRON_ORE = ITEMS.register("nether_iron_ore", () -> new BuildingBlocksItem(BlockInit.NETHER_IRON_ORE.get()));
    public static final RegistryObject<Item> GOLDEN_BARS = ITEMS.register("golden_bars", () -> new DecorativeBlocksItem(BlockInit.GOLDEN_BARS.get()));
    public static final RegistryObject<Item> BLAST_FURNACE_TOP = ITEMS.register("blast_stovetop", () -> new DecorativeBlocksItem(BlockInit.BLAST_FURNACE_TOP.get()));
    public static final RegistryObject<Item> SMITHING_TABLE_TOP = ITEMS.register("smithing_tabletop", () -> new DecorativeBlocksItem(BlockInit.SMITHING_TABLE_TOP.get()));
    public static final RegistryObject<Item> WHITESTONE = ITEMS.register("whitestone", () -> new DecorativeBlocksItem(BlockInit.WHITESTONE.get()));
    public static final RegistryObject<Item> SPRUCE_BOOKSHELF = ITEMS.register("spruce_bookshelf", () -> new BuildingBlocksItem(BlockInit.SPRUCE_BOOKSHELF.get()));
    public static final RegistryObject<Item> BIRCH_BOOKSHELF = ITEMS.register("birch_bookshelf", () -> new BuildingBlocksItem(BlockInit.BIRCH_BOOKSHELF.get()));
    public static final RegistryObject<Item> JUNGLE_BOOKSHELF = ITEMS.register("jungle_bookshelf", () -> new BuildingBlocksItem(BlockInit.JUNGLE_BOOKSHELF.get()));
    public static final RegistryObject<Item> ACACIA_BOOKSHELF = ITEMS.register("acacia_bookshelf", () -> new BuildingBlocksItem(BlockInit.ACACIA_BOOKSHELF.get()));
    public static final RegistryObject<Item> DARK_OAK_BOOKSHELF = ITEMS.register("dark_oak_bookshelf", () -> new BuildingBlocksItem(BlockInit.DARK_OAK_BOOKSHELF.get()));
    public static final RegistryObject<Item> CRIMSON_BOOKSHELF = ITEMS.register("crimson_bookshelf", () -> new BuildingBlocksItem(BlockInit.CRIMSON_BOOKSHELF.get()));
    public static final RegistryObject<Item> WARPED_BOOKSHELF = ITEMS.register("warped_bookshelf", () -> new BuildingBlocksItem(BlockInit.WARPED_BOOKSHELF.get()));
    public static final RegistryObject<Item> BOOK_BOX = ITEMS.register("book_box", () -> new BuildingBlocksItem(BlockInit.BOOK_BOX.get()));
    public static final RegistryObject<Item> CRIMSON_TORCH = ITEMS.register("crimson_torch", () -> new WallOrFloorItem(BlockInit.CRIMSON_TORCH.get(), BlockInit.CRIMSON_WALL_TORCH.get(), (new Item.Properties()).group(ItemGroup.DECORATIONS)));
}
