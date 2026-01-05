package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class t70 extends vn7 implements ucb {
    private static final t70 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile jxc PARSER;
    private int keySize_;
    private v70 params_;

    /* renamed from: o.t70$a */
    public static /* synthetic */ class C17009a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46550a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f46550a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46550a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46550a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46550a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46550a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46550a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46550a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.t70$b */
    public static final class C17010b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C17010b(C17009a c17009a) {
            this();
        }

        public C17010b() {
            super(t70.DEFAULT_INSTANCE);
        }
    }

    static {
        t70 t70Var = new t70();
        DEFAULT_INSTANCE = t70Var;
        vn7.m53041D(t70.class, t70Var);
    }

    /* renamed from: I */
    public static t70 m49498I(yq1 yq1Var, pp6 pp6Var) {
        return (t70) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: G */
    public int m49499G() {
        return this.keySize_;
    }

    /* renamed from: H */
    public v70 m49500H() {
        v70 v70Var = this.params_;
        return v70Var == null ? v70.m52393G() : v70Var;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C17009a c17009a = null;
        switch (C17009a.f46550a[enumC17624d.ordinal()]) {
            case 1:
                return new t70();
            case 2:
                return new C17010b(c17009a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (t70.class) {
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
