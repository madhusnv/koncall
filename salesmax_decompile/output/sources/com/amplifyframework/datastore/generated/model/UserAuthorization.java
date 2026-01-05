package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "userId"}, name = "authorizationByUserAccount"), @Index(fields = {"userId", "accountStatus"}, name = "authorizationByUser")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ})}, pluralName = "UserAuthorizations")
/* loaded from: classes5.dex */
public final class UserAuthorization implements Model {

    @BelongsTo(targetName = "accountId", type = Account.class)
    @ModelField(targetType = "Account")
    private final Account account;

    @ModelField(isRequired = true, targetType = "AccountStatus")
    private final AccountStatus accountStatus;

    @ModelField(isRequired = true, targetType = "AccountType")
    private final AccountType accountType;

    @ModelField(targetType = "ID")
    private final List<String> allAllowedTeams;

    @ModelField(targetType = "ID")
    private final List<String> allDirectReportees;

    @ModelField(targetType = "ID")
    private final List<String> allIndirectReportees;

    @ModelField(isRequired = true, targetType = "AuthorizationLevel")
    private final AuthorizationLevel authorizationLevel;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "Team")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = Team.class)
    private final Team defaultTeam;

    @ModelField(targetType = "ID")
    private final String defaultTeamId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "TeamWiseRepotees")
    private final List<TeamWiseRepotees> teamWiseReportees;

    @ModelField(targetType = "ID")
    private final List<String> teamsAsLead;

    @ModelField(targetType = "ID")
    private final List<String> teamsAsReportees;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User user;

    @ModelField(targetType = "Email")
    private final Email userAccountEmail;

    @ModelField(targetType = "Boolean")
    private final Boolean userAccountEmailVerification;

    @ModelField(targetType = "AWSPhone")
    private final String userAccountPrimaryNumber;

    @ModelField(targetType = "AWSPhone")
    private final String userAccountSecondaryNumber;

    @ModelField(isRequired = true, targetType = "UserStatus")
    private final UserStatus userAccountStatus;

    @ModelField(isRequired = true, targetType = "ID")
    private final String userId;

    @ModelField(isRequired = true, targetType = "UserRegistrationStatus")
    private final UserRegistrationStatus userRegistrationStatus;
    public static final QueryField ID = QueryField.field("UserAuthorization", OutcomeConstants.OUTCOME_ID);
    public static final QueryField USER_ID = QueryField.field("UserAuthorization", "userId");
    public static final QueryField USER_REGISTRATION_STATUS = QueryField.field("UserAuthorization", "userRegistrationStatus");
    public static final QueryField ACCOUNT = QueryField.field("UserAuthorization", "accountId");
    public static final QueryField ACCOUNT_TYPE = QueryField.field("UserAuthorization", "accountType");
    public static final QueryField ACCOUNT_STATUS = QueryField.field("UserAuthorization", "accountStatus");
    public static final QueryField USER_ACCOUNT_STATUS = QueryField.field("UserAuthorization", "userAccountStatus");
    public static final QueryField AUTHORIZATION_LEVEL = QueryField.field("UserAuthorization", "authorizationLevel");
    public static final QueryField USER_ACCOUNT_PRIMARY_NUMBER = QueryField.field("UserAuthorization", "userAccountPrimaryNumber");
    public static final QueryField USER_ACCOUNT_SECONDARY_NUMBER = QueryField.field("UserAuthorization", "userAccountSecondaryNumber");
    public static final QueryField USER_ACCOUNT_EMAIL = QueryField.field("UserAuthorization", "userAccountEmail");
    public static final QueryField USER_ACCOUNT_EMAIL_VERIFICATION = QueryField.field("UserAuthorization", "userAccountEmailVerification");
    public static final QueryField DEFAULT_TEAM_ID = QueryField.field("UserAuthorization", "defaultTeamId");
    public static final QueryField ALL_ALLOWED_TEAMS = QueryField.field("UserAuthorization", "allAllowedTeams");
    public static final QueryField TEAMS_AS_LEAD = QueryField.field("UserAuthorization", "teamsAsLead");
    public static final QueryField TEAMS_AS_REPORTEES = QueryField.field("UserAuthorization", "teamsAsReportees");
    public static final QueryField ALL_DIRECT_REPORTEES = QueryField.field("UserAuthorization", "allDirectReportees");
    public static final QueryField ALL_INDIRECT_REPORTEES = QueryField.field("UserAuthorization", "allIndirectReportees");
    public static final QueryField TEAM_WISE_REPORTEES = QueryField.field("UserAuthorization", "teamWiseReportees");
    public static final QueryField CREATED_AT = QueryField.field("UserAuthorization", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("UserAuthorization", "updatedAt");

    public interface AccountStatusStep {
        UserAccountStatusStep accountStatus(AccountStatus accountStatus);
    }

    public interface AccountTypeStep {
        AccountStatusStep accountType(AccountType accountType);
    }

    public interface AuthorizationLevelStep {
        BuildStep authorizationLevel(AuthorizationLevel authorizationLevel);
    }

    public interface BuildStep {
        BuildStep account(Account account);

        BuildStep allAllowedTeams(List<String> list);

        BuildStep allDirectReportees(List<String> list);

        BuildStep allIndirectReportees(List<String> list);

        UserAuthorization build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep defaultTeamId(String str);

        BuildStep id(String str);

        BuildStep teamWiseReportees(List<TeamWiseRepotees> list);

        BuildStep teamsAsLead(List<String> list);

        BuildStep teamsAsReportees(List<String> list);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep userAccountEmail(Email email);

        BuildStep userAccountEmailVerification(Boolean bool);

        BuildStep userAccountPrimaryNumber(String str);

        BuildStep userAccountSecondaryNumber(String str);
    }

    public static class Builder implements UserIdStep, UserRegistrationStatusStep, AccountTypeStep, AccountStatusStep, UserAccountStatusStep, AuthorizationLevelStep, BuildStep {
        private Account account;
        private AccountStatus accountStatus;
        private AccountType accountType;
        private List<String> allAllowedTeams;
        private List<String> allDirectReportees;
        private List<String> allIndirectReportees;
        private AuthorizationLevel authorizationLevel;
        private Temporal.DateTime createdAt;
        private String defaultTeamId;
        private String id;
        private List<TeamWiseRepotees> teamWiseReportees;
        private List<String> teamsAsLead;
        private List<String> teamsAsReportees;
        private Temporal.DateTime updatedAt;
        private Email userAccountEmail;
        private Boolean userAccountEmailVerification;
        private String userAccountPrimaryNumber;
        private String userAccountSecondaryNumber;
        private UserStatus userAccountStatus;
        private String userId;
        private UserRegistrationStatus userRegistrationStatus;

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep account(Account account) {
            this.account = account;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.AccountStatusStep
        public UserAccountStatusStep accountStatus(AccountStatus accountStatus) {
            Objects.requireNonNull(accountStatus);
            this.accountStatus = accountStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.AccountTypeStep
        public AccountStatusStep accountType(AccountType accountType) {
            Objects.requireNonNull(accountType);
            this.accountType = accountType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep allAllowedTeams(List<String> list) {
            this.allAllowedTeams = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep allDirectReportees(List<String> list) {
            this.allDirectReportees = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep allIndirectReportees(List<String> list) {
            this.allIndirectReportees = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.AuthorizationLevelStep
        public BuildStep authorizationLevel(AuthorizationLevel authorizationLevel) {
            Objects.requireNonNull(authorizationLevel);
            this.authorizationLevel = authorizationLevel;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public UserAuthorization build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new UserAuthorization(string, this.userId, this.userRegistrationStatus, this.account, this.accountType, this.accountStatus, this.userAccountStatus, this.authorizationLevel, this.userAccountPrimaryNumber, this.userAccountSecondaryNumber, this.userAccountEmail, this.userAccountEmailVerification, this.defaultTeamId, this.allAllowedTeams, this.teamsAsLead, this.teamsAsReportees, this.allDirectReportees, this.allIndirectReportees, this.teamWiseReportees, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep defaultTeamId(String str) {
            this.defaultTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep teamWiseReportees(List<TeamWiseRepotees> list) {
            this.teamWiseReportees = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep teamsAsLead(List<String> list) {
            this.teamsAsLead = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep teamsAsReportees(List<String> list) {
            this.teamsAsReportees = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep userAccountEmail(Email email) {
            this.userAccountEmail = email;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep userAccountEmailVerification(Boolean bool) {
            this.userAccountEmailVerification = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep userAccountPrimaryNumber(String str) {
            this.userAccountPrimaryNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public BuildStep userAccountSecondaryNumber(String str) {
            this.userAccountSecondaryNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.UserAccountStatusStep
        public AuthorizationLevelStep userAccountStatus(UserStatus userStatus) {
            Objects.requireNonNull(userStatus);
            this.userAccountStatus = userStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.UserIdStep
        public UserRegistrationStatusStep userId(String str) {
            Objects.requireNonNull(str);
            this.userId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.UserRegistrationStatusStep
        public AccountTypeStep userRegistrationStatus(UserRegistrationStatus userRegistrationStatus) {
            Objects.requireNonNull(userRegistrationStatus);
            this.userRegistrationStatus = userRegistrationStatus;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, UserRegistrationStatus userRegistrationStatus, Account account, AccountType accountType, AccountStatus accountStatus, UserStatus userStatus, AuthorizationLevel authorizationLevel, String str3, String str4, Email email, Boolean bool, String str5, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<TeamWiseRepotees> list6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.userId = str2;
            this.userRegistrationStatus = userRegistrationStatus;
            this.account = account;
            this.accountType = accountType;
            this.accountStatus = accountStatus;
            this.userAccountStatus = userStatus;
            this.authorizationLevel = authorizationLevel;
            this.userAccountPrimaryNumber = str3;
            this.userAccountSecondaryNumber = str4;
            this.userAccountEmail = email;
            this.userAccountEmailVerification = bool;
            this.defaultTeamId = str5;
            this.allAllowedTeams = list;
            this.teamsAsLead = list2;
            this.teamsAsReportees = list3;
            this.allDirectReportees = list4;
            this.allIndirectReportees = list5;
            this.teamWiseReportees = list6;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public /* bridge */ /* synthetic */ BuildStep allAllowedTeams(List list) {
            return allAllowedTeams((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public /* bridge */ /* synthetic */ BuildStep allDirectReportees(List list) {
            return allDirectReportees((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public /* bridge */ /* synthetic */ BuildStep allIndirectReportees(List list) {
            return allIndirectReportees((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public /* bridge */ /* synthetic */ BuildStep teamWiseReportees(List list) {
            return teamWiseReportees((List<TeamWiseRepotees>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public /* bridge */ /* synthetic */ BuildStep teamsAsLead(List list) {
            return teamsAsLead((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public /* bridge */ /* synthetic */ BuildStep teamsAsReportees(List list) {
            return teamsAsReportees((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, UserRegistrationStatus userRegistrationStatus, Account account, AccountType accountType, AccountStatus accountStatus, UserStatus userStatus, AuthorizationLevel authorizationLevel, String str3, String str4, Email email, Boolean bool, String str5, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<TeamWiseRepotees> list6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, userRegistrationStatus, account, accountType, accountStatus, userStatus, authorizationLevel, str3, str4, email, bool, str5, list, list2, list3, list4, list5, list6, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(userRegistrationStatus);
            Objects.requireNonNull(accountType);
            Objects.requireNonNull(accountStatus);
            Objects.requireNonNull(userStatus);
            Objects.requireNonNull(authorizationLevel);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder account(Account account) {
            return (CopyOfBuilder) super.account(account);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.AccountStatusStep
        public CopyOfBuilder accountStatus(AccountStatus accountStatus) {
            return (CopyOfBuilder) super.accountStatus(accountStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.AccountTypeStep
        public CopyOfBuilder accountType(AccountType accountType) {
            return (CopyOfBuilder) super.accountType(accountType);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder allAllowedTeams(List<String> list) {
            return (CopyOfBuilder) super.allAllowedTeams(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder allDirectReportees(List<String> list) {
            return (CopyOfBuilder) super.allDirectReportees(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder allIndirectReportees(List<String> list) {
            return (CopyOfBuilder) super.allIndirectReportees(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.AuthorizationLevelStep
        public CopyOfBuilder authorizationLevel(AuthorizationLevel authorizationLevel) {
            return (CopyOfBuilder) super.authorizationLevel(authorizationLevel);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder defaultTeamId(String str) {
            return (CopyOfBuilder) super.defaultTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder teamWiseReportees(List<TeamWiseRepotees> list) {
            return (CopyOfBuilder) super.teamWiseReportees(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder teamsAsLead(List<String> list) {
            return (CopyOfBuilder) super.teamsAsLead(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder teamsAsReportees(List<String> list) {
            return (CopyOfBuilder) super.teamsAsReportees(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder userAccountEmail(Email email) {
            return (CopyOfBuilder) super.userAccountEmail(email);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder userAccountEmailVerification(Boolean bool) {
            return (CopyOfBuilder) super.userAccountEmailVerification(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder userAccountPrimaryNumber(String str) {
            return (CopyOfBuilder) super.userAccountPrimaryNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.BuildStep
        public CopyOfBuilder userAccountSecondaryNumber(String str) {
            return (CopyOfBuilder) super.userAccountSecondaryNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.UserAccountStatusStep
        public CopyOfBuilder userAccountStatus(UserStatus userStatus) {
            return (CopyOfBuilder) super.userAccountStatus(userStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.UserIdStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.UserAuthorization.Builder, com.amplifyframework.datastore.generated.model.UserAuthorization.UserRegistrationStatusStep
        public CopyOfBuilder userRegistrationStatus(UserRegistrationStatus userRegistrationStatus) {
            return (CopyOfBuilder) super.userRegistrationStatus(userRegistrationStatus);
        }
    }

    public interface UserAccountStatusStep {
        AuthorizationLevelStep userAccountStatus(UserStatus userStatus);
    }

    public interface UserIdStep {
        UserRegistrationStatusStep userId(String str);
    }

    public interface UserRegistrationStatusStep {
        AccountTypeStep userRegistrationStatus(UserRegistrationStatus userRegistrationStatus);
    }

    public static UserIdStep builder() {
        return new Builder();
    }

    public static UserAuthorization justId(String str) {
        return new UserAuthorization(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.userId, this.userRegistrationStatus, this.account, this.accountType, this.accountStatus, this.userAccountStatus, this.authorizationLevel, this.userAccountPrimaryNumber, this.userAccountSecondaryNumber, this.userAccountEmail, this.userAccountEmailVerification, this.defaultTeamId, this.allAllowedTeams, this.teamsAsLead, this.teamsAsReportees, this.allDirectReportees, this.allIndirectReportees, this.teamWiseReportees, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UserAuthorization.class != obj.getClass()) {
            return false;
        }
        UserAuthorization userAuthorization = (UserAuthorization) obj;
        return s6c.m47909a(getId(), userAuthorization.getId()) && s6c.m47909a(getUserId(), userAuthorization.getUserId()) && s6c.m47909a(getUserRegistrationStatus(), userAuthorization.getUserRegistrationStatus()) && s6c.m47909a(getAccount(), userAuthorization.getAccount()) && s6c.m47909a(getAccountType(), userAuthorization.getAccountType()) && s6c.m47909a(getAccountStatus(), userAuthorization.getAccountStatus()) && s6c.m47909a(getUserAccountStatus(), userAuthorization.getUserAccountStatus()) && s6c.m47909a(getAuthorizationLevel(), userAuthorization.getAuthorizationLevel()) && s6c.m47909a(getUserAccountPrimaryNumber(), userAuthorization.getUserAccountPrimaryNumber()) && s6c.m47909a(getUserAccountSecondaryNumber(), userAuthorization.getUserAccountSecondaryNumber()) && s6c.m47909a(getUserAccountEmail(), userAuthorization.getUserAccountEmail()) && s6c.m47909a(getUserAccountEmailVerification(), userAuthorization.getUserAccountEmailVerification()) && s6c.m47909a(getDefaultTeamId(), userAuthorization.getDefaultTeamId()) && s6c.m47909a(getAllAllowedTeams(), userAuthorization.getAllAllowedTeams()) && s6c.m47909a(getTeamsAsLead(), userAuthorization.getTeamsAsLead()) && s6c.m47909a(getTeamsAsReportees(), userAuthorization.getTeamsAsReportees()) && s6c.m47909a(getAllDirectReportees(), userAuthorization.getAllDirectReportees()) && s6c.m47909a(getAllIndirectReportees(), userAuthorization.getAllIndirectReportees()) && s6c.m47909a(getTeamWiseReportees(), userAuthorization.getTeamWiseReportees()) && s6c.m47909a(getCreatedAt(), userAuthorization.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), userAuthorization.getUpdatedAt());
    }

    public Account getAccount() {
        return this.account;
    }

    public AccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public List<String> getAllAllowedTeams() {
        return this.allAllowedTeams;
    }

    public List<String> getAllDirectReportees() {
        return this.allDirectReportees;
    }

    public List<String> getAllIndirectReportees() {
        return this.allIndirectReportees;
    }

    public AuthorizationLevel getAuthorizationLevel() {
        return this.authorizationLevel;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Team getDefaultTeam() {
        return this.defaultTeam;
    }

    public String getDefaultTeamId() {
        return this.defaultTeamId;
    }

    public String getId() {
        return this.id;
    }

    public List<TeamWiseRepotees> getTeamWiseReportees() {
        return this.teamWiseReportees;
    }

    public List<String> getTeamsAsLead() {
        return this.teamsAsLead;
    }

    public List<String> getTeamsAsReportees() {
        return this.teamsAsReportees;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public User getUser() {
        return this.user;
    }

    public Email getUserAccountEmail() {
        return this.userAccountEmail;
    }

    public Boolean getUserAccountEmailVerification() {
        return this.userAccountEmailVerification;
    }

    public String getUserAccountPrimaryNumber() {
        return this.userAccountPrimaryNumber;
    }

    public String getUserAccountSecondaryNumber() {
        return this.userAccountSecondaryNumber;
    }

    public UserStatus getUserAccountStatus() {
        return this.userAccountStatus;
    }

    public String getUserId() {
        return this.userId;
    }

    public UserRegistrationStatus getUserRegistrationStatus() {
        return this.userRegistrationStatus;
    }

    public int hashCode() {
        return (getId() + getUserId() + getUserRegistrationStatus() + getAccount() + getAccountType() + getAccountStatus() + getUserAccountStatus() + getAuthorizationLevel() + getUserAccountPrimaryNumber() + getUserAccountSecondaryNumber() + getUserAccountEmail() + getUserAccountEmailVerification() + getDefaultTeamId() + getAllAllowedTeams() + getTeamsAsLead() + getTeamsAsReportees() + getAllDirectReportees() + getAllIndirectReportees() + getTeamWiseReportees() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserAuthorization {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("userRegistrationStatus=" + String.valueOf(getUserRegistrationStatus()) + ", ");
        sb.append("account=" + String.valueOf(getAccount()) + ", ");
        sb.append("accountType=" + String.valueOf(getAccountType()) + ", ");
        sb.append("accountStatus=" + String.valueOf(getAccountStatus()) + ", ");
        sb.append("userAccountStatus=" + String.valueOf(getUserAccountStatus()) + ", ");
        sb.append("authorizationLevel=" + String.valueOf(getAuthorizationLevel()) + ", ");
        sb.append("userAccountPrimaryNumber=" + String.valueOf(getUserAccountPrimaryNumber()) + ", ");
        sb.append("userAccountSecondaryNumber=" + String.valueOf(getUserAccountSecondaryNumber()) + ", ");
        sb.append("userAccountEmail=" + String.valueOf(getUserAccountEmail()) + ", ");
        sb.append("userAccountEmailVerification=" + String.valueOf(getUserAccountEmailVerification()) + ", ");
        sb.append("defaultTeamId=" + String.valueOf(getDefaultTeamId()) + ", ");
        sb.append("allAllowedTeams=" + String.valueOf(getAllAllowedTeams()) + ", ");
        sb.append("teamsAsLead=" + String.valueOf(getTeamsAsLead()) + ", ");
        sb.append("teamsAsReportees=" + String.valueOf(getTeamsAsReportees()) + ", ");
        sb.append("allDirectReportees=" + String.valueOf(getAllDirectReportees()) + ", ");
        sb.append("allIndirectReportees=" + String.valueOf(getAllIndirectReportees()) + ", ");
        sb.append("teamWiseReportees=" + String.valueOf(getTeamWiseReportees()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private UserAuthorization(String str, String str2, UserRegistrationStatus userRegistrationStatus, Account account, AccountType accountType, AccountStatus accountStatus, UserStatus userStatus, AuthorizationLevel authorizationLevel, String str3, String str4, Email email, Boolean bool, String str5, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<TeamWiseRepotees> list6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.user = null;
        this.defaultTeam = null;
        this.id = str;
        this.userId = str2;
        this.userRegistrationStatus = userRegistrationStatus;
        this.account = account;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
        this.userAccountStatus = userStatus;
        this.authorizationLevel = authorizationLevel;
        this.userAccountPrimaryNumber = str3;
        this.userAccountSecondaryNumber = str4;
        this.userAccountEmail = email;
        this.userAccountEmailVerification = bool;
        this.defaultTeamId = str5;
        this.allAllowedTeams = list;
        this.teamsAsLead = list2;
        this.teamsAsReportees = list3;
        this.allDirectReportees = list4;
        this.allIndirectReportees = list5;
        this.teamWiseReportees = list6;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
