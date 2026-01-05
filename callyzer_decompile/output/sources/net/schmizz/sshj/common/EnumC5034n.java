package net.schmizz.sshj.common;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: net.schmizz.sshj.common.n */
/* loaded from: classes3.dex */
public enum EnumC5034n {
    UNKNOWN(0),
    DISCONNECT(1),
    IGNORE(2),
    UNIMPLEMENTED(3),
    DEBUG(4),
    SERVICE_REQUEST(5),
    SERVICE_ACCEPT(6),
    EXT_INFO(7),
    KEXINIT(20),
    NEWKEYS(21),
    KEXDH_INIT(30),
    KEXDH_31(31),
    KEX_DH_GEX_INIT(32),
    KEX_DH_GEX_REPLY(33),
    KEX_DH_GEX_REQUEST(34),
    USERAUTH_REQUEST(50),
    USERAUTH_FAILURE(51),
    USERAUTH_SUCCESS(52),
    USERAUTH_BANNER(53),
    USERAUTH_60(60),
    USERAUTH_INFO_RESPONSE(61),
    USERAUTH_GSSAPI_EXCHANGE_COMPLETE(63),
    USERAUTH_GSSAPI_MIC(66),
    GLOBAL_REQUEST(80),
    REQUEST_SUCCESS(81),
    REQUEST_FAILURE(82),
    CHANNEL_OPEN(90),
    CHANNEL_OPEN_CONFIRMATION(91),
    CHANNEL_OPEN_FAILURE(92),
    CHANNEL_WINDOW_ADJUST(93),
    CHANNEL_DATA(94),
    CHANNEL_EXTENDED_DATA(95),
    CHANNEL_EOF(96),
    CHANNEL_CLOSE(97),
    CHANNEL_REQUEST(98),
    CHANNEL_SUCCESS(99),
    CHANNEL_FAILURE(100);

    private static final EnumC5034n[] cache = new EnumC5034n[256];

    /* renamed from: b */
    private final byte f24785b;

    static {
        for (EnumC5034n enumC5034n : values()) {
            cache[enumC5034n.toByte()] = enumC5034n;
        }
        for (int i10 = 0; i10 < 256; i10++) {
            EnumC5034n[] enumC5034nArr = cache;
            if (enumC5034nArr[i10] == null) {
                enumC5034nArr[i10] = UNKNOWN;
            }
        }
    }

    EnumC5034n(int i10) {
        this.f24785b = (byte) i10;
    }

    public static EnumC5034n fromByte(byte b10) {
        return cache[b10];
    }

    public boolean geq(int i10) {
        return this.f24785b >= i10;
    }

    public boolean gt(int i10) {
        return this.f24785b > i10;
    }

    public boolean in(int i10, int i11) {
        byte b10 = this.f24785b;
        return b10 >= i10 && b10 <= i11;
    }

    public boolean leq(int i10) {
        return this.f24785b <= i10;
    }

    public boolean lt(int i10) {
        return this.f24785b < i10;
    }

    public byte toByte() {
        return this.f24785b;
    }
}
