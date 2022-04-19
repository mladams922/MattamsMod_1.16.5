package com.matthew.mattamsmod.titanium.block;

import com.matthew.mattamsmod.base.register.Registry;
import net.minecraft.block.*;
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

    public static final RegistryObject<Block> TITANIUM_STAIRS = Registry.registerBlock("titanium_stairs",
            () -> new StairsBlock(() -> TITANIUM_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.IRON)
                            .harvestLevel(3)
                            .harvestTool(ToolType.PICKAXE)
                            .setRequiresTool()
                            .hardnessAndResistance(10f)));

    public static final RegistryObject<Block> TITANIUM_SLAB = Registry.registerBlock("titanium_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(10f)));

    public static final RegistryObject<Block> TITANIUM_FENCE = Registry.registerBlock("titanium_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(10f)));

    public static final RegistryObject<Block> TITANIUM_FENCE_GATE = Registry.registerBlock("titanium_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(10f)));

    public static final RegistryObject<Block> TITANIUM_BUTTON = Registry.registerBlock("titanium_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(10f)
                    .doesNotBlockMovement()));

    public static final RegistryObject<Block> TITANIUM_PRESSURE_PLATE = Registry.registerBlock("titanium_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING ,AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(10f)
            ));

    public static final RegistryObject<Block> TITANIUM_DOOR = Registry.registerBlock("titanium_door",
            () -> new DoorBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(10f)
                    .notSolid()));

    public static final RegistryObject<Block> TITANIUM_TRAPDOOR = Registry.registerBlock("titanium_trapdoor",
            () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(10f)
                    .notSolid()));
}
