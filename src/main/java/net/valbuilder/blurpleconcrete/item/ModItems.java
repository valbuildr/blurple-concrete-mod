package net.valbuilder.blurpleconcrete.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.valbuilder.blurpleconcrete.BlurpleConcrete;

public class ModItems {
    public static final Item BLURPLE_DYE = registerItem("blurple_dye", new Item(new FabricItemSettings()));
    public static final Item LIGHT_BLURPLE_DYE = registerItem("light_blurple_dye", new Item(new FabricItemSettings()));
    public static final Item DARK_BLURPLE_DYE = registerItem("dark_blurple_dye", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BlurpleConcrete.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BlurpleConcrete.LOGGER.info("Registering mod items for " + BlurpleConcrete.MOD_ID);
    }
}
