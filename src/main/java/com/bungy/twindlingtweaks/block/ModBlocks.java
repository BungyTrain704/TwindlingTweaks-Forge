package com.bungy.twindlingtweaks.block;

import com.bungy.twindlingtweaks.TwindlingTweaks;
import com.bungy.twindlingtweaks.block.custom.CucumberPlantBlock;
import com.bungy.twindlingtweaks.block.custom.LettucePlantBlock;
import com.bungy.twindlingtweaks.block.custom.ModFlammableRotatedPillarBlock;
import com.bungy.twindlingtweaks.block.custom.ObsidianForgerBlock;
import com.bungy.twindlingtweaks.item.ModCreativeModeTab;
import com.bungy.twindlingtweaks.item.ModItems;
import com.bungy.twindlingtweaks.screen.ModMenuTypes;
import com.bungy.twindlingtweaks.world.feature.tree.CatalpaTreeGrower;
import com.bungy.twindlingtweaks.world.feature.tree.RedMapleTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TwindlingTweaks.MOD_ID);

    public static final RegistryObject<Block> MUD_BLOCK = registerBlock("mud_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(0.5F)), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> DRIED_MUD_BLOCK = registerBlock("dried_mud_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> MUD_DOOR = registerBlock("mud_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.8F).noOcclusion()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> MUD_TRAPDOOR = registerBlock("mud_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.8F).noOcclusion()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> RED_MAPLE_LOG = registerBlock("red_maple_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> RED_MAPLE_WOOD = registerBlock("red_maple_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> STRIPPED_RED_MAPLE_LOG = registerBlock("stripped_red_maple_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> STRIPPED_RED_MAPLE_WOOD = registerBlock("stripped_red_maple_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> RED_MAPLE_PLANKS = registerBlock("red_maple_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1F)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
            () -> new SaplingBlock(new RedMapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> RED_MAPLE_DOOR = registerBlock("red_maple_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1F).noOcclusion()), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> RED_MAPLE_TRAPDOOR = registerBlock("red_maple_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1F).noOcclusion()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> RED_MAPLE_STAiRS = registerBlock("red_maple_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_MAPLE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)
                    .strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> RED_MAPLE_SLAB = registerBlock("red_maple_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)
                    .strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> RED_MAPLE_FENCE = registerBlock("red_maple_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                    .strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> RED_MAPLE_FENCE_GATE = registerBlock("red_maple_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> RED_MAPLE_BUTTON = registerBlock("red_maple_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1F).noCollission()) {
            }, ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> RED_MAPLE_PRESSURE_PLATE = registerBlock("red_maple_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD).strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);



    public static final RegistryObject<Block> CATALPA_STAiRS = registerBlock("catalpa_stairs",
            () -> new StairBlock(() -> ModBlocks.CATALPA_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)
                    .strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> CATALPA_SLAB = registerBlock("catalpa_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)
                    .strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> CATALPA_FENCE = registerBlock("catalpa_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                    .strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> CATALPA_FENCE_GATE = registerBlock("catalpa_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> CATALPA_DOOR = registerBlock("catalpa_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1F).noOcclusion()), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> CATALPA_TRAPDOOR = registerBlock("catalpa_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1F).noOcclusion()), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> CATALPA_BUTTON = registerBlock("catalpa_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1F).noCollission()) {
            }, ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> CATALPA_PRESSURE_PLATE = registerBlock("catalpa_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD).strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);


    public static final RegistryObject<Block> CATALPA_LOG = registerBlock("catalpa_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> CATALPA_WOOD = registerBlock("catalpa_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> STRIPPED_CATALPA_LOG = registerBlock("stripped_catalpa_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> STRIPPED_CATALPA_WOOD = registerBlock("stripped_catalpa_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(1F)), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> CATALPA_PLANKS = registerBlock("catalpa_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1F)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.TWINDLING_TWEAKS);



    public static final RegistryObject<Block> CATALPA_LEAVES = registerBlock("catalpa_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> CATALPA_SAPLING = registerBlock("catalpa_sapling",
            () -> new SaplingBlock(new CatalpaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> REINFORCED_OBSIDIAN = registerBlock("reinforced_obsidian",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12F).explosionResistance(1200F).sound(SoundType.ANVIL)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWINDLING_TWEAKS);
    public static final RegistryObject<Block> OBSIDIAN_FORGER = registerBlock("obsidian_forger",
            () -> new ObsidianForgerBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12F).explosionResistance(1200F).sound(SoundType.ANVIL)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> BIG_CRAFTING_TABLE = registerBlock("big_crafting_table",
            () -> new ObsidianForgerBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.2F).explosionResistance(1F).sound(SoundType.ANVIL)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> ROUGH_SUGAR_BLOCK = registerBlock("rough_sugar_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(0.5F)), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> SUGAR_BLOCK = registerBlock("sugar_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(0.4F)), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> ALLUMINITE_BLOCK = registerBlock("alluminite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2F).sound(SoundType.BASALT)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> RAW_ALLUMINITE_BLOCK = registerBlock("raw_alluminite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2F).sound(SoundType.BASALT)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> MUD_ORE = registerBlock("mud_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.9F)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> DEEPSLATE_MUD_ORE = registerBlock("deepslate_mud_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.1F)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> SUGAR_ORE = registerBlock("sugar_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.9F)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> DEEPSLATE_SUGAR_ORE = registerBlock("deepslate_sugar_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.1F)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> ALLUMINITE_ORE = registerBlock("alluminite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.1F).sound(SoundType.BASALT)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> DEEPSLATE_ALLUMINITE_ORE = registerBlock("deepslate_alluminite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.8F).sound(SoundType.BASALT)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWINDLING_TWEAKS);

    public static final RegistryObject<Block> CUCUMBER_SEEDS_BLOCK = registerBlockWithoutBlockItem("cucumber_seeds",
            () -> new CucumberPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> LETTUCE_SEEDS_BLOCK = registerBlockWithoutBlockItem("lettuce_seeds",
            () -> new LettucePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> TOMATO_SEEDS_BLOCK = registerBlockWithoutBlockItem("tomato_seeds",
            () -> new LettucePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));


    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {

        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);
    }
}