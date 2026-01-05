package p001o;

import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class xm5 extends wn7.AbstractC17937d {
    private static final xm5 DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 33;
    private static volatile hxc PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecated_;
    private byte memoizedIsInitialized = 2;
    private yn8.InterfaceC18446j uninterpretedOption_ = wn7.emptyProtobufList();

    /* renamed from: o.xm5$a */
    public static final class C18183a extends wn7.AbstractC17936c {
        public /* synthetic */ C18183a(sm5 sm5Var) {
            this();
        }

        public C18183a() {
            super(xm5.DEFAULT_INSTANCE);
        }
    }

    static {
        xm5 xm5Var = new xm5();
        DEFAULT_INSTANCE = xm5Var;
        wn7.registerDefaultInstance(xm5.class, xm5Var);
    }

    /* renamed from: i */
    public static xm5 m56472i() {
        return DEFAULT_INSTANCE;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        sm5 sm5Var = null;
        switch (sm5.f45639a[enumC17940g.ordinal()]) {
            case 1:
                return new xm5();
            case 2:
                return new C18183a(sm5Var);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001!ϧ\u0002\u0000\u0001\u0001!ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", ym5.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (xm5.class) {
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
