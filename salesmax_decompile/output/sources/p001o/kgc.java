package p001o;

import p001o.xn8;

/* loaded from: classes4.dex */
public enum kgc implements xn8.InterfaceC18193a {
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
    private static final xn8.InterfaceC18194b internalValueMap = new xn8.InterfaceC18194b() { // from class: o.kgc.a
    };
    private final int value;

    /* renamed from: o.kgc$b */
    public static final class C14830b implements xn8.InterfaceC18195c {

        /* renamed from: a */
        public static final xn8.InterfaceC18195c f32231a = new C14830b();

        @Override // p001o.xn8.InterfaceC18195c
        public boolean isInRange(int i) {
            return kgc.forNumber(i) != null;
        }
    }

    kgc(int i) {
        this.value = i;
    }

    public static kgc forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public static xn8.InterfaceC18194b internalGetValueMap() {
        return internalValueMap;
    }

    public static xn8.InterfaceC18195c internalGetVerifier() {
        return C14830b.f32231a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static kgc valueOf(int i) {
        return forNumber(i);
    }
}
