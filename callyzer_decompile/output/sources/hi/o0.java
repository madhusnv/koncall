package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final o0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1382i keyValue_ = AbstractC1382i.f7044b;
    private int version_;

    static {
        o0 o0Var = new o0();
        DEFAULT_INSTANCE = o0Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(o0.class, o0Var);
    }

    /* renamed from: m */
    public static void m7164m(o0 o0Var) {
        o0Var.version_ = 0;
    }

    /* renamed from: n */
    public static void m7165n(o0 o0Var, C1381h c1381h) {
        o0Var.getClass();
        o0Var.keyValue_ = c1381h;
    }

    /* renamed from: q */
    public static n0 m7166q() {
        return (n0) DEFAULT_INSTANCE.m4164e();
    }

    /* renamed from: r */
    public static o0 m7167r(AbstractC1382i abstractC1382i, C1390q c1390q) {
        return (o0) com.google.crypto.tink.shaded.protobuf.a0.m4161j(DEFAULT_INSTANCE, abstractC1382i, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (m0.f16001a[enumC1399z.ordinal()]) {
            case 1:
                return new o0();
            case 2:
                return new n0(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (o0.class) {
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
    public final AbstractC1382i m7168o() {
        return this.keyValue_;
    }

    /* renamed from: p */
    public final int m7169p() {
        return this.version_;
    }
}
