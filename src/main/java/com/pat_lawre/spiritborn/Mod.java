package com.pat_lawre.spiritborn;

import com.pat_lawre.spiritborn.core.ModBlocks;
import com.pat_lawre.spiritborn.core.ModItems;
import com.pat_lawre.spiritborn.core.Variables;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Mod implements ModInitializer {

	// TODO: Fix item and block tags
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		registerBlocks();
		registerItems();
	}

	private static void registerBlocks() {
		System.out.println("Registering Spiritborn blocks");

		register(Registry.BLOCK, "rowan_wood", ModBlocks.ROWAN_WOOD);
		register(Registry.BLOCK, "stripped_rowan_wood", ModBlocks.STRIPPED_ROWAN_WOOD);
		register(Registry.BLOCK, "rowan_log", ModBlocks.ROWAN_LOG);
		register(Registry.BLOCK, "stripped_rowan_log", ModBlocks.STRIPPED_ROWAN_LOG);
		register(Registry.BLOCK, "rowan_planks", ModBlocks.ROWAN_PLANKS);
		register(Registry.BLOCK, "rowan_stairs", ModBlocks.ROWAN_STAIRS);
		register(Registry.BLOCK, "rowan_slab", ModBlocks.ROWAN_SLAB);

		System.out.println("Spiritborn blocks registered");
	}

	private static void registerItems() {
		System.out.println("Registering Spiritborn items");

		register(Registry.ITEM, "rowan_wood", ModItems.ROWAN_WOOD);
		register(Registry.ITEM, "stripped_rowan_wood", ModItems.STRIPPED_ROWAN_WOOD);
		register(Registry.ITEM, "rowan_log", ModItems.ROWAN_LOG);
		register(Registry.ITEM, "stripped_rowan_log", ModItems.STRIPPED_ROWAN_LOG);
		register(Registry.ITEM, "rowan_planks", ModItems.ROWAN_PLANKS);
		register(Registry.ITEM, "rowan_stairs", ModItems.ROWAN_STAIRS);
		register(Registry.ITEM, "rowan_slab", ModItems.ROWAN_SLAB);

		register(Registry.ITEM, "aconite", ModItems.ACONITE);
		register(Registry.ITEM, "belladonna", ModItems.BELLADONNA);
		register(Registry.ITEM, "mandrake", ModItems.MANDRAKE);
		register(Registry.ITEM, "sage", ModItems.SAGE);
		register(Registry.ITEM, "rue", ModItems.RUE);
		register(Registry.ITEM, "datura", ModItems.DATURA);

		System.out.println("Spiritborn items registered");
	}



	private static <V, T extends V> void register(Registry<V> registry, String path, T entry) { Registry.register(registry, new Identifier(Variables.MOD_ID, path), entry); }
}
