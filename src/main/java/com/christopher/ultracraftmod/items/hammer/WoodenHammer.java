package com.christopher.ultracraftmod.items.hammer;

import com.christopher.ultracraftmod.items.HammerItem;
import com.christopher.ultracraftmod.util.references.IAttackDamageReference;
import com.christopher.ultracraftmod.util.references.IDurabilityReference;
import com.christopher.ultracraftmod.util.references.IEfficiencyBaseReference;
import com.christopher.ultracraftmod.util.references.IEnchantabilityReference;
import com.christopher.ultracraftmod.util.references.IHarvestLevelReference;
import com.christopher.ultracraftmod.util.references.IUtilPropertiesReference;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;


public class WoodenHammer<currentTool> extends HammerItem {

    public WoodenHammer() {
        super(new IItemTier() {
            @Override
            public int getMaxUses() {
                return IDurabilityReference.Tools.WOODEN;
            }

            @Override
            public float getEfficiency() {
                return IEfficiencyBaseReference.WOODEN;
            }

            @Override
            public float getAttackDamage() {
                return IAttackDamageReference.WOODEN;
            }

            @Override
            public int getHarvestLevel() {
                return IHarvestLevelReference.WOODEN;
            }

            @Override
            public int getEnchantability() {
                return IEnchantabilityReference.Tools.WOODEN;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return null;
            }
        }, IAttackDamageReference.AttackDamageProperties.WOODEN,IAttackDamageReference.AttackSpeedProperties.WOODEN-0.5F, IUtilPropertiesReference.TOOLS);

    }

}

