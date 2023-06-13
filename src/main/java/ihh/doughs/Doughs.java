package ihh.doughs;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(Doughs.MOD_ID)
public class Doughs {
    public static final String MOD_ID = "doughs";

    public Doughs() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Doughs.MOD_ID);
        Item.Properties properties = new Item.Properties();
        RegistryObject<Item> breadDough = ITEMS.register("bread_dough", () -> new Item(properties));
        RegistryObject<Item> cakeDough = ITEMS.register("cake_dough", () -> new Item(properties));
        RegistryObject<Item> cookieDough = ITEMS.register("cookie_dough", () -> new Item(properties));
        RegistryObject<Item> pumpkinPieDough = ITEMS.register("pumpkin_pie_dough", () -> new Item(properties));
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
