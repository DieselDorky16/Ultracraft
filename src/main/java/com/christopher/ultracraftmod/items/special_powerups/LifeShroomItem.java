package com.christopher.ultracraftmod.items.special_powerups;

import com.christopher.ultracraftmod.util.SoundsInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class LifeShroomItem extends Item {
    public LifeShroomItem() {
        super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1));
    }

    @Override
    public Item asItem() {
        return super.asItem();
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        playerIn.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 999999, 4, false, false));
        if (playerIn.getHealth() < playerIn.getMaxHealth()) {
            playerIn.heal(20.0F);
        }
        playerIn.shouldHeal();
        playerIn.playSound(SoundsInit.LIFE_SHROOM_USE.get(), 2.0F, 1.0F);
        if (!worldIn.isRemote) {
            if (!playerIn.abilities.isCreativeMode) {
                itemstack.shrink(1);
            }
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}
