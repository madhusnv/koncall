package com.google.api;

import com.google.api.HttpRule;
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
public final class Http extends wn7 implements HttpOrBuilder {
    private static final Http DEFAULT_INSTANCE;
    public static final int FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2;
    private static volatile hxc PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private boolean fullyDecodeReservedExpansion_;
    private yn8.InterfaceC18446j rules_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.Http$1 */
    public static /* synthetic */ class C112071 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13303xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13303xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13303xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13303xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13303xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13303xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13303xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13303xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements HttpOrBuilder {
        public /* synthetic */ Builder(C112071 c112071) {
            this();
        }

        public Builder addAllRules(Iterable<? extends HttpRule> iterable) {
            copyOnWrite();
            ((Http) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder addRules(HttpRule httpRule) {
            copyOnWrite();
            ((Http) this.instance).addRules(httpRule);
            return this;
        }

        public Builder clearFullyDecodeReservedExpansion() {
            copyOnWrite();
            ((Http) this.instance).clearFullyDecodeReservedExpansion();
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((Http) this.instance).clearRules();
            return this;
        }

        @Override // com.google.api.HttpOrBuilder
        public boolean getFullyDecodeReservedExpansion() {
            return ((Http) this.instance).getFullyDecodeReservedExpansion();
        }

        @Override // com.google.api.HttpOrBuilder
        public HttpRule getRules(int i) {
            return ((Http) this.instance).getRules(i);
        }

        @Override // com.google.api.HttpOrBuilder
        public int getRulesCount() {
            return ((Http) this.instance).getRulesCount();
        }

        @Override // com.google.api.HttpOrBuilder
        public List<HttpRule> getRulesList() {
            return Collections.unmodifiableList(((Http) this.instance).getRulesList());
        }

        public Builder removeRules(int i) {
            copyOnWrite();
            ((Http) this.instance).removeRules(i);
            return this;
        }

        public Builder setFullyDecodeReservedExpansion(boolean z) {
            copyOnWrite();
            ((Http) this.instance).setFullyDecodeReservedExpansion(z);
            return this;
        }

        public Builder setRules(int i, HttpRule httpRule) {
            copyOnWrite();
            ((Http) this.instance).setRules(i, httpRule);
            return this;
        }

        private Builder() {
            super(Http.DEFAULT_INSTANCE);
        }

        public Builder addRules(int i, HttpRule httpRule) {
            copyOnWrite();
            ((Http) this.instance).addRules(i, httpRule);
            return this;
        }

        public Builder setRules(int i, HttpRule.Builder builder) {
            copyOnWrite();
            ((Http) this.instance).setRules(i, (HttpRule) builder.build());
            return this;
        }

        public Builder addRules(HttpRule.Builder builder) {
            copyOnWrite();
            ((Http) this.instance).addRules((HttpRule) builder.build());
            return this;
        }

        public Builder addRules(int i, HttpRule.Builder builder) {
            copyOnWrite();
            ((Http) this.instance).addRules(i, (HttpRule) builder.build());
            return this;
        }
    }

    static {
        Http http = new Http();
        DEFAULT_INSTANCE = http;
        wn7.registerDefaultInstance(Http.class, http);
    }

    private Http() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends HttpRule> iterable) {
        ensureRulesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(HttpRule httpRule) {
        httpRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(httpRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullyDecodeReservedExpansion() {
        this.fullyDecodeReservedExpansion_ = false;
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

    public static Http getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Http parseDelimitedFrom(InputStream inputStream) {
        return (Http) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Http parseFrom(ByteBuffer byteBuffer) {
        return (Http) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setFullyDecodeReservedExpansion(boolean z) {
        this.fullyDecodeReservedExpansion_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i, HttpRule httpRule) {
        httpRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, httpRule);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112071 c112071 = null;
        switch (C112071.f13303xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Http();
            case 2:
                return new Builder(c112071);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"rules_", HttpRule.class, "fullyDecodeReservedExpansion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Http.class) {
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

    @Override // com.google.api.HttpOrBuilder
    public boolean getFullyDecodeReservedExpansion() {
        return this.fullyDecodeReservedExpansion_;
    }

    @Override // com.google.api.HttpOrBuilder
    public HttpRule getRules(int i) {
        return (HttpRule) this.rules_.get(i);
    }

    @Override // com.google.api.HttpOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.HttpOrBuilder
    public List<HttpRule> getRulesList() {
        return this.rules_;
    }

    public HttpRuleOrBuilder getRulesOrBuilder(int i) {
        return (HttpRuleOrBuilder) this.rules_.get(i);
    }

    public List<? extends HttpRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static Builder newBuilder(Http http) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(http);
    }

    public static Http parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Http) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Http parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Http) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Http parseFrom(xq1 xq1Var) {
        return (Http) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, HttpRule httpRule) {
        httpRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, httpRule);
    }

    public static Http parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Http) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Http parseFrom(byte[] bArr) {
        return (Http) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Http parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Http) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Http parseFrom(InputStream inputStream) {
        return (Http) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Http parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Http) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Http parseFrom(jf3 jf3Var) {
        return (Http) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Http parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Http) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
