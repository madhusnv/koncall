package p001o;

import p001o.vn7;
import p001o.xn8;

/* loaded from: classes4.dex */
public final class nc9 extends vn7 implements ucb {
    private static final nc9 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile jxc PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private yq1 value_ = yq1.f55802b;

    /* renamed from: o.nc9$a */
    public static /* synthetic */ class C15543a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36687a;

        static {
            int[] iArr = new int[vn7.EnumC17624d.values().length];
            f36687a = iArr;
            try {
                iArr[vn7.EnumC17624d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36687a[vn7.EnumC17624d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36687a[vn7.EnumC17624d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36687a[vn7.EnumC17624d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36687a[vn7.EnumC17624d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36687a[vn7.EnumC17624d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36687a[vn7.EnumC17624d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.nc9$b */
    public static final class C15544b extends vn7.AbstractC17621a implements ucb {
        public /* synthetic */ C15544b(C15543a c15543a) {
            this();
        }

        /* renamed from: t */
        public C15544b m40327t(EnumC15545c enumC15545c) {
            m53063l();
            ((nc9) this.f50580b).m40324O(enumC15545c);
            return this;
        }

        /* renamed from: u */
        public C15544b m40328u(String str) {
            m53063l();
            ((nc9) this.f50580b).m40325P(str);
            return this;
        }

        /* renamed from: v */
        public C15544b m40329v(yq1 yq1Var) {
            m53063l();
            ((nc9) this.f50580b).m40326Q(yq1Var);
            return this;
        }

        public C15544b() {
            super(nc9.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.nc9$c */
    public enum EnumC15545c implements xn8.InterfaceC18193a {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
        public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
        public static final int REMOTE_VALUE = 4;
        public static final int SYMMETRIC_VALUE = 1;
        public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
        private static final xn8.InterfaceC18194b internalValueMap = new a();
        private final int value;

        /* renamed from: o.nc9$c$a */
        public class a implements xn8.InterfaceC18194b {
        }

        /* renamed from: o.nc9$c$b */
        public static final class b implements xn8.InterfaceC18195c {

            /* renamed from: a */
            public static final xn8.InterfaceC18195c f36688a = new b();

            @Override // p001o.xn8.InterfaceC18195c
            public boolean isInRange(int i) {
                return EnumC15545c.forNumber(i) != null;
            }
        }

        EnumC15545c(int i) {
            this.value = i;
        }

        public static EnumC15545c forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        public static xn8.InterfaceC18194b internalGetValueMap() {
            return internalValueMap;
        }

        public static xn8.InterfaceC18195c internalGetVerifier() {
            return b.f36688a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC15545c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        nc9 nc9Var = new nc9();
        DEFAULT_INSTANCE = nc9Var;
        vn7.m53041D(nc9.class, nc9Var);
    }

    /* renamed from: J */
    public static nc9 m40319J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: N */
    public static C15544b m40320N() {
        return (C15544b) DEFAULT_INSTANCE.m53053k();
    }

    /* renamed from: K */
    public EnumC15545c m40321K() {
        EnumC15545c enumC15545cForNumber = EnumC15545c.forNumber(this.keyMaterialType_);
        return enumC15545cForNumber == null ? EnumC15545c.UNRECOGNIZED : enumC15545cForNumber;
    }

    /* renamed from: L */
    public String m40322L() {
        return this.typeUrl_;
    }

    /* renamed from: M */
    public yq1 m40323M() {
        return this.value_;
    }

    /* renamed from: O */
    public final void m40324O(EnumC15545c enumC15545c) {
        this.keyMaterialType_ = enumC15545c.getNumber();
    }

    /* renamed from: P */
    public final void m40325P(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* renamed from: Q */
    public final void m40326Q(yq1 yq1Var) {
        yq1Var.getClass();
        this.value_ = yq1Var;
    }

    @Override // p001o.vn7
    /* renamed from: n */
    public final Object mo16636n(vn7.EnumC17624d enumC17624d, Object obj, Object obj2) {
        C15543a c15543a = null;
        switch (C15543a.f36687a[enumC17624d.ordinal()]) {
            case 1:
                return new nc9();
            case 2:
                return new C15544b(c15543a);
            case 3:
                return vn7.m53048x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                jxc c17622b = PARSER;
                if (c17622b == null) {
                    synchronized (nc9.class) {
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
