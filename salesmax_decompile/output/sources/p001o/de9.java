package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class de9 extends vn7 implements ucb {
    private static final de9 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ee9 params_;
    private int version_;

    /* renamed from: o.de9$a */
    public static /* synthetic */ class C12881a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19647a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f19647a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19647a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19647a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19647a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19647a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19647a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19647a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.de9$b */
    public static final class C12882b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C12882b(C12881a c12881a) {
            this();
        }

        /* renamed from: t */
        public C12882b m22857t(ee9 ee9Var) {
            m53063l();
            ((de9) this.f50580b).m22855M(ee9Var);
            return this;
        }

        /* renamed from: u */
        public C12882b m22858u(int i) {
            m53063l();
            ((de9) this.f50580b).m22856N(i);
            return this;
        }

        public C12882b() {
            super(de9.DEFAULT_INSTANCE);
        }
    }

    static {
        de9 de9Var = new de9();
        DEFAULT_INSTANCE = de9Var;
        vn7.m53041D(de9.class, de9Var);
    }

    /* renamed from: K */
    public static C12882b m22851K() {
        return (C12882b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: L */
    public static de9 m22852L(yq1 yq1Var, pp6 pp6Var) {
        return (de9) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: I */
    public ee9 m22853I() {
        ee9 ee9Var = this.params_;
        return ee9Var == null ? ee9.m24845G() : ee9Var;
    }

    /* renamed from: J */
    public int m22854J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m22855M(ee9 ee9Var) {
        ee9Var.getClass();
        this.params_ = ee9Var;
    }

    /* renamed from: N */
    public final void m22856N(int i) {
        this.version_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C12881a c12881a = null;
        switch (C12881a.f19647a[enumC17624d.ordinal()]) {
            case 1:
                return new de9();
            case 2:
                return new C12882b(c12881a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (de9.class) {
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
