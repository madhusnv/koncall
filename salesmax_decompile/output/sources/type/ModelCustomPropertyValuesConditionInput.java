package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomPropertyValuesConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCustomPropertyValuesConditionInput>> and;
    private final Input<ModelIDInput> createSourceId;
    private final Input<ModelStringInput> createSourceType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelCustomPropertyValuesConditionInput> not;
    private final Input<List<ModelCustomPropertyValuesConditionInput>> or;
    private final Input<ModelStringInput> parentObject;
    private final Input<ModelIDInput> parentObjectId;
    private final Input<ModelIDInput> propertyDefinitionId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> value;

    public static final class Builder {
        private Input<ModelIDInput> propertyDefinitionId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> parentObjectId = Input.absent();
        private Input<ModelStringInput> parentObject = Input.absent();
        private Input<ModelStringInput> value = Input.absent();
        private Input<ModelIDInput> createSourceId = Input.absent();
        private Input<ModelStringInput> createSourceType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCustomPropertyValuesConditionInput>> and = Input.absent();
        private Input<List<ModelCustomPropertyValuesConditionInput>> or = Input.absent();
        private Input<ModelCustomPropertyValuesConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCustomPropertyValuesConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCustomPropertyValuesConditionInput build() {
            return new ModelCustomPropertyValuesConditionInput(this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObject, this.value, this.createSourceId, this.createSourceType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelCustomPropertyValuesConditionInput modelCustomPropertyValuesConditionInput) {
            this.not = Input.fromNullable(modelCustomPropertyValuesConditionInput);
            return this;
        }

        public Builder or(List<ModelCustomPropertyValuesConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentObject(ModelStringInput modelStringInput) {
            this.parentObject = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder parentObjectId(ModelIDInput modelIDInput) {
            this.parentObjectId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder propertyDefinitionId(ModelIDInput modelIDInput) {
            this.propertyDefinitionId = Input.fromNullable(modelIDInput);
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

    public ModelCustomPropertyValuesConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelCustomPropertyValuesConditionInput>> input10, Input<List<ModelCustomPropertyValuesConditionInput>> input11, Input<ModelCustomPropertyValuesConditionInput> input12) {
        this.propertyDefinitionId = input;
        this.accountId = input2;
        this.parentObjectId = input3;
        this.parentObject = input4;
        this.value = input5;
        this.createSourceId = input6;
        this.createSourceType = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
        this.and = input10;
        this.or = input11;
        this.not = input12;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelCustomPropertyValuesConditionInput> and() {
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
        return new InputFieldMarshaller() { // from class: type.ModelCustomPropertyValuesConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomPropertyValuesConditionInput.this.propertyDefinitionId.defined) {
                    inputFieldWriter.writeObject("propertyDefinitionId", ModelCustomPropertyValuesConditionInput.this.propertyDefinitionId.value != 0 ? ((ModelIDInput) ModelCustomPropertyValuesConditionInput.this.propertyDefinitionId.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCustomPropertyValuesConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCustomPropertyValuesConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesConditionInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeObject("parentObjectId", ModelCustomPropertyValuesConditionInput.this.parentObjectId.value != 0 ? ((ModelIDInput) ModelCustomPropertyValuesConditionInput.this.parentObjectId.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesConditionInput.this.parentObject.defined) {
                    inputFieldWriter.writeObject("parentObject", ModelCustomPropertyValuesConditionInput.this.parentObject.value != 0 ? ((ModelStringInput) ModelCustomPropertyValuesConditionInput.this.parentObject.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesConditionInput.this.value.defined) {
                    inputFieldWriter.writeObject("value", ModelCustomPropertyValuesConditionInput.this.value.value != 0 ? ((ModelStringInput) ModelCustomPropertyValuesConditionInput.this.value.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesConditionInput.this.createSourceId.defined) {
                    inputFieldWriter.writeObject("createSourceId", ModelCustomPropertyValuesConditionInput.this.createSourceId.value != 0 ? ((ModelIDInput) ModelCustomPropertyValuesConditionInput.this.createSourceId.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesConditionInput.this.createSourceType.defined) {
                    inputFieldWriter.writeObject("createSourceType", ModelCustomPropertyValuesConditionInput.this.createSourceType.value != 0 ? ((ModelStringInput) ModelCustomPropertyValuesConditionInput.this.createSourceType.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCustomPropertyValuesConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCustomPropertyValuesConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCustomPropertyValuesConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCustomPropertyValuesConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCustomPropertyValuesConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyValuesConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomPropertyValuesConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyValuesConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomPropertyValuesConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCustomPropertyValuesConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyValuesConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomPropertyValuesConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyValuesConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomPropertyValuesConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCustomPropertyValuesConditionInput.this.not.value != 0 ? ((ModelCustomPropertyValuesConditionInput) ModelCustomPropertyValuesConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCustomPropertyValuesConditionInput not() {
        return this.not.value;
    }

    public List<ModelCustomPropertyValuesConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput parentObject() {
        return this.parentObject.value;
    }

    public ModelIDInput parentObjectId() {
        return this.parentObjectId.value;
    }

    public ModelIDInput propertyDefinitionId() {
        return this.propertyDefinitionId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelStringInput value() {
        return this.value.value;
    }
}
