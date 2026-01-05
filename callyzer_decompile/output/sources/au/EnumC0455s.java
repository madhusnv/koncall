package au;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: au.s */
/* loaded from: classes3.dex */
public final class EnumC0455s {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC0455s[] $VALUES;
    public static final EnumC0455s REGISTRATION = new EnumC0455s("REGISTRATION", 0);
    public static final EnumC0455s DUAL_SIM = new EnumC0455s("DUAL_SIM", 1);

    private static final /* synthetic */ EnumC0455s[] $values() {
        return new EnumC0455s[]{REGISTRATION, DUAL_SIM};
    }

    static {
        EnumC0455s[] enumC0455sArr$values = $values();
        $VALUES = enumC0455sArr$values;
        $ENTRIES = b8.m11548b(enumC0455sArr$values);
    }

    private EnumC0455s(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0455s valueOf(String str) {
        return (EnumC0455s) Enum.valueOf(EnumC0455s.class, str);
    }

    public static EnumC0455s[] values() {
        return (EnumC0455s[]) $VALUES.clone();
    }
}
