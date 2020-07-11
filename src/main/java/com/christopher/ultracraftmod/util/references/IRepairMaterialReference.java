package com.christopher.ultracraftmod.util.references;

import com.christopher.ultracraftmod.items.ItemInit;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IItemProvider;

public interface IRepairMaterialReference {
    public static final Ingredient GOLD = Ingredient.fromItems(Items.GOLD_INGOT);
    public static final Ingredient WOODEN = Ingredient.fromTag(ItemTags.PLANKS);
    public static final Ingredient STONE = Ingredient.fromTag(ItemTags.field_232909_aa_);
    public static final Ingredient IRON = Ingredient.fromItems(Items.IRON_INGOT);
    public static final Ingredient DIAMOND = Ingredient.fromItems(Items.DIAMOND);
    public static final Ingredient NETHERITE = Ingredient.fromItems(Items.field_234759_km_);

}
