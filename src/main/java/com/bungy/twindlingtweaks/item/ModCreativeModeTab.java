package com.bungy.twindlingtweaks.item;

import com.bungy.twindlingtweaks.TwindlingTweaks;
import com.bungy.twindlingtweaks.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TwindlingTweaks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab TWINDLING_TWEAKS;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        TWINDLING_TWEAKS = event.registerCreativeModeTab(new ResourceLocation(TwindlingTweaks.MOD_ID, "twindling_tweaks"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.ALLUMINITE_BLOCK.get())).title(Component.literal("Twindling Tweaks")).build());
    }
}
