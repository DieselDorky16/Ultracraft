package com.christopher.ultracraftmod.util;

import com.christopher.ultracraftmod.UltraCraftMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundsInit {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            UltraCraftMod.MOD_ID);
    public static final RegistryObject<SoundEvent> LIFE_SHROOM_USE = SOUNDS.register("life_shroom_use",
            () -> new SoundEvent(new ResourceLocation(UltraCraftMod.MOD_ID, "life_shroom_use")));
}
