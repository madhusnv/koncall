package p001o;

import p001o.vn7;

/* loaded from: classes4.dex */
public final class id9 extends vn7 implements ucb {
    private static final id9 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile jxc PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private yq1 value_ = yq1.f55802b;

    /* renamed from: o.id9$a */
    public static /* synthetic */ class C14257a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28483a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f28483a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28483a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28483a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28483a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28483a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28483a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28483a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.id9$b */
    public static final class C14258b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C14258b(C14257a c14257a) {
            this();
        }

        /* renamed from: t */
        public C14258b m31933t(kgc kgcVar) {
            m53063l();
            ((id9) this.f50580b).m31930O(kgcVar);
            return this;
        }

        /* renamed from: u */
        public C14258b m31934u(String str) {
            m53063l();
            ((id9) this.f50580b).m31931P(str);
            return this;
        }

        /* renamed from: v */
        public C14258b m31935v(yq1 yq1Var) {
            m53063l();
            ((id9) this.f50580b).m31932Q(yq1Var);
            return this;
        }

        public C14258b() {
            super(id9.DEFAULT_INSTANCE);
        }
    }

    static {
        id9 id9Var = new id9();
        DEFAULT_INSTANCE = id9Var;
        vn7.m53041D(id9.class, id9Var);
    }

    /* renamed from: J */
    public static id9 m31925J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: N */
    public static C14258b m31926N() {
        return (C14258b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: K */
    public kgc m31927K() {
        kgc kgcVarForNumber = kgc.forNumber(this.outputPrefixType_);
        return kgcVarForNumber == null ? kgc.UNRECOGNIZED : kgcVarForNumber;
    }

    /* renamed from: L */
    public String m31928L() {
        return this.typeUrl_;
    }

    /* renamed from: M */
    public yq1 m31929M() {
        return this.value_;
    }

    /* renamed from: O */
    public final void m31930O(kgc kgcVar) {
        this.outputPrefixType_ = kgcVar.getNumber();
    }

    /* renamed from: P */
    public final void m31931P(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* renamed from: Q */
    public final void m31932Q(yq1 yq1Var) {
        yq1Var.getClass();
        this.value_ = yq1Var;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C14257a c14257a = null;
        switch (C14257a.f28483a[enumC17624d.ordinal()]) {
            case 1:
                return new id9();
            case 2:
                return new C14258b(c14257a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (id9.class) {
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
