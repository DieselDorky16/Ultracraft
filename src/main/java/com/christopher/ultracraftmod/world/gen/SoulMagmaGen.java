package com.christopher.ultracraftmod.world.gen;

import com.christopher.ultracraftmod.blocks.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class SoulMagmaGen {
    public static void generateOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.field_235252_ay_) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.SOUL_MAGMA.get().getDefaultState(), 33)).withPlacement(Placement.MAGMA.configure(new FrequencyConfig(4))));
            }
        }
    }
}
