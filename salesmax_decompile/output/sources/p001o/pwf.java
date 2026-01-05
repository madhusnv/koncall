package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class pwf implements lo1 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ pwf[] $VALUES;
    private final String identifier;
    public static final pwf WAITER = new pwf("WAITER", 0, "B");
    public static final pwf PAGINATOR = new pwf("PAGINATOR", 1, "C");
    public static final pwf RETRY_MODE_STANDARD = new pwf("RETRY_MODE_STANDARD", 2, "E");
    public static final pwf RETRY_MODE_ADAPTIVE = new pwf("RETRY_MODE_ADAPTIVE", 3, "F");
    public static final pwf GZIP_REQUEST_COMPRESSION = new pwf("GZIP_REQUEST_COMPRESSION", 4, "L");
    public static final pwf PROTOCOL_RPC_V2_CBOR = new pwf("PROTOCOL_RPC_V2_CBOR", 5, "M");
    public static final pwf SERVICE_ENDPOINT_OVERRIDE = new pwf("SERVICE_ENDPOINT_OVERRIDE", 6, "N");
    public static final pwf ACCOUNT_ID_BASED_ENDPOINT = new pwf("ACCOUNT_ID_BASED_ENDPOINT", 7, "O");
    public static final pwf SIGV4A_SIGNING = new pwf("SIGV4A_SIGNING", 8, "S");

    private static final /* synthetic */ pwf[] $values() {
        return new pwf[]{WAITER, PAGINATOR, RETRY_MODE_STANDARD, RETRY_MODE_ADAPTIVE, GZIP_REQUEST_COMPRESSION, PROTOCOL_RPC_V2_CBOR, SERVICE_ENDPOINT_OVERRIDE, ACCOUNT_ID_BASED_ENDPOINT, SIGV4A_SIGNING};
    }

    static {
        pwf[] pwfVarArr$values = $values();
        $VALUES = pwfVarArr$values;
        $ENTRIES = hi6.m30609a(pwfVarArr$values);
    }

    private pwf(String str, int i, String str2) {
        this.identifier = str2;
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static pwf valueOf(String str) {
        return (pwf) Enum.valueOf(pwf.class, str);
    }

    public static pwf[] values() {
        return (pwf[]) $VALUES.clone();
    }

    @Override // p001o.lo1
    public String getIdentifier() {
        return this.identifier;
    }
}
