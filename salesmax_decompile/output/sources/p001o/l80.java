package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class l80 extends vn7 implements ucb {
    private static final l80 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    /* renamed from: o.l80$a */
    public static /* synthetic */ class C15029a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33425a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f33425a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33425a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33425a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33425a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33425a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33425a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33425a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.l80$b */
    public static final class C15030b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C15030b(C15029a c15029a) {
            this();
        }

        /* renamed from: t */
        public C15030b m36731t(int i) {
            m53063l();
            ((l80) this.f50580b).m36730K(i);
            return this;
        }

        public C15030b() {
            super(l80.DEFAULT_INSTANCE);
        }
    }

    static {
        l80 l80Var = new l80();
        DEFAULT_INSTANCE = l80Var;
        vn7.m53041D(l80.class, l80Var);
    }

    /* renamed from: I */
    public static C15030b m36727I() {
        return (C15030b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: J */
    public static l80 m36728J(yq1 yq1Var, pp6 pp6Var) {
        return (l80) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: H */
    public int m36729H() {
        return this.keySize_;
    }

    /* renamed from: K */
    public final void m36730K(int i) {
        this.keySize_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C15029a c15029a = null;
        switch (C15029a.f33425a[enumC17624d.ordinal()]) {
            case 1:
                return new l80();
            case 2:
                return new C15030b(c15029a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (l80.class) {
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
