package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateDistributionDefinitionInput implements InputType {
    private final Input<String> accountId;
    private final Input<Boolean> assignLeadOwnerToTask;
    private final Input<String> createdAt;
    private final Input<String> description;
    private final Input<List<DistributedEntityType>> distributedEntityType;
    private final Input<DistributionCreationType> distributionCreationType;
    private final String id;
    private final Input<IfOwnerExists> ifOwnerExists;
    private final Input<String> name;
    private final Input<String> ownerId;
    private final Input<Boolean> remeberAssigneeInDistributionScope;
    private final Input<Boolean> remeberAssigneeInGlobalScope;
    private final Input<List<AssignmentRulesetInput>> rule;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> description = Input.absent();
        private Input<List<DistributedEntityType>> distributedEntityType = Input.absent();
        private Input<IfOwnerExists> ifOwnerExists = Input.absent();
        private Input<Boolean> assignLeadOwnerToTask = Input.absent();
        private Input<Boolean> remeberAssigneeInDistributionScope = Input.absent();
        private Input<Boolean> remeberAssigneeInGlobalScope = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<List<AssignmentRulesetInput>> rule = Input.absent();
        private Input<DistributionCreationType> distributionCreationType = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder assignLeadOwnerToTask(Boolean bool) {
            this.assignLeadOwnerToTask = Input.fromNullable(bool);
            return this;
        }

        public UpdateDistributionDefinitionInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateDistributionDefinitionInput(this.id, this.accountId, this.name, this.description, this.distributedEntityType, this.ifOwnerExists, this.assignLeadOwnerToTask, this.remeberAssigneeInDistributionScope, this.remeberAssigneeInGlobalScope, this.ownerId, this.rule, this.distributionCreationType, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder distributedEntityType(List<DistributedEntityType> list) {
            this.distributedEntityType = Input.fromNullable(list);
            return this;
        }

        public Builder distributionCreationType(DistributionCreationType distributionCreationType) {
            this.distributionCreationType = Input.fromNullable(distributionCreationType);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder ifOwnerExists(IfOwnerExists ifOwnerExists) {
            this.ifOwnerExists = Input.fromNullable(ifOwnerExists);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder remeberAssigneeInDistributionScope(Boolean bool) {
            this.remeberAssigneeInDistributionScope = Input.fromNullable(bool);
            return this;
        }

        public Builder remeberAssigneeInGlobalScope(Boolean bool) {
            this.remeberAssigneeInGlobalScope = Input.fromNullable(bool);
            return this;
        }

        public Builder rule(List<AssignmentRulesetInput> list) {
            this.rule = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateDistributionDefinitionInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<List<DistributedEntityType>> input4, Input<IfOwnerExists> input5, Input<Boolean> input6, Input<Boolean> input7, Input<Boolean> input8, Input<String> input9, Input<List<AssignmentRulesetInput>> input10, Input<DistributionCreationType> input11, Input<String> input12, Input<String> input13) {
        this.id = str;
        this.accountId = input;
        this.name = input2;
        this.description = input3;
        this.distributedEntityType = input4;
        this.ifOwnerExists = input5;
        this.assignLeadOwnerToTask = input6;
        this.remeberAssigneeInDistributionScope = input7;
        this.remeberAssigneeInGlobalScope = input8;
        this.ownerId = input9;
        this.rule = input10;
        this.distributionCreationType = input11;
        this.createdAt = input12;
        this.updatedAt = input13;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public Boolean assignLeadOwnerToTask() {
        return this.assignLeadOwnerToTask.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String description() {
        return this.description.value;
    }

    public List<DistributedEntityType> distributedEntityType() {
        return this.distributedEntityType.value;
    }

    public DistributionCreationType distributionCreationType() {
        return this.distributionCreationType.value;
    }

    public String id() {
        return this.id;
    }

    public IfOwnerExists ifOwnerExists() {
        return this.ifOwnerExists.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateDistributionDefinitionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateDistributionDefinitionInput.this.id);
                if (UpdateDistributionDefinitionInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateDistributionDefinitionInput.this.accountId.value);
                }
                if (UpdateDistributionDefinitionInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) UpdateDistributionDefinitionInput.this.name.value);
                }
                if (UpdateDistributionDefinitionInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) UpdateDistributionDefinitionInput.this.description.value);
                }
                if (UpdateDistributionDefinitionInput.this.distributedEntityType.defined) {
                    inputFieldWriter.writeList("distributedEntityType", UpdateDistributionDefinitionInput.this.distributedEntityType.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateDistributionDefinitionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateDistributionDefinitionInput.this.distributedEntityType.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString(((DistributedEntityType) it.next()).name());
                            }
                        }
                    } : null);
                }
                if (UpdateDistributionDefinitionInput.this.ifOwnerExists.defined) {
                    inputFieldWriter.writeString("ifOwnerExists", UpdateDistributionDefinitionInput.this.ifOwnerExists.value != 0 ? ((IfOwnerExists) UpdateDistributionDefinitionInput.this.ifOwnerExists.value).name() : null);
                }
                if (UpdateDistributionDefinitionInput.this.assignLeadOwnerToTask.defined) {
                    inputFieldWriter.writeBoolean("assignLeadOwnerToTask", (Boolean) UpdateDistributionDefinitionInput.this.assignLeadOwnerToTask.value);
                }
                if (UpdateDistributionDefinitionInput.this.remeberAssigneeInDistributionScope.defined) {
                    inputFieldWriter.writeBoolean("remeberAssigneeInDistributionScope", (Boolean) UpdateDistributionDefinitionInput.this.remeberAssigneeInDistributionScope.value);
                }
                if (UpdateDistributionDefinitionInput.this.remeberAssigneeInGlobalScope.defined) {
                    inputFieldWriter.writeBoolean("remeberAssigneeInGlobalScope", (Boolean) UpdateDistributionDefinitionInput.this.remeberAssigneeInGlobalScope.value);
                }
                if (UpdateDistributionDefinitionInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) UpdateDistributionDefinitionInput.this.ownerId.value);
                }
                if (UpdateDistributionDefinitionInput.this.rule.defined) {
                    inputFieldWriter.writeList("rule", UpdateDistributionDefinitionInput.this.rule.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateDistributionDefinitionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateDistributionDefinitionInput.this.rule.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((AssignmentRulesetInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateDistributionDefinitionInput.this.distributionCreationType.defined) {
                    inputFieldWriter.writeString("distributionCreationType", UpdateDistributionDefinitionInput.this.distributionCreationType.value != 0 ? ((DistributionCreationType) UpdateDistributionDefinitionInput.this.distributionCreationType.value).name() : null);
                }
                if (UpdateDistributionDefinitionInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateDistributionDefinitionInput.this.createdAt.value);
                }
                if (UpdateDistributionDefinitionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateDistributionDefinitionInput.this.updatedAt.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public Boolean remeberAssigneeInDistributionScope() {
        return this.remeberAssigneeInDistributionScope.value;
    }

    public Boolean remeberAssigneeInGlobalScope() {
        return this.remeberAssigneeInGlobalScope.value;
    }

    public List<AssignmentRulesetInput> rule() {
        return this.rule.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
