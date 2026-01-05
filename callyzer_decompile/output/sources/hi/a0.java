package hi;

import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final a0 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER;
    private int ivSize_;

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(a0.class, a0Var);
    }

    /* renamed from: m */
    public static a0 m7067m() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (AbstractC2958z.f16018a[enumC1399z.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new C2937e(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (a0.class) {
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
    public final int m7068n() {
        return this.ivSize_;
    }
}
