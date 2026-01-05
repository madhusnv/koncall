package zm;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zm.b */
/* loaded from: classes3.dex */
public final class EnumC8992b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8992b[] $VALUES;
    private final int bitValue;
    public static final EnumC8992b TEMPLATE_ADD = new EnumC8992b("TEMPLATE_ADD", 0, 1);
    public static final EnumC8992b TEMPLATE_UPDATED = new EnumC8992b("TEMPLATE_UPDATED", 1, 2);
    public static final EnumC8992b TEMPLATE_DELETED = new EnumC8992b("TEMPLATE_DELETED", 2, 4);
    public static final EnumC8992b TEMPLATE_DONE = new EnumC8992b("TEMPLATE_DONE", 3, 8);

    private static final /* synthetic */ EnumC8992b[] $values() {
        return new EnumC8992b[]{TEMPLATE_ADD, TEMPLATE_UPDATED, TEMPLATE_DELETED, TEMPLATE_DONE};
    }

    static {
        EnumC8992b[] enumC8992bArr$values = $values();
        $VALUES = enumC8992bArr$values;
        $ENTRIES = b8.m11548b(enumC8992bArr$values);
    }

    private EnumC8992b(String str, int i10, int i11) {
        this.bitValue = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8992b valueOf(String str) {
        return (EnumC8992b) Enum.valueOf(EnumC8992b.class, str);
    }

    public static EnumC8992b[] values() {
        return (EnumC8992b[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.bitValue;
    }
}
