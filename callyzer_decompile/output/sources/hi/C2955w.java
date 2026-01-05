package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hi.w */
/* loaded from: classes.dex */
public final class C2955w extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final C2955w DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1382i keyValue_ = AbstractC1382i.f7044b;
    private a0 params_;
    private int version_;

    static {
        C2955w c2955w = new C2955w();
        DEFAULT_INSTANCE = c2955w;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(C2955w.class, c2955w);
    }

    /* renamed from: m */
    public static void m7208m(C2955w c2955w) {
        c2955w.version_ = 0;
    }

    /* renamed from: n */
    public static void m7209n(C2955w c2955w, a0 a0Var) {
        c2955w.getClass();
        a0Var.getClass();
        c2955w.params_ = a0Var;
    }

    /* renamed from: o */
    public static void m7210o(C2955w c2955w, C1381h c1381h) {
        c2955w.getClass();
        c2955w.keyValue_ = c1381h;
    }

    /* renamed from: s */
    public static C2954v m7211s() {
        return (C2954v) DEFAULT_INSTANCE.m4164e();
    }

    /* renamed from: t */
    public static C2955w m7212t(AbstractC1382i abstractC1382i, C1390q c1390q) {
        return (C2955w) com.google.crypto.tink.shaded.protobuf.a0.m4161j(DEFAULT_INSTANCE, abstractC1382i, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (AbstractC2953u.f16012a[enumC1399z.ordinal()]) {
            case 1:
                return new C2955w();
            case 2:
                return new C2954v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (C2955w.class) {
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
    public final AbstractC1382i m7213p() {
        return this.keyValue_;
    }

    /* renamed from: q */
    public final a0 m7214q() {
        a0 a0Var = this.params_;
        return a0Var == null ? a0.m7067m() : a0Var;
    }

    /* renamed from: r */
    public final int m7215r() {
        return this.version_;
    }
}
