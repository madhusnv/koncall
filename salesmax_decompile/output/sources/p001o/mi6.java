package p001o;

import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class mi6 extends wn7 implements tcb {
    private static final mi6 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile hxc PARSER;
    private int number_;
    private String name_ = "";
    private yn8.InterfaceC18446j options_ = wn7.emptyProtobufList();

    /* renamed from: o.mi6$a */
    public static /* synthetic */ class C15330a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35506a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f35506a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35506a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35506a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35506a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35506a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35506a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35506a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.mi6$b */
    public static final class C15331b extends wn7.AbstractC17934a implements tcb {
        public /* synthetic */ C15331b(C15330a c15330a) {
            this();
        }

        public C15331b() {
            super(mi6.DEFAULT_INSTANCE);
        }
    }

    static {
        mi6 mi6Var = new mi6();
        DEFAULT_INSTANCE = mi6Var;
        wn7.registerDefaultInstance(mi6.class, mi6Var);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C15330a c15330a = null;
        switch (C15330a.f35506a[enumC17940g.ordinal()]) {
            case 1:
                return new mi6();
            case 2:
                return new C15331b(c15330a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", nec.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (mi6.class) {
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
