package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCustomPropertyDefinitionsFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCustomPropertyDefinitionsFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelCustomDataTypeInput> dataType;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> displayName;
    private final Input<ModelIntInput> displayOrder;
    private final Input<ModelIDInput> id;
    private final Input<ModelBooleanInput> isArchived;
    private final Input<ModelBooleanInput> isMultiple;
    private final Input<ModelBooleanInput> isSystemProperty;
    private final Input<ModelCustomPropertyDefinitionsFilterInput> not;
    private final Input<List<ModelCustomPropertyDefinitionsFilterInput>> or;
    private final Input<ModelStringInput> parentObjectType;
    private final Input<ModelStringInput> propertyName;
    private final Input<ModelStringInput> scalarType;
    private final Input<ModelIDInput> updaedById;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> propertyName = Input.absent();
        private Input<ModelStringInput> displayName = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelStringInput> scalarType = Input.absent();
        private Input<ModelCustomDataTypeInput> dataType = Input.absent();
        private Input<ModelBooleanInput> isMultiple = Input.absent();
        private Input<ModelStringInput> parentObjectType = Input.absent();
        private Input<ModelBooleanInput> isSystemProperty = Input.absent();
        private Input<ModelBooleanInput> isArchived = Input.absent();
        private Input<ModelIntInput> displayOrder = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updaedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCustomPropertyDefinitionsFilterInput>> and = Input.absent();
        private Input<List<ModelCustomPropertyDefinitionsFilterInput>> or = Input.absent();
        private Input<ModelCustomPropertyDefinitionsFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCustomPropertyDefinitionsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCustomPropertyDefinitionsFilterInput build() {
            return new ModelCustomPropertyDefinitionsFilterInput(this.id, this.accountId, this.propertyName, this.displayName, this.description, this.scalarType, this.dataType, this.isMultiple, this.parentObjectType, this.isSystemProperty, this.isArchived, this.displayOrder, this.createdById, this.updaedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder dataType(ModelCustomDataTypeInput modelCustomDataTypeInput) {
            this.dataType = Input.fromNullable(modelCustomDataTypeInput);
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

        public Builder displayOrder(ModelIntInput modelIntInput) {
            this.displayOrder = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelCustomPropertyDefinitionsFilterInput modelCustomPropertyDefinitionsFilterInput) {
            this.not = Input.fromNullable(modelCustomPropertyDefinitionsFilterInput);
            return this;
        }

        public Builder or(List<ModelCustomPropertyDefinitionsFilterInput> list) {
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

    public ModelCustomPropertyDefinitionsFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelCustomDataTypeInput> input7, Input<ModelBooleanInput> input8, Input<ModelStringInput> input9, Input<ModelBooleanInput> input10, Input<ModelBooleanInput> input11, Input<ModelIntInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<List<ModelCustomPropertyDefinitionsFilterInput>> input17, Input<List<ModelCustomPropertyDefinitionsFilterInput>> input18, Input<ModelCustomPropertyDefinitionsFilterInput> input19) {
        this.id = input;
        this.accountId = input2;
        this.propertyName = input3;
        this.displayName = input4;
        this.description = input5;
        this.scalarType = input6;
        this.dataType = input7;
        this.isMultiple = input8;
        this.parentObjectType = input9;
        this.isSystemProperty = input10;
        this.isArchived = input11;
        this.displayOrder = input12;
        this.createdById = input13;
        this.updaedById = input14;
        this.createdAt = input15;
        this.updatedAt = input16;
        this.and = input17;
        this.or = input18;
        this.not = input19;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelCustomPropertyDefinitionsFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelCustomDataTypeInput dataType() {
        return this.dataType.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelStringInput displayName() {
        return this.displayName.value;
    }

    public ModelIntInput displayOrder() {
        return this.displayOrder.value;
    }

    public ModelIDInput id() {
        return this.id.value;
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
        return new InputFieldMarshaller() { // from class: type.ModelCustomPropertyDefinitionsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomPropertyDefinitionsFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelCustomPropertyDefinitionsFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelCustomPropertyDefinitionsFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCustomPropertyDefinitionsFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCustomPropertyDefinitionsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.propertyName.defined) {
                    inputFieldWriter.writeObject("propertyName", ModelCustomPropertyDefinitionsFilterInput.this.propertyName.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsFilterInput.this.propertyName.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.displayName.defined) {
                    inputFieldWriter.writeObject("displayName", ModelCustomPropertyDefinitionsFilterInput.this.displayName.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsFilterInput.this.displayName.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelCustomPropertyDefinitionsFilterInput.this.description.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsFilterInput.this.description.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.scalarType.defined) {
                    inputFieldWriter.writeObject("scalarType", ModelCustomPropertyDefinitionsFilterInput.this.scalarType.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsFilterInput.this.scalarType.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.dataType.defined) {
                    inputFieldWriter.writeObject("dataType", ModelCustomPropertyDefinitionsFilterInput.this.dataType.value != 0 ? ((ModelCustomDataTypeInput) ModelCustomPropertyDefinitionsFilterInput.this.dataType.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.isMultiple.defined) {
                    inputFieldWriter.writeObject("isMultiple", ModelCustomPropertyDefinitionsFilterInput.this.isMultiple.value != 0 ? ((ModelBooleanInput) ModelCustomPropertyDefinitionsFilterInput.this.isMultiple.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeObject("parentObjectType", ModelCustomPropertyDefinitionsFilterInput.this.parentObjectType.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsFilterInput.this.parentObjectType.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.isSystemProperty.defined) {
                    inputFieldWriter.writeObject("isSystemProperty", ModelCustomPropertyDefinitionsFilterInput.this.isSystemProperty.value != 0 ? ((ModelBooleanInput) ModelCustomPropertyDefinitionsFilterInput.this.isSystemProperty.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.isArchived.defined) {
                    inputFieldWriter.writeObject("isArchived", ModelCustomPropertyDefinitionsFilterInput.this.isArchived.value != 0 ? ((ModelBooleanInput) ModelCustomPropertyDefinitionsFilterInput.this.isArchived.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.displayOrder.defined) {
                    inputFieldWriter.writeObject("displayOrder", ModelCustomPropertyDefinitionsFilterInput.this.displayOrder.value != 0 ? ((ModelIntInput) ModelCustomPropertyDefinitionsFilterInput.this.displayOrder.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelCustomPropertyDefinitionsFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelCustomPropertyDefinitionsFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.updaedById.defined) {
                    inputFieldWriter.writeObject("updaedById", ModelCustomPropertyDefinitionsFilterInput.this.updaedById.value != 0 ? ((ModelIDInput) ModelCustomPropertyDefinitionsFilterInput.this.updaedById.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCustomPropertyDefinitionsFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCustomPropertyDefinitionsFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCustomPropertyDefinitionsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCustomPropertyDefinitionsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyDefinitionsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomPropertyDefinitionsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyDefinitionsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCustomPropertyDefinitionsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCustomPropertyDefinitionsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCustomPropertyDefinitionsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCustomPropertyDefinitionsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCustomPropertyDefinitionsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCustomPropertyDefinitionsFilterInput.this.not.value != 0 ? ((ModelCustomPropertyDefinitionsFilterInput) ModelCustomPropertyDefinitionsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCustomPropertyDefinitionsFilterInput not() {
        return this.not.value;
    }

    public List<ModelCustomPropertyDefinitionsFilterInput> or() {
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
