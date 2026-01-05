package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelRealTimeMetricsPrimaryCompositeKeyConditionInput implements InputType {
    private final Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> beginsWith;
    private final Input<List<ModelRealTimeMetricsPrimaryCompositeKeyInput>> between;
    private final Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> eq;
    private final Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> ge;
    private final Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> gt;
    private final Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> le;
    private final Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> eq = Input.absent();
        private Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> le = Input.absent();
        private Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> lt = Input.absent();
        private Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> ge = Input.absent();
        private Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelRealTimeMetricsPrimaryCompositeKeyInput>> between = Input.absent();
        private Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelRealTimeMetricsPrimaryCompositeKeyInput modelRealTimeMetricsPrimaryCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelRealTimeMetricsPrimaryCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelRealTimeMetricsPrimaryCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelRealTimeMetricsPrimaryCompositeKeyConditionInput build() {
            return new ModelRealTimeMetricsPrimaryCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelRealTimeMetricsPrimaryCompositeKeyInput modelRealTimeMetricsPrimaryCompositeKeyInput) {
            this.eq = Input.fromNullable(modelRealTimeMetricsPrimaryCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelRealTimeMetricsPrimaryCompositeKeyInput modelRealTimeMetricsPrimaryCompositeKeyInput) {
            this.ge = Input.fromNullable(modelRealTimeMetricsPrimaryCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelRealTimeMetricsPrimaryCompositeKeyInput modelRealTimeMetricsPrimaryCompositeKeyInput) {
            this.gt = Input.fromNullable(modelRealTimeMetricsPrimaryCompositeKeyInput);
            return this;
        }

        public Builder le(ModelRealTimeMetricsPrimaryCompositeKeyInput modelRealTimeMetricsPrimaryCompositeKeyInput) {
            this.le = Input.fromNullable(modelRealTimeMetricsPrimaryCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelRealTimeMetricsPrimaryCompositeKeyInput modelRealTimeMetricsPrimaryCompositeKeyInput) {
            this.lt = Input.fromNullable(modelRealTimeMetricsPrimaryCompositeKeyInput);
            return this;
        }
    }

    public ModelRealTimeMetricsPrimaryCompositeKeyConditionInput(Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> input, Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> input2, Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> input3, Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> input4, Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> input5, Input<List<ModelRealTimeMetricsPrimaryCompositeKeyInput>> input6, Input<ModelRealTimeMetricsPrimaryCompositeKeyInput> input7) {
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

    public ModelRealTimeMetricsPrimaryCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelRealTimeMetricsPrimaryCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelRealTimeMetricsPrimaryCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelRealTimeMetricsPrimaryCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelRealTimeMetricsPrimaryCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelRealTimeMetricsPrimaryCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelRealTimeMetricsPrimaryCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelRealTimeMetricsPrimaryCompositeKeyInput) ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.le.value != 0 ? ((ModelRealTimeMetricsPrimaryCompositeKeyInput) ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelRealTimeMetricsPrimaryCompositeKeyInput) ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelRealTimeMetricsPrimaryCompositeKeyInput) ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelRealTimeMetricsPrimaryCompositeKeyInput) ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelRealTimeMetricsPrimaryCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelRealTimeMetricsPrimaryCompositeKeyInput) ModelRealTimeMetricsPrimaryCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
