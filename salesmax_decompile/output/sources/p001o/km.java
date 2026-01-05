package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class km {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ km[] $VALUES;
    public static final km ENGAGEMENT = new km("ENGAGEMENT", 0);
    public static final km RECORDING = new km("RECORDING", 1);
    public static final km DISPOSITION = new km("DISPOSITION", 2);

    private static final /* synthetic */ km[] $values() {
        return new km[]{ENGAGEMENT, RECORDING, DISPOSITION};
    }

    static {
        km[] kmVarArr$values = $values();
        $VALUES = kmVarArr$values;
        $ENTRIES = hi6.m30609a(kmVarArr$values);
    }

    private km(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static km valueOf(String str) {
        return (km) Enum.valueOf(km.class, str);
    }

    public static km[] values() {
        return (km[]) $VALUES.clone();
    }
}
