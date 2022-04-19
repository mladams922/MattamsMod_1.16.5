package com.matthew.mattamsmod.crops;

import com.matthew.mattamsmod.ModItemGroup;
import com.matthew.mattamsmod.base.register.Registry;
import com.matthew.mattamsmod.crops.oats.OatsBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class CropsModule {
    public static final RegistryObject<Block> OATS = Registry.registerBlockOnly("oats_crop",
            () -> new OatsBlock(AbstractBlock.Properties.from(Blocks.WHEAT)));

    public static final RegistryObject<Item> OATS_SEEDS = Registry.registerItem("oats",
            () -> new BlockItem(CropsModule.OATS.get(), new Item.Properties()
                    .food(new Food.Builder().hunger(1).saturation(0.1f).fastToEat().build())
                    .group(ModItemGroup.MATTAMS_GROUP)));
}
