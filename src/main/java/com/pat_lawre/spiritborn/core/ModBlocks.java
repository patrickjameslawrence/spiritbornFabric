package com.pat_lawre.spiritborn.core;

import net.minecraft.block.*;
import net.minecraft.block.sapling.OakSaplingGenerator;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.SignType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class ModBlocks {
    // TODO: Figure out the MaterialColor for each wood variant block
    public static final Block ROWAN_WOOD = createWood();
    public static final Block ROWAN_LOG = createLog(MaterialColor.WOOD, MaterialColor.WOOD);
    public static final Block STRIPPED_ROWAN_WOOD = createWood();
    public static final Block STRIPPED_ROWAN_LOG = createLog(MaterialColor.WOOD, MaterialColor.WOOD);
    public static final Block ROWAN_PLANKS = createPlanks();
    public static final Block ROWAN_LEAVES = createLeaves();
    public static final Block ROWAN_STAIRS = createStairs(ROWAN_PLANKS);
    public static final Block ROWAN_SLAB = createSlab();
    public static final Block ROWAN_FENCE = createFence(ROWAN_PLANKS);
    public static final Block ROWAN_FENCE_GATE = createFenceGate(ROWAN_PLANKS);
    public static final Block ROWAN_DOOR = createDoor(ROWAN_PLANKS);
    public static final Block ROWAN_TRAPDOOR = createTrapdoor();
    public static final Block ROWAN_SIGN = createSign(SignType.OAK);
    public static final Block ROWAN_PRESSURE_PLATE = createPressurePlate(ROWAN_PLANKS);
    public static final Block ROWAN_BUTTON = createButton();
    public static final Block ROWAN_SAPLING = createSapling(new OakSaplingGenerator());

    private static PillarBlock createLog(MaterialColor topMaterialColor, MaterialColor sideMaterialColor) {
        return new PillarBlock(AbstractBlock.Settings.of(Material.WOOD, (blockState) -> blockState.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMaterialColor : sideMaterialColor).strength(2.0F).sounds(BlockSoundGroup.WOOD));
    }

    private static PillarBlock createWood() {
        return new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F).sounds(BlockSoundGroup.WOOD));
    }

    private static Block createPlanks() {
        return new Block(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    }

    private static Block createLeaves() {
        return new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque().allowsSpawning(ModBlocks::canSpawnOnLeaves).suffocates(ModBlocks::never).blockVision(ModBlocks::never));
    }

    private static Boolean canSpawnOnLeaves(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return type == EntityType.OCELOT || type == EntityType.PARROT;
    }

    private static StairsBlock createStairs(Block block) {
        return new StairsBlock(block.getDefaultState(), AbstractBlock.Settings.copy(block)) {};
    }

    private static SlabBlock createSlab() {
        return new SlabBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    }

    private static FenceBlock createFence(Block block) {
        return new FenceBlock(AbstractBlock.Settings.of(Material.WOOD, block.getDefaultMaterialColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    }

    private static FenceGateBlock createFenceGate(Block block) {
        return new FenceGateBlock(AbstractBlock.Settings.of(Material.WOOD, block.getDefaultMaterialColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    }

    private static DoorBlock createDoor(Block block) {
        return new DoorBlock(AbstractBlock.Settings.of(Material.WOOD, block.getDefaultMaterialColor()).strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()) {};
    }

    // TODO: Make MaterialColor more generalized
    private static TrapdoorBlock createTrapdoor() {
        return new TrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque().allowsSpawning(ModBlocks::never)) {};
    }

    private static SignBlock createSign(SignType signType) {
        return new SignBlock(AbstractBlock.Settings.of(Material.WOOD).noCollision().strength(1.0F).sounds(BlockSoundGroup.WOOD), signType);
    }

    private static PressurePlateBlock createPressurePlate(Block block) {
        return new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.of(Material.WOOD, block.getDefaultMaterialColor()).noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD)) {};
    }

    private static WoodenButtonBlock createButton() {
        return new WoodenButtonBlock(AbstractBlock.Settings.of(Material.SUPPORTED).noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD)) {};
    }

    private static SaplingBlock createSapling(SaplingGenerator saplingGenerator) {
        return new SaplingBlock(saplingGenerator, AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)) {};
    }

    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    private static Boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) { return false; }
}
