package com.christopher.ultracraftmod.util.references;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

import java.util.List;

public interface DimensionalBiomes {

    public static final List<Biome> END_BIOMES = ImmutableList.of(Biomes.THE_END, Biomes.END_HIGHLANDS, Biomes.END_MIDLANDS, Biomes.SMALL_END_ISLANDS, Biomes.END_BARRENS);
    public static final List<Biome> NETHER_BIOMES = ImmutableList.of(Biomes.field_235254_j_, Biomes.field_235253_az_, Biomes.field_235250_aA_, Biomes.field_235252_ay_, Biomes.field_235251_aB_);
}
