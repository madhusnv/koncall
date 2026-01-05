package com.skydoves.balloon.animations;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonRotateDirection {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ BalloonRotateDirection[] $VALUES;
    private final int value;
    public static final BalloonRotateDirection RIGHT = new BalloonRotateDirection("RIGHT", 0, 1);
    public static final BalloonRotateDirection LEFT = new BalloonRotateDirection("LEFT", 1, -1);

    private static final /* synthetic */ BalloonRotateDirection[] $values() {
        return new BalloonRotateDirection[]{RIGHT, LEFT};
    }

    static {
        BalloonRotateDirection[] balloonRotateDirectionArr$values = $values();
        $VALUES = balloonRotateDirectionArr$values;
        $ENTRIES = b8.m11548b(balloonRotateDirectionArr$values);
    }

    private BalloonRotateDirection(String str, int i10, int i11) {
        this.value = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static BalloonRotateDirection valueOf(String str) {
        return (BalloonRotateDirection) Enum.valueOf(BalloonRotateDirection.class, str);
    }

    public static BalloonRotateDirection[] values() {
        return (BalloonRotateDirection[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
