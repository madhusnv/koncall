package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f1 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final f1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1382i keyValue_ = AbstractC1382i.f7044b;
    private j1 params_;
    private int version_;

    static {
        f1 f1Var = new f1();
        DEFAULT_INSTANCE = f1Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(f1.class, f1Var);
    }

    /* renamed from: m */
    public static void m7096m(f1 f1Var) {
        f1Var.version_ = 0;
    }

    /* renamed from: n */
    public static void m7097n(f1 f1Var, j1 j1Var) {
        f1Var.getClass();
        j1Var.getClass();
        f1Var.params_ = j1Var;
    }

    /* renamed from: o */
    public static void m7098o(f1 f1Var, C1381h c1381h) {
        f1Var.getClass();
        f1Var.keyValue_ = c1381h;
    }

    /* renamed from: p */
    public static f1 m7099p() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: t */
    public static e1 m7100t() {
        return (e1) DEFAULT_INSTANCE.m4164e();
    }

    /* renamed from: u */
    public static f1 m7101u(AbstractC1382i abstractC1382i, C1390q c1390q) {
        return (f1) com.google.crypto.tink.shaded.protobuf.a0.m4161j(DEFAULT_INSTANCE, abstractC1382i, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (d1.f15988a[enumC1399z.ordinal()]) {
            case 1:
                return new f1();
            case 2:
                return new e1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (f1.class) {
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

    /* renamed from: q */
    public final AbstractC1382i m7102q() {
        return this.keyValue_;
    }

    /* renamed from: r */
    public final j1 m7103r() {
        j1 j1Var = this.params_;
        return j1Var == null ? j1.m7130m() : j1Var;
    }

    /* renamed from: s */
    public final int m7104s() {
        return this.version_;
    }
}
