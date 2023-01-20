package com.clarkster.clarks_classes;

import com.clarkster.clarks_classes.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ClarksClassesMod implements ModInitializer {
    public static final String MOD_ID = "clarks_classes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
