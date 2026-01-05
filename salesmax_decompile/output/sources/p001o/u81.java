package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u81 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ u81[] $VALUES;
    public static final u81 NONE = new u81("NONE", 0);
    public static final u81 X_AMZ_CONTENT_SHA256 = new u81("X_AMZ_CONTENT_SHA256", 1);

    private static final /* synthetic */ u81[] $values() {
        return new u81[]{NONE, X_AMZ_CONTENT_SHA256};
    }

    static {
        u81[] u81VarArr$values = $values();
        $VALUES = u81VarArr$values;
        $ENTRIES = hi6.m30609a(u81VarArr$values);
    }

    private u81(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static u81 valueOf(String str) {
        return (u81) Enum.valueOf(u81.class, str);
    }

    public static u81[] values() {
        return (u81[]) $VALUES.clone();
    }
}
