package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zfe {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ zfe[] $VALUES;
    public static final zfe DATE_TIME_TYPE = new zfe("DATE_TIME_TYPE", 0);
    public static final zfe INITIAL = new zfe("INITIAL", 1);
    public static final zfe CATEGORY = new zfe("CATEGORY", 2);

    private static final /* synthetic */ zfe[] $values() {
        return new zfe[]{DATE_TIME_TYPE, INITIAL, CATEGORY};
    }

    static {
        zfe[] zfeVarArr$values = $values();
        $VALUES = zfeVarArr$values;
        $ENTRIES = hi6.m30609a(zfeVarArr$values);
    }

    private zfe(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static zfe valueOf(String str) {
        return (zfe) Enum.valueOf(zfe.class, str);
    }

    public static zfe[] values() {
        return (zfe[]) $VALUES.clone();
    }
}
