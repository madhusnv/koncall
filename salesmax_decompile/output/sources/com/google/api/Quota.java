package com.google.api;

import com.google.api.MetricRule;
import com.google.api.QuotaLimit;
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
public final class Quota extends wn7 implements QuotaOrBuilder {
    private static final Quota DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile hxc PARSER;
    private yn8.InterfaceC18446j limits_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j metricRules_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.Quota$1 */
    public static /* synthetic */ class C112301 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13321xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13321xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13321xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13321xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13321xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13321xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13321xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13321xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements QuotaOrBuilder {
        public /* synthetic */ Builder(C112301 c112301) {
            this();
        }

        public Builder addAllLimits(Iterable<? extends QuotaLimit> iterable) {
            copyOnWrite();
            ((Quota) this.instance).addAllLimits(iterable);
            return this;
        }

        public Builder addAllMetricRules(Iterable<? extends MetricRule> iterable) {
            copyOnWrite();
            ((Quota) this.instance).addAllMetricRules(iterable);
            return this;
        }

        public Builder addLimits(QuotaLimit quotaLimit) {
            copyOnWrite();
            ((Quota) this.instance).addLimits(quotaLimit);
            return this;
        }

        public Builder addMetricRules(MetricRule metricRule) {
            copyOnWrite();
            ((Quota) this.instance).addMetricRules(metricRule);
            return this;
        }

        public Builder clearLimits() {
            copyOnWrite();
            ((Quota) this.instance).clearLimits();
            return this;
        }

        public Builder clearMetricRules() {
            copyOnWrite();
            ((Quota) this.instance).clearMetricRules();
            return this;
        }

        @Override // com.google.api.QuotaOrBuilder
        public QuotaLimit getLimits(int i) {
            return ((Quota) this.instance).getLimits(i);
        }

        @Override // com.google.api.QuotaOrBuilder
        public int getLimitsCount() {
            return ((Quota) this.instance).getLimitsCount();
        }

        @Override // com.google.api.QuotaOrBuilder
        public List<QuotaLimit> getLimitsList() {
            return Collections.unmodifiableList(((Quota) this.instance).getLimitsList());
        }

        @Override // com.google.api.QuotaOrBuilder
        public MetricRule getMetricRules(int i) {
            return ((Quota) this.instance).getMetricRules(i);
        }

        @Override // com.google.api.QuotaOrBuilder
        public int getMetricRulesCount() {
            return ((Quota) this.instance).getMetricRulesCount();
        }

        @Override // com.google.api.QuotaOrBuilder
        public List<MetricRule> getMetricRulesList() {
            return Collections.unmodifiableList(((Quota) this.instance).getMetricRulesList());
        }

        public Builder removeLimits(int i) {
            copyOnWrite();
            ((Quota) this.instance).removeLimits(i);
            return this;
        }

        public Builder removeMetricRules(int i) {
            copyOnWrite();
            ((Quota) this.instance).removeMetricRules(i);
            return this;
        }

        public Builder setLimits(int i, QuotaLimit quotaLimit) {
            copyOnWrite();
            ((Quota) this.instance).setLimits(i, quotaLimit);
            return this;
        }

        public Builder setMetricRules(int i, MetricRule metricRule) {
            copyOnWrite();
            ((Quota) this.instance).setMetricRules(i, metricRule);
            return this;
        }

        private Builder() {
            super(Quota.DEFAULT_INSTANCE);
        }

        public Builder addLimits(int i, QuotaLimit quotaLimit) {
            copyOnWrite();
            ((Quota) this.instance).addLimits(i, quotaLimit);
            return this;
        }

        public Builder addMetricRules(int i, MetricRule metricRule) {
            copyOnWrite();
            ((Quota) this.instance).addMetricRules(i, metricRule);
            return this;
        }

        public Builder setLimits(int i, QuotaLimit.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).setLimits(i, (QuotaLimit) builder.build());
            return this;
        }

        public Builder setMetricRules(int i, MetricRule.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).setMetricRules(i, (MetricRule) builder.build());
            return this;
        }

        public Builder addLimits(QuotaLimit.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).addLimits((QuotaLimit) builder.build());
            return this;
        }

        public Builder addMetricRules(MetricRule.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).addMetricRules((MetricRule) builder.build());
            return this;
        }

        public Builder addLimits(int i, QuotaLimit.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).addLimits(i, (QuotaLimit) builder.build());
            return this;
        }

        public Builder addMetricRules(int i, MetricRule.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).addMetricRules(i, (MetricRule) builder.build());
            return this;
        }
    }

    static {
        Quota quota = new Quota();
        DEFAULT_INSTANCE = quota;
        wn7.registerDefaultInstance(Quota.class, quota);
    }

    private Quota() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLimits(Iterable<? extends QuotaLimit> iterable) {
        ensureLimitsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.limits_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetricRules(Iterable<? extends MetricRule> iterable) {
        ensureMetricRulesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.metricRules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLimits(QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.add(quotaLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetricRules(MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.add(metricRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimits() {
        this.limits_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetricRules() {
        this.metricRules_ = wn7.emptyProtobufList();
    }

    private void ensureLimitsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.limits_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.limits_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureMetricRulesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.metricRules_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.metricRules_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static Quota getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Quota parseDelimitedFrom(InputStream inputStream) {
        return (Quota) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer) {
        return (Quota) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLimits(int i) {
        ensureLimitsIsMutable();
        this.limits_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetricRules(int i) {
        ensureMetricRulesIsMutable();
        this.metricRules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimits(int i, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.set(i, quotaLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricRules(int i, MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.set(i, metricRule);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112301 c112301 = null;
        switch (C112301.f13321xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Quota();
            case 2:
                return new Builder(c112301);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"limits_", QuotaLimit.class, "metricRules_", MetricRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Quota.class) {
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

    @Override // com.google.api.QuotaOrBuilder
    public QuotaLimit getLimits(int i) {
        return (QuotaLimit) this.limits_.get(i);
    }

    @Override // com.google.api.QuotaOrBuilder
    public int getLimitsCount() {
        return this.limits_.size();
    }

    @Override // com.google.api.QuotaOrBuilder
    public List<QuotaLimit> getLimitsList() {
        return this.limits_;
    }

    public QuotaLimitOrBuilder getLimitsOrBuilder(int i) {
        return (QuotaLimitOrBuilder) this.limits_.get(i);
    }

    public List<? extends QuotaLimitOrBuilder> getLimitsOrBuilderList() {
        return this.limits_;
    }

    @Override // com.google.api.QuotaOrBuilder
    public MetricRule getMetricRules(int i) {
        return (MetricRule) this.metricRules_.get(i);
    }

    @Override // com.google.api.QuotaOrBuilder
    public int getMetricRulesCount() {
        return this.metricRules_.size();
    }

    @Override // com.google.api.QuotaOrBuilder
    public List<MetricRule> getMetricRulesList() {
        return this.metricRules_;
    }

    public MetricRuleOrBuilder getMetricRulesOrBuilder(int i) {
        return (MetricRuleOrBuilder) this.metricRules_.get(i);
    }

    public List<? extends MetricRuleOrBuilder> getMetricRulesOrBuilderList() {
        return this.metricRules_;
    }

    public static Builder newBuilder(Quota quota) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(quota);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Quota) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Quota) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Quota parseFrom(xq1 xq1Var) {
        return (Quota) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLimits(int i, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.add(i, quotaLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetricRules(int i, MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.add(i, metricRule);
    }

    public static Quota parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Quota) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Quota parseFrom(byte[] bArr) {
        return (Quota) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Quota parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Quota) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Quota parseFrom(InputStream inputStream) {
        return (Quota) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Quota) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Quota parseFrom(jf3 jf3Var) {
        return (Quota) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Quota parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Quota) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
