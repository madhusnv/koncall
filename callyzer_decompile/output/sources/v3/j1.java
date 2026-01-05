package v3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 Min = new j1("Min", 0);
    public static final j1 Max = new j1("Max", 1);

    private static final /* synthetic */ j1[] $values() {
        return new j1[]{Min, Max};
    }

    static {
        j1[] j1VarArr$values = $values();
        $VALUES = j1VarArr$values;
        $ENTRIES = b8.m11548b(j1VarArr$values);
    }

    private j1(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }
}
