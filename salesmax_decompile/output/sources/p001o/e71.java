package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e71 implements lo1 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ e71[] $VALUES;
    private final String identifier;
    public static final e71 S3_EXPRESS_BUCKET = new e71("S3_EXPRESS_BUCKET", 0, "J");
    public static final e71 DDB_MAPPER = new e71("DDB_MAPPER", 1, "d");

    private static final /* synthetic */ e71[] $values() {
        return new e71[]{S3_EXPRESS_BUCKET, DDB_MAPPER};
    }

    static {
        e71[] e71VarArr$values = $values();
        $VALUES = e71VarArr$values;
        $ENTRIES = hi6.m30609a(e71VarArr$values);
    }

    private e71(String str, int i, String str2) {
        this.identifier = str2;
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static e71 valueOf(String str) {
        return (e71) Enum.valueOf(e71.class, str);
    }

    public static e71[] values() {
        return (e71[]) $VALUES.clone();
    }

    @Override // p001o.lo1
    public String getIdentifier() {
        return this.identifier;
    }
}
