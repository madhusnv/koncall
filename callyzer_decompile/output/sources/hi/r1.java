package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r1 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final r1 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC1382i value_ = AbstractC1382i.f7044b;

    static {
        r1 r1Var = new r1();
        DEFAULT_INSTANCE = r1Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(r1.class, r1Var);
    }

    /* renamed from: m */
    public static void m7185m(r1 r1Var, String str) {
        r1Var.getClass();
        r1Var.typeUrl_ = str;
    }

    /* renamed from: n */
    public static void m7186n(r1 r1Var, C1381h c1381h) {
        r1Var.getClass();
        r1Var.value_ = c1381h;
    }

    /* renamed from: o */
    public static void m7187o(r1 r1Var, o2 o2Var) {
        r1Var.getClass();
        r1Var.outputPrefixType_ = o2Var.getNumber();
    }

    /* renamed from: p */
    public static r1 m7188p() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: t */
    public static q1 m7189t() {
        return (q1) DEFAULT_INSTANCE.m4164e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (p1.f16005a[enumC1399z.ordinal()]) {
            case 1:
                return new r1();
            case 2:
                return new q1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (r1.class) {
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
    public final o2 m7190q() {
        o2 o2VarForNumber = o2.forNumber(this.outputPrefixType_);
        return o2VarForNumber == null ? o2.UNRECOGNIZED : o2VarForNumber;
    }

    /* renamed from: r */
    public final String m7191r() {
        return this.typeUrl_;
    }

    /* renamed from: s */
    public final AbstractC1382i m7192s() {
        return this.value_;
    }
}
