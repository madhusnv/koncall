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
public final class ModelDistributionDefinitionFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelDistributionDefinitionFilterInput>> and;
    private final Input<ModelBooleanInput> assignLeadOwnerToTask;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> description;
    private final Input<ModelDistributedEntityTypeListInput> distributedEntityType;
    private final Input<ModelDistributionCreationTypeInput> distributionCreationType;
    private final Input<ModelIDInput> id;
    private final Input<ModelIfOwnerExistsInput> ifOwnerExists;
    private final Input<ModelStringInput> name;
    private final Input<ModelDistributionDefinitionFilterInput> not;
    private final Input<List<ModelDistributionDefinitionFilterInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelBooleanInput> remeberAssigneeInDistributionScope;
    private final Input<ModelBooleanInput> remeberAssigneeInGlobalScope;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelDistributionDefinitionFilterInput>> and = Input.absent();
        private Input<List<ModelDistributionDefinitionFilterInput>> or = Input.absent();
        private Input<ModelDistributionDefinitionFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelDistributionDefinitionFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder assignLeadOwnerToTask(ModelBooleanInput modelBooleanInput) {
            this.assignLeadOwnerToTask = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public ModelDistributionDefinitionFilterInput build() {
            return new ModelDistributionDefinitionFilterInput(this.id, this.accountId, this.name, this.description, this.distributedEntityType, this.ifOwnerExists, this.assignLeadOwnerToTask, this.remeberAssigneeInDistributionScope, this.remeberAssigneeInGlobalScope, this.ownerId, this.distributionCreationType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelDistributionDefinitionFilterInput modelDistributionDefinitionFilterInput) {
            this.not = Input.fromNullable(modelDistributionDefinitionFilterInput);
            return this;
        }

        public Builder or(List<ModelDistributionDefinitionFilterInput> list) {
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

    public ModelDistributionDefinitionFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelDistributedEntityTypeListInput> input5, Input<ModelIfOwnerExistsInput> input6, Input<ModelBooleanInput> input7, Input<ModelBooleanInput> input8, Input<ModelBooleanInput> input9, Input<ModelIDInput> input10, Input<ModelDistributionCreationTypeInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<List<ModelDistributionDefinitionFilterInput>> input14, Input<List<ModelDistributionDefinitionFilterInput>> input15, Input<ModelDistributionDefinitionFilterInput> input16) {
        this.id = input;
        this.accountId = input2;
        this.name = input3;
        this.description = input4;
        this.distributedEntityType = input5;
        this.ifOwnerExists = input6;
        this.assignLeadOwnerToTask = input7;
        this.remeberAssigneeInDistributionScope = input8;
        this.remeberAssigneeInGlobalScope = input9;
        this.ownerId = input10;
        this.distributionCreationType = input11;
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

    public List<ModelDistributionDefinitionFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelIfOwnerExistsInput ifOwnerExists() {
        return this.ifOwnerExists.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDistributionDefinitionFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDistributionDefinitionFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelDistributionDefinitionFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelDistributionDefinitionFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelDistributionDefinitionFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelDistributionDefinitionFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelDistributionDefinitionFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelDistributionDefinitionFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelDistributionDefinitionFilterInput.this.description.value != 0 ? ((ModelStringInput) ModelDistributionDefinitionFilterInput.this.description.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.distributedEntityType.defined) {
                    inputFieldWriter.writeObject("distributedEntityType", ModelDistributionDefinitionFilterInput.this.distributedEntityType.value != 0 ? ((ModelDistributedEntityTypeListInput) ModelDistributionDefinitionFilterInput.this.distributedEntityType.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.ifOwnerExists.defined) {
                    inputFieldWriter.writeObject("ifOwnerExists", ModelDistributionDefinitionFilterInput.this.ifOwnerExists.value != 0 ? ((ModelIfOwnerExistsInput) ModelDistributionDefinitionFilterInput.this.ifOwnerExists.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.assignLeadOwnerToTask.defined) {
                    inputFieldWriter.writeObject("assignLeadOwnerToTask", ModelDistributionDefinitionFilterInput.this.assignLeadOwnerToTask.value != 0 ? ((ModelBooleanInput) ModelDistributionDefinitionFilterInput.this.assignLeadOwnerToTask.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.remeberAssigneeInDistributionScope.defined) {
                    inputFieldWriter.writeObject("remeberAssigneeInDistributionScope", ModelDistributionDefinitionFilterInput.this.remeberAssigneeInDistributionScope.value != 0 ? ((ModelBooleanInput) ModelDistributionDefinitionFilterInput.this.remeberAssigneeInDistributionScope.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.remeberAssigneeInGlobalScope.defined) {
                    inputFieldWriter.writeObject("remeberAssigneeInGlobalScope", ModelDistributionDefinitionFilterInput.this.remeberAssigneeInGlobalScope.value != 0 ? ((ModelBooleanInput) ModelDistributionDefinitionFilterInput.this.remeberAssigneeInGlobalScope.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelDistributionDefinitionFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelDistributionDefinitionFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.distributionCreationType.defined) {
                    inputFieldWriter.writeObject("distributionCreationType", ModelDistributionDefinitionFilterInput.this.distributionCreationType.value != 0 ? ((ModelDistributionCreationTypeInput) ModelDistributionDefinitionFilterInput.this.distributionCreationType.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelDistributionDefinitionFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelDistributionDefinitionFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelDistributionDefinitionFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelDistributionDefinitionFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelDistributionDefinitionFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDistributionDefinitionFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDistributionDefinitionFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDistributionDefinitionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelDistributionDefinitionFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDistributionDefinitionFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDistributionDefinitionFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelDistributionDefinitionFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelDistributionDefinitionFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelDistributionDefinitionFilterInput.this.not.value != 0 ? ((ModelDistributionDefinitionFilterInput) ModelDistributionDefinitionFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelDistributionDefinitionFilterInput not() {
        return this.not.value;
    }

    public List<ModelDistributionDefinitionFilterInput> or() {
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
