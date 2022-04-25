package com.matthew.mattamsmod.commands;

import com.matthew.mattamsmod.MattamsMod;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;

public class SetWorkingPosition {
    public SetWorkingPosition(CommandDispatcher<CommandSource> dispatcher){
        dispatcher.register(Commands.literal("workingPos").then(Commands.literal("set").executes((command) -> {
            return setHome(command.getSource());
        })));
    }

    private int setHome(CommandSource source) throws CommandSyntaxException {
        ServerPlayerEntity player = source.asPlayer();
        BlockPos playerPos = player.getPosition();
        String pos = "(" + playerPos.getX() + ", " + playerPos.getY() + ", " + playerPos.getZ() + ")";

        player.getPersistentData().putIntArray(MattamsMod.MOD_ID + "workingPos",
                new int[]{
                        playerPos.getX(), playerPos.getY(), playerPos.getZ()
                });

        source.sendFeedback(new StringTextComponent("Set Working Position at " + pos), true);
        return 1;
    }
}
