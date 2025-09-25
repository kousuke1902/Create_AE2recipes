package com.kousuke1902.create_ae2recipes.registry;

import com.kousuke1902.create_ae2recipes.CreateAE2recipes;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// アイテムの追加
public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateAE2recipes.MOD_ID);

    // 組み立て中の演算プロセッサ
    public static final DeferredItem<Item> INCOMPLETE_CALCULATION_PROCESSOR = ITEMS.register("incomplete_calculation_processor",
            () -> new Item(new Item.Properties()));
    // 組み立て中の情報処理プロセッサ
    public static final DeferredItem<Item> INCOMPLETE_ENGINEERING_PROCESSOR = ITEMS.register("incomplete_engineering_processor",
            () -> new Item(new Item.Properties()));
    // 組み立て中の論理プロセッサ
    public static final DeferredItem<Item> INCOMPLETE_LOGIC_PROCESSOR = ITEMS.register("incomplete_logic_processor",
            () -> new Item(new Item.Properties()));
    // 組み立て中の基本カード
    public static final DeferredItem<Item> INCOMPLETE_BASIC_CARD = ITEMS.register("incomplete_basic_card",
            () -> new Item(new Item.Properties()));
    // 組み立て中の上級カード
    public static final DeferredItem<Item> INCOMPLETE_ADVANCED_CARD = ITEMS.register("incomplete_advanced_card",
            () -> new Item(new Item.Properties()));

    // 組み立て中の1K MEストレージコンポーネント
    public static final DeferredItem<Item> INCOMPLETE_CELL_COMPONENT_1k = ITEMS.register("incomplete_cell_component_1k",
            () -> new Item(new Item.Properties()));

    // 組み立て中の4K MEストレージコンポーネント
    public static final DeferredItem<Item> INCOMPLETE_CELL_COMPONENT_4k = ITEMS.register("incomplete_cell_component_4k",
            () -> new Item(new Item.Properties()));

    // 組み立て中の16K MEストレージコンポーネント
    public static final DeferredItem<Item> INCOMPLETE_CELL_COMPONENT_16k = ITEMS.register("incomplete_cell_component_16k",
            () -> new Item(new Item.Properties()));

    // 組み立て中の64K MEストレージコンポーネント
    public static final DeferredItem<Item> INCOMPLETE_CELL_COMPONENT_64k = ITEMS.register("incomplete_cell_component_64k",
            () -> new Item(new Item.Properties()));

    // 組み立て中の256K MEストレージコンポーネント
    public static final DeferredItem<Item> INCOMPLETE_CELL_COMPONENT_256k = ITEMS.register("incomplete_cell_component_256k",
            () -> new Item(new Item.Properties()));

    // 組み立て中の2^3 空間コンポーネント
    public static final DeferredItem<Item> INCOMPLETE_SPATIAL_CELL_COMPONENT_2 = ITEMS.register("incomplete_spatial_cell_component_2",
            () -> new Item(new Item.Properties()));

    // 組み立て中の16^3 空間コンポーネント
    public static final DeferredItem<Item> INCOMPLETE_SPATIAL_CELL_COMPONENT_16 = ITEMS.register("incomplete_spatial_cell_component_16",
            () -> new Item(new Item.Properties()));

    // 組み立て中の128^3 空間コンポーネント
    public static final DeferredItem<Item> INCOMPLETE_SPATIAL_CELL_COMPONENT_128 = ITEMS.register("incomplete_spatial_cell_component_128",
            () -> new Item(new Item.Properties()));

    // 組み立て中のMEアイテムセル筐体
    public static final DeferredItem<Item> INCOMPLETE_ITEM_CELL_HOUSING = ITEMS.register("incomplete_item_cell_housing",
            () -> new Item(new Item.Properties()));

    // 組み立て中のME液体セル筐体
    public static final DeferredItem<Item> INCOMPLETE_FLUID_CELL_HOUSING = ITEMS.register("incomplete_fluid_cell_housing",
            () -> new Item(new Item.Properties()));

    // 組み立て中のパターン
    public static final DeferredItem<Item> INCOMPLETE_BLANK_PATTERN = ITEMS.register("incomplete_blank_pattern",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
