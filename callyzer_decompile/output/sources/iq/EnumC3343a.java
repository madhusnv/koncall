package iq;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iq.a */
/* loaded from: classes3.dex */
public final class EnumC3343a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3343a[] $VALUES;
    public static final EnumC3343a NavigateToMessageTemplate = new EnumC3343a("NavigateToMessageTemplate", 0);
    public static final EnumC3343a SubscriptionExpaired = new EnumC3343a("SubscriptionExpaired", 1);

    private static final /* synthetic */ EnumC3343a[] $values() {
        return new EnumC3343a[]{NavigateToMessageTemplate, SubscriptionExpaired};
    }

    static {
        EnumC3343a[] enumC3343aArr$values = $values();
        $VALUES = enumC3343aArr$values;
        $ENTRIES = b8.m11548b(enumC3343aArr$values);
    }

    private EnumC3343a(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3343a valueOf(String str) {
        return (EnumC3343a) Enum.valueOf(EnumC3343a.class, str);
    }

    public static EnumC3343a[] values() {
        return (EnumC3343a[]) $VALUES.clone();
    }
}
