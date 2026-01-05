package com.skydoves.balloon;

import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ArrowOrientation {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ ArrowOrientation[] $VALUES;
    public static final Companion Companion;
    public static final ArrowOrientation BOTTOM = new ArrowOrientation("BOTTOM", 0);
    public static final ArrowOrientation TOP = new ArrowOrientation("TOP", 1);
    public static final ArrowOrientation START = new ArrowOrientation("START", 2);
    public static final ArrowOrientation END = new ArrowOrientation("END", 3);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ArrowOrientation.values().length];
                try {
                    iArr[ArrowOrientation.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ArrowOrientation.END.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final ArrowOrientation getRTLSupportOrientation$balloon_release(ArrowOrientation arrowOrientation, boolean z6) {
            AbstractC4154l.m8923f(arrowOrientation, "<this>");
            if (z6) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[arrowOrientation.ordinal()];
                if (i10 == 1) {
                    return ArrowOrientation.END;
                }
                if (i10 == 2) {
                    return ArrowOrientation.START;
                }
            }
            return arrowOrientation;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ArrowOrientation[] $values() {
        return new ArrowOrientation[]{BOTTOM, TOP, START, END};
    }

    static {
        ArrowOrientation[] arrowOrientationArr$values = $values();
        $VALUES = arrowOrientationArr$values;
        $ENTRIES = b8.m11548b(arrowOrientationArr$values);
        Companion = new Companion(null);
    }

    private ArrowOrientation(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static ArrowOrientation valueOf(String str) {
        return (ArrowOrientation) Enum.valueOf(ArrowOrientation.class, str);
    }

    public static ArrowOrientation[] values() {
        return (ArrowOrientation[]) $VALUES.clone();
    }
}
