package com.christopher.ultracraftmod.util.extra;

import com.christopher.ultracraftmod.Ultracraft;
import com.christopher.ultracraftmod.items.BuildingBlocksItem;
import com.christopher.ultracraftmod.items.CommandsOnly;
import com.christopher.ultracraftmod.items.netherite_groups.BuildingBlocksItem_NETHERITE;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class VanillaHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ultracraft.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ultracraft.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static final RegistryObject<Block> NETHERITE_SLAB = BLOCKS.register("netherite_slab", () -> new SlabBlock(Block.Properties.from(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_STAIRS = BLOCKS.register("netherite_stairs", () -> new StairsBlock(()->Blocks.NETHERITE_BLOCK.getDefaultState(),Block.Properties.from(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> OBSIDIAN_STAIRS = BLOCKS.register("obsidian_stairs", () -> new StairsBlock(()->Blocks.OBSIDIAN.getDefaultState(),Block.Properties.from(Blocks.OBSIDIAN)));
    public static final RegistryObject<Block> CRYING_OBSIDIAN_STAIRS = BLOCKS.register("crying_obsidian_stairs", () -> new StairsBlock(()->Blocks.CRYING_OBSIDIAN.getDefaultState(),Block.Properties.from(Blocks.CRYING_OBSIDIAN)));

    //BlockItems
    public static final RegistryObject<Item> NETHERITE_SLAB_ITEM = ITEMS.register("netherite_slab", () -> new BuildingBlocksItem_NETHERITE(NETHERITE_SLAB.get()));
    public static final RegistryObject<Item> NETHERITE_STAIRS_ITEM = ITEMS.register("netherite_stairs", () -> new BuildingBlocksItem_NETHERITE(NETHERITE_STAIRS.get()));
    public static final RegistryObject<Item> OBSIDIAN_STAIRS_ITEM = ITEMS.register("obsidian_stairs", () -> new BuildingBlocksItem(OBSIDIAN_STAIRS.get()));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_STAIRS_ITEM = ITEMS.register("crying_obsidian_stairs", () -> new BuildingBlocksItem(CRYING_OBSIDIAN_STAIRS.get()));


    //CursedObjects
    public static final RegistryObject<Block> NETHER_PORTAL_STAIRS = BLOCKS.register("nether_portal_stairs", () -> new StairsBlock(()->Blocks.NETHER_PORTAL.getDefaultState(),Block.Properties.from(Blocks.NETHER_PORTAL)));
    public static final RegistryObject<Item> NETHER_PORTAL_STAIR_ITEM = ITEMS.register("nether_portal_stairs", () -> new CommandsOnly(NETHER_PORTAL_STAIRS.get()));
}
