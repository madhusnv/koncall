package yb;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yb.c */
/* loaded from: classes.dex */
public final class EnumC8611c implements InterfaceC8609a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8611c[] $VALUES;
    private final String identifier;
    public static final EnumC8611c WAITER = new EnumC8611c("WAITER", 0, "B");
    public static final EnumC8611c PAGINATOR = new EnumC8611c("PAGINATOR", 1, "C");
    public static final EnumC8611c RETRY_MODE_STANDARD = new EnumC8611c("RETRY_MODE_STANDARD", 2, "E");
    public static final EnumC8611c RETRY_MODE_ADAPTIVE = new EnumC8611c("RETRY_MODE_ADAPTIVE", 3, "F");
    public static final EnumC8611c GZIP_REQUEST_COMPRESSION = new EnumC8611c("GZIP_REQUEST_COMPRESSION", 4, "L");
    public static final EnumC8611c PROTOCOL_RPC_V2_CBOR = new EnumC8611c("PROTOCOL_RPC_V2_CBOR", 5, "M");
    public static final EnumC8611c SERVICE_ENDPOINT_OVERRIDE = new EnumC8611c("SERVICE_ENDPOINT_OVERRIDE", 6, "N");
    public static final EnumC8611c ACCOUNT_ID_BASED_ENDPOINT = new EnumC8611c("ACCOUNT_ID_BASED_ENDPOINT", 7, "O");
    public static final EnumC8611c ACCOUNT_ID_MODE_PREFERRED = new EnumC8611c("ACCOUNT_ID_MODE_PREFERRED", 8, "P");
    public static final EnumC8611c ACCOUNT_ID_MODE_DISABLED = new EnumC8611c("ACCOUNT_ID_MODE_DISABLED", 9, "Q");
    public static final EnumC8611c ACCOUNT_ID_MODE_REQUIRED = new EnumC8611c("ACCOUNT_ID_MODE_REQUIRED", 10, "R");
    public static final EnumC8611c SIGV4A_SIGNING = new EnumC8611c("SIGV4A_SIGNING", 11, "S");
    public static final EnumC8611c RESOLVED_ACCOUNT_ID = new EnumC8611c("RESOLVED_ACCOUNT_ID", 12, "T");
    public static final EnumC8611c FLEXIBLE_CHECKSUMS_REQ_CRC32 = new EnumC8611c("FLEXIBLE_CHECKSUMS_REQ_CRC32", 13, "U");
    public static final EnumC8611c FLEXIBLE_CHECKSUMS_REQ_CRC32C = new EnumC8611c("FLEXIBLE_CHECKSUMS_REQ_CRC32C", 14, "V");
    public static final EnumC8611c FLEXIBLE_CHECKSUMS_REQ_SHA1 = new EnumC8611c("FLEXIBLE_CHECKSUMS_REQ_SHA1", 15, "X");
    public static final EnumC8611c FLEXIBLE_CHECKSUMS_REQ_SHA256 = new EnumC8611c("FLEXIBLE_CHECKSUMS_REQ_SHA256", 16, "Y");
    public static final EnumC8611c FLEXIBLE_CHECKSUMS_REQ_WHEN_SUPPORTED = new EnumC8611c("FLEXIBLE_CHECKSUMS_REQ_WHEN_SUPPORTED", 17, "Z");
    public static final EnumC8611c FLEXIBLE_CHECKSUMS_REQ_WHEN_REQUIRED = new EnumC8611c("FLEXIBLE_CHECKSUMS_REQ_WHEN_REQUIRED", 18, "a");
    public static final EnumC8611c FLEXIBLE_CHECKSUMS_RES_WHEN_SUPPORTED = new EnumC8611c("FLEXIBLE_CHECKSUMS_RES_WHEN_SUPPORTED", 19, "b");
    public static final EnumC8611c FLEXIBLE_CHECKSUMS_RES_WHEN_REQUIRED = new EnumC8611c("FLEXIBLE_CHECKSUMS_RES_WHEN_REQUIRED", 20, "c");

    private static final /* synthetic */ EnumC8611c[] $values() {
        return new EnumC8611c[]{WAITER, PAGINATOR, RETRY_MODE_STANDARD, RETRY_MODE_ADAPTIVE, GZIP_REQUEST_COMPRESSION, PROTOCOL_RPC_V2_CBOR, SERVICE_ENDPOINT_OVERRIDE, ACCOUNT_ID_BASED_ENDPOINT, ACCOUNT_ID_MODE_PREFERRED, ACCOUNT_ID_MODE_DISABLED, ACCOUNT_ID_MODE_REQUIRED, SIGV4A_SIGNING, RESOLVED_ACCOUNT_ID, FLEXIBLE_CHECKSUMS_REQ_CRC32, FLEXIBLE_CHECKSUMS_REQ_CRC32C, FLEXIBLE_CHECKSUMS_REQ_SHA1, FLEXIBLE_CHECKSUMS_REQ_SHA256, FLEXIBLE_CHECKSUMS_REQ_WHEN_SUPPORTED, FLEXIBLE_CHECKSUMS_REQ_WHEN_REQUIRED, FLEXIBLE_CHECKSUMS_RES_WHEN_SUPPORTED, FLEXIBLE_CHECKSUMS_RES_WHEN_REQUIRED};
    }

    static {
        EnumC8611c[] enumC8611cArr$values = $values();
        $VALUES = enumC8611cArr$values;
        $ENTRIES = b8.m11548b(enumC8611cArr$values);
    }

    private EnumC8611c(String str, int i10, String str2) {
        this.identifier = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8611c valueOf(String str) {
        return (EnumC8611c) Enum.valueOf(EnumC8611c.class, str);
    }

    public static EnumC8611c[] values() {
        return (EnumC8611c[]) $VALUES.clone();
    }

    @Override // yb.InterfaceC8609a
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getIdentifier();
    }
}
