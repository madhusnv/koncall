package p001o;

import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class um5 extends wn7.AbstractC17937d {
    public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
    public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
    public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
    private static final um5 DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 23;
    public static final int GO_PACKAGE_FIELD_NUMBER = 11;
    public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
    public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
    public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
    public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
    public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
    public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
    public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
    public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
    private static volatile hxc PARSER = null;
    public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
    public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
    public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
    public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
    public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
    public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
    public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean ccGenericServices_;
    private boolean deprecated_;
    private boolean javaGenerateEqualsAndHash_;
    private boolean javaGenericServices_;
    private boolean javaMultipleFiles_;
    private boolean javaStringCheckUtf8_;
    private boolean phpGenericServices_;
    private boolean pyGenericServices_;
    private byte memoizedIsInitialized = 2;
    private String javaPackage_ = "";
    private String javaOuterClassname_ = "";
    private int optimizeFor_ = 1;
    private String goPackage_ = "";
    private boolean ccEnableArenas_ = true;
    private String objcClassPrefix_ = "";
    private String csharpNamespace_ = "";
    private String swiftPrefix_ = "";
    private String phpClassPrefix_ = "";
    private String phpNamespace_ = "";
    private String phpMetadataNamespace_ = "";
    private String rubyPackage_ = "";
    private yn8.InterfaceC18446j uninterpretedOption_ = wn7.emptyProtobufList();

    /* renamed from: o.um5$a */
    public static final class C17399a extends wn7.AbstractC17936c {
        public /* synthetic */ C17399a(sm5 sm5Var) {
            this();
        }

        public C17399a() {
            super(um5.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.um5$b */
    public enum EnumC17400b implements yn8.InterfaceC18439c {
        SPEED(1),
        CODE_SIZE(2),
        LITE_RUNTIME(3);

        public static final int CODE_SIZE_VALUE = 2;
        public static final int LITE_RUNTIME_VALUE = 3;
        public static final int SPEED_VALUE = 1;
        private static final yn8.InterfaceC18440d internalValueMap = new a();
        private final int value;

        /* renamed from: o.um5$b$a */
        public class a implements yn8.InterfaceC18440d {
            @Override // p001o.yn8.InterfaceC18440d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public EnumC17400b findValueByNumber(int i) {
                return EnumC17400b.forNumber(i);
            }
        }

        /* renamed from: o.um5$b$b */
        public static final class b implements yn8.InterfaceC18441e {

            /* renamed from: a */
            public static final yn8.InterfaceC18441e f49121a = new b();

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return EnumC17400b.forNumber(i) != null;
            }
        }

        EnumC17400b(int i) {
            this.value = i;
        }

        public static EnumC17400b forNumber(int i) {
            if (i == 1) {
                return SPEED;
            }
            if (i == 2) {
                return CODE_SIZE;
            }
            if (i != 3) {
                return null;
            }
            return LITE_RUNTIME;
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return b.f49121a;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static EnumC17400b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        um5 um5Var = new um5();
        DEFAULT_INSTANCE = um5Var;
        wn7.registerDefaultInstance(um5.class, um5Var);
    }

    /* renamed from: i */
    public static um5 m51776i() {
        return DEFAULT_INSTANCE;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        sm5 sm5Var = null;
        switch (sm5.f45639a[enumC17940g.ordinal()]) {
            case 1:
                return new um5();
            case 2:
                return new C17399a(sm5Var);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0001\u0001ဈ\u0000\bဈ\u0001\tဌ\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\u000b\u001bဇ\u0004\u001fဇ\f$ဈ\r%ဈ\u000e'ဈ\u000f(ဈ\u0010)ဈ\u0011*ဇ\n,ဈ\u0012-ဈ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", EnumC17400b.internalGetVerifier(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpGenericServices_", "phpMetadataNamespace_", "rubyPackage_", "uninterpretedOption_", ym5.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (um5.class) {
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
