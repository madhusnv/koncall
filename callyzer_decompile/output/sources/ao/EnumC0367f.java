package ao;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ao.f */
/* loaded from: classes3.dex */
public final class EnumC0367f {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC0367f[] $VALUES;
    public static final EnumC0367f COMPLETE = new EnumC0367f("COMPLETE", 0);
    public static final EnumC0367f CORRUPT = new EnumC0367f("CORRUPT", 1);
    public static final EnumC0367f FAKE = new EnumC0367f("FAKE", 2);

    private static final /* synthetic */ EnumC0367f[] $values() {
        return new EnumC0367f[]{COMPLETE, CORRUPT, FAKE};
    }

    static {
        EnumC0367f[] enumC0367fArr$values = $values();
        $VALUES = enumC0367fArr$values;
        $ENTRIES = b8.m11548b(enumC0367fArr$values);
    }

    private EnumC0367f(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0367f valueOf(String str) {
        return (EnumC0367f) Enum.valueOf(EnumC0367f.class, str);
    }

    public static EnumC0367f[] values() {
        return (EnumC0367f[]) $VALUES.clone();
    }
}
