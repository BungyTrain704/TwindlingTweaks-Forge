package com.bungy.twindlingtweaks.world.feature;

import com.bungy.twindlingtweaks.TwindlingTweaks;
import com.bungy.twindlingtweaks.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, TwindlingTweaks.MOD_ID);


    public static final RegistryObject<PlacedFeature> ALLUMINITE_ORE_PLACED = PLACED_FEATURES.register("alluminite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ALLUMINITE_ORE.getHolder().get(),
                    commonOrePlacement(12, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(110)))));

    public static final RegistryObject<PlacedFeature> RAW_ALLUMINITE_BLOCK_PLACED = PLACED_FEATURES.register("raw_alluminite_block_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RAW_ALLUMINITE_BLOCK.getHolder().get(),
                    commonOrePlacement(6, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(110)))));

    public static final RegistryObject<PlacedFeature> MUD_ORE_PLACED = PLACED_FEATURES.register("mud_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.MUD_ORE.getHolder().get(),
                    commonOrePlacement(15, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(110)))));

    public static final RegistryObject<PlacedFeature> SUGAR_ORE_PLACED = PLACED_FEATURES.register("sugar_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SUGAR_ORE.getHolder().get(),
                    commonOrePlacement(14, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(110)))));



    public static final RegistryObject<PlacedFeature> RED_MAPLE_CHECKED = PLACED_FEATURES.register("red_maple_checked",
            () -> new PlacedFeature(ModConfiguredFeatures.RED_MAPLE.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(ModBlocks.RED_MAPLE_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> RED_MAPLE_PLACED = PLACED_FEATURES.register("red_maple_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RED_MAPLE_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));

    public static final RegistryObject<PlacedFeature> CATALPA_CHECKED = PLACED_FEATURES.register("catalpa_checked",
            () -> new PlacedFeature(ModConfiguredFeatures.CATALPA.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(ModBlocks.CATALPA_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> CATALPA_PLACED = PLACED_FEATURES.register("catalpa_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CATALPA_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}