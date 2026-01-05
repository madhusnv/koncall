package xm;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class r4 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ r4[] $VALUES;
    public static final r4 FromVariable = new r4("FromVariable", 0);
    public static final r4 FromDataStore = new r4("FromDataStore", 1);
    public static final r4 FromApi = new r4("FromApi", 2);

    private static final /* synthetic */ r4[] $values() {
        return new r4[]{FromVariable, FromDataStore, FromApi};
    }

    static {
        r4[] r4VarArr$values = $values();
        $VALUES = r4VarArr$values;
        $ENTRIES = b8.m11548b(r4VarArr$values);
    }

    private r4(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static r4 valueOf(String str) {
        return (r4) Enum.valueOf(r4.class, str);
    }

    public static r4[] values() {
        return (r4[]) $VALUES.clone();
    }
}
