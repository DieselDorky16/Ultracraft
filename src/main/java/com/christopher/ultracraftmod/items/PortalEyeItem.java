package com.christopher.ultracraftmod.items;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.EyeOfEnderEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.server.ServerWorld;

public class PortalEyeItem extends Item {
    public PortalEyeItem() {
        super(new Properties().group(ItemGroup.MISC));
    }

    /**
     * Called when this item is used when targetting a Block
     */

    /**
     * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see
     * {@link #onItemUse}.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        RayTraceResult raytraceresult = rayTrace(worldIn, playerIn, RayTraceContext.FluidMode.NONE);
            playerIn.setActiveHand(handIn);
            if (worldIn instanceof ServerWorld) {
                BlockPos blockpos = ((ServerWorld)worldIn).getChunkProvider().getChunkGenerator().func_235956_a_((ServerWorld)worldIn, Structure.field_236372_h_, playerIn.getPosition(), 100, false);
                if (blockpos != null) {
                    EyeOfEnderEntity eyeofenderentity = new EyeOfEnderEntity(worldIn, playerIn.getPosX(), playerIn.getPosYHeight(0.5D), playerIn.getPosZ());
                    eyeofenderentity.func_213863_b(itemstack);
                    eyeofenderentity.moveTowards(blockpos);
                    worldIn.addEntity(eyeofenderentity);
                    if (playerIn instanceof ServerPlayerEntity) {
                        CriteriaTriggers.USED_ENDER_EYE.trigger((ServerPlayerEntity)playerIn, blockpos);
                    }

                    worldIn.playSound((PlayerEntity)null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ENTITY_ENDER_EYE_LAUNCH, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
                    worldIn.playEvent((PlayerEntity)null, 1003, playerIn.getPosition(), 0);
                    if (!playerIn.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }

                    playerIn.addStat(Stats.ITEM_USED.get(this));
                    playerIn.swing(handIn, true);
                    return ActionResult.resultSuccess(itemstack);
                }
            }

            return ActionResult.resultConsume(itemstack);
        }
    }
