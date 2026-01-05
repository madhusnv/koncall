package yc;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yc.e */
/* loaded from: classes.dex */
public final class EnumC8616e {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8616e[] $VALUES;
    public static final EnumC8616e Before = new EnumC8616e("Before", 0);
    public static final EnumC8616e After = new EnumC8616e("After", 1);

    private static final /* synthetic */ EnumC8616e[] $values() {
        return new EnumC8616e[]{Before, After};
    }

    static {
        EnumC8616e[] enumC8616eArr$values = $values();
        $VALUES = enumC8616eArr$values;
        $ENTRIES = b8.m11548b(enumC8616eArr$values);
    }

    private EnumC8616e(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8616e valueOf(String str) {
        return (EnumC8616e) Enum.valueOf(EnumC8616e.class, str);
    }

    public static EnumC8616e[] values() {
        return (EnumC8616e[]) $VALUES.clone();
    }
}
