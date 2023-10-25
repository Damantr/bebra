package net.andruha.bebramod.datagen;

import net.andruha.bebramod.BebraMod;
import net.andruha.bebramod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BebraMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BEBRA);
        simpleItem(ModItems.MEGA_BEBRA);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.TRUE_BREAD);
        simpleItem(ModItems.OIL);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BebraMod.MODID,"item/" + item.getId().getPath()));
    }
}
