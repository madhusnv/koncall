package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class fj6 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ fj6[] $VALUES;
    public static final C13462a Companion;
    private final int httpCode;
    public static final fj6 NO_ERROR = new fj6("NO_ERROR", 0, 0);
    public static final fj6 PROTOCOL_ERROR = new fj6("PROTOCOL_ERROR", 1, 1);
    public static final fj6 INTERNAL_ERROR = new fj6("INTERNAL_ERROR", 2, 2);
    public static final fj6 FLOW_CONTROL_ERROR = new fj6("FLOW_CONTROL_ERROR", 3, 3);
    public static final fj6 SETTINGS_TIMEOUT = new fj6("SETTINGS_TIMEOUT", 4, 4);
    public static final fj6 STREAM_CLOSED = new fj6("STREAM_CLOSED", 5, 5);
    public static final fj6 FRAME_SIZE_ERROR = new fj6("FRAME_SIZE_ERROR", 6, 6);
    public static final fj6 REFUSED_STREAM = new fj6("REFUSED_STREAM", 7, 7);
    public static final fj6 CANCEL = new fj6("CANCEL", 8, 8);
    public static final fj6 COMPRESSION_ERROR = new fj6("COMPRESSION_ERROR", 9, 9);
    public static final fj6 CONNECT_ERROR = new fj6("CONNECT_ERROR", 10, 10);
    public static final fj6 ENHANCE_YOUR_CALM = new fj6("ENHANCE_YOUR_CALM", 11, 11);
    public static final fj6 INADEQUATE_SECURITY = new fj6("INADEQUATE_SECURITY", 12, 12);
    public static final fj6 HTTP_1_1_REQUIRED = new fj6("HTTP_1_1_REQUIRED", 13, 13);

    /* renamed from: o.fj6$a */
    public static final class C13462a {
        public C13462a() {
        }

        public /* synthetic */ C13462a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final fj6 m26902a(int i) {
            for (fj6 fj6Var : fj6.values()) {
                if (fj6Var.getHttpCode() == i) {
                    return fj6Var;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ fj6[] $values() {
        return new fj6[]{NO_ERROR, PROTOCOL_ERROR, INTERNAL_ERROR, FLOW_CONTROL_ERROR, SETTINGS_TIMEOUT, STREAM_CLOSED, FRAME_SIZE_ERROR, REFUSED_STREAM, CANCEL, COMPRESSION_ERROR, CONNECT_ERROR, ENHANCE_YOUR_CALM, INADEQUATE_SECURITY, HTTP_1_1_REQUIRED};
    }

    static {
        fj6[] fj6VarArr$values = $values();
        $VALUES = fj6VarArr$values;
        $ENTRIES = hi6.m30609a(fj6VarArr$values);
        Companion = new C13462a(null);
    }

    private fj6(String str, int i, int i2) {
        this.httpCode = i2;
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static fj6 valueOf(String str) {
        return (fj6) Enum.valueOf(fj6.class, str);
    }

    public static fj6[] values() {
        return (fj6[]) $VALUES.clone();
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
