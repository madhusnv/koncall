package com.google.api;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes3.dex */
public final class BackendRule extends wn7 implements BackendRuleOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    private static final BackendRule DEFAULT_INSTANCE;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile hxc PARSER = null;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private int authenticationCase_ = 0;
    private String selector_ = "";
    private String address_ = "";
    private String protocol_ = "";

    /* renamed from: com.google.api.BackendRule$1 */
    public static /* synthetic */ class C111931 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13292xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13292xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13292xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13292xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13292xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13292xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13292xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13292xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum AuthenticationCase {
        JWT_AUDIENCE(7),
        DISABLE_AUTH(8),
        AUTHENTICATION_NOT_SET(0);

        private final int value;

        AuthenticationCase(int i) {
            this.value = i;
        }

        public static AuthenticationCase forNumber(int i) {
            if (i == 0) {
                return AUTHENTICATION_NOT_SET;
            }
            if (i == 7) {
                return JWT_AUDIENCE;
            }
            if (i != 8) {
                return null;
            }
            return DISABLE_AUTH;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static AuthenticationCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements BackendRuleOrBuilder {
        public /* synthetic */ Builder(C111931 c111931) {
            this();
        }

        public Builder clearAddress() {
            copyOnWrite();
            ((BackendRule) this.instance).clearAddress();
            return this;
        }

        public Builder clearAuthentication() {
            copyOnWrite();
            ((BackendRule) this.instance).clearAuthentication();
            return this;
        }

        public Builder clearDeadline() {
            copyOnWrite();
            ((BackendRule) this.instance).clearDeadline();
            return this;
        }

        public Builder clearDisableAuth() {
            copyOnWrite();
            ((BackendRule) this.instance).clearDisableAuth();
            return this;
        }

        public Builder clearJwtAudience() {
            copyOnWrite();
            ((BackendRule) this.instance).clearJwtAudience();
            return this;
        }

        public Builder clearMinDeadline() {
            copyOnWrite();
            ((BackendRule) this.instance).clearMinDeadline();
            return this;
        }

        public Builder clearOperationDeadline() {
            copyOnWrite();
            ((BackendRule) this.instance).clearOperationDeadline();
            return this;
        }

        public Builder clearPathTranslation() {
            copyOnWrite();
            ((BackendRule) this.instance).clearPathTranslation();
            return this;
        }

        public Builder clearProtocol() {
            copyOnWrite();
            ((BackendRule) this.instance).clearProtocol();
            return this;
        }

        public Builder clearSelector() {
            copyOnWrite();
            ((BackendRule) this.instance).clearSelector();
            return this;
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public String getAddress() {
            return ((BackendRule) this.instance).getAddress();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public xq1 getAddressBytes() {
            return ((BackendRule) this.instance).getAddressBytes();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public AuthenticationCase getAuthenticationCase() {
            return ((BackendRule) this.instance).getAuthenticationCase();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public double getDeadline() {
            return ((BackendRule) this.instance).getDeadline();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public boolean getDisableAuth() {
            return ((BackendRule) this.instance).getDisableAuth();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public String getJwtAudience() {
            return ((BackendRule) this.instance).getJwtAudience();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public xq1 getJwtAudienceBytes() {
            return ((BackendRule) this.instance).getJwtAudienceBytes();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public double getMinDeadline() {
            return ((BackendRule) this.instance).getMinDeadline();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public double getOperationDeadline() {
            return ((BackendRule) this.instance).getOperationDeadline();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public PathTranslation getPathTranslation() {
            return ((BackendRule) this.instance).getPathTranslation();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public int getPathTranslationValue() {
            return ((BackendRule) this.instance).getPathTranslationValue();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public String getProtocol() {
            return ((BackendRule) this.instance).getProtocol();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public xq1 getProtocolBytes() {
            return ((BackendRule) this.instance).getProtocolBytes();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public String getSelector() {
            return ((BackendRule) this.instance).getSelector();
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public xq1 getSelectorBytes() {
            return ((BackendRule) this.instance).getSelectorBytes();
        }

        public Builder setAddress(String str) {
            copyOnWrite();
            ((BackendRule) this.instance).setAddress(str);
            return this;
        }

        public Builder setAddressBytes(xq1 xq1Var) {
            copyOnWrite();
            ((BackendRule) this.instance).setAddressBytes(xq1Var);
            return this;
        }

        public Builder setDeadline(double d) {
            copyOnWrite();
            ((BackendRule) this.instance).setDeadline(d);
            return this;
        }

        public Builder setDisableAuth(boolean z) {
            copyOnWrite();
            ((BackendRule) this.instance).setDisableAuth(z);
            return this;
        }

        public Builder setJwtAudience(String str) {
            copyOnWrite();
            ((BackendRule) this.instance).setJwtAudience(str);
            return this;
        }

        public Builder setJwtAudienceBytes(xq1 xq1Var) {
            copyOnWrite();
            ((BackendRule) this.instance).setJwtAudienceBytes(xq1Var);
            return this;
        }

        public Builder setMinDeadline(double d) {
            copyOnWrite();
            ((BackendRule) this.instance).setMinDeadline(d);
            return this;
        }

        public Builder setOperationDeadline(double d) {
            copyOnWrite();
            ((BackendRule) this.instance).setOperationDeadline(d);
            return this;
        }

        public Builder setPathTranslation(PathTranslation pathTranslation) {
            copyOnWrite();
            ((BackendRule) this.instance).setPathTranslation(pathTranslation);
            return this;
        }

        public Builder setPathTranslationValue(int i) {
            copyOnWrite();
            ((BackendRule) this.instance).setPathTranslationValue(i);
            return this;
        }

        public Builder setProtocol(String str) {
            copyOnWrite();
            ((BackendRule) this.instance).setProtocol(str);
            return this;
        }

        public Builder setProtocolBytes(xq1 xq1Var) {
            copyOnWrite();
            ((BackendRule) this.instance).setProtocolBytes(xq1Var);
            return this;
        }

        public Builder setSelector(String str) {
            copyOnWrite();
            ((BackendRule) this.instance).setSelector(str);
            return this;
        }

        public Builder setSelectorBytes(xq1 xq1Var) {
            copyOnWrite();
            ((BackendRule) this.instance).setSelectorBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(BackendRule.DEFAULT_INSTANCE);
        }
    }

    public enum PathTranslation implements yn8.InterfaceC18439c {
        PATH_TRANSLATION_UNSPECIFIED(0),
        CONSTANT_ADDRESS(1),
        APPEND_PATH_TO_ADDRESS(2),
        UNRECOGNIZED(-1);

        public static final int APPEND_PATH_TO_ADDRESS_VALUE = 2;
        public static final int CONSTANT_ADDRESS_VALUE = 1;
        public static final int PATH_TRANSLATION_UNSPECIFIED_VALUE = 0;
        private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.api.BackendRule.PathTranslation.1
            @Override // p001o.yn8.InterfaceC18440d
            public PathTranslation findValueByNumber(int i) {
                return PathTranslation.forNumber(i);
            }
        };
        private final int value;

        public static final class PathTranslationVerifier implements yn8.InterfaceC18441e {
            static final yn8.InterfaceC18441e INSTANCE = new PathTranslationVerifier();

            private PathTranslationVerifier() {
            }

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return PathTranslation.forNumber(i) != null;
            }
        }

        PathTranslation(int i) {
            this.value = i;
        }

        public static PathTranslation forNumber(int i) {
            if (i == 0) {
                return PATH_TRANSLATION_UNSPECIFIED;
            }
            if (i == 1) {
                return CONSTANT_ADDRESS;
            }
            if (i != 2) {
                return null;
            }
            return APPEND_PATH_TO_ADDRESS;
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return PathTranslationVerifier.INSTANCE;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static PathTranslation valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        BackendRule backendRule = new BackendRule();
        DEFAULT_INSTANCE = backendRule;
        wn7.registerDefaultInstance(BackendRule.class, backendRule);
    }

    private BackendRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = getDefaultInstance().getAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthentication() {
        this.authenticationCase_ = 0;
        this.authentication_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeadline() {
        this.deadline_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableAuth() {
        if (this.authenticationCase_ == 8) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJwtAudience() {
        if (this.authenticationCase_ == 7) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinDeadline() {
        this.minDeadline_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperationDeadline() {
        this.operationDeadline_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPathTranslation() {
        this.pathTranslation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = getDefaultInstance().getProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static BackendRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream) {
        return (BackendRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer) {
        return (BackendRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(String str) {
        str.getClass();
        this.address_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.address_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeadline(double d) {
        this.deadline_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableAuth(boolean z) {
        this.authenticationCase_ = 8;
        this.authentication_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwtAudience(String str) {
        str.getClass();
        this.authenticationCase_ = 7;
        this.authentication_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwtAudienceBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.authentication_ = xq1Var.m56593N();
        this.authenticationCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinDeadline(double d) {
        this.minDeadline_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperationDeadline(double d) {
        this.operationDeadline_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathTranslation(PathTranslation pathTranslation) {
        this.pathTranslation_ = pathTranslation.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathTranslationValue(int i) {
        this.pathTranslation_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(String str) {
        str.getClass();
        this.protocol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocolBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.protocol_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.selector_ = xq1Var.m56593N();
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C111931 c111931 = null;
        switch (C111931.f13292xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new BackendRule();
            case 2:
                return new Builder(c111931);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u0000\u0005\u0000\u0006\f\u0007Ȼ\u0000\b:\u0000\tȈ", new Object[]{"authentication_", "authenticationCase_", "selector_", "address_", "deadline_", "minDeadline_", "operationDeadline_", "pathTranslation_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (BackendRule.class) {
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

    @Override // com.google.api.BackendRuleOrBuilder
    public String getAddress() {
        return this.address_;
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public xq1 getAddressBytes() {
        return xq1.m56589q(this.address_);
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public AuthenticationCase getAuthenticationCase() {
        return AuthenticationCase.forNumber(this.authenticationCase_);
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public double getDeadline() {
        return this.deadline_;
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public boolean getDisableAuth() {
        if (this.authenticationCase_ == 8) {
            return ((Boolean) this.authentication_).booleanValue();
        }
        return false;
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public String getJwtAudience() {
        return this.authenticationCase_ == 7 ? (String) this.authentication_ : "";
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public xq1 getJwtAudienceBytes() {
        return xq1.m56589q(this.authenticationCase_ == 7 ? (String) this.authentication_ : "");
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public double getMinDeadline() {
        return this.minDeadline_;
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public double getOperationDeadline() {
        return this.operationDeadline_;
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public PathTranslation getPathTranslation() {
        PathTranslation pathTranslationForNumber = PathTranslation.forNumber(this.pathTranslation_);
        return pathTranslationForNumber == null ? PathTranslation.UNRECOGNIZED : pathTranslationForNumber;
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public int getPathTranslationValue() {
        return this.pathTranslation_;
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public String getProtocol() {
        return this.protocol_;
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public xq1 getProtocolBytes() {
        return xq1.m56589q(this.protocol_);
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public String getSelector() {
        return this.selector_;
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public xq1 getSelectorBytes() {
        return xq1.m56589q(this.selector_);
    }

    public static Builder newBuilder(BackendRule backendRule) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(backendRule);
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (BackendRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (BackendRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static BackendRule parseFrom(xq1 xq1Var) {
        return (BackendRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static BackendRule parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (BackendRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static BackendRule parseFrom(byte[] bArr) {
        return (BackendRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BackendRule parseFrom(byte[] bArr, qp6 qp6Var) {
        return (BackendRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static BackendRule parseFrom(InputStream inputStream) {
        return (BackendRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BackendRule parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (BackendRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static BackendRule parseFrom(jf3 jf3Var) {
        return (BackendRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static BackendRule parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (BackendRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
