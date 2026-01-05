package hi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum c1 implements com.google.crypto.tink.shaded.protobuf.c0 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.d0 internalValueMap = new a1();
    private final int value;

    c1(int i10) {
        this.value = i10;
    }

    public static c1 forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 != 4) {
            return null;
        }
        return SHA512;
    }

    public static com.google.crypto.tink.shaded.protobuf.d0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.e0 internalGetVerifier() {
        return b1.f15982b;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static c1 valueOf(int i10) {
        return forNumber(i10);
    }
}
