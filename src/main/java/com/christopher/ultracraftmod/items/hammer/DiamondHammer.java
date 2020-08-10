package com.christopher.ultracraftmod.items.hammer;

import com.christopher.ultracraftmod.items.HammerItem;
import com.christopher.ultracraftmod.util.references.IAttackDamageReference;
import com.christopher.ultracraftmod.util.references.IDurabilityReference;
import com.christopher.ultracraftmod.util.references.IEfficiencyBaseReference;
import com.christopher.ultracraftmod.util.references.IEnchantabilityReference;
import com.christopher.ultracraftmod.util.references.IHarvestLevelReference;
import com.christopher.ultracraftmod.util.references.IRepairMaterialReference;
import com.christopher.ultracraftmod.util.references.IUtilPropertiesReference;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;


public class DiamondHammer<currentTool> extends HammerItem {

    public DiamondHammer() {
        super(new IItemTier() {
            @Override
            public int getMaxUses() {
                return IDurabilityReference.Tools.DIAMOND;
            }

            @Override
            public float getEfficiency() {
                return IEfficiencyBaseReference.DIAMOND;
            }

            @Override
            public float getAttackDamage() {
                return IAttackDamageReference.DIAMOND;
            }

            @Override
            public int getHarvestLevel() {
                return IHarvestLevelReference.DIAMOND;
            }

            @Override
            public int getEnchantability() {
                return IEnchantabilityReference.Tools.DIAMOND;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return IRepairMaterialReference.DIAMOND;
            }
        }, IAttackDamageReference.AttackDamageProperties.DIAMOND,IAttackDamageReference.AttackSpeedProperties.DIAMOND-0.5F, IUtilPropertiesReference.TOOLS);

    }

}

