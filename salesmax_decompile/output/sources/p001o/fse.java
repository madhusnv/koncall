package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class fse {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ fse[] $VALUES;
    public static final fse ServerSide = new fse("ServerSide", 0);
    public static final fse ClientSide = new fse("ClientSide", 1);
    public static final fse Throttling = new fse("Throttling", 2);
    public static final fse Transient = new fse("Transient", 3);

    private static final /* synthetic */ fse[] $values() {
        return new fse[]{ServerSide, ClientSide, Throttling, Transient};
    }

    static {
        fse[] fseVarArr$values = $values();
        $VALUES = fseVarArr$values;
        $ENTRIES = hi6.m30609a(fseVarArr$values);
    }

    private fse(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static fse valueOf(String str) {
        return (fse) Enum.valueOf(fse.class, str);
    }

    public static fse[] values() {
        return (fse[]) $VALUES.clone();
    }
}
