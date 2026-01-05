package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomValuePrimaryCompositeKeyConditionInput implements InputType {
    private final Input<ModelCustomValuePrimaryCompositeKeyInput> beginsWith;
    private final Input<List<ModelCustomValuePrimaryCompositeKeyInput>> between;
    private final Input<ModelCustomValuePrimaryCompositeKeyInput> eq;
    private final Input<ModelCustomValuePrimaryCompositeKeyInput> ge;
    private final Input<ModelCustomValuePrimaryCompositeKeyInput> gt;
    private final Input<ModelCustomValuePrimaryCompositeKeyInput> le;
    private final Input<ModelCustomValuePrimaryCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelCustomValuePrimaryCompositeKeyInput> eq = Input.absent();
        private Input<ModelCustomValuePrimaryCompositeKeyInput> le = Input.absent();
        private Input<ModelCustomValuePrimaryCompositeKeyInput> lt = Input.absent();
        private Input<ModelCustomValuePrimaryCompositeKeyInput> ge = Input.absent();
        private Input<ModelCustomValuePrimaryCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelCustomValuePrimaryCompositeKeyInput>> between = Input.absent();
        private Input<ModelCustomValuePrimaryCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelCustomValuePrimaryCompositeKeyInput modelCustomValuePrimaryCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelCustomValuePrimaryCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelCustomValuePrimaryCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelCustomValuePrimaryCompositeKeyConditionInput build() {
            return new ModelCustomValuePrimaryCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelCustomValuePrimaryCompositeKeyInput modelCustomValuePrimaryCompositeKeyInput) {
            this.eq = Input.fromNullable(modelCustomValuePrimaryCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelCustomValuePrimaryCompositeKeyInput modelCustomValuePrimaryCompositeKeyInput) {
            this.ge = Input.fromNullable(modelCustomValuePrimaryCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelCustomValuePrimaryCompositeKeyInput modelCustomValuePrimaryCompositeKeyInput) {
            this.gt = Input.fromNullable(modelCustomValuePrimaryCompositeKeyInput);
            return this;
        }

        public Builder le(ModelCustomValuePrimaryCompositeKeyInput modelCustomValuePrimaryCompositeKeyInput) {
            this.le = Input.fromNullable(modelCustomValuePrimaryCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelCustomValuePrimaryCompositeKeyInput modelCustomValuePrimaryCompositeKeyInput) {
            this.lt = Input.fromNullable(modelCustomValuePrimaryCompositeKeyInput);
            return this;
        }
    }

    public ModelCustomValuePrimaryCompositeKeyConditionInput(Input<ModelCustomValuePrimaryCompositeKeyInput> input, Input<ModelCustomValuePrimaryCompositeKeyInput> input2, Input<ModelCustomValuePrimaryCompositeKeyInput> input3, Input<ModelCustomValuePrimaryCompositeKeyInput> input4, Input<ModelCustomValuePrimaryCompositeKeyInput> input5, Input<List<ModelCustomValuePrimaryCompositeKeyInput>> input6, Input<ModelCustomValuePrimaryCompositeKeyInput> input7) {
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

    public ModelCustomValuePrimaryCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelCustomValuePrimaryCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelCustomValuePrimaryCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelCustomValuePrimaryCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelCustomValuePrimaryCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelCustomValuePrimaryCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelCustomValuePrimaryCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCustomValuePrimaryCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomValuePrimaryCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelCustomValuePrimaryCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelCustomValuePrimaryCompositeKeyInput) ModelCustomValuePrimaryCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelCustomValuePrimaryCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelCustomValuePrimaryCompositeKeyConditionInput.this.le.value != 0 ? ((ModelCustomValuePrimaryCompositeKeyInput) ModelCustomValuePrimaryCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelCustomValuePrimaryCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelCustomValuePrimaryCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelCustomValuePrimaryCompositeKeyInput) ModelCustomValuePrimaryCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelCustomValuePrimaryCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelCustomValuePrimaryCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelCustomValuePrimaryCompositeKeyInput) ModelCustomValuePrimaryCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelCustomValuePrimaryCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelCustomValuePrimaryCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelCustomValuePrimaryCompositeKeyInput) ModelCustomValuePrimaryCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelCustomValuePrimaryCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelCustomValuePrimaryCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomValuePrimaryCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomValuePrimaryCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomValuePrimaryCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomValuePrimaryCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelCustomValuePrimaryCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelCustomValuePrimaryCompositeKeyInput) ModelCustomValuePrimaryCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
