package com.matthew.mattamsmod.register;

import com.matthew.mattamsmod.MattamsMod;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class Registry {
    private final static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MattamsMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static RegistryObject<Item> registerItem(String resLoc, Supplier<? extends Item> item){
        RegistryObject<Item> toReturn = ITEMS.register(resLoc, item);
        return toReturn;
    }
}
