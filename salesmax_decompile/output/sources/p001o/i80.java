package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class i80 extends vn7 implements ucb {
    private static final i80 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile jxc PARSER;
    private int ivSize_;

    /* renamed from: o.i80$a */
    public static /* synthetic */ class C14208a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28212a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f28212a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28212a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28212a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28212a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28212a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28212a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28212a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.i80$b */
    public static final class C14209b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C14209b(C14208a c14208a) {
            this();
        }

        public C14209b() {
            super(i80.DEFAULT_INSTANCE);
        }
    }

    static {
        i80 i80Var = new i80();
        DEFAULT_INSTANCE = i80Var;
        vn7.m53041D(i80.class, i80Var);
    }

    /* renamed from: G */
    public static i80 m31705G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: H */
    public int m31706H() {
        return this.ivSize_;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C14208a c14208a = null;
        switch (C14208a.f28212a[enumC17624d.ordinal()]) {
            case 1:
                return new i80();
            case 2:
                return new C14209b(c14208a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (i80.class) {
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
