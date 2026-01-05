package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelEntityListMembershipByContactIdCompositeKeyConditionInput implements InputType {
    private final Input<ModelEntityListMembershipByContactIdCompositeKeyInput> beginsWith;
    private final Input<List<ModelEntityListMembershipByContactIdCompositeKeyInput>> between;
    private final Input<ModelEntityListMembershipByContactIdCompositeKeyInput> eq;
    private final Input<ModelEntityListMembershipByContactIdCompositeKeyInput> ge;
    private final Input<ModelEntityListMembershipByContactIdCompositeKeyInput> gt;
    private final Input<ModelEntityListMembershipByContactIdCompositeKeyInput> le;
    private final Input<ModelEntityListMembershipByContactIdCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelEntityListMembershipByContactIdCompositeKeyInput> eq = Input.absent();
        private Input<ModelEntityListMembershipByContactIdCompositeKeyInput> le = Input.absent();
        private Input<ModelEntityListMembershipByContactIdCompositeKeyInput> lt = Input.absent();
        private Input<ModelEntityListMembershipByContactIdCompositeKeyInput> ge = Input.absent();
        private Input<ModelEntityListMembershipByContactIdCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelEntityListMembershipByContactIdCompositeKeyInput>> between = Input.absent();
        private Input<ModelEntityListMembershipByContactIdCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelEntityListMembershipByContactIdCompositeKeyInput modelEntityListMembershipByContactIdCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelEntityListMembershipByContactIdCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelEntityListMembershipByContactIdCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelEntityListMembershipByContactIdCompositeKeyConditionInput build() {
            return new ModelEntityListMembershipByContactIdCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelEntityListMembershipByContactIdCompositeKeyInput modelEntityListMembershipByContactIdCompositeKeyInput) {
            this.eq = Input.fromNullable(modelEntityListMembershipByContactIdCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelEntityListMembershipByContactIdCompositeKeyInput modelEntityListMembershipByContactIdCompositeKeyInput) {
            this.ge = Input.fromNullable(modelEntityListMembershipByContactIdCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelEntityListMembershipByContactIdCompositeKeyInput modelEntityListMembershipByContactIdCompositeKeyInput) {
            this.gt = Input.fromNullable(modelEntityListMembershipByContactIdCompositeKeyInput);
            return this;
        }

        public Builder le(ModelEntityListMembershipByContactIdCompositeKeyInput modelEntityListMembershipByContactIdCompositeKeyInput) {
            this.le = Input.fromNullable(modelEntityListMembershipByContactIdCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelEntityListMembershipByContactIdCompositeKeyInput modelEntityListMembershipByContactIdCompositeKeyInput) {
            this.lt = Input.fromNullable(modelEntityListMembershipByContactIdCompositeKeyInput);
            return this;
        }
    }

    public ModelEntityListMembershipByContactIdCompositeKeyConditionInput(Input<ModelEntityListMembershipByContactIdCompositeKeyInput> input, Input<ModelEntityListMembershipByContactIdCompositeKeyInput> input2, Input<ModelEntityListMembershipByContactIdCompositeKeyInput> input3, Input<ModelEntityListMembershipByContactIdCompositeKeyInput> input4, Input<ModelEntityListMembershipByContactIdCompositeKeyInput> input5, Input<List<ModelEntityListMembershipByContactIdCompositeKeyInput>> input6, Input<ModelEntityListMembershipByContactIdCompositeKeyInput> input7) {
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

    public ModelEntityListMembershipByContactIdCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelEntityListMembershipByContactIdCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelEntityListMembershipByContactIdCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelEntityListMembershipByContactIdCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelEntityListMembershipByContactIdCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelEntityListMembershipByContactIdCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelEntityListMembershipByContactIdCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEntityListMembershipByContactIdCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelEntityListMembershipByContactIdCompositeKeyInput) ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.le.value != 0 ? ((ModelEntityListMembershipByContactIdCompositeKeyInput) ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelEntityListMembershipByContactIdCompositeKeyInput) ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelEntityListMembershipByContactIdCompositeKeyInput) ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelEntityListMembershipByContactIdCompositeKeyInput) ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEntityListMembershipByContactIdCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEntityListMembershipByContactIdCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelEntityListMembershipByContactIdCompositeKeyInput) ModelEntityListMembershipByContactIdCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
