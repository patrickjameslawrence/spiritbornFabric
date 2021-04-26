package com.pat_lawre.spiritborn;

import com.pat_lawre.spiritborn.core.ModBlocks;
import com.pat_lawre.spiritborn.core.ModItems;
import com.pat_lawre.spiritborn.core.Variables;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.impl.content.registry.FlammableBlockRegistryImpl;
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
		register(Registry.BLOCK, "rowan_leaves", ModBlocks.ROWAN_LEAVES);
		register(Registry.BLOCK, "rowan_stairs", ModBlocks.ROWAN_STAIRS);
		register(Registry.BLOCK, "rowan_slab", ModBlocks.ROWAN_SLAB);
		register(Registry.BLOCK, "rowan_fence", ModBlocks.ROWAN_FENCE);
		register(Registry.BLOCK, "rowan_fence_gate", ModBlocks.ROWAN_FENCE_GATE);
		register(Registry.BLOCK, "rowan_door", ModBlocks.ROWAN_DOOR);
		register(Registry.BLOCK, "rowan_trapdoor", ModBlocks.ROWAN_TRAPDOOR);
		register(Registry.BLOCK, "rowan_sign", ModBlocks.ROWAN_SIGN);
		register(Registry.BLOCK, "rowan_pressure_plate", ModBlocks.ROWAN_PRESSURE_PLATE);
		register(Registry.BLOCK, "rowan_button", ModBlocks.ROWAN_BUTTON);
		register(Registry.BLOCK, "rowan_sapling", ModBlocks.ROWAN_SAPLING);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ROWAN_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ROWAN_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_FENCE_GATE, 5, 20);

		System.out.println("Spiritborn blocks registered");
	}

	private static void registerItems() {
		System.out.println("Registering Spiritborn items");

		register(Registry.ITEM, "rowan_wood", ModItems.ROWAN_WOOD);
		register(Registry.ITEM, "stripped_rowan_wood", ModItems.STRIPPED_ROWAN_WOOD);
		register(Registry.ITEM, "rowan_log", ModItems.ROWAN_LOG);
		register(Registry.ITEM, "stripped_rowan_log", ModItems.STRIPPED_ROWAN_LOG);
		register(Registry.ITEM, "rowan_planks", ModItems.ROWAN_PLANKS);
		register(Registry.ITEM, "rowan_leaves", ModItems.ROWAN_LEAVES);
		register(Registry.ITEM, "rowan_stairs", ModItems.ROWAN_STAIRS);
		register(Registry.ITEM, "rowan_slab", ModItems.ROWAN_SLAB);
		register(Registry.ITEM, "rowan_fence", ModItems.ROWAN_FENCE);
		register(Registry.ITEM, "rowan_fence_gate", ModItems.ROWAN_FENCE_GATE);
		register(Registry.ITEM, "rowan_door", ModItems.ROWAN_DOOR);
		register(Registry.ITEM, "rowan_trapdoor", ModItems.ROWAN_TRAPDOOR);
		register(Registry.ITEM, "rowan_sign", ModItems.ROWAN_SIGN);
		register(Registry.ITEM, "rowan_pressure_plate", ModItems.ROWAN_PRESSUE_PLATE);
		register(Registry.ITEM, "rowan_button", ModItems.ROWAN_BUTTON);
		register(Registry.ITEM, "rowan_sapling", ModItems.ROWAN_SAPLING);

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
