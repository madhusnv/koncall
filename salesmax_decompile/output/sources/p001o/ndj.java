package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class ndj extends vn7 implements ucb {
    private static final ndj DEFAULT_INSTANCE;
    private static volatile jxc PARSER;

    /* renamed from: o.ndj$a */
    public static /* synthetic */ class C15550a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36735a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f36735a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36735a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36735a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36735a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36735a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36735a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36735a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.ndj$b */
    public static final class C15551b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C15551b(C15550a c15550a) {
            this();
        }

        public C15551b() {
            super(ndj.DEFAULT_INSTANCE);
        }
    }

    static {
        ndj ndjVar = new ndj();
        DEFAULT_INSTANCE = ndjVar;
        vn7.m53041D(ndj.class, ndjVar);
    }

    /* renamed from: G */
    public static ndj m40395G(yq1 yq1Var, pp6 pp6Var) {
        return (ndj) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C15550a c15550a = null;
        switch (C15550a.f36735a[enumC17624d.ordinal()]) {
            case 1:
                return new ndj();
            case 2:
                return new C15551b(c15550a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (ndj.class) {
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
