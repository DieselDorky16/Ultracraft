package com.christopher.ultracraftmod.items.hammer;

import com.christopher.ultracraftmod.items.HammerItem;
import com.christopher.ultracraftmod.util.references.IAttackDamageReference;
import com.christopher.ultracraftmod.util.references.IEfficiencyBaseReference;
import com.christopher.ultracraftmod.util.references.IEnchantabilityReference;
import com.christopher.ultracraftmod.util.references.IHarvestLevelReference;
import com.christopher.ultracraftmod.util.references.IRepairMaterialReference;
import com.christopher.ultracraftmod.util.references.IUtilPropertiesReference;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;


public class EmeraldHammer<currentTool> extends HammerItem {

    public EmeraldHammer() {
        super(new IItemTier() {
            @Override
            public int getMaxUses() {
                return 3046;
            }

            @Override
            public float getEfficiency() {
                return IEfficiencyBaseReference.EMERALD;
            }

            @Override
            public float getAttackDamage() {
                return IAttackDamageReference.EMERALD;
            }

            @Override
            public int getHarvestLevel() {
                return IHarvestLevelReference.EMERALD;
            }

            @Override
            public int getEnchantability() {
                return IEnchantabilityReference.Tools.EMERALD;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return IRepairMaterialReference.EMERALD;
            }
        }, IAttackDamageReference.AttackDamageProperties.GOLD,IAttackDamageReference.AttackSpeedProperties.GOLD-0.5F, IUtilPropertiesReference.TOOLS);

    }

}

