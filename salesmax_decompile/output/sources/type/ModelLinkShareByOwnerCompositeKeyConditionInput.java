package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelLinkShareByOwnerCompositeKeyConditionInput implements InputType {
    private final Input<ModelLinkShareByOwnerCompositeKeyInput> beginsWith;
    private final Input<List<ModelLinkShareByOwnerCompositeKeyInput>> between;
    private final Input<ModelLinkShareByOwnerCompositeKeyInput> eq;
    private final Input<ModelLinkShareByOwnerCompositeKeyInput> ge;
    private final Input<ModelLinkShareByOwnerCompositeKeyInput> gt;
    private final Input<ModelLinkShareByOwnerCompositeKeyInput> le;
    private final Input<ModelLinkShareByOwnerCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelLinkShareByOwnerCompositeKeyInput> eq = Input.absent();
        private Input<ModelLinkShareByOwnerCompositeKeyInput> le = Input.absent();
        private Input<ModelLinkShareByOwnerCompositeKeyInput> lt = Input.absent();
        private Input<ModelLinkShareByOwnerCompositeKeyInput> ge = Input.absent();
        private Input<ModelLinkShareByOwnerCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelLinkShareByOwnerCompositeKeyInput>> between = Input.absent();
        private Input<ModelLinkShareByOwnerCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelLinkShareByOwnerCompositeKeyInput modelLinkShareByOwnerCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelLinkShareByOwnerCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelLinkShareByOwnerCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelLinkShareByOwnerCompositeKeyConditionInput build() {
            return new ModelLinkShareByOwnerCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelLinkShareByOwnerCompositeKeyInput modelLinkShareByOwnerCompositeKeyInput) {
            this.eq = Input.fromNullable(modelLinkShareByOwnerCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelLinkShareByOwnerCompositeKeyInput modelLinkShareByOwnerCompositeKeyInput) {
            this.ge = Input.fromNullable(modelLinkShareByOwnerCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelLinkShareByOwnerCompositeKeyInput modelLinkShareByOwnerCompositeKeyInput) {
            this.gt = Input.fromNullable(modelLinkShareByOwnerCompositeKeyInput);
            return this;
        }

        public Builder le(ModelLinkShareByOwnerCompositeKeyInput modelLinkShareByOwnerCompositeKeyInput) {
            this.le = Input.fromNullable(modelLinkShareByOwnerCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelLinkShareByOwnerCompositeKeyInput modelLinkShareByOwnerCompositeKeyInput) {
            this.lt = Input.fromNullable(modelLinkShareByOwnerCompositeKeyInput);
            return this;
        }
    }

    public ModelLinkShareByOwnerCompositeKeyConditionInput(Input<ModelLinkShareByOwnerCompositeKeyInput> input, Input<ModelLinkShareByOwnerCompositeKeyInput> input2, Input<ModelLinkShareByOwnerCompositeKeyInput> input3, Input<ModelLinkShareByOwnerCompositeKeyInput> input4, Input<ModelLinkShareByOwnerCompositeKeyInput> input5, Input<List<ModelLinkShareByOwnerCompositeKeyInput>> input6, Input<ModelLinkShareByOwnerCompositeKeyInput> input7) {
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

    public ModelLinkShareByOwnerCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelLinkShareByOwnerCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelLinkShareByOwnerCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelLinkShareByOwnerCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelLinkShareByOwnerCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelLinkShareByOwnerCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelLinkShareByOwnerCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelLinkShareByOwnerCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelLinkShareByOwnerCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelLinkShareByOwnerCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelLinkShareByOwnerCompositeKeyInput) ModelLinkShareByOwnerCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelLinkShareByOwnerCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelLinkShareByOwnerCompositeKeyConditionInput.this.le.value != 0 ? ((ModelLinkShareByOwnerCompositeKeyInput) ModelLinkShareByOwnerCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelLinkShareByOwnerCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelLinkShareByOwnerCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelLinkShareByOwnerCompositeKeyInput) ModelLinkShareByOwnerCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelLinkShareByOwnerCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelLinkShareByOwnerCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelLinkShareByOwnerCompositeKeyInput) ModelLinkShareByOwnerCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelLinkShareByOwnerCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelLinkShareByOwnerCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelLinkShareByOwnerCompositeKeyInput) ModelLinkShareByOwnerCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelLinkShareByOwnerCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelLinkShareByOwnerCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelLinkShareByOwnerCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelLinkShareByOwnerCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelLinkShareByOwnerCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelLinkShareByOwnerCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelLinkShareByOwnerCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelLinkShareByOwnerCompositeKeyInput) ModelLinkShareByOwnerCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
