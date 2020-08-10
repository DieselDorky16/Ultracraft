package com.christopher.ultracraftmod.util;

import com.christopher.ultracraftmod.Ultracraft;
import com.christopher.ultracraftmod.blocks.ModBlocks;
import com.christopher.ultracraftmod.util.extra.VanillaHandler;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Ultracraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_WART.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.REDSTONE_CAMPFIRE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.REDSTONE_LANTERN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(VanillaHandler.NETHER_PORTAL_STAIRS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_BERRY_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_BERRY_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.NETHERITE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_WALL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.GOLDEN_BARS.get(), RenderType.getCutoutMipped());
    }

}
