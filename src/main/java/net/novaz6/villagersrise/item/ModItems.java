package net.novaz6.villagersrise.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.novaz6.villagersrise.VillagersRise;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VillagersRise.MODID);

    public static final DeferredItem<Item> COPPER_COIN = ITEMS.register("copper_coin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_COIN = ITEMS.register("silver_coin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCEPTER_JEWELED = ITEMS.register("scepter_jeweled",
            () -> new Item(new Item.Properties()));


    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
