package d3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 CounterClockwise = new f0("CounterClockwise", 0);
    public static final f0 Clockwise = new f0("Clockwise", 1);

    private static final /* synthetic */ f0[] $values() {
        return new f0[]{CounterClockwise, Clockwise};
    }

    static {
        f0[] f0VarArr$values = $values();
        $VALUES = f0VarArr$values;
        $ENTRIES = b8.m11548b(f0VarArr$values);
    }

    private f0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }
}
