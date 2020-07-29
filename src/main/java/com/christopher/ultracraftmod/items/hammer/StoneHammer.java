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


public class StoneHammer<currentTool> extends HammerItem {

    public StoneHammer() {
        super(new IItemTier() {
            @Override
            public int getMaxUses() {
                return IDurabilityReference.Tools.STONE;
            }

            @Override
            public float getEfficiency() {
                return IEfficiencyBaseReference.STONE;
            }

            @Override
            public float getAttackDamage() {
                return IAttackDamageReference.STONE;
            }

            @Override
            public int getHarvestLevel() {
                return IHarvestLevelReference.STONE;
            }

            @Override
            public int getEnchantability() {
                return IEnchantabilityReference.Tools.STONE;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return null;
            }
        }, IAttackDamageReference.AttackDamageProperties.STONE,IAttackDamageReference.AttackSpeedProperties.STONE-0.5F, IUtilPropertiesReference.TOOLS);

    }

}

