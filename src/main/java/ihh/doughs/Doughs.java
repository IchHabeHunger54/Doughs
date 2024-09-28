package ihh.doughs;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Doughs.MOD_ID)
public class Doughs {
    public static final String MOD_ID = "doughs";

    public Doughs(IEventBus bus) {
        DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
        DeferredItem<Item> breadDough = ITEMS.registerSimpleItem("bread_dough");
        DeferredItem<Item> cakeDough = ITEMS.registerSimpleItem("cake_dough");
        DeferredItem<Item> cookieDough = ITEMS.registerSimpleItem("cookie_dough");
        DeferredItem<Item> pumpkinPieDough = ITEMS.registerSimpleItem("pumpkin_pie_dough");
        ITEMS.register(bus);
        bus.<BuildCreativeModeTabContentsEvent>addListener(e -> {
            if (e.getTabKey() == CreativeModeTabs.INGREDIENTS) {
                e.accept(breadDough);
                e.accept(cakeDough);
                e.accept(cookieDough);
                e.accept(pumpkinPieDough);
            }
        });
    }
}
