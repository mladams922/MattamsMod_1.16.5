package com.matthew.mattamsmod.emerald.items;

import com.matthew.mattamsmod.ModItemGroup;
import com.matthew.mattamsmod.base.teirs.ModItemTier;
import com.matthew.mattamsmod.base.register.Registry;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class EmeraldItems {
    public static final RegistryObject<Item> EMERALD_AXE = Registry.registerItem("emerald_axe",
            () ->new AxeItem(ModItemTier.EMERALD, 10, 10f,
                    new Item.Properties().group(ModItemGroup.MATTAMS_GROUP)));
}
