package com.christopher.ultracraftmod.tags;

import net.minecraft.block.Block;
import net.minecraft.tags.ITag;
import net.minecraft.tags.TagCollection;
import net.minecraft.tags.TagRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Set;

public class ModBlockTags {
    private static final TagRegistry<Block> collection = new TagRegistry<>();
    public static final ITag.INamedTag<Block> CINNAMON_PLANTABLE_ON = makeWrapperTag("cinnamon_plantable_on");

    public static ITag.INamedTag<Block> makeWrapperTag(String id) {
        return collection.func_232937_a_(id);
    }

    public static void setCollection(TagCollection<Block> collectionIn) {
        collection.func_232935_a_(collectionIn);
    }

    @OnlyIn(Dist.CLIENT)
    public static void func_232890_a_() {
        collection.func_232932_a_();
    }

    public static TagCollection<Block> getCollection() {
        return collection.func_232939_b_();
    }

    public static Set<ResourceLocation> func_232892_b_(TagCollection<Block> p_232892_0_) {
        return collection.func_232940_b_(p_232892_0_);
    }
}
