package zm;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zm.d */
/* loaded from: classes3.dex */
public final class EnumC8994d {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8994d[] $VALUES;
    private final int callType;
    private final String callTypeName;
    public static final EnumC8994d INCOMING = new EnumC8994d("INCOMING", 0, 1, "Incoming");
    public static final EnumC8994d OUTGOING = new EnumC8994d("OUTGOING", 1, 2, "Outgoing");
    public static final EnumC8994d MISSED = new EnumC8994d("MISSED", 2, 3, "Missed");
    public static final EnumC8994d REJECTED = new EnumC8994d("REJECTED", 3, 4, "Rejected");

    private static final /* synthetic */ EnumC8994d[] $values() {
        return new EnumC8994d[]{INCOMING, OUTGOING, MISSED, REJECTED};
    }

    static {
        EnumC8994d[] enumC8994dArr$values = $values();
        $VALUES = enumC8994dArr$values;
        $ENTRIES = b8.m11548b(enumC8994dArr$values);
    }

    private EnumC8994d(String str, int i10, int i11, String str2) {
        this.callType = i11;
        this.callTypeName = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8994d valueOf(String str) {
        return (EnumC8994d) Enum.valueOf(EnumC8994d.class, str);
    }

    public static EnumC8994d[] values() {
        return (EnumC8994d[]) $VALUES.clone();
    }

    public final String getTypeName() {
        return this.callTypeName;
    }

    public final int getTypeValue() {
        return this.callType;
    }
}
