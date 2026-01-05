package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kdg {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ kdg[] $VALUES;
    public static final kdg NOT_INITIALIZED = new kdg("NOT_INITIALIZED", 0);
    public static final kdg INITIALIZED = new kdg("INITIALIZED", 1);
    public static final kdg EXPLICIT_CONFIG = new kdg("EXPLICIT_CONFIG", 2);
    public static final kdg EXPLICIT_INSTANCE = new kdg("EXPLICIT_INSTANCE", 3);

    private static final /* synthetic */ kdg[] $values() {
        return new kdg[]{NOT_INITIALIZED, INITIALIZED, EXPLICIT_CONFIG, EXPLICIT_INSTANCE};
    }

    static {
        kdg[] kdgVarArr$values = $values();
        $VALUES = kdgVarArr$values;
        $ENTRIES = hi6.m30609a(kdgVarArr$values);
    }

    private kdg(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static kdg valueOf(String str) {
        return (kdg) Enum.valueOf(kdg.class, str);
    }

    public static kdg[] values() {
        return (kdg[]) $VALUES.clone();
    }
}
