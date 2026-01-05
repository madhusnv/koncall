package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput implements InputType {
    private final Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> beginsWith;
    private final Input<List<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput>> between;
    private final Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> eq;
    private final Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> ge;
    private final Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> gt;
    private final Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> le;
    private final Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> eq = Input.absent();
        private Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> le = Input.absent();
        private Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> lt = Input.absent();
        private Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> ge = Input.absent();
        private Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput>> between = Input.absent();
        private Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelRealTimeMetricsMetricsByLevelCompositeKeyInput modelRealTimeMetricsMetricsByLevelCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelRealTimeMetricsMetricsByLevelCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput build() {
            return new ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelRealTimeMetricsMetricsByLevelCompositeKeyInput modelRealTimeMetricsMetricsByLevelCompositeKeyInput) {
            this.eq = Input.fromNullable(modelRealTimeMetricsMetricsByLevelCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelRealTimeMetricsMetricsByLevelCompositeKeyInput modelRealTimeMetricsMetricsByLevelCompositeKeyInput) {
            this.ge = Input.fromNullable(modelRealTimeMetricsMetricsByLevelCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelRealTimeMetricsMetricsByLevelCompositeKeyInput modelRealTimeMetricsMetricsByLevelCompositeKeyInput) {
            this.gt = Input.fromNullable(modelRealTimeMetricsMetricsByLevelCompositeKeyInput);
            return this;
        }

        public Builder le(ModelRealTimeMetricsMetricsByLevelCompositeKeyInput modelRealTimeMetricsMetricsByLevelCompositeKeyInput) {
            this.le = Input.fromNullable(modelRealTimeMetricsMetricsByLevelCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelRealTimeMetricsMetricsByLevelCompositeKeyInput modelRealTimeMetricsMetricsByLevelCompositeKeyInput) {
            this.lt = Input.fromNullable(modelRealTimeMetricsMetricsByLevelCompositeKeyInput);
            return this;
        }
    }

    public ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput(Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> input, Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> input2, Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> input3, Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> input4, Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> input5, Input<List<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput>> input6, Input<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> input7) {
        this.eq = input;
        this.le = input2;
        this.lt = input3;
        this.ge = input4;
        this.gt = input5;
        this.between = input6;
        this.beginsWith = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelRealTimeMetricsMetricsByLevelCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelRealTimeMetricsMetricsByLevelCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelRealTimeMetricsMetricsByLevelCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelRealTimeMetricsMetricsByLevelCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelRealTimeMetricsMetricsByLevelCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelRealTimeMetricsMetricsByLevelCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelRealTimeMetricsMetricsByLevelCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelRealTimeMetricsMetricsByLevelCompositeKeyInput) ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.le.value != 0 ? ((ModelRealTimeMetricsMetricsByLevelCompositeKeyInput) ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelRealTimeMetricsMetricsByLevelCompositeKeyInput) ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelRealTimeMetricsMetricsByLevelCompositeKeyInput) ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelRealTimeMetricsMetricsByLevelCompositeKeyInput) ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelRealTimeMetricsMetricsByLevelCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelRealTimeMetricsMetricsByLevelCompositeKeyInput) ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
