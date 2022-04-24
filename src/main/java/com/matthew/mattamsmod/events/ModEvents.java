package com.matthew.mattamsmod.events;

import com.matthew.mattamsmod.MattamsMod;
import com.matthew.mattamsmod.commands.ReturnToWorkingPosition;
import com.matthew.mattamsmod.commands.SetWorkingPosition;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = MattamsMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event){
        new SetWorkingPosition(event.getDispatcher());
        new ReturnToWorkingPosition(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }

    @SubscribeEvent
    public static void onPlayerCloneEvent(PlayerEvent.Clone event){
        if (!event.getOriginal().getEntityWorld().isRemote){
            event.getPlayer().getPersistentData().putIntArray(MattamsMod.MOD_ID + "workingPos",
                    event.getOriginal().getPersistentData().getIntArray(MattamsMod.MOD_ID + "workingPos"));
        }
    }
}
