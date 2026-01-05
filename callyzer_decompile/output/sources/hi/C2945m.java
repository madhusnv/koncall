package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hi.m */
/* loaded from: classes.dex */
public final class C2945m extends com.google.crypto.tink.shaded.protobuf.a0 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C2945m DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER;
    private C2950r aesCtrKeyFormat_;
    private h1 hmacKeyFormat_;

    static {
        C2945m c2945m = new C2945m();
        DEFAULT_INSTANCE = c2945m;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(C2945m.class, c2945m);
    }

    /* renamed from: o */
    public static C2945m m7149o(AbstractC1382i abstractC1382i, C1390q c1390q) {
        return (C2945m) com.google.crypto.tink.shaded.protobuf.a0.m4161j(DEFAULT_INSTANCE, abstractC1382i, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (AbstractC2944l.f16000a[enumC1399z.ordinal()]) {
            case 1:
                return new C2945m();
            case 2:
                return new C2937e(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (C2945m.class) {
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

    /* renamed from: m */
    public final C2950r m7150m() {
        C2950r c2950r = this.aesCtrKeyFormat_;
        return c2950r == null ? C2950r.m7178m() : c2950r;
    }

    /* renamed from: n */
    public final h1 m7151n() {
        h1 h1Var = this.hmacKeyFormat_;
        return h1Var == null ? h1.m7117m() : h1Var;
    }
}
