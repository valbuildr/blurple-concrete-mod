package net.valbuilder.blurpleconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.valbuilder.blurpleconcrete.block.ModBlocks;
import net.valbuilder.blurpleconcrete.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLURPLE_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLURPLE_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_BLURPLE_CONCRETE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLURPLE_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLURPLE_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_BLURPLE_WOOL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BLURPLE_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLURPLE_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_BLURPLE_DYE, Models.GENERATED);
    }
}
