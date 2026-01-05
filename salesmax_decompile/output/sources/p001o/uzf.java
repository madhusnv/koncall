package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uzf {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ uzf[] $VALUES;
    public static final uzf INTERNAL = new uzf("INTERNAL", 0);
    public static final uzf CLIENT = new uzf("CLIENT", 1);
    public static final uzf SERVER = new uzf("SERVER", 2);

    private static final /* synthetic */ uzf[] $values() {
        return new uzf[]{INTERNAL, CLIENT, SERVER};
    }

    static {
        uzf[] uzfVarArr$values = $values();
        $VALUES = uzfVarArr$values;
        $ENTRIES = hi6.m30609a(uzfVarArr$values);
    }

    private uzf(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static uzf valueOf(String str) {
        return (uzf) Enum.valueOf(uzf.class, str);
    }

    public static uzf[] values() {
        return (uzf[]) $VALUES.clone();
    }
}
