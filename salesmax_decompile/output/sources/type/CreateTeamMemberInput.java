package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class CreateTeamMemberInput implements InputType {
    private final String accountId;
    private final Input<Boolean> includeMemberTeam;
    private final String memberId;
    private final Input<TeamMemberType> memberType;
    private final String teamId;
    private final TeamRole teamRole;

    public static final class Builder {
        private String accountId;
        private String memberId;
        private String teamId;
        private TeamRole teamRole;
        private Input<TeamMemberType> memberType = Input.absent();
        private Input<Boolean> includeMemberTeam = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateTeamMemberInput build() {
            Utils.checkNotNull(this.teamId, "teamId == null");
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.teamRole, "teamRole == null");
            Utils.checkNotNull(this.memberId, "memberId == null");
            return new CreateTeamMemberInput(this.teamId, this.accountId, this.teamRole, this.memberId, this.memberType, this.includeMemberTeam);
        }

        public Builder includeMemberTeam(Boolean bool) {
            this.includeMemberTeam = Input.fromNullable(bool);
            return this;
        }

        public Builder memberId(String str) {
            this.memberId = str;
            return this;
        }

        public Builder memberType(TeamMemberType teamMemberType) {
            this.memberType = Input.fromNullable(teamMemberType);
            return this;
        }

        public Builder teamId(String str) {
            this.teamId = str;
            return this;
        }

        public Builder teamRole(TeamRole teamRole) {
            this.teamRole = teamRole;
            return this;
        }
    }

    public CreateTeamMemberInput(String str, String str2, TeamRole teamRole, String str3, Input<TeamMemberType> input, Input<Boolean> input2) {
        this.teamId = str;
        this.accountId = str2;
        this.teamRole = teamRole;
        this.memberId = str3;
        this.memberType = input;
        this.includeMemberTeam = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public Boolean includeMemberTeam() {
        return this.includeMemberTeam.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateTeamMemberInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("teamId", CreateTeamMemberInput.this.teamId);
                inputFieldWriter.writeString("accountId", CreateTeamMemberInput.this.accountId);
                inputFieldWriter.writeString("teamRole", CreateTeamMemberInput.this.teamRole.name());
                inputFieldWriter.writeString("memberId", CreateTeamMemberInput.this.memberId);
                if (CreateTeamMemberInput.this.memberType.defined) {
                    inputFieldWriter.writeString("memberType", CreateTeamMemberInput.this.memberType.value != 0 ? ((TeamMemberType) CreateTeamMemberInput.this.memberType.value).name() : null);
                }
                if (CreateTeamMemberInput.this.includeMemberTeam.defined) {
                    inputFieldWriter.writeBoolean("includeMemberTeam", (Boolean) CreateTeamMemberInput.this.includeMemberTeam.value);
                }
            }
        };
    }

    public String memberId() {
        return this.memberId;
    }

    public TeamMemberType memberType() {
        return this.memberType.value;
    }

    public String teamId() {
        return this.teamId;
    }

    public TeamRole teamRole() {
        return this.teamRole;
    }
}
