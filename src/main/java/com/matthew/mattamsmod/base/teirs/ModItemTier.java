package com.matthew.mattamsmod.base.teirs;

import com.matthew.mattamsmod.brass.BrassModule;
import com.matthew.mattamsmod.brass.item.BrassItems;
import com.matthew.mattamsmod.titanium.item.TitaniumItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    BRASS(2, 500, 12.0f, 2.0F, 25,
            ()->Ingredient.fromItems(BrassItems.BRASS_INGOT.get())),
    TITANIUM(4, 5000, 12.0f, 5.0F, 25,
            ()->Ingredient.fromItems(TitaniumItems.TITANIUM_INGOT.get())),
    EMERALD(3, 1500, 15.0f, 20.0F, 25,
            ()->Ingredient.fromItems(Items.EMERALD));



    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
