package k1;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ x0[] $VALUES;
    public static final x0 Vertical = new x0("Vertical", 0);
    public static final x0 Horizontal = new x0("Horizontal", 1);

    private static final /* synthetic */ x0[] $values() {
        return new x0[]{Vertical, Horizontal};
    }

    static {
        x0[] x0VarArr$values = $values();
        $VALUES = x0VarArr$values;
        $ENTRIES = b8.m11548b(x0VarArr$values);
    }

    private x0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) $VALUES.clone();
    }
}
