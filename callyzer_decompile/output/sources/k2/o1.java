package k2;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o1 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ o1[] $VALUES;
    public static final o1 ShutDown = new o1("ShutDown", 0);
    public static final o1 ShuttingDown = new o1("ShuttingDown", 1);
    public static final o1 Inactive = new o1("Inactive", 2);
    public static final o1 InactivePendingWork = new o1("InactivePendingWork", 3);
    public static final o1 Idle = new o1("Idle", 4);
    public static final o1 PendingWork = new o1("PendingWork", 5);

    private static final /* synthetic */ o1[] $values() {
        return new o1[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
    }

    static {
        o1[] o1VarArr$values = $values();
        $VALUES = o1VarArr$values;
        $ENTRIES = b8.m11548b(o1VarArr$values);
    }

    private o1(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) $VALUES.clone();
    }
}
