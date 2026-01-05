package p001o;

import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class vm5 extends wn7.AbstractC17937d {
    private static final vm5 DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int MAP_ENTRY_FIELD_NUMBER = 7;
    public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
    public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
    private static volatile hxc PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecated_;
    private boolean mapEntry_;
    private boolean messageSetWireFormat_;
    private boolean noStandardDescriptorAccessor_;
    private byte memoizedIsInitialized = 2;
    private yn8.InterfaceC18446j uninterpretedOption_ = wn7.emptyProtobufList();

    /* renamed from: o.vm5$a */
    public static final class C17616a extends wn7.AbstractC17936c {
        public /* synthetic */ C17616a(sm5 sm5Var) {
            this();
        }

        public C17616a() {
            super(vm5.DEFAULT_INSTANCE);
        }
    }

    static {
        vm5 vm5Var = new vm5();
        DEFAULT_INSTANCE = vm5Var;
        wn7.registerDefaultInstance(vm5.class, vm5Var);
    }

    /* renamed from: i */
    public static vm5 m52964i() {
        return DEFAULT_INSTANCE;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        sm5 sm5Var = null;
        switch (sm5.f45639a[enumC17940g.ordinal()]) {
            case 1:
                return new vm5();
            case 2:
                return new C17616a(sm5Var);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "uninterpretedOption_", ym5.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (vm5.class) {
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
