package p001o;

import p001o.wn7;

/* loaded from: classes6.dex */
public final class wh0 extends wn7 implements xh0 {
    private static final wh0 DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private xq1 value_ = xq1.f54049b;

    /* renamed from: o.wh0$a */
    public static /* synthetic */ class C17862a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51975a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f51975a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51975a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51975a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51975a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51975a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51975a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51975a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.wh0$b */
    public static final class C17863b extends wn7.AbstractC17934a implements xh0 {
        public /* synthetic */ C17863b(C17862a c17862a) {
            this();
        }

        public C17863b() {
            super(wh0.DEFAULT_INSTANCE);
        }
    }

    static {
        wh0 wh0Var = new wh0();
        DEFAULT_INSTANCE = wh0Var;
        wn7.registerDefaultInstance(wh0.class, wh0Var);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C17862a c17862a = null;
        switch (C17862a.f51975a[enumC17940g.ordinal()]) {
            case 1:
                return new wh0();
            case 2:
                return new C17863b(c17862a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (wh0.class) {
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
