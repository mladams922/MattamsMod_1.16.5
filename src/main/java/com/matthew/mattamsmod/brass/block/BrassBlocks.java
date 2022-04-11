package com.matthew.mattamsmod.brass.block;

import com.matthew.mattamsmod.register.Registry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class BrassBlocks {
    public static final RegistryObject<Block> BRASS_ORE = Registry.registerBlock("brass_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BRASS = Registry.registerBlock("brass",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)));
}
