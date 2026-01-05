package hi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum m1 implements com.google.crypto.tink.shaded.protobuf.c0 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
    public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
    public static final int REMOTE_VALUE = 4;
    public static final int SYMMETRIC_VALUE = 1;
    public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.d0 internalValueMap = new a1();
    private final int value;

    m1(int i10) {
        this.value = i10;
    }

    public static m1 forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i10 == 1) {
            return SYMMETRIC;
        }
        if (i10 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i10 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i10 != 4) {
            return null;
        }
        return REMOTE;
    }

    public static com.google.crypto.tink.shaded.protobuf.d0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.e0 internalGetVerifier() {
        return b1.f15983c;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static m1 valueOf(int i10) {
        return forNumber(i10);
    }
}
