package p001o;

import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class zyh extends wn7 implements bzh {
    private static final zyh DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile hxc PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private nzf sourceContext_;
    private int syntax_;
    private String name_ = "";
    private yn8.InterfaceC18446j fields_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j oneofs_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j options_ = wn7.emptyProtobufList();

    /* renamed from: o.zyh$a */
    public static /* synthetic */ class C18733a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57922a;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f57922a = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57922a[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57922a[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57922a[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57922a[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57922a[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57922a[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o.zyh$b */
    public static final class C18734b extends wn7.AbstractC17934a implements bzh {
        public /* synthetic */ C18734b(C18733a c18733a) {
            this();
        }

        public C18734b() {
            super(zyh.DEFAULT_INSTANCE);
        }
    }

    static {
        zyh zyhVar = new zyh();
        DEFAULT_INSTANCE = zyhVar;
        wn7.registerDefaultInstance(zyh.class, zyhVar);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C18733a c18733a = null;
        switch (C18733a.f57922a[enumC17940g.ordinal()]) {
            case 1:
                return new zyh();
            case 2:
                return new C18734b(c18733a);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", yt6.class, "oneofs_", "options_", nec.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (zyh.class) {
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
