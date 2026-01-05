package com.skydoves.balloon;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonHighlightAnimation {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ BalloonHighlightAnimation[] $VALUES;
    public static final BalloonHighlightAnimation NONE = new BalloonHighlightAnimation("NONE", 0);
    public static final BalloonHighlightAnimation HEARTBEAT = new BalloonHighlightAnimation("HEARTBEAT", 1);
    public static final BalloonHighlightAnimation SHAKE = new BalloonHighlightAnimation("SHAKE", 2);
    public static final BalloonHighlightAnimation BREATH = new BalloonHighlightAnimation("BREATH", 3);
    public static final BalloonHighlightAnimation ROTATE = new BalloonHighlightAnimation("ROTATE", 4);

    private static final /* synthetic */ BalloonHighlightAnimation[] $values() {
        return new BalloonHighlightAnimation[]{NONE, HEARTBEAT, SHAKE, BREATH, ROTATE};
    }

    static {
        BalloonHighlightAnimation[] balloonHighlightAnimationArr$values = $values();
        $VALUES = balloonHighlightAnimationArr$values;
        $ENTRIES = b8.m11548b(balloonHighlightAnimationArr$values);
    }

    private BalloonHighlightAnimation(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static BalloonHighlightAnimation valueOf(String str) {
        return (BalloonHighlightAnimation) Enum.valueOf(BalloonHighlightAnimation.class, str);
    }

    public static BalloonHighlightAnimation[] values() {
        return (BalloonHighlightAnimation[]) $VALUES.clone();
    }
}
