package p3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.k */
/* loaded from: classes.dex */
public final class EnumC5813k {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC5813k[] $VALUES;
    public static final EnumC5813k Initial = new EnumC5813k("Initial", 0);
    public static final EnumC5813k Main = new EnumC5813k("Main", 1);
    public static final EnumC5813k Final = new EnumC5813k("Final", 2);

    private static final /* synthetic */ EnumC5813k[] $values() {
        return new EnumC5813k[]{Initial, Main, Final};
    }

    static {
        EnumC5813k[] enumC5813kArr$values = $values();
        $VALUES = enumC5813kArr$values;
        $ENTRIES = b8.m11548b(enumC5813kArr$values);
    }

    private EnumC5813k(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5813k valueOf(String str) {
        return (EnumC5813k) Enum.valueOf(EnumC5813k.class, str);
    }

    public static EnumC5813k[] values() {
        return (EnumC5813k[]) $VALUES.clone();
    }
}
