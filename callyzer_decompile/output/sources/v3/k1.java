package v3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ k1[] $VALUES;
    public static final k1 Width = new k1("Width", 0);
    public static final k1 Height = new k1("Height", 1);

    private static final /* synthetic */ k1[] $values() {
        return new k1[]{Width, Height};
    }

    static {
        k1[] k1VarArr$values = $values();
        $VALUES = k1VarArr$values;
        $ENTRIES = b8.m11548b(k1VarArr$values);
    }

    private k1(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) $VALUES.clone();
    }
}
