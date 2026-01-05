package rv;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 NO_SIM = new q0("NO_SIM", 0);
    public static final q0 REGISTRATION = new q0("REGISTRATION", 1);
    public static final q0 DUAL_SIM = new q0("DUAL_SIM", 2);
    public static final q0 LOADING = new q0("LOADING", 3);

    private static final /* synthetic */ q0[] $values() {
        return new q0[]{NO_SIM, REGISTRATION, DUAL_SIM, LOADING};
    }

    static {
        q0[] q0VarArr$values = $values();
        $VALUES = q0VarArr$values;
        $ENTRIES = b8.m11548b(q0VarArr$values);
    }

    private q0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }
}
