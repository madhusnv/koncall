package com.skydoves.balloon;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ArrowOrientationRules {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ ArrowOrientationRules[] $VALUES;
    public static final ArrowOrientationRules ALIGN_ANCHOR = new ArrowOrientationRules("ALIGN_ANCHOR", 0);
    public static final ArrowOrientationRules ALIGN_FIXED = new ArrowOrientationRules("ALIGN_FIXED", 1);

    private static final /* synthetic */ ArrowOrientationRules[] $values() {
        return new ArrowOrientationRules[]{ALIGN_ANCHOR, ALIGN_FIXED};
    }

    static {
        ArrowOrientationRules[] arrowOrientationRulesArr$values = $values();
        $VALUES = arrowOrientationRulesArr$values;
        $ENTRIES = b8.m11548b(arrowOrientationRulesArr$values);
    }

    private ArrowOrientationRules(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static ArrowOrientationRules valueOf(String str) {
        return (ArrowOrientationRules) Enum.valueOf(ArrowOrientationRules.class, str);
    }

    public static ArrowOrientationRules[] values() {
        return (ArrowOrientationRules[]) $VALUES.clone();
    }
}
