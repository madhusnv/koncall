package p001o;

import p001o.vn7;
import p001o.xn8;

/* loaded from: classes4.dex */
public final class ehe extends vn7 implements ucb {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final ehe DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile jxc PARSER;
    private String configName_ = "";
    private xn8.InterfaceC18196d entry_ = vn7.m53043o();

    /* renamed from: o.ehe$a */
    public static /* synthetic */ class C13192a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21692a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f21692a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21692a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21692a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21692a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21692a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21692a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21692a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.ehe$b */
    public static final class C13193b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C13193b(C13192a c13192a) {
            this();
        }

        public C13193b() {
            super(ehe.DEFAULT_INSTANCE);
        }
    }

    static {
        ehe eheVar = new ehe();
        DEFAULT_INSTANCE = eheVar;
        vn7.m53041D(ehe.class, eheVar);
    }

    /* renamed from: G */
    public static ehe m25062G() {
        return DEFAULT_INSTANCE;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C13192a c13192a = null;
        switch (C13192a.f21692a[enumC17624d.ordinal()]) {
            case 1:
                return new ehe();
            case 2:
                return new C13193b(c13192a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", ld9.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (ehe.class) {
                        c17622b = PARSER;
                        if (c17622b == null) {
                            c17622b = new vn7.C17622b(DEFAULT_INSTANCE);
                            PARSER = c17622b;
                        }
                    }
                }
                return c17622b;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
