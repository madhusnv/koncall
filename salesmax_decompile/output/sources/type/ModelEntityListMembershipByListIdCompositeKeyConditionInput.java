package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelEntityListMembershipByListIdCompositeKeyConditionInput implements InputType {
    private final Input<ModelEntityListMembershipByListIdCompositeKeyInput> beginsWith;
    private final Input<List<ModelEntityListMembershipByListIdCompositeKeyInput>> between;
    private final Input<ModelEntityListMembershipByListIdCompositeKeyInput> eq;
    private final Input<ModelEntityListMembershipByListIdCompositeKeyInput> ge;
    private final Input<ModelEntityListMembershipByListIdCompositeKeyInput> gt;
    private final Input<ModelEntityListMembershipByListIdCompositeKeyInput> le;
    private final Input<ModelEntityListMembershipByListIdCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelEntityListMembershipByListIdCompositeKeyInput> eq = Input.absent();
        private Input<ModelEntityListMembershipByListIdCompositeKeyInput> le = Input.absent();
        private Input<ModelEntityListMembershipByListIdCompositeKeyInput> lt = Input.absent();
        private Input<ModelEntityListMembershipByListIdCompositeKeyInput> ge = Input.absent();
        private Input<ModelEntityListMembershipByListIdCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelEntityListMembershipByListIdCompositeKeyInput>> between = Input.absent();
        private Input<ModelEntityListMembershipByListIdCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelEntityListMembershipByListIdCompositeKeyInput modelEntityListMembershipByListIdCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelEntityListMembershipByListIdCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelEntityListMembershipByListIdCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelEntityListMembershipByListIdCompositeKeyConditionInput build() {
            return new ModelEntityListMembershipByListIdCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelEntityListMembershipByListIdCompositeKeyInput modelEntityListMembershipByListIdCompositeKeyInput) {
            this.eq = Input.fromNullable(modelEntityListMembershipByListIdCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelEntityListMembershipByListIdCompositeKeyInput modelEntityListMembershipByListIdCompositeKeyInput) {
            this.ge = Input.fromNullable(modelEntityListMembershipByListIdCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelEntityListMembershipByListIdCompositeKeyInput modelEntityListMembershipByListIdCompositeKeyInput) {
            this.gt = Input.fromNullable(modelEntityListMembershipByListIdCompositeKeyInput);
            return this;
        }

        public Builder le(ModelEntityListMembershipByListIdCompositeKeyInput modelEntityListMembershipByListIdCompositeKeyInput) {
            this.le = Input.fromNullable(modelEntityListMembershipByListIdCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelEntityListMembershipByListIdCompositeKeyInput modelEntityListMembershipByListIdCompositeKeyInput) {
            this.lt = Input.fromNullable(modelEntityListMembershipByListIdCompositeKeyInput);
            return this;
        }
    }

    public ModelEntityListMembershipByListIdCompositeKeyConditionInput(Input<ModelEntityListMembershipByListIdCompositeKeyInput> input, Input<ModelEntityListMembershipByListIdCompositeKeyInput> input2, Input<ModelEntityListMembershipByListIdCompositeKeyInput> input3, Input<ModelEntityListMembershipByListIdCompositeKeyInput> input4, Input<ModelEntityListMembershipByListIdCompositeKeyInput> input5, Input<List<ModelEntityListMembershipByListIdCompositeKeyInput>> input6, Input<ModelEntityListMembershipByListIdCompositeKeyInput> input7) {
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

    public ModelEntityListMembershipByListIdCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelEntityListMembershipByListIdCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelEntityListMembershipByListIdCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelEntityListMembershipByListIdCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelEntityListMembershipByListIdCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelEntityListMembershipByListIdCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelEntityListMembershipByListIdCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityListMembershipByListIdCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelEntityListMembershipByListIdCompositeKeyInput) ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.le.value != 0 ? ((ModelEntityListMembershipByListIdCompositeKeyInput) ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelEntityListMembershipByListIdCompositeKeyInput) ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelEntityListMembershipByListIdCompositeKeyInput) ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelEntityListMembershipByListIdCompositeKeyInput) ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityListMembershipByListIdCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityListMembershipByListIdCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelEntityListMembershipByListIdCompositeKeyInput) ModelEntityListMembershipByListIdCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
