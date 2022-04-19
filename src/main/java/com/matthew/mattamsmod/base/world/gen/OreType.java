package com.matthew.mattamsmod.base.world.gen;

import com.matthew.mattamsmod.brass.block.BrassBlocks;
import com.matthew.mattamsmod.titanium.block.TitaniumBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    BRASS(Lazy.of(BrassBlocks.BRASS_ORE), 8, 25, 50),
    TITANIUM(Lazy.of(TitaniumBlocks.TITANIUM_ORE), 6, 10, 30);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block){
        for (OreType ore:values()){
            if(block == ore.block){
                return ore;
            }
        }
        return null;
    }
}
