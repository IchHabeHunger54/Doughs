package ihh.doughs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("doughs")
public class Doughs {
    public Doughs() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "doughs");
    static {
        ITEMS.register("bread_dough", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
        ITEMS.register("cake_dough", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
        ITEMS.register("cookie_dough", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
        ITEMS.register("pumpkin_pie_dough", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    }
}
