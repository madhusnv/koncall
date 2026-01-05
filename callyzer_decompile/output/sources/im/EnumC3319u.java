package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.u */
/* loaded from: classes3.dex */
public final class EnumC3319u {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3319u[] $VALUES;
    public static final EnumC3319u INCOMING = new EnumC3319u("INCOMING", 0);
    public static final EnumC3319u OUTGOING = new EnumC3319u("OUTGOING", 1);
    public static final EnumC3319u MISSED = new EnumC3319u("MISSED", 2);
    public static final EnumC3319u REJECTED = new EnumC3319u("REJECTED", 3);
    public static final EnumC3319u TOTAL_PHONE_CALL = new EnumC3319u("TOTAL_PHONE_CALL", 4);
    public static final EnumC3319u NEVER_ATTENDED_CALL = new EnumC3319u("NEVER_ATTENDED_CALL", 5);
    public static final EnumC3319u NOT_PICKUP_BY_CLIENT = new EnumC3319u("NOT_PICKUP_BY_CLIENT", 6);
    public static final EnumC3319u UNIQUE_CALL = new EnumC3319u("UNIQUE_CALL", 7);
    public static final EnumC3319u CONNECTED_CALL = new EnumC3319u("CONNECTED_CALL", 8);
    public static final EnumC3319u UNIQUE_CONNECTED_CALL = new EnumC3319u("UNIQUE_CONNECTED_CALL", 9);
    public static final EnumC3319u WORKING_HOURS = new EnumC3319u("WORKING_HOURS", 10);

    private static final /* synthetic */ EnumC3319u[] $values() {
        return new EnumC3319u[]{INCOMING, OUTGOING, MISSED, REJECTED, TOTAL_PHONE_CALL, NEVER_ATTENDED_CALL, NOT_PICKUP_BY_CLIENT, UNIQUE_CALL, CONNECTED_CALL, UNIQUE_CONNECTED_CALL, WORKING_HOURS};
    }

    static {
        EnumC3319u[] enumC3319uArr$values = $values();
        $VALUES = enumC3319uArr$values;
        $ENTRIES = b8.m11548b(enumC3319uArr$values);
    }

    private EnumC3319u(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3319u valueOf(String str) {
        return (EnumC3319u) Enum.valueOf(EnumC3319u.class, str);
    }

    public static EnumC3319u[] values() {
        return (EnumC3319u[]) $VALUES.clone();
    }
}
