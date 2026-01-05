package p001o;

import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class pfa extends wn7 implements tcb {
    private static final pfa DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private yn8.InterfaceC18446j values_ = wn7.emptyProtobufList();

    /* renamed from: o.pfa$a */
    public static /* synthetic */ class C16103a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39999a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f39999a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39999a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39999a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39999a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39999a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39999a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39999a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.pfa$b */
    public static final class C16104b extends wn7.AbstractC17934a implements tcb {
        public /* synthetic */ C16104b(C16103a c16103a) {
            this();
        }

        public C16104b() {
            super(pfa.DEFAULT_INSTANCE);
        }
    }

    static {
        pfa pfaVar = new pfa();
        DEFAULT_INSTANCE = pfaVar;
        wn7.registerDefaultInstance(pfa.class, pfaVar);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C16103a c16103a = null;
        switch (C16103a.f39999a[enumC17940g.ordinal()]) {
            case 1:
                return new pfa();
            case 2:
                return new C16104b(c16103a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", tri.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (pfa.class) {
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
