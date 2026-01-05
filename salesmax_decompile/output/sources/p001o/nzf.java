package p001o;

import p001o.wn7;

/* loaded from: classes6.dex */
public final class nzf extends wn7 implements tcb {
    private static final nzf DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile hxc PARSER;
    private String fileName_ = "";

    /* renamed from: o.nzf$a */
    public static /* synthetic */ class C15686a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37487a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f37487a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37487a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37487a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37487a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37487a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37487a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37487a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.nzf$b */
    public static final class C15687b extends wn7.AbstractC17934a implements tcb {
        public /* synthetic */ C15687b(C15686a c15686a) {
            this();
        }

        public C15687b() {
            super(nzf.DEFAULT_INSTANCE);
        }
    }

    static {
        nzf nzfVar = new nzf();
        DEFAULT_INSTANCE = nzfVar;
        wn7.registerDefaultInstance(nzf.class, nzfVar);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C15686a c15686a = null;
        switch (C15686a.f37487a[enumC17940g.ordinal()]) {
            case 1:
                return new nzf();
            case 2:
                return new C15687b(c15686a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (nzf.class) {
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
