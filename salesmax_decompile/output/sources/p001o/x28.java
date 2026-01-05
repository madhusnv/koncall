package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class x28 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ x28[] $VALUES;
    public static final x28 CONNECT_TIMEOUT = new x28("CONNECT_TIMEOUT", 0);
    public static final x28 CONNECTION_ACQUIRE_TIMEOUT = new x28("CONNECTION_ACQUIRE_TIMEOUT", 1);
    public static final x28 TLS_NEGOTIATION_TIMEOUT = new x28("TLS_NEGOTIATION_TIMEOUT", 2);
    public static final x28 TLS_NEGOTIATION_ERROR = new x28("TLS_NEGOTIATION_ERROR", 3);
    public static final x28 CONNECTION_CLOSED = new x28("CONNECTION_CLOSED", 4);
    public static final x28 SOCKET_TIMEOUT = new x28("SOCKET_TIMEOUT", 5);
    public static final x28 PROTOCOL_NEGOTIATION_ERROR = new x28("PROTOCOL_NEGOTIATION_ERROR", 6);
    public static final x28 SDK_UNKNOWN = new x28("SDK_UNKNOWN", 7);

    private static final /* synthetic */ x28[] $values() {
        return new x28[]{CONNECT_TIMEOUT, CONNECTION_ACQUIRE_TIMEOUT, TLS_NEGOTIATION_TIMEOUT, TLS_NEGOTIATION_ERROR, CONNECTION_CLOSED, SOCKET_TIMEOUT, PROTOCOL_NEGOTIATION_ERROR, SDK_UNKNOWN};
    }

    static {
        x28[] x28VarArr$values = $values();
        $VALUES = x28VarArr$values;
        $ENTRIES = hi6.m30609a(x28VarArr$values);
    }

    private x28(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static x28 valueOf(String str) {
        return (x28) Enum.valueOf(x28.class, str);
    }

    public static x28[] values() {
        return (x28[]) $VALUES.clone();
    }
}
