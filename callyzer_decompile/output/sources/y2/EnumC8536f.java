package y2;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y2.f */
/* loaded from: classes.dex */
public final class EnumC8536f {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8536f[] $VALUES;
    public static final EnumC8536f VIEW_APPEAR = new EnumC8536f("VIEW_APPEAR", 0);
    public static final EnumC8536f VIEW_DISAPPEAR = new EnumC8536f("VIEW_DISAPPEAR", 1);

    private static final /* synthetic */ EnumC8536f[] $values() {
        return new EnumC8536f[]{VIEW_APPEAR, VIEW_DISAPPEAR};
    }

    static {
        EnumC8536f[] enumC8536fArr$values = $values();
        $VALUES = enumC8536fArr$values;
        $ENTRIES = b8.m11548b(enumC8536fArr$values);
    }

    private EnumC8536f(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8536f valueOf(String str) {
        return (EnumC8536f) Enum.valueOf(EnumC8536f.class, str);
    }

    public static EnumC8536f[] values() {
        return (EnumC8536f[]) $VALUES.clone();
    }
}
