package com.christopher.ultracraftmod.client;

import com.christopher.ultracraftmod.Ultracraft;
import com.christopher.ultracraftmod.client.keybindings.ModKeyRegistry;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber(modid = Ultracraft.MOD_ID, value = { Dist.CLIENT }, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModClient {
    @OnlyIn(Dist.CLIENT)
    public static KeyBinding TOGGLE_NETHER_FOG_BIND = new KeyBinding("Toggle Nether Fog", InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_K, "key.categories.misc");

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void clientInit(FMLClientSetupEvent event)
    {

        // Subscribe key registry.
        ModKeyRegistry keyRegistry;
        Ultracraft.registerEvent(keyRegistry = new ModKeyRegistry());

        // Register key binds.
        keyRegistry.register(TOGGLE_NETHER_FOG_BIND);
    }
}

