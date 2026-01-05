package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.t */
/* loaded from: classes3.dex */
public final class EnumC3318t {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3318t[] $VALUES;
    public static final EnumC3318t DeviceDelete = new EnumC3318t("DeviceDelete", 0);
    public static final EnumC3318t DeviceRestored = new EnumC3318t("DeviceRestored", 1);

    private static final /* synthetic */ EnumC3318t[] $values() {
        return new EnumC3318t[]{DeviceDelete, DeviceRestored};
    }

    static {
        EnumC3318t[] enumC3318tArr$values = $values();
        $VALUES = enumC3318tArr$values;
        $ENTRIES = b8.m11548b(enumC3318tArr$values);
    }

    private EnumC3318t(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3318t valueOf(String str) {
        return (EnumC3318t) Enum.valueOf(EnumC3318t.class, str);
    }

    public static EnumC3318t[] values() {
        return (EnumC3318t[]) $VALUES.clone();
    }
}
