package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelTeamMemberConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelTeamMemberConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> memberId;
    private final Input<ModelTeamMemberTypeInput> memberType;
    private final Input<ModelTeamMemberConditionInput> not;
    private final Input<List<ModelTeamMemberConditionInput>> or;
    private final Input<ModelIDInput> teamId;
    private final Input<ModelTeamRoleInput> teamRole;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> teamId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelTeamRoleInput> teamRole = Input.absent();
        private Input<ModelIDInput> memberId = Input.absent();
        private Input<ModelTeamMemberTypeInput> memberType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelTeamMemberConditionInput>> and = Input.absent();
        private Input<List<ModelTeamMemberConditionInput>> or = Input.absent();
        private Input<ModelTeamMemberConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelTeamMemberConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelTeamMemberConditionInput build() {
            return new ModelTeamMemberConditionInput(this.teamId, this.accountId, this.teamRole, this.memberId, this.memberType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder memberId(ModelIDInput modelIDInput) {
            this.memberId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder memberType(ModelTeamMemberTypeInput modelTeamMemberTypeInput) {
            this.memberType = Input.fromNullable(modelTeamMemberTypeInput);
            return this;
        }

        public Builder not(ModelTeamMemberConditionInput modelTeamMemberConditionInput) {
            this.not = Input.fromNullable(modelTeamMemberConditionInput);
            return this;
        }

        public Builder or(List<ModelTeamMemberConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder teamId(ModelIDInput modelIDInput) {
            this.teamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder teamRole(ModelTeamRoleInput modelTeamRoleInput) {
            this.teamRole = Input.fromNullable(modelTeamRoleInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelTeamMemberConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelTeamRoleInput> input3, Input<ModelIDInput> input4, Input<ModelTeamMemberTypeInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<List<ModelTeamMemberConditionInput>> input8, Input<List<ModelTeamMemberConditionInput>> input9, Input<ModelTeamMemberConditionInput> input10) {
        this.teamId = input;
        this.accountId = input2;
        this.teamRole = input3;
        this.memberId = input4;
        this.memberType = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
        this.and = input8;
        this.or = input9;
        this.not = input10;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelTeamMemberConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelTeamMemberConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelTeamMemberConditionInput.this.teamId.defined) {
                    inputFieldWriter.writeObject("teamId", ModelTeamMemberConditionInput.this.teamId.value != 0 ? ((ModelIDInput) ModelTeamMemberConditionInput.this.teamId.value).marshaller() : null);
                }
                if (ModelTeamMemberConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelTeamMemberConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelTeamMemberConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelTeamMemberConditionInput.this.teamRole.defined) {
                    inputFieldWriter.writeObject("teamRole", ModelTeamMemberConditionInput.this.teamRole.value != 0 ? ((ModelTeamRoleInput) ModelTeamMemberConditionInput.this.teamRole.value).marshaller() : null);
                }
                if (ModelTeamMemberConditionInput.this.memberId.defined) {
                    inputFieldWriter.writeObject("memberId", ModelTeamMemberConditionInput.this.memberId.value != 0 ? ((ModelIDInput) ModelTeamMemberConditionInput.this.memberId.value).marshaller() : null);
                }
                if (ModelTeamMemberConditionInput.this.memberType.defined) {
                    inputFieldWriter.writeObject("memberType", ModelTeamMemberConditionInput.this.memberType.value != 0 ? ((ModelTeamMemberTypeInput) ModelTeamMemberConditionInput.this.memberType.value).marshaller() : null);
                }
                if (ModelTeamMemberConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelTeamMemberConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelTeamMemberConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelTeamMemberConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelTeamMemberConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelTeamMemberConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelTeamMemberConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelTeamMemberConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelTeamMemberConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelTeamMemberConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelTeamMemberConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelTeamMemberConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelTeamMemberConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelTeamMemberConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelTeamMemberConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelTeamMemberConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelTeamMemberConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelTeamMemberConditionInput.this.not.value != 0 ? ((ModelTeamMemberConditionInput) ModelTeamMemberConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIDInput memberId() {
        return this.memberId.value;
    }

    public ModelTeamMemberTypeInput memberType() {
        return this.memberType.value;
    }

    public ModelTeamMemberConditionInput not() {
        return this.not.value;
    }

    public List<ModelTeamMemberConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput teamId() {
        return this.teamId.value;
    }

    public ModelTeamRoleInput teamRole() {
        return this.teamRole.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
