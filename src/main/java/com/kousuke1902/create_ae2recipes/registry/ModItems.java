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

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
