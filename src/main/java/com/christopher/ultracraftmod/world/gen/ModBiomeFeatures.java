package com.christopher.ultracraftmod.world.gen;

import com.christopher.ultracraftmod.blocks.ModBlocks;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;

public abstract class ModBiomeFeatures {
    public static final BlockClusterFeatureConfig CRIMSON_BERRY_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CRIMSON_BERRY_BUSH.get().getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(64).whitelist(ImmutableSet.of(Blocks.CRIMSON_NYLIUM.getBlock())).func_227317_b_().build();
    public static final BlockClusterFeatureConfig WARPED_BERRY_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.WARPED_BERRY_BUSH.get().getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(64).whitelist(ImmutableSet.of(Blocks.CRIMSON_NYLIUM.getBlock())).func_227317_b_().build();
}
