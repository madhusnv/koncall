package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1375b;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y1 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final y1 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.f0 key_ = com.google.crypto.tink.shaded.protobuf.c1.f7024d;
    private int primaryKeyId_;

    static {
        y1 y1Var = new y1();
        DEFAULT_INSTANCE = y1Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(y1.class, y1Var);
    }

    /* renamed from: m */
    public static void m7230m(y1 y1Var, int i10) {
        y1Var.primaryKeyId_ = i10;
    }

    /* renamed from: n */
    public static void m7231n(y1 y1Var, x1 x1Var) {
        y1Var.getClass();
        com.google.crypto.tink.shaded.protobuf.f0 f0Var = y1Var.key_;
        if (!((AbstractC1375b) f0Var).f7018a) {
            int size = f0Var.size();
            y1Var.key_ = f0Var.mo4173i(size == 0 ? 10 : size * 2);
        }
        y1Var.key_.add(x1Var);
    }

    /* renamed from: s */
    public static v1 m7232s() {
        return (v1) DEFAULT_INSTANCE.m4164e();
    }

    /* renamed from: t */
    public static y1 m7233t(byte[] bArr, C1390q c1390q) {
        return (y1) com.google.crypto.tink.shaded.protobuf.a0.m4162k(DEFAULT_INSTANCE, bArr, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (u1.f16013a[enumC1399z.ordinal()]) {
            case 1:
                return new y1();
            case 2:
                return new v1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", x1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (y1.class) {
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

    /* renamed from: o */
    public final x1 m7234o(int i10) {
        return (x1) this.key_.get(i10);
    }

    /* renamed from: p */
    public final int m7235p() {
        return this.key_.size();
    }

    /* renamed from: q */
    public final List m7236q() {
        return this.key_;
    }

    /* renamed from: r */
    public final int m7237r() {
        return this.primaryKeyId_;
    }
}
