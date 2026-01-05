package zm;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zm.a */
/* loaded from: classes3.dex */
public final class EnumC8991a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8991a[] $VALUES;
    private final int bitValue;
    public static final EnumC8991a SYNC_NEW = new EnumC8991a("SYNC_NEW", 0, 1);
    public static final EnumC8991a SYNC_DONE = new EnumC8991a("SYNC_DONE", 1, 2);
    public static final EnumC8991a SYNC_NOTE_UPDATE = new EnumC8991a("SYNC_NOTE_UPDATE", 2, 4);
    public static final EnumC8991a SYNC_CALL_RECORDING_UPDATE = new EnumC8991a("SYNC_CALL_RECORDING_UPDATE", 3, 8);

    private static final /* synthetic */ EnumC8991a[] $values() {
        return new EnumC8991a[]{SYNC_NEW, SYNC_DONE, SYNC_NOTE_UPDATE, SYNC_CALL_RECORDING_UPDATE};
    }

    static {
        EnumC8991a[] enumC8991aArr$values = $values();
        $VALUES = enumC8991aArr$values;
        $ENTRIES = b8.m11548b(enumC8991aArr$values);
    }

    private EnumC8991a(String str, int i10, int i11) {
        this.bitValue = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8991a valueOf(String str) {
        return (EnumC8991a) Enum.valueOf(EnumC8991a.class, str);
    }

    public static EnumC8991a[] values() {
        return (EnumC8991a[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.bitValue;
    }
}
