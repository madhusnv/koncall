package b3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b3.b */
/* loaded from: classes.dex */
public final class EnumC0570b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC0570b[] $VALUES;
    public static final EnumC0570b None = new EnumC0570b("None", 0);
    public static final EnumC0570b Cancelled = new EnumC0570b("Cancelled", 1);
    public static final EnumC0570b Redirected = new EnumC0570b("Redirected", 2);
    public static final EnumC0570b RedirectCancelled = new EnumC0570b("RedirectCancelled", 3);

    private static final /* synthetic */ EnumC0570b[] $values() {
        return new EnumC0570b[]{None, Cancelled, Redirected, RedirectCancelled};
    }

    static {
        EnumC0570b[] enumC0570bArr$values = $values();
        $VALUES = enumC0570bArr$values;
        $ENTRIES = b8.m11548b(enumC0570bArr$values);
    }

    private EnumC0570b(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0570b valueOf(String str) {
        return (EnumC0570b) Enum.valueOf(EnumC0570b.class, str);
    }

    public static EnumC0570b[] values() {
        return (EnumC0570b[]) $VALUES.clone();
    }
}
