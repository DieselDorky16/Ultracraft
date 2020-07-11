package com.christopher.ultracraftmod.world.gen;

import com.christopher.ultracraftmod.blocks.BlockInit;
import com.christopher.ultracraftmod.util.references.NetherBiome;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class NetherIronOreGen {
    public static void generateOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome == NetherBiome.SOUL_SAND_VALLEY || biome == NetherBiome.CRIMSON_FOREST || biome == NetherBiome.WARPED_FOREST || biome == NetherBiome.BASALT_DELTAS || biome == NetherBiome.NETHER_WASTES)  {
                ConfiguredPlacement customConfig = Placement.COUNT_RANGE
                        .configure(new CountRangeConfig(3, 0, 0, 128));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, BlockInit.NETHER_IRON_ORE.get().getDefaultState(), 10))
                        .withPlacement(customConfig));
            }
        }
    }
}
