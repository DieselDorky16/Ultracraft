package com.christopher.ultracraftmod.potions;

import com.christopher.ultracraftmod.UltraCraftMod;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class ModPotions {
    public static final DeferredRegister<Effect> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS,
            UltraCraftMod.MOD_ID);

    public static final DeferredRegister<Potion> POTION_EFFECTS = DeferredRegister.create(ForgeRegistries.POTION_TYPES,
            UltraCraftMod.MOD_ID);

    public static void init() {
        POTIONS.register(FMLJavaModLoadingContext.get().getModEventBus());
        POTION_EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

        public static final RegistryObject<Potion> HASTE = POTION_EFFECTS.register("haste", () -> new Potion(new EffectInstance(Effects.HASTE, 3600, 0)));
        public static final RegistryObject<Potion> STRONG_HASTE = POTION_EFFECTS.register("strong_haste", () -> new Potion("haste", new EffectInstance(Effects.HASTE, 1800, 1)));
        public static final RegistryObject<Potion> LONG_HASTE = POTION_EFFECTS.register("long_haste", () -> new Potion("haste", new EffectInstance(Effects.HASTE, 9600, 0)));



}
