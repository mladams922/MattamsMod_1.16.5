package com.matthew.mattamsmod.titanium.block;

import com.matthew.mattamsmod.base.register.Registry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class TitaniumBlocks {
    public static final RegistryObject<Block> TITANIUM_ORE = Registry.registerBlock("titanium_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(10f)));

    public static final RegistryObject<Block> TITANIUM_BLOCK = Registry.registerBlock("titanium_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(10f)));
}
