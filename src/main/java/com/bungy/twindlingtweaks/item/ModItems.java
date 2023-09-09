package com.bungy.twindlingtweaks.item;

import com.bungy.twindlingtweaks.TwindlingTweaks;
import com.bungy.twindlingtweaks.block.ModBlocks;
import com.bungy.twindlingtweaks.block.custom.ModArmorItem;
import com.bungy.twindlingtweaks.block.custom.ModArmorItem2;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TwindlingTweaks.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> MUD_BALL = ITEMS.register("mud_ball",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_MUD_BALL = ITEMS.register("dried_mud_ball",
            () -> new Item(new Item.Properties().food(ModFoods.DRIED_MUD_BALL)));

    public static final RegistryObject<Item> RAW_ALLUMINITE = ITEMS.register("raw_alluminite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALLUMINITE_INGOT = ITEMS.register("alluminite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALLUMINITE_NUGGET = ITEMS.register("alluminite_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REINFORCED_ALLUMINITE_INGOT = ITEMS.register("reinforced_alluminite_ingot",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> BIRCH_STICK = ITEMS.register("birch_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SWORD = ITEMS.register("birch_sword",
            () -> new SwordItem(ModTiers.BIRCH,  3, -2.4F,
                    new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_AXE = ITEMS.register("birch_axe",
            () -> new AxeItem(ModTiers.BIRCH,  6, -3.2F,
                    new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_PICKAXE = ITEMS.register("birch_pickaxe",
            () -> new PickaxeItem(ModTiers.BIRCH,  1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SHOVEL = ITEMS.register("birch_shovel",
            () -> new ShovelItem(ModTiers.BIRCH,  1.5F, -3F,
                    new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_HOE = ITEMS.register("birch_hoe",
            () -> new HoeItem(ModTiers.BIRCH,  0, -3F,
                    new Item.Properties()));

    public static final RegistryObject<Item> SPRUCE_STICK = ITEMS.register("spruce_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_SWORD = ITEMS.register("spruce_sword",
            () -> new SwordItem(ModTiers.SPRUCE,  3, -2.4F,
                    new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_AXE = ITEMS.register("spruce_axe",
            () -> new AxeItem(ModTiers.SPRUCE,  6, -3.2F,
                    new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_PICKAXE = ITEMS.register("spruce_pickaxe",
            () -> new PickaxeItem(ModTiers.SPRUCE,  1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_SHOVEL = ITEMS.register("spruce_shovel",
            () -> new ShovelItem(ModTiers.SPRUCE,  1.5F, -3F,
                    new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_HOE = ITEMS.register("spruce_hoe",
            () -> new HoeItem(ModTiers.SPRUCE,  0, -3F,
                    new Item.Properties()));

    public static final RegistryObject<Item> ACACIA_STICK = ITEMS.register("acacia_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_SWORD = ITEMS.register("acacia_sword",
            () -> new SwordItem(ModTiers.ACACIA,  3, -2.4F,
                    new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_AXE = ITEMS.register("acacia_axe",
            () -> new AxeItem(ModTiers.ACACIA,  6, -3.2F,
                    new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_PICKAXE = ITEMS.register("acacia_pickaxe",
            () -> new PickaxeItem(ModTiers.ACACIA,  1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_SHOVEL = ITEMS.register("acacia_shovel",
            () -> new ShovelItem(ModTiers.ACACIA,  1.5F, -3F,
                    new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_HOE = ITEMS.register("acacia_hoe",
            () -> new HoeItem(ModTiers.ACACIA,  0, -3F,
                    new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_STICK = ITEMS.register("jungle_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_SWORD = ITEMS.register("jungle_sword",
            () -> new SwordItem(ModTiers.JUNGLE,  3, -2.4F,
                    new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_AXE = ITEMS.register("jungle_axe",
            () -> new AxeItem(ModTiers.JUNGLE,  6, -3.2F,
                    new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_PICKAXE = ITEMS.register("jungle_pickaxe",
            () -> new PickaxeItem(ModTiers.JUNGLE,  1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_SHOVEL = ITEMS.register("jungle_shovel",
            () -> new ShovelItem(ModTiers.JUNGLE,  1.5F, -3F,
                    new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_HOE = ITEMS.register("jungle_hoe",
            () -> new HoeItem(ModTiers.JUNGLE,  0, -3F,
                    new Item.Properties()));

    public static final RegistryObject<Item> DARK_OAK_STICK = ITEMS.register("dark_oak_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_SWORD = ITEMS.register("dark_oak_sword",
            () -> new SwordItem(ModTiers.DARK_OAK,  3, -2.4F,
                    new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_AXE = ITEMS.register("dark_oak_axe",
            () -> new AxeItem(ModTiers.DARK_OAK,  6, -3.2F,
                    new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_PICKAXE = ITEMS.register("dark_oak_pickaxe",
            () -> new PickaxeItem(ModTiers.DARK_OAK,  1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_SHOVEL = ITEMS.register("dark_oak_shovel",
            () -> new ShovelItem(ModTiers.DARK_OAK,  1.5F, -3F,
                    new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_HOE = ITEMS.register("dark_oak_hoe",
            () -> new HoeItem(ModTiers.DARK_OAK,  0, -3F,
                    new Item.Properties()));

    public static final RegistryObject<Item> MANGROVE_STICK = ITEMS.register("mangrove_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_SWORD = ITEMS.register("mangrove_sword",
            () -> new SwordItem(ModTiers.MANGROVE,  3, -2.4F,
                    new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_AXE = ITEMS.register("mangrove_axe",
            () -> new AxeItem(ModTiers.MANGROVE,  6, -3.2F,
                    new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_PICKAXE = ITEMS.register("mangrove_pickaxe",
            () -> new PickaxeItem(ModTiers.MANGROVE,  1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_SHOVEL = ITEMS.register("mangrove_shovel",
            () -> new ShovelItem(ModTiers.MANGROVE,  1.5F, -3F,
                    new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_HOE = ITEMS.register("mangrove_hoe",
            () -> new HoeItem(ModTiers.MANGROVE,  0, -3F,
                    new Item.Properties()));

    public static final RegistryObject<Item> CRIMSON_STICK = ITEMS.register("crimson_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_SWORD = ITEMS.register("crimson_sword",
            () -> new SwordItem(ModTiers.CRIMSON,  3, -2.4F,
                    new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_AXE = ITEMS.register("crimson_axe",
            () -> new AxeItem(ModTiers.CRIMSON,  6, -3.2F,
                    new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_PICKAXE = ITEMS.register("crimson_pickaxe",
            () -> new PickaxeItem(ModTiers.CRIMSON,  1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_SHOVEL = ITEMS.register("crimson_shovel",
            () -> new ShovelItem(ModTiers.CRIMSON,  1.5F, -3F,
                    new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_HOE = ITEMS.register("crimson_hoe",
            () -> new HoeItem(ModTiers.CRIMSON,  0, -3F,
                    new Item.Properties()));

    public static final RegistryObject<Item> WARPED_STICK = ITEMS.register("warped_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SWORD = ITEMS.register("warped_sword",
            () -> new SwordItem(ModTiers.WARPED,  3, -2.4F,
                    new Item.Properties()));
    public static final RegistryObject<Item> WARPED_AXE = ITEMS.register("warped_axe",
            () -> new AxeItem(ModTiers.WARPED,  6, -3.2F,
                    new Item.Properties()));
    public static final RegistryObject<Item> WARPED_PICKAXE = ITEMS.register("warped_pickaxe",
            () -> new PickaxeItem(ModTiers.WARPED,  1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SHOVEL = ITEMS.register("warped_shovel",
            () -> new ShovelItem(ModTiers.WARPED,  1.5F, -3F,
                    new Item.Properties()));
    public static final RegistryObject<Item> WARPED_HOE = ITEMS.register("warped_hoe",
            () -> new HoeItem(ModTiers.WARPED,  0, -3F,
                    new Item.Properties()));

    public static final RegistryObject<Item> CATALPA_STICK = ITEMS.register("catalpa_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATALPA_SWORD = ITEMS.register("catalpa_sword",
            () -> new SwordItem(ModTiers.CATALPA,  3, -2.4F,
                    new Item.Properties()));
    public static final RegistryObject<Item> CATALPA_AXE = ITEMS.register("catalpa_axe",
            () -> new AxeItem(ModTiers.CATALPA,  6, -3.2F,
                    new Item.Properties()));
    public static final RegistryObject<Item> CATALPA_PICKAXE = ITEMS.register("catalpa_pickaxe",
            () -> new PickaxeItem(ModTiers.CATALPA,  1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<Item> CATALPA_SHOVEL = ITEMS.register("catalpa_shovel",
            () -> new ShovelItem(ModTiers.CATALPA,  1.5F, -3F,
                    new Item.Properties()));
    public static final RegistryObject<Item> CATALPA_HOE = ITEMS.register("catalpa_hoe",
            () -> new HoeItem(ModTiers.CATALPA,  0, -3F,
                    new Item.Properties()));

    public static final RegistryObject<Item> RED_MAPLE_STICK = ITEMS.register("red_maple_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_MAPLE_SWORD = ITEMS.register("red_maple_sword",
            () -> new SwordItem(ModTiers.RED_MAPLE,  3, -2.4F,
                    new Item.Properties()));
    public static final RegistryObject<Item> RED_MAPLE_AXE = ITEMS.register("red_maple_axe",
            () -> new AxeItem(ModTiers.RED_MAPLE,  6, -3.2F,
                    new Item.Properties()));
    public static final RegistryObject<Item> RED_MAPLE_PICKAXE = ITEMS.register("red_maple_pickaxe",
            () -> new PickaxeItem(ModTiers.RED_MAPLE,  1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<Item> RED_MAPLE_SHOVEL = ITEMS.register("red_maple_shovel",
            () -> new ShovelItem(ModTiers.RED_MAPLE,  1.5F, -3F,
                    new Item.Properties()));
    public static final RegistryObject<Item> RED_MAPLE_HOE = ITEMS.register("red_maple_hoe",
            () -> new HoeItem(ModTiers.RED_MAPLE,  0, -3F,
                    new Item.Properties()));

    public static final RegistryObject<Item> ALLUMINITE_SWORD = ITEMS.register("alluminite_sword",
            () -> new SwordItem(ModTiers.ALLUMINITE,  7, -2.2F,
                    new Item.Properties()));
    public static final RegistryObject<Item> ALLUMINITE_AXE = ITEMS.register("alluminite_axe",
            () -> new AxeItem(ModTiers.ALLUMINITE,  10, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<Item> ALLUMINITE_PICKAXE = ITEMS.register("alluminite_pickaxe",
            () -> new PickaxeItem(ModTiers.ALLUMINITE,  1, -1.9F,
                    new Item.Properties()));
    public static final RegistryObject<Item> ALLUMINITE_SHOVEL = ITEMS.register("alluminite_shovel",
            () -> new ShovelItem(ModTiers.ALLUMINITE,  2, -1.9F,
                    new Item.Properties()));
    public static final RegistryObject<Item> ALLUMINITE_HOE = ITEMS.register("alluminite_hoe",
            () -> new HoeItem(ModTiers.ALLUMINITE,  2, 1.9F,
                    new Item.Properties()));

    public static final RegistryObject<Item> ALLUMINITE_HELMET = ITEMS.register("alluminite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ALLUMINITE, EquipmentSlot.HEAD,
                    new Item.Properties()));
    public static final RegistryObject<Item> ALLUMINITE_CHESTPLATE = ITEMS.register("alluminite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ALLUMINITE, EquipmentSlot.CHEST,
                    new Item.Properties()));
    public static final RegistryObject<Item> ALLUMINITE_LEGGINGS = ITEMS.register("alluminite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ALLUMINITE, EquipmentSlot.LEGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> ALLUMINITE_BOOTS = ITEMS.register("alluminite_boots",
            () -> new ArmorItem(ModArmorMaterials.ALLUMINITE, EquipmentSlot.FEET,
                    new Item.Properties()));



    public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
            () -> new ModArmorItem2(ModArmorMaterials.OBSIDIAN, EquipmentSlot.HEAD,
                    new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.CHEST,
                    new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.LEGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.FEET,
                    new Item.Properties()));







    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(ModTiers.OBSIDIAN,  9, -2.9F,
                    new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",
            () -> new AxeItem(ModTiers.OBSIDIAN,  16, -3.4F,
                    new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",
            () -> new PickaxeItem(ModTiers.OBSIDIAN,  1, -1.9F,
                    new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel",
            () -> new ShovelItem(ModTiers.OBSIDIAN,  2, -1.9F,
                    new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",
            () -> new HoeItem(ModTiers.OBSIDIAN,  2, 1.9F,
                    new Item.Properties()));


    public static final RegistryObject<Item> ALLUMINITE_ROD = ITEMS.register("alluminite_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALLUMINITE_ROD_SHARD = ITEMS.register("alluminite_rod_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROUGH_SUGAR = ITEMS.register("rough_sugar",
            () -> new Item(new Item.Properties().food(ModFoods.ROUGH_SUGAR)));

    public static final RegistryObject<Item> SALAD_TOPPINGS = ITEMS.register("salad_toppings",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RANCH_BOTTLE = ITEMS.register("ranch_bottle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().food(ModFoods.CUCUMBER)));

    public static final RegistryObject<Item> CROUTON = ITEMS.register("crouton",
            () -> new Item(new Item.Properties().food(ModFoods.CROUTON)));

    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().food(ModFoods.LETTUCE)));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO)));

    public static final RegistryObject<Item> SALAD = ITEMS.register("salad",
            () -> new Item(new Item.Properties().food(ModFoods.SALAD)));

    public static final RegistryObject<Item> CUCUMBER_SEEDS = ITEMS.register("cucumber_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CUCUMBER_SEEDS_BLOCK.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> LETTUCE_SEEDS = ITEMS.register("lettuce_seeds",
            () -> new ItemNameBlockItem(ModBlocks.LETTUCE_SEEDS_BLOCK.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TOMATO_SEEDS_BLOCK.get(),
                    new Item.Properties()));

    }
