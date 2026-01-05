package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class s76 extends vn7 implements ucb {
    private static final s76 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile jxc PARSER;
    private yq1 encryptedKeyset_ = yq1.f55802b;
    private zd9 keysetInfo_;

    /* renamed from: o.s76$a */
    public static /* synthetic */ class C16763a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44883a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f44883a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44883a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44883a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44883a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44883a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44883a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44883a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.s76$b */
    public static final class C16764b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C16764b(C16763a c16763a) {
            this();
        }

        /* renamed from: t */
        public C16764b m47942t(yq1 yq1Var) {
            m53063l();
            ((s76) this.f50580b).m47940L(yq1Var);
            return this;
        }

        /* renamed from: u */
        public C16764b m47943u(zd9 zd9Var) {
            m53063l();
            ((s76) this.f50580b).m47941M(zd9Var);
            return this;
        }

        public C16764b() {
            super(s76.DEFAULT_INSTANCE);
        }
    }

    static {
        s76 s76Var = new s76();
        DEFAULT_INSTANCE = s76Var;
        vn7.m53041D(s76.class, s76Var);
    }

    /* renamed from: J */
    public static C16764b m47937J() {
        return (C16764b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: K */
    public static s76 m47938K(byte[] bArr, pp6 pp6Var) {
        return (s76) vn7.m53050z(DEFAULT_INSTANCE, bArr, pp6Var);
    }

    /* renamed from: I */
    public yq1 m47939I() {
        return this.encryptedKeyset_;
    }

    /* renamed from: L */
    public final void m47940L(yq1 yq1Var) {
        yq1Var.getClass();
        this.encryptedKeyset_ = yq1Var;
    }

    /* renamed from: M */
    public final void m47941M(zd9 zd9Var) {
        zd9Var.getClass();
        this.keysetInfo_ = zd9Var;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C16763a c16763a = null;
        switch (C16763a.f44883a[enumC17624d.ordinal()]) {
            case 1:
                return new s76();
            case 2:
                return new C16764b(c16763a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (s76.class) {
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
