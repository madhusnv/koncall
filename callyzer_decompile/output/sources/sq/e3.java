package sq;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e3 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ e3[] $VALUES;
    public static final e3 LR = new e3("LR", 0);
    public static final e3 RL = new e3("RL", 1);

    private static final /* synthetic */ e3[] $values() {
        return new e3[]{LR, RL};
    }

    static {
        e3[] e3VarArr$values = $values();
        $VALUES = e3VarArr$values;
        $ENTRIES = b8.m11548b(e3VarArr$values);
    }

    private e3(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static e3 valueOf(String str) {
        return (e3) Enum.valueOf(e3.class, str);
    }

    public static e3[] values() {
        return (e3[]) $VALUES.clone();
    }
}
