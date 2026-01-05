package p001o;

import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class tm5 extends wn7.AbstractC17937d {
    public static final int CTYPE_FIELD_NUMBER = 1;
    private static final tm5 DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int JSTYPE_FIELD_NUMBER = 6;
    public static final int LAZY_FIELD_NUMBER = 5;
    public static final int PACKED_FIELD_NUMBER = 2;
    private static volatile hxc PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int WEAK_FIELD_NUMBER = 10;
    private int bitField0_;
    private int ctype_;
    private boolean deprecated_;
    private int jstype_;
    private boolean lazy_;
    private boolean packed_;
    private boolean weak_;
    private byte memoizedIsInitialized = 2;
    private yn8.InterfaceC18446j uninterpretedOption_ = wn7.emptyProtobufList();

    /* renamed from: o.tm5$a */
    public static final class C17156a extends wn7.AbstractC17936c {
        public /* synthetic */ C17156a(sm5 sm5Var) {
            this();
        }

        public C17156a() {
            super(tm5.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.tm5$b */
    public enum EnumC17157b implements yn8.InterfaceC18439c {
        STRING(0),
        CORD(1),
        STRING_PIECE(2);

        public static final int CORD_VALUE = 1;
        public static final int STRING_PIECE_VALUE = 2;
        public static final int STRING_VALUE = 0;
        private static final yn8.InterfaceC18440d internalValueMap = new a();
        private final int value;

        /* renamed from: o.tm5$b$a */
        public class a implements yn8.InterfaceC18440d {
            @Override // p001o.yn8.InterfaceC18440d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public EnumC17157b findValueByNumber(int i) {
                return EnumC17157b.forNumber(i);
            }
        }

        /* renamed from: o.tm5$b$b */
        public static final class b implements yn8.InterfaceC18441e {

            /* renamed from: a */
            public static final yn8.InterfaceC18441e f47413a = new b();

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return EnumC17157b.forNumber(i) != null;
            }
        }

        EnumC17157b(int i) {
            this.value = i;
        }

        public static EnumC17157b forNumber(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return CORD;
            }
            if (i != 2) {
                return null;
            }
            return STRING_PIECE;
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return b.f47413a;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static EnumC17157b valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: o.tm5$c */
    public enum EnumC17158c implements yn8.InterfaceC18439c {
        JS_NORMAL(0),
        JS_STRING(1),
        JS_NUMBER(2);

        public static final int JS_NORMAL_VALUE = 0;
        public static final int JS_NUMBER_VALUE = 2;
        public static final int JS_STRING_VALUE = 1;
        private static final yn8.InterfaceC18440d internalValueMap = new a();
        private final int value;

        /* renamed from: o.tm5$c$a */
        public class a implements yn8.InterfaceC18440d {
            @Override // p001o.yn8.InterfaceC18440d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public EnumC17158c findValueByNumber(int i) {
                return EnumC17158c.forNumber(i);
            }
        }

        /* renamed from: o.tm5$c$b */
        public static final class b implements yn8.InterfaceC18441e {

            /* renamed from: a */
            public static final yn8.InterfaceC18441e f47414a = new b();

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return EnumC17158c.forNumber(i) != null;
            }
        }

        EnumC17158c(int i) {
            this.value = i;
        }

        public static EnumC17158c forNumber(int i) {
            if (i == 0) {
                return JS_NORMAL;
            }
            if (i == 1) {
                return JS_STRING;
            }
            if (i != 2) {
                return null;
            }
            return JS_NUMBER;
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return b.f47414a;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static EnumC17158c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        tm5 tm5Var = new tm5();
        DEFAULT_INSTANCE = tm5Var;
        wn7.registerDefaultInstance(tm5.class, tm5Var);
    }

    /* renamed from: i */
    public static tm5 m50182i() {
        return DEFAULT_INSTANCE;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        sm5 sm5Var = null;
        switch (sm5.f45639a[enumC17940g.ordinal()]) {
            case 1:
                return new tm5();
            case 2:
                return new C17156a(sm5Var);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0005ဇ\u0003\u0006ဌ\u0002\nဇ\u0005ϧЛ", new Object[]{"bitField0_", "ctype_", EnumC17157b.internalGetVerifier(), "packed_", "deprecated_", "lazy_", "jstype_", EnumC17158c.internalGetVerifier(), "weak_", "uninterpretedOption_", ym5.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (tm5.class) {
                        c17935b = PARSER;
                        if (c17935b == null) {
                            c17935b = new wn7.C17935b(DEFAULT_INSTANCE);
                            PARSER = c17935b;
                        }
                    }
                }
                return c17935b;
            case 6:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 7:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
