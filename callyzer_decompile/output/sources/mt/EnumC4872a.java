package mt;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mt.a */
/* loaded from: classes3.dex */
public final class EnumC4872a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC4872a[] $VALUES;
    public static final EnumC4872a MaxTemplateCarSelected = new EnumC4872a("MaxTemplateCarSelected", 0);
    public static final EnumC4872a NO_INTERNET_CONNECTION = new EnumC4872a("NO_INTERNET_CONNECTION", 1);
    public static final EnumC4872a SUBSCRIPTION_EXPAIRED = new EnumC4872a("SUBSCRIPTION_EXPAIRED", 2);
    public static final EnumC4872a COPY_TO_BOARD = new EnumC4872a("COPY_TO_BOARD", 3);

    private static final /* synthetic */ EnumC4872a[] $values() {
        return new EnumC4872a[]{MaxTemplateCarSelected, NO_INTERNET_CONNECTION, SUBSCRIPTION_EXPAIRED, COPY_TO_BOARD};
    }

    static {
        EnumC4872a[] enumC4872aArr$values = $values();
        $VALUES = enumC4872aArr$values;
        $ENTRIES = b8.m11548b(enumC4872aArr$values);
    }

    private EnumC4872a(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4872a valueOf(String str) {
        return (EnumC4872a) Enum.valueOf(EnumC4872a.class, str);
    }

    public static EnumC4872a[] values() {
        return (EnumC4872a[]) $VALUES.clone();
    }
}
