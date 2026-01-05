package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class DeleteRealTimeMetricsInput implements InputType {
    private final String accountId;
    private final String entityId;
    private final MetricsLevel metricsLevel;
    private final String metricsName;
    private final String period;

    public static final class Builder {
        private String accountId;
        private String entityId;
        private MetricsLevel metricsLevel;
        private String metricsName;
        private String period;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public DeleteRealTimeMetricsInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.entityId, "entityId == null");
            Utils.checkNotNull(this.metricsLevel, "metricsLevel == null");
            Utils.checkNotNull(this.period, "period == null");
            Utils.checkNotNull(this.metricsName, "metricsName == null");
            return new DeleteRealTimeMetricsInput(this.accountId, this.entityId, this.metricsLevel, this.period, this.metricsName);
        }

        public Builder entityId(String str) {
            this.entityId = str;
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
    }

    public DeleteRealTimeMetricsInput(String str, String str2, MetricsLevel metricsLevel, String str3, String str4) {
        this.accountId = str;
        this.entityId = str2;
        this.metricsLevel = metricsLevel;
        this.period = str3;
        this.metricsName = str4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String entityId() {
        return this.entityId;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DeleteRealTimeMetricsInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", DeleteRealTimeMetricsInput.this.accountId);
                inputFieldWriter.writeString("entityId", DeleteRealTimeMetricsInput.this.entityId);
                inputFieldWriter.writeString("metricsLevel", DeleteRealTimeMetricsInput.this.metricsLevel.name());
                inputFieldWriter.writeString("period", DeleteRealTimeMetricsInput.this.period);
                inputFieldWriter.writeString("metricsName", DeleteRealTimeMetricsInput.this.metricsName);
            }
        };
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
}
