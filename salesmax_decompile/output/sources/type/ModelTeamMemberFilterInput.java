package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelTeamMemberFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelTeamMemberFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelIDInput> id;
    private final Input<ModelBooleanInput> isDefaultTeam;
    private final Input<ModelIDInput> memberTeamId;
    private final Input<ModelTeamMemberTypeInput> memberType;
    private final Input<ModelTeamMemberFilterInput> not;
    private final Input<List<ModelTeamMemberFilterInput>> or;
    private final Input<ModelIDInput> teamId;
    private final Input<ModelTeamRoleInput> teamRole;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> teamId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelTeamRoleInput> teamRole = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelIDInput> memberTeamId = Input.absent();
        private Input<ModelTeamMemberTypeInput> memberType = Input.absent();
        private Input<ModelBooleanInput> isDefaultTeam = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelTeamMemberFilterInput>> and = Input.absent();
        private Input<List<ModelTeamMemberFilterInput>> or = Input.absent();
        private Input<ModelTeamMemberFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelTeamMemberFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelTeamMemberFilterInput build() {
            return new ModelTeamMemberFilterInput(this.id, this.teamId, this.accountId, this.teamRole, this.updatedById, this.createdById, this.userId, this.memberTeamId, this.memberType, this.isDefaultTeam, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder isDefaultTeam(ModelBooleanInput modelBooleanInput) {
            this.isDefaultTeam = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder memberTeamId(ModelIDInput modelIDInput) {
            this.memberTeamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder memberType(ModelTeamMemberTypeInput modelTeamMemberTypeInput) {
            this.memberType = Input.fromNullable(modelTeamMemberTypeInput);
            return this;
        }

        public Builder not(ModelTeamMemberFilterInput modelTeamMemberFilterInput) {
            this.not = Input.fromNullable(modelTeamMemberFilterInput);
            return this;
        }

        public Builder or(List<ModelTeamMemberFilterInput> list) {
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

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder userId(ModelIDInput modelIDInput) {
            this.userId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelTeamMemberFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelTeamRoleInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelTeamMemberTypeInput> input9, Input<ModelBooleanInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<List<ModelTeamMemberFilterInput>> input13, Input<List<ModelTeamMemberFilterInput>> input14, Input<ModelTeamMemberFilterInput> input15) {
        this.id = input;
        this.teamId = input2;
        this.accountId = input3;
        this.teamRole = input4;
        this.updatedById = input5;
        this.createdById = input6;
        this.userId = input7;
        this.memberTeamId = input8;
        this.memberType = input9;
        this.isDefaultTeam = input10;
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

    public List<ModelTeamMemberFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelBooleanInput isDefaultTeam() {
        return this.isDefaultTeam.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelTeamMemberFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelTeamMemberFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelTeamMemberFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelTeamMemberFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelTeamMemberFilterInput.this.teamId.defined) {
                    inputFieldWriter.writeObject("teamId", ModelTeamMemberFilterInput.this.teamId.value != 0 ? ((ModelIDInput) ModelTeamMemberFilterInput.this.teamId.value).marshaller() : null);
                }
                if (ModelTeamMemberFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelTeamMemberFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelTeamMemberFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelTeamMemberFilterInput.this.teamRole.defined) {
                    inputFieldWriter.writeObject("teamRole", ModelTeamMemberFilterInput.this.teamRole.value != 0 ? ((ModelTeamRoleInput) ModelTeamMemberFilterInput.this.teamRole.value).marshaller() : null);
                }
                if (ModelTeamMemberFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelTeamMemberFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelTeamMemberFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelTeamMemberFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelTeamMemberFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelTeamMemberFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelTeamMemberFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelTeamMemberFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelTeamMemberFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelTeamMemberFilterInput.this.memberTeamId.defined) {
                    inputFieldWriter.writeObject("memberTeamId", ModelTeamMemberFilterInput.this.memberTeamId.value != 0 ? ((ModelIDInput) ModelTeamMemberFilterInput.this.memberTeamId.value).marshaller() : null);
                }
                if (ModelTeamMemberFilterInput.this.memberType.defined) {
                    inputFieldWriter.writeObject("memberType", ModelTeamMemberFilterInput.this.memberType.value != 0 ? ((ModelTeamMemberTypeInput) ModelTeamMemberFilterInput.this.memberType.value).marshaller() : null);
                }
                if (ModelTeamMemberFilterInput.this.isDefaultTeam.defined) {
                    inputFieldWriter.writeObject("isDefaultTeam", ModelTeamMemberFilterInput.this.isDefaultTeam.value != 0 ? ((ModelBooleanInput) ModelTeamMemberFilterInput.this.isDefaultTeam.value).marshaller() : null);
                }
                if (ModelTeamMemberFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelTeamMemberFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelTeamMemberFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelTeamMemberFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelTeamMemberFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelTeamMemberFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelTeamMemberFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelTeamMemberFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelTeamMemberFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelTeamMemberFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelTeamMemberFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelTeamMemberFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelTeamMemberFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelTeamMemberFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelTeamMemberFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelTeamMemberFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelTeamMemberFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelTeamMemberFilterInput.this.not.value != 0 ? ((ModelTeamMemberFilterInput) ModelTeamMemberFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIDInput memberTeamId() {
        return this.memberTeamId.value;
    }

    public ModelTeamMemberTypeInput memberType() {
        return this.memberType.value;
    }

    public ModelTeamMemberFilterInput not() {
        return this.not.value;
    }

    public List<ModelTeamMemberFilterInput> or() {
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

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }
}
