package com.christopher.ultracraftmod.enchantments;

import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;

public class SleepDeprivationCurseEnchantment extends Enchantment {
    private static final ITextComponent DEPRIVED_ALERT = new TranslationTextComponent("status.cursed.sleep_deprived");
    private static final ITextComponent FAILED_RESPAWN =  new TranslationTextComponent("status.minecraft.set_spawn.failed");

    protected SleepDeprivationCurseEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
        super(rarityIn, typeIn, slots);
        MinecraftForge.EVENT_BUS.addListener(this::playerSleepEvent);
    }

    private void playerSleepEvent (PlayerSleepInBedEvent event) {

        final ItemStack helmet = event.getPlayer().getItemStackFromSlot(EquipmentSlotType.HEAD);
        final int level = EnchantmentHelper.getEnchantmentLevel(this, helmet);

        if (level > 0 && event.getResultStatus() == null) {

            event.setResult(PlayerEntity.SleepResult.NOT_POSSIBLE_HERE);
            event.getPlayer().sendStatusMessage(DEPRIVED_ALERT, true);
            event.getPlayer().sendStatusMessage(FAILED_RESPAWN, false);
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
        return super.canApplyTogether(ench) && ench != Enchantments.BINDING_CURSE;
    }
}
