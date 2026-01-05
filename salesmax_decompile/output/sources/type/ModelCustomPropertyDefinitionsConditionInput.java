package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomPropertyDefinitionsConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCustomPropertyDefinitionsConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> displayName;
    private final Input<ModelBooleanInput> isArchived;
    private final Input<ModelBooleanInput> isMultiple;
    private final Input<ModelBooleanInput> isSystemProperty;
    private final Input<ModelCustomPropertyDefinitionsConditionInput> not;
    private final Input<List<ModelCustomPropertyDefinitionsConditionInput>> or;
    private final Input<ModelStringInput> parentObjectType;
    private final Input<ModelStringInput> propertyName;
    private final Input<ModelStringInput> scalarType;
    private final Input<ModelIDInput> updaedById;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> propertyName = Input.absent();
        private Input<ModelStringInput> displayName = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelStringInput> scalarType = Input.absent();
        private Input<ModelBooleanInput> isMultiple = Input.absent();
        private Input<ModelStringInput> parentObjectType = Input.absent();
        private Input<ModelBooleanInput> isSystemProperty = Input.absent();
        private Input<ModelBooleanInput> isArchived = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updaedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCustomPropertyDefinitionsConditionInput>> and = Input.absent();
        private Input<List<ModelCustomPropertyDefinitionsConditionInput>> or = Input.absent();
        private Input<ModelCustomPropertyDefinitionsConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCustomPropertyDefinitionsConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCustomPropertyDefinitionsConditionInput build() {
            return new ModelCustomPropertyDefinitionsConditionInput(this.accountId, this.propertyName, this.displayName, this.description, this.scalarType, this.isMultiple, this.parentObjectType, this.isSystemProperty, this.isArchived, this.createdById, this.updaedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder description(ModelStringInput modelStringInput) {
            this.description = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder displayName(ModelStringInput modelStringInput) {
            this.displayName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder isArchived(ModelBooleanInput modelBooleanInput) {
            this.isArchived = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isMultiple(ModelBooleanInput modelBooleanInput) {
            this.isMultiple = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isSystemProperty(ModelBooleanInput modelBooleanInput) {
            this.isSystemProperty = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder not(ModelCustomPropertyDefinitionsConditionInput modelCustomPropertyDefinitionsConditionInput) {
            this.not = Input.fromNullable(modelCustomPropertyDefinitionsConditionInput);
            return this;
        }

        public Builder or(List<ModelCustomPropertyDefinitionsConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentObjectType(ModelStringInput modelStringInput) {
            this.parentObjectType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder propertyName(ModelStringInput modelStringInput) {
            this.propertyName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder scalarType(ModelStringInput modelStringInput) {
            this.scalarType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updaedById(ModelIDInput modelIDInput) {
            this.updaedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelCustomPropertyDefinitionsConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelBooleanInput> input6, Input<ModelStringInput> input7, Input<ModelBooleanInput> input8, Input<ModelBooleanInput> input9, Input<ModelIDInput> input10, Input<ModelIDInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<List<ModelCustomPropertyDefinitionsConditionInput>> input14, Input<List<ModelCustomPropertyDefinitionsConditionInput>> input15, Input<ModelCustomPropertyDefinitionsConditionInput> input16) {
        this.accountId = input;
        this.propertyName = input2;
        this.displayName = input3;
        this.description = input4;
        this.scalarType = input5;
        this.isMultiple = input6;
        this.parentObjectType = input7;
        this.isSystemProperty = input8;
        this.isArchived = input9;
        this.createdById = input10;
        this.updaedById = input11;
        this.createdAt = input12;
        this.updatedAt = input13;
        this.and = input14;
        this.or = input15;
        this.not = input16;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelCustomPropertyDefinitionsConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelStringInput displayName() {
        return this.displayName.value;
    }

    public ModelBooleanInput isArchived() {
        return this.isArchived.value;
    }

    public ModelBooleanInput isMultiple() {
        return this.isMultiple.value;
    }

    public ModelBooleanInput isSystemProperty() {
        return this.isSystemProperty.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCustomPropertyDefinitionsConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomPropertyDefinitionsConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCustomPropertyDefinitionsConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCustomPropertyDefinitionsConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.propertyName.defined) {
                    inputFieldWriter.writeObject("propertyName", ModelCustomPropertyDefinitionsConditionInput.this.propertyName.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsConditionInput.this.propertyName.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.displayName.defined) {
                    inputFieldWriter.writeObject("displayName", ModelCustomPropertyDefinitionsConditionInput.this.displayName.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsConditionInput.this.displayName.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelCustomPropertyDefinitionsConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.scalarType.defined) {
                    inputFieldWriter.writeObject("scalarType", ModelCustomPropertyDefinitionsConditionInput.this.scalarType.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsConditionInput.this.scalarType.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.isMultiple.defined) {
                    inputFieldWriter.writeObject("isMultiple", ModelCustomPropertyDefinitionsConditionInput.this.isMultiple.value != 0 ? ((ModelBooleanInput) ModelCustomPropertyDefinitionsConditionInput.this.isMultiple.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeObject("parentObjectType", ModelCustomPropertyDefinitionsConditionInput.this.parentObjectType.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsConditionInput.this.parentObjectType.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.isSystemProperty.defined) {
                    inputFieldWriter.writeObject("isSystemProperty", ModelCustomPropertyDefinitionsConditionInput.this.isSystemProperty.value != 0 ? ((ModelBooleanInput) ModelCustomPropertyDefinitionsConditionInput.this.isSystemProperty.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.isArchived.defined) {
                    inputFieldWriter.writeObject("isArchived", ModelCustomPropertyDefinitionsConditionInput.this.isArchived.value != 0 ? ((ModelBooleanInput) ModelCustomPropertyDefinitionsConditionInput.this.isArchived.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelCustomPropertyDefinitionsConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelCustomPropertyDefinitionsConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.updaedById.defined) {
                    inputFieldWriter.writeObject("updaedById", ModelCustomPropertyDefinitionsConditionInput.this.updaedById.value != 0 ? ((ModelIDInput) ModelCustomPropertyDefinitionsConditionInput.this.updaedById.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCustomPropertyDefinitionsConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCustomPropertyDefinitionsConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCustomPropertyDefinitionsConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyDefinitionsConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomPropertyDefinitionsConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyDefinitionsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCustomPropertyDefinitionsConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyDefinitionsConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomPropertyDefinitionsConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyDefinitionsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomPropertyDefinitionsConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCustomPropertyDefinitionsConditionInput.this.not.value != 0 ? ((ModelCustomPropertyDefinitionsConditionInput) ModelCustomPropertyDefinitionsConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCustomPropertyDefinitionsConditionInput not() {
        return this.not.value;
    }

    public List<ModelCustomPropertyDefinitionsConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput parentObjectType() {
        return this.parentObjectType.value;
    }

    public ModelStringInput propertyName() {
        return this.propertyName.value;
    }

    public ModelStringInput scalarType() {
        return this.scalarType.value;
    }

    public ModelIDInput updaedById() {
        return this.updaedById.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
