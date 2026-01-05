package vx;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.a */
/* loaded from: classes3.dex */
public final class EnumC7799a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7799a[] $VALUES;
    public static final EnumC7799a SUSPEND = new EnumC7799a("SUSPEND", 0);
    public static final EnumC7799a DROP_OLDEST = new EnumC7799a("DROP_OLDEST", 1);
    public static final EnumC7799a DROP_LATEST = new EnumC7799a("DROP_LATEST", 2);

    private static final /* synthetic */ EnumC7799a[] $values() {
        return new EnumC7799a[]{SUSPEND, DROP_OLDEST, DROP_LATEST};
    }

    static {
        EnumC7799a[] enumC7799aArr$values = $values();
        $VALUES = enumC7799aArr$values;
        $ENTRIES = b8.m11548b(enumC7799aArr$values);
    }

    private EnumC7799a(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7799a valueOf(String str) {
        return (EnumC7799a) Enum.valueOf(EnumC7799a.class, str);
    }

    public static EnumC7799a[] values() {
        return (EnumC7799a[]) $VALUES.clone();
    }
}
