package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class cyh {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ cyh[] $VALUES;
    public static final cyh SUCCESSFUL = new cyh("SUCCESSFUL", 0);
    public static final cyh REREGISTER = new cyh("REREGISTER", 1);
    public static final cyh CANCELLED = new cyh("CANCELLED", 2);
    public static final cyh ALREADY_SELECTED = new cyh("ALREADY_SELECTED", 3);

    private static final /* synthetic */ cyh[] $values() {
        return new cyh[]{SUCCESSFUL, REREGISTER, CANCELLED, ALREADY_SELECTED};
    }

    static {
        cyh[] cyhVarArr$values = $values();
        $VALUES = cyhVarArr$values;
        $ENTRIES = hi6.m30609a(cyhVarArr$values);
    }

    private cyh(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static cyh valueOf(String str) {
        return (cyh) Enum.valueOf(cyh.class, str);
    }

    public static cyh[] values() {
        return (cyh[]) $VALUES.clone();
    }
}
