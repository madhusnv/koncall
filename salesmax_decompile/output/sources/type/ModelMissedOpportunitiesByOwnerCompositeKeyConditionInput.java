package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput implements InputType {
    private final Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> beginsWith;
    private final Input<List<ModelMissedOpportunitiesByOwnerCompositeKeyInput>> between;
    private final Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> eq;
    private final Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> ge;
    private final Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> gt;
    private final Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> le;
    private final Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> eq = Input.absent();
        private Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> le = Input.absent();
        private Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> lt = Input.absent();
        private Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> ge = Input.absent();
        private Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelMissedOpportunitiesByOwnerCompositeKeyInput>> between = Input.absent();
        private Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelMissedOpportunitiesByOwnerCompositeKeyInput modelMissedOpportunitiesByOwnerCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelMissedOpportunitiesByOwnerCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelMissedOpportunitiesByOwnerCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput build() {
            return new ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelMissedOpportunitiesByOwnerCompositeKeyInput modelMissedOpportunitiesByOwnerCompositeKeyInput) {
            this.eq = Input.fromNullable(modelMissedOpportunitiesByOwnerCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelMissedOpportunitiesByOwnerCompositeKeyInput modelMissedOpportunitiesByOwnerCompositeKeyInput) {
            this.ge = Input.fromNullable(modelMissedOpportunitiesByOwnerCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelMissedOpportunitiesByOwnerCompositeKeyInput modelMissedOpportunitiesByOwnerCompositeKeyInput) {
            this.gt = Input.fromNullable(modelMissedOpportunitiesByOwnerCompositeKeyInput);
            return this;
        }

        public Builder le(ModelMissedOpportunitiesByOwnerCompositeKeyInput modelMissedOpportunitiesByOwnerCompositeKeyInput) {
            this.le = Input.fromNullable(modelMissedOpportunitiesByOwnerCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelMissedOpportunitiesByOwnerCompositeKeyInput modelMissedOpportunitiesByOwnerCompositeKeyInput) {
            this.lt = Input.fromNullable(modelMissedOpportunitiesByOwnerCompositeKeyInput);
            return this;
        }
    }

    public ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput(Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> input, Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> input2, Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> input3, Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> input4, Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> input5, Input<List<ModelMissedOpportunitiesByOwnerCompositeKeyInput>> input6, Input<ModelMissedOpportunitiesByOwnerCompositeKeyInput> input7) {
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

    public ModelMissedOpportunitiesByOwnerCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelMissedOpportunitiesByOwnerCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelMissedOpportunitiesByOwnerCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelMissedOpportunitiesByOwnerCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelMissedOpportunitiesByOwnerCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelMissedOpportunitiesByOwnerCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelMissedOpportunitiesByOwnerCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelMissedOpportunitiesByOwnerCompositeKeyInput) ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.le.value != 0 ? ((ModelMissedOpportunitiesByOwnerCompositeKeyInput) ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelMissedOpportunitiesByOwnerCompositeKeyInput) ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelMissedOpportunitiesByOwnerCompositeKeyInput) ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelMissedOpportunitiesByOwnerCompositeKeyInput) ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMissedOpportunitiesByOwnerCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelMissedOpportunitiesByOwnerCompositeKeyInput) ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
