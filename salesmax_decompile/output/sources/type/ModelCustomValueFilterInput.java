package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomValueFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCustomValueFilterInput>> and;
    private final Input<ModelIDInput> createSourceId;
    private final Input<ModelStringInput> createSourceType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelCustomValueFilterInput> not;
    private final Input<List<ModelCustomValueFilterInput>> or;
    private final Input<ModelIDInput> parentObjectId;
    private final Input<ModelStringInput> parentObjectType;
    private final Input<ModelIDInput> propertyDefinitionId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> value;

    public static final class Builder {
        private Input<ModelIDInput> propertyDefinitionId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> parentObjectId = Input.absent();
        private Input<ModelStringInput> parentObjectType = Input.absent();
        private Input<ModelStringInput> value = Input.absent();
        private Input<ModelIDInput> createSourceId = Input.absent();
        private Input<ModelStringInput> createSourceType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCustomValueFilterInput>> and = Input.absent();
        private Input<List<ModelCustomValueFilterInput>> or = Input.absent();
        private Input<ModelCustomValueFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCustomValueFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCustomValueFilterInput build() {
            return new ModelCustomValueFilterInput(this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObjectType, this.value, this.createSourceId, this.createSourceType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelCustomValueFilterInput modelCustomValueFilterInput) {
            this.not = Input.fromNullable(modelCustomValueFilterInput);
            return this;
        }

        public Builder or(List<ModelCustomValueFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentObjectId(ModelIDInput modelIDInput) {
            this.parentObjectId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder parentObjectType(ModelStringInput modelStringInput) {
            this.parentObjectType = Input.fromNullable(modelStringInput);
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

    public ModelCustomValueFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelCustomValueFilterInput>> input10, Input<List<ModelCustomValueFilterInput>> input11, Input<ModelCustomValueFilterInput> input12) {
        this.propertyDefinitionId = input;
        this.accountId = input2;
        this.parentObjectId = input3;
        this.parentObjectType = input4;
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

    public List<ModelCustomValueFilterInput> and() {
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
        return new InputFieldMarshaller() { // from class: type.ModelCustomValueFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomValueFilterInput.this.propertyDefinitionId.defined) {
                    inputFieldWriter.writeObject("propertyDefinitionId", ModelCustomValueFilterInput.this.propertyDefinitionId.value != 0 ? ((ModelIDInput) ModelCustomValueFilterInput.this.propertyDefinitionId.value).marshaller() : null);
                }
                if (ModelCustomValueFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCustomValueFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCustomValueFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCustomValueFilterInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeObject("parentObjectId", ModelCustomValueFilterInput.this.parentObjectId.value != 0 ? ((ModelIDInput) ModelCustomValueFilterInput.this.parentObjectId.value).marshaller() : null);
                }
                if (ModelCustomValueFilterInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeObject("parentObjectType", ModelCustomValueFilterInput.this.parentObjectType.value != 0 ? ((ModelStringInput) ModelCustomValueFilterInput.this.parentObjectType.value).marshaller() : null);
                }
                if (ModelCustomValueFilterInput.this.value.defined) {
                    inputFieldWriter.writeObject("value", ModelCustomValueFilterInput.this.value.value != 0 ? ((ModelStringInput) ModelCustomValueFilterInput.this.value.value).marshaller() : null);
                }
                if (ModelCustomValueFilterInput.this.createSourceId.defined) {
                    inputFieldWriter.writeObject("createSourceId", ModelCustomValueFilterInput.this.createSourceId.value != 0 ? ((ModelIDInput) ModelCustomValueFilterInput.this.createSourceId.value).marshaller() : null);
                }
                if (ModelCustomValueFilterInput.this.createSourceType.defined) {
                    inputFieldWriter.writeObject("createSourceType", ModelCustomValueFilterInput.this.createSourceType.value != 0 ? ((ModelStringInput) ModelCustomValueFilterInput.this.createSourceType.value).marshaller() : null);
                }
                if (ModelCustomValueFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCustomValueFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCustomValueFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCustomValueFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCustomValueFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCustomValueFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCustomValueFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCustomValueFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomValueFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomValueFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomValueFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomValueFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCustomValueFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomValueFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomValueFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomValueFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomValueFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCustomValueFilterInput.this.not.value != 0 ? ((ModelCustomValueFilterInput) ModelCustomValueFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCustomValueFilterInput not() {
        return this.not.value;
    }

    public List<ModelCustomValueFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput parentObjectId() {
        return this.parentObjectId.value;
    }

    public ModelStringInput parentObjectType() {
        return this.parentObjectType.value;
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
