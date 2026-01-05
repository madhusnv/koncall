package com.skydoves.balloon;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class IconGravity {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ IconGravity[] $VALUES;
    public static final IconGravity START = new IconGravity("START", 0);
    public static final IconGravity END = new IconGravity("END", 1);
    public static final IconGravity TOP = new IconGravity("TOP", 2);
    public static final IconGravity BOTTOM = new IconGravity("BOTTOM", 3);

    private static final /* synthetic */ IconGravity[] $values() {
        return new IconGravity[]{START, END, TOP, BOTTOM};
    }

    static {
        IconGravity[] iconGravityArr$values = $values();
        $VALUES = iconGravityArr$values;
        $ENTRIES = b8.m11548b(iconGravityArr$values);
    }

    private IconGravity(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static IconGravity valueOf(String str) {
        return (IconGravity) Enum.valueOf(IconGravity.class, str);
    }

    public static IconGravity[] values() {
        return (IconGravity[]) $VALUES.clone();
    }
}
