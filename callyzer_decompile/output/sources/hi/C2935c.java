package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hi.c */
/* loaded from: classes.dex */
public final class C2935c extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final C2935c DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1382i keyValue_ = AbstractC1382i.f7044b;
    private C2940h params_;
    private int version_;

    static {
        C2935c c2935c = new C2935c();
        DEFAULT_INSTANCE = c2935c;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(C2935c.class, c2935c);
    }

    /* renamed from: m */
    public static void m7069m(C2935c c2935c) {
        c2935c.version_ = 0;
    }

    /* renamed from: n */
    public static void m7070n(C2935c c2935c, C1381h c1381h) {
        c2935c.getClass();
        c2935c.keyValue_ = c1381h;
    }

    /* renamed from: o */
    public static void m7071o(C2935c c2935c, C2940h c2940h) {
        c2935c.getClass();
        c2940h.getClass();
        c2935c.params_ = c2940h;
    }

    /* renamed from: s */
    public static C2934b m7072s() {
        return (C2934b) DEFAULT_INSTANCE.m4164e();
    }

    /* renamed from: t */
    public static C2935c m7073t(AbstractC1382i abstractC1382i, C1390q c1390q) {
        return (C2935c) com.google.crypto.tink.shaded.protobuf.a0.m4161j(DEFAULT_INSTANCE, abstractC1382i, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (AbstractC2933a.f15980a[enumC1399z.ordinal()]) {
            case 1:
                return new C2935c();
            case 2:
                return new C2934b(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (C2935c.class) {
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
    public final AbstractC1382i m7074p() {
        return this.keyValue_;
    }

    /* renamed from: q */
    public final C2940h m7075q() {
        C2940h c2940h = this.params_;
        return c2940h == null ? C2940h.m7115m() : c2940h;
    }

    /* renamed from: r */
    public final int m7076r() {
        return this.version_;
    }
}
