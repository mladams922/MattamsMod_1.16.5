package com.matthew.mattamsmod.firestone.items;

import com.matthew.mattamsmod.ModItemGroup;
import com.matthew.mattamsmod.base.register.Registry;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;


public class FirestoneItems {
    public static RegistryObject<Item> FIRESTONE = Registry.registerItem("firestone",
            () -> new Firestone(new Item.Properties().group(ModItemGroup.MATTAMS_GROUP).maxDamage(8).isImmuneToFire()));
}