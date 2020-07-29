package com.christopher.ultracraftmod.util.properties;

import net.minecraft.util.IStringSerializable;

public enum CinnamonLeaves implements IStringSerializable {
    NONE("none"),
    SMALL("small"),
    LARGE("large");

    private final String name;

    private CinnamonLeaves(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String func_176610_l() {
        return this.name;
    }
}
