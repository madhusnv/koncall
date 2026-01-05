package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ogb {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ ogb[] $VALUES;
    public static final ogb FIRST = new ogb("FIRST", 0, "awaitFirst");
    public static final ogb FIRST_OR_DEFAULT = new ogb("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
    public static final ogb LAST = new ogb("LAST", 2, "awaitLast");
    public static final ogb SINGLE = new ogb("SINGLE", 3, "awaitSingle");

    /* renamed from: s */
    public final String f38338s;

    private static final /* synthetic */ ogb[] $values() {
        return new ogb[]{FIRST, FIRST_OR_DEFAULT, LAST, SINGLE};
    }

    static {
        ogb[] ogbVarArr$values = $values();
        $VALUES = ogbVarArr$values;
        $ENTRIES = hi6.m30609a(ogbVarArr$values);
    }

    private ogb(String str, int i, String str2) {
        this.f38338s = str2;
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static ogb valueOf(String str) {
        return (ogb) Enum.valueOf(ogb.class, str);
    }

    public static ogb[] values() {
        return (ogb[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38338s;
    }
}
