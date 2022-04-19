package com.matthew.mattamsmod;

import com.google.common.collect.ImmutableMap;
import com.matthew.mattamsmod.brass.BrassModule;
import com.matthew.mattamsmod.brass.block.BrassBlocks;
import com.matthew.mattamsmod.crops.CropsModule;
import com.matthew.mattamsmod.emerald.EmeraldModule;
import com.matthew.mattamsmod.firestone.FirestoneModule;
import com.matthew.mattamsmod.base.register.Registry;
import com.matthew.mattamsmod.redwood.RedwoodModule;
import com.matthew.mattamsmod.redwood.blocks.RedwoodBlocks;
import com.matthew.mattamsmod.titanium.TitaniumModule;
import com.matthew.mattamsmod.titanium.block.TitaniumBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.AxeItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MattamsMod.MOD_ID)
public class MattamsMod
{
    // Mod ID
    public static final String MOD_ID = "mattamsmod";

    public static BrassModule BRASS_MODULE = new BrassModule();
    public static TitaniumModule TITANIUM_MODULE = new TitaniumModule();
    public static FirestoneModule FIRESTONE_MODULE = new FirestoneModule();
    public static EmeraldModule EMERALD_MODULE = new EmeraldModule();
    public static RedwoodModule REDWOOD_MODULE = new RedwoodModule();
    public static CropsModule CROPS_MODULE = new CropsModule();

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public MattamsMod() {
        // Get event but interface
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //register the deferred registers on the event bus
        Registry.register(eventBus);

        // Register the setup method for modloading
        eventBus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        eventBus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        eventBus.addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        eventBus.addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        event.enqueueWork(() -> {
            AxeItem.BLOCK_STRIPPING_MAP = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.BLOCK_STRIPPING_MAP)
                    .put(RedwoodBlocks.REDWOOD_LOG.get(), RedwoodBlocks.STRIPPED_REDWOOD_LOG.get())
                    .put(RedwoodBlocks.REDWOOD_WOOD.get(), RedwoodBlocks.STRIPPED_REDWOOD_WOOD.get()).build();
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        //LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(BrassBlocks.BRASS_DOOR.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(BrassBlocks.BRASS_TRAPDOOR.get(), RenderType.getCutout());

            RenderTypeLookup.setRenderLayer(TitaniumBlocks.TITANIUM_DOOR.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(TitaniumBlocks.TITANIUM_TRAPDOOR.get(), RenderType.getCutout());

            RenderTypeLookup.setRenderLayer(CropsModule.OATS.get(), RenderType.getCutout());
        });

        RenderTypeLookup.setRenderLayer(RedwoodBlocks.REDWOOD_LEAVES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RedwoodBlocks.REDWOOD_SAPLING.get(), RenderType.getCutout());
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
