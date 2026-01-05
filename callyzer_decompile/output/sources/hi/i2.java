package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i2 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final i2 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER;
    private String keyUri_ = "";

    static {
        i2 i2Var = new i2();
        DEFAULT_INSTANCE = i2Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(i2.class, i2Var);
    }

    /* renamed from: m */
    public static i2 m7121m() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: o */
    public static i2 m7122o(AbstractC1382i abstractC1382i, C1390q c1390q) {
        return (i2) com.google.crypto.tink.shaded.protobuf.a0.m4161j(DEFAULT_INSTANCE, abstractC1382i, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (h2.f15994a[enumC1399z.ordinal()]) {
            case 1:
                return new i2();
            case 2:
                return new C2937e(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (i2.class) {
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
    public final String m7123n() {
        return this.keyUri_;
    }
}
