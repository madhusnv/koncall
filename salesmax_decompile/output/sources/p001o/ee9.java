package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class ee9 extends vn7 implements ucb {
    private static final ee9 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile jxc PARSER;
    private String keyUri_ = "";

    /* renamed from: o.ee9$a */
    public static /* synthetic */ class C13164a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21487a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f21487a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21487a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21487a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21487a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21487a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21487a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21487a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.ee9$b */
    public static final class C13165b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C13165b(C13164a c13164a) {
            this();
        }

        public C13165b() {
            super(ee9.DEFAULT_INSTANCE);
        }
    }

    static {
        ee9 ee9Var = new ee9();
        DEFAULT_INSTANCE = ee9Var;
        vn7.m53041D(ee9.class, ee9Var);
    }

    /* renamed from: G */
    public static ee9 m24845G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: I */
    public static ee9 m24846I(yq1 yq1Var, pp6 pp6Var) {
        return (ee9) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: H */
    public String m24847H() {
        return this.keyUri_;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C13164a c13164a = null;
        switch (C13164a.f21487a[enumC17624d.ordinal()]) {
            case 1:
                return new ee9();
            case 2:
                return new C13165b(c13164a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (ee9.class) {
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
