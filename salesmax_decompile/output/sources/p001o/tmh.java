package p001o;

import p001o.wn7;

/* loaded from: classes6.dex */
public final class tmh extends wn7 implements tcb {
    private static final tmh DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile hxc PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: o.tmh$a */
    public static /* synthetic */ class C17162a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47444a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f47444a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47444a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47444a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47444a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47444a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47444a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47444a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.tmh$b */
    public static final class C17163b extends wn7.AbstractC17934a implements tcb {
        public /* synthetic */ C17163b(C17162a c17162a) {
            this();
        }

        public C17163b() {
            super(tmh.DEFAULT_INSTANCE);
        }
    }

    static {
        tmh tmhVar = new tmh();
        DEFAULT_INSTANCE = tmhVar;
        wn7.registerDefaultInstance(tmh.class, tmhVar);
    }

    /* renamed from: h */
    public static tmh m50207h() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: i */
    public static C17163b m50208i(tmh tmhVar) {
        return (C17163b) DEFAULT_INSTANCE.createBuilder(tmhVar);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C17162a c17162a = null;
        switch (C17162a.f47444a[enumC17940g.ordinal()]) {
            case 1:
                return new tmh();
            case 2:
                return new C17163b(c17162a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (tmh.class) {
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
