package net.abdullohganisherov.agsoundmancy.item;

import net.abdullohganisherov.agsoundmancy.AGsoundmancyMOD;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AGsoundmancyMOD.MOD_ID);

    public static final RegistryObject<Item> CHORDAL = ITEMS.register("chordal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
