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
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "ownerId", "contactId", "missedOpportunityType"}, name = SQLiteCommandFactory.UNDEFINED), @Index(fields = {"accountId", "updatedAt"}, name = "byAccount"), @Index(fields = {"accountId", "ownerId", "updatedAt"}, name = "byOwner"), @Index(fields = {"contactId", "updatedAt"}, name = "byContact")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "MissedOpportunities")
/* loaded from: classes5.dex */
public final class MissedOpportunities implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime callLaterDateTime;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String messageBody;

    @ModelField(isRequired = true, targetType = "MissedOpportunityType")
    private final MissedOpportunityType missedOpportunityType;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User owner;

    @ModelField(isRequired = true, targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "Team")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = Team.class)
    private final Team primaryTeam;

    @ModelField(targetType = "ID")
    private final String primaryTeamId;

    @BelongsTo(targetName = "relatedEngagementId", type = Engagement.class)
    @ModelField(targetType = "Engagement")
    private final Engagement relatedEngagement;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("MissedOpportunities", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("MissedOpportunities", "accountId");
    public static final QueryField OWNER_ID = QueryField.field("MissedOpportunities", "ownerId");
    public static final QueryField PRIMARY_TEAM_ID = QueryField.field("MissedOpportunities", "primaryTeamId");
    public static final QueryField MESSAGE_BODY = QueryField.field("MissedOpportunities", "messageBody");
    public static final QueryField CONTACT = QueryField.field("MissedOpportunities", "contactId");
    public static final QueryField MISSED_OPPORTUNITY_TYPE = QueryField.field("MissedOpportunities", "missedOpportunityType");
    public static final QueryField CALL_LATER_DATE_TIME = QueryField.field("MissedOpportunities", "callLaterDateTime");
    public static final QueryField RELATED_ENGAGEMENT = QueryField.field("MissedOpportunities", "relatedEngagementId");
    public static final QueryField CREATED_AT = QueryField.field("MissedOpportunities", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("MissedOpportunities", "updatedAt");

    public interface AccountIdStep {
        OwnerIdStep accountId(String str);
    }

    public interface BuildStep {
        MissedOpportunities build();

        BuildStep callLaterDateTime(Temporal.DateTime dateTime);

        BuildStep contact(Contact contact);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep messageBody(String str);

        BuildStep primaryTeamId(String str);

        BuildStep relatedEngagement(Engagement engagement);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, OwnerIdStep, MissedOpportunityTypeStep, BuildStep {
        private String accountId;
        private Temporal.DateTime callLaterDateTime;
        private Contact contact;
        private Temporal.DateTime createdAt;
        private String id;
        private String messageBody;
        private MissedOpportunityType missedOpportunityType;
        private String ownerId;
        private String primaryTeamId;
        private Engagement relatedEngagement;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.AccountIdStep
        public OwnerIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public MissedOpportunities build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new MissedOpportunities(string, this.accountId, this.ownerId, this.primaryTeamId, this.messageBody, this.contact, this.missedOpportunityType, this.callLaterDateTime, this.relatedEngagement, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public BuildStep callLaterDateTime(Temporal.DateTime dateTime) {
            this.callLaterDateTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public BuildStep messageBody(String str) {
            this.messageBody = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.MissedOpportunityTypeStep
        public BuildStep missedOpportunityType(MissedOpportunityType missedOpportunityType) {
            Objects.requireNonNull(missedOpportunityType);
            this.missedOpportunityType = missedOpportunityType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.OwnerIdStep
        public MissedOpportunityTypeStep ownerId(String str) {
            Objects.requireNonNull(str);
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public BuildStep primaryTeamId(String str) {
            this.primaryTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public BuildStep relatedEngagement(Engagement engagement) {
            this.relatedEngagement = engagement;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, Contact contact, MissedOpportunityType missedOpportunityType, Temporal.DateTime dateTime, Engagement engagement, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            this.id = str;
            this.accountId = str2;
            this.ownerId = str3;
            this.primaryTeamId = str4;
            this.messageBody = str5;
            this.contact = contact;
            this.missedOpportunityType = missedOpportunityType;
            this.callLaterDateTime = dateTime;
            this.relatedEngagement = engagement;
            this.createdAt = dateTime2;
            this.updatedAt = dateTime3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, Contact contact, MissedOpportunityType missedOpportunityType, Temporal.DateTime dateTime, Engagement engagement, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            super(str, str2, str3, str4, str5, contact, missedOpportunityType, dateTime, engagement, dateTime2, dateTime3);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(missedOpportunityType);
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.Builder, com.amplifyframework.datastore.generated.model.MissedOpportunities.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.Builder, com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public CopyOfBuilder callLaterDateTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.callLaterDateTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.Builder, com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.Builder, com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.Builder, com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public CopyOfBuilder messageBody(String str) {
            return (CopyOfBuilder) super.messageBody(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.Builder, com.amplifyframework.datastore.generated.model.MissedOpportunities.MissedOpportunityTypeStep
        public CopyOfBuilder missedOpportunityType(MissedOpportunityType missedOpportunityType) {
            return (CopyOfBuilder) super.missedOpportunityType(missedOpportunityType);
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.Builder, com.amplifyframework.datastore.generated.model.MissedOpportunities.OwnerIdStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.Builder, com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public CopyOfBuilder primaryTeamId(String str) {
            return (CopyOfBuilder) super.primaryTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.Builder, com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public CopyOfBuilder relatedEngagement(Engagement engagement) {
            return (CopyOfBuilder) super.relatedEngagement(engagement);
        }

        @Override // com.amplifyframework.datastore.generated.model.MissedOpportunities.Builder, com.amplifyframework.datastore.generated.model.MissedOpportunities.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface MissedOpportunityTypeStep {
        BuildStep missedOpportunityType(MissedOpportunityType missedOpportunityType);
    }

    public interface OwnerIdStep {
        MissedOpportunityTypeStep ownerId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static MissedOpportunities justId(String str) {
        return new MissedOpportunities(str, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.ownerId, this.primaryTeamId, this.messageBody, this.contact, this.missedOpportunityType, this.callLaterDateTime, this.relatedEngagement, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MissedOpportunities.class != obj.getClass()) {
            return false;
        }
        MissedOpportunities missedOpportunities = (MissedOpportunities) obj;
        return s6c.m47909a(getId(), missedOpportunities.getId()) && s6c.m47909a(getAccountId(), missedOpportunities.getAccountId()) && s6c.m47909a(getOwnerId(), missedOpportunities.getOwnerId()) && s6c.m47909a(getPrimaryTeamId(), missedOpportunities.getPrimaryTeamId()) && s6c.m47909a(getMessageBody(), missedOpportunities.getMessageBody()) && s6c.m47909a(getContact(), missedOpportunities.getContact()) && s6c.m47909a(getMissedOpportunityType(), missedOpportunities.getMissedOpportunityType()) && s6c.m47909a(getCallLaterDateTime(), missedOpportunities.getCallLaterDateTime()) && s6c.m47909a(getRelatedEngagement(), missedOpportunities.getRelatedEngagement()) && s6c.m47909a(getCreatedAt(), missedOpportunities.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), missedOpportunities.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getCallLaterDateTime() {
        return this.callLaterDateTime;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.id;
    }

    public String getMessageBody() {
        return this.messageBody;
    }

    public MissedOpportunityType getMissedOpportunityType() {
        return this.missedOpportunityType;
    }

    public User getOwner() {
        return this.owner;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public Team getPrimaryTeam() {
        return this.primaryTeam;
    }

    public String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public Engagement getRelatedEngagement() {
        return this.relatedEngagement;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getOwnerId() + getPrimaryTeamId() + getMessageBody() + getContact() + getMissedOpportunityType() + getCallLaterDateTime() + getRelatedEngagement() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MissedOpportunities {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("primaryTeamId=" + String.valueOf(getPrimaryTeamId()) + ", ");
        sb.append("messageBody=" + String.valueOf(getMessageBody()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("missedOpportunityType=" + String.valueOf(getMissedOpportunityType()) + ", ");
        sb.append("callLaterDateTime=" + String.valueOf(getCallLaterDateTime()) + ", ");
        sb.append("relatedEngagement=" + String.valueOf(getRelatedEngagement()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private MissedOpportunities(String str, String str2, String str3, String str4, String str5, Contact contact, MissedOpportunityType missedOpportunityType, Temporal.DateTime dateTime, Engagement engagement, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
        this.owner = null;
        this.primaryTeam = null;
        this.id = str;
        this.accountId = str2;
        this.ownerId = str3;
        this.primaryTeamId = str4;
        this.messageBody = str5;
        this.contact = contact;
        this.missedOpportunityType = missedOpportunityType;
        this.callLaterDateTime = dateTime;
        this.relatedEngagement = engagement;
        this.createdAt = dateTime2;
        this.updatedAt = dateTime3;
    }
}
