package com.google.api;

import com.google.api.BackendRule;
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
public final class Backend extends wn7 implements BackendOrBuilder {
    private static final Backend DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private yn8.InterfaceC18446j rules_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.Backend$1 */
    public static /* synthetic */ class C111921 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13291xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13291xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13291xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13291xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13291xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13291xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13291xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13291xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements BackendOrBuilder {
        public /* synthetic */ Builder(C111921 c111921) {
            this();
        }

        public Builder addAllRules(Iterable<? extends BackendRule> iterable) {
            copyOnWrite();
            ((Backend) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder addRules(BackendRule backendRule) {
            copyOnWrite();
            ((Backend) this.instance).addRules(backendRule);
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((Backend) this.instance).clearRules();
            return this;
        }

        @Override // com.google.api.BackendOrBuilder
        public BackendRule getRules(int i) {
            return ((Backend) this.instance).getRules(i);
        }

        @Override // com.google.api.BackendOrBuilder
        public int getRulesCount() {
            return ((Backend) this.instance).getRulesCount();
        }

        @Override // com.google.api.BackendOrBuilder
        public List<BackendRule> getRulesList() {
            return Collections.unmodifiableList(((Backend) this.instance).getRulesList());
        }

        public Builder removeRules(int i) {
            copyOnWrite();
            ((Backend) this.instance).removeRules(i);
            return this;
        }

        public Builder setRules(int i, BackendRule backendRule) {
            copyOnWrite();
            ((Backend) this.instance).setRules(i, backendRule);
            return this;
        }

        private Builder() {
            super(Backend.DEFAULT_INSTANCE);
        }

        public Builder addRules(int i, BackendRule backendRule) {
            copyOnWrite();
            ((Backend) this.instance).addRules(i, backendRule);
            return this;
        }

        public Builder setRules(int i, BackendRule.Builder builder) {
            copyOnWrite();
            ((Backend) this.instance).setRules(i, (BackendRule) builder.build());
            return this;
        }

        public Builder addRules(BackendRule.Builder builder) {
            copyOnWrite();
            ((Backend) this.instance).addRules((BackendRule) builder.build());
            return this;
        }

        public Builder addRules(int i, BackendRule.Builder builder) {
            copyOnWrite();
            ((Backend) this.instance).addRules(i, (BackendRule) builder.build());
            return this;
        }
    }

    static {
        Backend backend = new Backend();
        DEFAULT_INSTANCE = backend;
        wn7.registerDefaultInstance(Backend.class, backend);
    }

    private Backend() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends BackendRule> iterable) {
        ensureRulesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(BackendRule backendRule) {
        backendRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(backendRule);
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

    public static Backend getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Backend parseDelimitedFrom(InputStream inputStream) {
        return (Backend) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Backend parseFrom(ByteBuffer byteBuffer) {
        return (Backend) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setRules(int i, BackendRule backendRule) {
        backendRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, backendRule);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C111921 c111921 = null;
        switch (C111921.f13291xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Backend();
            case 2:
                return new Builder(c111921);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", BackendRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Backend.class) {
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

    @Override // com.google.api.BackendOrBuilder
    public BackendRule getRules(int i) {
        return (BackendRule) this.rules_.get(i);
    }

    @Override // com.google.api.BackendOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.BackendOrBuilder
    public List<BackendRule> getRulesList() {
        return this.rules_;
    }

    public BackendRuleOrBuilder getRulesOrBuilder(int i) {
        return (BackendRuleOrBuilder) this.rules_.get(i);
    }

    public List<? extends BackendRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static Builder newBuilder(Backend backend) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(backend);
    }

    public static Backend parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Backend) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Backend parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Backend) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Backend parseFrom(xq1 xq1Var) {
        return (Backend) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, BackendRule backendRule) {
        backendRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, backendRule);
    }

    public static Backend parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Backend) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Backend parseFrom(byte[] bArr) {
        return (Backend) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Backend parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Backend) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Backend parseFrom(InputStream inputStream) {
        return (Backend) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Backend parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Backend) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Backend parseFrom(jf3 jf3Var) {
        return (Backend) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Backend parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Backend) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
