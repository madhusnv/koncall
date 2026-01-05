package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t81 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ t81[] $VALUES;
    public static final t81 HTTP_REQUEST_VIA_HEADERS = new t81("HTTP_REQUEST_VIA_HEADERS", 0);
    public static final t81 HTTP_REQUEST_VIA_QUERY_PARAMS = new t81("HTTP_REQUEST_VIA_QUERY_PARAMS", 1);
    public static final t81 HTTP_REQUEST_CHUNK = new t81("HTTP_REQUEST_CHUNK", 2);
    public static final t81 HTTP_REQUEST_TRAILING_HEADERS = new t81("HTTP_REQUEST_TRAILING_HEADERS", 3);
    public static final t81 HTTP_REQUEST_EVENT = new t81("HTTP_REQUEST_EVENT", 4);

    private static final /* synthetic */ t81[] $values() {
        return new t81[]{HTTP_REQUEST_VIA_HEADERS, HTTP_REQUEST_VIA_QUERY_PARAMS, HTTP_REQUEST_CHUNK, HTTP_REQUEST_TRAILING_HEADERS, HTTP_REQUEST_EVENT};
    }

    static {
        t81[] t81VarArr$values = $values();
        $VALUES = t81VarArr$values;
        $ENTRIES = hi6.m30609a(t81VarArr$values);
    }

    private t81(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static t81 valueOf(String str) {
        return (t81) Enum.valueOf(t81.class, str);
    }

    public static t81[] values() {
        return (t81[]) $VALUES.clone();
    }
}
