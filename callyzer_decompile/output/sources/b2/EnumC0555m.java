package b2;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.m */
/* loaded from: classes.dex */
public final class EnumC0555m {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC0555m[] $VALUES;
    public static final EnumC0555m CROSSED = new EnumC0555m("CROSSED", 0);
    public static final EnumC0555m NOT_CROSSED = new EnumC0555m("NOT_CROSSED", 1);
    public static final EnumC0555m COLLAPSED = new EnumC0555m("COLLAPSED", 2);

    private static final /* synthetic */ EnumC0555m[] $values() {
        return new EnumC0555m[]{CROSSED, NOT_CROSSED, COLLAPSED};
    }

    static {
        EnumC0555m[] enumC0555mArr$values = $values();
        $VALUES = enumC0555mArr$values;
        $ENTRIES = b8.m11548b(enumC0555mArr$values);
    }

    private EnumC0555m(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0555m valueOf(String str) {
        return (EnumC0555m) Enum.valueOf(EnumC0555m.class, str);
    }

    public static EnumC0555m[] values() {
        return (EnumC0555m[]) $VALUES.clone();
    }
}
