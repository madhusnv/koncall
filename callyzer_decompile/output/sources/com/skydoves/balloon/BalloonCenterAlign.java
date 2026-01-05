package com.skydoves.balloon;

import com.skydoves.balloon.annotations.InternalBalloonApi;
import kotlin.NoWhenBranchMatchedException;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonCenterAlign {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ BalloonCenterAlign[] $VALUES;
    public static final BalloonCenterAlign START = new BalloonCenterAlign("START", 0);
    public static final BalloonCenterAlign END = new BalloonCenterAlign("END", 1);
    public static final BalloonCenterAlign TOP = new BalloonCenterAlign("TOP", 2);
    public static final BalloonCenterAlign BOTTOM = new BalloonCenterAlign("BOTTOM", 3);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BalloonCenterAlign.values().length];
            try {
                iArr[BalloonCenterAlign.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BalloonCenterAlign.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BalloonCenterAlign.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BalloonCenterAlign.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ BalloonCenterAlign[] $values() {
        return new BalloonCenterAlign[]{START, END, TOP, BOTTOM};
    }

    static {
        BalloonCenterAlign[] balloonCenterAlignArr$values = $values();
        $VALUES = balloonCenterAlignArr$values;
        $ENTRIES = b8.m11548b(balloonCenterAlignArr$values);
    }

    private BalloonCenterAlign(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static BalloonCenterAlign valueOf(String str) {
        return (BalloonCenterAlign) Enum.valueOf(BalloonCenterAlign.class, str);
    }

    public static BalloonCenterAlign[] values() {
        return (BalloonCenterAlign[]) $VALUES.clone();
    }

    @InternalBalloonApi
    public final BalloonAlign toAlign() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return BalloonAlign.START;
        }
        if (i10 == 2) {
            return BalloonAlign.END;
        }
        if (i10 == 3) {
            return BalloonAlign.TOP;
        }
        if (i10 == 4) {
            return BalloonAlign.BOTTOM;
        }
        throw new NoWhenBranchMatchedException();
    }
}
