package com.christopher.ultracraftmod.items.hammer;

import com.christopher.ultracraftmod.util.references.IAttackDamageReference;
import com.christopher.ultracraftmod.util.references.IDurabilityReference;
import com.christopher.ultracraftmod.util.references.IEfficiencyBaseReference;
import com.christopher.ultracraftmod.util.references.IEnchantabilityReference;
import com.christopher.ultracraftmod.util.references.IHarvestLevelReference;
import com.christopher.ultracraftmod.util.references.IUtilPropertiesReference;
import com.christopher.ultracraftmod.items.HammerItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;


public class GoldHammer<currentTool> extends HammerItem {

    public GoldHammer() {
        super(new IItemTier() {
            @Override
            public int getMaxUses() {
                return IDurabilityReference.Tools.GOLD;
            }

            @Override
            public float getEfficiency() {
                return IEfficiencyBaseReference.GOLD;
            }

            @Override
            public float getAttackDamage() {
                return IAttackDamageReference.GOLD;
            }

            @Override
            public int getHarvestLevel() {
                return IHarvestLevelReference.GOLD;
            }

            @Override
            public int getEnchantability() {
                return IEnchantabilityReference.Tools.GOLD;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return null;
            }
        }, IAttackDamageReference.AttackDamageProperties.GOLD,IAttackDamageReference.AttackSpeedProperties.GOLD-0.5F, IUtilPropertiesReference.TOOLS);

    }

}

