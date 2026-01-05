package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class mdj extends vn7 implements ucb {
    private static final mdj DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private yq1 keyValue_ = yq1.f55802b;
    private int version_;

    /* renamed from: o.mdj$a */
    public static /* synthetic */ class C15290a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35256a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f35256a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35256a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35256a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35256a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35256a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35256a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35256a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.mdj$b */
    public static final class C15291b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C15291b(C15290a c15290a) {
            this();
        }

        /* renamed from: t */
        public C15291b m38804t(yq1 yq1Var) {
            m53063l();
            ((mdj) this.f50580b).m38802M(yq1Var);
            return this;
        }

        /* renamed from: u */
        public C15291b m38805u(int i) {
            m53063l();
            ((mdj) this.f50580b).m38803N(i);
            return this;
        }

        public C15291b() {
            super(mdj.DEFAULT_INSTANCE);
        }
    }

    static {
        mdj mdjVar = new mdj();
        DEFAULT_INSTANCE = mdjVar;
        vn7.m53041D(mdj.class, mdjVar);
    }

    /* renamed from: K */
    public static C15291b m38798K() {
        return (C15291b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: L */
    public static mdj m38799L(yq1 yq1Var, pp6 pp6Var) {
        return (mdj) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: I */
    public yq1 m38800I() {
        return this.keyValue_;
    }

    /* renamed from: J */
    public int m38801J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m38802M(yq1 yq1Var) {
        yq1Var.getClass();
        this.keyValue_ = yq1Var;
    }

    /* renamed from: N */
    public final void m38803N(int i) {
        this.version_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C15290a c15290a = null;
        switch (C15290a.f35256a[enumC17624d.ordinal()]) {
            case 1:
                return new mdj();
            case 2:
                return new C15291b(c15290a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (mdj.class) {
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
