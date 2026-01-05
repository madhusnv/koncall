package com.google.api;

import com.google.api.AuthProvider;
import com.google.api.AuthenticationRule;
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
public final class Authentication extends wn7 implements AuthenticationOrBuilder {
    private static final Authentication DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private yn8.InterfaceC18446j rules_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j providers_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.Authentication$1 */
    public static /* synthetic */ class C111901 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13289xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13289xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13289xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13289xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13289xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13289xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13289xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13289xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements AuthenticationOrBuilder {
        public /* synthetic */ Builder(C111901 c111901) {
            this();
        }

        public Builder addAllProviders(Iterable<? extends AuthProvider> iterable) {
            copyOnWrite();
            ((Authentication) this.instance).addAllProviders(iterable);
            return this;
        }

        public Builder addAllRules(Iterable<? extends AuthenticationRule> iterable) {
            copyOnWrite();
            ((Authentication) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder addProviders(AuthProvider authProvider) {
            copyOnWrite();
            ((Authentication) this.instance).addProviders(authProvider);
            return this;
        }

        public Builder addRules(AuthenticationRule authenticationRule) {
            copyOnWrite();
            ((Authentication) this.instance).addRules(authenticationRule);
            return this;
        }

        public Builder clearProviders() {
            copyOnWrite();
            ((Authentication) this.instance).clearProviders();
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((Authentication) this.instance).clearRules();
            return this;
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public AuthProvider getProviders(int i) {
            return ((Authentication) this.instance).getProviders(i);
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public int getProvidersCount() {
            return ((Authentication) this.instance).getProvidersCount();
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public List<AuthProvider> getProvidersList() {
            return Collections.unmodifiableList(((Authentication) this.instance).getProvidersList());
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public AuthenticationRule getRules(int i) {
            return ((Authentication) this.instance).getRules(i);
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public int getRulesCount() {
            return ((Authentication) this.instance).getRulesCount();
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public List<AuthenticationRule> getRulesList() {
            return Collections.unmodifiableList(((Authentication) this.instance).getRulesList());
        }

        public Builder removeProviders(int i) {
            copyOnWrite();
            ((Authentication) this.instance).removeProviders(i);
            return this;
        }

        public Builder removeRules(int i) {
            copyOnWrite();
            ((Authentication) this.instance).removeRules(i);
            return this;
        }

        public Builder setProviders(int i, AuthProvider authProvider) {
            copyOnWrite();
            ((Authentication) this.instance).setProviders(i, authProvider);
            return this;
        }

        public Builder setRules(int i, AuthenticationRule authenticationRule) {
            copyOnWrite();
            ((Authentication) this.instance).setRules(i, authenticationRule);
            return this;
        }

        private Builder() {
            super(Authentication.DEFAULT_INSTANCE);
        }

        public Builder addProviders(int i, AuthProvider authProvider) {
            copyOnWrite();
            ((Authentication) this.instance).addProviders(i, authProvider);
            return this;
        }

        public Builder addRules(int i, AuthenticationRule authenticationRule) {
            copyOnWrite();
            ((Authentication) this.instance).addRules(i, authenticationRule);
            return this;
        }

        public Builder setProviders(int i, AuthProvider.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).setProviders(i, (AuthProvider) builder.build());
            return this;
        }

        public Builder setRules(int i, AuthenticationRule.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).setRules(i, (AuthenticationRule) builder.build());
            return this;
        }

        public Builder addProviders(AuthProvider.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).addProviders((AuthProvider) builder.build());
            return this;
        }

        public Builder addRules(AuthenticationRule.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).addRules((AuthenticationRule) builder.build());
            return this;
        }

        public Builder addProviders(int i, AuthProvider.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).addProviders(i, (AuthProvider) builder.build());
            return this;
        }

        public Builder addRules(int i, AuthenticationRule.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).addRules(i, (AuthenticationRule) builder.build());
            return this;
        }
    }

    static {
        Authentication authentication = new Authentication();
        DEFAULT_INSTANCE = authentication;
        wn7.registerDefaultInstance(Authentication.class, authentication);
    }

    private Authentication() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProviders(Iterable<? extends AuthProvider> iterable) {
        ensureProvidersIsMutable();
        r8.addAll((Iterable) iterable, (List) this.providers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends AuthenticationRule> iterable) {
        ensureRulesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProviders(AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.add(authProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(authenticationRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviders() {
        this.providers_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = wn7.emptyProtobufList();
    }

    private void ensureProvidersIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.providers_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.providers_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureRulesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.rules_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.rules_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static Authentication getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream) {
        return (Authentication) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer) {
        return (Authentication) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProviders(int i) {
        ensureProvidersIsMutable();
        this.providers_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviders(int i, AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.set(i, authProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, authenticationRule);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C111901 c111901 = null;
        switch (C111901.f13289xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Authentication();
            case 2:
                return new Builder(c111901);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"rules_", AuthenticationRule.class, "providers_", AuthProvider.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Authentication.class) {
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

    @Override // com.google.api.AuthenticationOrBuilder
    public AuthProvider getProviders(int i) {
        return (AuthProvider) this.providers_.get(i);
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public int getProvidersCount() {
        return this.providers_.size();
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public List<AuthProvider> getProvidersList() {
        return this.providers_;
    }

    public AuthProviderOrBuilder getProvidersOrBuilder(int i) {
        return (AuthProviderOrBuilder) this.providers_.get(i);
    }

    public List<? extends AuthProviderOrBuilder> getProvidersOrBuilderList() {
        return this.providers_;
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public AuthenticationRule getRules(int i) {
        return (AuthenticationRule) this.rules_.get(i);
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public List<AuthenticationRule> getRulesList() {
        return this.rules_;
    }

    public AuthenticationRuleOrBuilder getRulesOrBuilder(int i) {
        return (AuthenticationRuleOrBuilder) this.rules_.get(i);
    }

    public List<? extends AuthenticationRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static Builder newBuilder(Authentication authentication) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(authentication);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Authentication) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Authentication) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Authentication parseFrom(xq1 xq1Var) {
        return (Authentication) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProviders(int i, AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.add(i, authProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, authenticationRule);
    }

    public static Authentication parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Authentication) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Authentication parseFrom(byte[] bArr) {
        return (Authentication) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Authentication parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Authentication) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Authentication parseFrom(InputStream inputStream) {
        return (Authentication) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Authentication) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Authentication parseFrom(jf3 jf3Var) {
        return (Authentication) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Authentication parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Authentication) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
