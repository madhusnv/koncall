package p001o;

import p001o.wn7;

/* loaded from: classes6.dex */
public final class ch9 extends wn7 implements tcb {
    private static final ch9 DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile hxc PARSER;
    private double latitude_;
    private double longitude_;

    /* renamed from: o.ch9$a */
    public static /* synthetic */ class C12681a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18187a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f18187a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18187a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18187a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18187a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18187a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18187a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18187a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.ch9$b */
    public static final class C12682b extends wn7.AbstractC17934a implements tcb {
        public /* synthetic */ C12682b(C12681a c12681a) {
            this();
        }

        public C12682b() {
            super(ch9.DEFAULT_INSTANCE);
        }
    }

    static {
        ch9 ch9Var = new ch9();
        DEFAULT_INSTANCE = ch9Var;
        wn7.registerDefaultInstance(ch9.class, ch9Var);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C12681a c12681a = null;
        switch (C12681a.f18187a[enumC17940g.ordinal()]) {
            case 1:
                return new ch9();
            case 2:
                return new C12682b(c12681a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (ch9.class) {
                        c17935b = PARSER;
                        if (c17935b == null) {
                            c17935b = new wn7.C17935b(DEFAULT_INSTANCE);
                            PARSER = c17935b;
                        }
                    }
                }
                return c17935b;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
