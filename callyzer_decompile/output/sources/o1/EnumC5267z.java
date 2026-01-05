package o1;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.z */
/* loaded from: classes.dex */
public final class EnumC5267z {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC5267z[] $VALUES;
    public static final EnumC5267z Vertical = new EnumC5267z("Vertical", 0);
    public static final EnumC5267z Horizontal = new EnumC5267z("Horizontal", 1);
    public static final EnumC5267z Both = new EnumC5267z("Both", 2);

    private static final /* synthetic */ EnumC5267z[] $values() {
        return new EnumC5267z[]{Vertical, Horizontal, Both};
    }

    static {
        EnumC5267z[] enumC5267zArr$values = $values();
        $VALUES = enumC5267zArr$values;
        $ENTRIES = b8.m11548b(enumC5267zArr$values);
    }

    private EnumC5267z(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5267z valueOf(String str) {
        return (EnumC5267z) Enum.valueOf(EnumC5267z.class, str);
    }

    public static EnumC5267z[] values() {
        return (EnumC5267z[]) $VALUES.clone();
    }
}
