package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class vf2 extends vn7 implements ucb {
    private static final vf2 DEFAULT_INSTANCE;
    private static volatile jxc PARSER;

    /* renamed from: o.vf2$a */
    public static /* synthetic */ class C17569a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50268a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f50268a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50268a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50268a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50268a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50268a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50268a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50268a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.vf2$b */
    public static final class C17570b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C17570b(C17569a c17569a) {
            this();
        }

        public C17570b() {
            super(vf2.DEFAULT_INSTANCE);
        }
    }

    static {
        vf2 vf2Var = new vf2();
        DEFAULT_INSTANCE = vf2Var;
        vn7.m53041D(vf2.class, vf2Var);
    }

    /* renamed from: G */
    public static vf2 m52695G(yq1 yq1Var, pp6 pp6Var) {
        return (vf2) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C17569a c17569a = null;
        switch (C17569a.f50268a[enumC17624d.ordinal()]) {
            case 1:
                return new vf2();
            case 2:
                return new C17570b(c17569a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (vf2.class) {
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
