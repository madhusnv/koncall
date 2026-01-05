package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class sge {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ sge[] $VALUES;
    public static final sge CANON_EQ;
    public static final sge COMMENTS;
    public static final sge DOT_MATCHES_ALL;
    public static final sge IGNORE_CASE;
    public static final sge LITERAL;
    public static final sge MULTILINE;
    public static final sge UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ sge[] $values() {
        return new sge[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        int i = 2;
        IGNORE_CASE = new sge("IGNORE_CASE", 0, i, 0, 2, null);
        int i2 = 0;
        int i3 = 2;
        id5 id5Var = null;
        MULTILINE = new sge("MULTILINE", 1, 8, i2, i3, id5Var);
        int i4 = 0;
        int i5 = 2;
        id5 id5Var2 = null;
        LITERAL = new sge("LITERAL", i, 16, i4, i5, id5Var2);
        UNIX_LINES = new sge("UNIX_LINES", 3, 1, i2, i3, id5Var);
        COMMENTS = new sge("COMMENTS", 4, 4, i4, i5, id5Var2);
        DOT_MATCHES_ALL = new sge("DOT_MATCHES_ALL", 5, 32, i2, i3, id5Var);
        CANON_EQ = new sge("CANON_EQ", 6, 128, i4, i5, id5Var2);
        sge[] sgeVarArr$values = $values();
        $VALUES = sgeVarArr$values;
        $ENTRIES = hi6.m30609a(sgeVarArr$values);
    }

    private sge(String str, int i, int i2, int i3) {
        this.value = i2;
        this.mask = i3;
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static sge valueOf(String str) {
        return (sge) Enum.valueOf(sge.class, str);
    }

    public static sge[] values() {
        return (sge[]) $VALUES.clone();
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }

    public /* synthetic */ sge(String str, int i, int i2, int i3, int i4, id5 id5Var) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }
}
