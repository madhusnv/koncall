package com.amplifyframework.datastore.generated.model;

import java.util.List;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AggregatedMetrics {
    private final String accountId;
    private final String entityId;
    private final String entityName;
    private final List<AggregatedMetricValue> metricValues;
    private final String metricsLevel;
    private final String period;

    public interface AccountIdStep {
        PeriodStep accountId(String str);
    }

    public interface BuildStep {
        AggregatedMetrics build();

        BuildStep entityId(String str);

        BuildStep entityName(String str);

        BuildStep metricValues(List<AggregatedMetricValue> list);
    }

    public static class Builder implements AccountIdStep, PeriodStep, MetricsLevelStep, BuildStep {
        private String accountId;
        private String entityId;
        private String entityName;
        private List<AggregatedMetricValue> metricValues;
        private String metricsLevel;
        private String period;

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.AccountIdStep
        public PeriodStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.BuildStep
        public AggregatedMetrics build() {
            return new AggregatedMetrics(this.accountId, this.period, this.metricsLevel, this.entityId, this.entityName, this.metricValues);
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.BuildStep
        public BuildStep entityId(String str) {
            this.entityId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.BuildStep
        public BuildStep entityName(String str) {
            this.entityName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.BuildStep
        public BuildStep metricValues(List<AggregatedMetricValue> list) {
            this.metricValues = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.MetricsLevelStep
        public BuildStep metricsLevel(String str) {
            Objects.requireNonNull(str);
            this.metricsLevel = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.PeriodStep
        public MetricsLevelStep period(String str) {
            Objects.requireNonNull(str);
            this.period = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, List<AggregatedMetricValue> list) {
            this.accountId = str;
            this.period = str2;
            this.metricsLevel = str3;
            this.entityId = str4;
            this.entityName = str5;
            this.metricValues = list;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.Builder, com.amplifyframework.datastore.generated.model.AggregatedMetrics.BuildStep
        public /* bridge */ /* synthetic */ BuildStep metricValues(List list) {
            return metricValues((List<AggregatedMetricValue>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, List<AggregatedMetricValue> list) {
            super(str, str2, str3, str4, str5, list);
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.Builder, com.amplifyframework.datastore.generated.model.AggregatedMetrics.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.Builder, com.amplifyframework.datastore.generated.model.AggregatedMetrics.BuildStep
        public CopyOfBuilder entityId(String str) {
            return (CopyOfBuilder) super.entityId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.Builder, com.amplifyframework.datastore.generated.model.AggregatedMetrics.BuildStep
        public CopyOfBuilder entityName(String str) {
            return (CopyOfBuilder) super.entityName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.Builder, com.amplifyframework.datastore.generated.model.AggregatedMetrics.BuildStep
        public CopyOfBuilder metricValues(List<AggregatedMetricValue> list) {
            return (CopyOfBuilder) super.metricValues(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.Builder, com.amplifyframework.datastore.generated.model.AggregatedMetrics.MetricsLevelStep
        public CopyOfBuilder metricsLevel(String str) {
            return (CopyOfBuilder) super.metricsLevel(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetrics.Builder, com.amplifyframework.datastore.generated.model.AggregatedMetrics.PeriodStep
        public CopyOfBuilder period(String str) {
            return (CopyOfBuilder) super.period(str);
        }
    }

    public interface MetricsLevelStep {
        BuildStep metricsLevel(String str);
    }

    public interface PeriodStep {
        MetricsLevelStep period(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.accountId, this.period, this.metricsLevel, this.entityId, this.entityName, this.metricValues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AggregatedMetrics.class != obj.getClass()) {
            return false;
        }
        AggregatedMetrics aggregatedMetrics = (AggregatedMetrics) obj;
        return s6c.m47909a(getAccountId(), aggregatedMetrics.getAccountId()) && s6c.m47909a(getPeriod(), aggregatedMetrics.getPeriod()) && s6c.m47909a(getMetricsLevel(), aggregatedMetrics.getMetricsLevel()) && s6c.m47909a(getEntityId(), aggregatedMetrics.getEntityId()) && s6c.m47909a(getEntityName(), aggregatedMetrics.getEntityName()) && s6c.m47909a(getMetricValues(), aggregatedMetrics.getMetricValues());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public String getEntityName() {
        return this.entityName;
    }

    public List<AggregatedMetricValue> getMetricValues() {
        return this.metricValues;
    }

    public String getMetricsLevel() {
        return this.metricsLevel;
    }

    public String getPeriod() {
        return this.period;
    }

    public int hashCode() {
        return (getAccountId() + getPeriod() + getMetricsLevel() + getEntityId() + getEntityName() + getMetricValues()).hashCode();
    }

    private AggregatedMetrics(String str, String str2, String str3, String str4, String str5, List<AggregatedMetricValue> list) {
        this.accountId = str;
        this.period = str2;
        this.metricsLevel = str3;
        this.entityId = str4;
        this.entityName = str5;
        this.metricValues = list;
    }
}
