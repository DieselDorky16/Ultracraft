package com.christopher.ultracraftmod;

import com.christopher.ultracraftmod.blocks.ModBlocks;
import com.christopher.ultracraftmod.enchantments.ModEnchantments;
import com.christopher.ultracraftmod.entity.item.ModPaintingTypes;
import com.christopher.ultracraftmod.items.ModBlockItems;
import com.christopher.ultracraftmod.items.ModItems;
import com.christopher.ultracraftmod.items.ModSpawnEggItem;
import com.christopher.ultracraftmod.potions.ModPotions;
import com.christopher.ultracraftmod.util.extra.ModSounds;
import com.christopher.ultracraftmod.util.extra.UnobtainablesHandler;
import com.christopher.ultracraftmod.util.extra.VanillaHandler;
import com.christopher.ultracraftmod.world.gen.CrimsonBerriesGen;
import com.christopher.ultracraftmod.world.gen.NetherIronOreGen;
import com.christopher.ultracraftmod.world.gen.SoulMagmaGen;
import com.christopher.ultracraftmod.world.gen.WarpedBerriesGen;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.block.ComposterBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.CreateWorldScreen;
import net.minecraft.client.gui.screen.DataPackScreen;
import net.minecraft.client.gui.screen.DemoScreen;
import net.minecraft.client.gui.screen.IngameMenuScreen;
import net.minecraft.client.gui.screen.OptionsScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.VideoSettingsScreen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Effects;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.client.gui.screen.ModListScreen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicBoolean;

@SuppressWarnings("deprecation")
@Mod("ultracraft")
@Mod.EventBusSubscriber(modid = Ultracraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ultracraft {
    AtomicBoolean fogIsEnabled = new AtomicBoolean(true);


    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ultracraft";
    public static Ultracraft instance;

    public static ResourceLocation location(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public Ultracraft() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        //Registering SingleForgeRegistry Abstract Classes
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModEnchantments.ENCHANTMENTS.register(modEventBus);
        ModSounds.SOUNDS.register(modEventBus);
        ModPaintingTypes.PAINTING_TYPE.register(modEventBus);

        //Subregistries
        ModSpawnEggItem.ITEMS.register(modEventBus);

        //MultiForgeRegistry Abstract Classes
        ModBlockItems.init();
        VanillaHandler.init();
        UnobtainablesHandler.init();
        ModPotions.init();

        //Commands


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


    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() -> {
            ComposterBlock.registerCompostable(0.3F, ModItems.CRIMSON_BERRIES.get());
        });
        DeferredWorkQueue.runLater(() -> {
            ComposterBlock.registerCompostable(0.3F, ModItems.WARPED_BERRIES.get());
        });
        DeferredWorkQueue.runLater(() -> {
            ComposterBlock.registerCompostable(0.65F, ModItems.WARPED_WART.get());
        });
        DeferredWorkQueue.runLater(() -> {
            ComposterBlock.registerCompostable(0.65F, ModBlocks.SOUL_SHROOMLIGHT.get());
        });
        DeferredWorkQueue.runLater(() -> {
            ComposterBlock.registerCompostable(0.85F, Items.ROTTEN_FLESH.getItem());
        });
        DeferredWorkQueue.runLater(SoulMagmaGen::generateOre);
        DeferredWorkQueue.runLater(NetherIronOreGen::generateOre);
        DeferredWorkQueue.runLater(CrimsonBerriesGen::generatePlants);
        DeferredWorkQueue.runLater(WarpedBerriesGen::generatePlants);

    }
    public static ResourceLocation locate(String key)
    {
        return new ResourceLocation(MOD_ID, key);
    }

    public static void registerEvent(Object obj)
    {
        MinecraftForge.EVENT_BUS.register(obj);
    }


    public static String find(String key)
    {
        return MOD_ID + ":" + key;
    }




    private void doClientStuff(final FMLClientSetupEvent event) {
    }
    

    @SubscribeEvent
    public void onGUI(GuiScreenEvent.InitGuiEvent.Post e) {

        if (e.getGui() instanceof IngameMenuScreen) {

            e.addWidget(new Button(e.getWidgetList().get(6).x, e.getWidgetList().get(6).y + 24,
                    e.getWidgetList().get(6).getWidth(), e.getWidgetList().get(6).getHeight(),
                    new StringTextComponent(I18n.format("menu.modoption")),
                    (p_213055_1_) -> {
                        Minecraft.getInstance()
                                .displayGuiScreen(new ModListScreen(e.getGui()));

                    }));

            e.getWidgetList().get(6).x = e.getGui().width / 2 - 102;
            e.getWidgetList().get(6).setWidth(204);

            e.getWidgetList().get(7).y += 24;

            e.getWidgetList().get(5).y += 24;

            for (Widget in : e.getWidgetList()) {
                in.y -= 16;
            }

        }

    }

    //Security

    @SubscribeEvent
    public void onFingerPrintViolation(FMLFingerprintViolationEvent event)
    // Not running in a dev environment
    {
        if (event.isDirectory() == false) {
            LOGGER.fatal("One or more loaded mods are either hacked or contains malicious software. Shutting down Minecraft...");
            Minecraft.getInstance().shutdown();
            throw new NullPointerException("The signature of the mod file 'ultracraft' does not match the expected fingerprint! This might mean that the mod file has been tampered with! If you did not download Ultracraft directly from PlanetMinecraft/Github, or using one of the well known launchers, and you did not modify the mod file at all yourself, then it's possible, that it may contain malware or other unwanted things! Quit the game immediately and remove all contents of the damaged mod, redownload the mod and try again.");

        }
    }
}
