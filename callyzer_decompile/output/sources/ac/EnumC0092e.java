package ac;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ac.e */
/* loaded from: classes.dex */
public final class EnumC0092e {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC0092e[] $VALUES;
    public static final EnumC0092e WHEN_SUPPORTED = new EnumC0092e("WHEN_SUPPORTED", 0);
    public static final EnumC0092e WHEN_REQUIRED = new EnumC0092e("WHEN_REQUIRED", 1);

    private static final /* synthetic */ EnumC0092e[] $values() {
        return new EnumC0092e[]{WHEN_SUPPORTED, WHEN_REQUIRED};
    }

    static {
        EnumC0092e[] enumC0092eArr$values = $values();
        $VALUES = enumC0092eArr$values;
        $ENTRIES = b8.m11548b(enumC0092eArr$values);
    }

    private EnumC0092e(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0092e valueOf(String str) {
        return (EnumC0092e) Enum.valueOf(EnumC0092e.class, str);
    }

    public static EnumC0092e[] values() {
        return (EnumC0092e[]) $VALUES.clone();
    }
}
