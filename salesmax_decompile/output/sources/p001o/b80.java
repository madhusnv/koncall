package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class b80 extends vn7 implements ucb {
    private static final b80 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile jxc PARSER;
    private int keySize_;
    private d80 params_;

    /* renamed from: o.b80$a */
    public static /* synthetic */ class C12297a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15660a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f15660a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15660a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15660a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15660a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15660a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15660a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15660a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.b80$b */
    public static final class C12298b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C12298b(C12297a c12297a) {
            this();
        }

        public C12298b() {
            super(b80.DEFAULT_INSTANCE);
        }
    }

    static {
        b80 b80Var = new b80();
        DEFAULT_INSTANCE = b80Var;
        vn7.m53041D(b80.class, b80Var);
    }

    /* renamed from: G */
    public static b80 m18267G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public static b80 m18268J(yq1 yq1Var, pp6 pp6Var) {
        return (b80) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: H */
    public int m18269H() {
        return this.keySize_;
    }

    /* renamed from: I */
    public d80 m18270I() {
        d80 d80Var = this.params_;
        return d80Var == null ? d80.m22491G() : d80Var;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C12297a c12297a = null;
        switch (C12297a.f15660a[enumC17624d.ordinal()]) {
            case 1:
                return new b80();
            case 2:
                return new C12298b(c12297a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (b80.class) {
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
