package hi;

import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c2 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final c2 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        c2 c2Var = new c2();
        DEFAULT_INSTANCE = c2Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(c2.class, c2Var);
    }

    /* renamed from: m */
    public static void m7077m(c2 c2Var, String str) {
        c2Var.getClass();
        str.getClass();
        c2Var.typeUrl_ = str;
    }

    /* renamed from: n */
    public static void m7078n(c2 c2Var, o2 o2Var) {
        c2Var.getClass();
        c2Var.outputPrefixType_ = o2Var.getNumber();
    }

    /* renamed from: o */
    public static void m7079o(c2 c2Var, o1 o1Var) {
        c2Var.getClass();
        c2Var.status_ = o1Var.getNumber();
    }

    /* renamed from: p */
    public static void m7080p(c2 c2Var, int i10) {
        c2Var.keyId_ = i10;
    }

    /* renamed from: r */
    public static b2 m7081r() {
        return (b2) DEFAULT_INSTANCE.m4164e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (z1.f16019a[enumC1399z.ordinal()]) {
            case 1:
                return new c2();
            case 2:
                return new b2(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (c2.class) {
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
    public final int m7082q() {
        return this.keyId_;
    }
}
