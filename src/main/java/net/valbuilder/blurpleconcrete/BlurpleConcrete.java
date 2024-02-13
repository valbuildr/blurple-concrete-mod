package net.valbuilder.blurpleconcrete;

import net.fabricmc.api.ModInitializer;

import net.valbuilder.blurpleconcrete.block.ModBlocks;
import net.valbuilder.blurpleconcrete.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlurpleConcrete implements ModInitializer {
	public static final String MOD_ID = "blurpleconcrete";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}