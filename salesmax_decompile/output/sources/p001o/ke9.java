package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class ke9 extends vn7 implements ucb {
    private static final ke9 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile jxc PARSER;
    private id9 dekTemplate_;
    private String kekUri_ = "";

    /* renamed from: o.ke9$a */
    public static /* synthetic */ class C14816a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32110a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f32110a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32110a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32110a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32110a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32110a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32110a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32110a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.ke9$b */
    public static final class C14817b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C14817b(C14816a c14816a) {
            this();
        }

        public C14817b() {
            super(ke9.DEFAULT_INSTANCE);
        }
    }

    static {
        ke9 ke9Var = new ke9();
        DEFAULT_INSTANCE = ke9Var;
        vn7.m53041D(ke9.class, ke9Var);
    }

    /* renamed from: G */
    public static ke9 m35542G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public static ke9 m35543J(yq1 yq1Var, pp6 pp6Var) {
        return (ke9) vn7.m53049y(DEFAULT_INSTANCE, yq1Var, pp6Var);
    }

    /* renamed from: H */
    public id9 m35544H() {
        id9 id9Var = this.dekTemplate_;
        return id9Var == null ? id9.m31925J() : id9Var;
    }

    /* renamed from: I */
    public String m35545I() {
        return this.kekUri_;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C14816a c14816a = null;
        switch (C14816a.f32110a[enumC17624d.ordinal()]) {
            case 1:
                return new ke9();
            case 2:
                return new C14817b(c14816a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (ke9.class) {
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
