package com.kyraltre.tretackshop.block;

import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.block.custom.HeartTrophy;
import com.kyraltre.tretackshop.block.custom.PumpkinTrophy;
import com.kyraltre.tretackshop.block.custom.SnowflakeTrophy;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

import java.util.function.Supplier;

public class TackShopBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TreTackShop.MOD_ID);

    public static final RegistryObject<Block> PUMPKIN_GRAND = registerBlock("pumpkin_grand",
            () -> new PumpkinTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

    public static final RegistryObject<Block> PUMPKIN_RESERVE = registerBlock("pumpkin_reserve",
            () -> new PumpkinTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

    public  static final RegistryObject<Block> SNOWFLAKE_GRAND =registerBlock("snowflake_grand", () ->
            new SnowflakeTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> SNOWFLAKE_RESERVE = registerBlock("snowflake_reserve",
            () -> new SnowflakeTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public  static final RegistryObject<Block> HEART_GRAND =registerBlock("heart_grand", () ->
            new HeartTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> HEART_RESERVE = registerBlock("heart_reserve",
            () -> new HeartTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

    public  static final RegistryObject<Block> CLOVER_GRAND =registerBlock("clover_grand", () ->
            new HeartTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> CLOVER_RESERVE = registerBlock("clover_reserve",
            () -> new HeartTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

    public  static final RegistryObject<Block> E_G_G_TROPHY_THIN =registerBlock("e_g_g_trophy_thin", () ->
            new HeartTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> E_G_G_TROPHY_THICK = registerBlock("e_g_g_trophy_thick",
            () -> new HeartTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> E_G_G_TROPHY_CHEV = registerBlock("e_g_g_trophy_chev",
            () -> new HeartTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
            return TackShopItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
