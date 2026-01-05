package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t2 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final t2 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1382i keyValue_ = AbstractC1382i.f7044b;
    private int version_;

    static {
        t2 t2Var = new t2();
        DEFAULT_INSTANCE = t2Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(t2.class, t2Var);
    }

    /* renamed from: m */
    public static void m7195m(t2 t2Var) {
        t2Var.version_ = 0;
    }

    /* renamed from: n */
    public static void m7196n(t2 t2Var, C1381h c1381h) {
        t2Var.getClass();
        t2Var.keyValue_ = c1381h;
    }

    /* renamed from: q */
    public static s2 m7197q() {
        return (s2) DEFAULT_INSTANCE.m4164e();
    }

    /* renamed from: r */
    public static t2 m7198r(AbstractC1382i abstractC1382i, C1390q c1390q) {
        return (t2) com.google.crypto.tink.shaded.protobuf.a0.m4161j(DEFAULT_INSTANCE, abstractC1382i, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (r2.f16008a[enumC1399z.ordinal()]) {
            case 1:
                return new t2();
            case 2:
                return new s2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (t2.class) {
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
    public final AbstractC1382i m7199o() {
        return this.keyValue_;
    }

    /* renamed from: p */
    public final int m7200p() {
        return this.version_;
    }
}
