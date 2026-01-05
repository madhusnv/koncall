package p001o;

import p001o.xn8;

/* loaded from: classes4.dex */
public enum ex7 implements xn8.InterfaceC18193a {
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
    private static final xn8.InterfaceC18194b internalValueMap = new xn8.InterfaceC18194b() { // from class: o.ex7.a
    };
    private final int value;

    /* renamed from: o.ex7$b */
    public static final class C13280b implements xn8.InterfaceC18195c {

        /* renamed from: a */
        public static final xn8.InterfaceC18195c f22296a = new C13280b();

        @Override // p001o.xn8.InterfaceC18195c
        public boolean isInRange(int i) {
            return ex7.forNumber(i) != null;
        }
    }

    ex7(int i) {
        this.value = i;
    }

    public static ex7 forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    public static xn8.InterfaceC18194b internalGetValueMap() {
        return internalValueMap;
    }

    public static xn8.InterfaceC18195c internalGetVerifier() {
        return C13280b.f22296a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ex7 valueOf(int i) {
        return forNumber(i);
    }
}
