package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "teamId"}, name = "memberByTeam")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "TeamMembers")
/* loaded from: classes5.dex */
public final class TeamMember implements Model {

    @BelongsTo(targetName = "accountId", type = Account.class)
    @ModelField(targetType = "Account")
    private final Account account;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User createdBy;

    @ModelField(isRequired = true, targetType = "ID")
    private final String createdById;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean isDefaultTeam;

    @ModelField(targetType = "Team")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = Team.class)
    private final Team memberTeam;

    @ModelField(targetType = "ID")
    private final String memberTeamId;

    @ModelField(isRequired = true, targetType = "TeamMemberType")
    private final TeamMemberType memberType;

    @ModelField(targetType = "Team")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = Team.class)
    private final Team team;

    @ModelField(isRequired = true, targetType = "ID")
    private final String teamId;

    @ModelField(isRequired = true, targetType = "TeamRole")
    private final TeamRole teamRole;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User updatedBy;

    @ModelField(isRequired = true, targetType = "ID")
    private final String updatedById;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User user;

    @ModelField(isRequired = true, targetType = "ID")
    private final String userId;
    public static final QueryField ID = QueryField.field("TeamMember", OutcomeConstants.OUTCOME_ID);
    public static final QueryField TEAM_ID = QueryField.field("TeamMember", "teamId");
    public static final QueryField ACCOUNT = QueryField.field("TeamMember", "accountId");
    public static final QueryField TEAM_ROLE = QueryField.field("TeamMember", "teamRole");
    public static final QueryField UPDATED_BY_ID = QueryField.field("TeamMember", "updatedById");
    public static final QueryField CREATED_BY_ID = QueryField.field("TeamMember", "createdById");
    public static final QueryField USER_ID = QueryField.field("TeamMember", "userId");
    public static final QueryField MEMBER_TEAM_ID = QueryField.field("TeamMember", "memberTeamId");
    public static final QueryField MEMBER_TYPE = QueryField.field("TeamMember", "memberType");
    public static final QueryField IS_DEFAULT_TEAM = QueryField.field("TeamMember", "isDefaultTeam");
    public static final QueryField CREATED_AT = QueryField.field("TeamMember", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("TeamMember", "updatedAt");

    public interface BuildStep {
        BuildStep account(Account account);

        TeamMember build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep isDefaultTeam(Boolean bool);

        BuildStep memberTeamId(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements TeamIdStep, TeamRoleStep, UpdatedByIdStep, CreatedByIdStep, UserIdStep, MemberTypeStep, BuildStep {
        private Account account;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String id;
        private Boolean isDefaultTeam;
        private String memberTeamId;
        private TeamMemberType memberType;
        private String teamId;
        private TeamRole teamRole;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private String userId;

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.BuildStep
        public BuildStep account(Account account) {
            this.account = account;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.BuildStep
        public TeamMember build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new TeamMember(string, this.teamId, this.account, this.teamRole, this.updatedById, this.createdById, this.userId, this.memberTeamId, this.memberType, this.isDefaultTeam, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.CreatedByIdStep
        public UserIdStep createdById(String str) {
            Objects.requireNonNull(str);
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.BuildStep
        public BuildStep isDefaultTeam(Boolean bool) {
            this.isDefaultTeam = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.BuildStep
        public BuildStep memberTeamId(String str) {
            this.memberTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.MemberTypeStep
        public BuildStep memberType(TeamMemberType teamMemberType) {
            Objects.requireNonNull(teamMemberType);
            this.memberType = teamMemberType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.TeamIdStep
        public TeamRoleStep teamId(String str) {
            Objects.requireNonNull(str);
            this.teamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.TeamRoleStep
        public UpdatedByIdStep teamRole(TeamRole teamRole) {
            Objects.requireNonNull(teamRole);
            this.teamRole = teamRole;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.UpdatedByIdStep
        public CreatedByIdStep updatedById(String str) {
            Objects.requireNonNull(str);
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.UserIdStep
        public MemberTypeStep userId(String str) {
            Objects.requireNonNull(str);
            this.userId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Account account, TeamRole teamRole, String str3, String str4, String str5, String str6, TeamMemberType teamMemberType, Boolean bool, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.teamId = str2;
            this.account = account;
            this.teamRole = teamRole;
            this.updatedById = str3;
            this.createdById = str4;
            this.userId = str5;
            this.memberTeamId = str6;
            this.memberType = teamMemberType;
            this.isDefaultTeam = bool;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Account account, TeamRole teamRole, String str3, String str4, String str5, String str6, TeamMemberType teamMemberType, Boolean bool, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, account, teamRole, str3, str4, str5, str6, teamMemberType, bool, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(teamRole);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(str5);
            Objects.requireNonNull(teamMemberType);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.Builder, com.amplifyframework.datastore.generated.model.TeamMember.BuildStep
        public CopyOfBuilder account(Account account) {
            return (CopyOfBuilder) super.account(account);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.Builder, com.amplifyframework.datastore.generated.model.TeamMember.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.Builder, com.amplifyframework.datastore.generated.model.TeamMember.CreatedByIdStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.Builder, com.amplifyframework.datastore.generated.model.TeamMember.BuildStep
        public CopyOfBuilder isDefaultTeam(Boolean bool) {
            return (CopyOfBuilder) super.isDefaultTeam(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.Builder, com.amplifyframework.datastore.generated.model.TeamMember.BuildStep
        public CopyOfBuilder memberTeamId(String str) {
            return (CopyOfBuilder) super.memberTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.Builder, com.amplifyframework.datastore.generated.model.TeamMember.MemberTypeStep
        public CopyOfBuilder memberType(TeamMemberType teamMemberType) {
            return (CopyOfBuilder) super.memberType(teamMemberType);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.Builder, com.amplifyframework.datastore.generated.model.TeamMember.TeamIdStep
        public CopyOfBuilder teamId(String str) {
            return (CopyOfBuilder) super.teamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.Builder, com.amplifyframework.datastore.generated.model.TeamMember.TeamRoleStep
        public CopyOfBuilder teamRole(TeamRole teamRole) {
            return (CopyOfBuilder) super.teamRole(teamRole);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.Builder, com.amplifyframework.datastore.generated.model.TeamMember.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.Builder, com.amplifyframework.datastore.generated.model.TeamMember.UpdatedByIdStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TeamMember.Builder, com.amplifyframework.datastore.generated.model.TeamMember.UserIdStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }
    }

    public interface CreatedByIdStep {
        UserIdStep createdById(String str);
    }

    public interface MemberTypeStep {
        BuildStep memberType(TeamMemberType teamMemberType);
    }

    public interface TeamIdStep {
        TeamRoleStep teamId(String str);
    }

    public interface TeamRoleStep {
        UpdatedByIdStep teamRole(TeamRole teamRole);
    }

    public interface UpdatedByIdStep {
        CreatedByIdStep updatedById(String str);
    }

    public interface UserIdStep {
        MemberTypeStep userId(String str);
    }

    public static TeamIdStep builder() {
        return new Builder();
    }

    public static TeamMember justId(String str) {
        return new TeamMember(str, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.teamId, this.account, this.teamRole, this.updatedById, this.createdById, this.userId, this.memberTeamId, this.memberType, this.isDefaultTeam, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TeamMember.class != obj.getClass()) {
            return false;
        }
        TeamMember teamMember = (TeamMember) obj;
        return s6c.m47909a(getId(), teamMember.getId()) && s6c.m47909a(getTeamId(), teamMember.getTeamId()) && s6c.m47909a(getAccount(), teamMember.getAccount()) && s6c.m47909a(getTeamRole(), teamMember.getTeamRole()) && s6c.m47909a(getUpdatedById(), teamMember.getUpdatedById()) && s6c.m47909a(getCreatedById(), teamMember.getCreatedById()) && s6c.m47909a(getUserId(), teamMember.getUserId()) && s6c.m47909a(getMemberTeamId(), teamMember.getMemberTeamId()) && s6c.m47909a(getMemberType(), teamMember.getMemberType()) && s6c.m47909a(getIsDefaultTeam(), teamMember.getIsDefaultTeam()) && s6c.m47909a(getCreatedAt(), teamMember.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), teamMember.getUpdatedAt());
    }

    public Account getAccount() {
        return this.account;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public User getCreatedBy() {
        return this.createdBy;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsDefaultTeam() {
        return this.isDefaultTeam;
    }

    public Team getMemberTeam() {
        return this.memberTeam;
    }

    public String getMemberTeamId() {
        return this.memberTeamId;
    }

    public TeamMemberType getMemberType() {
        return this.memberType;
    }

    public Team getTeam() {
        return this.team;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public TeamRole getTeamRole() {
        return this.teamRole;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public User getUpdatedBy() {
        return this.updatedBy;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public User getUser() {
        return this.user;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (getId() + getTeamId() + getAccount() + getTeamRole() + getUpdatedById() + getCreatedById() + getUserId() + getMemberTeamId() + getMemberType() + getIsDefaultTeam() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TeamMember {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("teamId=" + String.valueOf(getTeamId()) + ", ");
        sb.append("account=" + String.valueOf(getAccount()) + ", ");
        sb.append("teamRole=" + String.valueOf(getTeamRole()) + ", ");
        sb.append("updatedById=" + String.valueOf(getUpdatedById()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("memberTeamId=" + String.valueOf(getMemberTeamId()) + ", ");
        sb.append("memberType=" + String.valueOf(getMemberType()) + ", ");
        sb.append("isDefaultTeam=" + String.valueOf(getIsDefaultTeam()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private TeamMember(String str, String str2, Account account, TeamRole teamRole, String str3, String str4, String str5, String str6, TeamMemberType teamMemberType, Boolean bool, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.team = null;
        this.updatedBy = null;
        this.createdBy = null;
        this.user = null;
        this.memberTeam = null;
        this.id = str;
        this.teamId = str2;
        this.account = account;
        this.teamRole = teamRole;
        this.updatedById = str3;
        this.createdById = str4;
        this.userId = str5;
        this.memberTeamId = str6;
        this.memberType = teamMemberType;
        this.isDefaultTeam = bool;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
