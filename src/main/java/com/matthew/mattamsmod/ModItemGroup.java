package com.matthew.mattamsmod;

import com.matthew.mattamsmod.brass.item.BrassItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup MATTAMS_GROUP = new ItemGroup("mattamsModTab"){
        @Override
        public ItemStack createIcon() {
            ItemStack icon = new ItemStack(BrassItems.BRASS_INGOT.get());
            return icon;
        }
    };
}
