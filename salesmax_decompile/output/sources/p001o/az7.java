package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class az7 extends vn7 implements ucb {
    private static final az7 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile jxc PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* renamed from: o.az7$a */
    public static /* synthetic */ class C12273a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15402a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f15402a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15402a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15402a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15402a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15402a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15402a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15402a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.az7$b */
    public static final class C12274b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C12274b(C12273a c12273a) {
            this();
        }

        public C12274b() {
            super(az7.DEFAULT_INSTANCE);
        }
    }

    static {
        az7 az7Var = new az7();
        DEFAULT_INSTANCE = az7Var;
        vn7.m53041D(az7.class, az7Var);
    }

    /* renamed from: G */
    public static az7 m18037G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: H */
    public ex7 m18038H() {
        ex7 ex7VarForNumber = ex7.forNumber(this.hash_);
        return ex7VarForNumber == null ? ex7.UNRECOGNIZED : ex7VarForNumber;
    }

    /* renamed from: I */
    public int m18039I() {
        return this.tagSize_;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C12273a c12273a = null;
        switch (C12273a.f15402a[enumC17624d.ordinal()]) {
            case 1:
                return new az7();
            case 2:
                return new C12274b(c12273a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (az7.class) {
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
