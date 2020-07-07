package com.christopher.ultracraftmod.items;

import com.christopher.ultracraftmod.UltraCraftMod;
import com.christopher.ultracraftmod.blocks.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
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
    public static final RegistryObject<Item> NETHERITE_TRAPDOOR = ITEMS.register("netherite_trapdoor", () -> new RedstoneBlocksItem(BlockInit.NETHERITE_TRAPDOOR.get()));

}
