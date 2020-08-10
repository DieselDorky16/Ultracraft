package com.christopher.ultracraftmod.enchantments;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class UltrasharpnessEnchantment extends Enchantment {
    public UltrasharpnessEnchantment(Rarity rarityIn, EnchantmentType weapon, EquipmentSlotType... slots) {
        super(rarityIn, EnchantmentType.WEAPON, slots);
    }

    @Override
    public int getMaxLevel() {
        return 10;
    }

    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 5 + 20 * (enchantmentLevel - 1);
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    @Override
    public float calcDamageByCreature(int level, CreatureAttribute creatureType) {
        return 3.5F + (float)Math.max(0, level - 1) * 1.5F;
    }

    @Override
    public boolean canApply(ItemStack stack) {
        return stack.getItem() instanceof SwordItem || super.canApply(stack);
    }

    @Override
    public boolean canApplyTogether(Enchantment ench) {
        return !(ench instanceof DamageEnchantment) && super.canApplyTogether(ench);
    }
    public void onEntityDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
            LivingEntity livingentity = (LivingEntity)target;
        }

    }
}