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
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"engagementId", "updatedAt"}, name = "listAllUpdatesOnEngagement"), @Index(fields = {"accountId", "updatedById", "eventType", "updatedAt"}, name = "updateByOwnerAndEventType")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "EngagementUpdates")
/* loaded from: classes5.dex */
public final class EngagementUpdate implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime dueDateTimeChangedFrom;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime dueDateTimeChangedTo;

    @BelongsTo(targetName = "engagementId", type = Engagement.class)
    @ModelField(targetType = "Engagement")
    private final Engagement engagement;

    @ModelField(targetType = "String")
    private final String eventType;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String note;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User updatedBy;

    @ModelField(targetType = "ID")
    private final String updatedById;
    public static final QueryField ID = QueryField.field("EngagementUpdate", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("EngagementUpdate", "accountId");
    public static final QueryField UPDATED_BY_ID = QueryField.field("EngagementUpdate", "updatedById");
    public static final QueryField CONTACT = QueryField.field("EngagementUpdate", "contactId");
    public static final QueryField EVENT_TYPE = QueryField.field("EngagementUpdate", "eventType");
    public static final QueryField ENGAGEMENT = QueryField.field("EngagementUpdate", "engagementId");
    public static final QueryField NOTE = QueryField.field("EngagementUpdate", "note");
    public static final QueryField DUE_DATE_TIME_CHANGED_FROM = QueryField.field("EngagementUpdate", "dueDateTimeChangedFrom");
    public static final QueryField DUE_DATE_TIME_CHANGED_TO = QueryField.field("EngagementUpdate", "dueDateTimeChangedTo");
    public static final QueryField UPDATED_AT = QueryField.field("EngagementUpdate", "updatedAt");
    public static final QueryField CREATED_AT = QueryField.field("EngagementUpdate", "createdAt");

    public interface AccountIdStep {
        UpdatedAtStep accountId(String str);
    }

    public interface BuildStep {
        EngagementUpdate build();

        BuildStep contact(Contact contact);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep dueDateTimeChangedFrom(Temporal.DateTime dateTime);

        BuildStep dueDateTimeChangedTo(Temporal.DateTime dateTime);

        BuildStep engagement(Engagement engagement);

        BuildStep eventType(String str);

        BuildStep id(String str);

        BuildStep note(String str);

        BuildStep updatedById(String str);
    }

    public static class Builder implements AccountIdStep, UpdatedAtStep, BuildStep {
        private String accountId;
        private Contact contact;
        private Temporal.DateTime createdAt;
        private Temporal.DateTime dueDateTimeChangedFrom;
        private Temporal.DateTime dueDateTimeChangedTo;
        private Engagement engagement;
        private String eventType;
        private String id;
        private String note;
        private Temporal.DateTime updatedAt;
        private String updatedById;

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.AccountIdStep
        public UpdatedAtStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public EngagementUpdate build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new EngagementUpdate(string, this.accountId, this.updatedById, this.contact, this.eventType, this.engagement, this.note, this.dueDateTimeChangedFrom, this.dueDateTimeChangedTo, this.updatedAt, this.createdAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public BuildStep dueDateTimeChangedFrom(Temporal.DateTime dateTime) {
            this.dueDateTimeChangedFrom = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public BuildStep dueDateTimeChangedTo(Temporal.DateTime dateTime) {
            this.dueDateTimeChangedTo = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public BuildStep engagement(Engagement engagement) {
            this.engagement = engagement;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public BuildStep eventType(String str) {
            this.eventType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public BuildStep note(String str) {
            this.note = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.UpdatedAtStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, Contact contact, String str4, Engagement engagement, String str5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            this.id = str;
            this.accountId = str2;
            this.updatedById = str3;
            this.contact = contact;
            this.eventType = str4;
            this.engagement = engagement;
            this.note = str5;
            this.dueDateTimeChangedFrom = dateTime;
            this.dueDateTimeChangedTo = dateTime2;
            this.updatedAt = dateTime3;
            this.createdAt = dateTime4;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, Contact contact, String str4, Engagement engagement, String str5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            super(str, str2, str3, contact, str4, engagement, str5, dateTime, dateTime2, dateTime3, dateTime4);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(dateTime3);
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.Builder, com.amplifyframework.datastore.generated.model.EngagementUpdate.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.Builder, com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.Builder, com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.Builder, com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public CopyOfBuilder dueDateTimeChangedFrom(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.dueDateTimeChangedFrom(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.Builder, com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public CopyOfBuilder dueDateTimeChangedTo(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.dueDateTimeChangedTo(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.Builder, com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public CopyOfBuilder engagement(Engagement engagement) {
            return (CopyOfBuilder) super.engagement(engagement);
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.Builder, com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public CopyOfBuilder eventType(String str) {
            return (CopyOfBuilder) super.eventType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.Builder, com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public CopyOfBuilder note(String str) {
            return (CopyOfBuilder) super.note(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.Builder, com.amplifyframework.datastore.generated.model.EngagementUpdate.UpdatedAtStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.EngagementUpdate.Builder, com.amplifyframework.datastore.generated.model.EngagementUpdate.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }
    }

    public interface UpdatedAtStep {
        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static EngagementUpdate justId(String str) {
        return new EngagementUpdate(str, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.updatedById, this.contact, this.eventType, this.engagement, this.note, this.dueDateTimeChangedFrom, this.dueDateTimeChangedTo, this.updatedAt, this.createdAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EngagementUpdate.class != obj.getClass()) {
            return false;
        }
        EngagementUpdate engagementUpdate = (EngagementUpdate) obj;
        return s6c.m47909a(getId(), engagementUpdate.getId()) && s6c.m47909a(getAccountId(), engagementUpdate.getAccountId()) && s6c.m47909a(getUpdatedById(), engagementUpdate.getUpdatedById()) && s6c.m47909a(getContact(), engagementUpdate.getContact()) && s6c.m47909a(getEventType(), engagementUpdate.getEventType()) && s6c.m47909a(getEngagement(), engagementUpdate.getEngagement()) && s6c.m47909a(getNote(), engagementUpdate.getNote()) && s6c.m47909a(getDueDateTimeChangedFrom(), engagementUpdate.getDueDateTimeChangedFrom()) && s6c.m47909a(getDueDateTimeChangedTo(), engagementUpdate.getDueDateTimeChangedTo()) && s6c.m47909a(getUpdatedAt(), engagementUpdate.getUpdatedAt()) && s6c.m47909a(getCreatedAt(), engagementUpdate.getCreatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Temporal.DateTime getDueDateTimeChangedFrom() {
        return this.dueDateTimeChangedFrom;
    }

    public Temporal.DateTime getDueDateTimeChangedTo() {
        return this.dueDateTimeChangedTo;
    }

    public Engagement getEngagement() {
        return this.engagement;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getId() {
        return this.id;
    }

    public String getNote() {
        return this.note;
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
        return (getId() + getAccountId() + getUpdatedById() + getContact() + getEventType() + getEngagement() + getNote() + getDueDateTimeChangedFrom() + getDueDateTimeChangedTo() + getUpdatedAt() + getCreatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EngagementUpdate {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("updatedById=" + String.valueOf(getUpdatedById()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("eventType=" + String.valueOf(getEventType()) + ", ");
        sb.append("engagement=" + String.valueOf(getEngagement()) + ", ");
        sb.append("note=" + String.valueOf(getNote()) + ", ");
        sb.append("dueDateTimeChangedFrom=" + String.valueOf(getDueDateTimeChangedFrom()) + ", ");
        sb.append("dueDateTimeChangedTo=" + String.valueOf(getDueDateTimeChangedTo()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("createdAt=");
        sb2.append(String.valueOf(getCreatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private EngagementUpdate(String str, String str2, String str3, Contact contact, String str4, Engagement engagement, String str5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
        this.updatedBy = null;
        this.id = str;
        this.accountId = str2;
        this.updatedById = str3;
        this.contact = contact;
        this.eventType = str4;
        this.engagement = engagement;
        this.note = str5;
        this.dueDateTimeChangedFrom = dateTime;
        this.dueDateTimeChangedTo = dateTime2;
        this.updatedAt = dateTime3;
        this.createdAt = dateTime4;
    }
}
