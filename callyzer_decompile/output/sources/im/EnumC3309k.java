package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.k */
/* loaded from: classes3.dex */
public final class EnumC3309k {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3309k[] $VALUES;
    public static final EnumC3309k TOP_CALLER = new EnumC3309k("TOP_CALLER", 0);
    public static final EnumC3309k LONGEST_CALL = new EnumC3309k("LONGEST_CALL", 1);
    public static final EnumC3309k HIGHEST_CALL = new EnumC3309k("HIGHEST_CALL", 2);
    public static final EnumC3309k AVERAGE_CALL_DURATION = new EnumC3309k("AVERAGE_CALL_DURATION", 3);
    public static final EnumC3309k TOP_10_FREQUENTLY_CALL = new EnumC3309k("TOP_10_FREQUENTLY_CALL", 4);
    public static final EnumC3309k TOP_10_CALL_DURATION = new EnumC3309k("TOP_10_CALL_DURATION", 5);

    private static final /* synthetic */ EnumC3309k[] $values() {
        return new EnumC3309k[]{TOP_CALLER, LONGEST_CALL, HIGHEST_CALL, AVERAGE_CALL_DURATION, TOP_10_FREQUENTLY_CALL, TOP_10_CALL_DURATION};
    }

    static {
        EnumC3309k[] enumC3309kArr$values = $values();
        $VALUES = enumC3309kArr$values;
        $ENTRIES = b8.m11548b(enumC3309kArr$values);
    }

    private EnumC3309k(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3309k valueOf(String str) {
        return (EnumC3309k) Enum.valueOf(EnumC3309k.class, str);
    }

    public static EnumC3309k[] values() {
        return (EnumC3309k[]) $VALUES.clone();
    }
}
