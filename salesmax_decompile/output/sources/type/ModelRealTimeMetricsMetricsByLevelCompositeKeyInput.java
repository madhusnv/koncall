package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelRealTimeMetricsMetricsByLevelCompositeKeyInput implements InputType {
    private final Input<MetricsLevel> metricsLevel;
    private final Input<String> period;

    public static final class Builder {
        private Input<MetricsLevel> metricsLevel = Input.absent();
        private Input<String> period = Input.absent();

        public ModelRealTimeMetricsMetricsByLevelCompositeKeyInput build() {
            return new ModelRealTimeMetricsMetricsByLevelCompositeKeyInput(this.metricsLevel, this.period);
        }

        public Builder metricsLevel(MetricsLevel metricsLevel) {
            this.metricsLevel = Input.fromNullable(metricsLevel);
            return this;
        }

        public Builder period(String str) {
            this.period = Input.fromNullable(str);
            return this;
        }
    }

    public ModelRealTimeMetricsMetricsByLevelCompositeKeyInput(Input<MetricsLevel> input, Input<String> input2) {
        this.metricsLevel = input;
        this.period = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelRealTimeMetricsMetricsByLevelCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelRealTimeMetricsMetricsByLevelCompositeKeyInput.this.metricsLevel.defined) {
                    inputFieldWriter.writeString("metricsLevel", ModelRealTimeMetricsMetricsByLevelCompositeKeyInput.this.metricsLevel.value != 0 ? ((MetricsLevel) ModelRealTimeMetricsMetricsByLevelCompositeKeyInput.this.metricsLevel.value).name() : null);
                }
                if (ModelRealTimeMetricsMetricsByLevelCompositeKeyInput.this.period.defined) {
                    inputFieldWriter.writeString("period", (String) ModelRealTimeMetricsMetricsByLevelCompositeKeyInput.this.period.value);
                }
            }
        };
    }

    public MetricsLevel metricsLevel() {
        return this.metricsLevel.value;
    }

    public String period() {
        return this.period.value;
    }
}
