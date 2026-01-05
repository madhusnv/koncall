package s4;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.m */
/* loaded from: classes.dex */
public final class EnumC6757m {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6757m[] $VALUES;
    public static final EnumC6757m Ltr = new EnumC6757m("Ltr", 0);
    public static final EnumC6757m Rtl = new EnumC6757m("Rtl", 1);

    private static final /* synthetic */ EnumC6757m[] $values() {
        return new EnumC6757m[]{Ltr, Rtl};
    }

    static {
        EnumC6757m[] enumC6757mArr$values = $values();
        $VALUES = enumC6757mArr$values;
        $ENTRIES = b8.m11548b(enumC6757mArr$values);
    }

    private EnumC6757m(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6757m valueOf(String str) {
        return (EnumC6757m) Enum.valueOf(EnumC6757m.class, str);
    }

    public static EnumC6757m[] values() {
        return (EnumC6757m[]) $VALUES.clone();
    }
}
