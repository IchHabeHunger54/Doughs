package ihh.doughs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(Doughs.MOD_ID)
public class Doughs {
    public static final String MOD_ID = "doughs";

    public Doughs() {
        DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Doughs.MOD_ID);
        ITEMS.register("bread_dough", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
        ITEMS.register("cake_dough", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
        ITEMS.register("cookie_dough", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
        ITEMS.register("pumpkin_pie_dough", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
