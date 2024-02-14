package net.valbuilder.blurpleconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.valbuilder.blurpleconcrete.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLURPLE_CONCRETE);
        addDrop(ModBlocks.LIGHT_BLURPLE_CONCRETE);
        addDrop(ModBlocks.DARK_BLURPLE_CONCRETE);

        addDrop(ModBlocks.BLURPLE_WOOL);
        addDrop(ModBlocks.LIGHT_BLURPLE_WOOL);
        addDrop(ModBlocks.DARK_BLURPLE_WOOL);

        addDrop(ModBlocks.BLURPLE_CARPET);
        addDrop(ModBlocks.LIGHT_BLURPLE_CARPET);
        addDrop(ModBlocks.DARK_BLURPLE_CARPET);
    }
}
