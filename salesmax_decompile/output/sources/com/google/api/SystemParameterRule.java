package com.google.api;

import com.google.api.SystemParameter;
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
public final class SystemParameterRule extends wn7 implements SystemParameterRuleOrBuilder {
    private static final SystemParameterRule DEFAULT_INSTANCE;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile hxc PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private yn8.InterfaceC18446j parameters_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.SystemParameterRule$1 */
    public static /* synthetic */ class C112381 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13328xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13328xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13328xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13328xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13328xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13328xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13328xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13328xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements SystemParameterRuleOrBuilder {
        public /* synthetic */ Builder(C112381 c112381) {
            this();
        }

        public Builder addAllParameters(Iterable<? extends SystemParameter> iterable) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).addAllParameters(iterable);
            return this;
        }

        public Builder addParameters(SystemParameter systemParameter) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).addParameters(systemParameter);
            return this;
        }

        public Builder clearParameters() {
            copyOnWrite();
            ((SystemParameterRule) this.instance).clearParameters();
            return this;
        }

        public Builder clearSelector() {
            copyOnWrite();
            ((SystemParameterRule) this.instance).clearSelector();
            return this;
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public SystemParameter getParameters(int i) {
            return ((SystemParameterRule) this.instance).getParameters(i);
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public int getParametersCount() {
            return ((SystemParameterRule) this.instance).getParametersCount();
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public List<SystemParameter> getParametersList() {
            return Collections.unmodifiableList(((SystemParameterRule) this.instance).getParametersList());
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public String getSelector() {
            return ((SystemParameterRule) this.instance).getSelector();
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public xq1 getSelectorBytes() {
            return ((SystemParameterRule) this.instance).getSelectorBytes();
        }

        public Builder removeParameters(int i) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).removeParameters(i);
            return this;
        }

        public Builder setParameters(int i, SystemParameter systemParameter) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).setParameters(i, systemParameter);
            return this;
        }

        public Builder setSelector(String str) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).setSelector(str);
            return this;
        }

        public Builder setSelectorBytes(xq1 xq1Var) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).setSelectorBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(SystemParameterRule.DEFAULT_INSTANCE);
        }

        public Builder addParameters(int i, SystemParameter systemParameter) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).addParameters(i, systemParameter);
            return this;
        }

        public Builder setParameters(int i, SystemParameter.Builder builder) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).setParameters(i, (SystemParameter) builder.build());
            return this;
        }

        public Builder addParameters(SystemParameter.Builder builder) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).addParameters((SystemParameter) builder.build());
            return this;
        }

        public Builder addParameters(int i, SystemParameter.Builder builder) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).addParameters(i, (SystemParameter) builder.build());
            return this;
        }
    }

    static {
        SystemParameterRule systemParameterRule = new SystemParameterRule();
        DEFAULT_INSTANCE = systemParameterRule;
        wn7.registerDefaultInstance(SystemParameterRule.class, systemParameterRule);
    }

    private SystemParameterRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParameters(Iterable<? extends SystemParameter> iterable) {
        ensureParametersIsMutable();
        r8.addAll((Iterable) iterable, (List) this.parameters_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParameters(SystemParameter systemParameter) {
        systemParameter.getClass();
        ensureParametersIsMutable();
        this.parameters_.add(systemParameter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParameters() {
        this.parameters_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureParametersIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.parameters_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.parameters_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static SystemParameterRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream) {
        return (SystemParameterRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer) {
        return (SystemParameterRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParameters(int i) {
        ensureParametersIsMutable();
        this.parameters_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParameters(int i, SystemParameter systemParameter) {
        systemParameter.getClass();
        ensureParametersIsMutable();
        this.parameters_.set(i, systemParameter);
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
        C112381 c112381 = null;
        switch (C112381.f13328xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new SystemParameterRule();
            case 2:
                return new Builder(c112381);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"selector_", "parameters_", SystemParameter.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (SystemParameterRule.class) {
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

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public SystemParameter getParameters(int i) {
        return (SystemParameter) this.parameters_.get(i);
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public int getParametersCount() {
        return this.parameters_.size();
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public List<SystemParameter> getParametersList() {
        return this.parameters_;
    }

    public SystemParameterOrBuilder getParametersOrBuilder(int i) {
        return (SystemParameterOrBuilder) this.parameters_.get(i);
    }

    public List<? extends SystemParameterOrBuilder> getParametersOrBuilderList() {
        return this.parameters_;
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public String getSelector() {
        return this.selector_;
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public xq1 getSelectorBytes() {
        return xq1.m56589q(this.selector_);
    }

    public static Builder newBuilder(SystemParameterRule systemParameterRule) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(systemParameterRule);
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (SystemParameterRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (SystemParameterRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static SystemParameterRule parseFrom(xq1 xq1Var) {
        return (SystemParameterRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParameters(int i, SystemParameter systemParameter) {
        systemParameter.getClass();
        ensureParametersIsMutable();
        this.parameters_.add(i, systemParameter);
    }

    public static SystemParameterRule parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (SystemParameterRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static SystemParameterRule parseFrom(byte[] bArr) {
        return (SystemParameterRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SystemParameterRule parseFrom(byte[] bArr, qp6 qp6Var) {
        return (SystemParameterRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream) {
        return (SystemParameterRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (SystemParameterRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static SystemParameterRule parseFrom(jf3 jf3Var) {
        return (SystemParameterRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static SystemParameterRule parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (SystemParameterRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
