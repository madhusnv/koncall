package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class o80 extends vn7 implements ucb {
    private static final o80 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private yq1 keyValue_ = yq1.f55802b;
    private int version_;

    /* renamed from: o.o80$a */
    public static /* synthetic */ class C15725a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37884a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f37884a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37884a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37884a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37884a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37884a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37884a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37884a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.o80$b */
    public static final class C15726b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C15726b(C15725a c15725a) {
            this();
        }

        /* renamed from: t */
        public C15726b m41726t(yq1 yq1Var) {
            m53063l();
            ((o80) this.f50580b).m41724M(yq1Var);
            return this;
        }

        /* renamed from: u */
        public C15726b m41727u(int i) {
            m53063l();
            ((o80) this.f50580b).m41725N(i);
            return this;
        }

        public C15726b() {
            super(o80.DEFAULT_INSTANCE);
        }
    }

    static {
        o80 o80Var = new o80();
        DEFAULT_INSTANCE = o80Var;
        vn7.m53041D(o80.class, o80Var);
    }

    /* renamed from: K */
    public static C15726b m41720K() {
        return (C15726b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: L */
    public static o80 m41721L(yq1 yq1Var, pp6 pp6Var) {
        return (o80) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: I */
    public yq1 m41722I() {
        return this.keyValue_;
    }

    /* renamed from: J */
    public int m41723J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m41724M(yq1 yq1Var) {
        yq1Var.getClass();
        this.keyValue_ = yq1Var;
    }

    /* renamed from: N */
    public final void m41725N(int i) {
        this.version_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C15725a c15725a = null;
        switch (C15725a.f37884a[enumC17624d.ordinal()]) {
            case 1:
                return new o80();
            case 2:
                return new C15726b(c15725a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (o80.class) {
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
