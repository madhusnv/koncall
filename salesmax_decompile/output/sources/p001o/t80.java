package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class t80 extends vn7 implements ucb {
    private static final t80 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile jxc PARSER;
    private int keySize_;

    /* renamed from: o.t80$a */
    public static /* synthetic */ class C17020a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46608a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f46608a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46608a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46608a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46608a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46608a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46608a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46608a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.t80$b */
    public static final class C17021b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C17021b(C17020a c17020a) {
            this();
        }

        /* renamed from: t */
        public C17021b m49555t(int i) {
            m53063l();
            ((t80) this.f50580b).m49554K(i);
            return this;
        }

        public C17021b() {
            super(t80.DEFAULT_INSTANCE);
        }
    }

    static {
        t80 t80Var = new t80();
        DEFAULT_INSTANCE = t80Var;
        vn7.m53041D(t80.class, t80Var);
    }

    /* renamed from: I */
    public static C17021b m49551I() {
        return (C17021b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: J */
    public static t80 m49552J(yq1 yq1Var, pp6 pp6Var) {
        return (t80) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: H */
    public int m49553H() {
        return this.keySize_;
    }

    /* renamed from: K */
    public final void m49554K(int i) {
        this.keySize_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C17020a c17020a = null;
        switch (C17020a.f46608a[enumC17624d.ordinal()]) {
            case 1:
                return new t80();
            case 2:
                return new C17021b(c17020a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (t80.class) {
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
