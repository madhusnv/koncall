package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class wl1 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ wl1[] $VALUES;
    public static final wl1 SUSPEND = new wl1("SUSPEND", 0);
    public static final wl1 DROP_OLDEST = new wl1("DROP_OLDEST", 1);
    public static final wl1 DROP_LATEST = new wl1("DROP_LATEST", 2);

    private static final /* synthetic */ wl1[] $values() {
        return new wl1[]{SUSPEND, DROP_OLDEST, DROP_LATEST};
    }

    static {
        wl1[] wl1VarArr$values = $values();
        $VALUES = wl1VarArr$values;
        $ENTRIES = hi6.m30609a(wl1VarArr$values);
    }

    private wl1(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static wl1 valueOf(String str) {
        return (wl1) Enum.valueOf(wl1.class, str);
    }

    public static wl1[] values() {
        return (wl1[]) $VALUES.clone();
    }
}
