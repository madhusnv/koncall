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
public final class QuotaLimit extends wn7 implements QuotaLimitOrBuilder {
    private static final QuotaLimit DEFAULT_INSTANCE;
    public static final int DEFAULT_LIMIT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 12;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FREE_TIER_FIELD_NUMBER = 7;
    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    public static final int METRIC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile hxc PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 9;
    public static final int VALUES_FIELD_NUMBER = 10;
    private long defaultLimit_;
    private long freeTier_;
    private long maxLimit_;
    private ora values_ = ora.m42592g();
    private String name_ = "";
    private String description_ = "";
    private String duration_ = "";
    private String metric_ = "";
    private String unit_ = "";
    private String displayName_ = "";

    /* renamed from: com.google.api.QuotaLimit$1 */
    public static /* synthetic */ class C112311 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13322xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13322xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13322xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13322xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13322xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13322xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13322xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13322xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements QuotaLimitOrBuilder {
        public /* synthetic */ Builder(C112311 c112311) {
            this();
        }

        public Builder clearDefaultLimit() {
            copyOnWrite();
            ((QuotaLimit) this.instance).clearDefaultLimit();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((QuotaLimit) this.instance).clearDescription();
            return this;
        }

        public Builder clearDisplayName() {
            copyOnWrite();
            ((QuotaLimit) this.instance).clearDisplayName();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((QuotaLimit) this.instance).clearDuration();
            return this;
        }

        public Builder clearFreeTier() {
            copyOnWrite();
            ((QuotaLimit) this.instance).clearFreeTier();
            return this;
        }

        public Builder clearMaxLimit() {
            copyOnWrite();
            ((QuotaLimit) this.instance).clearMaxLimit();
            return this;
        }

        public Builder clearMetric() {
            copyOnWrite();
            ((QuotaLimit) this.instance).clearMetric();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((QuotaLimit) this.instance).clearName();
            return this;
        }

        public Builder clearUnit() {
            copyOnWrite();
            ((QuotaLimit) this.instance).clearUnit();
            return this;
        }

        public Builder clearValues() {
            copyOnWrite();
            ((QuotaLimit) this.instance).getMutableValuesMap().clear();
            return this;
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public boolean containsValues(String str) {
            str.getClass();
            return ((QuotaLimit) this.instance).getValuesMap().containsKey(str);
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public long getDefaultLimit() {
            return ((QuotaLimit) this.instance).getDefaultLimit();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public String getDescription() {
            return ((QuotaLimit) this.instance).getDescription();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public xq1 getDescriptionBytes() {
            return ((QuotaLimit) this.instance).getDescriptionBytes();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public String getDisplayName() {
            return ((QuotaLimit) this.instance).getDisplayName();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public xq1 getDisplayNameBytes() {
            return ((QuotaLimit) this.instance).getDisplayNameBytes();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public String getDuration() {
            return ((QuotaLimit) this.instance).getDuration();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public xq1 getDurationBytes() {
            return ((QuotaLimit) this.instance).getDurationBytes();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public long getFreeTier() {
            return ((QuotaLimit) this.instance).getFreeTier();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public long getMaxLimit() {
            return ((QuotaLimit) this.instance).getMaxLimit();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public String getMetric() {
            return ((QuotaLimit) this.instance).getMetric();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public xq1 getMetricBytes() {
            return ((QuotaLimit) this.instance).getMetricBytes();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public String getName() {
            return ((QuotaLimit) this.instance).getName();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public xq1 getNameBytes() {
            return ((QuotaLimit) this.instance).getNameBytes();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public String getUnit() {
            return ((QuotaLimit) this.instance).getUnit();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public xq1 getUnitBytes() {
            return ((QuotaLimit) this.instance).getUnitBytes();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        @Deprecated
        public Map<String, Long> getValues() {
            return getValuesMap();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public int getValuesCount() {
            return ((QuotaLimit) this.instance).getValuesMap().size();
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public Map<String, Long> getValuesMap() {
            return Collections.unmodifiableMap(((QuotaLimit) this.instance).getValuesMap());
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public long getValuesOrDefault(String str, long j) {
            str.getClass();
            Map<String, Long> valuesMap = ((QuotaLimit) this.instance).getValuesMap();
            return valuesMap.containsKey(str) ? valuesMap.get(str).longValue() : j;
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public long getValuesOrThrow(String str) {
            str.getClass();
            Map<String, Long> valuesMap = ((QuotaLimit) this.instance).getValuesMap();
            if (valuesMap.containsKey(str)) {
                return valuesMap.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllValues(Map<String, Long> map) {
            copyOnWrite();
            ((QuotaLimit) this.instance).getMutableValuesMap().putAll(map);
            return this;
        }

        public Builder putValues(String str, long j) {
            str.getClass();
            copyOnWrite();
            ((QuotaLimit) this.instance).getMutableValuesMap().put(str, Long.valueOf(j));
            return this;
        }

        public Builder removeValues(String str) {
            str.getClass();
            copyOnWrite();
            ((QuotaLimit) this.instance).getMutableValuesMap().remove(str);
            return this;
        }

        public Builder setDefaultLimit(long j) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setDefaultLimit(j);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(xq1 xq1Var) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setDescriptionBytes(xq1Var);
            return this;
        }

        public Builder setDisplayName(String str) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setDisplayName(str);
            return this;
        }

        public Builder setDisplayNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setDisplayNameBytes(xq1Var);
            return this;
        }

        public Builder setDuration(String str) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setDuration(str);
            return this;
        }

        public Builder setDurationBytes(xq1 xq1Var) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setDurationBytes(xq1Var);
            return this;
        }

        public Builder setFreeTier(long j) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setFreeTier(j);
            return this;
        }

        public Builder setMaxLimit(long j) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setMaxLimit(j);
            return this;
        }

        public Builder setMetric(String str) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setMetric(str);
            return this;
        }

        public Builder setMetricBytes(xq1 xq1Var) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setMetricBytes(xq1Var);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setNameBytes(xq1Var);
            return this;
        }

        public Builder setUnit(String str) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setUnit(str);
            return this;
        }

        public Builder setUnitBytes(xq1 xq1Var) {
            copyOnWrite();
            ((QuotaLimit) this.instance).setUnitBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(QuotaLimit.DEFAULT_INSTANCE);
        }
    }

    public static final class ValuesDefaultEntryHolder {
        static final nra defaultEntry = nra.m41005d(fbj.EnumC13396b.STRING, "", fbj.EnumC13396b.INT64, 0L);

        private ValuesDefaultEntryHolder() {
        }
    }

    static {
        QuotaLimit quotaLimit = new QuotaLimit();
        DEFAULT_INSTANCE = quotaLimit;
        wn7.registerDefaultInstance(QuotaLimit.class, quotaLimit);
    }

    private QuotaLimit() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultLimit() {
        this.defaultLimit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = getDefaultInstance().getDuration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeTier() {
        this.freeTier_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxLimit() {
        this.maxLimit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetric() {
        this.metric_ = getDefaultInstance().getMetric();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    public static QuotaLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableValuesMap() {
        return internalGetMutableValues();
    }

    private ora internalGetMutableValues() {
        if (!this.values_.m42597t()) {
            this.values_ = this.values_.m42595A();
        }
        return this.values_;
    }

    private ora internalGetValues() {
        return this.values_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream) {
        return (QuotaLimit) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer) {
        return (QuotaLimit) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultLimit(long j) {
        this.defaultLimit_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.description_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.displayName_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(String str) {
        str.getClass();
        this.duration_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.duration_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeTier(long j) {
        this.freeTier_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxLimit(long j) {
        this.maxLimit_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetric(String str) {
        str.getClass();
        this.metric_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.metric_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.name_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.unit_ = xq1Var.m56593N();
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public boolean containsValues(String str) {
        str.getClass();
        return internalGetValues().containsKey(str);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112311 c112311 = null;
        switch (C112311.f13322xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new QuotaLimit();
            case 2:
                return new Builder(c112311);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0002\f\n\u0001\u0000\u0000\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0002\bȈ\tȈ\n2\fȈ", new Object[]{"description_", "defaultLimit_", "maxLimit_", "duration_", "name_", "freeTier_", "metric_", "unit_", "values_", ValuesDefaultEntryHolder.defaultEntry, "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (QuotaLimit.class) {
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

    @Override // com.google.api.QuotaLimitOrBuilder
    public long getDefaultLimit() {
        return this.defaultLimit_;
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public xq1 getDescriptionBytes() {
        return xq1.m56589q(this.description_);
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public xq1 getDisplayNameBytes() {
        return xq1.m56589q(this.displayName_);
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public String getDuration() {
        return this.duration_;
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public xq1 getDurationBytes() {
        return xq1.m56589q(this.duration_);
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public long getFreeTier() {
        return this.freeTier_;
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public long getMaxLimit() {
        return this.maxLimit_;
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public String getMetric() {
        return this.metric_;
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public xq1 getMetricBytes() {
        return xq1.m56589q(this.metric_);
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public xq1 getNameBytes() {
        return xq1.m56589q(this.name_);
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public String getUnit() {
        return this.unit_;
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public xq1 getUnitBytes() {
        return xq1.m56589q(this.unit_);
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    @Deprecated
    public Map<String, Long> getValues() {
        return getValuesMap();
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public int getValuesCount() {
        return internalGetValues().size();
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public Map<String, Long> getValuesMap() {
        return Collections.unmodifiableMap(internalGetValues());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.api.QuotaLimitOrBuilder
    public long getValuesOrDefault(String str, long j) {
        str.getClass();
        ora oraVarInternalGetValues = internalGetValues();
        return oraVarInternalGetValues.containsKey(str) ? ((Long) oraVarInternalGetValues.get(str)).longValue() : j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.api.QuotaLimitOrBuilder
    public long getValuesOrThrow(String str) {
        str.getClass();
        ora oraVarInternalGetValues = internalGetValues();
        if (oraVarInternalGetValues.containsKey(str)) {
            return ((Long) oraVarInternalGetValues.get(str)).longValue();
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(QuotaLimit quotaLimit) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(quotaLimit);
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (QuotaLimit) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (QuotaLimit) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static QuotaLimit parseFrom(xq1 xq1Var) {
        return (QuotaLimit) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static QuotaLimit parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (QuotaLimit) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static QuotaLimit parseFrom(byte[] bArr) {
        return (QuotaLimit) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QuotaLimit parseFrom(byte[] bArr, qp6 qp6Var) {
        return (QuotaLimit) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static QuotaLimit parseFrom(InputStream inputStream) {
        return (QuotaLimit) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaLimit parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (QuotaLimit) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static QuotaLimit parseFrom(jf3 jf3Var) {
        return (QuotaLimit) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static QuotaLimit parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (QuotaLimit) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
