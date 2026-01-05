package tq;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tq.n */
/* loaded from: classes3.dex */
public final class EnumC7202n {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7202n[] $VALUES;
    public static final EnumC7202n ALL = new EnumC7202n("ALL", 0);
    public static final EnumC7202n INCOMING = new EnumC7202n("INCOMING", 1);
    public static final EnumC7202n OUTGOING = new EnumC7202n("OUTGOING", 2);
    public static final EnumC7202n MISSED = new EnumC7202n("MISSED", 3);
    public static final EnumC7202n REJECTED = new EnumC7202n("REJECTED", 4);

    private static final /* synthetic */ EnumC7202n[] $values() {
        return new EnumC7202n[]{ALL, INCOMING, OUTGOING, MISSED, REJECTED};
    }

    static {
        EnumC7202n[] enumC7202nArr$values = $values();
        $VALUES = enumC7202nArr$values;
        $ENTRIES = b8.m11548b(enumC7202nArr$values);
    }

    private EnumC7202n(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7202n valueOf(String str) {
        return (EnumC7202n) Enum.valueOf(EnumC7202n.class, str);
    }

    public static EnumC7202n[] values() {
        return (EnumC7202n[]) $VALUES.clone();
    }
}
