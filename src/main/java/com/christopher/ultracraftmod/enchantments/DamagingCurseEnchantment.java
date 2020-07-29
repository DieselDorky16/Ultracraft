package com.christopher.ultracraftmod.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.BlockEvent;

/*
Please note the following code for this enchantment is derived from the Curses Mod by github user Darkhax. All credit is given, and no copyright infringement is intended. Code used here is modified from the original source, but credit is given in this class. This will not appear in the META-INF.
*/
public class DamagingCurseEnchantment extends Enchantment {
    protected DamagingCurseEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
        super(rarityIn, typeIn, slots);

         MinecraftForge.EVENT_BUS.addListener(this::onBlockBreak);
        MinecraftForge.EVENT_BUS.addListener(this::onLivingHurt);
        MinecraftForge.EVENT_BUS.addListener(this::onLivingAttack);
    }

    private void onBlockBreak (BlockEvent.BreakEvent event) {

        if (!event.getWorld().isRemote()) {

            final LivingEntity user = event.getPlayer();
            final ItemStack item = event.getPlayer().getHeldItemMainhand();
            final int level = EnchantmentHelper.getEnchantmentLevel(this, item);

            if (level > 0 && Math.random() < 1.0f * level) {

                final ServerPlayerEntity damagerEntity = event.getPlayer() instanceof ServerPlayerEntity ? (ServerPlayerEntity) event.getPlayer() : null;
                item.attemptDamageItem(9, event.getWorld().getRandom(), damagerEntity);
            }
        }
    }

    private void onLivingHurt (LivingHurtEvent event) {

        if (event.getEntityLiving() != null && !event.getEntityLiving().world.isRemote) {

            final LivingEntity user = event.getEntityLiving();
            for (final ItemStack item : event.getEntityLiving().getArmorInventoryList()) {

                final int level = EnchantmentHelper.getEnchantmentLevel(this, item);

                if (level > 0 && Math.random() < 1.0f * level) {

                    final Entity damageSourcEntity = event.getSource().getImmediateSource();
                    final ServerPlayerEntity damagerEntity = damageSourcEntity instanceof ServerPlayerEntity ? (ServerPlayerEntity) damageSourcEntity : null;
                    item.attemptDamageItem(9, event.getEntityLiving().world.getRandom(), damagerEntity);
                }
            }
        }
    }

    private void onLivingAttack (LivingAttackEvent event) {

        if (event.getEntityLiving() != null && !event.getEntityLiving().world.isRemote) {

            final ItemStack item = event.getEntityLiving().getHeldItemMainhand();
            final int level = EnchantmentHelper.getEnchantmentLevel(this, item);
            final LivingEntity user = event.getEntityLiving();

            if (level > 0 && Math.random() < 1.0f * level) {

                final ServerPlayerEntity damagerEntity = event.getEntityLiving() instanceof ServerPlayerEntity ? (ServerPlayerEntity) event.getEntityLiving() : null;
                item.attemptDamageItem(9, event.getEntityLiving().world.getRandom(), damagerEntity);

            }
        }
    }
    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getMinLevel() {
        return 1;
    }
    @Override
    public boolean isTreasureEnchantment() {
        return true;
    }
    @Override
    public boolean isCurse() {
        return true;
    }

    @Override
    public boolean canApplyTogether(Enchantment ench) {
        return super.canApplyTogether(ench) && ench != Enchantments.UNBREAKING;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return false;
    }
}
