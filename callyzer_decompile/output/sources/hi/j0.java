package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final j0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1382i keyValue_ = AbstractC1382i.f7044b;
    private int version_;

    static {
        j0 j0Var = new j0();
        DEFAULT_INSTANCE = j0Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(j0.class, j0Var);
    }

    /* renamed from: m */
    public static void m7124m(j0 j0Var) {
        j0Var.version_ = 0;
    }

    /* renamed from: n */
    public static void m7125n(j0 j0Var, C1381h c1381h) {
        j0Var.getClass();
        j0Var.keyValue_ = c1381h;
    }

    /* renamed from: q */
    public static i0 m7126q() {
        return (i0) DEFAULT_INSTANCE.m4164e();
    }

    /* renamed from: r */
    public static j0 m7127r(AbstractC1382i abstractC1382i, C1390q c1390q) {
        return (j0) com.google.crypto.tink.shaded.protobuf.a0.m4161j(DEFAULT_INSTANCE, abstractC1382i, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (h0.f15993a[enumC1399z.ordinal()]) {
            case 1:
                return new j0();
            case 2:
                return new i0(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (j0.class) {
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
    public final AbstractC1382i m7128o() {
        return this.keyValue_;
    }

    /* renamed from: p */
    public final int m7129p() {
        return this.version_;
    }
}
