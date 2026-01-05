package p001o;

import java.util.Collections;
import java.util.List;
import p001o.vn7;
import p001o.xn8;

/* loaded from: classes4.dex */
public final class xd9 extends vn7 implements ucb {
    private static final xd9 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile jxc PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private xn8.InterfaceC18196d key_ = vn7.m53043o();
    private int primaryKeyId_;

    /* renamed from: o.xd9$a */
    public static /* synthetic */ class C18116a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53549a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f53549a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53549a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53549a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53549a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53549a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53549a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53549a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.xd9$b */
    public static final class C18117b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C18117b(C18116a c18116a) {
            this();
        }

        /* renamed from: t */
        public C18117b m56057t(C18118c c18118c) {
            m53063l();
            ((xd9) this.f50580b).m56050I(c18118c);
            return this;
        }

        /* renamed from: u */
        public C18118c m56058u(int i) {
            return ((xd9) this.f50580b).m56052K(i);
        }

        /* renamed from: v */
        public int m56059v() {
            return ((xd9) this.f50580b).m56053L();
        }

        /* renamed from: w */
        public List m56060w() {
            return Collections.unmodifiableList(((xd9) this.f50580b).m56054M());
        }

        /* renamed from: x */
        public C18117b m56061x(int i) {
            m53063l();
            ((xd9) this.f50580b).m56056Q(i);
            return this;
        }

        public C18117b() {
            super(xd9.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.xd9$c */
    public static final class C18118c extends vn7 implements ucb {
        private static final C18118c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile jxc PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private nc9 keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* renamed from: o.xd9$c$a */
        public static final class a extends vn7.AbstractC17621a implements ucb {
            public /* synthetic */ a(C18116a c18116a) {
                this();
            }

            /* renamed from: t */
            public a m56077t(nc9 nc9Var) {
                m53063l();
                ((C18118c) this.f50580b).m56073Q(nc9Var);
                return this;
            }

            /* renamed from: u */
            public a m56078u(int i) {
                m53063l();
                ((C18118c) this.f50580b).m56074R(i);
                return this;
            }

            /* renamed from: v */
            public a m56079v(kgc kgcVar) {
                m53063l();
                ((C18118c) this.f50580b).m56075S(kgcVar);
                return this;
            }

            /* renamed from: w */
            public a m56080w(gd9 gd9Var) {
                m53063l();
                ((C18118c) this.f50580b).m56076T(gd9Var);
                return this;
            }

            public a() {
                super(C18118c.DEFAULT_INSTANCE);
            }
        }

        static {
            C18118c c18118c = new C18118c();
            DEFAULT_INSTANCE = c18118c;
            vn7.m53041D(C18118c.class, c18118c);
        }

        /* renamed from: P */
        public static a m56067P() {
            return (a) DEFAULT_INSTANCE.m53053k();
        }

        /* renamed from: K */
        public nc9 m56068K() {
            nc9 nc9Var = this.keyData_;
            return nc9Var == null ? nc9.m40319J() : nc9Var;
        }

        /* renamed from: L */
        public int m56069L() {
            return this.keyId_;
        }

        /* renamed from: M */
        public kgc m56070M() {
            kgc kgcVarForNumber = kgc.forNumber(this.outputPrefixType_);
            return kgcVarForNumber == null ? kgc.UNRECOGNIZED : kgcVarForNumber;
        }

        /* renamed from: N */
        public gd9 m56071N() {
            gd9 gd9VarForNumber = gd9.forNumber(this.status_);
            return gd9VarForNumber == null ? gd9.UNRECOGNIZED : gd9VarForNumber;
        }

        /* renamed from: O */
        public boolean m56072O() {
            return this.keyData_ != null;
        }

        /* renamed from: Q */
        public final void m56073Q(nc9 nc9Var) {
            nc9Var.getClass();
            this.keyData_ = nc9Var;
        }

        /* renamed from: R */
        public final void m56074R(int i) {
            this.keyId_ = i;
        }

        /* renamed from: S */
        public final void m56075S(kgc kgcVar) {
            this.outputPrefixType_ = kgcVar.getNumber();
        }

        /* renamed from: T */
        public final void m56076T(gd9 gd9Var) {
            this.status_ = gd9Var.getNumber();
        }

        @Override // p001o.vn7
        /* renamed from: n */
        public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
            C18116a c18116a = null;
            switch (C18116a.f53549a[enumC17624d.ordinal()]) {
                case 1:
                    return new C18118c();
                case 2:
                    return new a(c18116a);
                case 3:
                    return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    jxc c17622b = PARSER;
                    if (c17622b == null) {
                        synchronized (C18118c.class) {
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
        xd9 xd9Var = new xd9();
        DEFAULT_INSTANCE = xd9Var;
        vn7.m53041D(xd9.class, xd9Var);
    }

    /* renamed from: O */
    public static C18117b m56048O() {
        return (C18117b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: P */
    public static xd9 m56049P(byte[] bArr, pp6 pp6Var) {
        return (xd9) vn7.m53050z(DEFAULT_INSTANCE, bArr, pp6Var);
    }

    /* renamed from: I */
    public final void m56050I(C18118c c18118c) {
        c18118c.getClass();
        m56051J();
        this.key_.add(c18118c);
    }

    /* renamed from: J */
    public final void m56051J() {
        if (this.key_.mo29976k()) {
            return;
        }
        this.key_ = vn7.m53047v(this.key_);
    }

    /* renamed from: K */
    public C18118c m56052K(int i) {
        return (C18118c) this.key_.get(i);
    }

    /* renamed from: L */
    public int m56053L() {
        return this.key_.size();
    }

    /* renamed from: M */
    public List m56054M() {
        return this.key_;
    }

    /* renamed from: N */
    public int m56055N() {
        return this.primaryKeyId_;
    }

    /* renamed from: Q */
    public final void m56056Q(int i) {
        this.primaryKeyId_ = i;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C18116a c18116a = null;
        switch (C18116a.f53549a[enumC17624d.ordinal()]) {
            case 1:
                return new xd9();
            case 2:
                return new C18117b(c18116a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C18118c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (xd9.class) {
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
