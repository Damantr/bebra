package net.andruha.bebramod.block;

import net.andruha.bebramod.BebraMod;
import net.andruha.bebramod.block.сustom.SoundBlock;
import net.andruha.bebramod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BebraMod.MODID);

    public static final RegistryObject<Block> BEBRA_BLOCK = registerBlock("bebra_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> BEBRUN_BLOCK = registerBlock("bebrun_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).sound(SoundType.ANVIL)));
    public static final RegistryObject<Block> BEBRA_ORE = registerBlock("bebra_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3000,7000)));
    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> BLACKBG = registerBlock("blackbg",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).sound(SoundType.ANVIL).noLootTable()));
    public static final RegistryObject<Block> A = registerBlock("a",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).sound(SoundType.ANVIL).noLootTable()));
    public static final RegistryObject<Block> D = registerBlock("d",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).sound(SoundType.ANVIL).noLootTable()));
    public static final RegistryObject<Block> I = registerBlock("i",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).sound(SoundType.ANVIL).noLootTable()));

    public static final RegistryObject<Block> S = registerBlock("s",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).sound(SoundType.ANVIL).noLootTable()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn  = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
