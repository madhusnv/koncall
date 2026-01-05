package p001o;

import p001o.wn7;

/* loaded from: classes6.dex */
public final class tri extends wn7 implements tcb {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final tri DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile hxc PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* renamed from: o.tri$a */
    public static /* synthetic */ class C17195a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47660a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f47660a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47660a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47660a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47660a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47660a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47660a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47660a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.tri$b */
    public static final class C17196b extends wn7.AbstractC17934a implements tcb {
        public /* synthetic */ C17196b(C17195a c17195a) {
            this();
        }

        public C17196b() {
            super(tri.DEFAULT_INSTANCE);
        }
    }

    static {
        tri triVar = new tri();
        DEFAULT_INSTANCE = triVar;
        wn7.registerDefaultInstance(tri.class, triVar);
    }

    /* renamed from: h */
    public static tri m50427h() {
        return DEFAULT_INSTANCE;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C17195a c17195a = null;
        switch (C17195a.f47660a[enumC17940g.ordinal()]) {
            case 1:
                return new tri();
            case 2:
                return new C17196b(c17195a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", k9g.class, pfa.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (tri.class) {
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
