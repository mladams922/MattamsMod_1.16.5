package com.matthew.mattamsmod.base.world;

import com.matthew.mattamsmod.MattamsMod;
import com.matthew.mattamsmod.base.world.gen.ModFlowerGeneration;
import com.matthew.mattamsmod.base.world.gen.ModOreGeneration;
import com.matthew.mattamsmod.base.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MattamsMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        ModOreGeneration.generateOres(event);
        ModFlowerGeneration.generateFlowers(event);
        ModTreeGeneration.generateTrees(event);

    }
}
