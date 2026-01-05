package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ge {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ ge[] $VALUES;
    public static final ge PREFERRED = new ge("PREFERRED", 0);
    public static final ge DISABLED = new ge("DISABLED", 1);
    public static final ge REQUIRED = new ge("REQUIRED", 2);

    private static final /* synthetic */ ge[] $values() {
        return new ge[]{PREFERRED, DISABLED, REQUIRED};
    }

    static {
        ge[] geVarArr$values = $values();
        $VALUES = geVarArr$values;
        $ENTRIES = hi6.m30609a(geVarArr$values);
    }

    private ge(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static ge valueOf(String str) {
        return (ge) Enum.valueOf(ge.class, str);
    }

    public static ge[] values() {
        return (ge[]) $VALUES.clone();
    }
}
