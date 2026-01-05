package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class cj9 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ cj9[] $VALUES;
    public static final cj9 SYNCHRONIZED = new cj9("SYNCHRONIZED", 0);
    public static final cj9 PUBLICATION = new cj9("PUBLICATION", 1);
    public static final cj9 NONE = new cj9("NONE", 2);

    private static final /* synthetic */ cj9[] $values() {
        return new cj9[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        cj9[] cj9VarArr$values = $values();
        $VALUES = cj9VarArr$values;
        $ENTRIES = hi6.m30609a(cj9VarArr$values);
    }

    private cj9(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static cj9 valueOf(String str) {
        return (cj9) Enum.valueOf(cj9.class, str);
    }

    public static cj9[] values() {
        return (cj9[]) $VALUES.clone();
    }
}
