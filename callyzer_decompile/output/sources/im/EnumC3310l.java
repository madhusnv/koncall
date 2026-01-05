package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.l */
/* loaded from: classes3.dex */
public final class EnumC3310l {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3310l[] $VALUES;
    public static final EnumC3310l FrequentContactCalls = new EnumC3310l("FrequentContactCalls", 0);
    public static final EnumC3310l AtoZ = new EnumC3310l("AtoZ", 1);
    public static final EnumC3310l Refresh = new EnumC3310l("Refresh", 2);

    private static final /* synthetic */ EnumC3310l[] $values() {
        return new EnumC3310l[]{FrequentContactCalls, AtoZ, Refresh};
    }

    static {
        EnumC3310l[] enumC3310lArr$values = $values();
        $VALUES = enumC3310lArr$values;
        $ENTRIES = b8.m11548b(enumC3310lArr$values);
    }

    private EnumC3310l(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3310l valueOf(String str) {
        return (EnumC3310l) Enum.valueOf(EnumC3310l.class, str);
    }

    public static EnumC3310l[] values() {
        return (EnumC3310l[]) $VALUES.clone();
    }
}
