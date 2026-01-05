package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class x70 extends vn7 implements ucb {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final x70 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile jxc PARSER;
    private b80 aesCtrKeyFormat_;
    private xy7 hmacKeyFormat_;

    /* renamed from: o.x70$a */
    public static /* synthetic */ class C18066a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53288a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f53288a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53288a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53288a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53288a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53288a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53288a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53288a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.x70$b */
    public static final class C18067b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C18067b(C18066a c18066a) {
            this();
        }

        public C18067b() {
            super(x70.DEFAULT_INSTANCE);
        }
    }

    static {
        x70 x70Var = new x70();
        DEFAULT_INSTANCE = x70Var;
        vn7.m53041D(x70.class, x70Var);
    }

    /* renamed from: I */
    public static x70 m55757I(yq1 yq1Var, pp6 pp6Var) {
        return (x70) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: G */
    public b80 m55758G() {
        b80 b80Var = this.aesCtrKeyFormat_;
        return b80Var == null ? b80.m18267G() : b80Var;
    }

    /* renamed from: H */
    public xy7 m55759H() {
        xy7 xy7Var = this.hmacKeyFormat_;
        return xy7Var == null ? xy7.m56960G() : xy7Var;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C18066a c18066a = null;
        switch (C18066a.f53288a[enumC17624d.ordinal()]) {
            case 1:
                return new x70();
            case 2:
                return new C18067b(c18066a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (x70.class) {
                        c17622b = PARSER;
                        if (c17622b == null) {
                            c17622b = new vn7.C17622b(DEFAULT_INSTANCE);
                            PARSER = c17622b;
                        }
                    }
                }
                return c17622b;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
