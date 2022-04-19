package com.matthew.mattamsmod.titanium.item;

import com.matthew.mattamsmod.ModItemGroup;
import com.matthew.mattamsmod.base.teirs.ModArmorMaterial;
import com.matthew.mattamsmod.base.teirs.ModItemTier;
import com.matthew.mattamsmod.base.register.Registry;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;

public class TitaniumItems {
    public static final RegistryObject<Item> TITANIUM_INGOT = Registry.registerItem("titanium_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_NUGGET = Registry.registerItem("titanium_nugget",
            () -> new Item(new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_SWORD = Registry.registerItem("titanium_sword",
            () ->new SwordItem(ModItemTier.TITANIUM, 3, 3f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = Registry.registerItem("titanium_pickaxe",
            () ->new PickaxeItem(ModItemTier.TITANIUM, 2, 2f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_SHOVEL = Registry.registerItem("titanium_shovel",
            () ->new ShovelItem(ModItemTier.TITANIUM, 1, 1f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_AXE = Registry.registerItem("titanium_axe",
            () ->new AxeItem(ModItemTier.TITANIUM, 3, 2f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_HOE = Registry.registerItem("titanium_hoe",
            () ->new HoeItem(ModItemTier.TITANIUM, 1, 1f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_BOOTS = Registry.registerItem("titanium_boots",
            () ->new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_LEGGINGS = Registry.registerItem("titanium_leggings",
            () ->new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = Registry.registerItem("titanium_chestplate",
            () ->new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_HELMET = Registry.registerItem("titanium_helmet",
            () ->new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_HORSE_ARMOR = Registry.registerItem("titanium_horse_armor",
            () -> new HorseArmorItem(15, "titanium",
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP)));
}
