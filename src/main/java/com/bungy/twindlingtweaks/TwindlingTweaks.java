package com.bungy.twindlingtweaks;

import com.bungy.twindlingtweaks.block.ModBlocks;
import com.bungy.twindlingtweaks.block.entity.ModBlockEntities;
import com.bungy.twindlingtweaks.item.ModCreativeModeTab;
import com.bungy.twindlingtweaks.item.ModItems;
import com.bungy.twindlingtweaks.recipes.ModRecipes;
import com.bungy.twindlingtweaks.screen.ModMenuTypes;
import com.bungy.twindlingtweaks.screen.ObsidianForgerScreen;
import com.bungy.twindlingtweaks.world.biomemods.ModBiomeModifiers;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TwindlingTweaks.MOD_ID)
public class TwindlingTweaks {
    public static final String MOD_ID = "twindlingtweaks";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public TwindlingTweaks() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModRecipes.register(eventBus);
        ModMenuTypes.register(eventBus);
        ModBiomeModifiers.register(eventBus);
        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        eventBus.addListener(this::addCreative);
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ModCreativeModeTab.TWINDLING_TWEAKS) {
            event.accept(ModItems.MUD_BALL);
            event.accept(ModItems.DRIED_MUD_BALL);
            event.accept(ModItems.RAW_ALLUMINITE);
            event.accept(ModItems.ALLUMINITE_INGOT);
            event.accept(ModItems.ALLUMINITE_NUGGET);
            event.accept(ModItems.REINFORCED_ALLUMINITE_INGOT);
            event.accept(ModItems.BIRCH_SWORD);
            event.accept(ModItems.BIRCH_AXE);
            event.accept(ModItems.BIRCH_PICKAXE);
            event.accept(ModItems.BIRCH_SHOVEL);
            event.accept(ModItems.BIRCH_HOE);
            event.accept(ModItems.BIRCH_STICK);
            event.accept(ModItems.SPRUCE_SWORD);
            event.accept(ModItems.SPRUCE_AXE);
            event.accept(ModItems.SPRUCE_PICKAXE);
            event.accept(ModItems.SPRUCE_SHOVEL);
            event.accept(ModItems.SPRUCE_HOE);
            event.accept(ModItems.SPRUCE_STICK);
            event.accept(ModItems.JUNGLE_SWORD);
            event.accept(ModItems.JUNGLE_AXE);
            event.accept(ModItems.JUNGLE_PICKAXE);
            event.accept(ModItems.JUNGLE_SHOVEL);
            event.accept(ModItems.JUNGLE_HOE);
            event.accept(ModItems.JUNGLE_STICK);
            event.accept(ModItems.DARK_OAK_SWORD);
            event.accept(ModItems.DARK_OAK_AXE);
            event.accept(ModItems.DARK_OAK_PICKAXE);
            event.accept(ModItems.DARK_OAK_SHOVEL);
            event.accept(ModItems.DARK_OAK_HOE);
            event.accept(ModItems.DARK_OAK_STICK);
            event.accept(ModItems.ACACIA_SWORD);
            event.accept(ModItems.ACACIA_AXE);
            event.accept(ModItems.ACACIA_PICKAXE);
            event.accept(ModItems.ACACIA_SHOVEL);
            event.accept(ModItems.ACACIA_HOE);
            event.accept(ModItems.ACACIA_STICK);
            event.accept(ModItems.MANGROVE_SWORD);
            event.accept(ModItems.MANGROVE_AXE);
            event.accept(ModItems.MANGROVE_PICKAXE);
            event.accept(ModItems.MANGROVE_SHOVEL);
            event.accept(ModItems.MANGROVE_HOE);
            event.accept(ModItems.MANGROVE_STICK);
            event.accept(ModItems.WARPED_SWORD);
            event.accept(ModItems.WARPED_AXE);
            event.accept(ModItems.WARPED_PICKAXE);
            event.accept(ModItems.WARPED_SHOVEL);
            event.accept(ModItems.WARPED_HOE);
            event.accept(ModItems.WARPED_STICK);
            event.accept(ModItems.CRIMSON_SWORD);
            event.accept(ModItems.CRIMSON_AXE);
            event.accept(ModItems.CRIMSON_PICKAXE);
            event.accept(ModItems.CRIMSON_SHOVEL);
            event.accept(ModItems.CRIMSON_HOE);
            event.accept(ModItems.CRIMSON_STICK);
            event.accept(ModItems.CATALPA_SWORD);
            event.accept(ModItems.CATALPA_AXE);
            event.accept(ModItems.CATALPA_PICKAXE);
            event.accept(ModItems.CATALPA_SHOVEL);
            event.accept(ModItems.CATALPA_HOE);
            event.accept(ModItems.CATALPA_STICK);
            event.accept(ModItems.RED_MAPLE_SWORD);
            event.accept(ModItems.RED_MAPLE_AXE);
            event.accept(ModItems.RED_MAPLE_PICKAXE);
            event.accept(ModItems.RED_MAPLE_SHOVEL);
            event.accept(ModItems.RED_MAPLE_HOE);
            event.accept(ModItems.RED_MAPLE_STICK);
            event.accept(ModItems.ALLUMINITE_SWORD);
            event.accept(ModItems.ALLUMINITE_AXE);
            event.accept(ModItems.ALLUMINITE_PICKAXE);
            event.accept(ModItems.ALLUMINITE_SHOVEL);
            event.accept(ModItems.ALLUMINITE_HOE);
            event.accept(ModItems.ALLUMINITE_ROD);
            event.accept(ModItems.ALLUMINITE_ROD_SHARD);
            event.accept(ModItems.ALLUMINITE_HELMET);
            event.accept(ModItems.ALLUMINITE_CHESTPLATE);
            event.accept(ModItems.ALLUMINITE_LEGGINGS);
            event.accept(ModItems.ALLUMINITE_BOOTS);
            event.accept(ModItems.OBSIDIAN_HELMET);
            event.accept(ModItems.OBSIDIAN_CHESTPLATE);
            event.accept(ModItems.OBSIDIAN_LEGGINGS);
            event.accept(ModItems.OBSIDIAN_BOOTS);
            event.accept(ModItems.OBSIDIAN_SWORD);
            event.accept(ModItems.OBSIDIAN_AXE);
            event.accept(ModItems.OBSIDIAN_PICKAXE);
            event.accept(ModItems.OBSIDIAN_SHOVEL);
            event.accept(ModItems.OBSIDIAN_HOE);
            event.accept(ModItems.ROUGH_SUGAR);
            event.accept(ModItems.SALAD_TOPPINGS);
            event.accept(ModItems.SALAD);
            event.accept(ModItems.RANCH_BOTTLE);
            event.accept(ModItems.CROUTON);
            event.accept(ModItems.CUCUMBER);
            event.accept(ModItems.LETTUCE);
            event.accept(ModItems.TOMATO);
            event.accept(ModItems.CUCUMBER_SEEDS);
            event.accept(ModItems.LETTUCE_SEEDS);
            event.accept(ModItems.TOMATO_SEEDS);

            if (event.getTab() == ModCreativeModeTab.TWINDLING_TWEAKS) {
                event.accept(ModBlocks.MUD_BLOCK);
                event.accept(ModBlocks.DRIED_MUD_BLOCK);
                event.accept(ModBlocks.MUD_DOOR);
                event.accept(ModBlocks.MUD_TRAPDOOR);
                event.accept(ModBlocks.RED_MAPLE_LOG);
                event.accept(ModBlocks.STRIPPED_RED_MAPLE_LOG);
                event.accept(ModBlocks.RED_MAPLE_WOOD);
                event.accept(ModBlocks.STRIPPED_RED_MAPLE_WOOD);
                event.accept(ModBlocks.RED_MAPLE_PLANKS);
                event.accept(ModBlocks.RED_MAPLE_LEAVES);
                event.accept(ModBlocks.RED_MAPLE_SAPLING);
                event.accept(ModBlocks.RED_MAPLE_STAiRS);
                event.accept(ModBlocks.RED_MAPLE_SLAB);
                event.accept(ModBlocks.RED_MAPLE_DOOR);
                event.accept(ModBlocks.RED_MAPLE_TRAPDOOR);
                event.accept(ModBlocks.RED_MAPLE_BUTTON);
                event.accept(ModBlocks.RED_MAPLE_PRESSURE_PLATE);
                event.accept(ModBlocks.RED_MAPLE_FENCE);
                event.accept(ModBlocks.RED_MAPLE_FENCE_GATE);
                event.accept(ModBlocks.CATALPA_LOG);
                event.accept(ModBlocks.STRIPPED_CATALPA_LOG);
                event.accept(ModBlocks.CATALPA_WOOD);
                event.accept(ModBlocks.STRIPPED_CATALPA_WOOD);
                event.accept(ModBlocks.CATALPA_PLANKS);
                event.accept(ModBlocks.CATALPA_LEAVES);
                event.accept(ModBlocks.CATALPA_SAPLING);
                event.accept(ModBlocks.CATALPA_STAiRS);
                event.accept(ModBlocks.CATALPA_SLAB);
                event.accept(ModBlocks.CATALPA_DOOR);
                event.accept(ModBlocks.CATALPA_TRAPDOOR);
                event.accept(ModBlocks.CATALPA_BUTTON);
                event.accept(ModBlocks.CATALPA_PRESSURE_PLATE);
                event.accept(ModBlocks.CATALPA_FENCE);
                event.accept(ModBlocks.CATALPA_FENCE_GATE);
                event.accept(ModBlocks.REINFORCED_OBSIDIAN);
                event.accept(ModBlocks.OBSIDIAN_FORGER);
                event.accept(ModBlocks.ROUGH_SUGAR_BLOCK);
                event.accept(ModBlocks.SUGAR_BLOCK);
                event.accept(ModBlocks.ALLUMINITE_BLOCK);
                event.accept(ModBlocks.RAW_ALLUMINITE_BLOCK);
                event.accept(ModBlocks.MUD_ORE);
                event.accept(ModBlocks.DEEPSLATE_MUD_ORE);
                event.accept(ModBlocks.SUGAR_ORE);
                event.accept(ModBlocks.DEEPSLATE_SUGAR_ORE);
                event.accept(ModBlocks.ALLUMINITE_ORE);
                event.accept(ModBlocks.DEEPSLATE_ALLUMINITE_ORE);


            }
        }
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MUD_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MUD_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CUCUMBER_SEEDS_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LETTUCE_SEEDS_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TOMATO_SEEDS_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CATALPA_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CATALPA_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CATALPA_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CATALPA_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_MAPLE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_MAPLE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_MAPLE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_MAPLE_TRAPDOOR.get(), RenderType.cutout());
        MenuScreens.register(ModMenuTypes.OBSIDIAN_FORGER_MENU.get(), ObsidianForgerScreen::new);
    }



    private void setup(final FMLCommonSetupEvent event) {
    }
}