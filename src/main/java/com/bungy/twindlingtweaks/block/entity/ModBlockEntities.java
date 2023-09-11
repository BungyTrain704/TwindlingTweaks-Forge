package com.bungy.twindlingtweaks.block.entity;

import com.bungy.twindlingtweaks.TwindlingTweaks;
import com.bungy.twindlingtweaks.block.ModBlocks;
import com.bungy.twindlingtweaks.block.entity.custom.ObsidianForgerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TwindlingTweaks.MOD_ID);

    public static final RegistryObject<BlockEntityType<ObsidianForgerBlockEntity>> OBSIDIAN_FORGER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("obsidian_forger_block_entity", () ->
                    BlockEntityType.Builder.of(ObsidianForgerBlockEntity::new,
                            ModBlocks.OBSIDIAN_FORGER.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}