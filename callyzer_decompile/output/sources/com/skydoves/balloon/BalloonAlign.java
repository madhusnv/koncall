package com.skydoves.balloon;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonAlign {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ BalloonAlign[] $VALUES;
    public static final BalloonAlign START = new BalloonAlign("START", 0);
    public static final BalloonAlign END = new BalloonAlign("END", 1);
    public static final BalloonAlign TOP = new BalloonAlign("TOP", 2);
    public static final BalloonAlign BOTTOM = new BalloonAlign("BOTTOM", 3);

    private static final /* synthetic */ BalloonAlign[] $values() {
        return new BalloonAlign[]{START, END, TOP, BOTTOM};
    }

    static {
        BalloonAlign[] balloonAlignArr$values = $values();
        $VALUES = balloonAlignArr$values;
        $ENTRIES = b8.m11548b(balloonAlignArr$values);
    }

    private BalloonAlign(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static BalloonAlign valueOf(String str) {
        return (BalloonAlign) Enum.valueOf(BalloonAlign.class, str);
    }

    public static BalloonAlign[] values() {
        return (BalloonAlign[]) $VALUES.clone();
    }
}
