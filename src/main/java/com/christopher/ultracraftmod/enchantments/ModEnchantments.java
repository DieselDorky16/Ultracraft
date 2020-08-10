package com.christopher.ultracraftmod.enchantments;

import com.christopher.ultracraftmod.Ultracraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(
            ForgeRegistries.ENCHANTMENTS, Ultracraft.MOD_ID);
    public static final RegistryObject<Enchantment> DAMAGING_CURSE = ENCHANTMENTS.register("damaging_curse",
            () -> new DamagingCurseEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.BREAKABLE,
                    new EquipmentSlotType[] { EquipmentSlotType.MAINHAND }));
    public static final RegistryObject<Enchantment> SLEEP_DEPRIVATION = ENCHANTMENTS.register("sleep_deprivation_curse",
            () -> new SleepDeprivationCurseEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_HEAD,
                    new EquipmentSlotType[] { EquipmentSlotType.HEAD }));
    public static final RegistryObject<Enchantment> ULTRASHARPNESS = ENCHANTMENTS.register("ultrasharpness",
            () -> new UltrasharpnessEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
                    EquipmentSlotType.MAINHAND));
    public static final RegistryObject<Enchantment> WITHERING = ENCHANTMENTS.register("bane_of_wither",
            () -> new WitheringEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
                    EquipmentSlotType.MAINHAND));
    public static final RegistryObject<Enchantment> POISONING = ENCHANTMENTS.register("bane_of_poison",
            () -> new PoisoningEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
                    EquipmentSlotType.MAINHAND));
    public static final RegistryObject<Enchantment> STARVATION = ENCHANTMENTS.register("bane_of_husk",
            () -> new StarvationEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
                    EquipmentSlotType.MAINHAND));
    public static final RegistryObject<Enchantment> BLINDNESS = ENCHANTMENTS.register("bane_of_illusioner",
            () -> new BlindingEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
                    EquipmentSlotType.MAINHAND));
    public static final RegistryObject<Enchantment> BAD_OMEN = ENCHANTMENTS.register("bane_of_pillager_captain",
            () -> new BadOmenEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
                    EquipmentSlotType.MAINHAND));



}
