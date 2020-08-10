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


public class NetheriteHammer<currentTool> extends HammerItem {

    public NetheriteHammer() {
        super(new IItemTier() {
            @Override
            public int getMaxUses() {
                return IDurabilityReference.Tools.NETHERITE;
            }

            @Override
            public float getEfficiency() {
                return IEfficiencyBaseReference.NETHERITE;
            }

            @Override
            public float getAttackDamage() {
                return IAttackDamageReference.NETHERITE;
            }

            @Override
            public int getHarvestLevel() {
                return IHarvestLevelReference.NETHERITE;
            }

            @Override
            public int getEnchantability() {
                return IEnchantabilityReference.Tools.NETHERITE;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return IRepairMaterialReference.NETHERITE;
            }
        }, IAttackDamageReference.AttackDamageProperties.NETHERITE,IAttackDamageReference.AttackSpeedProperties.NETHERITE-0.5F, IUtilPropertiesReference.TOOLS_NETHERITE);

    }

}

