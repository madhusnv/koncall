package ge;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ge.b */
/* loaded from: classes.dex */
public final class EnumC2570b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2570b[] $VALUES;
    private final boolean readEnabled;
    private final boolean writeEnabled;
    public static final EnumC2570b ENABLED = new EnumC2570b("ENABLED", 0, true, true);
    public static final EnumC2570b READ_ONLY = new EnumC2570b("READ_ONLY", 1, true, false);
    public static final EnumC2570b WRITE_ONLY = new EnumC2570b("WRITE_ONLY", 2, false, true);
    public static final EnumC2570b DISABLED = new EnumC2570b("DISABLED", 3, false, false);

    private static final /* synthetic */ EnumC2570b[] $values() {
        return new EnumC2570b[]{ENABLED, READ_ONLY, WRITE_ONLY, DISABLED};
    }

    static {
        EnumC2570b[] enumC2570bArr$values = $values();
        $VALUES = enumC2570bArr$values;
        $ENTRIES = b8.m11548b(enumC2570bArr$values);
    }

    private EnumC2570b(String str, int i10, boolean z6, boolean z10) {
        this.readEnabled = z6;
        this.writeEnabled = z10;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2570b valueOf(String str) {
        return (EnumC2570b) Enum.valueOf(EnumC2570b.class, str);
    }

    public static EnumC2570b[] values() {
        return (EnumC2570b[]) $VALUES.clone();
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
