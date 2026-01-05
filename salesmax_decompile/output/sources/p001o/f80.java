package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class f80 extends vn7 implements ucb {
    private static final f80 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private yq1 keyValue_ = yq1.f55802b;
    private i80 params_;
    private int version_;

    /* renamed from: o.f80$a */
    public static /* synthetic */ class C13361a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22937a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f22937a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22937a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22937a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22937a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22937a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22937a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22937a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.f80$b */
    public static final class C13362b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C13362b(C13361a c13361a) {
            this();
        }

        /* renamed from: t */
        public C13362b m26277t(yq1 yq1Var) {
            m53063l();
            ((f80) this.f50580b).m26274O(yq1Var);
            return this;
        }

        /* renamed from: u */
        public C13362b m26278u(i80 i80Var) {
            m53063l();
            ((f80) this.f50580b).m26275P(i80Var);
            return this;
        }

        /* renamed from: v */
        public C13362b m26279v(int i) {
            m53063l();
            ((f80) this.f50580b).m26276Q(i);
            return this;
        }

        public C13362b() {
            super(f80.DEFAULT_INSTANCE);
        }
    }

    static {
        f80 f80Var = new f80();
        DEFAULT_INSTANCE = f80Var;
        vn7.m53041D(f80.class, f80Var);
    }

    /* renamed from: M */
    public static C13362b m26269M() {
        return (C13362b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: N */
    public static f80 m26270N(yq1 yq1Var, pp6 pp6Var) {
        return (f80) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: J */
    public yq1 m26271J() {
        return this.keyValue_;
    }

    /* renamed from: K */
    public i80 m26272K() {
        i80 i80Var = this.params_;
        return i80Var == null ? i80.m31705G() : i80Var;
    }

    /* renamed from: L */
    public int m26273L() {
        return this.version_;
    }

    /* renamed from: O */
    public final void m26274O(yq1 yq1Var) {
        yq1Var.getClass();
        this.keyValue_ = yq1Var;
    }

    /* renamed from: P */
    public final void m26275P(i80 i80Var) {
        i80Var.getClass();
        this.params_ = i80Var;
    }

    /* renamed from: Q */
    public final void m26276Q(int i) {
        this.version_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C13361a c13361a = null;
        switch (C13361a.f22937a[enumC17624d.ordinal()]) {
            case 1:
                return new f80();
            case 2:
                return new C13362b(c13361a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (f80.class) {
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
