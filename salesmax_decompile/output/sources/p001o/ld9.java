package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class ld9 extends vn7 implements ucb {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final ld9 DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile jxc PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    /* renamed from: o.ld9$a */
    public static /* synthetic */ class C15059a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33650a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f33650a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33650a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33650a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33650a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33650a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33650a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33650a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.ld9$b */
    public static final class C15060b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C15060b(C15059a c15059a) {
            this();
        }

        public C15060b() {
            super(ld9.DEFAULT_INSTANCE);
        }
    }

    static {
        ld9 ld9Var = new ld9();
        DEFAULT_INSTANCE = ld9Var;
        vn7.m53041D(ld9.class, ld9Var);
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C15059a c15059a = null;
        switch (C15059a.f33650a[enumC17624d.ordinal()]) {
            case 1:
                return new ld9();
            case 2:
                return new C15060b(c15059a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (ld9.class) {
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
