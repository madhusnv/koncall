package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelRealTimeMetricsConditionInput implements InputType {
    private final Input<List<ModelRealTimeMetricsConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIntInput> expirationUnixTime;
    private final Input<ModelFloatInput> metricValue;
    private final Input<ModelRealTimeMetricsConditionInput> not;
    private final Input<List<ModelRealTimeMetricsConditionInput>> or;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelFloatInput> metricValue = Input.absent();
        private Input<ModelIntInput> expirationUnixTime = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelRealTimeMetricsConditionInput>> and = Input.absent();
        private Input<List<ModelRealTimeMetricsConditionInput>> or = Input.absent();
        private Input<ModelRealTimeMetricsConditionInput> not = Input.absent();

        public Builder and(List<ModelRealTimeMetricsConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelRealTimeMetricsConditionInput build() {
            return new ModelRealTimeMetricsConditionInput(this.metricValue, this.expirationUnixTime, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder expirationUnixTime(ModelIntInput modelIntInput) {
            this.expirationUnixTime = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder metricValue(ModelFloatInput modelFloatInput) {
            this.metricValue = Input.fromNullable(modelFloatInput);
            return this;
        }

        public Builder not(ModelRealTimeMetricsConditionInput modelRealTimeMetricsConditionInput) {
            this.not = Input.fromNullable(modelRealTimeMetricsConditionInput);
            return this;
        }

        public Builder or(List<ModelRealTimeMetricsConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelRealTimeMetricsConditionInput(Input<ModelFloatInput> input, Input<ModelIntInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<List<ModelRealTimeMetricsConditionInput>> input5, Input<List<ModelRealTimeMetricsConditionInput>> input6, Input<ModelRealTimeMetricsConditionInput> input7) {
        this.metricValue = input;
        this.expirationUnixTime = input2;
        this.createdAt = input3;
        this.updatedAt = input4;
        this.and = input5;
        this.or = input6;
        this.not = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<ModelRealTimeMetricsConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIntInput expirationUnixTime() {
        return this.expirationUnixTime.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelRealTimeMetricsConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelRealTimeMetricsConditionInput.this.metricValue.defined) {
                    inputFieldWriter.writeObject("metricValue", ModelRealTimeMetricsConditionInput.this.metricValue.value != 0 ? ((ModelFloatInput) ModelRealTimeMetricsConditionInput.this.metricValue.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsConditionInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeObject("expirationUnixTime", ModelRealTimeMetricsConditionInput.this.expirationUnixTime.value != 0 ? ((ModelIntInput) ModelRealTimeMetricsConditionInput.this.expirationUnixTime.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelRealTimeMetricsConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelRealTimeMetricsConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelRealTimeMetricsConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelRealTimeMetricsConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelRealTimeMetricsConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelRealTimeMetricsConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelRealTimeMetricsConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelRealTimeMetricsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelRealTimeMetricsConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelRealTimeMetricsConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelRealTimeMetricsConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelRealTimeMetricsConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelRealTimeMetricsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelRealTimeMetricsConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelRealTimeMetricsConditionInput.this.not.value != 0 ? ((ModelRealTimeMetricsConditionInput) ModelRealTimeMetricsConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelFloatInput metricValue() {
        return this.metricValue.value;
    }

    public ModelRealTimeMetricsConditionInput not() {
        return this.not.value;
    }

    public List<ModelRealTimeMetricsConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
