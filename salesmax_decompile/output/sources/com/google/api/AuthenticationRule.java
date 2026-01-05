package com.google.api;

import com.google.api.AuthRequirement;
import com.google.api.OAuthRequirements;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes3.dex */
public final class AuthenticationRule extends wn7 implements AuthenticationRuleOrBuilder {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    private static final AuthenticationRule DEFAULT_INSTANCE;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile hxc PARSER = null;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private OAuthRequirements oauth_;
    private String selector_ = "";
    private yn8.InterfaceC18446j requirements_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.AuthenticationRule$1 */
    public static /* synthetic */ class C111911 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13290xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13290xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13290xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13290xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13290xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13290xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13290xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13290xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements AuthenticationRuleOrBuilder {
        public /* synthetic */ Builder(C111911 c111911) {
            this();
        }

        public Builder addAllRequirements(Iterable<? extends AuthRequirement> iterable) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).addAllRequirements(iterable);
            return this;
        }

        public Builder addRequirements(AuthRequirement authRequirement) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).addRequirements(authRequirement);
            return this;
        }

        public Builder clearAllowWithoutCredential() {
            copyOnWrite();
            ((AuthenticationRule) this.instance).clearAllowWithoutCredential();
            return this;
        }

        public Builder clearOauth() {
            copyOnWrite();
            ((AuthenticationRule) this.instance).clearOauth();
            return this;
        }

        public Builder clearRequirements() {
            copyOnWrite();
            ((AuthenticationRule) this.instance).clearRequirements();
            return this;
        }

        public Builder clearSelector() {
            copyOnWrite();
            ((AuthenticationRule) this.instance).clearSelector();
            return this;
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public boolean getAllowWithoutCredential() {
            return ((AuthenticationRule) this.instance).getAllowWithoutCredential();
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public OAuthRequirements getOauth() {
            return ((AuthenticationRule) this.instance).getOauth();
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public AuthRequirement getRequirements(int i) {
            return ((AuthenticationRule) this.instance).getRequirements(i);
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public int getRequirementsCount() {
            return ((AuthenticationRule) this.instance).getRequirementsCount();
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public List<AuthRequirement> getRequirementsList() {
            return Collections.unmodifiableList(((AuthenticationRule) this.instance).getRequirementsList());
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public String getSelector() {
            return ((AuthenticationRule) this.instance).getSelector();
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public xq1 getSelectorBytes() {
            return ((AuthenticationRule) this.instance).getSelectorBytes();
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public boolean hasOauth() {
            return ((AuthenticationRule) this.instance).hasOauth();
        }

        public Builder mergeOauth(OAuthRequirements oAuthRequirements) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).mergeOauth(oAuthRequirements);
            return this;
        }

        public Builder removeRequirements(int i) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).removeRequirements(i);
            return this;
        }

        public Builder setAllowWithoutCredential(boolean z) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).setAllowWithoutCredential(z);
            return this;
        }

        public Builder setOauth(OAuthRequirements oAuthRequirements) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).setOauth(oAuthRequirements);
            return this;
        }

        public Builder setRequirements(int i, AuthRequirement authRequirement) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).setRequirements(i, authRequirement);
            return this;
        }

        public Builder setSelector(String str) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).setSelector(str);
            return this;
        }

        public Builder setSelectorBytes(xq1 xq1Var) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).setSelectorBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(AuthenticationRule.DEFAULT_INSTANCE);
        }

        public Builder addRequirements(int i, AuthRequirement authRequirement) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).addRequirements(i, authRequirement);
            return this;
        }

        public Builder setOauth(OAuthRequirements.Builder builder) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).setOauth((OAuthRequirements) builder.build());
            return this;
        }

        public Builder setRequirements(int i, AuthRequirement.Builder builder) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).setRequirements(i, (AuthRequirement) builder.build());
            return this;
        }

        public Builder addRequirements(AuthRequirement.Builder builder) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).addRequirements((AuthRequirement) builder.build());
            return this;
        }

        public Builder addRequirements(int i, AuthRequirement.Builder builder) {
            copyOnWrite();
            ((AuthenticationRule) this.instance).addRequirements(i, (AuthRequirement) builder.build());
            return this;
        }
    }

    static {
        AuthenticationRule authenticationRule = new AuthenticationRule();
        DEFAULT_INSTANCE = authenticationRule;
        wn7.registerDefaultInstance(AuthenticationRule.class, authenticationRule);
    }

    private AuthenticationRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequirements(Iterable<? extends AuthRequirement> iterable) {
        ensureRequirementsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.requirements_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirements(AuthRequirement authRequirement) {
        authRequirement.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(authRequirement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowWithoutCredential() {
        this.allowWithoutCredential_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauth() {
        this.oauth_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequirements() {
        this.requirements_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureRequirementsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.requirements_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.requirements_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static AuthenticationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOauth(OAuthRequirements oAuthRequirements) {
        oAuthRequirements.getClass();
        OAuthRequirements oAuthRequirements2 = this.oauth_;
        if (oAuthRequirements2 == null || oAuthRequirements2 == OAuthRequirements.getDefaultInstance()) {
            this.oauth_ = oAuthRequirements;
        } else {
            this.oauth_ = (OAuthRequirements) ((OAuthRequirements.Builder) OAuthRequirements.newBuilder(this.oauth_).mergeFrom((wn7) oAuthRequirements)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream) {
        return (AuthenticationRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer) {
        return (AuthenticationRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRequirements(int i) {
        ensureRequirementsIsMutable();
        this.requirements_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowWithoutCredential(boolean z) {
        this.allowWithoutCredential_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauth(OAuthRequirements oAuthRequirements) {
        oAuthRequirements.getClass();
        this.oauth_ = oAuthRequirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequirements(int i, AuthRequirement authRequirement) {
        authRequirement.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.set(i, authRequirement);
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
        C111911 c111911 = null;
        switch (C111911.f13290xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new AuthenticationRule();
            case 2:
                return new Builder(c111911);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0005\u0007\u0007\u001b", new Object[]{"selector_", "oauth_", "allowWithoutCredential_", "requirements_", AuthRequirement.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (AuthenticationRule.class) {
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

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public boolean getAllowWithoutCredential() {
        return this.allowWithoutCredential_;
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public OAuthRequirements getOauth() {
        OAuthRequirements oAuthRequirements = this.oauth_;
        return oAuthRequirements == null ? OAuthRequirements.getDefaultInstance() : oAuthRequirements;
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public AuthRequirement getRequirements(int i) {
        return (AuthRequirement) this.requirements_.get(i);
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public List<AuthRequirement> getRequirementsList() {
        return this.requirements_;
    }

    public AuthRequirementOrBuilder getRequirementsOrBuilder(int i) {
        return (AuthRequirementOrBuilder) this.requirements_.get(i);
    }

    public List<? extends AuthRequirementOrBuilder> getRequirementsOrBuilderList() {
        return this.requirements_;
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public String getSelector() {
        return this.selector_;
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public xq1 getSelectorBytes() {
        return xq1.m56589q(this.selector_);
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public boolean hasOauth() {
        return this.oauth_ != null;
    }

    public static Builder newBuilder(AuthenticationRule authenticationRule) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(authenticationRule);
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (AuthenticationRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (AuthenticationRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static AuthenticationRule parseFrom(xq1 xq1Var) {
        return (AuthenticationRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirements(int i, AuthRequirement authRequirement) {
        authRequirement.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(i, authRequirement);
    }

    public static AuthenticationRule parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (AuthenticationRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static AuthenticationRule parseFrom(byte[] bArr) {
        return (AuthenticationRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthenticationRule parseFrom(byte[] bArr, qp6 qp6Var) {
        return (AuthenticationRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream) {
        return (AuthenticationRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (AuthenticationRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static AuthenticationRule parseFrom(jf3 jf3Var) {
        return (AuthenticationRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static AuthenticationRule parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (AuthenticationRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
