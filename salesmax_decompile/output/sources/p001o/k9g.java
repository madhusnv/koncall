package p001o;

import p001o.fbj;
import p001o.wn7;

/* loaded from: classes6.dex */
public final class k9g extends wn7 implements tcb {
    private static final k9g DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile hxc PARSER;
    private ora fields_ = ora.m42592g();

    /* renamed from: o.k9g$a */
    public static /* synthetic */ class C14750a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31713a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f31713a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31713a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31713a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31713a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31713a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31713a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31713a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.k9g$b */
    public static final class C14751b extends wn7.AbstractC17934a implements tcb {
        public /* synthetic */ C14751b(C14750a c14750a) {
            this();
        }

        public C14751b() {
            super(k9g.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.k9g$c */
    public static final class C14752c {

        /* renamed from: a */
        public static final nra f31714a = nra.m41005d(fbj.EnumC13396b.STRING, "", fbj.EnumC13396b.MESSAGE, tri.m50427h());
    }

    static {
        k9g k9gVar = new k9g();
        DEFAULT_INSTANCE = k9gVar;
        wn7.registerDefaultInstance(k9g.class, k9gVar);
    }

    /* renamed from: h */
    public static k9g m35207h() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: i */
    public static C14751b m35208i(k9g k9gVar) {
        return (C14751b) DEFAULT_INSTANCE.createBuilder(k9gVar);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C14750a c14750a = null;
        switch (C14750a.f31713a[enumC17940g.ordinal()]) {
            case 1:
                return new k9g();
            case 2:
                return new C14751b(c14750a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", C14752c.f31714a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (k9g.class) {
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
