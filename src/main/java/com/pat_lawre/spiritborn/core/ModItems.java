package com.pat_lawre.spiritborn.core;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier("spiritborn", "general"), () -> new ItemStack(ModBlocks.ROWAN_LOG));
    private static final Item.Settings SETTINGS = new Item.Settings().group(ITEM_GROUP);

    public static final Item ROWAN_WOOD = new BlockItem(ModBlocks.ROWAN_WOOD, SETTINGS);
    public static final Item STRIPPED_ROWAN_WOOD = new BlockItem(ModBlocks.STRIPPED_ROWAN_WOOD, SETTINGS);
    public static final Item ROWAN_LOG = new BlockItem(ModBlocks.ROWAN_LOG, SETTINGS);
    public static final Item STRIPPED_ROWAN_LOG = new BlockItem(ModBlocks.STRIPPED_ROWAN_LOG, SETTINGS);
    public static final Item ROWAN_PLANKS = new BlockItem(ModBlocks.ROWAN_PLANKS, SETTINGS);
    public static final Item ROWAN_LEAVES = new BlockItem(ModBlocks.ROWAN_LEAVES, SETTINGS);
    public static final Item ROWAN_STAIRS = new BlockItem(ModBlocks.ROWAN_STAIRS, SETTINGS);
    public static final Item ROWAN_SLAB = new BlockItem(ModBlocks.ROWAN_SLAB, SETTINGS);
    public static final Item ROWAN_FENCE = new BlockItem(ModBlocks.ROWAN_FENCE, SETTINGS);
    public static final Item ROWAN_FENCE_GATE = new BlockItem(ModBlocks.ROWAN_FENCE_GATE, SETTINGS);
    public static final Item ROWAN_DOOR = new BlockItem(ModBlocks.ROWAN_DOOR, SETTINGS);
    public static final Item ROWAN_TRAPDOOR = new BlockItem(ModBlocks.ROWAN_TRAPDOOR, SETTINGS);
    public static final Item ROWAN_SIGN = new BlockItem(ModBlocks.ROWAN_SIGN, SETTINGS);
    public static final Item ROWAN_PRESSUE_PLATE = new BlockItem(ModBlocks.ROWAN_PRESSURE_PLATE, SETTINGS);
    public static final Item ROWAN_BUTTON = new BlockItem(ModBlocks.ROWAN_BUTTON, SETTINGS);
    public static final Item ROWAN_SAPLING = new BlockItem(ModBlocks.ROWAN_SAPLING, SETTINGS);

    public static final Item ACONITE = new Item(SETTINGS);
    public static final Item BELLADONNA = new Item(SETTINGS);
    public static final Item MANDRAKE = new Item(SETTINGS);
    public static final Item SAGE = new Item(SETTINGS);
    public static final Item RUE = new Item(SETTINGS);
    public static final Item DATURA = new Item(SETTINGS);
}
