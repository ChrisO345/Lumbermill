package com.chrisoliver345.lumbermill.item.crafting;

import com.chrisoliver345.lumbermill.Reference;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class RecipeType
{
    public static final IRecipeType<LumbermillingRecipe> LUMBERMILLING = register(new ResourceLocation(Reference.MOD_ID, "lumbermilling"));

    private static <T extends IRecipe<?>> net.minecraft.item.crafting.IRecipeType<T> register(final ResourceLocation resource)
    {
        return Registry.register(Registry.RECIPE_TYPE, resource, new IRecipeType<T>()
        {
            @Override
            public String toString()
            {
                return resource.toString();
            }
        });
    }
}
