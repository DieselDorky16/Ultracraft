package com.christopher.ultracraftmod.world.gen;

import com.christopher.ultracraftmod.Ultracraft;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Ultracraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MobSpawningRules {
    @SubscribeEvent
    public static void spawnMobs(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            if (biome.getCategory() == Biome.Category.SAVANNA) {
                biome.getSpawns(EntityClassification.CREATURE)
                        .add(new Biome.SpawnListEntry(EntityType.ZOMBIE_HORSE, 5, 3, 5));
            }
        }
    }
}
