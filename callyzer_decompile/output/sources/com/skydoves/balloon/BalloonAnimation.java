package com.skydoves.balloon;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonAnimation {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ BalloonAnimation[] $VALUES;
    public static final BalloonAnimation NONE = new BalloonAnimation("NONE", 0);
    public static final BalloonAnimation ELASTIC = new BalloonAnimation("ELASTIC", 1);
    public static final BalloonAnimation FADE = new BalloonAnimation("FADE", 2);
    public static final BalloonAnimation CIRCULAR = new BalloonAnimation("CIRCULAR", 3);
    public static final BalloonAnimation OVERSHOOT = new BalloonAnimation("OVERSHOOT", 4);

    private static final /* synthetic */ BalloonAnimation[] $values() {
        return new BalloonAnimation[]{NONE, ELASTIC, FADE, CIRCULAR, OVERSHOOT};
    }

    static {
        BalloonAnimation[] balloonAnimationArr$values = $values();
        $VALUES = balloonAnimationArr$values;
        $ENTRIES = b8.m11548b(balloonAnimationArr$values);
    }

    private BalloonAnimation(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static BalloonAnimation valueOf(String str) {
        return (BalloonAnimation) Enum.valueOf(BalloonAnimation.class, str);
    }

    public static BalloonAnimation[] values() {
        return (BalloonAnimation[]) $VALUES.clone();
    }
}
