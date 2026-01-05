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
public final class CreateDistributionDefinitionInput implements InputType {
    private final String accountId;
    private final Input<Boolean> assignLeadOwnerToTask;
    private final Input<String> createdAt;
    private final String description;
    private final List<DistributedEntityType> distributedEntityType;
    private final Input<DistributionCreationType> distributionCreationType;
    private final Input<String> id;
    private final Input<IfOwnerExists> ifOwnerExists;
    private final String name;
    private final String ownerId;
    private final Input<Boolean> remeberAssigneeInDistributionScope;
    private final Input<Boolean> remeberAssigneeInGlobalScope;
    private final Input<List<AssignmentRulesetInput>> rule;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String description;
        private List<DistributedEntityType> distributedEntityType;
        private String name;
        private String ownerId;
        private Input<String> id = Input.absent();
        private Input<IfOwnerExists> ifOwnerExists = Input.absent();
        private Input<Boolean> assignLeadOwnerToTask = Input.absent();
        private Input<Boolean> remeberAssigneeInDistributionScope = Input.absent();
        private Input<Boolean> remeberAssigneeInGlobalScope = Input.absent();
        private Input<List<AssignmentRulesetInput>> rule = Input.absent();
        private Input<DistributionCreationType> distributionCreationType = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder assignLeadOwnerToTask(Boolean bool) {
            this.assignLeadOwnerToTask = Input.fromNullable(bool);
            return this;
        }

        public CreateDistributionDefinitionInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.name, "name == null");
            Utils.checkNotNull(this.description, "description == null");
            Utils.checkNotNull(this.distributedEntityType, "distributedEntityType == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            return new CreateDistributionDefinitionInput(this.id, this.accountId, this.name, this.description, this.distributedEntityType, this.ifOwnerExists, this.assignLeadOwnerToTask, this.remeberAssigneeInDistributionScope, this.remeberAssigneeInGlobalScope, this.ownerId, this.rule, this.distributionCreationType, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder description(String str) {
            this.description = str;
            return this;
        }

        public Builder distributedEntityType(List<DistributedEntityType> list) {
            this.distributedEntityType = list;
            return this;
        }

        public Builder distributionCreationType(DistributionCreationType distributionCreationType) {
            this.distributionCreationType = Input.fromNullable(distributionCreationType);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder ifOwnerExists(IfOwnerExists ifOwnerExists) {
            this.ifOwnerExists = Input.fromNullable(ifOwnerExists);
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = str;
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

    public CreateDistributionDefinitionInput(Input<String> input, String str, String str2, String str3, List<DistributedEntityType> list, Input<IfOwnerExists> input2, Input<Boolean> input3, Input<Boolean> input4, Input<Boolean> input5, String str4, Input<List<AssignmentRulesetInput>> input6, Input<DistributionCreationType> input7, Input<String> input8, Input<String> input9) {
        this.id = input;
        this.accountId = str;
        this.name = str2;
        this.description = str3;
        this.distributedEntityType = list;
        this.ifOwnerExists = input2;
        this.assignLeadOwnerToTask = input3;
        this.remeberAssigneeInDistributionScope = input4;
        this.remeberAssigneeInGlobalScope = input5;
        this.ownerId = str4;
        this.rule = input6;
        this.distributionCreationType = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public Boolean assignLeadOwnerToTask() {
        return this.assignLeadOwnerToTask.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String description() {
        return this.description;
    }

    public List<DistributedEntityType> distributedEntityType() {
        return this.distributedEntityType;
    }

    public DistributionCreationType distributionCreationType() {
        return this.distributionCreationType.value;
    }

    public String id() {
        return this.id.value;
    }

    public IfOwnerExists ifOwnerExists() {
        return this.ifOwnerExists.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateDistributionDefinitionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateDistributionDefinitionInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateDistributionDefinitionInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateDistributionDefinitionInput.this.accountId);
                inputFieldWriter.writeString("name", CreateDistributionDefinitionInput.this.name);
                inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, CreateDistributionDefinitionInput.this.description);
                inputFieldWriter.writeList("distributedEntityType", new InputFieldWriter.ListWriter() { // from class: type.CreateDistributionDefinitionInput.1.1
                    @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                    public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                        Iterator it = CreateDistributionDefinitionInput.this.distributedEntityType.iterator();
                        while (it.hasNext()) {
                            listItemWriter.writeString(((DistributedEntityType) it.next()).name());
                        }
                    }
                });
                if (CreateDistributionDefinitionInput.this.ifOwnerExists.defined) {
                    inputFieldWriter.writeString("ifOwnerExists", CreateDistributionDefinitionInput.this.ifOwnerExists.value != 0 ? ((IfOwnerExists) CreateDistributionDefinitionInput.this.ifOwnerExists.value).name() : null);
                }
                if (CreateDistributionDefinitionInput.this.assignLeadOwnerToTask.defined) {
                    inputFieldWriter.writeBoolean("assignLeadOwnerToTask", (Boolean) CreateDistributionDefinitionInput.this.assignLeadOwnerToTask.value);
                }
                if (CreateDistributionDefinitionInput.this.remeberAssigneeInDistributionScope.defined) {
                    inputFieldWriter.writeBoolean("remeberAssigneeInDistributionScope", (Boolean) CreateDistributionDefinitionInput.this.remeberAssigneeInDistributionScope.value);
                }
                if (CreateDistributionDefinitionInput.this.remeberAssigneeInGlobalScope.defined) {
                    inputFieldWriter.writeBoolean("remeberAssigneeInGlobalScope", (Boolean) CreateDistributionDefinitionInput.this.remeberAssigneeInGlobalScope.value);
                }
                inputFieldWriter.writeString("ownerId", CreateDistributionDefinitionInput.this.ownerId);
                if (CreateDistributionDefinitionInput.this.rule.defined) {
                    inputFieldWriter.writeList("rule", CreateDistributionDefinitionInput.this.rule.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateDistributionDefinitionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateDistributionDefinitionInput.this.rule.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((AssignmentRulesetInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateDistributionDefinitionInput.this.distributionCreationType.defined) {
                    inputFieldWriter.writeString("distributionCreationType", CreateDistributionDefinitionInput.this.distributionCreationType.value != 0 ? ((DistributionCreationType) CreateDistributionDefinitionInput.this.distributionCreationType.value).name() : null);
                }
                if (CreateDistributionDefinitionInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateDistributionDefinitionInput.this.createdAt.value);
                }
                if (CreateDistributionDefinitionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateDistributionDefinitionInput.this.updatedAt.value);
                }
            }
        };
    }

    public String name() {
        return this.name;
    }

    public String ownerId() {
        return this.ownerId;
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
