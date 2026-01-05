package z7;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 DEFERRED = new d0("DEFERRED", 0);
    public static final d0 IMMEDIATE = new d0("IMMEDIATE", 1);
    public static final d0 EXCLUSIVE = new d0("EXCLUSIVE", 2);

    private static final /* synthetic */ d0[] $values() {
        return new d0[]{DEFERRED, IMMEDIATE, EXCLUSIVE};
    }

    static {
        d0[] d0VarArr$values = $values();
        $VALUES = d0VarArr$values;
        $ENTRIES = b8.m11548b(d0VarArr$values);
    }

    private d0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }
}
