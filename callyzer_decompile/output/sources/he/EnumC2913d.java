package he;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: he.d */
/* loaded from: classes.dex */
public final class EnumC2913d {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2913d[] $VALUES;
    public static final EnumC2913d EXACT = new EnumC2913d("EXACT", 0);
    public static final EnumC2913d INEXACT = new EnumC2913d("INEXACT", 1);
    public static final EnumC2913d AUTOMATIC = new EnumC2913d("AUTOMATIC", 2);

    private static final /* synthetic */ EnumC2913d[] $values() {
        return new EnumC2913d[]{EXACT, INEXACT, AUTOMATIC};
    }

    static {
        EnumC2913d[] enumC2913dArr$values = $values();
        $VALUES = enumC2913dArr$values;
        $ENTRIES = b8.m11548b(enumC2913dArr$values);
    }

    private EnumC2913d(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2913d valueOf(String str) {
        return (EnumC2913d) Enum.valueOf(EnumC2913d.class, str);
    }

    public static EnumC2913d[] values() {
        return (EnumC2913d[]) $VALUES.clone();
    }
}
