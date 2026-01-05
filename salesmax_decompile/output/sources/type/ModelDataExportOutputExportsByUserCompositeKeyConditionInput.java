package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDataExportOutputExportsByUserCompositeKeyConditionInput implements InputType {
    private final Input<ModelDataExportOutputExportsByUserCompositeKeyInput> beginsWith;
    private final Input<List<ModelDataExportOutputExportsByUserCompositeKeyInput>> between;
    private final Input<ModelDataExportOutputExportsByUserCompositeKeyInput> eq;
    private final Input<ModelDataExportOutputExportsByUserCompositeKeyInput> ge;
    private final Input<ModelDataExportOutputExportsByUserCompositeKeyInput> gt;
    private final Input<ModelDataExportOutputExportsByUserCompositeKeyInput> le;
    private final Input<ModelDataExportOutputExportsByUserCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelDataExportOutputExportsByUserCompositeKeyInput> eq = Input.absent();
        private Input<ModelDataExportOutputExportsByUserCompositeKeyInput> le = Input.absent();
        private Input<ModelDataExportOutputExportsByUserCompositeKeyInput> lt = Input.absent();
        private Input<ModelDataExportOutputExportsByUserCompositeKeyInput> ge = Input.absent();
        private Input<ModelDataExportOutputExportsByUserCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelDataExportOutputExportsByUserCompositeKeyInput>> between = Input.absent();
        private Input<ModelDataExportOutputExportsByUserCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelDataExportOutputExportsByUserCompositeKeyInput modelDataExportOutputExportsByUserCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelDataExportOutputExportsByUserCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelDataExportOutputExportsByUserCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelDataExportOutputExportsByUserCompositeKeyConditionInput build() {
            return new ModelDataExportOutputExportsByUserCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelDataExportOutputExportsByUserCompositeKeyInput modelDataExportOutputExportsByUserCompositeKeyInput) {
            this.eq = Input.fromNullable(modelDataExportOutputExportsByUserCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelDataExportOutputExportsByUserCompositeKeyInput modelDataExportOutputExportsByUserCompositeKeyInput) {
            this.ge = Input.fromNullable(modelDataExportOutputExportsByUserCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelDataExportOutputExportsByUserCompositeKeyInput modelDataExportOutputExportsByUserCompositeKeyInput) {
            this.gt = Input.fromNullable(modelDataExportOutputExportsByUserCompositeKeyInput);
            return this;
        }

        public Builder le(ModelDataExportOutputExportsByUserCompositeKeyInput modelDataExportOutputExportsByUserCompositeKeyInput) {
            this.le = Input.fromNullable(modelDataExportOutputExportsByUserCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelDataExportOutputExportsByUserCompositeKeyInput modelDataExportOutputExportsByUserCompositeKeyInput) {
            this.lt = Input.fromNullable(modelDataExportOutputExportsByUserCompositeKeyInput);
            return this;
        }
    }

    public ModelDataExportOutputExportsByUserCompositeKeyConditionInput(Input<ModelDataExportOutputExportsByUserCompositeKeyInput> input, Input<ModelDataExportOutputExportsByUserCompositeKeyInput> input2, Input<ModelDataExportOutputExportsByUserCompositeKeyInput> input3, Input<ModelDataExportOutputExportsByUserCompositeKeyInput> input4, Input<ModelDataExportOutputExportsByUserCompositeKeyInput> input5, Input<List<ModelDataExportOutputExportsByUserCompositeKeyInput>> input6, Input<ModelDataExportOutputExportsByUserCompositeKeyInput> input7) {
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

    public ModelDataExportOutputExportsByUserCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelDataExportOutputExportsByUserCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelDataExportOutputExportsByUserCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelDataExportOutputExportsByUserCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelDataExportOutputExportsByUserCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelDataExportOutputExportsByUserCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelDataExportOutputExportsByUserCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDataExportOutputExportsByUserCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelDataExportOutputExportsByUserCompositeKeyInput) ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.le.value != 0 ? ((ModelDataExportOutputExportsByUserCompositeKeyInput) ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelDataExportOutputExportsByUserCompositeKeyInput) ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelDataExportOutputExportsByUserCompositeKeyInput) ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelDataExportOutputExportsByUserCompositeKeyInput) ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDataExportOutputExportsByUserCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDataExportOutputExportsByUserCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelDataExportOutputExportsByUserCompositeKeyInput) ModelDataExportOutputExportsByUserCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
