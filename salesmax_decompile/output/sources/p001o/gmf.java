package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class gmf {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ gmf[] $VALUES;
    public static final gmf START = new gmf("START", 0);
    public static final gmf STOP = new gmf("STOP", 1);
    public static final gmf STOP_AND_RESET_REPLAY_CACHE = new gmf("STOP_AND_RESET_REPLAY_CACHE", 2);

    private static final /* synthetic */ gmf[] $values() {
        return new gmf[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    static {
        gmf[] gmfVarArr$values = $values();
        $VALUES = gmfVarArr$values;
        $ENTRIES = hi6.m30609a(gmfVarArr$values);
    }

    private gmf(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static gmf valueOf(String str) {
        return (gmf) Enum.valueOf(gmf.class, str);
    }

    public static gmf[] values() {
        return (gmf[]) $VALUES.clone();
    }
}
