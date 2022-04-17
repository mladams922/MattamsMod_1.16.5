package com.matthew.mattamsmod.titanium.item;

import com.matthew.mattamsmod.ModItemGroup;
import com.matthew.mattamsmod.base.ModItemTier;
import com.matthew.mattamsmod.base.register.Registry;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;

public class TitaniumItems {
    public static final RegistryObject<Item> TITANIUM_INGOT = Registry.registerItem("titanium_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_NUGGET = Registry.registerItem("titanium_nugget",
            () -> new Item(new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_SWORD = Registry.registerItem("titanium_sword",
            () ->new SwordItem(ModItemTier.TITANIUM, 3, 3f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = Registry.registerItem("titanium_pickaxe",
            () ->new PickaxeItem(ModItemTier.TITANIUM, 2, 2f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> TITANIUM_SHOVEL = Registry.registerItem("titanium_shovel",
            () ->new ShovelItem(ModItemTier.TITANIUM, 1, 1f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> TITANIUM_AXE = Registry.registerItem("titanium_axe",
            () ->new AxeItem(ModItemTier.TITANIUM, 3, 2f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> TITANIUM_HOE = Registry.registerItem("titanium_hoe",
            () ->new HoeItem(ModItemTier.TITANIUM, 1, 1f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).maxDamage(8)));
}
