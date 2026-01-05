package net.schmizz.sshj.common;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: net.schmizz.sshj.common.c */
/* loaded from: classes3.dex */
public enum EnumC5023c {
    UNKNOWN,
    HOST_NOT_ALLOWED_TO_CONNECT,
    PROTOCOL_ERROR,
    KEY_EXCHANGE_FAILED,
    RESERVED,
    MAC_ERROR,
    COMPRESSION_ERROR,
    SERVICE_NOT_AVAILABLE,
    PROTOCOL_VERSION_NOT_SUPPORTED,
    HOST_KEY_NOT_VERIFIABLE,
    CONNECTION_LOST,
    BY_APPLICATION,
    TOO_MANY_CONNECTIONS,
    AUTH_CANCELLED_BY_USER,
    NO_MORE_AUTH_METHODS_AVAILABLE,
    ILLEGAL_USER_NAME;

    public static EnumC5023c fromInt(int i10) {
        return (i10 < 0 || i10 > values().length) ? UNKNOWN : values()[i10];
    }

    public int toInt() {
        return ordinal();
    }
}
