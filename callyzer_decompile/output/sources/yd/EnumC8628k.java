package yd;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yd.k */
/* loaded from: classes.dex */
public final class EnumC8628k {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8628k[] $VALUES;
    public static final EnumC8628k IGNORE = new EnumC8628k("IGNORE", 0);
    public static final EnumC8628k RESPECT_PERFORMANCE = new EnumC8628k("RESPECT_PERFORMANCE", 1);
    public static final EnumC8628k RESPECT_ALL = new EnumC8628k("RESPECT_ALL", 2);

    private static final /* synthetic */ EnumC8628k[] $values() {
        return new EnumC8628k[]{IGNORE, RESPECT_PERFORMANCE, RESPECT_ALL};
    }

    static {
        EnumC8628k[] enumC8628kArr$values = $values();
        $VALUES = enumC8628kArr$values;
        $ENTRIES = b8.m11548b(enumC8628kArr$values);
    }

    private EnumC8628k(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8628k valueOf(String str) {
        return (EnumC8628k) Enum.valueOf(EnumC8628k.class, str);
    }

    public static EnumC8628k[] values() {
        return (EnumC8628k[]) $VALUES.clone();
    }
}
