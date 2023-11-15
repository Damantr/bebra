package net.andruha.bebramod.item;

import net.andruha.bebramod.BebraMod;
import net.andruha.bebramod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier BEBRA = TierSortingRegistry.registerTier(
            new ForgeTier(5,1500,5f,4f,25,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL,() -> Ingredient.of(ModItems.BEBRA.get())),
            new ResourceLocation(BebraMod.MODID, "bebra"), List.of(Tiers.NETHERITE), List.of());

}
