package hi;

import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final z0 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER;
    private AbstractC1382i encryptedKeyset_ = AbstractC1382i.f7044b;
    private d2 keysetInfo_;

    static {
        z0 z0Var = new z0();
        DEFAULT_INSTANCE = z0Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(z0.class, z0Var);
    }

    /* renamed from: m */
    public static void m7238m(z0 z0Var, C1381h c1381h) {
        z0Var.getClass();
        z0Var.encryptedKeyset_ = c1381h;
    }

    /* renamed from: n */
    public static void m7239n(z0 z0Var, d2 d2Var) {
        z0Var.getClass();
        z0Var.keysetInfo_ = d2Var;
    }

    /* renamed from: p */
    public static y0 m7240p() {
        return (y0) DEFAULT_INSTANCE.m4164e();
    }

    /* renamed from: q */
    public static z0 m7241q(byte[] bArr, C1390q c1390q) {
        return (z0) com.google.crypto.tink.shaded.protobuf.a0.m4162k(DEFAULT_INSTANCE, bArr, c1390q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (x0.f16017a[enumC1399z.ordinal()]) {
            case 1:
                return new z0();
            case 2:
                return new y0(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (z0.class) {
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
    public final AbstractC1382i m7242o() {
        return this.encryptedKeyset_;
    }
}
