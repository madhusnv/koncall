package tq;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tq.p */
/* loaded from: classes3.dex */
public final class EnumC7204p {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7204p[] $VALUES;
    public static final EnumC7204p ALL = new EnumC7204p("ALL", 0);
    public static final EnumC7204p SIM1 = new EnumC7204p("SIM1", 1);
    public static final EnumC7204p SIM2 = new EnumC7204p("SIM2", 2);
    public static final EnumC7204p DEFAULT = new EnumC7204p("DEFAULT", 3);

    private static final /* synthetic */ EnumC7204p[] $values() {
        return new EnumC7204p[]{ALL, SIM1, SIM2, DEFAULT};
    }

    static {
        EnumC7204p[] enumC7204pArr$values = $values();
        $VALUES = enumC7204pArr$values;
        $ENTRIES = b8.m11548b(enumC7204pArr$values);
    }

    private EnumC7204p(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7204p valueOf(String str) {
        return (EnumC7204p) Enum.valueOf(EnumC7204p.class, str);
    }

    public static EnumC7204p[] values() {
        return (EnumC7204p[]) $VALUES.clone();
    }
}
