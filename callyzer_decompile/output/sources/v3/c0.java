package v3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 Measuring = new c0("Measuring", 0);
    public static final c0 LookaheadMeasuring = new c0("LookaheadMeasuring", 1);
    public static final c0 LayingOut = new c0("LayingOut", 2);
    public static final c0 LookaheadLayingOut = new c0("LookaheadLayingOut", 3);
    public static final c0 Idle = new c0("Idle", 4);

    private static final /* synthetic */ c0[] $values() {
        return new c0[]{Measuring, LookaheadMeasuring, LayingOut, LookaheadLayingOut, Idle};
    }

    static {
        c0[] c0VarArr$values = $values();
        $VALUES = c0VarArr$values;
        $ENTRIES = b8.m11548b(c0VarArr$values);
    }

    private c0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
