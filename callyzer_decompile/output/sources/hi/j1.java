package hi;

import com.google.crypto.tink.shaded.protobuf.C1398y;
import com.google.crypto.tink.shaded.protobuf.EnumC1399z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 extends com.google.crypto.tink.shaded.protobuf.a0 {
    private static final j1 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.y0 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        j1 j1Var = new j1();
        DEFAULT_INSTANCE = j1Var;
        com.google.crypto.tink.shaded.protobuf.a0.m4163l(j1.class, j1Var);
    }

    /* renamed from: m */
    public static j1 m7130m() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /* renamed from: f */
    public final Object mo4165f(EnumC1399z enumC1399z) {
        com.google.crypto.tink.shaded.protobuf.y0 c1398y;
        switch (i1.f15996a[enumC1399z.ordinal()]) {
            case 1:
                return new j1();
            case 2:
                return new C2937e(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.y0 y0Var = PARSER;
                if (y0Var != null) {
                    return y0Var;
                }
                synchronized (j1.class) {
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
    public final c1 m7131n() {
        c1 c1VarForNumber = c1.forNumber(this.hash_);
        return c1VarForNumber == null ? c1.UNRECOGNIZED : c1VarForNumber;
    }

    /* renamed from: o */
    public final int m7132o() {
        return this.tagSize_;
    }
}
