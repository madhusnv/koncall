package wx;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e1 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ e1[] $VALUES;
    public static final e1 START = new e1("START", 0);
    public static final e1 STOP = new e1("STOP", 1);
    public static final e1 STOP_AND_RESET_REPLAY_CACHE = new e1("STOP_AND_RESET_REPLAY_CACHE", 2);

    private static final /* synthetic */ e1[] $values() {
        return new e1[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    static {
        e1[] e1VarArr$values = $values();
        $VALUES = e1VarArr$values;
        $ENTRIES = b8.m11548b(e1VarArr$values);
    }

    private e1(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) $VALUES.clone();
    }
}
