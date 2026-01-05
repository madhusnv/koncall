package ay;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ay.c */
/* loaded from: classes3.dex */
public final class EnumC0493c {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC0493c[] $VALUES;
    public static final EnumC0493c CPU_ACQUIRED = new EnumC0493c("CPU_ACQUIRED", 0);
    public static final EnumC0493c BLOCKING = new EnumC0493c("BLOCKING", 1);
    public static final EnumC0493c PARKING = new EnumC0493c("PARKING", 2);
    public static final EnumC0493c DORMANT = new EnumC0493c("DORMANT", 3);
    public static final EnumC0493c TERMINATED = new EnumC0493c("TERMINATED", 4);

    private static final /* synthetic */ EnumC0493c[] $values() {
        return new EnumC0493c[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
    }

    static {
        EnumC0493c[] enumC0493cArr$values = $values();
        $VALUES = enumC0493cArr$values;
        $ENTRIES = b8.m11548b(enumC0493cArr$values);
    }

    private EnumC0493c(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0493c valueOf(String str) {
        return (EnumC0493c) Enum.valueOf(EnumC0493c.class, str);
    }

    public static EnumC0493c[] values() {
        return (EnumC0493c[]) $VALUES.clone();
    }
}
