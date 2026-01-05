package f4;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f4.a */
/* loaded from: classes.dex */
public final class EnumC2203a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2203a[] $VALUES;
    public static final EnumC2203a On = new EnumC2203a("On", 0);
    public static final EnumC2203a Off = new EnumC2203a("Off", 1);
    public static final EnumC2203a Indeterminate = new EnumC2203a("Indeterminate", 2);

    private static final /* synthetic */ EnumC2203a[] $values() {
        return new EnumC2203a[]{On, Off, Indeterminate};
    }

    static {
        EnumC2203a[] enumC2203aArr$values = $values();
        $VALUES = enumC2203aArr$values;
        $ENTRIES = b8.m11548b(enumC2203aArr$values);
    }

    private EnumC2203a(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2203a valueOf(String str) {
        return (EnumC2203a) Enum.valueOf(EnumC2203a.class, str);
    }

    public static EnumC2203a[] values() {
        return (EnumC2203a[]) $VALUES.clone();
    }
}
