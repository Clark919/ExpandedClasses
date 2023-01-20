package com.clarkster.clarks_classes.entity.client.armor;

import com.clarkster.clarks_classes.ClarksClassesMod;
import com.clarkster.clarks_classes.item.custom.SacredBell;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BellArmorModel extends AnimatedGeoModel<SacredBell> {
    @Override
    public Identifier getModelResource(SacredBell object) {
        return new Identifier(ClarksClassesMod.MOD_ID, "geo/sacred_bell.geo.json");
    }

    @Override
    public Identifier getTextureResource(SacredBell object) {
        return new Identifier(ClarksClassesMod.MOD_ID, "textures/models/armor/sacred_bell_texture.png");
    }

    @Override
    public Identifier getAnimationResource(SacredBell animatable) {
        return new Identifier(ClarksClassesMod.MOD_ID, "animations/bell_armor.animation.json");
    }
}
