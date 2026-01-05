package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class s70 extends vn7 implements ucb {
    private static final s70 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private yq1 keyValue_ = yq1.f55802b;
    private v70 params_;
    private int version_;

    /* renamed from: o.s70$a */
    public static /* synthetic */ class C16761a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44881a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f44881a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44881a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44881a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44881a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44881a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44881a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44881a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.s70$b */
    public static final class C16762b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C16762b(C16761a c16761a) {
            this();
        }

        /* renamed from: t */
        public C16762b m47931t(yq1 yq1Var) {
            m53063l();
            ((s70) this.f50580b).m47928O(yq1Var);
            return this;
        }

        /* renamed from: u */
        public C16762b m47932u(v70 v70Var) {
            m53063l();
            ((s70) this.f50580b).m47929P(v70Var);
            return this;
        }

        /* renamed from: v */
        public C16762b m47933v(int i) {
            m53063l();
            ((s70) this.f50580b).m47930Q(i);
            return this;
        }

        public C16762b() {
            super(s70.DEFAULT_INSTANCE);
        }
    }

    static {
        s70 s70Var = new s70();
        DEFAULT_INSTANCE = s70Var;
        vn7.m53041D(s70.class, s70Var);
    }

    /* renamed from: M */
    public static C16762b m47923M() {
        return (C16762b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: N */
    public static s70 m47924N(yq1 yq1Var, pp6 pp6Var) {
        return (s70) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: J */
    public yq1 m47925J() {
        return this.keyValue_;
    }

    /* renamed from: K */
    public v70 m47926K() {
        v70 v70Var = this.params_;
        return v70Var == null ? v70.m52393G() : v70Var;
    }

    /* renamed from: L */
    public int m47927L() {
        return this.version_;
    }

    /* renamed from: O */
    public final void m47928O(yq1 yq1Var) {
        yq1Var.getClass();
        this.keyValue_ = yq1Var;
    }

    /* renamed from: P */
    public final void m47929P(v70 v70Var) {
        v70Var.getClass();
        this.params_ = v70Var;
    }

    /* renamed from: Q */
    public final void m47930Q(int i) {
        this.version_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C16761a c16761a = null;
        switch (C16761a.f44881a[enumC17624d.ordinal()]) {
            case 1:
                return new s70();
            case 2:
                return new C16762b(c16761a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (s70.class) {
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
