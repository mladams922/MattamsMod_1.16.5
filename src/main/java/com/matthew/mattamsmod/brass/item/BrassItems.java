package com.matthew.mattamsmod.brass.item;

import com.matthew.mattamsmod.ModItemGroup;
import com.matthew.mattamsmod.base.ModItemTier;
import com.matthew.mattamsmod.base.register.Registry;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;

public class BrassItems{
    public static final RegistryObject<Item> BRASS_INGOT = Registry.registerItem("brass_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> BRASS_NUGGET = Registry.registerItem("brass_nugget",
            () -> new Item(new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> BRASS_SWORD = Registry.registerItem("brass_sword",
            () ->new SwordItem(ModItemTier.BRASS, 2, 2f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> BRASS_PICKAXE = Registry.registerItem("brass_pickaxe",
            () ->new PickaxeItem(ModItemTier.BRASS, 1, 2f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> BRASS_SHOVEL = Registry.registerItem("brass_shovel",
            () ->new ShovelItem(ModItemTier.BRASS, 0, 1f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> BRASS_AXE = Registry.registerItem("brass_axe",
            () ->new AxeItem(ModItemTier.BRASS, 2, 2f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> BRASS_HOE = Registry.registerItem("brass_hoe",
            () ->new HoeItem(ModItemTier.BRASS, 0, 0f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).maxDamage(8)));

    public BrassItems(){
    }
}