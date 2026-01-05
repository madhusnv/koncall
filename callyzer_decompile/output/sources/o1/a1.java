package o1;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ a1[] $VALUES;
    public static final a1 Min = new a1("Min", 0);
    public static final a1 Max = new a1("Max", 1);

    private static final /* synthetic */ a1[] $values() {
        return new a1[]{Min, Max};
    }

    static {
        a1[] a1VarArr$values = $values();
        $VALUES = a1VarArr$values;
        $ENTRIES = b8.m11548b(a1VarArr$values);
    }

    private a1(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) $VALUES.clone();
    }
}
