package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final r0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER;
    private int keySize_;

    static {
        r0 r0Var = new r0();
        DEFAULT_INSTANCE = r0Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(r0.class, r0Var);
    }

    /* renamed from: m */
    public static void m7181m(r0 r0Var) {
        r0Var.keySize_ = 64;
    }

    /* renamed from: o */
    public static q0 m7182o() {
        return (q0) DEFAULT_INSTANCE.m4164e();
    }

    /* renamed from: p */
    public static r0 m7183p(AbstractC1382i abstractC1382i, C1390q c1390q) {
        return (r0) com.google.crypto.tink.shaded.protobuf.a0.m4161j(DEFAULT_INSTANCE, abstractC1382i, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (p0.f16004a[enumC1399z.ordinal()]) {
            case 1:
                return new r0();
            case 2:
                return new q0(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (r0.class) {
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

    /* renamed from: n */
    public final int m7184n() {
        return this.keySize_;
    }
}
