package com.matthew.mattamsmod.base.world.gen;

import com.matthew.mattamsmod.redwood.blocks.RedwoodBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.*;
import net.minecraft.world.gen.trunkplacer.*;

public class ModConfiguredFeatures {
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> REDWOOD =
            register("redwood", Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(RedwoodBlocks.REDWOOD_LOG.get().getDefaultState()),
                    new SimpleBlockStateProvider(RedwoodBlocks.REDWOOD_LEAVES.get().getDefaultState()),
                    new PineFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), FeatureSpread.create(5)),
                    new MegaJungleTrunkPlacer(25, 5, 3),
                    new TwoLayerFeature(8, 4, 8))).setIgnoreVines().build()));

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }

}
