package hi;

import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x1 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final x1 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private n1 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        x1 x1Var = new x1();
        DEFAULT_INSTANCE = x1Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(x1.class, x1Var);
    }

    /* renamed from: m */
    public static void m7217m(x1 x1Var, n1 n1Var) {
        x1Var.getClass();
        x1Var.keyData_ = n1Var;
    }

    /* renamed from: n */
    public static void m7218n(x1 x1Var, o2 o2Var) {
        x1Var.getClass();
        x1Var.outputPrefixType_ = o2Var.getNumber();
    }

    /* renamed from: o */
    public static void m7219o(x1 x1Var, o1 o1Var) {
        x1Var.getClass();
        x1Var.status_ = o1Var.getNumber();
    }

    /* renamed from: p */
    public static void m7220p(x1 x1Var, int i10) {
        x1Var.keyId_ = i10;
    }

    /* renamed from: v */
    public static w1 m7221v() {
        return (w1) DEFAULT_INSTANCE.m4164e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (u1.f16013a[enumC1399z.ordinal()]) {
            case 1:
                return new x1();
            case 2:
                return new w1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (x1.class) {
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
    public final n1 m7222q() {
        n1 n1Var = this.keyData_;
        return n1Var == null ? n1.m7155p() : n1Var;
    }

    /* renamed from: r */
    public final int m7223r() {
        return this.keyId_;
    }

    /* renamed from: s */
    public final o2 m7224s() {
        o2 o2VarForNumber = o2.forNumber(this.outputPrefixType_);
        return o2VarForNumber == null ? o2.UNRECOGNIZED : o2VarForNumber;
    }

    /* renamed from: t */
    public final o1 m7225t() {
        o1 o1VarForNumber = o1.forNumber(this.status_);
        return o1VarForNumber == null ? o1.UNRECOGNIZED : o1VarForNumber;
    }

    /* renamed from: u */
    public final boolean m7226u() {
        return this.keyData_ != null;
    }
}
