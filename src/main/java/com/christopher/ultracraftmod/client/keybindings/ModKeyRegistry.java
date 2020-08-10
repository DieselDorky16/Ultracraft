package com.christopher.ultracraftmod.client.keybindings;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;

@OnlyIn(Dist.CLIENT)
public class ModKeyRegistry
{
    private static KeyBinding BINDING;

    List<KeyBinding> keys;

    public ModKeyRegistry()
    {
        this.keys = new ArrayList<KeyBinding>();
    }

    public ModKeyRegistry register(KeyBinding keyBinding)
    {
        if (!keys.contains(keyBinding))
        {
            this.keys.add(keyBinding);
            ClientRegistry.registerKeyBinding(keyBinding);
        }
        return this;
    }

    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent event)
    {
        final EnumKeyAction action = EnumKeyAction.getActionByCode(event.getAction());
        for (KeyBinding key : keys)
        {
            if (event.getKey() == key.getKey().getKeyCode())
            {
                MinecraftForge.EVENT_BUS.post(new ModKeyEvent(key, action));
            }
        }
    }

    public enum EnumKeyAction
    {

        RELEASED(GLFW.GLFW_RELEASE), PRESSED(GLFW.GLFW_PRESS), REPEAT(GLFW.GLFW_REPEAT);

        private final int code;


        EnumKeyAction(int code)
        {
            this.code = code;
        }

        public static EnumKeyAction getActionByCode(final int code)
        {
            for (EnumKeyAction action : values())
            {
                if (action.getCode() == code)
                    return action;
            }
            return EnumKeyAction.values()[0];
        }

        public int getCode()
        {
            return code;
        }
    }

    public static class ModKeyEvent extends Event
    {

        private final KeyBinding keyBinding;
        private final EnumKeyAction action;

        public ModKeyEvent(KeyBinding keyBinding, EnumKeyAction action)
        {
            this.keyBinding = keyBinding;
            this.action = action;
        }

        public KeyBinding getKeyBinding()
        {
            return keyBinding;
        }

        public EnumKeyAction getAction()
        {
            return action;
        }

    }

}

