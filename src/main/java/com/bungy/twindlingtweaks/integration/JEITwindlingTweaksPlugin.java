package com.bungy.twindlingtweaks.integration;

import com.bungy.twindlingtweaks.TwindlingTweaks;
import com.bungy.twindlingtweaks.recipes.ObsidianForgerRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEITwindlingTweaksPlugin implements IModPlugin {
    public static RecipeType<ObsidianForgerRecipe> FORGING_TYPE =
            new RecipeType<>(ObsidianForgerRecipeCategory.UID, ObsidianForgerRecipe.class);

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(TwindlingTweaks.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                ObsidianForgerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<ObsidianForgerRecipe> recipesForging = rm.getAllRecipesFor(ObsidianForgerRecipe.Type.INSTANCE);
        registration.addRecipes(FORGING_TYPE, recipesForging);
    }
}