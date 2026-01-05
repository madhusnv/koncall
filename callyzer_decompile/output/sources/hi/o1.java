package hi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum o1 implements com.google.crypto.tink.shaded.protobuf.c0 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.d0 internalValueMap = new a1();
    private final int value;

    o1(int i10) {
        this.value = i10;
    }

    public static o1 forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i10 == 1) {
            return ENABLED;
        }
        if (i10 == 2) {
            return DISABLED;
        }
        if (i10 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static com.google.crypto.tink.shaded.protobuf.d0 internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.e0 internalGetVerifier() {
        return b1.f15984d;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static o1 valueOf(int i10) {
        return forNumber(i10);
    }
}
