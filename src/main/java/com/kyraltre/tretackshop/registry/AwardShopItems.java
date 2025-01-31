package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.TackBoxBlockItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;
import java.util.ArrayList;
import java.util.List;

import static com.kyraltre.tretackshop.config.TackShopCommonConfigs.*;

public class AwardShopItems {
    public static final DeferredRegister<Item> ITEMS;

// THIS IS FOR AWARD ITEMS THAT CAN NOT BE CRAFTED

    public static final List<RegistryObject<Item>> AWARD_FLAGS;
    public static final RegistryObject<Item> FLAG_MONARCH;
    public static final RegistryObject<Item> FLAG_MORPHO;
    public static final RegistryObject<Item> FLAG_HOUND;

// BUTTERFLY TACK ITEMS - MORPHO
    public static final RegistryObject<HalterItem> HALTER_MORPHO;
    public static final RegistryObject<HalterItem> FLYMASK_MORPHO;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_MORPHO;
    public static final RegistryObject<AdventureBlanketItem> ADVENTURE_BLANKET_MORPHO;
    public static final RegistryObject<EnglishBlanketItem> ENGLISH_BLANKET_MORPHO;
    public static final RegistryObject<WesternBlanketItem> WESTERN_BLANKET_MORPHO;
    public static final RegistryObject<AdventureLegWraps> ADVENTURE_LEG_WRAPS_MORPHO;
    public static final RegistryObject<LegWrapsItem> ENGLISH_LEG_WRAPS_MORPHO;
    public static final RegistryObject<LegWrapsItem> WESTERN_LEG_WRAPS_MORPHO;
    public static final RegistryObject<AdventureSaddleItem> ADVENTURE_SADDLE_MORPHO;
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_MORPHO;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_MORPHO;
    public static final RegistryObject<AdventureBreastCollarItem> ADVENTURE_BREAST_COLLAR_MORPHO;
    public static final RegistryObject<WesternBreastCollarItem> WESTERN_BREAST_COLLAR_MORPHO;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_MORPHO;
    public static final RegistryObject<AdventureBreastCollarItem> QUARTER_SHEET_MORPHO;
    public static final RegistryObject<AdventureBridleItem> ADVENTURE_BRIDLE_MORPHO;
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_MORPHO;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_MORPHO;
    public static final RegistryObject<AdventureGirthStrapItem> ADVENTURE_GIRTH_STRAP_MORPHO;
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_MORPHO;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_MORPHO;
    public static final RegistryObject<SWEMHorseArmorItem> CLOTH_HORSE_ARMOR_MORPHO;
    public static final RegistryObject<SaddlebagItem> SADDLE_BAG_MORPHO;
    public static final RegistryObject<EnglishBridleItem> BITLESS_BRIDLE_MORPHO;
    public static final RegistryObject<WesternBlanketItem> BAREBACK_BLANKET_MORPHO;
    
// BUTTERFLY TACK ITEMS - MONARCH
    public static final RegistryObject<HalterItem> HALTER_MONARCH;
    public static final RegistryObject<HalterItem> FLYMASK_MONARCH;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_MONARCH;
    public static final RegistryObject<AdventureBlanketItem> ADVENTURE_BLANKET_MONARCH;
    public static final RegistryObject<EnglishBlanketItem> ENGLISH_BLANKET_MONARCH;
    public static final RegistryObject<WesternBlanketItem> WESTERN_BLANKET_MONARCH;
    public static final RegistryObject<AdventureLegWraps> ADVENTURE_LEG_WRAPS_MONARCH;
    public static final RegistryObject<LegWrapsItem> ENGLISH_LEG_WRAPS_MONARCH;
    public static final RegistryObject<LegWrapsItem> WESTERN_LEG_WRAPS_MONARCH;
    public static final RegistryObject<AdventureSaddleItem> ADVENTURE_SADDLE_MONARCH;
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_MONARCH;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_MONARCH;
    public static final RegistryObject<AdventureBreastCollarItem> ADVENTURE_BREAST_COLLAR_MONARCH;
    public static final RegistryObject<WesternBreastCollarItem> WESTERN_BREAST_COLLAR_MONARCH;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_MONARCH;
    public static final RegistryObject<AdventureBreastCollarItem> QUARTER_SHEET_MONARCH;
    public static final RegistryObject<AdventureBridleItem> ADVENTURE_BRIDLE_MONARCH;
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_MONARCH;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_MONARCH;
    public static final RegistryObject<AdventureGirthStrapItem> ADVENTURE_GIRTH_STRAP_MONARCH;
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_MONARCH;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_MONARCH;
    public static final RegistryObject<SWEMHorseArmorItem> CLOTH_HORSE_ARMOR_MONARCH;
    public static final RegistryObject<SaddlebagItem> SADDLE_BAG_MONARCH;

    public static final RegistryObject<EnglishBridleItem> BITLESS_BRIDLE_MONARCH;
    public static final RegistryObject<WesternBlanketItem> BAREBACK_BLANKET_MONARCH;

    // HOUND TACK
    public static final RegistryObject<HalterItem> HALTER_HOUND;
    public static final RegistryObject<HalterItem> FLYMASK_HOUND;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_HOUND;
    public static final RegistryObject<AdventureBlanketItem> ADVENTURE_BLANKET_HOUND;
    public static final RegistryObject<EnglishBlanketItem> ENGLISH_BLANKET_HOUND;
    public static final RegistryObject<WesternBlanketItem> WESTERN_BLANKET_HOUND;
    public static final RegistryObject<AdventureLegWraps> ADVENTURE_LEG_WRAPS_HOUND;
    public static final RegistryObject<LegWrapsItem> ENGLISH_LEG_WRAPS_HOUND;
    public static final RegistryObject<LegWrapsItem> WESTERN_LEG_WRAPS_HOUND;
    public static final RegistryObject<AdventureSaddleItem> ADVENTURE_SADDLE_HOUND;
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_HOUND;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_HOUND;
    public static final RegistryObject<AdventureBreastCollarItem> ADVENTURE_BREAST_COLLAR_HOUND;
    public static final RegistryObject<WesternBreastCollarItem> WESTERN_BREAST_COLLAR_HOUND;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_HOUND;
    public static final RegistryObject<AdventureBreastCollarItem> QUARTER_SHEET_HOUND;
    public static final RegistryObject<AdventureBridleItem> ADVENTURE_BRIDLE_HOUND;
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_HOUND;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_HOUND;
    public static final RegistryObject<AdventureGirthStrapItem> ADVENTURE_GIRTH_STRAP_HOUND;
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_HOUND;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_HOUND;
    public static final RegistryObject<SWEMHorseArmorItem> CLOTH_HORSE_ARMOR_HOUND;
    public static final RegistryObject<SaddlebagItem> SADDLE_BAG_HOUND;

    public static final RegistryObject<EnglishBridleItem> BITLESS_BRIDLE_HOUND;
    public static final RegistryObject<WesternBlanketItem> BAREBACK_BLANKET_HOUND;

// RETEXTURING TACK ITEMS
    public static final List<RegistryObject<HalterItem>> AWARD_HALTERS;
    public static final List<RegistryObject<HalterItem>> AWARD_FLYMASKS;
    public static final List<RegistryObject<PastureBlanketItem>> AWARD_PASTURE_BLANKETS;
    public static final List<RegistryObject<PastureBlanketItem>> AWARD_PASTURE_BLANKETS_ARMORED;
    public static final List<RegistryObject<AdventureBlanketItem>> AWARD_ADVENTURE_BLANKETS;
    public static final List<RegistryObject<EnglishBlanketItem>> AWARD_ENGLISH_BLANKETS;
    public static final List<RegistryObject<WesternBlanketItem>> AWARD_WESTERN_BLANKETS;
    public static final List<RegistryObject<AdventureLegWraps>> AWARD_ADVENTURE_LEG_WRAPS;
    public static final List<RegistryObject<LegWrapsItem>> AWARD_ENGLISH_LEG_WRAPS;
    public static final List<RegistryObject<LegWrapsItem>> AWARD_WESTERN_LEG_WRAPS;
    public static final List<RegistryObject<AdventureSaddleItem>> AWARD_ADVENTURE_SADDLES;
    public static final List<RegistryObject<WesternSaddleItem>> AWARD_WESTERN_SADDLES;
    public static final List<RegistryObject<EnglishSaddleItem>> AWARD_ENGLISH_SADDLES;
    public static final List<RegistryObject<AdventureBreastCollarItem>> AWARD_ADVENTURE_BREAST_COLLARS;
    public static final List<RegistryObject<WesternBreastCollarItem>> AWARD_WESTERN_BREAST_COLLARS;
    public static final List<RegistryObject<EnglishBreastCollar>> AWARD_ENGLISH_BREAST_COLLARS;
    public static final List<RegistryObject<AdventureBreastCollarItem>> AWARD_QUARTER_SHEETS;
    public static final List<RegistryObject<AdventureBridleItem>> AWARD_ADVENTURE_BRIDLES;
    public static final List<RegistryObject<WesternBridleItem>> AWARD_WESTERN_BRIDLES;
    public static final List<RegistryObject<EnglishBridleItem>> AWARD_ENGLISH_BRIDLES;
    public static final List<RegistryObject<AdventureGirthStrapItem>> AWARD_ADVENTURE_GIRTH_STRAPS;
    public static final List<RegistryObject<WesternGirthStrapItem>> AWARD_WESTERN_GIRTH_STRAPS;
    public static final List<RegistryObject<EnglishGirthStrap>> AWARD_ENGLISH_GIRTH_STRAPS;
    public static final List<RegistryObject<SaddlebagItem>> AWARD_SADDLE_BAGS;
    public static final List<RegistryObject<SWEMHorseArmorItem>> AWARD_CLOTH_ARMOR;


// AWARD RIBBONS AND TROPHIES
    public static  final RegistryObject<Item> RIBBON_THREE_TAILS_GRAND;
    public static  final RegistryObject<Item> RIBBON_THREE_TAILS_RESERVE;
    public static final List<RegistryObject<Item>> RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> ROSETTE;
    public static final List<RegistryObject<Item>> TRE_RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> TRE_RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> TRE_RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> TRE_ROSETTE;

    public static final RegistryObject<Item> MORPHO_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> MORPHO_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> MORPHO_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> MORPHO_ROSETTE;
    public static final RegistryObject<Item> MONARCH_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> MONARCH_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> MONARCH_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> MONARCH_ROSETTE;
    public static final RegistryObject<Item> HOUND_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> HOUND_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> HOUND_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> HOUND_ROSETTE;
    public static final RegistryObject<Item> FIRST_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> FIRST_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> FIRST_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> FIRST_ROSETTE;
    public static final RegistryObject<Item> SECOND_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> SECOND_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> SECOND_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> SECOND_ROSETTE;
    public static final RegistryObject<Item> THIRD_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> THIRD_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> THIRD_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> THIRD_ROSETTE;
    public static final RegistryObject<Item> RAINBOW_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> RAINBOW_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> RAINBOW_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> RAINBOW_ROSETTE;
    public static final RegistryObject<Item> TROPHY_1;
    public static final RegistryObject<Item> TROPHY_2;
    public static final RegistryObject<Item> TROPHY_3;
    public static final RegistryObject<Item> MEDAL_1;
    public static final RegistryObject<Item> MEDAL_2;
    public static final RegistryObject<Item> MEDAL_3;
    public static final RegistryObject<Item> FLORAL_GOLD;
    public static final RegistryObject<Item> FLORAL_SILVER;
    public static final RegistryObject<Item> FLORAL_BRONZE;
    public static final RegistryObject<Item> SUN_TROPHY;
    public static final RegistryObject<Item> MOON_TROPHY;



    public AwardShopItems() {
    }
    public static void init(IEventBus eventBus) { ITEMS.register(eventBus); }

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "tretackshop");
        
// TACK ITEMS
    // BUTTERFLY - MORPHO -- Uncraftable Blue Morpho Tack
        HALTER_MORPHO = ITEMS.register("halter_morpho",
                () -> new HalterItem("halter_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        FLYMASK_MORPHO = ITEMS.register("flymask_morpho",
                () -> new HalterItem("flymask_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        ADVENTURE_SADDLE_MORPHO = ITEMS.register("adventure_saddle_morpho",
                () -> new AdventureSaddleItem("adventure_saddle_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(1)));
        ADVENTURE_BLANKET_MORPHO = ITEMS.register("adventure_blanket_morpho",
                () -> new AdventureBlanketItem("adventure_blanket_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ADVENTURE_BREAST_COLLAR_MORPHO = ITEMS.register("adventure_breast_collar_morpho",
                () -> new AdventureBreastCollarItem("adventure_breast_collar_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ADVENTURE_LEG_WRAPS_MORPHO = ITEMS.register("adventure_leg_wraps_morpho",
                () -> new AdventureLegWraps("adventure_leg_wraps_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64)));
        ADVENTURE_BRIDLE_MORPHO = ITEMS.register("adventure_bridle_morpho",
                () -> new AdventureBridleItem("adventure_bridle_morpho", "adventure_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ADVENTURE_GIRTH_STRAP_MORPHO = ITEMS.register("adventure_girth_strap_morpho",
                () -> new AdventureGirthStrapItem("adventure_girth_strap_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        CLOTH_HORSE_ARMOR_MORPHO = ITEMS.register("cloth_horse_armor_morpho",
                () -> new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.CLOTH, 10, "cloth_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        SADDLE_BAG_MORPHO = ITEMS.register("saddle_bag_morpho",
                () -> new SaddlebagItem("saddle_bag_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        WESTERN_SADDLE_MORPHO = ITEMS.register("western_saddle_morpho",
                () -> new WesternSaddleItem("western_saddle_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(1)));
        WESTERN_BLANKET_MORPHO = ITEMS.register("western_blanket_morpho",
                () -> new WesternBlanketItem("western_blanket_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        WESTERN_BREAST_COLLAR_MORPHO = ITEMS.register("western_breast_collar_morpho",
                () -> new WesternBreastCollarItem("western_breast_collar_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        WESTERN_LEG_WRAPS_MORPHO = ITEMS.register("western_leg_wraps_morpho",
                () ->  new WesternLegWraps("western_leg_wraps_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64)));
        WESTERN_BRIDLE_MORPHO = ITEMS.register("western_bridle_morpho",
                () -> new WesternBridleItem("western_bridle_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        WESTERN_GIRTH_STRAP_MORPHO = ITEMS.register("western_girth_strap_morpho",
                () -> new WesternGirthStrapItem("western_girth_strap_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        ENGLISH_SADDLE_MORPHO = ITEMS.register("english_saddle_morpho",
                () -> new EnglishSaddleItem("english_saddle_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(1)));
        ENGLISH_BLANKET_MORPHO = ITEMS.register("english_blanket_morpho",
                () -> new EnglishBlanketItem("english_blanket_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ENGLISH_BREAST_COLLAR_MORPHO = ITEMS.register("english_breast_collar_morpho",
                () -> new EnglishBreastCollar("english_breast_collar_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ENGLISH_LEG_WRAPS_MORPHO = ITEMS.register("english_leg_wraps_morpho",
                () -> new EnglishLegWraps("english_leg_wraps_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64)));
        ENGLISH_BRIDLE_MORPHO = ITEMS.register("english_bridle_morpho",
                () -> new EnglishBridleItem("english_bridle_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ENGLISH_GIRTH_STRAP_MORPHO = ITEMS.register("english_girth_strap_morpho",
                () -> new EnglishGirthStrap("english_girth_strap_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        BITLESS_BRIDLE_MORPHO = ITEMS.register("english_bridle_bitless_morpho",
                () -> new EnglishBridleItem("english_bridle_bitless_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        BAREBACK_BLANKET_MORPHO = ITEMS.register("bareback_blanket_morpho",
                () -> new WesternBlanketItem("bareback_blanket_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        PASTURE_BLANKET_MORPHO = ITEMS.register("pasture_blanket_morpho",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_morpho", new Item.Properties()
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        QUARTER_SHEET_MORPHO = ITEMS.register("quarter_sheet_morpho",
                () -> new AdventureBreastCollarItem("quarter_sheet_morpho", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        FLAG_MORPHO = ITEMS.register("flag_morpho", () ->
                new Item((new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))));


    //BUTTERFLY - MONARCH -- Uncraftable Yellow Monarch Tack
        HALTER_MONARCH = ITEMS.register("halter_monarch",
                () -> new HalterItem("halter_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        FLYMASK_MONARCH = ITEMS.register("flymask_monarch",
                () -> new HalterItem("flymask_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        ADVENTURE_SADDLE_MONARCH = ITEMS.register("adventure_saddle_monarch",
                () -> new AdventureSaddleItem("adventure_saddle_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(1)));
        ADVENTURE_BLANKET_MONARCH = ITEMS.register("adventure_blanket_monarch",
                () -> new AdventureBlanketItem("adventure_blanket_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ADVENTURE_BREAST_COLLAR_MONARCH = ITEMS.register("adventure_breast_collar_monarch",
                () -> new AdventureBreastCollarItem("adventure_breast_collar_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ADVENTURE_LEG_WRAPS_MONARCH = ITEMS.register("adventure_leg_wraps_monarch",
                () -> new AdventureLegWraps("adventure_leg_wraps_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64)));
        ADVENTURE_BRIDLE_MONARCH = ITEMS.register("adventure_bridle_monarch",
                () -> new AdventureBridleItem("adventure_bridle_monarch", "adventure_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ADVENTURE_GIRTH_STRAP_MONARCH = ITEMS.register("adventure_girth_strap_monarch",
                () -> new AdventureGirthStrapItem("adventure_girth_strap_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        CLOTH_HORSE_ARMOR_MONARCH = ITEMS.register("cloth_horse_armor_monarch",
                () -> new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.CLOTH, 10, "cloth_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        SADDLE_BAG_MONARCH = ITEMS.register("saddle_bag_monarch",
                () -> new SaddlebagItem("saddle_bag_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        WESTERN_SADDLE_MONARCH = ITEMS.register("western_saddle_monarch",
                () -> new WesternSaddleItem("western_saddle_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(1)));
        WESTERN_BLANKET_MONARCH = ITEMS.register("western_blanket_monarch",
                () -> new WesternBlanketItem("western_blanket_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        WESTERN_BREAST_COLLAR_MONARCH = ITEMS.register("western_breast_collar_monarch",
                () -> new WesternBreastCollarItem("western_breast_collar_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        WESTERN_LEG_WRAPS_MONARCH = ITEMS.register("western_leg_wraps_monarch",
                () ->  new WesternLegWraps("western_leg_wraps_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64)));
        WESTERN_BRIDLE_MONARCH = ITEMS.register("western_bridle_monarch",
                () -> new WesternBridleItem("western_bridle_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        WESTERN_GIRTH_STRAP_MONARCH = ITEMS.register("western_girth_strap_monarch",
                () -> new WesternGirthStrapItem("western_girth_strap_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        ENGLISH_SADDLE_MONARCH = ITEMS.register("english_saddle_monarch",
                () -> new EnglishSaddleItem("english_saddle_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(1)));
        ENGLISH_BLANKET_MONARCH = ITEMS.register("english_blanket_monarch",
                () -> new EnglishBlanketItem("english_blanket_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ENGLISH_BREAST_COLLAR_MONARCH = ITEMS.register("english_breast_collar_monarch",
                () -> new EnglishBreastCollar("english_breast_collar_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ENGLISH_LEG_WRAPS_MONARCH = ITEMS.register("english_leg_wraps_monarch",
                () -> new EnglishLegWraps("english_leg_wraps_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64)));
        ENGLISH_BRIDLE_MONARCH = ITEMS.register("english_bridle_monarch",
                () -> new EnglishBridleItem("english_bridle_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ENGLISH_GIRTH_STRAP_MONARCH = ITEMS.register("english_girth_strap_monarch",
                () -> new EnglishGirthStrap("english_girth_strap_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        BITLESS_BRIDLE_MONARCH = ITEMS.register("english_bridle_bitless_monarch",
                () -> new EnglishBridleItem("english_bridle_bitless_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        BAREBACK_BLANKET_MONARCH = ITEMS.register("bareback_blanket_monarch",
                () -> new WesternBlanketItem("bareback_blanket_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));



        PASTURE_BLANKET_MONARCH = ITEMS.register("pasture_blanket_monarch",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_monarch", new Item.Properties()
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        QUARTER_SHEET_MONARCH = ITEMS.register("quarter_sheet_monarch",
                () -> new AdventureBreastCollarItem("quarter_sheet_monarch", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        FLAG_MONARCH = ITEMS.register("flag_monarch", () ->
                new Item((new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))));

        // Hound Tack
        HALTER_HOUND = ITEMS.register("halter_hound",
                () -> new HalterItem("halter_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        FLYMASK_HOUND = ITEMS.register("flymask_hound",
                () -> new HalterItem("flymask_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        ADVENTURE_SADDLE_HOUND = ITEMS.register("adventure_saddle_hound",
                () -> new AdventureSaddleItem("adventure_saddle_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(1)));
        ADVENTURE_BLANKET_HOUND = ITEMS.register("adventure_blanket_hound",
                () -> new AdventureBlanketItem("adventure_blanket_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ADVENTURE_BREAST_COLLAR_HOUND = ITEMS.register("adventure_breast_collar_hound",
                () -> new AdventureBreastCollarItem("adventure_breast_collar_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ADVENTURE_LEG_WRAPS_HOUND = ITEMS.register("adventure_leg_wraps_hound",
                () -> new AdventureLegWraps("adventure_leg_wraps_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64)));
        ADVENTURE_BRIDLE_HOUND = ITEMS.register("adventure_bridle_hound",
                () -> new AdventureBridleItem("adventure_bridle_hound", "adventure_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ADVENTURE_GIRTH_STRAP_HOUND = ITEMS.register("adventure_girth_strap_hound",
                () -> new AdventureGirthStrapItem("adventure_girth_strap_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        CLOTH_HORSE_ARMOR_HOUND = ITEMS.register("cloth_horse_armor_hound",
                () -> new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.CLOTH, 10, "cloth_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        SADDLE_BAG_HOUND = ITEMS.register("saddle_bag_hound",
                () -> new SaddlebagItem("saddle_bag_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        WESTERN_SADDLE_HOUND = ITEMS.register("western_saddle_hound",
                () -> new WesternSaddleItem("western_saddle_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(1)));
        WESTERN_BLANKET_HOUND = ITEMS.register("western_blanket_hound",
                () -> new WesternBlanketItem("western_blanket_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        WESTERN_BREAST_COLLAR_HOUND = ITEMS.register("western_breast_collar_hound",
                () -> new WesternBreastCollarItem("western_breast_collar_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        WESTERN_LEG_WRAPS_HOUND = ITEMS.register("western_leg_wraps_hound",
                () ->  new WesternLegWraps("western_leg_wraps_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64)));
        WESTERN_BRIDLE_HOUND = ITEMS.register("western_bridle_hound",
                () -> new WesternBridleItem("western_bridle_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        WESTERN_GIRTH_STRAP_HOUND = ITEMS.register("western_girth_strap_hound",
                () -> new WesternGirthStrapItem("western_girth_strap_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        ENGLISH_SADDLE_HOUND = ITEMS.register("english_saddle_hound",
                () -> new EnglishSaddleItem("english_saddle_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(1)));
        ENGLISH_BLANKET_HOUND = ITEMS.register("english_blanket_hound",
                () -> new EnglishBlanketItem("english_blanket_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ENGLISH_BREAST_COLLAR_HOUND = ITEMS.register("english_breast_collar_hound",
                () -> new EnglishBreastCollar("english_breast_collar_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ENGLISH_LEG_WRAPS_HOUND = ITEMS.register("english_leg_wraps_hound",
                () -> new EnglishLegWraps("english_leg_wraps_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64)));
        ENGLISH_BRIDLE_HOUND = ITEMS.register("english_bridle_hound",
                () -> new EnglishBridleItem("english_bridle_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        ENGLISH_GIRTH_STRAP_HOUND = ITEMS.register("english_girth_strap_hound",
                () -> new EnglishGirthStrap("english_girth_strap_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));

        BITLESS_BRIDLE_HOUND = ITEMS.register("english_bridle_bitless_hound",
                () -> new EnglishBridleItem("english_bridle_bitless_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        BAREBACK_BLANKET_HOUND = ITEMS.register("bareback_blanket_hound",
                () -> new WesternBlanketItem("bareback_blanket_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));



        PASTURE_BLANKET_HOUND = ITEMS.register("pasture_blanket_hound",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_hound", new Item.Properties()
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        QUARTER_SHEET_HOUND = ITEMS.register("quarter_sheet_hound",
                () -> new AdventureBreastCollarItem("quarter_sheet_hound", (new Item.Properties())
                        .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16)));
        FLAG_HOUND = ITEMS.register("flag_hound", () ->
                new Item((new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))));



    // AWARD - Uncraftable Numbered Tack Items -- 14 Count Items
        AWARD_PASTURE_BLANKETS = new ArrayList<>();
        AWARD_PASTURE_BLANKETS_ARMORED = new ArrayList<>();
        AWARD_HALTERS = new ArrayList<>();
        AWARD_FLYMASKS = new ArrayList<>();
        AWARD_ADVENTURE_BLANKETS = new ArrayList<>();
        AWARD_WESTERN_BLANKETS = new ArrayList<>();
        AWARD_ENGLISH_BLANKETS = new ArrayList<>();
        AWARD_ENGLISH_LEG_WRAPS = new ArrayList<>();
        AWARD_WESTERN_LEG_WRAPS = new ArrayList<>();
        AWARD_ADVENTURE_LEG_WRAPS = new ArrayList<>();
        AWARD_ADVENTURE_SADDLES = new ArrayList<>();
        AWARD_WESTERN_SADDLES = new ArrayList<>();
        AWARD_ENGLISH_SADDLES = new ArrayList<>();
        AWARD_ADVENTURE_BREAST_COLLARS = new ArrayList<>();
        AWARD_WESTERN_BREAST_COLLARS = new ArrayList<>();
        AWARD_ENGLISH_BREAST_COLLARS = new ArrayList<>();
        AWARD_ADVENTURE_BRIDLES = new ArrayList<>();
        AWARD_WESTERN_BRIDLES = new ArrayList<>();
        AWARD_ENGLISH_BRIDLES = new ArrayList<>();
        AWARD_ADVENTURE_GIRTH_STRAPS = new ArrayList<>();
        AWARD_WESTERN_GIRTH_STRAPS = new ArrayList<>();
        AWARD_ENGLISH_GIRTH_STRAPS = new ArrayList<>();
        AWARD_QUARTER_SHEETS = new ArrayList<>();
        AWARD_FLAGS = new ArrayList<>();
        AWARD_SADDLE_BAGS = new ArrayList<>();
        AWARD_CLOTH_ARMOR = new ArrayList<>();
        TRE_RIBBON_THREE_TAILS = new ArrayList<>();
        TRE_RIBBON_TWO_TAILS = new ArrayList<>();
        TRE_RIBBON_ONE_TAIL = new ArrayList<>();
        TRE_ROSETTE = new ArrayList<>();

        int var534 = 14;
    //ADVENTURE TACK
        for(int var1 = 0; var1 < var534; ++var1) {
            int counter = var1+1;
            AWARD_ADVENTURE_SADDLES.add(ITEMS.register("award_adventure_saddle_" + counter, () ->
                    new AdventureSaddleItem("award_adventure_saddle_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ADVENTURE_BLANKETS.add(ITEMS.register("award_adventure_blanket_" + counter,
                    () -> new AdventureBlanketItem("award_adventure_blanket_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ADVENTURE_BREAST_COLLARS.add(ITEMS.register("award_adventure_breast_collar_" + counter,
                    () -> new AdventureBreastCollarItem("award_adventure_breast_collar_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ADVENTURE_LEG_WRAPS.add(ITEMS.register("award_adventure_leg_wraps_" + counter,
                    () -> new AdventureLegWraps("award_adventure_leg_wraps_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64))
            ));
            AWARD_ADVENTURE_BRIDLES .add(ITEMS.register("award_adventure_bridle_"+ counter,
                    () -> new AdventureBridleItem("award_adventure_bridle_"+ counter, "award_adventure_"+ counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ADVENTURE_GIRTH_STRAPS .add(ITEMS.register("award_adventure_girth_strap_"+ counter,
                    () -> new AdventureGirthStrapItem("award_adventure_girth_strap_"+ counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
        }


    //SADDLE BAGS AND CLOTH ARMOR
        for(int var1 = 0; var1 < var534; ++var1) {
            int counter = var1+1;
            AWARD_CLOTH_ARMOR.add(ITEMS.register("award_cloth_horse_armor_" + counter,
                    () -> new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.CLOTH, 10, "award_cloth_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_SADDLE_BAGS.add(ITEMS.register("award_saddle_bag_" + counter, () ->
                    new SaddlebagItem("award_saddle_bag_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
        }

    //WESTERN TACK
        for(int var1 = 0; var1 < var534; ++var1) {
            int counter = var1+1;
            AWARD_WESTERN_SADDLES.add(ITEMS.register("award_western_saddle_" + counter,
                    () -> new WesternSaddleItem("award_western_saddle_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_WESTERN_BLANKETS.add(ITEMS.register("award_western_blanket_" + counter,
                    () -> new WesternBlanketItem("award_western_blanket_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_WESTERN_BREAST_COLLARS.add(ITEMS.register("award_western_breast_collar_" + counter,
                    () -> new WesternBreastCollarItem("award_western_breast_collar_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_WESTERN_LEG_WRAPS.add(ITEMS.register("award_western_leg_wraps_" + counter,
                    () -> new WesternLegWraps("award_western_leg_wraps_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64))
            ));
            AWARD_WESTERN_BRIDLES.add(ITEMS.register("award_western_bridle_" + counter,
                    () -> new WesternBridleItem("award_western_bridle_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_WESTERN_GIRTH_STRAPS.add(ITEMS.register("award_western_girth_strap_" + counter,
                    () -> new WesternGirthStrapItem("award_western_girth_strap_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
        }

    //ENGLISH TACK
        for(int var1 = 0; var1 < var534; ++var1) {
            int counter = var1+1;
            AWARD_ENGLISH_SADDLES.add(ITEMS.register("award_english_saddle_" + counter,
                    () -> new EnglishSaddleItem("award_english_saddle_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ENGLISH_BLANKETS.add(ITEMS.register("award_english_blanket_" + counter,
                    () -> new EnglishBlanketItem("award_english_blanket_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ENGLISH_BREAST_COLLARS.add(ITEMS.register("award_english_breast_collar_" + counter,
                    () -> new EnglishBreastCollar("award_english_breast_collar_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ENGLISH_LEG_WRAPS.add(ITEMS.register("award_english_leg_wraps_" + counter,
                    () -> new EnglishLegWraps("award_english_leg_wraps_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(64))
            ));
            AWARD_ENGLISH_BRIDLES.add(ITEMS.register("award_english_bridle_" + counter,
                    () -> new EnglishBridleItem("award_english_bridle_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_ENGLISH_GIRTH_STRAPS.add(ITEMS.register("award_english_girth_strap_" + counter,
                    () -> new EnglishGirthStrap("award_english_girth_strap_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
        }

    //PADDOCK TACK
        for(int var1 = 0; var1 < var534; ++var1) {
            int counter = var1 + 1;
            AWARD_HALTERS.add(ITEMS.register("award_halter_" + counter,
                    () -> new HalterItem("award_halter_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_FLYMASKS.add(ITEMS.register("award_flymask_" + counter,
                    () -> new HalterItem("award_flymask_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_QUARTER_SHEETS.add(ITEMS.register("award_quarter_sheet_" + counter,
                    () -> new AdventureBreastCollarItem("award_quarter_sheet_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_PASTURE_BLANKETS.add(ITEMS.register("award_pasture_blanket_" + counter,
                    () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "award_pasture_blanket_" + counter, (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
            AWARD_PASTURE_BLANKETS_ARMORED.add(ITEMS.register("award_pasture_blanket_" + counter + "_armored",
                    () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                            "award_pasture_blanket_" + counter + "_armored", (new Item.Properties())
                            .tab(TackShopCreativeModTab.TREAWARD_TAB).stacksTo(16))
            ));
        }



    // FLAGS
        for(int var1 = 1; var1 < 15; ++var1) {
            AWARD_FLAGS.add(ITEMS.register("award_flag_" + var1, () ->
                    new Item((new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)))));
        }


// AWARD ITEMS

        MORPHO_RIBBON_THREE_TAILS = ITEMS.register("ribbon_three_tails_morpho",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        MORPHO_RIBBON_TWO_TAILS = ITEMS.register("ribbon_two_tails_morpho",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        MORPHO_RIBBON_ONE_TAIL = ITEMS.register("ribbon_one_tail_morpho",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        MORPHO_ROSETTE = ITEMS.register("rosette_morpho",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));

        MONARCH_RIBBON_THREE_TAILS = ITEMS.register("ribbon_three_tails_monarch",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        MONARCH_RIBBON_TWO_TAILS = ITEMS.register("ribbon_two_tails_monarch",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        MONARCH_RIBBON_ONE_TAIL = ITEMS.register("ribbon_one_tail_monarch",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        MONARCH_ROSETTE = ITEMS.register("rosette_monarch",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));

        HOUND_RIBBON_THREE_TAILS = ITEMS.register("ribbon_three_tails_hound",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        HOUND_RIBBON_TWO_TAILS = ITEMS.register("ribbon_two_tails_hound",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        HOUND_RIBBON_ONE_TAIL = ITEMS.register("ribbon_one_tail_hound",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        HOUND_ROSETTE = ITEMS.register("rosette_hound",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));

        RAINBOW_RIBBON_THREE_TAILS = ITEMS.register("ribbon_three_tails_rainbow",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        RAINBOW_RIBBON_TWO_TAILS = ITEMS.register("ribbon_two_tails_rainbow",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        RAINBOW_RIBBON_ONE_TAIL = ITEMS.register("ribbon_one_tail_rainbow",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        RAINBOW_ROSETTE = ITEMS.register("rosette_rainbow",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));

        FIRST_RIBBON_THREE_TAILS = ITEMS.register("ribbon_three_tails_first",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        FIRST_RIBBON_TWO_TAILS = ITEMS.register("ribbon_two_tails_first",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        FIRST_RIBBON_ONE_TAIL = ITEMS.register("ribbon_one_tail_first",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        FIRST_ROSETTE = ITEMS.register("rosette_first",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));

        SECOND_RIBBON_THREE_TAILS = ITEMS.register("ribbon_three_tails_second",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        SECOND_RIBBON_TWO_TAILS = ITEMS.register("ribbon_two_tails_second",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        SECOND_RIBBON_ONE_TAIL = ITEMS.register("ribbon_one_tail_second",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        SECOND_ROSETTE = ITEMS.register("rosette_second",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));

        THIRD_RIBBON_THREE_TAILS = ITEMS.register("ribbon_three_tails_third",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        THIRD_RIBBON_TWO_TAILS = ITEMS.register("ribbon_two_tails_third",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        THIRD_RIBBON_ONE_TAIL = ITEMS.register("ribbon_one_tail_third",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        THIRD_ROSETTE = ITEMS.register("rosette_third",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));

        // RIBBONS IN MY COLORS
        for(int var21 = 1; var21 < 15; ++var21) {
            TRE_RIBBON_THREE_TAILS.add(ITEMS.register("ribbon_three_tails_" + var21, () ->
                    new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))
            ));
            TRE_RIBBON_TWO_TAILS.add(ITEMS.register("ribbon_two_tails_" + var21, () ->
                    new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))
            ));
            TRE_RIBBON_ONE_TAIL.add(ITEMS.register("ribbon_one_tail_" + var21, () ->
                    new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))
            ));
            TRE_ROSETTE.add(ITEMS.register("rosette_" + var21, () ->
                    new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))
            ));
        }


    // Dye Color number items
        RIBBON_THREE_TAILS = new ArrayList<>();
        RIBBON_TWO_TAILS = new ArrayList<>();
        RIBBON_ONE_TAIL = new ArrayList<>();
        ROSETTE = new ArrayList<>();
        DyeColor[] var0 = DyeColor.values();
        int var3 = var0.length;

        for(int var2 = 0; var2 < var3; ++var2) {
            DyeColor color = var0[var2];
             RIBBON_THREE_TAILS.add(ITEMS.register("ribbon_three_tails_" + color.getName(), () ->
                     new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))
             ));
             RIBBON_TWO_TAILS.add(ITEMS.register("ribbon_two_tails_" + color.getName(), () ->
                     new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))
             ));
             RIBBON_ONE_TAIL.add(ITEMS.register("ribbon_one_tail_" + color.getName(), () ->
                     new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))
             ));
             ROSETTE.add(ITEMS.register("rosette_" + color.getName(), () ->
                     new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB))
             ));
         }

    // One off award items
        RIBBON_THREE_TAILS_GRAND = ITEMS.register("ribbon_three_tails_grand",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        RIBBON_THREE_TAILS_RESERVE = ITEMS.register("ribbon_three_tails_reserve",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        TROPHY_1 = ITEMS.register("trophy_1",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        TROPHY_2 = ITEMS.register("trophy_2",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        TROPHY_3 = ITEMS.register("trophy_3",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        FLORAL_GOLD = ITEMS.register("floral_gold",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        FLORAL_SILVER = ITEMS.register("floral_silver",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        FLORAL_BRONZE = ITEMS.register("floral_bronze",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        SUN_TROPHY = ITEMS.register("sun_trophy",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        MOON_TROPHY = ITEMS.register("moon_trophy",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));

        MEDAL_1 = ITEMS.register("medal_1",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        MEDAL_2 = ITEMS.register("medal_2",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));
        MEDAL_3 = ITEMS.register("medal_3",
                () -> new Item(new Item.Properties().tab(TackShopCreativeModTab.TREAWARD_TAB)));

    }
}
