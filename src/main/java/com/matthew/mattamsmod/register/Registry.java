package com.matthew.mattamsmod.register;

import com.matthew.mattamsmod.MattamsMod;
import com.matthew.mattamsmod.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class Registry {
    private final static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MattamsMod.MOD_ID);
    private final static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MattamsMod.MOD_ID);

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }

    public static RegistryObject<Item> registerItem(String resLoc, Supplier<? extends Item> item){
        return ITEMS.register(resLoc, item);
    }

    public static <T extends Block>RegistryObject<T> registerBlock(String resLoc, Supplier<T> block){
        RegistryObject<T> tempBlock = BLOCKS.register(resLoc, block);
        registerBlockItem(resLoc, tempBlock);
        return tempBlock;
    }

    private static <T extends Block> void registerBlockItem(String resLoc, RegistryObject<T> block){
        ITEMS.register(resLoc, () -> new BlockItem(block.get(),
        new Item.Properties().group(ModItemGroup.MATTAMS_GROUP)));
    }
}
