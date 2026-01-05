package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomPropertyValuesFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCustomPropertyValuesFilterInput>> and;
    private final Input<ModelIDInput> createSourceId;
    private final Input<ModelStringInput> createSourceType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> id;
    private final Input<ModelCustomPropertyValuesFilterInput> not;
    private final Input<List<ModelCustomPropertyValuesFilterInput>> or;
    private final Input<ModelStringInput> parentObject;
    private final Input<ModelIDInput> parentObjectId;
    private final Input<ModelIDInput> propertyDefinitionId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> value;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> propertyDefinitionId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> parentObjectId = Input.absent();
        private Input<ModelStringInput> parentObject = Input.absent();
        private Input<ModelStringInput> value = Input.absent();
        private Input<ModelIDInput> createSourceId = Input.absent();
        private Input<ModelStringInput> createSourceType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCustomPropertyValuesFilterInput>> and = Input.absent();
        private Input<List<ModelCustomPropertyValuesFilterInput>> or = Input.absent();
        private Input<ModelCustomPropertyValuesFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCustomPropertyValuesFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCustomPropertyValuesFilterInput build() {
            return new ModelCustomPropertyValuesFilterInput(this.id, this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObject, this.value, this.createSourceId, this.createSourceType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelCustomPropertyValuesFilterInput modelCustomPropertyValuesFilterInput) {
            this.not = Input.fromNullable(modelCustomPropertyValuesFilterInput);
            return this;
        }

        public Builder or(List<ModelCustomPropertyValuesFilterInput> list) {
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

    public ModelCustomPropertyValuesFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelIDInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<List<ModelCustomPropertyValuesFilterInput>> input11, Input<List<ModelCustomPropertyValuesFilterInput>> input12, Input<ModelCustomPropertyValuesFilterInput> input13) {
        this.id = input;
        this.propertyDefinitionId = input2;
        this.accountId = input3;
        this.parentObjectId = input4;
        this.parentObject = input5;
        this.value = input6;
        this.createSourceId = input7;
        this.createSourceType = input8;
        this.createdAt = input9;
        this.updatedAt = input10;
        this.and = input11;
        this.or = input12;
        this.not = input13;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelCustomPropertyValuesFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCustomPropertyValuesFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomPropertyValuesFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelCustomPropertyValuesFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelCustomPropertyValuesFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesFilterInput.this.propertyDefinitionId.defined) {
                    inputFieldWriter.writeObject("propertyDefinitionId", ModelCustomPropertyValuesFilterInput.this.propertyDefinitionId.value != 0 ? ((ModelIDInput) ModelCustomPropertyValuesFilterInput.this.propertyDefinitionId.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCustomPropertyValuesFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCustomPropertyValuesFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesFilterInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeObject("parentObjectId", ModelCustomPropertyValuesFilterInput.this.parentObjectId.value != 0 ? ((ModelIDInput) ModelCustomPropertyValuesFilterInput.this.parentObjectId.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesFilterInput.this.parentObject.defined) {
                    inputFieldWriter.writeObject("parentObject", ModelCustomPropertyValuesFilterInput.this.parentObject.value != 0 ? ((ModelStringInput) ModelCustomPropertyValuesFilterInput.this.parentObject.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesFilterInput.this.value.defined) {
                    inputFieldWriter.writeObject("value", ModelCustomPropertyValuesFilterInput.this.value.value != 0 ? ((ModelStringInput) ModelCustomPropertyValuesFilterInput.this.value.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesFilterInput.this.createSourceId.defined) {
                    inputFieldWriter.writeObject("createSourceId", ModelCustomPropertyValuesFilterInput.this.createSourceId.value != 0 ? ((ModelIDInput) ModelCustomPropertyValuesFilterInput.this.createSourceId.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesFilterInput.this.createSourceType.defined) {
                    inputFieldWriter.writeObject("createSourceType", ModelCustomPropertyValuesFilterInput.this.createSourceType.value != 0 ? ((ModelStringInput) ModelCustomPropertyValuesFilterInput.this.createSourceType.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCustomPropertyValuesFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCustomPropertyValuesFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCustomPropertyValuesFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCustomPropertyValuesFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCustomPropertyValuesFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCustomPropertyValuesFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyValuesFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomPropertyValuesFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyValuesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomPropertyValuesFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCustomPropertyValuesFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyValuesFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomPropertyValuesFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyValuesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomPropertyValuesFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCustomPropertyValuesFilterInput.this.not.value != 0 ? ((ModelCustomPropertyValuesFilterInput) ModelCustomPropertyValuesFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCustomPropertyValuesFilterInput not() {
        return this.not.value;
    }

    public List<ModelCustomPropertyValuesFilterInput> or() {
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
