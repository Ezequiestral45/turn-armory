package net.ezeq.turnarmory.item;

import net.ezeq.turnarmory.TurnArmory;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STEEL_INGOT = registerItem( "steel_ingot", new Item(new Item.Settings()));
    public static final Item SHADOW_CRYSTAL = registerItem( "shadow_crystal", new Item(new Item.Settings()));
    public static final Item ADEPT_GEM = registerItem( "adept_gem", new Item(new Item.Settings()));
    public static final Item GRIP = registerItem( "grip", new Item(new Item.Settings()));
    public static final Item HILT = registerItem( "hilt", new Item(new Item.Settings()));
    public static final Item HANDLE = registerItem( "handle", new Item(new Item.Settings()));
    public static final Item POLE = registerItem( "pole", new Item(new Item.Settings()));
    public static final Item MASTER_GEM = registerItem( "master_gem", new Item(new Item.Settings()));
    public static final Item DECORATED_GRIP = registerItem( "decorated_grip", new Item(new Item.Settings()));
    public static final Item DECORATED_HILT = registerItem( "decorated_hilt", new Item(new Item.Settings()));
    public static final Item DECORATED_HANDLE = registerItem( "decorated_handle", new Item(new Item.Settings()));
    public static final Item DECORATED_POLE = registerItem( "decorated_pole", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TurnArmory.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TurnArmory.LOGGER.info("Looking for my Whetstone in " + TurnArmory.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
           fabricItemGroupEntries.add(STEEL_INGOT);
           fabricItemGroupEntries.add(SHADOW_CRYSTAL);
           fabricItemGroupEntries.add(ADEPT_GEM);
           fabricItemGroupEntries.add(MASTER_GEM);
           fabricItemGroupEntries.add(GRIP);
           fabricItemGroupEntries.add(HILT);
           fabricItemGroupEntries.add(HANDLE);
           fabricItemGroupEntries.add(POLE);
           fabricItemGroupEntries.add(DECORATED_GRIP);
           fabricItemGroupEntries.add(DECORATED_HILT);
           fabricItemGroupEntries.add(DECORATED_HANDLE);
           fabricItemGroupEntries.add(DECORATED_POLE);
        });
    }
}
