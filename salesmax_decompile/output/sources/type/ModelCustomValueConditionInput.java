package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomValueConditionInput implements InputType {
    private final Input<List<ModelCustomValueConditionInput>> and;
    private final Input<ModelIDInput> createSourceId;
    private final Input<ModelStringInput> createSourceType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelCustomValueConditionInput> not;
    private final Input<List<ModelCustomValueConditionInput>> or;
    private final Input<ModelStringInput> parentObjectType;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> value;

    public static final class Builder {
        private Input<ModelStringInput> parentObjectType = Input.absent();
        private Input<ModelStringInput> value = Input.absent();
        private Input<ModelIDInput> createSourceId = Input.absent();
        private Input<ModelStringInput> createSourceType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCustomValueConditionInput>> and = Input.absent();
        private Input<List<ModelCustomValueConditionInput>> or = Input.absent();
        private Input<ModelCustomValueConditionInput> not = Input.absent();

        public Builder and(List<ModelCustomValueConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCustomValueConditionInput build() {
            return new ModelCustomValueConditionInput(this.parentObjectType, this.value, this.createSourceId, this.createSourceType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createSourceId(ModelIDInput modelIDInput) {
            this.createSourceId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createSourceType(ModelStringInput modelStringInput) {
            this.createSourceType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelCustomValueConditionInput modelCustomValueConditionInput) {
            this.not = Input.fromNullable(modelCustomValueConditionInput);
            return this;
        }

        public Builder or(List<ModelCustomValueConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentObjectType(ModelStringInput modelStringInput) {
            this.parentObjectType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder value(ModelStringInput modelStringInput) {
            this.value = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelCustomValueConditionInput(Input<ModelStringInput> input, Input<ModelStringInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<List<ModelCustomValueConditionInput>> input7, Input<List<ModelCustomValueConditionInput>> input8, Input<ModelCustomValueConditionInput> input9) {
        this.parentObjectType = input;
        this.value = input2;
        this.createSourceId = input3;
        this.createSourceType = input4;
        this.createdAt = input5;
        this.updatedAt = input6;
        this.and = input7;
        this.or = input8;
        this.not = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<ModelCustomValueConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput createSourceId() {
        return this.createSourceId.value;
    }

    public ModelStringInput createSourceType() {
        return this.createSourceType.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCustomValueConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomValueConditionInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeObject("parentObjectType", ModelCustomValueConditionInput.this.parentObjectType.value != 0 ? ((ModelStringInput) ModelCustomValueConditionInput.this.parentObjectType.value).marshaller() : null);
                }
                if (ModelCustomValueConditionInput.this.value.defined) {
                    inputFieldWriter.writeObject("value", ModelCustomValueConditionInput.this.value.value != 0 ? ((ModelStringInput) ModelCustomValueConditionInput.this.value.value).marshaller() : null);
                }
                if (ModelCustomValueConditionInput.this.createSourceId.defined) {
                    inputFieldWriter.writeObject("createSourceId", ModelCustomValueConditionInput.this.createSourceId.value != 0 ? ((ModelIDInput) ModelCustomValueConditionInput.this.createSourceId.value).marshaller() : null);
                }
                if (ModelCustomValueConditionInput.this.createSourceType.defined) {
                    inputFieldWriter.writeObject("createSourceType", ModelCustomValueConditionInput.this.createSourceType.value != 0 ? ((ModelStringInput) ModelCustomValueConditionInput.this.createSourceType.value).marshaller() : null);
                }
                if (ModelCustomValueConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCustomValueConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCustomValueConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCustomValueConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCustomValueConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCustomValueConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCustomValueConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCustomValueConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomValueConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomValueConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomValueConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomValueConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCustomValueConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomValueConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomValueConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomValueConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomValueConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCustomValueConditionInput.this.not.value != 0 ? ((ModelCustomValueConditionInput) ModelCustomValueConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCustomValueConditionInput not() {
        return this.not.value;
    }

    public List<ModelCustomValueConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput parentObjectType() {
        return this.parentObjectType.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelStringInput value() {
        return this.value.value;
    }
}
