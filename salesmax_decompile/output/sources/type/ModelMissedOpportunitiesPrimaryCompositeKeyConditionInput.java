package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput implements InputType {
    private final Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> beginsWith;
    private final Input<List<ModelMissedOpportunitiesPrimaryCompositeKeyInput>> between;
    private final Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> eq;
    private final Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> ge;
    private final Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> gt;
    private final Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> le;
    private final Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> eq = Input.absent();
        private Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> le = Input.absent();
        private Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> lt = Input.absent();
        private Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> ge = Input.absent();
        private Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelMissedOpportunitiesPrimaryCompositeKeyInput>> between = Input.absent();
        private Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelMissedOpportunitiesPrimaryCompositeKeyInput modelMissedOpportunitiesPrimaryCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelMissedOpportunitiesPrimaryCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelMissedOpportunitiesPrimaryCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput build() {
            return new ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelMissedOpportunitiesPrimaryCompositeKeyInput modelMissedOpportunitiesPrimaryCompositeKeyInput) {
            this.eq = Input.fromNullable(modelMissedOpportunitiesPrimaryCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelMissedOpportunitiesPrimaryCompositeKeyInput modelMissedOpportunitiesPrimaryCompositeKeyInput) {
            this.ge = Input.fromNullable(modelMissedOpportunitiesPrimaryCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelMissedOpportunitiesPrimaryCompositeKeyInput modelMissedOpportunitiesPrimaryCompositeKeyInput) {
            this.gt = Input.fromNullable(modelMissedOpportunitiesPrimaryCompositeKeyInput);
            return this;
        }

        public Builder le(ModelMissedOpportunitiesPrimaryCompositeKeyInput modelMissedOpportunitiesPrimaryCompositeKeyInput) {
            this.le = Input.fromNullable(modelMissedOpportunitiesPrimaryCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelMissedOpportunitiesPrimaryCompositeKeyInput modelMissedOpportunitiesPrimaryCompositeKeyInput) {
            this.lt = Input.fromNullable(modelMissedOpportunitiesPrimaryCompositeKeyInput);
            return this;
        }
    }

    public ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput(Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> input, Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> input2, Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> input3, Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> input4, Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> input5, Input<List<ModelMissedOpportunitiesPrimaryCompositeKeyInput>> input6, Input<ModelMissedOpportunitiesPrimaryCompositeKeyInput> input7) {
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

    public ModelMissedOpportunitiesPrimaryCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelMissedOpportunitiesPrimaryCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelMissedOpportunitiesPrimaryCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelMissedOpportunitiesPrimaryCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelMissedOpportunitiesPrimaryCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelMissedOpportunitiesPrimaryCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelMissedOpportunitiesPrimaryCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelMissedOpportunitiesPrimaryCompositeKeyInput) ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.le.value != 0 ? ((ModelMissedOpportunitiesPrimaryCompositeKeyInput) ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelMissedOpportunitiesPrimaryCompositeKeyInput) ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelMissedOpportunitiesPrimaryCompositeKeyInput) ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelMissedOpportunitiesPrimaryCompositeKeyInput) ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMissedOpportunitiesPrimaryCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelMissedOpportunitiesPrimaryCompositeKeyInput) ModelMissedOpportunitiesPrimaryCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
