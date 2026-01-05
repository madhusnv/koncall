package qw;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.d */
/* loaded from: classes3.dex */
public final class EnumC6354d {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6354d[] $VALUES;
    public static final EnumC6354d WARNING = new EnumC6354d("WARNING", 0);
    public static final EnumC6354d ERROR = new EnumC6354d("ERROR", 1);
    public static final EnumC6354d HIDDEN = new EnumC6354d("HIDDEN", 2);

    private static final /* synthetic */ EnumC6354d[] $values() {
        return new EnumC6354d[]{WARNING, ERROR, HIDDEN};
    }

    static {
        EnumC6354d[] enumC6354dArr$values = $values();
        $VALUES = enumC6354dArr$values;
        $ENTRIES = b8.m11548b(enumC6354dArr$values);
    }

    private EnumC6354d(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6354d valueOf(String str) {
        return (EnumC6354d) Enum.valueOf(EnumC6354d.class, str);
    }

    public static EnumC6354d[] values() {
        return (EnumC6354d[]) $VALUES.clone();
    }
}
