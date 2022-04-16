package com.matthew.mattamsmod.titanium.item;

import com.matthew.mattamsmod.ModItemGroup;
import com.matthew.mattamsmod.base.register.Registry;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class TitaniumItems {
    public static final RegistryObject<Item> TITANIUM_INGOT = Registry.registerItem("titanium_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_NUGGET = Registry.registerItem("titanium_nugget",
            () -> new Item(new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).group(ModItemGroup.MATTAMS_GROUP)));
}
