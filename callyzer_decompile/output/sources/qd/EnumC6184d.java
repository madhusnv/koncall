package qd;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qd.d */
/* loaded from: classes.dex */
public final class EnumC6184d {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6184d[] $VALUES;
    public static final EnumC6184d UNSET = new EnumC6184d("UNSET", 0);
    public static final EnumC6184d OK = new EnumC6184d("OK", 1);
    public static final EnumC6184d ERROR = new EnumC6184d("ERROR", 2);

    private static final /* synthetic */ EnumC6184d[] $values() {
        return new EnumC6184d[]{UNSET, OK, ERROR};
    }

    static {
        EnumC6184d[] enumC6184dArr$values = $values();
        $VALUES = enumC6184dArr$values;
        $ENTRIES = b8.m11548b(enumC6184dArr$values);
    }

    private EnumC6184d(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6184d valueOf(String str) {
        return (EnumC6184d) Enum.valueOf(EnumC6184d.class, str);
    }

    public static EnumC6184d[] values() {
        return (EnumC6184d[]) $VALUES.clone();
    }
}
