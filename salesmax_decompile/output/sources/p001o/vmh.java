package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class vmh {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ vmh[] $VALUES;
    public static final vmh ISO_8601 = new vmh("ISO_8601", 0);
    public static final vmh ISO_8601_CONDENSED = new vmh("ISO_8601_CONDENSED", 1);
    public static final vmh ISO_8601_CONDENSED_DATE = new vmh("ISO_8601_CONDENSED_DATE", 2);
    public static final vmh ISO_8601_FULL = new vmh("ISO_8601_FULL", 3);
    public static final vmh RFC_5322 = new vmh("RFC_5322", 4);
    public static final vmh EPOCH_SECONDS = new vmh("EPOCH_SECONDS", 5);

    private static final /* synthetic */ vmh[] $values() {
        return new vmh[]{ISO_8601, ISO_8601_CONDENSED, ISO_8601_CONDENSED_DATE, ISO_8601_FULL, RFC_5322, EPOCH_SECONDS};
    }

    static {
        vmh[] vmhVarArr$values = $values();
        $VALUES = vmhVarArr$values;
        $ENTRIES = hi6.m30609a(vmhVarArr$values);
    }

    private vmh(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static vmh valueOf(String str) {
        return (vmh) Enum.valueOf(vmh.class, str);
    }

    public static vmh[] values() {
        return (vmh[]) $VALUES.clone();
    }
}
