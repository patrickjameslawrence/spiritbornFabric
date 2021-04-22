package com.pat_lawre.spiritborn.core;

import com.pat_lawre.spiritborn.common.block.ModStairsBlock;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;

public class ModBlocks {
    // TODO: Figure out the MaterialColor for each wood variant block
    public static final Block ROWAN_WOOD = createWoodBlock();
    public static final Block ROWAN_LOG = createLogBlock(MaterialColor.WOOD, MaterialColor.WOOD);
    public static final Block STRIPPED_ROWAN_WOOD = createWoodBlock();
    public static final Block STRIPPED_ROWAN_LOG = createLogBlock(MaterialColor.WOOD, MaterialColor.WOOD);
    public static final Block ROWAN_PLANKS = createPlanksBlock();
    public static final Block ROWAN_STAIRS = createStairsBlock(ROWAN_PLANKS);
    public static final Block ROWAN_SLAB = createSlabBlock();

    private static PillarBlock createLogBlock(MaterialColor topMaterialColor, MaterialColor sideMaterialColor) {
        return new PillarBlock(AbstractBlock.Settings.of(Material.WOOD, (blockState) -> {
            return blockState.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMaterialColor : sideMaterialColor;
        }).strength(2.0F).sounds(BlockSoundGroup.WOOD));
    }

    private static PillarBlock createWoodBlock() {
        return new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F).sounds(BlockSoundGroup.WOOD));
    }

    private static Block createPlanksBlock() {
        return new Block(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    }

    private static ModStairsBlock createStairsBlock(Block block) {
        return new ModStairsBlock(ROWAN_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(ROWAN_PLANKS));
    }

    private static SlabBlock createSlabBlock() {
        return new SlabBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    }
}
