package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput implements InputType {
    private final Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> beginsWith;
    private final Input<List<ModelProductPlanSubscriptionByAccountCompositeKeyInput>> between;
    private final Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> eq;
    private final Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> ge;
    private final Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> gt;
    private final Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> le;
    private final Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> eq = Input.absent();
        private Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> le = Input.absent();
        private Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> lt = Input.absent();
        private Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> ge = Input.absent();
        private Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelProductPlanSubscriptionByAccountCompositeKeyInput>> between = Input.absent();
        private Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelProductPlanSubscriptionByAccountCompositeKeyInput modelProductPlanSubscriptionByAccountCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelProductPlanSubscriptionByAccountCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelProductPlanSubscriptionByAccountCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput build() {
            return new ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelProductPlanSubscriptionByAccountCompositeKeyInput modelProductPlanSubscriptionByAccountCompositeKeyInput) {
            this.eq = Input.fromNullable(modelProductPlanSubscriptionByAccountCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelProductPlanSubscriptionByAccountCompositeKeyInput modelProductPlanSubscriptionByAccountCompositeKeyInput) {
            this.ge = Input.fromNullable(modelProductPlanSubscriptionByAccountCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelProductPlanSubscriptionByAccountCompositeKeyInput modelProductPlanSubscriptionByAccountCompositeKeyInput) {
            this.gt = Input.fromNullable(modelProductPlanSubscriptionByAccountCompositeKeyInput);
            return this;
        }

        public Builder le(ModelProductPlanSubscriptionByAccountCompositeKeyInput modelProductPlanSubscriptionByAccountCompositeKeyInput) {
            this.le = Input.fromNullable(modelProductPlanSubscriptionByAccountCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelProductPlanSubscriptionByAccountCompositeKeyInput modelProductPlanSubscriptionByAccountCompositeKeyInput) {
            this.lt = Input.fromNullable(modelProductPlanSubscriptionByAccountCompositeKeyInput);
            return this;
        }
    }

    public ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput(Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> input, Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> input2, Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> input3, Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> input4, Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> input5, Input<List<ModelProductPlanSubscriptionByAccountCompositeKeyInput>> input6, Input<ModelProductPlanSubscriptionByAccountCompositeKeyInput> input7) {
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

    public ModelProductPlanSubscriptionByAccountCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelProductPlanSubscriptionByAccountCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelProductPlanSubscriptionByAccountCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelProductPlanSubscriptionByAccountCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelProductPlanSubscriptionByAccountCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelProductPlanSubscriptionByAccountCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelProductPlanSubscriptionByAccountCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelProductPlanSubscriptionByAccountCompositeKeyInput) ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.le.value != 0 ? ((ModelProductPlanSubscriptionByAccountCompositeKeyInput) ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelProductPlanSubscriptionByAccountCompositeKeyInput) ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelProductPlanSubscriptionByAccountCompositeKeyInput) ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelProductPlanSubscriptionByAccountCompositeKeyInput) ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductPlanSubscriptionByAccountCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelProductPlanSubscriptionByAccountCompositeKeyInput) ModelProductPlanSubscriptionByAccountCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
