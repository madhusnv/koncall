package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput implements InputType {
    private final Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> beginsWith;
    private final Input<List<ModelCommentListAllCommentsOnActivityCompositeKeyInput>> between;
    private final Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> eq;
    private final Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> ge;
    private final Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> gt;
    private final Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> le;
    private final Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> lt;

    public static final class Builder {
        private Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> eq = Input.absent();
        private Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> le = Input.absent();
        private Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> lt = Input.absent();
        private Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> ge = Input.absent();
        private Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> gt = Input.absent();
        private Input<List<ModelCommentListAllCommentsOnActivityCompositeKeyInput>> between = Input.absent();
        private Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> beginsWith = Input.absent();

        public Builder beginsWith(ModelCommentListAllCommentsOnActivityCompositeKeyInput modelCommentListAllCommentsOnActivityCompositeKeyInput) {
            this.beginsWith = Input.fromNullable(modelCommentListAllCommentsOnActivityCompositeKeyInput);
            return this;
        }

        public Builder between(List<ModelCommentListAllCommentsOnActivityCompositeKeyInput> list) {
            this.between = Input.fromNullable(list);
            return this;
        }

        public ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput build() {
            return new ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput(this.eq, this.le, this.lt, this.ge, this.gt, this.between, this.beginsWith);
        }

        public Builder eq(ModelCommentListAllCommentsOnActivityCompositeKeyInput modelCommentListAllCommentsOnActivityCompositeKeyInput) {
            this.eq = Input.fromNullable(modelCommentListAllCommentsOnActivityCompositeKeyInput);
            return this;
        }

        public Builder ge(ModelCommentListAllCommentsOnActivityCompositeKeyInput modelCommentListAllCommentsOnActivityCompositeKeyInput) {
            this.ge = Input.fromNullable(modelCommentListAllCommentsOnActivityCompositeKeyInput);
            return this;
        }

        public Builder gt(ModelCommentListAllCommentsOnActivityCompositeKeyInput modelCommentListAllCommentsOnActivityCompositeKeyInput) {
            this.gt = Input.fromNullable(modelCommentListAllCommentsOnActivityCompositeKeyInput);
            return this;
        }

        public Builder le(ModelCommentListAllCommentsOnActivityCompositeKeyInput modelCommentListAllCommentsOnActivityCompositeKeyInput) {
            this.le = Input.fromNullable(modelCommentListAllCommentsOnActivityCompositeKeyInput);
            return this;
        }

        public Builder lt(ModelCommentListAllCommentsOnActivityCompositeKeyInput modelCommentListAllCommentsOnActivityCompositeKeyInput) {
            this.lt = Input.fromNullable(modelCommentListAllCommentsOnActivityCompositeKeyInput);
            return this;
        }
    }

    public ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput(Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> input, Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> input2, Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> input3, Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> input4, Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> input5, Input<List<ModelCommentListAllCommentsOnActivityCompositeKeyInput>> input6, Input<ModelCommentListAllCommentsOnActivityCompositeKeyInput> input7) {
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

    public ModelCommentListAllCommentsOnActivityCompositeKeyInput beginsWith() {
        return this.beginsWith.value;
    }

    public List<ModelCommentListAllCommentsOnActivityCompositeKeyInput> between() {
        return this.between.value;
    }

    public ModelCommentListAllCommentsOnActivityCompositeKeyInput eq() {
        return this.eq.value;
    }

    public ModelCommentListAllCommentsOnActivityCompositeKeyInput ge() {
        return this.ge.value;
    }

    public ModelCommentListAllCommentsOnActivityCompositeKeyInput gt() {
        return this.gt.value;
    }

    public ModelCommentListAllCommentsOnActivityCompositeKeyInput le() {
        return this.le.value;
    }

    public ModelCommentListAllCommentsOnActivityCompositeKeyInput lt() {
        return this.lt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.eq.defined) {
                    inputFieldWriter.writeObject("eq", ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.eq.value != 0 ? ((ModelCommentListAllCommentsOnActivityCompositeKeyInput) ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.eq.value).marshaller() : null);
                }
                if (ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.le.defined) {
                    inputFieldWriter.writeObject("le", ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.le.value != 0 ? ((ModelCommentListAllCommentsOnActivityCompositeKeyInput) ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.le.value).marshaller() : null);
                }
                if (ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.lt.defined) {
                    inputFieldWriter.writeObject("lt", ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.lt.value != 0 ? ((ModelCommentListAllCommentsOnActivityCompositeKeyInput) ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.lt.value).marshaller() : null);
                }
                if (ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.ge.defined) {
                    inputFieldWriter.writeObject("ge", ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.ge.value != 0 ? ((ModelCommentListAllCommentsOnActivityCompositeKeyInput) ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.ge.value).marshaller() : null);
                }
                if (ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.gt.defined) {
                    inputFieldWriter.writeObject("gt", ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.gt.value != 0 ? ((ModelCommentListAllCommentsOnActivityCompositeKeyInput) ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.gt.value).marshaller() : null);
                }
                if (ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.between.defined) {
                    inputFieldWriter.writeList("between", ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.between.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.between.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCommentListAllCommentsOnActivityCompositeKeyInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.beginsWith.defined) {
                    inputFieldWriter.writeObject("beginsWith", ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.beginsWith.value != 0 ? ((ModelCommentListAllCommentsOnActivityCompositeKeyInput) ModelCommentListAllCommentsOnActivityCompositeKeyConditionInput.this.beginsWith.value).marshaller() : null);
                }
            }
        };
    }
}
