package td;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: td.t */
/* loaded from: classes.dex */
public final class EnumC7143t {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7143t[] $VALUES;
    public static final EnumC7143t ISO_8601 = new EnumC7143t("ISO_8601", 0);
    public static final EnumC7143t ISO_8601_CONDENSED = new EnumC7143t("ISO_8601_CONDENSED", 1);
    public static final EnumC7143t ISO_8601_CONDENSED_DATE = new EnumC7143t("ISO_8601_CONDENSED_DATE", 2);
    public static final EnumC7143t ISO_8601_FULL = new EnumC7143t("ISO_8601_FULL", 3);
    public static final EnumC7143t RFC_5322 = new EnumC7143t("RFC_5322", 4);
    public static final EnumC7143t EPOCH_SECONDS = new EnumC7143t("EPOCH_SECONDS", 5);

    private static final /* synthetic */ EnumC7143t[] $values() {
        return new EnumC7143t[]{ISO_8601, ISO_8601_CONDENSED, ISO_8601_CONDENSED_DATE, ISO_8601_FULL, RFC_5322, EPOCH_SECONDS};
    }

    static {
        EnumC7143t[] enumC7143tArr$values = $values();
        $VALUES = enumC7143tArr$values;
        $ENTRIES = b8.m11548b(enumC7143tArr$values);
    }

    private EnumC7143t(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7143t valueOf(String str) {
        return (EnumC7143t) Enum.valueOf(EnumC7143t.class, str);
    }

    public static EnumC7143t[] values() {
        return (EnumC7143t[]) $VALUES.clone();
    }
}
