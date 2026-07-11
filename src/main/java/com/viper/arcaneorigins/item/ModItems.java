package com.viper.arcaneorigins.item;

import com.viper.arcaneorigins.ArcaneOrigins;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.core.Registry;

public class ModItems {

    public static final Item ARCANE_WAND = new Item(new Item.Properties());

    public static void register() {
        Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath(ArcaneOrigins.MOD_ID, "arcane_wand"),
                ARCANE_WAND
        );

        ArcaneOrigins.LOGGER.info("Registered Arcane Origins items!");
    }
}
