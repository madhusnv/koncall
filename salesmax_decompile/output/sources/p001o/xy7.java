package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class xy7 extends vn7 implements ucb {
    private static final xy7 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile jxc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private az7 params_;
    private int version_;

    /* renamed from: o.xy7$a */
    public static /* synthetic */ class C18263a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54476a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f54476a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54476a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54476a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54476a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54476a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54476a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54476a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.xy7$b */
    public static final class C18264b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C18264b(C18263a c18263a) {
            this();
        }

        public C18264b() {
            super(xy7.DEFAULT_INSTANCE);
        }
    }

    static {
        xy7 xy7Var = new xy7();
        DEFAULT_INSTANCE = xy7Var;
        vn7.m53041D(xy7.class, xy7Var);
    }

    /* renamed from: G */
    public static xy7 m56960G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public static xy7 m56961J(yq1 yq1Var, pp6 pp6Var) {
        return (xy7) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: H */
    public int m56962H() {
        return this.keySize_;
    }

    /* renamed from: I */
    public az7 m56963I() {
        az7 az7Var = this.params_;
        return az7Var == null ? az7.m18037G() : az7Var;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C18263a c18263a = null;
        switch (C18263a.f54476a[enumC17624d.ordinal()]) {
            case 1:
                return new xy7();
            case 2:
                return new C18264b(c18263a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (xy7.class) {
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
