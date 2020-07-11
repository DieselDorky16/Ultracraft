package com.christopher.ultracraftmod.world.gen;

import com.christopher.ultracraftmod.util.references.NetherBiome;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class CrimsonBerriesGen {
    public static void generatePlants() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome == NetherBiome.CRIMSON_FOREST) {
                biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(ModBiomeFeatures.CRIMSON_BERRY_BUSH_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1))));
            }
        }
    }
}
