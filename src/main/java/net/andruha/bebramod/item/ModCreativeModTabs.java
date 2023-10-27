package net.andruha.bebramod.item;

import net.andruha.bebramod.BebraMod;
import net.andruha.bebramod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS
            = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BebraMod.MODID);

    public static final RegistryObject<CreativeModeTab> BEBRA_TAB = CREATIVE_MODE_TABS.register("bebra_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BEBRA.get()))
                    .title(Component.translatable("creativetab.bebra_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BEBRA.get());
                        pOutput.accept(ModItems.MEGA_BEBRA.get());
                        pOutput.accept(ModBlocks.BEBRA_BLOCK.get());
                        pOutput.accept(ModBlocks.BEBRUN_BLOCK.get());
                        pOutput.accept(ModBlocks.BEBRA_ORE.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                        pOutput.accept(ModBlocks.BLACKBG.get());
                        pOutput.accept(ModBlocks.A.get());
                        pOutput.accept(ModBlocks.D.get());
                        pOutput.accept(ModBlocks.I.get());
                        pOutput.accept(ModBlocks.S.get());
                        pOutput.accept(ModItems.TRUE_BREAD.get());
                        pOutput.accept(ModItems.OIL.get());
                        pOutput.accept(ModBlocks.BEBRA_DOOR.get());
                        pOutput.accept(ModBlocks.BEBRA_WALL.get());
                        pOutput.accept(ModBlocks.BEBRA_SLAB.get());
                        pOutput.accept(ModBlocks.BEBRA_FENCE.get());
                        pOutput.accept(ModBlocks.BEBRA_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.BEBRA_BUTTON.get());
                        pOutput.accept(ModBlocks.BEBRA_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.BEBRA_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.BEBRA_STAIRS.get());
                        pOutput.accept(ModItems.SWORD.get());
                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
