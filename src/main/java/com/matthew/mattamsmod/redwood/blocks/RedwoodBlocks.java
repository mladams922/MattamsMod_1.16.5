package com.matthew.mattamsmod.redwood.blocks;

import com.matthew.mattamsmod.base.register.Registry;
import com.matthew.mattamsmod.redwood.RedwoodTree;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.OakTree;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import org.lwjgl.system.CallbackI;

public class RedwoodBlocks {
    public static final RegistryObject<Block> REDWOOD_LEAVES = Registry.registerBlock("redwood_leaves",
            () -> new LeavesBlock(AbstractBlock.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.25f)
                    .tickRandomly()
                    .sound(SoundType.GLASS)
                    .notSolid()));

    public static final RegistryObject<Block> REDWOOD_SAPLING = Registry.registerBlock("redwood_sapling",
            () -> new SaplingBlock(new RedwoodTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> REDWOOD_LOG = Registry.registerBlock("redwood_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> REDWOOD_WOOD = Registry.registerBlock("redwood_wood",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_REDWOOD_LOG = Registry.registerBlock("stripped_redwood_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_REDWOOD_WOOD = Registry.registerBlock("stripped_redwood_wood",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> REDWOOD_PLANKS = Registry.registerBlock("redwood_planks",
            () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> REDWOOD_SLAB = Registry.registerBlock("redwood_slab",
            () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> REDWOOD_STAIRS = Registry.registerBlock("redwood_stairs",
            () -> new StairsBlock(() -> REDWOOD_PLANKS.get().getDefaultState(),
                    AbstractBlock.Properties.from(Blocks.OAK_STAIRS)));
}
