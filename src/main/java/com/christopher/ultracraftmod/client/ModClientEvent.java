package com.christopher.ultracraftmod.client;

import com.christopher.ultracraftmod.client.keybindings.ModKeyRegistry;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.booleans.BooleanHash;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@OnlyIn(Dist.CLIENT)
public class ModClientEvent {
    private final Minecraft mc = Minecraft.getInstance();


    @SuppressWarnings("deprecation")
    @SubscribeEvent
    public void onFogRender(EntityViewRenderEvent.RenderFogEvent event, ModKeyRegistry.ModKeyEvent the_other_event) {
        World world = mc.world;
        PlayerEntity player = mc.player;

        if (world == null || !world.isRemote) {
            return;
        }

        if (the_other_event.getKeyBinding() == ModClient.TOGGLE_NETHER_FOG_BIND && the_other_event.getAction() == ModKeyRegistry.EnumKeyAction.PRESSED)

        if (mc.player.world.func_230315_m_().func_236040_e_()) // is nether
        {
            RenderSystem.fogMode(GlStateManager.FogMode.EXP);
            RenderSystem.fogDensity(0.1F * 0.0F);
            RenderSystem.enableFog();
        }
    }
}



