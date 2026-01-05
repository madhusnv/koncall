package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelProductAccountBillsByAccountCompositeKeyConditionInput implements InputType {
    private final Input<ModelProductAccountBillsByAccountCompositeKeyInput> beginsWith;
    private final Input<List<ModelProductAccountBillsByAccountCompositeKeyInput>> between;
    private final Input<ModelProductAccountBillsByAccountCompositeKeyInput> eq;
    private final Input<ModelProductAccountBillsByAccountCompositeKeyInput> ge;
    private final Input<ModelProductAccountBillsByAccountCompositeKeyInput> gt;
    private final Input<ModelProductAccountBillsByAccountCompositeKeyInput> le;
    private final Input<ModelProductAccountBillsByAccountCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelProductAccountBillsByAccountCompositeKeyInput> eq = Input.absent();
        private Input<ModelProductAccountBillsByAccountCompositeKeyInput> le = Input.absent();
        private Input<ModelProductAccountBillsByAccountCompositeKeyInput> lt = Input.absent();
        private Input<ModelProductAccountBillsByAccountCompositeKeyInput> ge = Input.absent();
        private Input<ModelProductAccountBillsByAccountCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelProductAccountBillsByAccountCompositeKeyInput>> between = Input.absent();
        private Input<ModelProductAccountBillsByAccountCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelProductAccountBillsByAccountCompositeKeyInput modelProductAccountBillsByAccountCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelProductAccountBillsByAccountCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelProductAccountBillsByAccountCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelProductAccountBillsByAccountCompositeKeyConditionInput build() {
            return new ModelProductAccountBillsByAccountCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelProductAccountBillsByAccountCompositeKeyInput modelProductAccountBillsByAccountCompositeKeyInput) {
            this.eq = Input.fromNullable(modelProductAccountBillsByAccountCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelProductAccountBillsByAccountCompositeKeyInput modelProductAccountBillsByAccountCompositeKeyInput) {
            this.ge = Input.fromNullable(modelProductAccountBillsByAccountCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelProductAccountBillsByAccountCompositeKeyInput modelProductAccountBillsByAccountCompositeKeyInput) {
            this.gt = Input.fromNullable(modelProductAccountBillsByAccountCompositeKeyInput);
            return this;
        }

        public Builder le(ModelProductAccountBillsByAccountCompositeKeyInput modelProductAccountBillsByAccountCompositeKeyInput) {
            this.le = Input.fromNullable(modelProductAccountBillsByAccountCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelProductAccountBillsByAccountCompositeKeyInput modelProductAccountBillsByAccountCompositeKeyInput) {
            this.lt = Input.fromNullable(modelProductAccountBillsByAccountCompositeKeyInput);
            return this;
        }
    }

    public ModelProductAccountBillsByAccountCompositeKeyConditionInput(Input<ModelProductAccountBillsByAccountCompositeKeyInput> input, Input<ModelProductAccountBillsByAccountCompositeKeyInput> input2, Input<ModelProductAccountBillsByAccountCompositeKeyInput> input3, Input<ModelProductAccountBillsByAccountCompositeKeyInput> input4, Input<ModelProductAccountBillsByAccountCompositeKeyInput> input5, Input<List<ModelProductAccountBillsByAccountCompositeKeyInput>> input6, Input<ModelProductAccountBillsByAccountCompositeKeyInput> input7) {
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

    public ModelProductAccountBillsByAccountCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelProductAccountBillsByAccountCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelProductAccountBillsByAccountCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelProductAccountBillsByAccountCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelProductAccountBillsByAccountCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelProductAccountBillsByAccountCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelProductAccountBillsByAccountCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductAccountBillsByAccountCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelProductAccountBillsByAccountCompositeKeyInput) ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.le.value != 0 ? ((ModelProductAccountBillsByAccountCompositeKeyInput) ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelProductAccountBillsByAccountCompositeKeyInput) ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelProductAccountBillsByAccountCompositeKeyInput) ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelProductAccountBillsByAccountCompositeKeyInput) ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductAccountBillsByAccountCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductAccountBillsByAccountCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelProductAccountBillsByAccountCompositeKeyInput) ModelProductAccountBillsByAccountCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
