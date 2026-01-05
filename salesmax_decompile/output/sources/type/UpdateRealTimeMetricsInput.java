package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class UpdateRealTimeMetricsInput implements InputType {
    private final String accountId;
    private final Input<String> createdAt;
    private final String entityId;
    private final Input<Long> expirationUnixTime;
    private final Input<Double> metricValue;
    private final MetricsLevel metricsLevel;
    private final String metricsName;
    private final String period;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String entityId;
        private MetricsLevel metricsLevel;
        private String metricsName;
        private String period;
        private Input<Double> metricValue = Input.absent();
        private Input<Long> expirationUnixTime = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public UpdateRealTimeMetricsInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.metricsLevel, "metricsLevel == null");
            Utils.checkNotNull(this.entityId, "entityId == null");
            Utils.checkNotNull(this.metricsName, "metricsName == null");
            Utils.checkNotNull(this.period, "period == null");
            return new UpdateRealTimeMetricsInput(this.accountId, this.metricsLevel, this.entityId, this.metricsName, this.period, this.metricValue, this.expirationUnixTime, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder entityId(String str) {
            this.entityId = str;
            return this;
        }

        public Builder expirationUnixTime(Long l) {
            this.expirationUnixTime = Input.fromNullable(l);
            return this;
        }

        public Builder metricValue(Double d) {
            this.metricValue = Input.fromNullable(d);
            return this;
        }

        public Builder metricsLevel(MetricsLevel metricsLevel) {
            this.metricsLevel = metricsLevel;
            return this;
        }

        public Builder metricsName(String str) {
            this.metricsName = str;
            return this;
        }

        public Builder period(String str) {
            this.period = str;
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateRealTimeMetricsInput(String str, MetricsLevel metricsLevel, String str2, String str3, String str4, Input<Double> input, Input<Long> input2, Input<String> input3, Input<String> input4) {
        this.accountId = str;
        this.metricsLevel = metricsLevel;
        this.entityId = str2;
        this.metricsName = str3;
        this.period = str4;
        this.metricValue = input;
        this.expirationUnixTime = input2;
        this.createdAt = input3;
        this.updatedAt = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String entityId() {
        return this.entityId;
    }

    public Long expirationUnixTime() {
        return this.expirationUnixTime.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateRealTimeMetricsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", UpdateRealTimeMetricsInput.this.accountId);
                inputFieldWriter.writeString("metricsLevel", UpdateRealTimeMetricsInput.this.metricsLevel.name());
                inputFieldWriter.writeString("entityId", UpdateRealTimeMetricsInput.this.entityId);
                inputFieldWriter.writeString("metricsName", UpdateRealTimeMetricsInput.this.metricsName);
                inputFieldWriter.writeString("period", UpdateRealTimeMetricsInput.this.period);
                if (UpdateRealTimeMetricsInput.this.metricValue.defined) {
                    inputFieldWriter.writeDouble("metricValue", (Double) UpdateRealTimeMetricsInput.this.metricValue.value);
                }
                if (UpdateRealTimeMetricsInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeLong("expirationUnixTime", (Long) UpdateRealTimeMetricsInput.this.expirationUnixTime.value);
                }
                if (UpdateRealTimeMetricsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateRealTimeMetricsInput.this.createdAt.value);
                }
                if (UpdateRealTimeMetricsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateRealTimeMetricsInput.this.updatedAt.value);
                }
            }
        };
    }

    public Double metricValue() {
        return this.metricValue.value;
    }

    public MetricsLevel metricsLevel() {
        return this.metricsLevel;
    }

    public String metricsName() {
        return this.metricsName;
    }

    public String period() {
        return this.period;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
