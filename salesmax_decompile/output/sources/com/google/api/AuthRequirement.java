package com.google.api;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;

/* loaded from: classes3.dex */
public final class AuthRequirement extends wn7 implements AuthRequirementOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 2;
    private static final AuthRequirement DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    private String providerId_ = "";
    private String audiences_ = "";

    /* renamed from: com.google.api.AuthRequirement$1 */
    public static /* synthetic */ class C111891 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13288xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13288xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13288xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13288xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13288xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13288xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13288xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13288xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements AuthRequirementOrBuilder {
        public /* synthetic */ Builder(C111891 c111891) {
            this();
        }

        public Builder clearAudiences() {
            copyOnWrite();
            ((AuthRequirement) this.instance).clearAudiences();
            return this;
        }

        public Builder clearProviderId() {
            copyOnWrite();
            ((AuthRequirement) this.instance).clearProviderId();
            return this;
        }

        @Override // com.google.api.AuthRequirementOrBuilder
        public String getAudiences() {
            return ((AuthRequirement) this.instance).getAudiences();
        }

        @Override // com.google.api.AuthRequirementOrBuilder
        public xq1 getAudiencesBytes() {
            return ((AuthRequirement) this.instance).getAudiencesBytes();
        }

        @Override // com.google.api.AuthRequirementOrBuilder
        public String getProviderId() {
            return ((AuthRequirement) this.instance).getProviderId();
        }

        @Override // com.google.api.AuthRequirementOrBuilder
        public xq1 getProviderIdBytes() {
            return ((AuthRequirement) this.instance).getProviderIdBytes();
        }

        public Builder setAudiences(String str) {
            copyOnWrite();
            ((AuthRequirement) this.instance).setAudiences(str);
            return this;
        }

        public Builder setAudiencesBytes(xq1 xq1Var) {
            copyOnWrite();
            ((AuthRequirement) this.instance).setAudiencesBytes(xq1Var);
            return this;
        }

        public Builder setProviderId(String str) {
            copyOnWrite();
            ((AuthRequirement) this.instance).setProviderId(str);
            return this;
        }

        public Builder setProviderIdBytes(xq1 xq1Var) {
            copyOnWrite();
            ((AuthRequirement) this.instance).setProviderIdBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(AuthRequirement.DEFAULT_INSTANCE);
        }
    }

    static {
        AuthRequirement authRequirement = new AuthRequirement();
        DEFAULT_INSTANCE = authRequirement;
        wn7.registerDefaultInstance(AuthRequirement.class, authRequirement);
    }

    private AuthRequirement() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudiences() {
        this.audiences_ = getDefaultInstance().getAudiences();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderId() {
        this.providerId_ = getDefaultInstance().getProviderId();
    }

    public static AuthRequirement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthRequirement parseDelimitedFrom(InputStream inputStream) {
        return (AuthRequirement) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthRequirement parseFrom(ByteBuffer byteBuffer) {
        return (AuthRequirement) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudiences(String str) {
        str.getClass();
        this.audiences_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudiencesBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.audiences_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderId(String str) {
        str.getClass();
        this.providerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderIdBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.providerId_ = xq1Var.m56593N();
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C111891 c111891 = null;
        switch (C111891.f13288xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new AuthRequirement();
            case 2:
                return new Builder(c111891);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"providerId_", "audiences_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (AuthRequirement.class) {
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

    @Override // com.google.api.AuthRequirementOrBuilder
    public String getAudiences() {
        return this.audiences_;
    }

    @Override // com.google.api.AuthRequirementOrBuilder
    public xq1 getAudiencesBytes() {
        return xq1.m56589q(this.audiences_);
    }

    @Override // com.google.api.AuthRequirementOrBuilder
    public String getProviderId() {
        return this.providerId_;
    }

    @Override // com.google.api.AuthRequirementOrBuilder
    public xq1 getProviderIdBytes() {
        return xq1.m56589q(this.providerId_);
    }

    public static Builder newBuilder(AuthRequirement authRequirement) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(authRequirement);
    }

    public static AuthRequirement parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (AuthRequirement) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static AuthRequirement parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (AuthRequirement) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static AuthRequirement parseFrom(xq1 xq1Var) {
        return (AuthRequirement) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static AuthRequirement parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (AuthRequirement) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static AuthRequirement parseFrom(byte[] bArr) {
        return (AuthRequirement) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthRequirement parseFrom(byte[] bArr, qp6 qp6Var) {
        return (AuthRequirement) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static AuthRequirement parseFrom(InputStream inputStream) {
        return (AuthRequirement) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthRequirement parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (AuthRequirement) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static AuthRequirement parseFrom(jf3 jf3Var) {
        return (AuthRequirement) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static AuthRequirement parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (AuthRequirement) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
