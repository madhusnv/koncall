package com.skydoves.balloon;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ArrowPositionRules {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ ArrowPositionRules[] $VALUES;
    public static final ArrowPositionRules ALIGN_BALLOON = new ArrowPositionRules("ALIGN_BALLOON", 0);
    public static final ArrowPositionRules ALIGN_ANCHOR = new ArrowPositionRules("ALIGN_ANCHOR", 1);

    private static final /* synthetic */ ArrowPositionRules[] $values() {
        return new ArrowPositionRules[]{ALIGN_BALLOON, ALIGN_ANCHOR};
    }

    static {
        ArrowPositionRules[] arrowPositionRulesArr$values = $values();
        $VALUES = arrowPositionRulesArr$values;
        $ENTRIES = b8.m11548b(arrowPositionRulesArr$values);
    }

    private ArrowPositionRules(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static ArrowPositionRules valueOf(String str) {
        return (ArrowPositionRules) Enum.valueOf(ArrowPositionRules.class, str);
    }

    public static ArrowPositionRules[] values() {
        return (ArrowPositionRules[]) $VALUES.clone();
    }
}
