package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class v70 extends vn7 implements ucb {
    private static final v70 DEFAULT_INSTANCE;
    private static volatile jxc PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    /* renamed from: o.v70$a */
    public static /* synthetic */ class C17520a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49945a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f49945a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49945a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49945a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49945a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49945a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49945a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f49945a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.v70$b */
    public static final class C17521b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C17521b(C17520a c17520a) {
            this();
        }

        public C17521b() {
            super(v70.DEFAULT_INSTANCE);
        }
    }

    static {
        v70 v70Var = new v70();
        DEFAULT_INSTANCE = v70Var;
        vn7.m53041D(v70.class, v70Var);
    }

    /* renamed from: G */
    public static v70 m52393G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: H */
    public int m52394H() {
        return this.tagSize_;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C17520a c17520a = null;
        switch (C17520a.f49945a[enumC17624d.ordinal()]) {
            case 1:
                return new v70();
            case 2:
                return new C17521b(c17520a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (v70.class) {
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
