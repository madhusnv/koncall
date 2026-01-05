package hd;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hd.t */
/* loaded from: classes.dex */
public final class EnumC2908t {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2908t[] $VALUES;
    public static final EnumC2908t Initial = new EnumC2908t("Initial", 0);
    public static final EnumC2908t ArrayFirstValueOrEnd = new EnumC2908t("ArrayFirstValueOrEnd", 1);
    public static final EnumC2908t ArrayNextValueOrEnd = new EnumC2908t("ArrayNextValueOrEnd", 2);
    public static final EnumC2908t ObjectFirstKeyOrEnd = new EnumC2908t("ObjectFirstKeyOrEnd", 3);
    public static final EnumC2908t ObjectNextKeyOrEnd = new EnumC2908t("ObjectNextKeyOrEnd", 4);
    public static final EnumC2908t ObjectFieldValue = new EnumC2908t("ObjectFieldValue", 5);

    private static final /* synthetic */ EnumC2908t[] $values() {
        return new EnumC2908t[]{Initial, ArrayFirstValueOrEnd, ArrayNextValueOrEnd, ObjectFirstKeyOrEnd, ObjectNextKeyOrEnd, ObjectFieldValue};
    }

    static {
        EnumC2908t[] enumC2908tArr$values = $values();
        $VALUES = enumC2908tArr$values;
        $ENTRIES = b8.m11548b(enumC2908tArr$values);
    }

    private EnumC2908t(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2908t valueOf(String str) {
        return (EnumC2908t) Enum.valueOf(EnumC2908t.class, str);
    }

    public static EnumC2908t[] values() {
        return (EnumC2908t[]) $VALUES.clone();
    }
}
