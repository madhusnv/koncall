package y2;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y2.a */
/* loaded from: classes.dex */
public final class EnumC8531a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8531a[] $VALUES;
    public static final EnumC8531a SHOW_ORIGINAL = new EnumC8531a("SHOW_ORIGINAL", 0);
    public static final EnumC8531a SHOW_TRANSLATED = new EnumC8531a("SHOW_TRANSLATED", 1);

    private static final /* synthetic */ EnumC8531a[] $values() {
        return new EnumC8531a[]{SHOW_ORIGINAL, SHOW_TRANSLATED};
    }

    static {
        EnumC8531a[] enumC8531aArr$values = $values();
        $VALUES = enumC8531aArr$values;
        $ENTRIES = b8.m11548b(enumC8531aArr$values);
    }

    private EnumC8531a(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8531a valueOf(String str) {
        return (EnumC8531a) Enum.valueOf(EnumC8531a.class, str);
    }

    public static EnumC8531a[] values() {
        return (EnumC8531a[]) $VALUES.clone();
    }
}
