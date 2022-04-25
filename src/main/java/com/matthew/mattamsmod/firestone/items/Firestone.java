package com.matthew.mattamsmod.firestone.items;

import com.matthew.mattamsmod.base.MattamsModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class Firestone extends Item{
    public Firestone(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
        World world = context.getWorld();
        if (!world.isRemote){
            PlayerEntity playerEntity = Objects.requireNonNull(context.getPlayer());
            BlockState clickedBlock = world.getBlockState(context.getPos());

            rightClickOnCertainBlockState(clickedBlock, context, playerEntity);
            stack.damageItem(1, playerEntity, player -> player.sendBreakAnimation(context.getHand()));
        }

        return super.onItemUseFirst(stack, context);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (Screen.hasShiftDown()){
            tooltip.add(new TranslationTextComponent("tooltip.mattamsmod.firestone_shift"));
        } else {
            tooltip.add(new TranslationTextComponent("tooltip.mattamsmod.firestone"));
        }

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    private void rightClickOnCertainBlockState(BlockState clickedBlock, ItemUseContext context, PlayerEntity playerEntity) {
        if (clickedBlock.isIn(MattamsModTags.Blocks.FIRESTONE_CLICKABLE_BLOCKS)){
            playerEntity.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 9600));
            context.getWorld().playSound(playerEntity, context.getPos(), SoundEvents.BLOCK_CONDUIT_ACTIVATE,
                    SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack container = itemStack.copy();
        if (container.attemptDamageItem(1,random,null)){
            return ItemStack.EMPTY;
        } else {
            return container;
        }
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }
}
