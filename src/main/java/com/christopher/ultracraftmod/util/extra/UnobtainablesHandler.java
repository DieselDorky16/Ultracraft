/*
THERE IS A REASON WHY IT CANNOT BE OBTAINED IN THE CREATIVE MENU.

HOWEVER, IF YOU WANT TO MAKE THE ITEM OBTAINABLE IN OTHER METHODS, CONSIDER CREATING A DATAPACK SETTING THE
LOOT TABLES TO THESE UNOBTAINABLES. ANY TYPE OF FIRE WORKS BEST.

HOW TO OBTAIN: run /give @p ultracraft:* (any of the items in quotes listed below in this class)

YOU MAY HAVE SEEN THESE UNOBTAINABLES ON R/PHOENIXSC...
*/
package com.christopher.ultracraftmod.util.extra;

import com.christopher.ultracraftmod.Ultracraft;
import com.christopher.ultracraftmod.items.CommandsOnly;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class UnobtainablesHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ultracraft.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ultracraft.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static final RegistryObject<Item> NETHER_PORTAL = ITEMS.register("nether_portal", () -> new CommandsOnly(Blocks.NETHER_PORTAL));
    public static final RegistryObject<Item> END_PORTAL = ITEMS.register("end_portal", () -> new CommandsOnly(Blocks.END_PORTAL));
    public static final RegistryObject<Item> END_GATEWAY = ITEMS.register("end_gateway", () -> new CommandsOnly(Blocks.END_GATEWAY));
    public static final RegistryObject<Item> FIRE = ITEMS.register("fire", () -> new CommandsOnly(Blocks.FIRE));
    public static final RegistryObject<Item> SOUL_FIRE = ITEMS.register("soul_fire", () -> new CommandsOnly(Blocks.SOUL_FIRE));
    public static final RegistryObject<Item> WATER = ITEMS.register("water", () -> new CommandsOnly(Blocks.WATER));
    public static final RegistryObject<Item> LAVA = ITEMS.register("lava", () -> new CommandsOnly(Blocks.LAVA));
}
