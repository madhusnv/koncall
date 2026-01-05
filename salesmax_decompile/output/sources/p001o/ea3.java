package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ea3 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ ea3[] $VALUES;
    public static final ea3 NONE = new ea3("NONE", 0);
    public static final ea3 ALL_JSON_OBJECTS = new ea3("ALL_JSON_OBJECTS", 1);
    public static final ea3 POLYMORPHIC = new ea3("POLYMORPHIC", 2);

    private static final /* synthetic */ ea3[] $values() {
        return new ea3[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
    }

    static {
        ea3[] ea3VarArr$values = $values();
        $VALUES = ea3VarArr$values;
        $ENTRIES = hi6.m30609a(ea3VarArr$values);
    }

    private ea3(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static ea3 valueOf(String str) {
        return (ea3) Enum.valueOf(ea3.class, str);
    }

    public static ea3[] values() {
        return (ea3[]) $VALUES.clone();
    }
}
