package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class qse {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ qse[] $VALUES;
    public static final qse LEGACY = new qse("LEGACY", 0);
    public static final qse STANDARD = new qse("STANDARD", 1);
    public static final qse ADAPTIVE = new qse("ADAPTIVE", 2);

    private static final /* synthetic */ qse[] $values() {
        return new qse[]{LEGACY, STANDARD, ADAPTIVE};
    }

    static {
        qse[] qseVarArr$values = $values();
        $VALUES = qseVarArr$values;
        $ENTRIES = hi6.m30609a(qseVarArr$values);
    }

    private qse(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static qse valueOf(String str) {
        return (qse) Enum.valueOf(qse.class, str);
    }

    public static qse[] values() {
        return (qse[]) $VALUES.clone();
    }
}
