package t3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t3.p */
/* loaded from: classes.dex */
public final class EnumC7029p {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7029p[] $VALUES;
    public static final EnumC7029p Min = new EnumC7029p("Min", 0);
    public static final EnumC7029p Max = new EnumC7029p("Max", 1);

    private static final /* synthetic */ EnumC7029p[] $values() {
        return new EnumC7029p[]{Min, Max};
    }

    static {
        EnumC7029p[] enumC7029pArr$values = $values();
        $VALUES = enumC7029pArr$values;
        $ENTRIES = b8.m11548b(enumC7029pArr$values);
    }

    private EnumC7029p(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7029p valueOf(String str) {
        return (EnumC7029p) Enum.valueOf(EnumC7029p.class, str);
    }

    public static EnumC7029p[] values() {
        return (EnumC7029p[]) $VALUES.clone();
    }
}
