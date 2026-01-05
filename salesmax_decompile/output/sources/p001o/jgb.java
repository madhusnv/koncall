package p001o;

import p001o.wn7;

/* loaded from: classes6.dex */
public final class jgb extends wn7 implements tcb {
    private static final jgb DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    /* renamed from: o.jgb$a */
    public static /* synthetic */ class C14536a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30394a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f30394a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30394a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30394a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30394a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30394a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30394a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30394a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.jgb$b */
    public static final class C14537b extends wn7.AbstractC17934a implements tcb {
        public /* synthetic */ C14537b(C14536a c14536a) {
            this();
        }

        public C14537b() {
            super(jgb.DEFAULT_INSTANCE);
        }
    }

    static {
        jgb jgbVar = new jgb();
        DEFAULT_INSTANCE = jgbVar;
        wn7.registerDefaultInstance(jgb.class, jgbVar);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C14536a c14536a = null;
        switch (C14536a.f30394a[enumC17940g.ordinal()]) {
            case 1:
                return new jgb();
            case 2:
                return new C14537b(c14536a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (jgb.class) {
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
