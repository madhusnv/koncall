package cs;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cs.t */
/* loaded from: classes3.dex */
public final class EnumC1501t {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC1501t[] $VALUES;
    public static final EnumC1501t MY_LEAD = new EnumC1501t("MY_LEAD", 0);
    public static final EnumC1501t SCHEDULED_LEAD = new EnumC1501t("SCHEDULED_LEAD", 1);
    public static final EnumC1501t DUE_LEAD = new EnumC1501t("DUE_LEAD", 2);

    private static final /* synthetic */ EnumC1501t[] $values() {
        return new EnumC1501t[]{MY_LEAD, SCHEDULED_LEAD, DUE_LEAD};
    }

    static {
        EnumC1501t[] enumC1501tArr$values = $values();
        $VALUES = enumC1501tArr$values;
        $ENTRIES = b8.m11548b(enumC1501tArr$values);
    }

    private EnumC1501t(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC1501t valueOf(String str) {
        return (EnumC1501t) Enum.valueOf(EnumC1501t.class, str);
    }

    public static EnumC1501t[] values() {
        return (EnumC1501t[]) $VALUES.clone();
    }
}
