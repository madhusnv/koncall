package ky;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.a */
/* loaded from: classes3.dex */
public final class EnumC4269a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC4269a[] $VALUES;
    public static final EnumC4269a NONE = new EnumC4269a("NONE", 0);
    public static final EnumC4269a ALL_JSON_OBJECTS = new EnumC4269a("ALL_JSON_OBJECTS", 1);
    public static final EnumC4269a POLYMORPHIC = new EnumC4269a("POLYMORPHIC", 2);

    private static final /* synthetic */ EnumC4269a[] $values() {
        return new EnumC4269a[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
    }

    static {
        EnumC4269a[] enumC4269aArr$values = $values();
        $VALUES = enumC4269aArr$values;
        $ENTRIES = b8.m11548b(enumC4269aArr$values);
    }

    private EnumC4269a(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4269a valueOf(String str) {
        return (EnumC4269a) Enum.valueOf(EnumC4269a.class, str);
    }

    public static EnumC4269a[] values() {
        return (EnumC4269a[]) $VALUES.clone();
    }
}
