package p001o;

import p001o.wn7;

/* loaded from: classes6.dex */
public final class nec extends wn7 implements tcb {
    private static final nec DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private wh0 value_;

    /* renamed from: o.nec$a */
    public static /* synthetic */ class C15556a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36755a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f36755a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36755a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36755a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36755a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36755a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36755a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36755a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.nec$b */
    public static final class C15557b extends wn7.AbstractC17934a implements tcb {
        public /* synthetic */ C15557b(C15556a c15556a) {
            this();
        }

        public C15557b() {
            super(nec.DEFAULT_INSTANCE);
        }
    }

    static {
        nec necVar = new nec();
        DEFAULT_INSTANCE = necVar;
        wn7.registerDefaultInstance(nec.class, necVar);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C15556a c15556a = null;
        switch (C15556a.f36755a[enumC17940g.ordinal()]) {
            case 1:
                return new nec();
            case 2:
                return new C15557b(c15556a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (nec.class) {
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
