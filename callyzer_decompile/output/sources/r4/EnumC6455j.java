package r4;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.j */
/* loaded from: classes.dex */
public final class EnumC6455j {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6455j[] $VALUES;
    public static final EnumC6455j Ltr = new EnumC6455j("Ltr", 0);
    public static final EnumC6455j Rtl = new EnumC6455j("Rtl", 1);

    private static final /* synthetic */ EnumC6455j[] $values() {
        return new EnumC6455j[]{Ltr, Rtl};
    }

    static {
        EnumC6455j[] enumC6455jArr$values = $values();
        $VALUES = enumC6455jArr$values;
        $ENTRIES = b8.m11548b(enumC6455jArr$values);
    }

    private EnumC6455j(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6455j valueOf(String str) {
        return (EnumC6455j) Enum.valueOf(EnumC6455j.class, str);
    }

    public static EnumC6455j[] values() {
        return (EnumC6455j[]) $VALUES.clone();
    }
}
