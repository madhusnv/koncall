package p001o;

import p001o.wn7;

/* loaded from: classes6.dex */
public final class k0i extends wn7 implements tcb {
    private static final k0i DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* renamed from: o.k0i$a */
    public static /* synthetic */ class C14698a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31351a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f31351a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31351a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31351a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31351a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31351a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31351a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31351a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.k0i$b */
    public static final class C14699b extends wn7.AbstractC17934a implements tcb {
        public /* synthetic */ C14699b(C14698a c14698a) {
            this();
        }

        public C14699b() {
            super(k0i.DEFAULT_INSTANCE);
        }
    }

    static {
        k0i k0iVar = new k0i();
        DEFAULT_INSTANCE = k0iVar;
        wn7.registerDefaultInstance(k0i.class, k0iVar);
    }

    /* renamed from: h */
    public static k0i m34849h() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: i */
    public static C14699b m34850i(k0i k0iVar) {
        return (C14699b) DEFAULT_INSTANCE.createBuilder(k0iVar);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C14698a c14698a = null;
        switch (C14698a.f31351a[enumC17940g.ordinal()]) {
            case 1:
                return new k0i();
            case 2:
                return new C14699b(c14698a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (k0i.class) {
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
