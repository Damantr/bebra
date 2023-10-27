package net.andruha.bebramod.datagen.loot;

import net.andruha.bebramod.block.ModBlocks;
import net.andruha.bebramod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.BEBRA_BLOCK.get());
        this.dropSelf(ModBlocks.BEBRUN_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());

        this.dropSelf(ModBlocks.BEBRA_STAIRS.get());
        this.dropSelf(ModBlocks.BEBRA_BUTTON.get());
        this.dropSelf(ModBlocks.BEBRA_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BEBRA_TRAPDOOR.get());
        this.dropSelf(ModBlocks.BEBRA_FENCE.get());
        this.dropSelf(ModBlocks.BEBRA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BEBRA_WALL.get());

        this.add(ModBlocks.BEBRA_SLAB.get(),
        block -> createSlabItemTable(ModBlocks.BEBRA_SLAB.get()));
        this.add(ModBlocks.BEBRA_DOOR.get(),
                block -> createDoorTable(ModBlocks.BEBRA_DOOR.get()));


        this.add(ModBlocks.BEBRA_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.BEBRA_ORE.get(), ModItems.BEBRA.get()));

    }
    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(Items.RAW_COPPER)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
