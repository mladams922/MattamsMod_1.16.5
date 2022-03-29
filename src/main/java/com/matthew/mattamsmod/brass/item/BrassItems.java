package com.matthew.mattamsmod.brass.item;

import com.matthew.mattamsmod.ModItemGroup;
import com.matthew.mattamsmod.register.Registry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class BrassItems{
    public static final RegistryObject<Item> BRASS_INGOT = Registry.registerItem("brass_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).group(ModItemGroup.MATTAMS_GROUP)));

    public static final RegistryObject<Item> BRASS_NUGGET = Registry.registerItem("brass_nugget",
            () -> new Item(new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).group(ModItemGroup.MATTAMS_GROUP)));

    public BrassItems(){
    }
}
