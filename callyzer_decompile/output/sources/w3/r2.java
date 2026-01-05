package w3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r2 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ r2[] $VALUES;
    public static final r2 Shown = new r2("Shown", 0);
    public static final r2 Hidden = new r2("Hidden", 1);

    private static final /* synthetic */ r2[] $values() {
        return new r2[]{Shown, Hidden};
    }

    static {
        r2[] r2VarArr$values = $values();
        $VALUES = r2VarArr$values;
        $ENTRIES = b8.m11548b(r2VarArr$values);
    }

    private r2(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static r2 valueOf(String str) {
        return (r2) Enum.valueOf(r2.class, str);
    }

    public static r2[] values() {
        return (r2[]) $VALUES.clone();
    }
}
