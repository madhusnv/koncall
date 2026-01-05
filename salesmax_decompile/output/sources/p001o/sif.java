package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sif {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ sif[] $VALUES;
    public static final sif CALL_RECON_LOOK_BACK_THRESHOLD = new sif("CALL_RECON_LOOK_BACK_THRESHOLD", 0);
    public static final sif PERIODIC_LOCATION_TRACKING_INTERVAL = new sif("PERIODIC_LOCATION_TRACKING_INTERVAL", 1);
    public static final sif CALL_FLOW_MAX_WAIT_TIME = new sif("CALL_FLOW_MAX_WAIT_TIME", 2);
    public static final sif CONTACT_CACHE_REFRESH_DELAY = new sif("CONTACT_CACHE_REFRESH_DELAY", 3);

    private static final /* synthetic */ sif[] $values() {
        return new sif[]{CALL_RECON_LOOK_BACK_THRESHOLD, PERIODIC_LOCATION_TRACKING_INTERVAL, CALL_FLOW_MAX_WAIT_TIME, CONTACT_CACHE_REFRESH_DELAY};
    }

    static {
        sif[] sifVarArr$values = $values();
        $VALUES = sifVarArr$values;
        $ENTRIES = hi6.m30609a(sifVarArr$values);
    }

    private sif(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static sif valueOf(String str) {
        return (sif) Enum.valueOf(sif.class, str);
    }

    public static sif[] values() {
        return (sif[]) $VALUES.clone();
    }
}
