package o1;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ c1[] $VALUES;
    public static final c1 Horizontal = new c1("Horizontal", 0);
    public static final c1 Vertical = new c1("Vertical", 1);

    private static final /* synthetic */ c1[] $values() {
        return new c1[]{Horizontal, Vertical};
    }

    static {
        c1[] c1VarArr$values = $values();
        $VALUES = c1VarArr$values;
        $ENTRIES = b8.m11548b(c1VarArr$values);
    }

    private c1(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) $VALUES.clone();
    }
}
