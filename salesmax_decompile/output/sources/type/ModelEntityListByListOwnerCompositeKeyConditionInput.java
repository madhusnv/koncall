package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelEntityListByListOwnerCompositeKeyConditionInput implements InputType {
    private final Input<ModelEntityListByListOwnerCompositeKeyInput> beginsWith;
    private final Input<List<ModelEntityListByListOwnerCompositeKeyInput>> between;
    private final Input<ModelEntityListByListOwnerCompositeKeyInput> eq;
    private final Input<ModelEntityListByListOwnerCompositeKeyInput> ge;
    private final Input<ModelEntityListByListOwnerCompositeKeyInput> gt;
    private final Input<ModelEntityListByListOwnerCompositeKeyInput> le;
    private final Input<ModelEntityListByListOwnerCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelEntityListByListOwnerCompositeKeyInput> eq = Input.absent();
        private Input<ModelEntityListByListOwnerCompositeKeyInput> le = Input.absent();
        private Input<ModelEntityListByListOwnerCompositeKeyInput> lt = Input.absent();
        private Input<ModelEntityListByListOwnerCompositeKeyInput> ge = Input.absent();
        private Input<ModelEntityListByListOwnerCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelEntityListByListOwnerCompositeKeyInput>> between = Input.absent();
        private Input<ModelEntityListByListOwnerCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelEntityListByListOwnerCompositeKeyInput modelEntityListByListOwnerCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelEntityListByListOwnerCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelEntityListByListOwnerCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelEntityListByListOwnerCompositeKeyConditionInput build() {
            return new ModelEntityListByListOwnerCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelEntityListByListOwnerCompositeKeyInput modelEntityListByListOwnerCompositeKeyInput) {
            this.eq = Input.fromNullable(modelEntityListByListOwnerCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelEntityListByListOwnerCompositeKeyInput modelEntityListByListOwnerCompositeKeyInput) {
            this.ge = Input.fromNullable(modelEntityListByListOwnerCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelEntityListByListOwnerCompositeKeyInput modelEntityListByListOwnerCompositeKeyInput) {
            this.gt = Input.fromNullable(modelEntityListByListOwnerCompositeKeyInput);
            return this;
        }

        public Builder le(ModelEntityListByListOwnerCompositeKeyInput modelEntityListByListOwnerCompositeKeyInput) {
            this.le = Input.fromNullable(modelEntityListByListOwnerCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelEntityListByListOwnerCompositeKeyInput modelEntityListByListOwnerCompositeKeyInput) {
            this.lt = Input.fromNullable(modelEntityListByListOwnerCompositeKeyInput);
            return this;
        }
    }

    public ModelEntityListByListOwnerCompositeKeyConditionInput(Input<ModelEntityListByListOwnerCompositeKeyInput> input, Input<ModelEntityListByListOwnerCompositeKeyInput> input2, Input<ModelEntityListByListOwnerCompositeKeyInput> input3, Input<ModelEntityListByListOwnerCompositeKeyInput> input4, Input<ModelEntityListByListOwnerCompositeKeyInput> input5, Input<List<ModelEntityListByListOwnerCompositeKeyInput>> input6, Input<ModelEntityListByListOwnerCompositeKeyInput> input7) {
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

    public ModelEntityListByListOwnerCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelEntityListByListOwnerCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelEntityListByListOwnerCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelEntityListByListOwnerCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelEntityListByListOwnerCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelEntityListByListOwnerCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelEntityListByListOwnerCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityListByListOwnerCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityListByListOwnerCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelEntityListByListOwnerCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelEntityListByListOwnerCompositeKeyInput) ModelEntityListByListOwnerCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelEntityListByListOwnerCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelEntityListByListOwnerCompositeKeyConditionInput.this.le.value != 0 ? ((ModelEntityListByListOwnerCompositeKeyInput) ModelEntityListByListOwnerCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelEntityListByListOwnerCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelEntityListByListOwnerCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelEntityListByListOwnerCompositeKeyInput) ModelEntityListByListOwnerCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelEntityListByListOwnerCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelEntityListByListOwnerCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelEntityListByListOwnerCompositeKeyInput) ModelEntityListByListOwnerCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelEntityListByListOwnerCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelEntityListByListOwnerCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelEntityListByListOwnerCompositeKeyInput) ModelEntityListByListOwnerCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelEntityListByListOwnerCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelEntityListByListOwnerCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityListByListOwnerCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityListByListOwnerCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityListByListOwnerCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityListByListOwnerCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelEntityListByListOwnerCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelEntityListByListOwnerCompositeKeyInput) ModelEntityListByListOwnerCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
