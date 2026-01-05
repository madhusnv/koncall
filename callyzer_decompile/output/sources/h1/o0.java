package h1;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 Restart = new o0("Restart", 0);
    public static final o0 Reverse = new o0("Reverse", 1);

    private static final /* synthetic */ o0[] $values() {
        return new o0[]{Restart, Reverse};
    }

    static {
        o0[] o0VarArr$values = $values();
        $VALUES = o0VarArr$values;
        $ENTRIES = b8.m11548b(o0VarArr$values);
    }

    private o0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
