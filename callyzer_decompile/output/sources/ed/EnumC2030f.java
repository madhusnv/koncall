package ed;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ed.f */
/* loaded from: classes.dex */
public final class EnumC2030f {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2030f[] $VALUES;
    public static final EnumC2030f ServerSide = new EnumC2030f("ServerSide", 0);
    public static final EnumC2030f ClientSide = new EnumC2030f("ClientSide", 1);
    public static final EnumC2030f Throttling = new EnumC2030f("Throttling", 2);
    public static final EnumC2030f Transient = new EnumC2030f("Transient", 3);

    private static final /* synthetic */ EnumC2030f[] $values() {
        return new EnumC2030f[]{ServerSide, ClientSide, Throttling, Transient};
    }

    static {
        EnumC2030f[] enumC2030fArr$values = $values();
        $VALUES = enumC2030fArr$values;
        $ENTRIES = b8.m11548b(enumC2030fArr$values);
    }

    private EnumC2030f(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2030f valueOf(String str) {
        return (EnumC2030f) Enum.valueOf(EnumC2030f.class, str);
    }

    public static EnumC2030f[] values() {
        return (EnumC2030f[]) $VALUES.clone();
    }
}
