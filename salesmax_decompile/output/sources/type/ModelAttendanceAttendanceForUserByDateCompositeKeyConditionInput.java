package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput implements InputType {
    private final Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> beginsWith;
    private final Input<List<ModelAttendanceAttendanceForUserByDateCompositeKeyInput>> between;
    private final Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> eq;
    private final Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> ge;
    private final Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> gt;
    private final Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> le;
    private final Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> eq = Input.absent();
        private Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> le = Input.absent();
        private Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> lt = Input.absent();
        private Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> ge = Input.absent();
        private Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelAttendanceAttendanceForUserByDateCompositeKeyInput>> between = Input.absent();
        private Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelAttendanceAttendanceForUserByDateCompositeKeyInput modelAttendanceAttendanceForUserByDateCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelAttendanceAttendanceForUserByDateCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput build() {
            return new ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelAttendanceAttendanceForUserByDateCompositeKeyInput modelAttendanceAttendanceForUserByDateCompositeKeyInput) {
            this.eq = Input.fromNullable(modelAttendanceAttendanceForUserByDateCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelAttendanceAttendanceForUserByDateCompositeKeyInput modelAttendanceAttendanceForUserByDateCompositeKeyInput) {
            this.ge = Input.fromNullable(modelAttendanceAttendanceForUserByDateCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelAttendanceAttendanceForUserByDateCompositeKeyInput modelAttendanceAttendanceForUserByDateCompositeKeyInput) {
            this.gt = Input.fromNullable(modelAttendanceAttendanceForUserByDateCompositeKeyInput);
            return this;
        }

        public Builder le(ModelAttendanceAttendanceForUserByDateCompositeKeyInput modelAttendanceAttendanceForUserByDateCompositeKeyInput) {
            this.le = Input.fromNullable(modelAttendanceAttendanceForUserByDateCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelAttendanceAttendanceForUserByDateCompositeKeyInput modelAttendanceAttendanceForUserByDateCompositeKeyInput) {
            this.lt = Input.fromNullable(modelAttendanceAttendanceForUserByDateCompositeKeyInput);
            return this;
        }
    }

    public ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput(Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> input, Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> input2, Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> input3, Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> input4, Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> input5, Input<List<ModelAttendanceAttendanceForUserByDateCompositeKeyInput>> input6, Input<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> input7) {
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

    public ModelAttendanceAttendanceForUserByDateCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelAttendanceAttendanceForUserByDateCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelAttendanceAttendanceForUserByDateCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelAttendanceAttendanceForUserByDateCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelAttendanceAttendanceForUserByDateCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelAttendanceAttendanceForUserByDateCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelAttendanceAttendanceForUserByDateCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelAttendanceAttendanceForUserByDateCompositeKeyInput) ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.le.value != 0 ? ((ModelAttendanceAttendanceForUserByDateCompositeKeyInput) ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelAttendanceAttendanceForUserByDateCompositeKeyInput) ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelAttendanceAttendanceForUserByDateCompositeKeyInput) ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelAttendanceAttendanceForUserByDateCompositeKeyInput) ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAttendanceAttendanceForUserByDateCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelAttendanceAttendanceForUserByDateCompositeKeyInput) ModelAttendanceAttendanceForUserByDateCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
