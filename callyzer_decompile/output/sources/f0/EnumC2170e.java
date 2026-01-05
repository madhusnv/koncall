package f0;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f0.e */
/* loaded from: classes.dex */
public final class EnumC2170e {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2170e[] $VALUES;
    public static final EnumC2170e OFF = new EnumC2170e("OFF", 0);
    public static final EnumC2170e ON = new EnumC2170e("ON", 1);
    public static final EnumC2170e PREVIEW = new EnumC2170e("PREVIEW", 2);

    private static final /* synthetic */ EnumC2170e[] $values() {
        return new EnumC2170e[]{OFF, ON, PREVIEW};
    }

    static {
        EnumC2170e[] enumC2170eArr$values = $values();
        $VALUES = enumC2170eArr$values;
        $ENTRIES = b8.m11548b(enumC2170eArr$values);
    }

    private EnumC2170e(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2170e valueOf(String str) {
        return (EnumC2170e) Enum.valueOf(EnumC2170e.class, str);
    }

    public static EnumC2170e[] values() {
        return (EnumC2170e[]) $VALUES.clone();
    }
}
