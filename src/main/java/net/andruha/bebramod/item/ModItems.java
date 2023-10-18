package net.andruha.bebramod.item;

import net.andruha.bebramod.BebraMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BebraMod.MODID);
    public static final RegistryObject<Item> BEBRA = ITEMS.register("bebra",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEGA_BEBRA = ITEMS.register("mega_bebra",
            () -> new Item(new Item.Properties()));
    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
