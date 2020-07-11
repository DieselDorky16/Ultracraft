package com.christopher.ultracraftmod;

import com.christopher.ultracraftmod.blocks.BlockInit;
import com.christopher.ultracraftmod.enchantments.EnchantmentsInit;
import com.christopher.ultracraftmod.items.BlockItemInit;
import com.christopher.ultracraftmod.items.ItemInit;
import com.christopher.ultracraftmod.util.UnobtainablesHandler;
import com.christopher.ultracraftmod.util.VanillaHandler;
import com.christopher.ultracraftmod.world.gen.CrimsonBerriesGen;
import com.christopher.ultracraftmod.world.gen.NetherIronOreGen;
import com.christopher.ultracraftmod.world.gen.SoulMagmaGen;
import com.christopher.ultracraftmod.world.gen.WarpedBerriesGen;
import net.minecraft.block.ComposterBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.IngameMenuScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraft.util.text.StringTextComponent;
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
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;

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
        EnchantmentsInit.ENCHANTMENTS.register(modEventBus);

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
        DeferredWorkQueue.runLater(() -> {
            ComposterBlock.registerCompostable(0.65F, BlockInit.SOUL_SHROOMLIGHT.get());
        });
        DeferredWorkQueue.runLater(SoulMagmaGen::generateOre);
        DeferredWorkQueue.runLater(NetherIronOreGen::generateOre);
        DeferredWorkQueue.runLater(CrimsonBerriesGen::generatePlants);
        DeferredWorkQueue.runLater(WarpedBerriesGen::generatePlants);
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
    @SubscribeEvent
    public void onGUI(GuiScreenEvent.InitGuiEvent.Post e) {

        if (e.getGui() instanceof IngameMenuScreen) {

            e.addWidget(new Button(e.getWidgetList().get(6).field_230690_l_, e.getWidgetList().get(6).field_230691_m_ + 24,
                    e.getWidgetList().get(6).func_230998_h_(), e.getWidgetList().get(6).getHeight(),
                    new StringTextComponent(I18n.format("menu.modoption")),
                    (p_213055_1_) -> {
                        Minecraft.getInstance()
                                .displayGuiScreen(new ModListScreen(e.getGui()));

                    }));

            e.getWidgetList().get(6).field_230690_l_ = e.getGui().field_230708_k_ / 2 - 102;
            e.getWidgetList().get(6).func_230991_b_(204);

            e.getWidgetList().get(7).field_230691_m_ += 24;

            e.getWidgetList().get(5).field_230691_m_ += 24;

            for (Widget in : e.getWidgetList()) {
                in.field_230691_m_ -= 16;
            }
        }
    }
}
