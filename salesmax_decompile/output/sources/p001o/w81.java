package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w81 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ w81[] $VALUES;
    public static final w81 SIGV4 = new w81("SIGV4", 0);
    public static final w81 SIGV4_ASYMMETRIC = new w81("SIGV4_ASYMMETRIC", 1);

    private static final /* synthetic */ w81[] $values() {
        return new w81[]{SIGV4, SIGV4_ASYMMETRIC};
    }

    static {
        w81[] w81VarArr$values = $values();
        $VALUES = w81VarArr$values;
        $ENTRIES = hi6.m30609a(w81VarArr$values);
    }

    private w81(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static w81 valueOf(String str) {
        return (w81) Enum.valueOf(w81.class, str);
    }

    public static w81[] values() {
        return (w81[]) $VALUES.clone();
    }
}
