package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class enh {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ enh[] $VALUES;
    public static final enh TLS_1_0 = new enh("TLS_1_0", 0);
    public static final enh TLS_1_1 = new enh("TLS_1_1", 1);
    public static final enh TLS_1_2 = new enh("TLS_1_2", 2);
    public static final enh TLS_1_3 = new enh("TLS_1_3", 3);

    private static final /* synthetic */ enh[] $values() {
        return new enh[]{TLS_1_0, TLS_1_1, TLS_1_2, TLS_1_3};
    }

    static {
        enh[] enhVarArr$values = $values();
        $VALUES = enhVarArr$values;
        $ENTRIES = hi6.m30609a(enhVarArr$values);
    }

    private enh(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static enh valueOf(String str) {
        return (enh) Enum.valueOf(enh.class, str);
    }

    public static enh[] values() {
        return (enh[]) $VALUES.clone();
    }
}
