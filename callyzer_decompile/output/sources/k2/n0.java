package k2;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 IGNORED = new n0("IGNORED", 0);
    public static final n0 SCHEDULED = new n0("SCHEDULED", 1);
    public static final n0 DEFERRED = new n0("DEFERRED", 2);
    public static final n0 IMMINENT = new n0("IMMINENT", 3);

    private static final /* synthetic */ n0[] $values() {
        return new n0[]{IGNORED, SCHEDULED, DEFERRED, IMMINENT};
    }

    static {
        n0[] n0VarArr$values = $values();
        $VALUES = n0VarArr$values;
        $ENTRIES = b8.m11548b(n0VarArr$values);
    }

    private n0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}
