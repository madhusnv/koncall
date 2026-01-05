package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class a80 extends vn7 implements ucb {
    private static final a80 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private yq1 keyValue_ = yq1.f55802b;
    private d80 params_;
    private int version_;

    /* renamed from: o.a80$a */
    public static /* synthetic */ class C12109a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14270a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f14270a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14270a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14270a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14270a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14270a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14270a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14270a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.a80$b */
    public static final class C12110b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C12110b(C12109a c12109a) {
            this();
        }

        /* renamed from: t */
        public C12110b m16637t(yq1 yq1Var) {
            m53063l();
            ((a80) this.f50580b).m16633P(yq1Var);
            return this;
        }

        /* renamed from: u */
        public C12110b m16638u(d80 d80Var) {
            m53063l();
            ((a80) this.f50580b).m16634Q(d80Var);
            return this;
        }

        /* renamed from: v */
        public C12110b m16639v(int i) {
            m53063l();
            ((a80) this.f50580b).m16635R(i);
            return this;
        }

        public C12110b() {
            super(a80.DEFAULT_INSTANCE);
        }
    }

    static {
        a80 a80Var = new a80();
        DEFAULT_INSTANCE = a80Var;
        vn7.m53041D(a80.class, a80Var);
    }

    /* renamed from: J */
    public static a80 m16627J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: N */
    public static C12110b m16628N() {
        return (C12110b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: O */
    public static a80 m16629O(yq1 yq1Var, pp6 pp6Var) {
        return (a80) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: K */
    public yq1 m16630K() {
        return this.keyValue_;
    }

    /* renamed from: L */
    public d80 m16631L() {
        d80 d80Var = this.params_;
        return d80Var == null ? d80.m22491G() : d80Var;
    }

    /* renamed from: M */
    public int m16632M() {
        return this.version_;
    }

    /* renamed from: P */
    public final void m16633P(yq1 yq1Var) {
        yq1Var.getClass();
        this.keyValue_ = yq1Var;
    }

    /* renamed from: Q */
    public final void m16634Q(d80 d80Var) {
        d80Var.getClass();
        this.params_ = d80Var;
    }

    /* renamed from: R */
    public final void m16635R(int i) {
        this.version_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C12109a c12109a = null;
        switch (C12109a.f14270a[enumC17624d.ordinal()]) {
            case 1:
                return new a80();
            case 2:
                return new C12110b(c12109a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (a80.class) {
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
