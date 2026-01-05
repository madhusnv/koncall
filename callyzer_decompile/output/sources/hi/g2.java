package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g2 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final g2 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private i2 params_;
    private int version_;

    static {
        g2 g2Var = new g2();
        DEFAULT_INSTANCE = g2Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(g2.class, g2Var);
    }

    /* renamed from: m */
    public static void m7109m(g2 g2Var) {
        g2Var.version_ = 0;
    }

    /* renamed from: n */
    public static void m7110n(g2 g2Var, i2 i2Var) {
        g2Var.getClass();
        i2Var.getClass();
        g2Var.params_ = i2Var;
    }

    /* renamed from: q */
    public static f2 m7111q() {
        return (f2) DEFAULT_INSTANCE.m4164e();
    }

    /* renamed from: r */
    public static g2 m7112r(AbstractC1382i abstractC1382i, C1390q c1390q) {
        return (g2) com.google.crypto.tink.shaded.protobuf.a0.m4161j(DEFAULT_INSTANCE, abstractC1382i, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (e2.f15990a[enumC1399z.ordinal()]) {
            case 1:
                return new g2();
            case 2:
                return new f2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (g2.class) {
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
    public final i2 m7113o() {
        i2 i2Var = this.params_;
        return i2Var == null ? i2.m7121m() : i2Var;
    }

    /* renamed from: p */
    public final int m7114p() {
        return this.version_;
    }
}
