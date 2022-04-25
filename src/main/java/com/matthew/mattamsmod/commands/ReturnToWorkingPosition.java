package com.matthew.mattamsmod.commands;

import com.matthew.mattamsmod.MattamsMod;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.StringTextComponent;

public class ReturnToWorkingPosition {
    public ReturnToWorkingPosition(CommandDispatcher<CommandSource> dispatcher){
        dispatcher.register(Commands.literal("workingPos").then(Commands.literal("return").executes((command) -> {
            return returnHome(command.getSource());
        })));
    }

    private int returnHome(CommandSource source) throws CommandSyntaxException{
        ServerPlayerEntity player = source.asPlayer();
        int[] workingPos = player.getPersistentData().getIntArray(MattamsMod.MOD_ID + "workingPos");
        if (workingPos.length != 0){
            player.setPositionAndUpdate(workingPos[0], workingPos[1], workingPos[2]);
            source.sendFeedback(new StringTextComponent("Player returned to working position"), true);
            return 1;
        } else {
            source.sendFeedback(new StringTextComponent("No Working Position Set"), true);
            return -1;
        }
    }
}
