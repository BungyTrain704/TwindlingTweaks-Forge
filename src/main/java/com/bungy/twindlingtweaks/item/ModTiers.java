package com.bungy.twindlingtweaks.item;

import com.bungy.twindlingtweaks.block.ModBlocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier ALLUMINITE = new ForgeTier(3, 1500,3F,
            0F, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.REINFORCED_ALLUMINITE_INGOT.get()));

    public static final ForgeTier OBSIDIAN = new ForgeTier(3, 3000,4F,
            0F, 30, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModBlocks.REINFORCED_OBSIDIAN.get()));

    public static final ForgeTier BIRCH = new ForgeTier(0, 59,2F,
            0F, 15, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Blocks.BIRCH_PLANKS));

    public static final ForgeTier SPRUCE = new ForgeTier(0, 59,2F,
            0F, 15, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Blocks.SPRUCE_PLANKS));

    public static final ForgeTier ACACIA = new ForgeTier(0, 59,2F,
            0F, 15, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Blocks.ACACIA_PLANKS));

    public static final ForgeTier JUNGLE = new ForgeTier(0, 59,2F,
            0F, 15, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Blocks.JUNGLE_PLANKS));

    public static final ForgeTier DARK_OAK = new ForgeTier(0, 59,2F,
            0F, 15, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Blocks.JUNGLE_PLANKS));

    public static final ForgeTier MANGROVE = new ForgeTier(0, 59,2F,
            0F, 15, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Blocks.JUNGLE_PLANKS));

    public static final ForgeTier CRIMSON = new ForgeTier(0, 59,2F,
            0F, 15, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Blocks.JUNGLE_PLANKS));

    public static final ForgeTier WARPED = new ForgeTier(0, 59,2F,
            0F, 15, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Blocks.JUNGLE_PLANKS));

    public static final ForgeTier CATALPA = new ForgeTier(0, 59,2F,
            0F, 15, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Blocks.JUNGLE_PLANKS));

    public static final ForgeTier RED_MAPLE = new ForgeTier(0, 59,2F,
            0F, 15, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Blocks.JUNGLE_PLANKS));



}
