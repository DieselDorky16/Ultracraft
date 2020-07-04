package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.UltraCraftMod;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UltraCraftMod.MOD_ID);
    public static final RegistryObject<Block> SOUL_ROOTS = BLOCKS.register("soul_root", OrientableStoneBlock::new);
    public static final RegistryObject<Block> SOUL_MAGMA = BLOCKS.register("soul_magma_block",SoulMagma::new);
    public static final RegistryObject<Block> SOUL_END_ROD = BLOCKS.register("soul_end_rod",SoulEndRod::new);
    public static final RegistryObject<Block> SOUL_GLOWSTONE = BLOCKS.register("soul_glowstone",SoulGlowstone::new);
    public static final RegistryObject<Block> SOUL_SHROOMLIGHT = BLOCKS.register("soul_shroomlight",SoulShroomlight::new);
    public static final RegistryObject<Block> WARPED_WART = BLOCKS.register("warped_wart",WarpedNetherWart::new);
    public static final RegistryObject<Block> WARPED_NETHER_BRICKS = BLOCKS.register("warped_nether_bricks",WarpedNetherBrickMaterial::new);
    public static final RegistryObject<Block> WARPED_NETHER_BRICK_WALL = BLOCKS.register("warped_nether_brick_wall", () -> new WallBlock(Block.Properties.from(BlockInit.WARPED_NETHER_BRICKS.get())));
    public static final RegistryObject<Block> WARPED_NETHER_BRICK_SLAB = BLOCKS.register("warped_nether_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.WARPED_NETHER_BRICKS.get())));
    public static final RegistryObject<Block> WARPED_NETHER_BRICK_STAIRS = BLOCKS.register("warped_nether_brick_stairs", () -> new StairsBlock(()->BlockInit.WARPED_NETHER_BRICKS.get().getDefaultState(),Block.Properties.from(BlockInit.WARPED_NETHER_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_WARPED_NETHER_BRICKS = BLOCKS.register("cracked_warped_nether_bricks",WarpedNetherBrickMaterial::new);
    public static final RegistryObject<Block> CHISELED_WARPED_NETHER_BRICKS = BLOCKS.register("chiseled_warped_nether_bricks",WarpedNetherBrickMaterial::new);
    public static final RegistryObject<Block> CRACKED_RED_NETHER_BRICKS = BLOCKS.register("cracked_red_nether_bricks",WarpedNetherBrickMaterial::new);
    public static final RegistryObject<Block> CHISELED_RED_NETHER_BRICKS = BLOCKS.register("chiseled_red_nether_bricks",WarpedNetherBrickMaterial::new);
    public static final RegistryObject<Block> REDSTONE_LANTERN = BLOCKS.register("redstone_lantern",RedstoneLantern::new);
    public static final RegistryObject<Block> REDSTONE_CAMPFIRE = BLOCKS.register("redstone_campfire",RedstoneCampfire::new);
    public static final RegistryObject<Block> REDSTONE_END_ROD = BLOCKS.register("redstone_end_rod",RedstoneEndRod::new);
}
