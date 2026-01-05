package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class mbj {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ mbj[] $VALUES;
    public static final mbj RECONCILIATION = new mbj("RECONCILIATION", 0);
    public static final mbj RECONCILIATION_CHAIN = new mbj("RECONCILIATION_CHAIN", 1);
    public static final mbj CALL_RECONCILIATION = new mbj("CALL_RECONCILIATION", 2);
    public static final mbj RECORDING_RECONCILIATION = new mbj("RECORDING_RECONCILIATION", 3);
    public static final mbj ENGAGEMENT_CLEANUP = new mbj("ENGAGEMENT_CLEANUP", 4);
    public static final mbj LOCATION_RECONCILIATION = new mbj("LOCATION_RECONCILIATION", 5);
    public static final mbj APP_VERSION_UPDATE = new mbj("APP_VERSION_UPDATE", 6);

    private static final /* synthetic */ mbj[] $values() {
        return new mbj[]{RECONCILIATION, RECONCILIATION_CHAIN, CALL_RECONCILIATION, RECORDING_RECONCILIATION, ENGAGEMENT_CLEANUP, LOCATION_RECONCILIATION, APP_VERSION_UPDATE};
    }

    static {
        mbj[] mbjVarArr$values = $values();
        $VALUES = mbjVarArr$values;
        $ENTRIES = hi6.m30609a(mbjVarArr$values);
    }

    private mbj(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static mbj valueOf(String str) {
        return (mbj) Enum.valueOf(mbj.class, str);
    }

    public static mbj[] values() {
        return (mbj[]) $VALUES.clone();
    }
}
