package zc;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zc.m */
/* loaded from: classes.dex */
public final class EnumC8936m {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8936m[] $VALUES;
    public static final EnumC8936m TLS_1_0 = new EnumC8936m("TLS_1_0", 0);
    public static final EnumC8936m TLS_1_1 = new EnumC8936m("TLS_1_1", 1);
    public static final EnumC8936m TLS_1_2 = new EnumC8936m("TLS_1_2", 2);
    public static final EnumC8936m TLS_1_3 = new EnumC8936m("TLS_1_3", 3);

    private static final /* synthetic */ EnumC8936m[] $values() {
        return new EnumC8936m[]{TLS_1_0, TLS_1_1, TLS_1_2, TLS_1_3};
    }

    static {
        EnumC8936m[] enumC8936mArr$values = $values();
        $VALUES = enumC8936mArr$values;
        $ENTRIES = b8.m11548b(enumC8936mArr$values);
    }

    private EnumC8936m(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8936m valueOf(String str) {
        return (EnumC8936m) Enum.valueOf(EnumC8936m.class, str);
    }

    public static EnumC8936m[] values() {
        return (EnumC8936m[]) $VALUES.clone();
    }
}
