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
                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
