package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class xz4 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ xz4[] $VALUES;
    public static final xz4 Today = new xz4("Today", 0);
    public static final xz4 Yesterday = new xz4("Yesterday", 1);
    public static final xz4 ThisWeek = new xz4("ThisWeek", 2);
    public static final xz4 ThisMonth = new xz4("ThisMonth", 3);
    public static final xz4 ThisYear = new xz4("ThisYear", 4);
    public static final xz4 Others = new xz4("Others", 5);

    private static final /* synthetic */ xz4[] $values() {
        return new xz4[]{Today, Yesterday, ThisWeek, ThisMonth, ThisYear, Others};
    }

    static {
        xz4[] xz4VarArr$values = $values();
        $VALUES = xz4VarArr$values;
        $ENTRIES = hi6.m30609a(xz4VarArr$values);
    }

    private xz4(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static xz4 valueOf(String str) {
        return (xz4) Enum.valueOf(xz4.class, str);
    }

    public static xz4[] values() {
        return (xz4[]) $VALUES.clone();
    }
}
