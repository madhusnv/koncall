package ac;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ac.d */
/* loaded from: classes.dex */
public final class EnumC0091d {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC0091d[] $VALUES;
    public static final EnumC0091d WHEN_SUPPORTED = new EnumC0091d("WHEN_SUPPORTED", 0);
    public static final EnumC0091d WHEN_REQUIRED = new EnumC0091d("WHEN_REQUIRED", 1);

    private static final /* synthetic */ EnumC0091d[] $values() {
        return new EnumC0091d[]{WHEN_SUPPORTED, WHEN_REQUIRED};
    }

    static {
        EnumC0091d[] enumC0091dArr$values = $values();
        $VALUES = enumC0091dArr$values;
        $ENTRIES = b8.m11548b(enumC0091dArr$values);
    }

    private EnumC0091d(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0091d valueOf(String str) {
        return (EnumC0091d) Enum.valueOf(EnumC0091d.class, str);
    }

    public static EnumC0091d[] values() {
        return (EnumC0091d[]) $VALUES.clone();
    }
}
