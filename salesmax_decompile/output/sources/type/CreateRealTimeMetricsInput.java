package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class CreateRealTimeMetricsInput implements InputType {
    private final String accountId;
    private final Input<String> createdAt;
    private final String entityId;
    private final Input<Long> expirationUnixTime;
    private final double metricValue;
    private final MetricsLevel metricsLevel;
    private final String metricsName;
    private final String period;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String entityId;
        private double metricValue;
        private MetricsLevel metricsLevel;
        private String metricsName;
        private String period;
        private Input<Long> expirationUnixTime = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateRealTimeMetricsInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.metricsLevel, "metricsLevel == null");
            Utils.checkNotNull(this.entityId, "entityId == null");
            Utils.checkNotNull(this.metricsName, "metricsName == null");
            Utils.checkNotNull(this.period, "period == null");
            return new CreateRealTimeMetricsInput(this.accountId, this.metricsLevel, this.entityId, this.metricsName, this.period, this.metricValue, this.expirationUnixTime, this.createdAt, this.updatedAt);
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

        public Builder metricValue(double d) {
            this.metricValue = d;
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

    public CreateRealTimeMetricsInput(String str, MetricsLevel metricsLevel, String str2, String str3, String str4, double d, Input<Long> input, Input<String> input2, Input<String> input3) {
        this.accountId = str;
        this.metricsLevel = metricsLevel;
        this.entityId = str2;
        this.metricsName = str3;
        this.period = str4;
        this.metricValue = d;
        this.expirationUnixTime = input;
        this.createdAt = input2;
        this.updatedAt = input3;
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
        return new InputFieldMarshaller() { // from class: type.CreateRealTimeMetricsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", CreateRealTimeMetricsInput.this.accountId);
                inputFieldWriter.writeString("metricsLevel", CreateRealTimeMetricsInput.this.metricsLevel.name());
                inputFieldWriter.writeString("entityId", CreateRealTimeMetricsInput.this.entityId);
                inputFieldWriter.writeString("metricsName", CreateRealTimeMetricsInput.this.metricsName);
                inputFieldWriter.writeString("period", CreateRealTimeMetricsInput.this.period);
                inputFieldWriter.writeDouble("metricValue", Double.valueOf(CreateRealTimeMetricsInput.this.metricValue));
                if (CreateRealTimeMetricsInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeLong("expirationUnixTime", (Long) CreateRealTimeMetricsInput.this.expirationUnixTime.value);
                }
                if (CreateRealTimeMetricsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateRealTimeMetricsInput.this.createdAt.value);
                }
                if (CreateRealTimeMetricsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateRealTimeMetricsInput.this.updatedAt.value);
                }
            }
        };
    }

    public double metricValue() {
        return this.metricValue;
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
