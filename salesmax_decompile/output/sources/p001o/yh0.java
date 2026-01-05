package p001o;

import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class yh0 extends wn7 implements ki0 {
    private static final yh0 DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile hxc PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private nzf sourceContext_;
    private int syntax_;
    private String name_ = "";
    private yn8.InterfaceC18446j methods_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j options_ = wn7.emptyProtobufList();
    private String version_ = "";
    private yn8.InterfaceC18446j mixins_ = wn7.emptyProtobufList();

    /* renamed from: o.yh0$a */
    public static /* synthetic */ class C18404a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55505a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f55505a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55505a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55505a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55505a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55505a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55505a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55505a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.yh0$b */
    public static final class C18405b extends wn7.AbstractC17934a implements ki0 {
        public /* synthetic */ C18405b(C18404a c18404a) {
            this();
        }

        public C18405b() {
            super(yh0.DEFAULT_INSTANCE);
        }
    }

    static {
        yh0 yh0Var = new yh0();
        DEFAULT_INSTANCE = yh0Var;
        wn7.registerDefaultInstance(yh0.class, yh0Var);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C18404a c18404a = null;
        switch (C18404a.f55505a[enumC17940g.ordinal()]) {
            case 1:
                return new yh0();
            case 2:
                return new C18405b(c18404a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", keb.class, "options_", nec.class, "version_", "sourceContext_", "mixins_", jgb.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (yh0.class) {
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
