package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wq3 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ wq3[] $VALUES;
    public static final wq3 PROFILE = new wq3("PROFILE", 0);
    public static final wq3 SSO_SESSION = new wq3("SSO_SESSION", 1);
    public static final wq3 SERVICES = new wq3("SERVICES", 2);
    public static final wq3 UNKNOWN = new wq3("UNKNOWN", 3);

    private static final /* synthetic */ wq3[] $values() {
        return new wq3[]{PROFILE, SSO_SESSION, SERVICES, UNKNOWN};
    }

    static {
        wq3[] wq3VarArr$values = $values();
        $VALUES = wq3VarArr$values;
        $ENTRIES = hi6.m30609a(wq3VarArr$values);
    }

    private wq3(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static wq3 valueOf(String str) {
        return (wq3) Enum.valueOf(wq3.class, str);
    }

    public static wq3[] values() {
        return (wq3[]) $VALUES.clone();
    }
}
