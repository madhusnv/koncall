package com.google.api;

import com.google.api.ContextRule;
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
public final class Context extends wn7 implements ContextOrBuilder {
    private static final Context DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private yn8.InterfaceC18446j rules_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.Context$1 */
    public static /* synthetic */ class C111981 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13295xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13295xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13295xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13295xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13295xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13295xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13295xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13295xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements ContextOrBuilder {
        public /* synthetic */ Builder(C111981 c111981) {
            this();
        }

        public Builder addAllRules(Iterable<? extends ContextRule> iterable) {
            copyOnWrite();
            ((Context) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder addRules(ContextRule contextRule) {
            copyOnWrite();
            ((Context) this.instance).addRules(contextRule);
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((Context) this.instance).clearRules();
            return this;
        }

        @Override // com.google.api.ContextOrBuilder
        public ContextRule getRules(int i) {
            return ((Context) this.instance).getRules(i);
        }

        @Override // com.google.api.ContextOrBuilder
        public int getRulesCount() {
            return ((Context) this.instance).getRulesCount();
        }

        @Override // com.google.api.ContextOrBuilder
        public List<ContextRule> getRulesList() {
            return Collections.unmodifiableList(((Context) this.instance).getRulesList());
        }

        public Builder removeRules(int i) {
            copyOnWrite();
            ((Context) this.instance).removeRules(i);
            return this;
        }

        public Builder setRules(int i, ContextRule contextRule) {
            copyOnWrite();
            ((Context) this.instance).setRules(i, contextRule);
            return this;
        }

        private Builder() {
            super(Context.DEFAULT_INSTANCE);
        }

        public Builder addRules(int i, ContextRule contextRule) {
            copyOnWrite();
            ((Context) this.instance).addRules(i, contextRule);
            return this;
        }

        public Builder setRules(int i, ContextRule.Builder builder) {
            copyOnWrite();
            ((Context) this.instance).setRules(i, (ContextRule) builder.build());
            return this;
        }

        public Builder addRules(ContextRule.Builder builder) {
            copyOnWrite();
            ((Context) this.instance).addRules((ContextRule) builder.build());
            return this;
        }

        public Builder addRules(int i, ContextRule.Builder builder) {
            copyOnWrite();
            ((Context) this.instance).addRules(i, (ContextRule) builder.build());
            return this;
        }
    }

    static {
        Context context = new Context();
        DEFAULT_INSTANCE = context;
        wn7.registerDefaultInstance(Context.class, context);
    }

    private Context() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends ContextRule> iterable) {
        ensureRulesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(ContextRule contextRule) {
        contextRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(contextRule);
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

    public static Context getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Context parseDelimitedFrom(InputStream inputStream) {
        return (Context) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Context parseFrom(ByteBuffer byteBuffer) {
        return (Context) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setRules(int i, ContextRule contextRule) {
        contextRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, contextRule);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C111981 c111981 = null;
        switch (C111981.f13295xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Context();
            case 2:
                return new Builder(c111981);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", ContextRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Context.class) {
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

    @Override // com.google.api.ContextOrBuilder
    public ContextRule getRules(int i) {
        return (ContextRule) this.rules_.get(i);
    }

    @Override // com.google.api.ContextOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.ContextOrBuilder
    public List<ContextRule> getRulesList() {
        return this.rules_;
    }

    public ContextRuleOrBuilder getRulesOrBuilder(int i) {
        return (ContextRuleOrBuilder) this.rules_.get(i);
    }

    public List<? extends ContextRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static Builder newBuilder(Context context) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(context);
    }

    public static Context parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Context) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Context parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Context) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Context parseFrom(xq1 xq1Var) {
        return (Context) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, ContextRule contextRule) {
        contextRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, contextRule);
    }

    public static Context parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Context) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Context parseFrom(byte[] bArr) {
        return (Context) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Context parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Context) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Context parseFrom(InputStream inputStream) {
        return (Context) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Context parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Context) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Context parseFrom(jf3 jf3Var) {
        return (Context) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Context parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Context) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
