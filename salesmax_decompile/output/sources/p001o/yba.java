package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class yba {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ yba[] $VALUES;
    public static final yba Initial = new yba("Initial", 0);
    public static final yba ArrayFirstValueOrEnd = new yba("ArrayFirstValueOrEnd", 1);
    public static final yba ArrayNextValueOrEnd = new yba("ArrayNextValueOrEnd", 2);
    public static final yba ObjectFirstKeyOrEnd = new yba("ObjectFirstKeyOrEnd", 3);
    public static final yba ObjectNextKeyOrEnd = new yba("ObjectNextKeyOrEnd", 4);
    public static final yba ObjectFieldValue = new yba("ObjectFieldValue", 5);

    private static final /* synthetic */ yba[] $values() {
        return new yba[]{Initial, ArrayFirstValueOrEnd, ArrayNextValueOrEnd, ObjectFirstKeyOrEnd, ObjectNextKeyOrEnd, ObjectFieldValue};
    }

    static {
        yba[] ybaVarArr$values = $values();
        $VALUES = ybaVarArr$values;
        $ENTRIES = hi6.m30609a(ybaVarArr$values);
    }

    private yba(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static yba valueOf(String str) {
        return (yba) Enum.valueOf(yba.class, str);
    }

    public static yba[] values() {
        return (yba[]) $VALUES.clone();
    }
}
