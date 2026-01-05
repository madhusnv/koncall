package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class uf2 extends vn7 implements ucb {
    private static final uf2 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private yq1 keyValue_ = yq1.f55802b;
    private int version_;

    /* renamed from: o.uf2$a */
    public static /* synthetic */ class C17372a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48868a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f48868a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48868a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48868a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48868a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48868a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f48868a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f48868a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.uf2$b */
    public static final class C17373b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C17373b(C17372a c17372a) {
            this();
        }

        /* renamed from: t */
        public C17373b m51514t(yq1 yq1Var) {
            m53063l();
            ((uf2) this.f50580b).m51512M(yq1Var);
            return this;
        }

        /* renamed from: u */
        public C17373b m51515u(int i) {
            m53063l();
            ((uf2) this.f50580b).m51513N(i);
            return this;
        }

        public C17373b() {
            super(uf2.DEFAULT_INSTANCE);
        }
    }

    static {
        uf2 uf2Var = new uf2();
        DEFAULT_INSTANCE = uf2Var;
        vn7.m53041D(uf2.class, uf2Var);
    }

    /* renamed from: K */
    public static C17373b m51508K() {
        return (C17373b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: L */
    public static uf2 m51509L(yq1 yq1Var, pp6 pp6Var) {
        return (uf2) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: I */
    public yq1 m51510I() {
        return this.keyValue_;
    }

    /* renamed from: J */
    public int m51511J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m51512M(yq1 yq1Var) {
        yq1Var.getClass();
        this.keyValue_ = yq1Var;
    }

    /* renamed from: N */
    public final void m51513N(int i) {
        this.version_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C17372a c17372a = null;
        switch (C17372a.f48868a[enumC17624d.ordinal()]) {
            case 1:
                return new uf2();
            case 2:
                return new C17373b(c17372a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (uf2.class) {
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
