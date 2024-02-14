package net.valbuilder.blurpleconcrete.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.valbuilder.blurpleconcrete.BlurpleConcrete;

public class ModBlocks {
    public static final Block BLURPLE_CONCRETE = registerBlock("blurple_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE).sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_BLURPLE_CONCRETE = registerBlock("light_blurple_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE).sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_BLURPLE_CONCRETE = registerBlock("dark_blurple_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE).sounds(BlockSoundGroup.STONE)));


    public static final Block BLURPLE_WOOL = registerBlock("blurple_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLURPLE_WOOL = registerBlock("light_blurple_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block DARK_BLURPLE_WOOL = registerBlock("dark_blurple_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL).sounds(BlockSoundGroup.WOOL)));


    public static final Block BLURPLE_CARPET = registerBlock("blurple_carpet",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLURPLE_CARPET = registerBlock("light_blurple_carpet",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CARPET).sounds(BlockSoundGroup.WOOL)));
    public static final Block DARK_BLURPLE_CARPET = registerBlock("dark_blurple_carpet",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CARPET).sounds(BlockSoundGroup.WOOL)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BlurpleConcrete.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BlurpleConcrete.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BlurpleConcrete.LOGGER.info("Registering blocks for " + BlurpleConcrete.MOD_ID);
    }
}
