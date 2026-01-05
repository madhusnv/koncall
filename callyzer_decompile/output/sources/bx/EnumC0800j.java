package bx;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bx.j */
/* loaded from: classes3.dex */
public final class EnumC0800j {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC0800j[] $VALUES;
    public static final EnumC0800j TOP_DOWN = new EnumC0800j("TOP_DOWN", 0);
    public static final EnumC0800j BOTTOM_UP = new EnumC0800j("BOTTOM_UP", 1);

    private static final /* synthetic */ EnumC0800j[] $values() {
        return new EnumC0800j[]{TOP_DOWN, BOTTOM_UP};
    }

    static {
        EnumC0800j[] enumC0800jArr$values = $values();
        $VALUES = enumC0800jArr$values;
        $ENTRIES = b8.m11548b(enumC0800jArr$values);
    }

    private EnumC0800j(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0800j valueOf(String str) {
        return (EnumC0800j) Enum.valueOf(EnumC0800j.class, str);
    }

    public static EnumC0800j[] values() {
        return (EnumC0800j[]) $VALUES.clone();
    }
}
