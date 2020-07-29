package com.christopher.ultracraftmod.events;

import com.christopher.ultracraftmod.UltraCraftMod;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = UltraCraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VanillaTransparencyFix {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(Blocks.CONDUIT, RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(Blocks.CHEST, RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(Blocks.TRAPPED_CHEST, RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(Blocks.ENDER_CHEST, RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(Blocks.END_PORTAL, RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(Blocks.END_GATEWAY, RenderType.getCutoutMipped());
    }
}
