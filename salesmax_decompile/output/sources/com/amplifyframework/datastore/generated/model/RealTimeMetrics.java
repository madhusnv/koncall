package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "entityId", "metricsLevel", "period", "metricsName"}, name = SQLiteCommandFactory.UNDEFINED), @Index(fields = {"accountId", "metricsLevel", "period"}, name = "metricsByLevel")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ})}, pluralName = "RealTimeMetrics")
/* loaded from: classes5.dex */
public final class RealTimeMetrics implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String entityId;

    @ModelField(targetType = "AWSTimestamp")
    private final Temporal.Timestamp expirationUnixTime;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(isRequired = true, targetType = "Float")
    private final Double metricValue;

    @ModelField(isRequired = true, targetType = "MetricsLevel")
    private final MetricsLevel metricsLevel;

    @ModelField(isRequired = true, targetType = "String")
    private final String metricsName;

    @ModelField(isRequired = true, targetType = "String")
    private final String period;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("RealTimeMetrics", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("RealTimeMetrics", "accountId");
    public static final QueryField METRICS_LEVEL = QueryField.field("RealTimeMetrics", "metricsLevel");
    public static final QueryField ENTITY_ID = QueryField.field("RealTimeMetrics", "entityId");
    public static final QueryField METRICS_NAME = QueryField.field("RealTimeMetrics", "metricsName");
    public static final QueryField PERIOD = QueryField.field("RealTimeMetrics", "period");
    public static final QueryField METRIC_VALUE = QueryField.field("RealTimeMetrics", "metricValue");
    public static final QueryField EXPIRATION_UNIX_TIME = QueryField.field("RealTimeMetrics", "expirationUnixTime");
    public static final QueryField CREATED_AT = QueryField.field("RealTimeMetrics", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("RealTimeMetrics", "updatedAt");

    public interface AccountIdStep {
        MetricsLevelStep accountId(String str);
    }

    public interface BuildStep {
        RealTimeMetrics build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep expirationUnixTime(Temporal.Timestamp timestamp);

        BuildStep id(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, MetricsLevelStep, EntityIdStep, MetricsNameStep, PeriodStep, MetricValueStep, BuildStep {
        private String accountId;
        private Temporal.DateTime createdAt;
        private String entityId;
        private Temporal.Timestamp expirationUnixTime;
        private String id;
        private Double metricValue;
        private MetricsLevel metricsLevel;
        private String metricsName;
        private String period;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.AccountIdStep
        public MetricsLevelStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.BuildStep
        public RealTimeMetrics build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new RealTimeMetrics(string, this.accountId, this.metricsLevel, this.entityId, this.metricsName, this.period, this.metricValue, this.expirationUnixTime, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.EntityIdStep
        public MetricsNameStep entityId(String str) {
            Objects.requireNonNull(str);
            this.entityId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.BuildStep
        public BuildStep expirationUnixTime(Temporal.Timestamp timestamp) {
            this.expirationUnixTime = timestamp;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.MetricValueStep
        public BuildStep metricValue(Double d) {
            Objects.requireNonNull(d);
            this.metricValue = d;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.MetricsLevelStep
        public EntityIdStep metricsLevel(MetricsLevel metricsLevel) {
            Objects.requireNonNull(metricsLevel);
            this.metricsLevel = metricsLevel;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.MetricsNameStep
        public PeriodStep metricsName(String str) {
            Objects.requireNonNull(str);
            this.metricsName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.PeriodStep
        public MetricValueStep period(String str) {
            Objects.requireNonNull(str);
            this.period = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, MetricsLevel metricsLevel, String str3, String str4, String str5, Double d, Temporal.Timestamp timestamp, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.metricsLevel = metricsLevel;
            this.entityId = str3;
            this.metricsName = str4;
            this.period = str5;
            this.metricValue = d;
            this.expirationUnixTime = timestamp;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, MetricsLevel metricsLevel, String str3, String str4, String str5, Double d, Temporal.Timestamp timestamp, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, metricsLevel, str3, str4, str5, d, timestamp, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(metricsLevel);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(str5);
            Objects.requireNonNull(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.Builder, com.amplifyframework.datastore.generated.model.RealTimeMetrics.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.Builder, com.amplifyframework.datastore.generated.model.RealTimeMetrics.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.Builder, com.amplifyframework.datastore.generated.model.RealTimeMetrics.EntityIdStep
        public CopyOfBuilder entityId(String str) {
            return (CopyOfBuilder) super.entityId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.Builder, com.amplifyframework.datastore.generated.model.RealTimeMetrics.BuildStep
        public CopyOfBuilder expirationUnixTime(Temporal.Timestamp timestamp) {
            return (CopyOfBuilder) super.expirationUnixTime(timestamp);
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.Builder, com.amplifyframework.datastore.generated.model.RealTimeMetrics.MetricValueStep
        public CopyOfBuilder metricValue(Double d) {
            return (CopyOfBuilder) super.metricValue(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.Builder, com.amplifyframework.datastore.generated.model.RealTimeMetrics.MetricsLevelStep
        public CopyOfBuilder metricsLevel(MetricsLevel metricsLevel) {
            return (CopyOfBuilder) super.metricsLevel(metricsLevel);
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.Builder, com.amplifyframework.datastore.generated.model.RealTimeMetrics.MetricsNameStep
        public CopyOfBuilder metricsName(String str) {
            return (CopyOfBuilder) super.metricsName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.Builder, com.amplifyframework.datastore.generated.model.RealTimeMetrics.PeriodStep
        public CopyOfBuilder period(String str) {
            return (CopyOfBuilder) super.period(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.RealTimeMetrics.Builder, com.amplifyframework.datastore.generated.model.RealTimeMetrics.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface EntityIdStep {
        MetricsNameStep entityId(String str);
    }

    public interface MetricValueStep {
        BuildStep metricValue(Double d);
    }

    public interface MetricsLevelStep {
        EntityIdStep metricsLevel(MetricsLevel metricsLevel);
    }

    public interface MetricsNameStep {
        PeriodStep metricsName(String str);
    }

    public interface PeriodStep {
        MetricValueStep period(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static RealTimeMetrics justId(String str) {
        return new RealTimeMetrics(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.metricsLevel, this.entityId, this.metricsName, this.period, this.metricValue, this.expirationUnixTime, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RealTimeMetrics.class != obj.getClass()) {
            return false;
        }
        RealTimeMetrics realTimeMetrics = (RealTimeMetrics) obj;
        return s6c.m47909a(getId(), realTimeMetrics.getId()) && s6c.m47909a(getAccountId(), realTimeMetrics.getAccountId()) && s6c.m47909a(getMetricsLevel(), realTimeMetrics.getMetricsLevel()) && s6c.m47909a(getEntityId(), realTimeMetrics.getEntityId()) && s6c.m47909a(getMetricsName(), realTimeMetrics.getMetricsName()) && s6c.m47909a(getPeriod(), realTimeMetrics.getPeriod()) && s6c.m47909a(getMetricValue(), realTimeMetrics.getMetricValue()) && s6c.m47909a(getExpirationUnixTime(), realTimeMetrics.getExpirationUnixTime()) && s6c.m47909a(getCreatedAt(), realTimeMetrics.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), realTimeMetrics.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public Temporal.Timestamp getExpirationUnixTime() {
        return this.expirationUnixTime;
    }

    public String getId() {
        return this.id;
    }

    public Double getMetricValue() {
        return this.metricValue;
    }

    public MetricsLevel getMetricsLevel() {
        return this.metricsLevel;
    }

    public String getMetricsName() {
        return this.metricsName;
    }

    public String getPeriod() {
        return this.period;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getMetricsLevel() + getEntityId() + getMetricsName() + getPeriod() + getMetricValue() + getExpirationUnixTime() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RealTimeMetrics {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("metricsLevel=" + String.valueOf(getMetricsLevel()) + ", ");
        sb.append("entityId=" + String.valueOf(getEntityId()) + ", ");
        sb.append("metricsName=" + String.valueOf(getMetricsName()) + ", ");
        sb.append("period=" + String.valueOf(getPeriod()) + ", ");
        sb.append("metricValue=" + String.valueOf(getMetricValue()) + ", ");
        sb.append("expirationUnixTime=" + String.valueOf(getExpirationUnixTime()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private RealTimeMetrics(String str, String str2, MetricsLevel metricsLevel, String str3, String str4, String str5, Double d, Temporal.Timestamp timestamp, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.metricsLevel = metricsLevel;
        this.entityId = str3;
        this.metricsName = str4;
        this.period = str5;
        this.metricValue = d;
        this.expirationUnixTime = timestamp;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
