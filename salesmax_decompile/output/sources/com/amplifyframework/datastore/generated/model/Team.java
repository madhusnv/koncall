package com.amplifyframework.datastore.generated.model;

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
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "createdById"}, name = "teamsByAccount")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ})}, pluralName = "Teams")
/* loaded from: classes5.dex */
public final class Team implements Model {

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

    @ModelField(isRequired = true, targetType = "String")
    private final String description;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(isRequired = true, targetType = "String")
    private final String teamName;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User updatedBy;

    @ModelField(isRequired = true, targetType = "ID")
    private final String updatedById;
    public static final QueryField ID = QueryField.field("Team", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT = QueryField.field("Team", "accountId");
    public static final QueryField CREATED_BY_ID = QueryField.field("Team", "createdById");
    public static final QueryField DESCRIPTION = QueryField.field("Team", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField TEAM_NAME = QueryField.field("Team", "teamName");
    public static final QueryField UPDATED_BY_ID = QueryField.field("Team", "updatedById");
    public static final QueryField CREATED_AT = QueryField.field("Team", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("Team", "updatedAt");

    public interface BuildStep {
        BuildStep account(Account account);

        Team build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements CreatedByIdStep, DescriptionStep, TeamNameStep, UpdatedByIdStep, BuildStep {
        private Account account;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String description;
        private String id;
        private String teamName;
        private Temporal.DateTime updatedAt;
        private String updatedById;

        @Override // com.amplifyframework.datastore.generated.model.Team.BuildStep
        public BuildStep account(Account account) {
            this.account = account;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.BuildStep
        public Team build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new Team(string, this.account, this.createdById, this.description, this.teamName, this.updatedById, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.CreatedByIdStep
        public DescriptionStep createdById(String str) {
            Objects.requireNonNull(str);
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.DescriptionStep
        public TeamNameStep description(String str) {
            Objects.requireNonNull(str);
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.TeamNameStep
        public UpdatedByIdStep teamName(String str) {
            Objects.requireNonNull(str);
            this.teamName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.UpdatedByIdStep
        public BuildStep updatedById(String str) {
            Objects.requireNonNull(str);
            this.updatedById = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Account account, String str2, String str3, String str4, String str5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.account = account;
            this.createdById = str2;
            this.description = str3;
            this.teamName = str4;
            this.updatedById = str5;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, Account account, String str2, String str3, String str4, String str5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, account, str2, str3, str4, str5, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(str5);
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.Builder, com.amplifyframework.datastore.generated.model.Team.BuildStep
        public CopyOfBuilder account(Account account) {
            return (CopyOfBuilder) super.account(account);
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.Builder, com.amplifyframework.datastore.generated.model.Team.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.Builder, com.amplifyframework.datastore.generated.model.Team.CreatedByIdStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.Builder, com.amplifyframework.datastore.generated.model.Team.DescriptionStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.Builder, com.amplifyframework.datastore.generated.model.Team.TeamNameStep
        public CopyOfBuilder teamName(String str) {
            return (CopyOfBuilder) super.teamName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.Builder, com.amplifyframework.datastore.generated.model.Team.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Team.Builder, com.amplifyframework.datastore.generated.model.Team.UpdatedByIdStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }
    }

    public interface CreatedByIdStep {
        DescriptionStep createdById(String str);
    }

    public interface DescriptionStep {
        TeamNameStep description(String str);
    }

    public interface TeamNameStep {
        UpdatedByIdStep teamName(String str);
    }

    public interface UpdatedByIdStep {
        BuildStep updatedById(String str);
    }

    public static CreatedByIdStep builder() {
        return new Builder();
    }

    public static Team justId(String str) {
        return new Team(str, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.account, this.createdById, this.description, this.teamName, this.updatedById, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Team.class != obj.getClass()) {
            return false;
        }
        Team team = (Team) obj;
        return s6c.m47909a(getId(), team.getId()) && s6c.m47909a(getAccount(), team.getAccount()) && s6c.m47909a(getCreatedById(), team.getCreatedById()) && s6c.m47909a(getDescription(), team.getDescription()) && s6c.m47909a(getTeamName(), team.getTeamName()) && s6c.m47909a(getUpdatedById(), team.getUpdatedById()) && s6c.m47909a(getCreatedAt(), team.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), team.getUpdatedAt());
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

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public String getTeamName() {
        return this.teamName;
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

    public int hashCode() {
        return (getId() + getAccount() + getCreatedById() + getDescription() + getTeamName() + getUpdatedById() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("account=" + String.valueOf(getAccount()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("teamName=" + String.valueOf(getTeamName()) + ", ");
        sb.append("updatedById=" + String.valueOf(getUpdatedById()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private Team(String str, Account account, String str2, String str3, String str4, String str5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.createdBy = null;
        this.updatedBy = null;
        this.id = str;
        this.account = account;
        this.createdById = str2;
        this.description = str3;
        this.teamName = str4;
        this.updatedById = str5;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
