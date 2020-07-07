package com.christopher.ultracraftmod;

import com.christopher.ultracraftmod.blocks.BlockInit;
import com.christopher.ultracraftmod.items.BlockItemInit;
import com.christopher.ultracraftmod.items.ItemInit;
import com.christopher.ultracraftmod.util.UnobtainablesHandler;
import com.christopher.ultracraftmod.util.VanillaHandler;
import com.christopher.ultracraftmod.world.gen.CrimsonBerriesGen;
import com.christopher.ultracraftmod.world.gen.SoulMagmaGen;
import com.christopher.ultracraftmod.world.gen.WarpedBerriesGen;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@SuppressWarnings("deprecation")
@Mod("ultracraft")
@Mod.EventBusSubscriber(modid = UltraCraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class UltraCraftMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ultracraft";
    public static UltraCraftMod instance;

    public UltraCraftMod() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        //Registering SingleForgeRegistry Abstract Classes
        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);

        //MultiForgeRegistry Abstract Classes
        BlockItemInit.init();
        VanillaHandler.init();
        UnobtainablesHandler.init();


        //Setting up instance
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);


        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();
    }

    private void setup(final FMLCommonSetupEvent event)
    {

        DeferredWorkQueue.runLater(() -> {
            ComposterBlock.registerCompostable(0.3F, ItemInit.CRIMSON_BERRIES.get());
        });
        DeferredWorkQueue.runLater(() -> {
            ComposterBlock.registerCompostable(0.3F, ItemInit.WARPED_BERRIES.get());
        });
        DeferredWorkQueue.runLater(SoulMagmaGen::generateOre);
        DeferredWorkQueue.runLater(CrimsonBerriesGen::generatePlants);
        DeferredWorkQueue.runLater(WarpedBerriesGen::generatePlants);
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}
