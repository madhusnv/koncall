package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class p80 extends vn7 implements ucb {
    private static final p80 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    /* renamed from: o.p80$a */
    public static /* synthetic */ class C16018a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39573a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f39573a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39573a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39573a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39573a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39573a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39573a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39573a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.p80$b */
    public static final class C16019b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C16019b(C16018a c16018a) {
            this();
        }

        public C16019b() {
            super(p80.DEFAULT_INSTANCE);
        }
    }

    static {
        p80 p80Var = new p80();
        DEFAULT_INSTANCE = p80Var;
        vn7.m53041D(p80.class, p80Var);
    }

    /* renamed from: H */
    public static p80 m43155H(yq1 yq1Var, pp6 pp6Var) {
        return (p80) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: G */
    public int m43156G() {
        return this.keySize_;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C16018a c16018a = null;
        switch (C16018a.f39573a[enumC17624d.ordinal()]) {
            case 1:
                return new p80();
            case 2:
                return new C16019b(c16018a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (p80.class) {
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
