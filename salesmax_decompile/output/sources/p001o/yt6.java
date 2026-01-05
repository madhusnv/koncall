package p001o;

import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class yt6 extends wn7 implements tcb {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final yt6 DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile hxc PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private yn8.InterfaceC18446j options_ = wn7.emptyProtobufList();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    /* renamed from: o.yt6$a */
    public static /* synthetic */ class C18484a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55914a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f55914a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55914a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55914a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55914a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55914a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55914a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55914a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.yt6$b */
    public static final class C18485b extends wn7.AbstractC17934a implements tcb {
        public /* synthetic */ C18485b(C18484a c18484a) {
            this();
        }

        public C18485b() {
            super(yt6.DEFAULT_INSTANCE);
        }
    }

    static {
        yt6 yt6Var = new yt6();
        DEFAULT_INSTANCE = yt6Var;
        wn7.registerDefaultInstance(yt6.class, yt6Var);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C18484a c18484a = null;
        switch (C18484a.f55914a[enumC17940g.ordinal()]) {
            case 1:
                return new yt6();
            case 2:
                return new C18485b(c18484a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", nec.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (yt6.class) {
                        c17935b = PARSER;
                        if (c17935b == null) {
                            c17935b = new wn7.C17935b(DEFAULT_INSTANCE);
                            PARSER = c17935b;
                        }
                    }
                }
                return c17935b;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
