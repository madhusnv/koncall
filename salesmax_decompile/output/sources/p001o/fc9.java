package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class fc9 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ fc9[] $VALUES;
    public static final fc9 PUBLIC = new fc9("PUBLIC", 0);
    public static final fc9 PROTECTED = new fc9("PROTECTED", 1);
    public static final fc9 INTERNAL = new fc9("INTERNAL", 2);
    public static final fc9 PRIVATE = new fc9("PRIVATE", 3);

    private static final /* synthetic */ fc9[] $values() {
        return new fc9[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    static {
        fc9[] fc9VarArr$values = $values();
        $VALUES = fc9VarArr$values;
        $ENTRIES = hi6.m30609a(fc9VarArr$values);
    }

    private fc9(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static fc9 valueOf(String str) {
        return (fc9) Enum.valueOf(fc9.class, str);
    }

    public static fc9[] values() {
        return (fc9[]) $VALUES.clone();
    }
}
