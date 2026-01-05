package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateTeamMemberInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final String id;
    private final Input<Boolean> isDefaultTeam;
    private final Input<String> memberTeamId;
    private final Input<TeamMemberType> memberType;
    private final Input<String> teamId;
    private final Input<TeamRole> teamRole;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<String> userId;

    public static final class Builder {
        private String id;
        private Input<String> teamId = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<TeamRole> teamRole = Input.absent();
        private Input<String> updatedById = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> userId = Input.absent();
        private Input<String> memberTeamId = Input.absent();
        private Input<TeamMemberType> memberType = Input.absent();
        private Input<Boolean> isDefaultTeam = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateTeamMemberInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateTeamMemberInput(this.id, this.teamId, this.accountId, this.teamRole, this.updatedById, this.createdById, this.userId, this.memberTeamId, this.memberType, this.isDefaultTeam, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder isDefaultTeam(Boolean bool) {
            this.isDefaultTeam = Input.fromNullable(bool);
            return this;
        }

        public Builder memberTeamId(String str) {
            this.memberTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder memberType(TeamMemberType teamMemberType) {
            this.memberType = Input.fromNullable(teamMemberType);
            return this;
        }

        public Builder teamId(String str) {
            this.teamId = Input.fromNullable(str);
            return this;
        }

        public Builder teamRole(TeamRole teamRole) {
            this.teamRole = Input.fromNullable(teamRole);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedById(String str) {
            this.updatedById = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateTeamMemberInput(String str, Input<String> input, Input<String> input2, Input<TeamRole> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<TeamMemberType> input8, Input<Boolean> input9, Input<String> input10, Input<String> input11) {
        this.id = str;
        this.teamId = input;
        this.accountId = input2;
        this.teamRole = input3;
        this.updatedById = input4;
        this.createdById = input5;
        this.userId = input6;
        this.memberTeamId = input7;
        this.memberType = input8;
        this.isDefaultTeam = input9;
        this.createdAt = input10;
        this.updatedAt = input11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String id() {
        return this.id;
    }

    public Boolean isDefaultTeam() {
        return this.isDefaultTeam.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateTeamMemberInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateTeamMemberInput.this.id);
                if (UpdateTeamMemberInput.this.teamId.defined) {
                    inputFieldWriter.writeString("teamId", (String) UpdateTeamMemberInput.this.teamId.value);
                }
                if (UpdateTeamMemberInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateTeamMemberInput.this.accountId.value);
                }
                if (UpdateTeamMemberInput.this.teamRole.defined) {
                    inputFieldWriter.writeString("teamRole", UpdateTeamMemberInput.this.teamRole.value != 0 ? ((TeamRole) UpdateTeamMemberInput.this.teamRole.value).name() : null);
                }
                if (UpdateTeamMemberInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateTeamMemberInput.this.updatedById.value);
                }
                if (UpdateTeamMemberInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateTeamMemberInput.this.createdById.value);
                }
                if (UpdateTeamMemberInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) UpdateTeamMemberInput.this.userId.value);
                }
                if (UpdateTeamMemberInput.this.memberTeamId.defined) {
                    inputFieldWriter.writeString("memberTeamId", (String) UpdateTeamMemberInput.this.memberTeamId.value);
                }
                if (UpdateTeamMemberInput.this.memberType.defined) {
                    inputFieldWriter.writeString("memberType", UpdateTeamMemberInput.this.memberType.value != 0 ? ((TeamMemberType) UpdateTeamMemberInput.this.memberType.value).name() : null);
                }
                if (UpdateTeamMemberInput.this.isDefaultTeam.defined) {
                    inputFieldWriter.writeBoolean("isDefaultTeam", (Boolean) UpdateTeamMemberInput.this.isDefaultTeam.value);
                }
                if (UpdateTeamMemberInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateTeamMemberInput.this.createdAt.value);
                }
                if (UpdateTeamMemberInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateTeamMemberInput.this.updatedAt.value);
                }
            }
        };
    }

    public String memberTeamId() {
        return this.memberTeamId.value;
    }

    public TeamMemberType memberType() {
        return this.memberType.value;
    }

    public String teamId() {
        return this.teamId.value;
    }

    public TeamRole teamRole() {
        return this.teamRole.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }

    public String userId() {
        return this.userId.value;
    }
}
