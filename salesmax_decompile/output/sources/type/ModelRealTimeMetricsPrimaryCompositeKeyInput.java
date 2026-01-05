package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelRealTimeMetricsPrimaryCompositeKeyInput implements InputType {
    private final Input<String> entityId;
    private final Input<MetricsLevel> metricsLevel;
    private final Input<String> metricsName;
    private final Input<String> period;

    public static final class Builder {
        private Input<String> entityId = Input.absent();
        private Input<MetricsLevel> metricsLevel = Input.absent();
        private Input<String> period = Input.absent();
        private Input<String> metricsName = Input.absent();

        public ModelRealTimeMetricsPrimaryCompositeKeyInput build() {
            return new ModelRealTimeMetricsPrimaryCompositeKeyInput(this.entityId, this.metricsLevel, this.period, this.metricsName);
        }

        public Builder entityId(String str) {
            this.entityId = Input.fromNullable(str);
            return this;
        }

        public Builder metricsLevel(MetricsLevel metricsLevel) {
            this.metricsLevel = Input.fromNullable(metricsLevel);
            return this;
        }

        public Builder metricsName(String str) {
            this.metricsName = Input.fromNullable(str);
            return this;
        }

        public Builder period(String str) {
            this.period = Input.fromNullable(str);
            return this;
        }
    }

    public ModelRealTimeMetricsPrimaryCompositeKeyInput(Input<String> input, Input<MetricsLevel> input2, Input<String> input3, Input<String> input4) {
        this.entityId = input;
        this.metricsLevel = input2;
        this.period = input3;
        this.metricsName = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String entityId() {
        return this.entityId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelRealTimeMetricsPrimaryCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelRealTimeMetricsPrimaryCompositeKeyInput.this.entityId.defined) {
                    inputFieldWriter.writeString("entityId", (String) ModelRealTimeMetricsPrimaryCompositeKeyInput.this.entityId.value);
                }
                if (ModelRealTimeMetricsPrimaryCompositeKeyInput.this.metricsLevel.defined) {
                    inputFieldWriter.writeString("metricsLevel", ModelRealTimeMetricsPrimaryCompositeKeyInput.this.metricsLevel.value != 0 ? ((MetricsLevel) ModelRealTimeMetricsPrimaryCompositeKeyInput.this.metricsLevel.value).name() : null);
                }
                if (ModelRealTimeMetricsPrimaryCompositeKeyInput.this.period.defined) {
                    inputFieldWriter.writeString("period", (String) ModelRealTimeMetricsPrimaryCompositeKeyInput.this.period.value);
                }
                if (ModelRealTimeMetricsPrimaryCompositeKeyInput.this.metricsName.defined) {
                    inputFieldWriter.writeString("metricsName", (String) ModelRealTimeMetricsPrimaryCompositeKeyInput.this.metricsName.value);
                }
            }
        };
    }

    public MetricsLevel metricsLevel() {
        return this.metricsLevel.value;
    }

    public String metricsName() {
        return this.metricsName.value;
    }

    public String period() {
        return this.period.value;
    }
}
