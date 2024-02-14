package net.valbuilder.blurpleconcrete.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.valbuilder.blurpleconcrete.BlurpleConcrete;
import net.valbuilder.blurpleconcrete.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MAIN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlurpleConcrete.MOD_ID, "main"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.main"))
                    .icon(() -> new ItemStack(ModBlocks.BLURPLE_CONCRETE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLURPLE_CONCRETE);
                        entries.add(ModBlocks.LIGHT_BLURPLE_CONCRETE);
                        entries.add(ModBlocks.DARK_BLURPLE_CONCRETE);
                        entries.add(ModBlocks.BLURPLE_WOOL);
                        entries.add(ModBlocks.LIGHT_BLURPLE_WOOL);
                        entries.add(ModBlocks.DARK_BLURPLE_WOOL);
                    }).build());


    public static void registerItemGroups() {


        BlurpleConcrete.LOGGER.info("Registering item groups for " + BlurpleConcrete.MOD_ID);
    }
}
