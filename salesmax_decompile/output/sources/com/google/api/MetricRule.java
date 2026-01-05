package com.google.api;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p001o.fbj;
import p001o.hxc;
import p001o.jf3;
import p001o.nra;
import p001o.ora;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;

/* loaded from: classes3.dex */
public final class MetricRule extends wn7 implements MetricRuleOrBuilder {
    private static final MetricRule DEFAULT_INSTANCE;
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile hxc PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private ora metricCosts_ = ora.m42592g();
    private String selector_ = "";

    /* renamed from: com.google.api.MetricRule$1 */
    public static /* synthetic */ class C112201 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13312xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13312xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13312xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13312xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13312xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13312xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13312xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13312xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements MetricRuleOrBuilder {
        public /* synthetic */ Builder(C112201 c112201) {
            this();
        }

        public Builder clearMetricCosts() {
            copyOnWrite();
            ((MetricRule) this.instance).getMutableMetricCostsMap().clear();
            return this;
        }

        public Builder clearSelector() {
            copyOnWrite();
            ((MetricRule) this.instance).clearSelector();
            return this;
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public boolean containsMetricCosts(String str) {
            str.getClass();
            return ((MetricRule) this.instance).getMetricCostsMap().containsKey(str);
        }

        @Override // com.google.api.MetricRuleOrBuilder
        @Deprecated
        public Map<String, Long> getMetricCosts() {
            return getMetricCostsMap();
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public int getMetricCostsCount() {
            return ((MetricRule) this.instance).getMetricCostsMap().size();
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public Map<String, Long> getMetricCostsMap() {
            return Collections.unmodifiableMap(((MetricRule) this.instance).getMetricCostsMap());
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public long getMetricCostsOrDefault(String str, long j) {
            str.getClass();
            Map<String, Long> metricCostsMap = ((MetricRule) this.instance).getMetricCostsMap();
            return metricCostsMap.containsKey(str) ? metricCostsMap.get(str).longValue() : j;
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public long getMetricCostsOrThrow(String str) {
            str.getClass();
            Map<String, Long> metricCostsMap = ((MetricRule) this.instance).getMetricCostsMap();
            if (metricCostsMap.containsKey(str)) {
                return metricCostsMap.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public String getSelector() {
            return ((MetricRule) this.instance).getSelector();
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public xq1 getSelectorBytes() {
            return ((MetricRule) this.instance).getSelectorBytes();
        }

        public Builder putAllMetricCosts(Map<String, Long> map) {
            copyOnWrite();
            ((MetricRule) this.instance).getMutableMetricCostsMap().putAll(map);
            return this;
        }

        public Builder putMetricCosts(String str, long j) {
            str.getClass();
            copyOnWrite();
            ((MetricRule) this.instance).getMutableMetricCostsMap().put(str, Long.valueOf(j));
            return this;
        }

        public Builder removeMetricCosts(String str) {
            str.getClass();
            copyOnWrite();
            ((MetricRule) this.instance).getMutableMetricCostsMap().remove(str);
            return this;
        }

        public Builder setSelector(String str) {
            copyOnWrite();
            ((MetricRule) this.instance).setSelector(str);
            return this;
        }

        public Builder setSelectorBytes(xq1 xq1Var) {
            copyOnWrite();
            ((MetricRule) this.instance).setSelectorBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(MetricRule.DEFAULT_INSTANCE);
        }
    }

    public static final class MetricCostsDefaultEntryHolder {
        static final nra defaultEntry = nra.m41005d(fbj.EnumC13396b.STRING, "", fbj.EnumC13396b.INT64, 0L);

        private MetricCostsDefaultEntryHolder() {
        }
    }

    static {
        MetricRule metricRule = new MetricRule();
        DEFAULT_INSTANCE = metricRule;
        wn7.registerDefaultInstance(MetricRule.class, metricRule);
    }

    private MetricRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static MetricRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableMetricCostsMap() {
        return internalGetMutableMetricCosts();
    }

    private ora internalGetMetricCosts() {
        return this.metricCosts_;
    }

    private ora internalGetMutableMetricCosts() {
        if (!this.metricCosts_.m42597t()) {
            this.metricCosts_ = this.metricCosts_.m42595A();
        }
        return this.metricCosts_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream) {
        return (MetricRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricRule parseFrom(ByteBuffer byteBuffer) {
        return (MetricRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    @Override // com.google.api.MetricRuleOrBuilder
    public boolean containsMetricCosts(String str) {
        str.getClass();
        return internalGetMetricCosts().containsKey(str);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112201 c112201 = null;
        switch (C112201.f13312xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new MetricRule();
            case 2:
                return new Builder(c112201);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"selector_", "metricCosts_", MetricCostsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (MetricRule.class) {
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

    @Override // com.google.api.MetricRuleOrBuilder
    @Deprecated
    public Map<String, Long> getMetricCosts() {
        return getMetricCostsMap();
    }

    @Override // com.google.api.MetricRuleOrBuilder
    public int getMetricCostsCount() {
        return internalGetMetricCosts().size();
    }

    @Override // com.google.api.MetricRuleOrBuilder
    public Map<String, Long> getMetricCostsMap() {
        return Collections.unmodifiableMap(internalGetMetricCosts());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.api.MetricRuleOrBuilder
    public long getMetricCostsOrDefault(String str, long j) {
        str.getClass();
        ora oraVarInternalGetMetricCosts = internalGetMetricCosts();
        return oraVarInternalGetMetricCosts.containsKey(str) ? ((Long) oraVarInternalGetMetricCosts.get(str)).longValue() : j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.api.MetricRuleOrBuilder
    public long getMetricCostsOrThrow(String str) {
        str.getClass();
        ora oraVarInternalGetMetricCosts = internalGetMetricCosts();
        if (oraVarInternalGetMetricCosts.containsKey(str)) {
            return ((Long) oraVarInternalGetMetricCosts.get(str)).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.api.MetricRuleOrBuilder
    public String getSelector() {
        return this.selector_;
    }

    @Override // com.google.api.MetricRuleOrBuilder
    public xq1 getSelectorBytes() {
        return xq1.m56589q(this.selector_);
    }

    public static Builder newBuilder(MetricRule metricRule) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(metricRule);
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (MetricRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static MetricRule parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (MetricRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static MetricRule parseFrom(xq1 xq1Var) {
        return (MetricRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static MetricRule parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (MetricRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static MetricRule parseFrom(byte[] bArr) {
        return (MetricRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricRule parseFrom(byte[] bArr, qp6 qp6Var) {
        return (MetricRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static MetricRule parseFrom(InputStream inputStream) {
        return (MetricRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricRule parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (MetricRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static MetricRule parseFrom(jf3 jf3Var) {
        return (MetricRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static MetricRule parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (MetricRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
