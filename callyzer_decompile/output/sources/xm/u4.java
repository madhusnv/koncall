package xm;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class u4 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ u4[] $VALUES;
    public static final u4 FROM_VARIABLE = new u4("FROM_VARIABLE", 0);
    public static final u4 FROM_DATABASE = new u4("FROM_DATABASE", 1);
    public static final u4 FORCEFULLY_FETCH_AND_UPDATE = new u4("FORCEFULLY_FETCH_AND_UPDATE", 2);

    private static final /* synthetic */ u4[] $values() {
        return new u4[]{FROM_VARIABLE, FROM_DATABASE, FORCEFULLY_FETCH_AND_UPDATE};
    }

    static {
        u4[] u4VarArr$values = $values();
        $VALUES = u4VarArr$values;
        $ENTRIES = b8.m11548b(u4VarArr$values);
    }

    private u4(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static u4 valueOf(String str) {
        return (u4) Enum.valueOf(u4.class, str);
    }

    public static u4[] values() {
        return (u4[]) $VALUES.clone();
    }
}
