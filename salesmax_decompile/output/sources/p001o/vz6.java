package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class vz6 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ vz6[] $VALUES;
    public static final vz6 TOP_DOWN = new vz6("TOP_DOWN", 0);
    public static final vz6 BOTTOM_UP = new vz6("BOTTOM_UP", 1);

    private static final /* synthetic */ vz6[] $values() {
        return new vz6[]{TOP_DOWN, BOTTOM_UP};
    }

    static {
        vz6[] vz6VarArr$values = $values();
        $VALUES = vz6VarArr$values;
        $ENTRIES = hi6.m30609a(vz6VarArr$values);
    }

    private vz6(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static vz6 valueOf(String str) {
        return (vz6) Enum.valueOf(vz6.class, str);
    }

    public static vz6[] values() {
        return (vz6[]) $VALUES.clone();
    }
}
