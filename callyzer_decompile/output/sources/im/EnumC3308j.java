package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.j */
/* loaded from: classes3.dex */
public final class EnumC3308j {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3308j[] $VALUES;
    public static final EnumC3308j AccountDeleted = new EnumC3308j("AccountDeleted", 0);
    public static final EnumC3308j AccountNumChanged = new EnumC3308j("AccountNumChanged", 1);
    public static final EnumC3308j SIMChange = new EnumC3308j("SIMChange", 2);
    public static final EnumC3308j Nothing = new EnumC3308j("Nothing", 3);

    private static final /* synthetic */ EnumC3308j[] $values() {
        return new EnumC3308j[]{AccountDeleted, AccountNumChanged, SIMChange, Nothing};
    }

    static {
        EnumC3308j[] enumC3308jArr$values = $values();
        $VALUES = enumC3308jArr$values;
        $ENTRIES = b8.m11548b(enumC3308jArr$values);
    }

    private EnumC3308j(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3308j valueOf(String str) {
        return (EnumC3308j) Enum.valueOf(EnumC3308j.class, str);
    }

    public static EnumC3308j[] values() {
        return (EnumC3308j[]) $VALUES.clone();
    }
}
