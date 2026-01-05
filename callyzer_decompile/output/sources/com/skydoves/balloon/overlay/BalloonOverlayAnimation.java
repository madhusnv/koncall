package com.skydoves.balloon.overlay;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonOverlayAnimation {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ BalloonOverlayAnimation[] $VALUES;
    public static final BalloonOverlayAnimation NONE = new BalloonOverlayAnimation("NONE", 0);
    public static final BalloonOverlayAnimation FADE = new BalloonOverlayAnimation("FADE", 1);

    private static final /* synthetic */ BalloonOverlayAnimation[] $values() {
        return new BalloonOverlayAnimation[]{NONE, FADE};
    }

    static {
        BalloonOverlayAnimation[] balloonOverlayAnimationArr$values = $values();
        $VALUES = balloonOverlayAnimationArr$values;
        $ENTRIES = b8.m11548b(balloonOverlayAnimationArr$values);
    }

    private BalloonOverlayAnimation(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static BalloonOverlayAnimation valueOf(String str) {
        return (BalloonOverlayAnimation) Enum.valueOf(BalloonOverlayAnimation.class, str);
    }

    public static BalloonOverlayAnimation[] values() {
        return (BalloonOverlayAnimation[]) $VALUES.clone();
    }
}
