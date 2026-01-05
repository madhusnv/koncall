package kw;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kw.a */
/* loaded from: classes3.dex */
public final class EnumC4256a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC4256a[] $VALUES;
    public static final EnumC4256a Default = new EnumC4256a("Default", 0);
    public static final EnumC4256a None = new EnumC4256a("None", 1);

    private static final /* synthetic */ EnumC4256a[] $values() {
        return new EnumC4256a[]{Default, None};
    }

    static {
        EnumC4256a[] enumC4256aArr$values = $values();
        $VALUES = enumC4256aArr$values;
        $ENTRIES = b8.m11548b(enumC4256aArr$values);
    }

    private EnumC4256a(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4256a valueOf(String str) {
        return (EnumC4256a) Enum.valueOf(EnumC4256a.class, str);
    }

    public static EnumC4256a[] values() {
        return (EnumC4256a[]) $VALUES.clone();
    }
}
