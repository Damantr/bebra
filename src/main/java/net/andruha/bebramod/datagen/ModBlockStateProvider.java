package net.andruha.bebramod.datagen;

import net.andruha.bebramod.BebraMod;
import net.andruha.bebramod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BebraMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithITem(ModBlocks.BEBRA_BLOCK);
        blockWithITem(ModBlocks.A);
        blockWithITem(ModBlocks.D);
        blockWithITem(ModBlocks.I);
        blockWithITem(ModBlocks.S);
        blockWithITem(ModBlocks.SOUND_BLOCK);
        blockWithITem(ModBlocks.BEBRUN_BLOCK);
        blockWithITem(ModBlocks.BLACKBG);
        blockWithITem(ModBlocks.BEBRA_ORE);

        stairsBlock(((StairBlock) ModBlocks.BEBRA_STAIRS.get()), blockTexture(ModBlocks.BEBRA_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.BEBRA_SLAB.get()), blockTexture(ModBlocks.BEBRA_BLOCK.get()), blockTexture(ModBlocks.BEBRA_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.BEBRA_BUTTON.get()), blockTexture(ModBlocks.BEBRA_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.BEBRA_PRESSURE_PLATE.get()), blockTexture(ModBlocks.BEBRA_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.BEBRA_FENCE.get()), blockTexture(ModBlocks.BEBRA_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.BEBRA_FENCE_GATE.get()), blockTexture(ModBlocks.BEBRA_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.BEBRA_WALL.get()), blockTexture(ModBlocks.BEBRA_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.BEBRA_DOOR.get()), modLoc("block/bebra_door_bottom"), modLoc("block/bebra_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.BEBRA_TRAPDOOR.get()), modLoc("block/bebra_trapdoor"), true , "cutout");

    }
    private void blockWithITem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
