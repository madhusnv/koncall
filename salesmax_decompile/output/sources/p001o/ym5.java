package p001o;

import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class ym5 extends wn7 implements tcb {
    public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
    private static final ym5 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
    public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
    private static volatile hxc PARSER = null;
    public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
    public static final int STRING_VALUE_FIELD_NUMBER = 7;
    private int bitField0_;
    private double doubleValue_;
    private long negativeIntValue_;
    private long positiveIntValue_;
    private byte memoizedIsInitialized = 2;
    private yn8.InterfaceC18446j name_ = wn7.emptyProtobufList();
    private String identifierValue_ = "";
    private xq1 stringValue_ = xq1.f54049b;
    private String aggregateValue_ = "";

    /* renamed from: o.ym5$a */
    public static final class C18431a extends wn7.AbstractC17934a implements tcb {
        public /* synthetic */ C18431a(sm5 sm5Var) {
            this();
        }

        public C18431a() {
            super(ym5.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.ym5$b */
    public static final class C18432b extends wn7 implements tcb {
        private static final C18432b DEFAULT_INSTANCE;
        public static final int IS_EXTENSION_FIELD_NUMBER = 2;
        public static final int NAME_PART_FIELD_NUMBER = 1;
        private static volatile hxc PARSER;
        private int bitField0_;
        private boolean isExtension_;
        private byte memoizedIsInitialized = 2;
        private String namePart_ = "";

        /* renamed from: o.ym5$b$a */
        public static final class a extends wn7.AbstractC17934a implements tcb {
            public /* synthetic */ a(sm5 sm5Var) {
                this();
            }

            public a() {
                super(C18432b.DEFAULT_INSTANCE);
            }
        }

        static {
            C18432b c18432b = new C18432b();
            DEFAULT_INSTANCE = c18432b;
            wn7.registerDefaultInstance(C18432b.class, c18432b);
        }

        @Override // p001o.wn7
        public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
            sm5 sm5Var = null;
            switch (sm5.f45639a[enumC17940g.ordinal()]) {
                case 1:
                    return new C18432b();
                case 2:
                    return new a(sm5Var);
                case 3:
                    return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    hxc c17935b = PARSER;
                    if (c17935b == null) {
                        synchronized (C18432b.class) {
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

    static {
        ym5 ym5Var = new ym5();
        DEFAULT_INSTANCE = ym5Var;
        wn7.registerDefaultInstance(ym5.class, ym5Var);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        sm5 sm5Var = null;
        switch (sm5.f45639a[enumC17940g.ordinal()]) {
            case 1:
                return new ym5();
            case 2:
                return new C18431a(sm5Var);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", C18432b.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (ym5.class) {
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
