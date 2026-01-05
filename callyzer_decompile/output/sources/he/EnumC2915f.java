package he;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: he.f */
/* loaded from: classes.dex */
public final class EnumC2915f {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2915f[] $VALUES;
    public static final EnumC2915f FILL = new EnumC2915f("FILL", 0);
    public static final EnumC2915f FIT = new EnumC2915f("FIT", 1);

    private static final /* synthetic */ EnumC2915f[] $values() {
        return new EnumC2915f[]{FILL, FIT};
    }

    static {
        EnumC2915f[] enumC2915fArr$values = $values();
        $VALUES = enumC2915fArr$values;
        $ENTRIES = b8.m11548b(enumC2915fArr$values);
    }

    private EnumC2915f(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2915f valueOf(String str) {
        return (EnumC2915f) Enum.valueOf(EnumC2915f.class, str);
    }

    public static EnumC2915f[] values() {
        return (EnumC2915f[]) $VALUES.clone();
    }
}
