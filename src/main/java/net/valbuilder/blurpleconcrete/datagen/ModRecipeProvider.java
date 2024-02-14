package net.valbuilder.blurpleconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.valbuilder.blurpleconcrete.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLURPLE_DYE, 1)
                .input(Items.PURPLE_DYE)
                .input(Items.BLUE_DYE)
                .criterion(hasItem(Items.PURPLE_DYE), conditionsFromItem(Items.PURPLE_DYE))
                .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLURPLE_DYE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_BLURPLE_DYE, 1)
                .input(ModItems.BLURPLE_DYE)
                .input(Items.WHITE_DYE)
                .criterion(hasItem(ModItems.BLURPLE_DYE), conditionsFromItem(ModItems.BLURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIGHT_BLURPLE_DYE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_BLURPLE_DYE, 1)
                .input(ModItems.BLURPLE_DYE)
                .input(Items.BLACK_DYE)
                .criterion(hasItem(ModItems.BLURPLE_DYE), conditionsFromItem(ModItems.BLURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DARK_BLURPLE_DYE)));
    }
}
