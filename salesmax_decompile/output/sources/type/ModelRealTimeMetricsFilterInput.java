package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelRealTimeMetricsFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelRealTimeMetricsFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> entityId;
    private final Input<ModelIntInput> expirationUnixTime;
    private final Input<ModelFloatInput> metricValue;
    private final Input<ModelMetricsLevelInput> metricsLevel;
    private final Input<ModelStringInput> metricsName;
    private final Input<ModelRealTimeMetricsFilterInput> not;
    private final Input<List<ModelRealTimeMetricsFilterInput>> or;
    private final Input<ModelStringInput> period;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelMetricsLevelInput> metricsLevel = Input.absent();
        private Input<ModelIDInput> entityId = Input.absent();
        private Input<ModelStringInput> metricsName = Input.absent();
        private Input<ModelStringInput> period = Input.absent();
        private Input<ModelFloatInput> metricValue = Input.absent();
        private Input<ModelIntInput> expirationUnixTime = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelRealTimeMetricsFilterInput>> and = Input.absent();
        private Input<List<ModelRealTimeMetricsFilterInput>> or = Input.absent();
        private Input<ModelRealTimeMetricsFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelRealTimeMetricsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelRealTimeMetricsFilterInput build() {
            return new ModelRealTimeMetricsFilterInput(this.accountId, this.metricsLevel, this.entityId, this.metricsName, this.period, this.metricValue, this.expirationUnixTime, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder entityId(ModelIDInput modelIDInput) {
            this.entityId = Input.fromNullable(modelIDInput);
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

        public Builder metricsLevel(ModelMetricsLevelInput modelMetricsLevelInput) {
            this.metricsLevel = Input.fromNullable(modelMetricsLevelInput);
            return this;
        }

        public Builder metricsName(ModelStringInput modelStringInput) {
            this.metricsName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelRealTimeMetricsFilterInput modelRealTimeMetricsFilterInput) {
            this.not = Input.fromNullable(modelRealTimeMetricsFilterInput);
            return this;
        }

        public Builder or(List<ModelRealTimeMetricsFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder period(ModelStringInput modelStringInput) {
            this.period = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelRealTimeMetricsFilterInput(Input<ModelIDInput> input, Input<ModelMetricsLevelInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelFloatInput> input6, Input<ModelIntInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelRealTimeMetricsFilterInput>> input10, Input<List<ModelRealTimeMetricsFilterInput>> input11, Input<ModelRealTimeMetricsFilterInput> input12) {
        this.accountId = input;
        this.metricsLevel = input2;
        this.entityId = input3;
        this.metricsName = input4;
        this.period = input5;
        this.metricValue = input6;
        this.expirationUnixTime = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
        this.and = input10;
        this.or = input11;
        this.not = input12;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelRealTimeMetricsFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput entityId() {
        return this.entityId.value;
    }

    public ModelIntInput expirationUnixTime() {
        return this.expirationUnixTime.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelRealTimeMetricsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelRealTimeMetricsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelRealTimeMetricsFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelRealTimeMetricsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsFilterInput.this.metricsLevel.defined) {
                    inputFieldWriter.writeObject("metricsLevel", ModelRealTimeMetricsFilterInput.this.metricsLevel.value != 0 ? ((ModelMetricsLevelInput) ModelRealTimeMetricsFilterInput.this.metricsLevel.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsFilterInput.this.entityId.defined) {
                    inputFieldWriter.writeObject("entityId", ModelRealTimeMetricsFilterInput.this.entityId.value != 0 ? ((ModelIDInput) ModelRealTimeMetricsFilterInput.this.entityId.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsFilterInput.this.metricsName.defined) {
                    inputFieldWriter.writeObject("metricsName", ModelRealTimeMetricsFilterInput.this.metricsName.value != 0 ? ((ModelStringInput) ModelRealTimeMetricsFilterInput.this.metricsName.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsFilterInput.this.period.defined) {
                    inputFieldWriter.writeObject("period", ModelRealTimeMetricsFilterInput.this.period.value != 0 ? ((ModelStringInput) ModelRealTimeMetricsFilterInput.this.period.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsFilterInput.this.metricValue.defined) {
                    inputFieldWriter.writeObject("metricValue", ModelRealTimeMetricsFilterInput.this.metricValue.value != 0 ? ((ModelFloatInput) ModelRealTimeMetricsFilterInput.this.metricValue.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsFilterInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeObject("expirationUnixTime", ModelRealTimeMetricsFilterInput.this.expirationUnixTime.value != 0 ? ((ModelIntInput) ModelRealTimeMetricsFilterInput.this.expirationUnixTime.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelRealTimeMetricsFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelRealTimeMetricsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelRealTimeMetricsFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelRealTimeMetricsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelRealTimeMetricsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelRealTimeMetricsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelRealTimeMetricsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelRealTimeMetricsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelRealTimeMetricsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelRealTimeMetricsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelRealTimeMetricsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelRealTimeMetricsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelRealTimeMetricsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelRealTimeMetricsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelRealTimeMetricsFilterInput.this.not.value != 0 ? ((ModelRealTimeMetricsFilterInput) ModelRealTimeMetricsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelFloatInput metricValue() {
        return this.metricValue.value;
    }

    public ModelMetricsLevelInput metricsLevel() {
        return this.metricsLevel.value;
    }

    public ModelStringInput metricsName() {
        return this.metricsName.value;
    }

    public ModelRealTimeMetricsFilterInput not() {
        return this.not.value;
    }

    public List<ModelRealTimeMetricsFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput period() {
        return this.period.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
