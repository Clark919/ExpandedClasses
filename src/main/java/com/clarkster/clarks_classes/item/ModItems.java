package com.clarkster.clarks_classes.item;

import com.clarkster.clarks_classes.ClarksClassesMod;
import com.clarkster.clarks_classes.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.tag.InstrumentTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item SACRED_CHIME = registerItem("sacred_chime",
            new SacredChime(new FabricItemSettings().group(ItemGroup.TOOLS).maxCount(1)));
    public static final Item SACRED_BELL = registerItem("sacred_bell",
            new SacredBell(ModArmorMaterials.BELL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item VIAL_OF_MERCY = registerItem("vial_of_mercy",
            new VialOfMercy(new FabricItemSettings().group(ItemGroup.TOOLS).maxCount(1)));
    public static final Item BUISINE = registerItem("buisine",
            new Buisine((new Item.Settings()).group(ItemGroup.TOOLS).maxCount(1), InstrumentTags.REGULAR_GOAT_HORNS));
    public static final Item COIN_PURSE = registerItem("coin_purse",
            new CoinPurse((new Item.Settings().maxCount(1).group(ItemGroup.MISC))));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ClarksClassesMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ClarksClassesMod.LOGGER.debug("Registering Mod Items for " + ClarksClassesMod.MOD_ID);
    }
}
