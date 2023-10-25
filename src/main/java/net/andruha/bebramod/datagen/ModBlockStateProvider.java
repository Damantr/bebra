package net.andruha.bebramod.datagen;

import net.andruha.bebramod.BebraMod;
import net.andruha.bebramod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
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

    }
    private void blockWithITem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
