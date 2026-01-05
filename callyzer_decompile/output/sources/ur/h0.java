package ur;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 DATE_FILTER = new h0("DATE_FILTER", 0);
    public static final h0 EXCLUDE_NUMBER = new h0("EXCLUDE_NUMBER", 1);
    public static final h0 SIM_FILTER = new h0("SIM_FILTER", 2);
    public static final h0 CALL_TYPE = new h0("CALL_TYPE", 3);

    private static final /* synthetic */ h0[] $values() {
        return new h0[]{DATE_FILTER, EXCLUDE_NUMBER, SIM_FILTER, CALL_TYPE};
    }

    static {
        h0[] h0VarArr$values = $values();
        $VALUES = h0VarArr$values;
        $ENTRIES = b8.m11548b(h0VarArr$values);
    }

    private h0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
