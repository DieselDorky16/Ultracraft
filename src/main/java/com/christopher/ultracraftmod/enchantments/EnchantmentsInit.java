package com.christopher.ultracraftmod.enchantments;

import com.christopher.ultracraftmod.UltraCraftMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class EnchantmentsInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(
            ForgeRegistries.ENCHANTMENTS, UltraCraftMod.MOD_ID);
    public static final RegistryObject<Enchantment> DAMAGING_CURSE = ENCHANTMENTS.register("damaging_curse",
            () -> new DamagingCurseEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.BREAKABLE,
                    new EquipmentSlotType[] { EquipmentSlotType.MAINHAND }));
    public static final RegistryObject<Enchantment> SLEEP_DEPRIVATION = ENCHANTMENTS.register("sleep_deprivation_curse",
            () -> new SleepDeprivationCurseEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_HEAD,
                    new EquipmentSlotType[] { EquipmentSlotType.HEAD }));
}
