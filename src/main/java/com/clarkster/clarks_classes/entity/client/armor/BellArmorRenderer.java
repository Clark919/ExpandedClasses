package com.clarkster.clarks_classes.entity.client.armor;

import com.clarkster.clarks_classes.item.custom.SacredBell;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BellArmorRenderer extends GeoArmorRenderer<SacredBell> {

    public BellArmorRenderer() {
        super(new BellArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
