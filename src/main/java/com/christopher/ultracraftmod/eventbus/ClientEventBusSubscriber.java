package com.christopher.ultracraftmod.eventbus;

import com.christopher.ultracraftmod.UltraCraftMod;
import com.christopher.ultracraftmod.blocks.BlockInit;
import com.christopher.ultracraftmod.util.VanillaHandler;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = UltraCraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockInit.WARPED_WART.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.REDSTONE_CAMPFIRE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.REDSTONE_LANTERN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(VanillaHandler.NETHER_PORTAL_STAIRS.get(), RenderType.getTranslucent());
    }
}
