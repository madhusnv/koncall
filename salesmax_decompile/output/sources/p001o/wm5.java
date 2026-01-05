package p001o;

import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class wm5 extends wn7.AbstractC17937d {
    private static final wm5 DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 33;
    public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
    private static volatile hxc PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecated_;
    private int idempotencyLevel_;
    private byte memoizedIsInitialized = 2;
    private yn8.InterfaceC18446j uninterpretedOption_ = wn7.emptyProtobufList();

    /* renamed from: o.wm5$a */
    public static final class C17929a extends wn7.AbstractC17936c {
        public /* synthetic */ C17929a(sm5 sm5Var) {
            this();
        }

        public C17929a() {
            super(wm5.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.wm5$b */
    public enum EnumC17930b implements yn8.InterfaceC18439c {
        IDEMPOTENCY_UNKNOWN(0),
        NO_SIDE_EFFECTS(1),
        IDEMPOTENT(2);

        public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
        public static final int IDEMPOTENT_VALUE = 2;
        public static final int NO_SIDE_EFFECTS_VALUE = 1;
        private static final yn8.InterfaceC18440d internalValueMap = new a();
        private final int value;

        /* renamed from: o.wm5$b$a */
        public class a implements yn8.InterfaceC18440d {
            @Override // p001o.yn8.InterfaceC18440d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public EnumC17930b findValueByNumber(int i) {
                return EnumC17930b.forNumber(i);
            }
        }

        /* renamed from: o.wm5$b$b */
        public static final class b implements yn8.InterfaceC18441e {

            /* renamed from: a */
            public static final yn8.InterfaceC18441e f52334a = new b();

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return EnumC17930b.forNumber(i) != null;
            }
        }

        EnumC17930b(int i) {
            this.value = i;
        }

        public static EnumC17930b forNumber(int i) {
            if (i == 0) {
                return IDEMPOTENCY_UNKNOWN;
            }
            if (i == 1) {
                return NO_SIDE_EFFECTS;
            }
            if (i != 2) {
                return null;
            }
            return IDEMPOTENT;
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return b.f52334a;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static EnumC17930b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        wm5 wm5Var = new wm5();
        DEFAULT_INSTANCE = wm5Var;
        wn7.registerDefaultInstance(wm5.class, wm5Var);
    }

    /* renamed from: i */
    public static wm5 m54704i() {
        return DEFAULT_INSTANCE;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        sm5 sm5Var = null;
        switch (sm5.f45639a[enumC17940g.ordinal()]) {
            case 1:
                return new wm5();
            case 2:
                return new C17929a(sm5Var);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0001!ဇ\u0000\"ဌ\u0001ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", EnumC17930b.internalGetVerifier(), "uninterpretedOption_", ym5.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (wm5.class) {
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
