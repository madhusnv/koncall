package t3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 Min = new m0("Min", 0);
    public static final m0 Max = new m0("Max", 1);

    private static final /* synthetic */ m0[] $values() {
        return new m0[]{Min, Max};
    }

    static {
        m0[] m0VarArr$values = $values();
        $VALUES = m0VarArr$values;
        $ENTRIES = b8.m11548b(m0VarArr$values);
    }

    private m0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }
}
