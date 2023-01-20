package com.clarkster.clarks_classes;

import com.clarkster.clarks_classes.entity.client.armor.BellArmorRenderer;
import com.clarkster.clarks_classes.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeoArmorRenderer.registerArmorRenderer(new BellArmorRenderer(), ModItems.SACRED_BELL);
    }
}
