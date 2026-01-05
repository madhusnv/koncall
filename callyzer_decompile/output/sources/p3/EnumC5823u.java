package p3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.u */
/* loaded from: classes.dex */
public final class EnumC5823u {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC5823u[] $VALUES;
    public static final EnumC5823u Unknown = new EnumC5823u("Unknown", 0);
    public static final EnumC5823u Dispatching = new EnumC5823u("Dispatching", 1);
    public static final EnumC5823u NotDispatching = new EnumC5823u("NotDispatching", 2);

    private static final /* synthetic */ EnumC5823u[] $values() {
        return new EnumC5823u[]{Unknown, Dispatching, NotDispatching};
    }

    static {
        EnumC5823u[] enumC5823uArr$values = $values();
        $VALUES = enumC5823uArr$values;
        $ENTRIES = b8.m11548b(enumC5823uArr$values);
    }

    private EnumC5823u(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5823u valueOf(String str) {
        return (EnumC5823u) Enum.valueOf(EnumC5823u.class, str);
    }

    public static EnumC5823u[] values() {
        return (EnumC5823u[]) $VALUES.clone();
    }
}
