package com.kyraltre.tretackshop.registry;


import java.util.ArrayList;
import java.util.List;

import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

public class TackShopItems {
    public static final DeferredRegister<Item> ITEMS;

// THIS IS FOR TACK ITEMS THAT __CAN__ BE CRAFTED
    public static final RegistryObject<Item> BUTTERFLY;
    public static final RegistryObject<Item> BUTTERFLY_MONARCH;
//besides this butterfly that is just for the pretty icon <3 we love it <3

    public static final RegistryObject<Item> RAINBOW_INA_BOTTLE;

    // TACK ITEMS

    // DYED TACK
    //public static final RegistryObject<DyedPastureBlanket> PASTURE_BLANKET_DYED;
    public static final RegistryObject<Item> PELHAM_BRIDLE_BLACK;
    public static final RegistryObject<Item> PELHAM_BRIDLE_BROWN;

    // RAINBOW TACK
    public static final RegistryObject<Item> HALTER_RAINBOW;
    public static final RegistryObject<Item> PASTURE_BLANKET_RAINBOW;
    public static final RegistryObject<Item> PASTURE_BLANKET_RAINBOW_ARMORED;
    public static final RegistryObject<Item> ADVENTURE_BLANKET_RAINBOW;
    public static final RegistryObject<Item> ENGLISH_BLANKET_RAINBOW;
    public static final RegistryObject<Item> WESTERN_BLANKET_RAINBOW;
    public static final RegistryObject<Item> ADVENTURE_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<Item> ENGLISH_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<Item> WESTERN_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<Item> ADVENTURE_SADDLE_RAINBOW;
    public static final RegistryObject<Item> WESTERN_SADDLE_RAINBOW;
    public static final RegistryObject<Item> ENGLISH_SADDLE_RAINBOW;
    public static final RegistryObject<Item> ADVENTURE_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<Item> WESTERN_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<Item> ENGLISH_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<Item> QUARTER_SHEET_BLACK_RAINBOW;
    public static final RegistryObject<Item> QUARTER_SHEET_WHITE_RAINBOW;
    public static final RegistryObject<Item> ADVENTURE_BRIDLE_RAINBOW;
    public static final RegistryObject<Item>WESTERN_BRIDLE_RAINBOW;
    public static final RegistryObject<Item> ENGLISH_BRIDLE_RAINBOW;
    public static final RegistryObject<Item> ADVENTURE_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<Item> WESTERN_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<Item> ENGLISH_GIRTH_STRAP_RAINBOW;

    // CRAFTABLE NUMBERED TACK
    public static final List<RegistryObject<Item>> HALTERS;
    public static final List<RegistryObject<Item>> FLYMASKS;
    public static final List<RegistryObject<Item>> PASTURE_BLANKETS;
    public static final List<RegistryObject<Item>> PASTURE_BLANKETS_ARMORED;
    public static final List<RegistryObject<Item>> ADVENTURE_BLANKETS;
    public static final List<RegistryObject<Item>> ENGLISH_BLANKETS;
    public static final List<RegistryObject<Item>> WESTERN_BLANKETS;
    public static final List<RegistryObject<Item>> ADVENTURE_LEG_WRAPS;
    public static final List<RegistryObject<Item>> ENGLISH_LEG_WRAPS;
    public static final List<RegistryObject<Item>> WESTERN_LEG_WRAPS;
    public static final List<RegistryObject<Item>> ADVENTURE_SADDLES;
    public static final List<RegistryObject<Item>> WESTERN_SADDLES;
    public static final List<RegistryObject<Item>> ENGLISH_SADDLES;
    public static final List<RegistryObject<Item>> ADVENTURE_BREAST_COLLARS;
    public static final List<RegistryObject<Item>> WESTERN_BREAST_COLLARS;
    public static final List<RegistryObject<Item>> ENGLISH_BREAST_COLLARS;
    public static final List<RegistryObject<Item>> CLOTH_BREAST_COLLARS;
    public static final List<RegistryObject<Item>> QUARTER_SHEETS_DYED;
    public static final List<RegistryObject<Item>> QUARTER_SHEETS_NUMBERED;
    public static final List<RegistryObject<Item>> ADVENTURE_BRIDLES;
    public static final List<RegistryObject<Item>> WESTERN_BRIDLES;
    public static final List<RegistryObject<Item>> ENGLISH_BRIDLES;
    public static final List<RegistryObject<Item>> CLOTH_BRIDLES;
    public static final List<RegistryObject<Item>>ADVENTURE_GIRTH_STRAPS;
    public static final List<RegistryObject<Item>> WESTERN_GIRTH_STRAPS;
    public static final List<RegistryObject<Item>> ENGLISH_GIRTH_STRAPS;
    public static final List<RegistryObject<Item>> CLOTH_GIRTH_STRAPS;

    public TackShopItems() {
    }
    public static void init(IEventBus eventBus) { ITEMS.register(eventBus); }

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "tretackshop");

        BUTTERFLY = ITEMS.register("butterfly",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        BUTTERFLY_MONARCH = ITEMS.register("butterfly_monarch",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));
        // Listed under award tab since it is not craftable... listed here as it is the mod's icon

        RAINBOW_INA_BOTTLE = ITEMS.register("rainbow_ina_bottle",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TRETACK_TAB)));
        // This is what we use to make the rainbow tack

// TACK ITEMS

    // Dyed Items
//        PASTURE_BLANKET_DYED = ITEMS.register("pasture_blanket_dyed",
//                () -> new DyedPastureBlanket(
//                        "pasture_blanket_dyed", new Item.Properties()
//                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
// ONE OFF TACK
        PELHAM_BRIDLE_BLACK = ITEMS.register("pelham_bridle_black",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        PELHAM_BRIDLE_BROWN = ITEMS.register("pelham_bridle_brown",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));


    // Rainbow Tack
        HALTER_RAINBOW = ITEMS.register("halter_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));

        ADVENTURE_SADDLE_RAINBOW = ITEMS.register("adventure_saddle_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(1)));
        ADVENTURE_BLANKET_RAINBOW = ITEMS.register("adventure_blanket_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        ADVENTURE_BREAST_COLLAR_RAINBOW = ITEMS.register("adventure_breast_collar_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        ADVENTURE_LEG_WRAPS_RAINBOW = ITEMS.register("adventure_leg_wraps_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64)));
        ADVENTURE_BRIDLE_RAINBOW = ITEMS.register("adventure_bridle_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        ADVENTURE_GIRTH_STRAP_RAINBOW = ITEMS.register("adventure_girth_strap_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));

        WESTERN_SADDLE_RAINBOW = ITEMS.register("western_saddle_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(1)));
        WESTERN_BLANKET_RAINBOW = ITEMS.register("western_blanket_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        WESTERN_BREAST_COLLAR_RAINBOW = ITEMS.register("western_breast_collar_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        WESTERN_LEG_WRAPS_RAINBOW = ITEMS.register("western_leg_wraps_rainbow",
                () ->  new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64)));
        WESTERN_BRIDLE_RAINBOW = ITEMS.register("western_bridle_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        WESTERN_GIRTH_STRAP_RAINBOW = ITEMS.register("western_girth_strap_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));

        ENGLISH_SADDLE_RAINBOW = ITEMS.register("english_saddle_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(1)));
        ENGLISH_BLANKET_RAINBOW = ITEMS.register("english_blanket_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        ENGLISH_BREAST_COLLAR_RAINBOW = ITEMS.register("english_breast_collar_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        ENGLISH_LEG_WRAPS_RAINBOW = ITEMS.register("english_leg_wraps_rainbow",
                () -> new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64)));
        ENGLISH_BRIDLE_RAINBOW = ITEMS.register("english_bridle_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        ENGLISH_GIRTH_STRAP_RAINBOW = ITEMS.register("english_girth_strap_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        PASTURE_BLANKET_RAINBOW = ITEMS.register("pasture_blanket_rainbow",
                () -> new Item(
                        new Item.Properties()
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        PASTURE_BLANKET_RAINBOW_ARMORED = ITEMS.register("pasture_blanket_rainbow_armored",
                () -> new Item(
                        (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        QUARTER_SHEET_BLACK_RAINBOW = ITEMS.register("quarter_sheet_black_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));
        QUARTER_SHEET_WHITE_RAINBOW = ITEMS.register("quarter_sheet_white_rainbow",
                () -> new Item(
                        (new Item.Properties())
                                .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16)));



    // Craftable Numbered Tack Items -- 12 Count Items
        HALTERS = new ArrayList<>();
        FLYMASKS = new ArrayList<>();
        PASTURE_BLANKETS = new ArrayList<>();
        PASTURE_BLANKETS_ARMORED = new ArrayList<>();
        ADVENTURE_BLANKETS = new ArrayList<>();
        WESTERN_BLANKETS = new ArrayList<>();
        ENGLISH_BLANKETS = new ArrayList<>();
        ENGLISH_LEG_WRAPS = new ArrayList<>();
        WESTERN_LEG_WRAPS = new ArrayList<>();
        ADVENTURE_LEG_WRAPS = new ArrayList<>();
        ADVENTURE_SADDLES = new ArrayList<>();
        WESTERN_SADDLES = new ArrayList<>();
        ENGLISH_SADDLES = new ArrayList<>();
        ADVENTURE_BREAST_COLLARS = new ArrayList<>();
        WESTERN_BREAST_COLLARS = new ArrayList<>();
        ENGLISH_BREAST_COLLARS = new ArrayList<>();
        CLOTH_BREAST_COLLARS = new ArrayList<>();
        ADVENTURE_BRIDLES = new ArrayList<>();
        WESTERN_BRIDLES = new ArrayList<>();
        ENGLISH_BRIDLES = new ArrayList<>();
        CLOTH_BRIDLES = new ArrayList<>();
        ADVENTURE_GIRTH_STRAPS = new ArrayList<>();
        WESTERN_GIRTH_STRAPS = new ArrayList<>();
        ENGLISH_GIRTH_STRAPS = new ArrayList<>();
        CLOTH_GIRTH_STRAPS = new ArrayList<>();
        QUARTER_SHEETS_NUMBERED = new ArrayList<>();

        int var1 = 13;
        var rContext = new Object() {
            int var2 = 1;
            };

        while (rContext.var2 < var1) {
            //DyeColor color = var0[var2];
            int counter = rContext.var2;
            HALTERS.add(ITEMS.register("halter_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));
            FLYMASKS.add(ITEMS.register("flymask_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));

            ADVENTURE_SADDLES.add(ITEMS.register("adventure_saddle_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(1))
            ));
            ADVENTURE_BLANKETS.add(ITEMS.register("adventure_blanket_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));
            ADVENTURE_BREAST_COLLARS.add(ITEMS.register("adventure_breast_collar_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));
            ADVENTURE_LEG_WRAPS.add(ITEMS.register("adventure_leg_wraps_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64))
            ));
            ADVENTURE_BRIDLES.add(ITEMS.register("adventure_bridle_" + counter, () ->
                    new Item((new Item.Properties())
                            .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64))
            ));
            ADVENTURE_GIRTH_STRAPS.add(ITEMS.register("adventure_girth_strap_" + counter, () ->
                    new Item((new Item.Properties())
                            .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64))
            ));

            WESTERN_SADDLES.add(ITEMS.register("western_saddle_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(1))
            ));
            WESTERN_BLANKETS.add(ITEMS.register("western_blanket_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));
            WESTERN_BREAST_COLLARS.add(ITEMS.register("western_breast_collar_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));
            WESTERN_LEG_WRAPS.add(ITEMS.register("western_leg_wraps_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64))
            ));
            WESTERN_BRIDLES.add(ITEMS.register("western_bridle_" + counter,() ->
                    new Item((new Item.Properties())
                            .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64))
            ));
            WESTERN_GIRTH_STRAPS.add(ITEMS.register("western_girth_strap_" + counter,() ->
                    new Item((new Item.Properties())
                            .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64))
            ));

            ENGLISH_SADDLES.add(ITEMS.register("english_saddle_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(1))
            ));
            ENGLISH_BLANKETS.add(ITEMS.register("english_blanket_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));
            ENGLISH_BREAST_COLLARS.add(ITEMS.register("english_breast_collar_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));
            CLOTH_BREAST_COLLARS.add(ITEMS.register("cloth_breast_collar_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));
            ENGLISH_LEG_WRAPS.add(ITEMS.register("english_leg_wraps_" + counter, () ->
                new Item((new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64))
            ));
            ENGLISH_BRIDLES.add(ITEMS.register("english_bridle_" + counter,() ->
                    new Item((new Item.Properties())
                            .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64))
            ));
            ENGLISH_GIRTH_STRAPS.add(ITEMS.register("english_girth_strap_" + counter,() ->
                    new Item((new Item.Properties())
                            .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64))
            ));

            CLOTH_BRIDLES.add(ITEMS.register("cloth_bridle_" + counter,() ->
                    new Item((new Item.Properties())
                            .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64))
            ));
            CLOTH_GIRTH_STRAPS.add(ITEMS.register("cloth_girth_strap_" + counter,() ->
                    new Item((new Item.Properties())
                            .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(64))
            ));

            QUARTER_SHEETS_NUMBERED.add(ITEMS.register("quarter_sheet_" + counter, () ->
                    new Item(
                            (new Item.Properties())
                            .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));


            PASTURE_BLANKETS.add(ITEMS.register("pasture_blanket_" + counter, () ->
                new Item(
                        (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));
            PASTURE_BLANKETS_ARMORED.add(ITEMS.register("pasture_blanket_" + counter + "_armored", () ->
                new Item(
                        (new Item.Properties())
                        .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));

            ++rContext.var2;
        }
        //DYED TACK ITEMS - Craftable still :3
        QUARTER_SHEETS_DYED = new ArrayList<>();

        DyeColor[] var0 = DyeColor.values();
        int var3 = var0.length;

        for (int var2 = 0; var2 < var3; ++var2) {
            DyeColor color = var0[var2];
            QUARTER_SHEETS_DYED.add(ITEMS.register("quarter_sheet_" + color.getName(), () ->
                    new Item(
                            (new Item.Properties())
                             .tab(TackShopCreativeModTab.TRETACK_TAB).stacksTo(16))
            ));
        }
    }
}
