package com.christopher.ultracraftmod.world.gen;

import com.christopher.ultracraftmod.blocks.BlockInit;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;

public abstract class ModBiomeFeatures {
    public static final BlockClusterFeatureConfig CRIMSON_BERRY_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.CRIMSON_BERRY_BUSH.get().getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(64).whitelist(ImmutableSet.of(Blocks.field_235381_mu_.getBlock())).func_227317_b_().build();
    public static final BlockClusterFeatureConfig WARPED_BERRY_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.WARPED_BERRY_BUSH.get().getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(64).whitelist(ImmutableSet.of(Blocks.field_235372_ml_.getBlock())).func_227317_b_().build();
}
