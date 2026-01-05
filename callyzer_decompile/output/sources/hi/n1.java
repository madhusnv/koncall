package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n1 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final n1 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC1382i value_ = AbstractC1382i.f7044b;

    static {
        n1 n1Var = new n1();
        DEFAULT_INSTANCE = n1Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(n1.class, n1Var);
    }

    /* renamed from: m */
    public static void m7152m(n1 n1Var, String str) {
        n1Var.getClass();
        str.getClass();
        n1Var.typeUrl_ = str;
    }

    /* renamed from: n */
    public static void m7153n(n1 n1Var, C1381h c1381h) {
        n1Var.getClass();
        n1Var.value_ = c1381h;
    }

    /* renamed from: o */
    public static void m7154o(n1 n1Var, m1 m1Var) {
        n1Var.getClass();
        n1Var.keyMaterialType_ = m1Var.getNumber();
    }

    /* renamed from: p */
    public static n1 m7155p() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: t */
    public static l1 m7156t() {
        return (l1) DEFAULT_INSTANCE.m4164e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (k1.f15999a[enumC1399z.ordinal()]) {
            case 1:
                return new n1();
            case 2:
                return new l1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (n1.class) {
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
    public final m1 m7157q() {
        m1 m1VarForNumber = m1.forNumber(this.keyMaterialType_);
        return m1VarForNumber == null ? m1.UNRECOGNIZED : m1VarForNumber;
    }

    /* renamed from: r */
    public final String m7158r() {
        return this.typeUrl_;
    }

    /* renamed from: s */
    public final AbstractC1382i m7159s() {
        return this.value_;
    }
}
