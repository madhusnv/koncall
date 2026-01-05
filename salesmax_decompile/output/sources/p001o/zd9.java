package p001o;

import p001o.vn7;
import p001o.xn8;

/* loaded from: classes4.dex */
public final class zd9 extends vn7 implements ucb {
    private static final zd9 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile jxc PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private xn8.InterfaceC18196d keyInfo_ = vn7.m53043o();
    private int primaryKeyId_;

    /* renamed from: o.zd9$a */
    public static /* synthetic */ class C18615a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56975a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f56975a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56975a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56975a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56975a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56975a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56975a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56975a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.zd9$b */
    public static final class C18616b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C18616b(C18615a c18615a) {
            this();
        }

        /* renamed from: t */
        public C18616b m59228t(C18617c c18617c) {
            m53063l();
            ((zd9) this.f50580b).m59224I(c18617c);
            return this;
        }

        /* renamed from: u */
        public C18616b m59229u(int i) {
            m53063l();
            ((zd9) this.f50580b).m59227M(i);
            return this;
        }

        public C18616b() {
            super(zd9.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.zd9$c */
    public static final class C18617c extends vn7 implements ucb {
        private static final C18617c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile jxc PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* renamed from: o.zd9$c$a */
        public static final class a extends vn7.AbstractC17621a implements ucb {
            public /* synthetic */ a(C18615a c18615a) {
                this();
            }

            /* renamed from: t */
            public a m59241t(int i) {
                m53063l();
                ((C18617c) this.f50580b).m59237M(i);
                return this;
            }

            /* renamed from: u */
            public a m59242u(kgc kgcVar) {
                m53063l();
                ((C18617c) this.f50580b).m59238N(kgcVar);
                return this;
            }

            /* renamed from: v */
            public a m59243v(gd9 gd9Var) {
                m53063l();
                ((C18617c) this.f50580b).m59239O(gd9Var);
                return this;
            }

            /* renamed from: w */
            public a m59244w(String str) {
                m53063l();
                ((C18617c) this.f50580b).m59240P(str);
                return this;
            }

            public a() {
                super(C18617c.DEFAULT_INSTANCE);
            }
        }

        static {
            C18617c c18617c = new C18617c();
            DEFAULT_INSTANCE = c18617c;
            vn7.m53041D(C18617c.class, c18617c);
        }

        /* renamed from: L */
        public static a m59235L() {
            return (a) DEFAULT_INSTANCE.m53053k();
        }

        /* renamed from: K */
        public int m59236K() {
            return this.keyId_;
        }

        /* renamed from: M */
        public final void m59237M(int i) {
            this.keyId_ = i;
        }

        /* renamed from: N */
        public final void m59238N(kgc kgcVar) {
            this.outputPrefixType_ = kgcVar.getNumber();
        }

        /* renamed from: O */
        public final void m59239O(gd9 gd9Var) {
            this.status_ = gd9Var.getNumber();
        }

        /* renamed from: P */
        public final void m59240P(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        @Override // p001o.vn7
        /* renamed from: n */
        public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
            C18615a c18615a = null;
            switch (C18615a.f56975a[enumC17624d.ordinal()]) {
                case 1:
                    return new C18617c();
                case 2:
                    return new a(c18615a);
                case 3:
                    return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    jxc c17622b = PARSER;
                    if (c17622b == null) {
                        synchronized (C18617c.class) {
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

    static {
        zd9 zd9Var = new zd9();
        DEFAULT_INSTANCE = zd9Var;
        vn7.m53041D(zd9.class, zd9Var);
    }

    /* renamed from: L */
    public static C18616b m59223L() {
        return (C18616b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: I */
    public final void m59224I(C18617c c18617c) {
        c18617c.getClass();
        m59225J();
        this.keyInfo_.add(c18617c);
    }

    /* renamed from: J */
    public final void m59225J() {
        if (this.keyInfo_.mo29976k()) {
            return;
        }
        this.keyInfo_ = vn7.m53047v(this.keyInfo_);
    }

    /* renamed from: K */
    public C18617c m59226K(int i) {
        return (C18617c) this.keyInfo_.get(i);
    }

    /* renamed from: M */
    public final void m59227M(int i) {
        this.primaryKeyId_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C18615a c18615a = null;
        switch (C18615a.f56975a[enumC17624d.ordinal()]) {
            case 1:
                return new zd9();
            case 2:
                return new C18616b(c18615a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C18617c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (zd9.class) {
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
