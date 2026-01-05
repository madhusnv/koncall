package z7;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.n */
/* loaded from: classes.dex */
public final class EnumC8885n {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8885n[] $VALUES;
    public static final EnumC8885n NO_OP = new EnumC8885n("NO_OP", 0);
    public static final EnumC8885n ADD = new EnumC8885n("ADD", 1);
    public static final EnumC8885n REMOVE = new EnumC8885n("REMOVE", 2);

    private static final /* synthetic */ EnumC8885n[] $values() {
        return new EnumC8885n[]{NO_OP, ADD, REMOVE};
    }

    static {
        EnumC8885n[] enumC8885nArr$values = $values();
        $VALUES = enumC8885nArr$values;
        $ENTRIES = b8.m11548b(enumC8885nArr$values);
    }

    private EnumC8885n(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8885n valueOf(String str) {
        return (EnumC8885n) Enum.valueOf(EnumC8885n.class, str);
    }

    public static EnumC8885n[] values() {
        return (EnumC8885n[]) $VALUES.clone();
    }
}
