package w4;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.x */
/* loaded from: classes.dex */
public final class EnumC7932x {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7932x[] $VALUES;
    public static final EnumC7932x Inherit = new EnumC7932x("Inherit", 0);
    public static final EnumC7932x SecureOn = new EnumC7932x("SecureOn", 1);
    public static final EnumC7932x SecureOff = new EnumC7932x("SecureOff", 2);

    private static final /* synthetic */ EnumC7932x[] $values() {
        return new EnumC7932x[]{Inherit, SecureOn, SecureOff};
    }

    static {
        EnumC7932x[] enumC7932xArr$values = $values();
        $VALUES = enumC7932xArr$values;
        $ENTRIES = b8.m11548b(enumC7932xArr$values);
    }

    private EnumC7932x(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7932x valueOf(String str) {
        return (EnumC7932x) Enum.valueOf(EnumC7932x.class, str);
    }

    public static EnumC7932x[] values() {
        return (EnumC7932x[]) $VALUES.clone();
    }
}
