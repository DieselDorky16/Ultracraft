package com.christopher.ultracraftmod.util.references;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

import java.util.List;

public interface DimensionalBiomes {

    public static final List<Biome> END_BIOMES = ImmutableList.of(Biomes.THE_END, Biomes.END_HIGHLANDS, Biomes.END_MIDLANDS, Biomes.SMALL_END_ISLANDS, Biomes.END_BARRENS);
    public static final List<Biome> NETHER_BIOMES = ImmutableList.of(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY, Biomes.BASALT_DELTAS);
}
