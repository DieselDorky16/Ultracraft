package com.christopher.ultracraftmod.world.gen.nether_placement;

import com.christopher.ultracraftmod.blocks.BlockInit;
import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SuppressWarnings("deprecation")
public class NetherSoulMagma extends Placement<FrequencyConfig> {
    public NetherSoulMagma(Codec<FrequencyConfig> SoulMagmaPlacement) {
        super(SoulMagmaPlacement);
    }
    public Stream<BlockPos> getPositions(IWorld worldIn, ChunkGenerator generatorIn, Random random, FrequencyConfig configIn, BlockPos pos) {
        int i = worldIn.getSeaLevel() / 2 + 1;
        return IntStream.range(0, configIn.count).mapToObj((p_227454_3_) -> {
            int j = random.nextInt(16) + pos.getX();
            int k = random.nextInt(16) + pos.getZ();
            int l = i - 5 + random.nextInt(10);
            return new BlockPos(j, l, k);
        });
    }
}