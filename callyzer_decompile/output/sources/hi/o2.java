package hi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum o2 implements com.google.crypto.tink.shaded.protobuf.c0 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.d0 internalValueMap = new a1();
    private final int value;

    o2(int i10) {
        this.value = i10;
    }

    public static o2 forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public static com.google.crypto.tink.shaded.protobuf.d0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.e0 internalGetVerifier() {
        return b1.f15985e;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static o2 valueOf(int i10) {
        return forNumber(i10);
    }
}
