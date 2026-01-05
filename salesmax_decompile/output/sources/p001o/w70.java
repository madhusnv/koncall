package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class w70 extends vn7 implements ucb {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final w70 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private a80 aesCtrKey_;
    private wy7 hmacKey_;
    private int version_;

    /* renamed from: o.w70$a */
    public static /* synthetic */ class C17790a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51553a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f51553a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51553a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51553a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51553a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51553a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51553a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51553a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.w70$b */
    public static final class C17791b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C17791b(C17790a c17790a) {
            this();
        }

        /* renamed from: t */
        public C17791b m54029t(a80 a80Var) {
            m53063l();
            ((w70) this.f50580b).m54026O(a80Var);
            return this;
        }

        /* renamed from: u */
        public C17791b m54030u(wy7 wy7Var) {
            m53063l();
            ((w70) this.f50580b).m54027P(wy7Var);
            return this;
        }

        /* renamed from: v */
        public C17791b m54031v(int i) {
            m53063l();
            ((w70) this.f50580b).m54028Q(i);
            return this;
        }

        public C17791b() {
            super(w70.DEFAULT_INSTANCE);
        }
    }

    static {
        w70 w70Var = new w70();
        DEFAULT_INSTANCE = w70Var;
        vn7.m53041D(w70.class, w70Var);
    }

    /* renamed from: M */
    public static C17791b m54021M() {
        return (C17791b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: N */
    public static w70 m54022N(yq1 yq1Var, pp6 pp6Var) {
        return (w70) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: J */
    public a80 m54023J() {
        a80 a80Var = this.aesCtrKey_;
        return a80Var == null ? a80.m16627J() : a80Var;
    }

    /* renamed from: K */
    public wy7 m54024K() {
        wy7 wy7Var = this.hmacKey_;
        return wy7Var == null ? wy7.m55388J() : wy7Var;
    }

    /* renamed from: L */
    public int m54025L() {
        return this.version_;
    }

    /* renamed from: O */
    public final void m54026O(a80 a80Var) {
        a80Var.getClass();
        this.aesCtrKey_ = a80Var;
    }

    /* renamed from: P */
    public final void m54027P(wy7 wy7Var) {
        wy7Var.getClass();
        this.hmacKey_ = wy7Var;
    }

    /* renamed from: Q */
    public final void m54028Q(int i) {
        this.version_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C17790a c17790a = null;
        switch (C17790a.f51553a[enumC17624d.ordinal()]) {
            case 1:
                return new w70();
            case 2:
                return new C17791b(c17790a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (w70.class) {
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
