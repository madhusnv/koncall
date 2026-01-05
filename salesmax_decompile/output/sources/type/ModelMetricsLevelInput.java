package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelMetricsLevelInput implements InputType {
    private final Input<MetricsLevel> eq;
    private final Input<MetricsLevel> ne;

    public static final class Builder {
        private Input<MetricsLevel> eq = Input.absent();
        private Input<MetricsLevel> ne = Input.absent();

        public ModelMetricsLevelInput build() {
            return new ModelMetricsLevelInput(this.eq, this.ne);
        }

        public Builder eq(MetricsLevel metricsLevel) {
            this.eq = Input.fromNullable(metricsLevel);
            return this;
        }

        public Builder ne(MetricsLevel metricsLevel) {
            this.ne = Input.fromNullable(metricsLevel);
            return this;
        }
    }

    public ModelMetricsLevelInput(Input<MetricsLevel> input, Input<MetricsLevel> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public MetricsLevel eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMetricsLevelInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMetricsLevelInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelMetricsLevelInput.this.eq.value != 0 ? ((MetricsLevel) ModelMetricsLevelInput.this.eq.value).name() : null);
                }
                if (ModelMetricsLevelInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelMetricsLevelInput.this.ne.value != 0 ? ((MetricsLevel) ModelMetricsLevelInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public MetricsLevel ne() {
        return this.ne.value;
    }
}
