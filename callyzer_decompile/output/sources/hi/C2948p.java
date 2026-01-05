package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hi.p */
/* loaded from: classes.dex */
public final class C2948p extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final C2948p DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1382i keyValue_ = AbstractC1382i.f7044b;
    private C2952t params_;
    private int version_;

    static {
        C2948p c2948p = new C2948p();
        DEFAULT_INSTANCE = c2948p;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(C2948p.class, c2948p);
    }

    /* renamed from: m */
    public static void m7170m(C2948p c2948p) {
        c2948p.version_ = 0;
    }

    /* renamed from: n */
    public static void m7171n(C2948p c2948p, C2952t c2952t) {
        c2948p.getClass();
        c2952t.getClass();
        c2948p.params_ = c2952t;
    }

    /* renamed from: o */
    public static void m7172o(C2948p c2948p, C1381h c1381h) {
        c2948p.getClass();
        c2948p.keyValue_ = c1381h;
    }

    /* renamed from: p */
    public static C2948p m7173p() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: t */
    public static C2947o m7174t() {
        return (C2947o) DEFAULT_INSTANCE.m4164e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (AbstractC2946n.f16003a[enumC1399z.ordinal()]) {
            case 1:
                return new C2948p();
            case 2:
                return new C2947o(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (C2948p.class) {
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
    public final AbstractC1382i m7175q() {
        return this.keyValue_;
    }

    /* renamed from: r */
    public final C2952t m7176r() {
        C2952t c2952t = this.params_;
        return c2952t == null ? C2952t.m7193m() : c2952t;
    }

    /* renamed from: s */
    public final int m7177s() {
        return this.version_;
    }
}
