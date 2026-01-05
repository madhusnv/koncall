package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1375b;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d2 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final d2 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.f0 keyInfo_ = com.google.crypto.tink.shaded.protobuf.c1.f7024d;
    private int primaryKeyId_;

    static {
        d2 d2Var = new d2();
        DEFAULT_INSTANCE = d2Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(d2.class, d2Var);
    }

    /* renamed from: m */
    public static void m7089m(d2 d2Var, int i10) {
        d2Var.primaryKeyId_ = i10;
    }

    /* renamed from: n */
    public static void m7090n(d2 d2Var, c2 c2Var) {
        d2Var.getClass();
        com.google.crypto.tink.shaded.protobuf.f0 f0Var = d2Var.keyInfo_;
        if (!((AbstractC1375b) f0Var).f7018a) {
            int size = f0Var.size();
            d2Var.keyInfo_ = f0Var.mo4173i(size == 0 ? 10 : size * 2);
        }
        d2Var.keyInfo_.add(c2Var);
    }

    /* renamed from: p */
    public static a2 m7091p() {
        return (a2) DEFAULT_INSTANCE.m4164e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (z1.f16019a[enumC1399z.ordinal()]) {
            case 1:
                return new d2();
            case 2:
                return new a2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (d2.class) {
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

    /* renamed from: o */
    public final c2 m7092o() {
        return (c2) this.keyInfo_.get(0);
    }
}
