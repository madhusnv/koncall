package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class zcj {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ zcj[] $VALUES;
    public final char begin;
    public final char end;
    public static final zcj OBJ = new zcj("OBJ", 0, '{', '}');
    public static final zcj LIST = new zcj("LIST", 1, '[', ']');
    public static final zcj MAP = new zcj("MAP", 2, '{', '}');
    public static final zcj POLY_OBJ = new zcj("POLY_OBJ", 3, '[', ']');

    private static final /* synthetic */ zcj[] $values() {
        return new zcj[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    static {
        zcj[] zcjVarArr$values = $values();
        $VALUES = zcjVarArr$values;
        $ENTRIES = hi6.m30609a(zcjVarArr$values);
    }

    private zcj(String str, int i, char c, char c2) {
        this.begin = c;
        this.end = c2;
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static zcj valueOf(String str) {
        return (zcj) Enum.valueOf(zcj.class, str);
    }

    public static zcj[] values() {
        return (zcj[]) $VALUES.clone();
    }
}
