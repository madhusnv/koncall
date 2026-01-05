package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class wy7 extends vn7 implements ucb {
    private static final wy7 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private yq1 keyValue_ = yq1.f55802b;
    private az7 params_;
    private int version_;

    /* renamed from: o.wy7$a */
    public static /* synthetic */ class C18003a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52878a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f52878a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52878a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52878a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52878a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52878a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52878a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52878a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.wy7$b */
    public static final class C18004b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C18004b(C18003a c18003a) {
            this();
        }

        /* renamed from: t */
        public C18004b m55397t(yq1 yq1Var) {
            m53063l();
            ((wy7) this.f50580b).m55394P(yq1Var);
            return this;
        }

        /* renamed from: u */
        public C18004b m55398u(az7 az7Var) {
            m53063l();
            ((wy7) this.f50580b).m55395Q(az7Var);
            return this;
        }

        /* renamed from: v */
        public C18004b m55399v(int i) {
            m53063l();
            ((wy7) this.f50580b).m55396R(i);
            return this;
        }

        public C18004b() {
            super(wy7.DEFAULT_INSTANCE);
        }
    }

    static {
        wy7 wy7Var = new wy7();
        DEFAULT_INSTANCE = wy7Var;
        vn7.m53041D(wy7.class, wy7Var);
    }

    /* renamed from: J */
    public static wy7 m55388J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: N */
    public static C18004b m55389N() {
        return (C18004b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: O */
    public static wy7 m55390O(yq1 yq1Var, pp6 pp6Var) {
        return (wy7) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: K */
    public yq1 m55391K() {
        return this.keyValue_;
    }

    /* renamed from: L */
    public az7 m55392L() {
        az7 az7Var = this.params_;
        return az7Var == null ? az7.m18037G() : az7Var;
    }

    /* renamed from: M */
    public int m55393M() {
        return this.version_;
    }

    /* renamed from: P */
    public final void m55394P(yq1 yq1Var) {
        yq1Var.getClass();
        this.keyValue_ = yq1Var;
    }

    /* renamed from: Q */
    public final void m55395Q(az7 az7Var) {
        az7Var.getClass();
        this.params_ = az7Var;
    }

    /* renamed from: R */
    public final void m55396R(int i) {
        this.version_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C18003a c18003a = null;
        switch (C18003a.f52878a[enumC17624d.ordinal()]) {
            case 1:
                return new wy7();
            case 2:
                return new C18004b(c18003a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (wy7.class) {
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
