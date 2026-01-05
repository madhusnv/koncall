package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelSavedTableViewsPrimaryCompositeKeyConditionInput implements InputType {
    private final Input<ModelSavedTableViewsPrimaryCompositeKeyInput> beginsWith;
    private final Input<List<ModelSavedTableViewsPrimaryCompositeKeyInput>> between;
    private final Input<ModelSavedTableViewsPrimaryCompositeKeyInput> eq;
    private final Input<ModelSavedTableViewsPrimaryCompositeKeyInput> ge;
    private final Input<ModelSavedTableViewsPrimaryCompositeKeyInput> gt;
    private final Input<ModelSavedTableViewsPrimaryCompositeKeyInput> le;
    private final Input<ModelSavedTableViewsPrimaryCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelSavedTableViewsPrimaryCompositeKeyInput> eq = Input.absent();
        private Input<ModelSavedTableViewsPrimaryCompositeKeyInput> le = Input.absent();
        private Input<ModelSavedTableViewsPrimaryCompositeKeyInput> lt = Input.absent();
        private Input<ModelSavedTableViewsPrimaryCompositeKeyInput> ge = Input.absent();
        private Input<ModelSavedTableViewsPrimaryCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelSavedTableViewsPrimaryCompositeKeyInput>> between = Input.absent();
        private Input<ModelSavedTableViewsPrimaryCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelSavedTableViewsPrimaryCompositeKeyInput modelSavedTableViewsPrimaryCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelSavedTableViewsPrimaryCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelSavedTableViewsPrimaryCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelSavedTableViewsPrimaryCompositeKeyConditionInput build() {
            return new ModelSavedTableViewsPrimaryCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelSavedTableViewsPrimaryCompositeKeyInput modelSavedTableViewsPrimaryCompositeKeyInput) {
            this.eq = Input.fromNullable(modelSavedTableViewsPrimaryCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelSavedTableViewsPrimaryCompositeKeyInput modelSavedTableViewsPrimaryCompositeKeyInput) {
            this.ge = Input.fromNullable(modelSavedTableViewsPrimaryCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelSavedTableViewsPrimaryCompositeKeyInput modelSavedTableViewsPrimaryCompositeKeyInput) {
            this.gt = Input.fromNullable(modelSavedTableViewsPrimaryCompositeKeyInput);
            return this;
        }

        public Builder le(ModelSavedTableViewsPrimaryCompositeKeyInput modelSavedTableViewsPrimaryCompositeKeyInput) {
            this.le = Input.fromNullable(modelSavedTableViewsPrimaryCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelSavedTableViewsPrimaryCompositeKeyInput modelSavedTableViewsPrimaryCompositeKeyInput) {
            this.lt = Input.fromNullable(modelSavedTableViewsPrimaryCompositeKeyInput);
            return this;
        }
    }

    public ModelSavedTableViewsPrimaryCompositeKeyConditionInput(Input<ModelSavedTableViewsPrimaryCompositeKeyInput> input, Input<ModelSavedTableViewsPrimaryCompositeKeyInput> input2, Input<ModelSavedTableViewsPrimaryCompositeKeyInput> input3, Input<ModelSavedTableViewsPrimaryCompositeKeyInput> input4, Input<ModelSavedTableViewsPrimaryCompositeKeyInput> input5, Input<List<ModelSavedTableViewsPrimaryCompositeKeyInput>> input6, Input<ModelSavedTableViewsPrimaryCompositeKeyInput> input7) {
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

    public ModelSavedTableViewsPrimaryCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelSavedTableViewsPrimaryCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelSavedTableViewsPrimaryCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelSavedTableViewsPrimaryCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelSavedTableViewsPrimaryCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelSavedTableViewsPrimaryCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelSavedTableViewsPrimaryCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelSavedTableViewsPrimaryCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelSavedTableViewsPrimaryCompositeKeyInput) ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.le.value != 0 ? ((ModelSavedTableViewsPrimaryCompositeKeyInput) ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelSavedTableViewsPrimaryCompositeKeyInput) ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelSavedTableViewsPrimaryCompositeKeyInput) ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelSavedTableViewsPrimaryCompositeKeyInput) ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSavedTableViewsPrimaryCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSavedTableViewsPrimaryCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelSavedTableViewsPrimaryCompositeKeyInput) ModelSavedTableViewsPrimaryCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
