package fk;

import lj.InterfaceC4483f;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.n */
/* loaded from: classes.dex */
public final class EnumC2308n implements InterfaceC4483f {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2308n[] $VALUES;
    public static final EnumC2308n EVENT_TYPE_UNKNOWN = new EnumC2308n("EVENT_TYPE_UNKNOWN", 0, 0);
    public static final EnumC2308n SESSION_START = new EnumC2308n("SESSION_START", 1, 1);
    private final int number;

    private static final /* synthetic */ EnumC2308n[] $values() {
        return new EnumC2308n[]{EVENT_TYPE_UNKNOWN, SESSION_START};
    }

    static {
        EnumC2308n[] enumC2308nArr$values = $values();
        $VALUES = enumC2308nArr$values;
        $ENTRIES = b8.m11548b(enumC2308nArr$values);
    }

    private EnumC2308n(String str, int i10, int i11) {
        this.number = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2308n valueOf(String str) {
        return (EnumC2308n) Enum.valueOf(EnumC2308n.class, str);
    }

    public static EnumC2308n[] values() {
        return (EnumC2308n[]) $VALUES.clone();
    }

    @Override // lj.InterfaceC4483f
    public int getNumber() {
        return this.number;
    }
}
