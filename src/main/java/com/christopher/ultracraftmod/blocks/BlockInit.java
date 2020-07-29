package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.UltraCraftMod;
import com.christopher.ultracraftmod.util.references.BlockLightingRegistries;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.particles.ParticleTypes;
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
    public static final RegistryObject<Block> CRIMSON_BERRY_BUSH = BLOCKS.register("crimson_berry_bush", CrimsonBerries::new);
    public static final RegistryObject<Block> WARPED_BERRY_BUSH = BLOCKS.register("warped_berry_bush", WarpedBerries::new);
    public static final RegistryObject<Block> NETHERITE_TRAPDOOR = BLOCKS.register("netherite_trapdoor", NetheriteTrapdoor::new);
    public static final RegistryObject<Block> NETHER_IRON_ORE = BLOCKS.register("nether_iron_ore", () -> new OreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).func_235861_h_().hardnessAndResistance(3.0F, 3.0F).sound(SoundType.field_235598_T_)));
    public static final RegistryObject<Block> GOLDEN_BARS = BLOCKS.register("golden_bars", () -> new PaneBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.AIR).func_235861_h_().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).notSolid()));
    public static final RegistryObject<Block> BLAST_FURNACE_TOP = BLOCKS.register("blast_stovetop", StoneBlock::new);
    public static final RegistryObject<Block> SMITHING_TABLE_TOP = BLOCKS.register("smithing_tabletop", StoneBlock::new);
    public static final RegistryObject<Block> WHITESTONE = BLOCKS.register("whitestone", StoneBlock::new);
    public static final RegistryObject<Block> SPRUCE_BOOKSHELF = BLOCKS.register("spruce_bookshelf", BookshelfBlock::new);
    public static final RegistryObject<Block> BIRCH_BOOKSHELF = BLOCKS.register("birch_bookshelf", BookshelfBlock::new);
    public static final RegistryObject<Block> JUNGLE_BOOKSHELF = BLOCKS.register("jungle_bookshelf", BookshelfBlock::new);
    public static final RegistryObject<Block> ACACIA_BOOKSHELF = BLOCKS.register("acacia_bookshelf", BookshelfBlock::new);
    public static final RegistryObject<Block> DARK_OAK_BOOKSHELF = BLOCKS.register("dark_oak_bookshelf", BookshelfBlock::new);
    public static final RegistryObject<Block> CRIMSON_BOOKSHELF = BLOCKS.register("crimson_bookshelf", BookshelfBlock::new);
    public static final RegistryObject<Block> WARPED_BOOKSHELF = BLOCKS.register("warped_bookshelf", BookshelfBlock::new);
    public static final RegistryObject<Block> CINNAMON = BLOCKS.register("cinnamon", () -> new CinnamonBlock(AbstractBlock.Properties.create(Material.BAMBOO, MaterialColor.BROWN).tickRandomly().zeroHardnessAndResistance().hardnessAndResistance(1.0F).sound(SoundType.BAMBOO).notSolid()));
    public static final RegistryObject<Block> BOOK_BOX = BLOCKS.register("book_box", BookBox::new);
    public static final RegistryObject<Block> CRIMSON_TORCH = BLOCKS.register("crimson_torch", () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance().func_235838_a_((p_235466_0_) -> {
        return BlockLightingRegistries.soul_fire;
    }).sound(SoundType.WOOD), ParticleTypes.field_239819_as_));
    public static final RegistryObject<Block> CRIMSON_WALL_TORCH = BLOCKS.register("crimson_wall_torch", () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance().func_235838_a_((p_235465_0_) -> {
        return BlockLightingRegistries.soul_fire;
    }).sound(SoundType.WOOD).lootFrom(BlockInit.CRIMSON_TORCH.get()), ParticleTypes.field_239819_as_));
}
