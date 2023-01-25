package com.clarkster.clarks_classes.sound;

import com.clarkster.clarks_classes.ClarksClassesMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static SoundEvent COIN_PURSE_EMPTY = registerSoundEvent("coin_purse_empty");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(ClarksClassesMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
