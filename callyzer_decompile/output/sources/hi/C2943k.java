package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hi.k */
/* loaded from: classes.dex */
public final class C2943k extends com.google.crypto.tink.shaded.protobuf.a0 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C2943k DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C2948p aesCtrKey_;
    private f1 hmacKey_;
    private int version_;

    static {
        C2943k c2943k = new C2943k();
        DEFAULT_INSTANCE = c2943k;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(C2943k.class, c2943k);
    }

    /* renamed from: m */
    public static void m7133m(C2943k c2943k) {
        c2943k.version_ = 0;
    }

    /* renamed from: n */
    public static void m7134n(C2943k c2943k, C2948p c2948p) {
        c2943k.getClass();
        c2948p.getClass();
        c2943k.aesCtrKey_ = c2948p;
    }

    /* renamed from: o */
    public static void m7135o(C2943k c2943k, f1 f1Var) {
        c2943k.getClass();
        f1Var.getClass();
        c2943k.hmacKey_ = f1Var;
    }

    /* renamed from: s */
    public static C2942j m7136s() {
        return (C2942j) DEFAULT_INSTANCE.m4164e();
    }

    /* renamed from: t */
    public static C2943k m7137t(AbstractC1382i abstractC1382i, C1390q c1390q) {
        return (C2943k) com.google.crypto.tink.shaded.protobuf.a0.m4161j(DEFAULT_INSTANCE, abstractC1382i, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (AbstractC2941i.f15995a[enumC1399z.ordinal()]) {
            case 1:
                return new C2943k();
            case 2:
                return new C2942j(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (C2943k.class) {
                    try {
                        c1398y = PARSER;
                        if (c1398y == null) {
                            c1398y = new C1398y();
                            PARSER = c1398y;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return c1398y;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: p */
    public final C2948p m7138p() {
        C2948p c2948p = this.aesCtrKey_;
        return c2948p == null ? C2948p.m7173p() : c2948p;
    }

    /* renamed from: q */
    public final f1 m7139q() {
        f1 f1Var = this.hmacKey_;
        return f1Var == null ? f1.m7099p() : f1Var;
    }

    /* renamed from: r */
    public final int m7140r() {
        return this.version_;
    }
}
