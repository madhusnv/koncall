package com.google.api;

import com.google.api.SystemParameterRule;
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
public final class SystemParameters extends wn7 implements SystemParametersOrBuilder {
    private static final SystemParameters DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private yn8.InterfaceC18446j rules_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.SystemParameters$1 */
    public static /* synthetic */ class C112391 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13329xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13329xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13329xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13329xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13329xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13329xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13329xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13329xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements SystemParametersOrBuilder {
        public /* synthetic */ Builder(C112391 c112391) {
            this();
        }

        public Builder addAllRules(Iterable<? extends SystemParameterRule> iterable) {
            copyOnWrite();
            ((SystemParameters) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder addRules(SystemParameterRule systemParameterRule) {
            copyOnWrite();
            ((SystemParameters) this.instance).addRules(systemParameterRule);
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((SystemParameters) this.instance).clearRules();
            return this;
        }

        @Override // com.google.api.SystemParametersOrBuilder
        public SystemParameterRule getRules(int i) {
            return ((SystemParameters) this.instance).getRules(i);
        }

        @Override // com.google.api.SystemParametersOrBuilder
        public int getRulesCount() {
            return ((SystemParameters) this.instance).getRulesCount();
        }

        @Override // com.google.api.SystemParametersOrBuilder
        public List<SystemParameterRule> getRulesList() {
            return Collections.unmodifiableList(((SystemParameters) this.instance).getRulesList());
        }

        public Builder removeRules(int i) {
            copyOnWrite();
            ((SystemParameters) this.instance).removeRules(i);
            return this;
        }

        public Builder setRules(int i, SystemParameterRule systemParameterRule) {
            copyOnWrite();
            ((SystemParameters) this.instance).setRules(i, systemParameterRule);
            return this;
        }

        private Builder() {
            super(SystemParameters.DEFAULT_INSTANCE);
        }

        public Builder addRules(int i, SystemParameterRule systemParameterRule) {
            copyOnWrite();
            ((SystemParameters) this.instance).addRules(i, systemParameterRule);
            return this;
        }

        public Builder setRules(int i, SystemParameterRule.Builder builder) {
            copyOnWrite();
            ((SystemParameters) this.instance).setRules(i, (SystemParameterRule) builder.build());
            return this;
        }

        public Builder addRules(SystemParameterRule.Builder builder) {
            copyOnWrite();
            ((SystemParameters) this.instance).addRules((SystemParameterRule) builder.build());
            return this;
        }

        public Builder addRules(int i, SystemParameterRule.Builder builder) {
            copyOnWrite();
            ((SystemParameters) this.instance).addRules(i, (SystemParameterRule) builder.build());
            return this;
        }
    }

    static {
        SystemParameters systemParameters = new SystemParameters();
        DEFAULT_INSTANCE = systemParameters;
        wn7.registerDefaultInstance(SystemParameters.class, systemParameters);
    }

    private SystemParameters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends SystemParameterRule> iterable) {
        ensureRulesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(systemParameterRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = wn7.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.rules_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.rules_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static SystemParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream) {
        return (SystemParameters) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer) {
        return (SystemParameters) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i, SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, systemParameterRule);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112391 c112391 = null;
        switch (C112391.f13329xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new SystemParameters();
            case 2:
                return new Builder(c112391);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", SystemParameterRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (SystemParameters.class) {
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

    @Override // com.google.api.SystemParametersOrBuilder
    public SystemParameterRule getRules(int i) {
        return (SystemParameterRule) this.rules_.get(i);
    }

    @Override // com.google.api.SystemParametersOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.SystemParametersOrBuilder
    public List<SystemParameterRule> getRulesList() {
        return this.rules_;
    }

    public SystemParameterRuleOrBuilder getRulesOrBuilder(int i) {
        return (SystemParameterRuleOrBuilder) this.rules_.get(i);
    }

    public List<? extends SystemParameterRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static Builder newBuilder(SystemParameters systemParameters) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(systemParameters);
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (SystemParameters) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (SystemParameters) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static SystemParameters parseFrom(xq1 xq1Var) {
        return (SystemParameters) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, systemParameterRule);
    }

    public static SystemParameters parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (SystemParameters) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static SystemParameters parseFrom(byte[] bArr) {
        return (SystemParameters) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SystemParameters parseFrom(byte[] bArr, qp6 qp6Var) {
        return (SystemParameters) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static SystemParameters parseFrom(InputStream inputStream) {
        return (SystemParameters) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameters parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (SystemParameters) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static SystemParameters parseFrom(jf3 jf3Var) {
        return (SystemParameters) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static SystemParameters parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (SystemParameters) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
