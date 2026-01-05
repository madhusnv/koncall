package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class j84 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ j84[] $VALUES;
    public static final j84 COROUTINE_SUSPENDED = new j84("COROUTINE_SUSPENDED", 0);
    public static final j84 UNDECIDED = new j84("UNDECIDED", 1);
    public static final j84 RESUMED = new j84("RESUMED", 2);

    private static final /* synthetic */ j84[] $values() {
        return new j84[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    static {
        j84[] j84VarArr$values = $values();
        $VALUES = j84VarArr$values;
        $ENTRIES = hi6.m30609a(j84VarArr$values);
    }

    private j84(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static j84 valueOf(String str) {
        return (j84) Enum.valueOf(j84.class, str);
    }

    public static j84[] values() {
        return (j84[]) $VALUES.clone();
    }
}
