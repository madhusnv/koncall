package nd;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nd.b */
/* loaded from: classes.dex */
public final class EnumC5011b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC5011b[] $VALUES;
    public static final EnumC5011b Error = new EnumC5011b("Error", 0);
    public static final EnumC5011b Warning = new EnumC5011b("Warning", 1);
    public static final EnumC5011b Info = new EnumC5011b("Info", 2);
    public static final EnumC5011b Debug = new EnumC5011b("Debug", 3);
    public static final EnumC5011b Trace = new EnumC5011b("Trace", 4);

    private static final /* synthetic */ EnumC5011b[] $values() {
        return new EnumC5011b[]{Error, Warning, Info, Debug, Trace};
    }

    static {
        EnumC5011b[] enumC5011bArr$values = $values();
        $VALUES = enumC5011bArr$values;
        $ENTRIES = b8.m11548b(enumC5011bArr$values);
    }

    private EnumC5011b(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5011b valueOf(String str) {
        return (EnumC5011b) Enum.valueOf(EnumC5011b.class, str);
    }

    public static EnumC5011b[] values() {
        return (EnumC5011b[]) $VALUES.clone();
    }
}
