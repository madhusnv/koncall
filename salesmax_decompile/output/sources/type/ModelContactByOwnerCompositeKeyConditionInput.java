package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelContactByOwnerCompositeKeyConditionInput implements InputType {
    private final Input<ModelContactByOwnerCompositeKeyInput> beginsWith;
    private final Input<List<ModelContactByOwnerCompositeKeyInput>> between;
    private final Input<ModelContactByOwnerCompositeKeyInput> eq;
    private final Input<ModelContactByOwnerCompositeKeyInput> ge;
    private final Input<ModelContactByOwnerCompositeKeyInput> gt;
    private final Input<ModelContactByOwnerCompositeKeyInput> le;
    private final Input<ModelContactByOwnerCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelContactByOwnerCompositeKeyInput> eq = Input.absent();
        private Input<ModelContactByOwnerCompositeKeyInput> le = Input.absent();
        private Input<ModelContactByOwnerCompositeKeyInput> lt = Input.absent();
        private Input<ModelContactByOwnerCompositeKeyInput> ge = Input.absent();
        private Input<ModelContactByOwnerCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelContactByOwnerCompositeKeyInput>> between = Input.absent();
        private Input<ModelContactByOwnerCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelContactByOwnerCompositeKeyInput modelContactByOwnerCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelContactByOwnerCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelContactByOwnerCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelContactByOwnerCompositeKeyConditionInput build() {
            return new ModelContactByOwnerCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelContactByOwnerCompositeKeyInput modelContactByOwnerCompositeKeyInput) {
            this.eq = Input.fromNullable(modelContactByOwnerCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelContactByOwnerCompositeKeyInput modelContactByOwnerCompositeKeyInput) {
            this.ge = Input.fromNullable(modelContactByOwnerCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelContactByOwnerCompositeKeyInput modelContactByOwnerCompositeKeyInput) {
            this.gt = Input.fromNullable(modelContactByOwnerCompositeKeyInput);
            return this;
        }

        public Builder le(ModelContactByOwnerCompositeKeyInput modelContactByOwnerCompositeKeyInput) {
            this.le = Input.fromNullable(modelContactByOwnerCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelContactByOwnerCompositeKeyInput modelContactByOwnerCompositeKeyInput) {
            this.lt = Input.fromNullable(modelContactByOwnerCompositeKeyInput);
            return this;
        }
    }

    public ModelContactByOwnerCompositeKeyConditionInput(Input<ModelContactByOwnerCompositeKeyInput> input, Input<ModelContactByOwnerCompositeKeyInput> input2, Input<ModelContactByOwnerCompositeKeyInput> input3, Input<ModelContactByOwnerCompositeKeyInput> input4, Input<ModelContactByOwnerCompositeKeyInput> input5, Input<List<ModelContactByOwnerCompositeKeyInput>> input6, Input<ModelContactByOwnerCompositeKeyInput> input7) {
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

    public ModelContactByOwnerCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelContactByOwnerCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelContactByOwnerCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelContactByOwnerCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelContactByOwnerCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelContactByOwnerCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelContactByOwnerCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelContactByOwnerCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelContactByOwnerCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelContactByOwnerCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelContactByOwnerCompositeKeyInput) ModelContactByOwnerCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelContactByOwnerCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelContactByOwnerCompositeKeyConditionInput.this.le.value != 0 ? ((ModelContactByOwnerCompositeKeyInput) ModelContactByOwnerCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelContactByOwnerCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelContactByOwnerCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelContactByOwnerCompositeKeyInput) ModelContactByOwnerCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelContactByOwnerCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelContactByOwnerCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelContactByOwnerCompositeKeyInput) ModelContactByOwnerCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelContactByOwnerCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelContactByOwnerCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelContactByOwnerCompositeKeyInput) ModelContactByOwnerCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelContactByOwnerCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelContactByOwnerCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactByOwnerCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactByOwnerCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactByOwnerCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactByOwnerCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelContactByOwnerCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelContactByOwnerCompositeKeyInput) ModelContactByOwnerCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
