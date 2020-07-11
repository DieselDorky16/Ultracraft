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


public class IronHammer<currentTool> extends HammerItem {

    public IronHammer() {
        super(new IItemTier() {
            @Override
            public int getMaxUses() {
                return IDurabilityReference.Tools.IRON;
            }

            @Override
            public float getEfficiency() {
                return IEfficiencyBaseReference.IRON;
            }

            @Override
            public float getAttackDamage() {
                return IAttackDamageReference.IRON;
            }

            @Override
            public int getHarvestLevel() {
                return IHarvestLevelReference.IRON;
            }

            @Override
            public int getEnchantability() {
                return IEnchantabilityReference.Tools.IRON;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return null;
            }
        }, IAttackDamageReference.AttackDamageProperties.IRON,IAttackDamageReference.AttackSpeedProperties.IRON-0.5F, IUtilPropertiesReference.TOOLS);

    }

}

