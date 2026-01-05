package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class je9 extends vn7 implements ucb {
    private static final je9 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ke9 params_;
    private int version_;

    /* renamed from: o.je9$a */
    public static /* synthetic */ class C14510a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30279a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f30279a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30279a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30279a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30279a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30279a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30279a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30279a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.je9$b */
    public static final class C14511b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C14511b(C14510a c14510a) {
            this();
        }

        /* renamed from: t */
        public C14511b m33641t(ke9 ke9Var) {
            m53063l();
            ((je9) this.f50580b).m33639M(ke9Var);
            return this;
        }

        /* renamed from: u */
        public C14511b m33642u(int i) {
            m53063l();
            ((je9) this.f50580b).m33640N(i);
            return this;
        }

        public C14511b() {
            super(je9.DEFAULT_INSTANCE);
        }
    }

    static {
        je9 je9Var = new je9();
        DEFAULT_INSTANCE = je9Var;
        vn7.m53041D(je9.class, je9Var);
    }

    /* renamed from: K */
    public static C14511b m33635K() {
        return (C14511b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: L */
    public static je9 m33636L(yq1 yq1Var, pp6 pp6Var) {
        return (je9) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: I */
    public ke9 m33637I() {
        ke9 ke9Var = this.params_;
        return ke9Var == null ? ke9.m35542G() : ke9Var;
    }

    /* renamed from: J */
    public int m33638J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m33639M(ke9 ke9Var) {
        ke9Var.getClass();
        this.params_ = ke9Var;
    }

    /* renamed from: N */
    public final void m33640N(int i) {
        this.version_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C14510a c14510a = null;
        switch (C14510a.f30279a[enumC17624d.ordinal()]) {
            case 1:
                return new je9();
            case 2:
                return new C14511b(c14510a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (je9.class) {
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
