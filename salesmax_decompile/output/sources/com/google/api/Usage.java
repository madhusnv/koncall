package com.google.api;

import com.google.api.UsageRule;
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
public final class Usage extends wn7 implements UsageOrBuilder {
    private static final Usage DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private yn8.InterfaceC18446j requirements_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j rules_ = wn7.emptyProtobufList();
    private String producerNotificationChannel_ = "";

    /* renamed from: com.google.api.Usage$1 */
    public static /* synthetic */ class C112401 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13330xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13330xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13330xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13330xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13330xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13330xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13330xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13330xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements UsageOrBuilder {
        public /* synthetic */ Builder(C112401 c112401) {
            this();
        }

        public Builder addAllRequirements(Iterable<String> iterable) {
            copyOnWrite();
            ((Usage) this.instance).addAllRequirements(iterable);
            return this;
        }

        public Builder addAllRules(Iterable<? extends UsageRule> iterable) {
            copyOnWrite();
            ((Usage) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder addRequirements(String str) {
            copyOnWrite();
            ((Usage) this.instance).addRequirements(str);
            return this;
        }

        public Builder addRequirementsBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Usage) this.instance).addRequirementsBytes(xq1Var);
            return this;
        }

        public Builder addRules(UsageRule usageRule) {
            copyOnWrite();
            ((Usage) this.instance).addRules(usageRule);
            return this;
        }

        public Builder clearProducerNotificationChannel() {
            copyOnWrite();
            ((Usage) this.instance).clearProducerNotificationChannel();
            return this;
        }

        public Builder clearRequirements() {
            copyOnWrite();
            ((Usage) this.instance).clearRequirements();
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((Usage) this.instance).clearRules();
            return this;
        }

        @Override // com.google.api.UsageOrBuilder
        public String getProducerNotificationChannel() {
            return ((Usage) this.instance).getProducerNotificationChannel();
        }

        @Override // com.google.api.UsageOrBuilder
        public xq1 getProducerNotificationChannelBytes() {
            return ((Usage) this.instance).getProducerNotificationChannelBytes();
        }

        @Override // com.google.api.UsageOrBuilder
        public String getRequirements(int i) {
            return ((Usage) this.instance).getRequirements(i);
        }

        @Override // com.google.api.UsageOrBuilder
        public xq1 getRequirementsBytes(int i) {
            return ((Usage) this.instance).getRequirementsBytes(i);
        }

        @Override // com.google.api.UsageOrBuilder
        public int getRequirementsCount() {
            return ((Usage) this.instance).getRequirementsCount();
        }

        @Override // com.google.api.UsageOrBuilder
        public List<String> getRequirementsList() {
            return Collections.unmodifiableList(((Usage) this.instance).getRequirementsList());
        }

        @Override // com.google.api.UsageOrBuilder
        public UsageRule getRules(int i) {
            return ((Usage) this.instance).getRules(i);
        }

        @Override // com.google.api.UsageOrBuilder
        public int getRulesCount() {
            return ((Usage) this.instance).getRulesCount();
        }

        @Override // com.google.api.UsageOrBuilder
        public List<UsageRule> getRulesList() {
            return Collections.unmodifiableList(((Usage) this.instance).getRulesList());
        }

        public Builder removeRules(int i) {
            copyOnWrite();
            ((Usage) this.instance).removeRules(i);
            return this;
        }

        public Builder setProducerNotificationChannel(String str) {
            copyOnWrite();
            ((Usage) this.instance).setProducerNotificationChannel(str);
            return this;
        }

        public Builder setProducerNotificationChannelBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Usage) this.instance).setProducerNotificationChannelBytes(xq1Var);
            return this;
        }

        public Builder setRequirements(int i, String str) {
            copyOnWrite();
            ((Usage) this.instance).setRequirements(i, str);
            return this;
        }

        public Builder setRules(int i, UsageRule usageRule) {
            copyOnWrite();
            ((Usage) this.instance).setRules(i, usageRule);
            return this;
        }

        private Builder() {
            super(Usage.DEFAULT_INSTANCE);
        }

        public Builder addRules(int i, UsageRule usageRule) {
            copyOnWrite();
            ((Usage) this.instance).addRules(i, usageRule);
            return this;
        }

        public Builder setRules(int i, UsageRule.Builder builder) {
            copyOnWrite();
            ((Usage) this.instance).setRules(i, (UsageRule) builder.build());
            return this;
        }

        public Builder addRules(UsageRule.Builder builder) {
            copyOnWrite();
            ((Usage) this.instance).addRules((UsageRule) builder.build());
            return this;
        }

        public Builder addRules(int i, UsageRule.Builder builder) {
            copyOnWrite();
            ((Usage) this.instance).addRules(i, (UsageRule) builder.build());
            return this;
        }
    }

    static {
        Usage usage = new Usage();
        DEFAULT_INSTANCE = usage;
        wn7.registerDefaultInstance(Usage.class, usage);
    }

    private Usage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequirements(Iterable<String> iterable) {
        ensureRequirementsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.requirements_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends UsageRule> iterable) {
        ensureRulesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirements(String str) {
        str.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirementsBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        ensureRequirementsIsMutable();
        this.requirements_.add(xq1Var.m56593N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(UsageRule usageRule) {
        usageRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(usageRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerNotificationChannel() {
        this.producerNotificationChannel_ = getDefaultInstance().getProducerNotificationChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequirements() {
        this.requirements_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = wn7.emptyProtobufList();
    }

    private void ensureRequirementsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.requirements_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.requirements_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureRulesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.rules_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.rules_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static Usage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Usage parseDelimitedFrom(InputStream inputStream) {
        return (Usage) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer) {
        return (Usage) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setProducerNotificationChannel(String str) {
        str.getClass();
        this.producerNotificationChannel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerNotificationChannelBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.producerNotificationChannel_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequirements(int i, String str) {
        str.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i, UsageRule usageRule) {
        usageRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, usageRule);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112401 c112401 = null;
        switch (C112401.f13330xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Usage();
            case 2:
                return new Builder(c112401);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0002\u0000\u0001Ț\u0006\u001b\u0007Ȉ", new Object[]{"requirements_", "rules_", UsageRule.class, "producerNotificationChannel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Usage.class) {
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

    @Override // com.google.api.UsageOrBuilder
    public String getProducerNotificationChannel() {
        return this.producerNotificationChannel_;
    }

    @Override // com.google.api.UsageOrBuilder
    public xq1 getProducerNotificationChannelBytes() {
        return xq1.m56589q(this.producerNotificationChannel_);
    }

    @Override // com.google.api.UsageOrBuilder
    public String getRequirements(int i) {
        return (String) this.requirements_.get(i);
    }

    @Override // com.google.api.UsageOrBuilder
    public xq1 getRequirementsBytes(int i) {
        return xq1.m56589q((String) this.requirements_.get(i));
    }

    @Override // com.google.api.UsageOrBuilder
    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    @Override // com.google.api.UsageOrBuilder
    public List<String> getRequirementsList() {
        return this.requirements_;
    }

    @Override // com.google.api.UsageOrBuilder
    public UsageRule getRules(int i) {
        return (UsageRule) this.rules_.get(i);
    }

    @Override // com.google.api.UsageOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.UsageOrBuilder
    public List<UsageRule> getRulesList() {
        return this.rules_;
    }

    public UsageRuleOrBuilder getRulesOrBuilder(int i) {
        return (UsageRuleOrBuilder) this.rules_.get(i);
    }

    public List<? extends UsageRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static Builder newBuilder(Usage usage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(usage);
    }

    public static Usage parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Usage) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Usage) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Usage parseFrom(xq1 xq1Var) {
        return (Usage) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, UsageRule usageRule) {
        usageRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, usageRule);
    }

    public static Usage parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Usage) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Usage parseFrom(byte[] bArr) {
        return (Usage) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Usage parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Usage) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Usage parseFrom(InputStream inputStream) {
        return (Usage) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Usage parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Usage) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Usage parseFrom(jf3 jf3Var) {
        return (Usage) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Usage parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Usage) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
