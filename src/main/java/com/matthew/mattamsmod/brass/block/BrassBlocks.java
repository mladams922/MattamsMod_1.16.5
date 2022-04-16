package com.matthew.mattamsmod.brass.block;

import com.matthew.mattamsmod.base.register.Registry;
import net.minecraft.block.*;
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

    public static final RegistryObject<Block> BRASS_STAIRS = Registry.registerBlock("brass_stairs",
            () -> new StairsBlock(() -> BRASS.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.IRON)
                            .harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE)
                            .setRequiresTool()
                            .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BRASS_SLAB = Registry.registerBlock("brass_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BRASS_FENCE = Registry.registerBlock("brass_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BRASS_FENCE_GATE = Registry.registerBlock("brass_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> BRASS_BUTTON = Registry.registerBlock("brass_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
                    .doesNotBlockMovement()));

    public static final RegistryObject<Block> BRASS_PRESSURE_PLATE = Registry.registerBlock("brass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING ,AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
                    ));
}
