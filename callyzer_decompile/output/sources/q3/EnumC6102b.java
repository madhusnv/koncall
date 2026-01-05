package q3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q3.b */
/* loaded from: classes.dex */
public final class EnumC6102b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6102b[] $VALUES;
    public static final EnumC6102b Lsq2 = new EnumC6102b("Lsq2", 0);
    public static final EnumC6102b Impulse = new EnumC6102b("Impulse", 1);

    private static final /* synthetic */ EnumC6102b[] $values() {
        return new EnumC6102b[]{Lsq2, Impulse};
    }

    static {
        EnumC6102b[] enumC6102bArr$values = $values();
        $VALUES = enumC6102bArr$values;
        $ENTRIES = b8.m11548b(enumC6102bArr$values);
    }

    private EnumC6102b(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6102b valueOf(String str) {
        return (EnumC6102b) Enum.valueOf(EnumC6102b.class, str);
    }

    public static EnumC6102b[] values() {
        return (EnumC6102b[]) $VALUES.clone();
    }
}
