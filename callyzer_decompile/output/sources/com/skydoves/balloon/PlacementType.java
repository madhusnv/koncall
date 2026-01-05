package com.skydoves.balloon;

import com.skydoves.balloon.annotations.InternalBalloonApi;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalBalloonApi
/* loaded from: classes.dex */
public final class PlacementType {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ PlacementType[] $VALUES;
    public static final PlacementType ALIGNMENT = new PlacementType("ALIGNMENT", 0);
    public static final PlacementType DROPDOWN = new PlacementType("DROPDOWN", 1);
    public static final PlacementType CENTER = new PlacementType("CENTER", 2);

    private static final /* synthetic */ PlacementType[] $values() {
        return new PlacementType[]{ALIGNMENT, DROPDOWN, CENTER};
    }

    static {
        PlacementType[] placementTypeArr$values = $values();
        $VALUES = placementTypeArr$values;
        $ENTRIES = b8.m11548b(placementTypeArr$values);
    }

    private PlacementType(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static PlacementType valueOf(String str) {
        return (PlacementType) Enum.valueOf(PlacementType.class, str);
    }

    public static PlacementType[] values() {
        return (PlacementType[]) $VALUES.clone();
    }
}
