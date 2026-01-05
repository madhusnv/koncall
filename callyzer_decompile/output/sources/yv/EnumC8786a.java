package yv;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.a */
/* loaded from: classes3.dex */
public final class EnumC8786a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8786a[] $VALUES;
    public static final EnumC8786a LavaVariant1 = new EnumC8786a("LavaVariant1", 0);
    public static final EnumC8786a LavaVariant2 = new EnumC8786a("LavaVariant2", 1);
    public static final EnumC8786a LavaVariant3 = new EnumC8786a("LavaVariant3", 2);
    public static final EnumC8786a InfinixVariant1 = new EnumC8786a("InfinixVariant1", 3);
    public static final EnumC8786a InfinixVariant2 = new EnumC8786a("InfinixVariant2", 4);
    public static final EnumC8786a ItelVariant1 = new EnumC8786a("ItelVariant1", 5);
    public static final EnumC8786a ItelVariant2 = new EnumC8786a("ItelVariant2", 6);

    private static final /* synthetic */ EnumC8786a[] $values() {
        return new EnumC8786a[]{LavaVariant1, LavaVariant2, LavaVariant3, InfinixVariant1, InfinixVariant2, ItelVariant1, ItelVariant2};
    }

    static {
        EnumC8786a[] enumC8786aArr$values = $values();
        $VALUES = enumC8786aArr$values;
        $ENTRIES = b8.m11548b(enumC8786aArr$values);
    }

    private EnumC8786a(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8786a valueOf(String str) {
        return (EnumC8786a) Enum.valueOf(EnumC8786a.class, str);
    }

    public static EnumC8786a[] values() {
        return (EnumC8786a[]) $VALUES.clone();
    }
}
