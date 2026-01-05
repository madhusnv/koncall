package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDistributionDefinitionConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelDistributionDefinitionConditionInput>> and;
    private final Input<ModelBooleanInput> assignLeadOwnerToTask;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> description;
    private final Input<ModelDistributedEntityTypeListInput> distributedEntityType;
    private final Input<ModelDistributionCreationTypeInput> distributionCreationType;
    private final Input<ModelIfOwnerExistsInput> ifOwnerExists;
    private final Input<ModelStringInput> name;
    private final Input<ModelDistributionDefinitionConditionInput> not;
    private final Input<List<ModelDistributionDefinitionConditionInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelBooleanInput> remeberAssigneeInDistributionScope;
    private final Input<ModelBooleanInput> remeberAssigneeInGlobalScope;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelDistributedEntityTypeListInput> distributedEntityType = Input.absent();
        private Input<ModelIfOwnerExistsInput> ifOwnerExists = Input.absent();
        private Input<ModelBooleanInput> assignLeadOwnerToTask = Input.absent();
        private Input<ModelBooleanInput> remeberAssigneeInDistributionScope = Input.absent();
        private Input<ModelBooleanInput> remeberAssigneeInGlobalScope = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelDistributionCreationTypeInput> distributionCreationType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelDistributionDefinitionConditionInput>> and = Input.absent();
        private Input<List<ModelDistributionDefinitionConditionInput>> or = Input.absent();
        private Input<ModelDistributionDefinitionConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelDistributionDefinitionConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder assignLeadOwnerToTask(ModelBooleanInput modelBooleanInput) {
            this.assignLeadOwnerToTask = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public ModelDistributionDefinitionConditionInput build() {
            return new ModelDistributionDefinitionConditionInput(this.accountId, this.name, this.description, this.distributedEntityType, this.ifOwnerExists, this.assignLeadOwnerToTask, this.remeberAssigneeInDistributionScope, this.remeberAssigneeInGlobalScope, this.ownerId, this.distributionCreationType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder description(ModelStringInput modelStringInput) {
            this.description = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder distributedEntityType(ModelDistributedEntityTypeListInput modelDistributedEntityTypeListInput) {
            this.distributedEntityType = Input.fromNullable(modelDistributedEntityTypeListInput);
            return this;
        }

        public Builder distributionCreationType(ModelDistributionCreationTypeInput modelDistributionCreationTypeInput) {
            this.distributionCreationType = Input.fromNullable(modelDistributionCreationTypeInput);
            return this;
        }

        public Builder ifOwnerExists(ModelIfOwnerExistsInput modelIfOwnerExistsInput) {
            this.ifOwnerExists = Input.fromNullable(modelIfOwnerExistsInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelDistributionDefinitionConditionInput modelDistributionDefinitionConditionInput) {
            this.not = Input.fromNullable(modelDistributionDefinitionConditionInput);
            return this;
        }

        public Builder or(List<ModelDistributionDefinitionConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder remeberAssigneeInDistributionScope(ModelBooleanInput modelBooleanInput) {
            this.remeberAssigneeInDistributionScope = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder remeberAssigneeInGlobalScope(ModelBooleanInput modelBooleanInput) {
            this.remeberAssigneeInGlobalScope = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelDistributionDefinitionConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelDistributedEntityTypeListInput> input4, Input<ModelIfOwnerExistsInput> input5, Input<ModelBooleanInput> input6, Input<ModelBooleanInput> input7, Input<ModelBooleanInput> input8, Input<ModelIDInput> input9, Input<ModelDistributionCreationTypeInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<List<ModelDistributionDefinitionConditionInput>> input13, Input<List<ModelDistributionDefinitionConditionInput>> input14, Input<ModelDistributionDefinitionConditionInput> input15) {
        this.accountId = input;
        this.name = input2;
        this.description = input3;
        this.distributedEntityType = input4;
        this.ifOwnerExists = input5;
        this.assignLeadOwnerToTask = input6;
        this.remeberAssigneeInDistributionScope = input7;
        this.remeberAssigneeInGlobalScope = input8;
        this.ownerId = input9;
        this.distributionCreationType = input10;
        this.createdAt = input11;
        this.updatedAt = input12;
        this.and = input13;
        this.or = input14;
        this.not = input15;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelDistributionDefinitionConditionInput> and() {
        return this.and.value;
    }

    public ModelBooleanInput assignLeadOwnerToTask() {
        return this.assignLeadOwnerToTask.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelDistributedEntityTypeListInput distributedEntityType() {
        return this.distributedEntityType.value;
    }

    public ModelDistributionCreationTypeInput distributionCreationType() {
        return this.distributionCreationType.value;
    }

    public ModelIfOwnerExistsInput ifOwnerExists() {
        return this.ifOwnerExists.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDistributionDefinitionConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDistributionDefinitionConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelDistributionDefinitionConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelDistributionDefinitionConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelDistributionDefinitionConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelDistributionDefinitionConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelDistributionDefinitionConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelDistributionDefinitionConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.distributedEntityType.defined) {
                    inputFieldWriter.writeObject("distributedEntityType", ModelDistributionDefinitionConditionInput.this.distributedEntityType.value != 0 ? ((ModelDistributedEntityTypeListInput) ModelDistributionDefinitionConditionInput.this.distributedEntityType.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.ifOwnerExists.defined) {
                    inputFieldWriter.writeObject("ifOwnerExists", ModelDistributionDefinitionConditionInput.this.ifOwnerExists.value != 0 ? ((ModelIfOwnerExistsInput) ModelDistributionDefinitionConditionInput.this.ifOwnerExists.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.assignLeadOwnerToTask.defined) {
                    inputFieldWriter.writeObject("assignLeadOwnerToTask", ModelDistributionDefinitionConditionInput.this.assignLeadOwnerToTask.value != 0 ? ((ModelBooleanInput) ModelDistributionDefinitionConditionInput.this.assignLeadOwnerToTask.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.remeberAssigneeInDistributionScope.defined) {
                    inputFieldWriter.writeObject("remeberAssigneeInDistributionScope", ModelDistributionDefinitionConditionInput.this.remeberAssigneeInDistributionScope.value != 0 ? ((ModelBooleanInput) ModelDistributionDefinitionConditionInput.this.remeberAssigneeInDistributionScope.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.remeberAssigneeInGlobalScope.defined) {
                    inputFieldWriter.writeObject("remeberAssigneeInGlobalScope", ModelDistributionDefinitionConditionInput.this.remeberAssigneeInGlobalScope.value != 0 ? ((ModelBooleanInput) ModelDistributionDefinitionConditionInput.this.remeberAssigneeInGlobalScope.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelDistributionDefinitionConditionInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelDistributionDefinitionConditionInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.distributionCreationType.defined) {
                    inputFieldWriter.writeObject("distributionCreationType", ModelDistributionDefinitionConditionInput.this.distributionCreationType.value != 0 ? ((ModelDistributionCreationTypeInput) ModelDistributionDefinitionConditionInput.this.distributionCreationType.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelDistributionDefinitionConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelDistributionDefinitionConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelDistributionDefinitionConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelDistributionDefinitionConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelDistributionDefinitionConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDistributionDefinitionConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDistributionDefinitionConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDistributionDefinitionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelDistributionDefinitionConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDistributionDefinitionConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDistributionDefinitionConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDistributionDefinitionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDistributionDefinitionConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelDistributionDefinitionConditionInput.this.not.value != 0 ? ((ModelDistributionDefinitionConditionInput) ModelDistributionDefinitionConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelDistributionDefinitionConditionInput not() {
        return this.not.value;
    }

    public List<ModelDistributionDefinitionConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelBooleanInput remeberAssigneeInDistributionScope() {
        return this.remeberAssigneeInDistributionScope.value;
    }

    public ModelBooleanInput remeberAssigneeInGlobalScope() {
        return this.remeberAssigneeInGlobalScope.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
