package i0;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m2 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ m2[] $VALUES;
    public static final m2 FEATURE_COMBINATION_TABLE = new m2("FEATURE_COMBINATION_TABLE", 0);
    public static final m2 CAPTURE_SESSION_TABLES = new m2("CAPTURE_SESSION_TABLES", 1);

    private static final /* synthetic */ m2[] $values() {
        return new m2[]{FEATURE_COMBINATION_TABLE, CAPTURE_SESSION_TABLES};
    }

    static {
        m2[] m2VarArr$values = $values();
        $VALUES = m2VarArr$values;
        $ENTRIES = b8.m11548b(m2VarArr$values);
    }

    private m2(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static m2 valueOf(String str) {
        return (m2) Enum.valueOf(m2.class, str);
    }

    public static m2[] values() {
        return (m2[]) $VALUES.clone();
    }
}
