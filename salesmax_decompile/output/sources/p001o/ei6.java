package p001o;

import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class ei6 extends wn7 implements ki6 {
    private static final ei6 DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile hxc PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private nzf sourceContext_;
    private int syntax_;
    private String name_ = "";
    private yn8.InterfaceC18446j enumvalue_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j options_ = wn7.emptyProtobufList();

    /* renamed from: o.ei6$a */
    public static /* synthetic */ class C13199a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21730a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f21730a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21730a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21730a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21730a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21730a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21730a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21730a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.ei6$b */
    public static final class C13200b extends wn7.AbstractC17934a implements ki6 {
        public /* synthetic */ C13200b(C13199a c13199a) {
            this();
        }

        public C13200b() {
            super(ei6.DEFAULT_INSTANCE);
        }
    }

    static {
        ei6 ei6Var = new ei6();
        DEFAULT_INSTANCE = ei6Var;
        wn7.registerDefaultInstance(ei6.class, ei6Var);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C13199a c13199a = null;
        switch (C13199a.f21730a[enumC17940g.ordinal()]) {
            case 1:
                return new ei6();
            case 2:
                return new C13200b(c13199a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", mi6.class, "options_", nec.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (ei6.class) {
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
