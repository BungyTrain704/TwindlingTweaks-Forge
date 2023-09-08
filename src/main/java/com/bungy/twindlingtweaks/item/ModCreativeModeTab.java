package com.bungy.twindlingtweaks.item;

import com.bungy.twindlingtweaks.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TWINDLING_TWEAKS = new CreativeModeTab("ttweaks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.ALLUMINITE_BLOCK.get());
        }
    };
}
