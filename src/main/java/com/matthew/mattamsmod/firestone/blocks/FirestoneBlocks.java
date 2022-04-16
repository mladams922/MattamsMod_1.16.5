package com.matthew.mattamsmod.firestone.blocks;

import com.matthew.mattamsmod.base.register.Registry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class FirestoneBlocks {
    public static final RegistryObject<Block> FIRESTONE_BLOCK = Registry.registerBlock("firestone_block",
            () -> new FirestoneBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(6f)));
}
