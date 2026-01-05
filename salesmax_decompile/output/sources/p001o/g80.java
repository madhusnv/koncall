package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class g80 extends vn7 implements ucb {
    private static final g80 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile jxc PARSER;
    private int keySize_;
    private i80 params_;

    /* renamed from: o.g80$a */
    public static /* synthetic */ class C13634a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24705a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f24705a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24705a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24705a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24705a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24705a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24705a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24705a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.g80$b */
    public static final class C13635b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C13635b(C13634a c13634a) {
            this();
        }

        public C13635b() {
            super(g80.DEFAULT_INSTANCE);
        }
    }

    static {
        g80 g80Var = new g80();
        DEFAULT_INSTANCE = g80Var;
        vn7.m53041D(g80.class, g80Var);
    }

    /* renamed from: I */
    public static g80 m28159I(yq1 yq1Var, pp6 pp6Var) {
        return (g80) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: G */
    public int m28160G() {
        return this.keySize_;
    }

    /* renamed from: H */
    public i80 m28161H() {
        i80 i80Var = this.params_;
        return i80Var == null ? i80.m31705G() : i80Var;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C13634a c13634a = null;
        switch (C13634a.f24705a[enumC17624d.ordinal()]) {
            case 1:
                return new g80();
            case 2:
                return new C13635b(c13634a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (g80.class) {
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
