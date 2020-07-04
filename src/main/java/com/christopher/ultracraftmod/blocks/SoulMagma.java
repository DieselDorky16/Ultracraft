package com.christopher.ultracraftmod.blocks;

import com.christopher.ultracraftmod.customInterface.BlockLightingRegistries;
import com.christopher.ultracraftmod.customInterface.SurfaceDamageFloat;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MagmaBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class SoulMagma extends MagmaBlock {
    public SoulMagma() {
        super(Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).func_235861_h_().func_235838_a_((p_235452_0_) -> {
            return BlockLightingRegistries.weak;
        }).tickRandomly().hardnessAndResistance(0.5F).func_235827_a_((p_235445_0_, p_235445_1_, p_235445_2_, p_235445_3_) -> {
            return p_235445_3_.isImmuneToFire();
        }));
    }
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if (!entityIn.func_230279_az_() && entityIn instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity)entityIn)) {
            entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, SurfaceDamageFloat.soul_fire);
        }

        super.onEntityWalk(worldIn, pos, entityIn);
    }
    @Override
    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
    }
}
