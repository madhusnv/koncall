package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class s80 extends vn7 implements ucb {
    private static final s80 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private yq1 keyValue_ = yq1.f55802b;
    private int version_;

    /* renamed from: o.s80$a */
    public static /* synthetic */ class C16765a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44916a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f44916a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44916a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44916a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44916a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44916a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44916a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44916a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.s80$b */
    public static final class C16766b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C16766b(C16765a c16765a) {
            this();
        }

        /* renamed from: t */
        public C16766b m47960t(yq1 yq1Var) {
            m53063l();
            ((s80) this.f50580b).m47958M(yq1Var);
            return this;
        }

        /* renamed from: u */
        public C16766b m47961u(int i) {
            m53063l();
            ((s80) this.f50580b).m47959N(i);
            return this;
        }

        public C16766b() {
            super(s80.DEFAULT_INSTANCE);
        }
    }

    static {
        s80 s80Var = new s80();
        DEFAULT_INSTANCE = s80Var;
        vn7.m53041D(s80.class, s80Var);
    }

    /* renamed from: K */
    public static C16766b m47954K() {
        return (C16766b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: L */
    public static s80 m47955L(yq1 yq1Var, pp6 pp6Var) {
        return (s80) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: I */
    public yq1 m47956I() {
        return this.keyValue_;
    }

    /* renamed from: J */
    public int m47957J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m47958M(yq1 yq1Var) {
        yq1Var.getClass();
        this.keyValue_ = yq1Var;
    }

    /* renamed from: N */
    public final void m47959N(int i) {
        this.version_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C16765a c16765a = null;
        switch (C16765a.f44916a[enumC17624d.ordinal()]) {
            case 1:
                return new s80();
            case 2:
                return new C16766b(c16765a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (s80.class) {
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
