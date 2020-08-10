package com.christopher.ultracraftmod.entity.item;

import com.christopher.ultracraftmod.Ultracraft;
import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class ModPaintingTypes {
    public static final DeferredRegister<PaintingType> PAINTING_TYPE = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, Ultracraft.MOD_ID);
    public static final RegistryObject<PaintingType> SQUARES = PAINTING_TYPE.register("squares", () -> new PaintingType(32, 32));
    public static final RegistryObject<PaintingType> CIRCLES = PAINTING_TYPE.register("circles", () -> new PaintingType(32, 32));
    public static final RegistryObject<PaintingType> TRIANGLES = PAINTING_TYPE.register("triangles", () -> new PaintingType(32, 32));
    public static final RegistryObject<PaintingType> OVERSEAS = PAINTING_TYPE.register("overseas", () -> new PaintingType(32, 32));
}
