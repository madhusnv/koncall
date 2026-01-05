package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final g0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(g0.class, g0Var);
    }

    /* renamed from: m */
    public static void m7105m(g0 g0Var) {
        g0Var.keySize_ = 32;
    }

    /* renamed from: o */
    public static f0 m7106o() {
        return (f0) DEFAULT_INSTANCE.m4164e();
    }

    /* renamed from: p */
    public static g0 m7107p(AbstractC1382i abstractC1382i, C1390q c1390q) {
        return (g0) com.google.crypto.tink.shaded.protobuf.a0.m4161j(DEFAULT_INSTANCE, abstractC1382i, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (e0.f15989a[enumC1399z.ordinal()]) {
            case 1:
                return new g0();
            case 2:
                return new f0(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (g0.class) {
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
    public final int m7108n() {
        return this.keySize_;
    }
}
