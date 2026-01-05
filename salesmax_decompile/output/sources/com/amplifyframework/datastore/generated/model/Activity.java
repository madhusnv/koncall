package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"contactId", "updatedAt"}, name = "listAllActivitiesByContact")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ})}, pluralName = "Activities")
/* loaded from: classes5.dex */
public final class Activity implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(isRequired = true, targetType = "ActivityCategory")
    private final ActivityCategory activityCategory;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User activityDoneByUser;

    @ModelField(targetType = "ID")
    private final String activityDoneByUserId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String activityRelatedObjectId;

    @ModelField(isRequired = true, targetType = "ActivityRelatedObjectType")
    private final ActivityRelatedObjectType activityRelatedObjectType;

    @ModelField(isRequired = true, targetType = "ActivityType")
    private final ActivityType activityType;

    @ModelField(targetType = "String")
    private final String body;

    @ModelField(targetType = "Comment")
    @HasMany(associatedWith = "activity", type = Comment.class)
    private final List<Comment> comments;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String note;

    @ModelField(isRequired = true, targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "Team")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = Team.class)
    private final Team primaryTeam;

    @ModelField(targetType = "ID")
    private final String primaryTeamId;

    @ModelField(targetType = "ID")
    private final String threadId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User user;
    public static final QueryField ID = QueryField.field("Activity", OutcomeConstants.OUTCOME_ID);
    public static final QueryField THREAD_ID = QueryField.field("Activity", "threadId");
    public static final QueryField ACCOUNT_ID = QueryField.field("Activity", "accountId");
    public static final QueryField ACTIVITY_RELATED_OBJECT_TYPE = QueryField.field("Activity", "activityRelatedObjectType");
    public static final QueryField ACTIVITY_RELATED_OBJECT_ID = QueryField.field("Activity", "activityRelatedObjectId");
    public static final QueryField ACTIVITY_CATEGORY = QueryField.field("Activity", "activityCategory");
    public static final QueryField ACTIVITY_TYPE = QueryField.field("Activity", "activityType");
    public static final QueryField BODY = QueryField.field("Activity", "body");
    public static final QueryField NOTE = QueryField.field("Activity", "note");
    public static final QueryField OWNER_ID = QueryField.field("Activity", "ownerId");
    public static final QueryField PRIMARY_TEAM_ID = QueryField.field("Activity", "primaryTeamId");
    public static final QueryField CONTACT = QueryField.field("Activity", "contactId");
    public static final QueryField ACTIVITY_DONE_BY_USER_ID = QueryField.field("Activity", "activityDoneByUserId");
    public static final QueryField CREATED_AT = QueryField.field("Activity", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("Activity", "updatedAt");

    public interface AccountIdStep {
        ActivityRelatedObjectTypeStep accountId(String str);
    }

    public interface ActivityCategoryStep {
        ActivityTypeStep activityCategory(ActivityCategory activityCategory);
    }

    public interface ActivityRelatedObjectIdStep {
        ActivityCategoryStep activityRelatedObjectId(String str);
    }

    public interface ActivityRelatedObjectTypeStep {
        ActivityRelatedObjectIdStep activityRelatedObjectType(ActivityRelatedObjectType activityRelatedObjectType);
    }

    public interface ActivityTypeStep {
        OwnerIdStep activityType(ActivityType activityType);
    }

    public interface BuildStep {
        BuildStep activityDoneByUserId(String str);

        BuildStep body(String str);

        Activity build();

        BuildStep contact(Contact contact);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep note(String str);

        BuildStep primaryTeamId(String str);

        BuildStep threadId(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, ActivityRelatedObjectTypeStep, ActivityRelatedObjectIdStep, ActivityCategoryStep, ActivityTypeStep, OwnerIdStep, BuildStep {
        private String accountId;
        private ActivityCategory activityCategory;
        private String activityDoneByUserId;
        private String activityRelatedObjectId;
        private ActivityRelatedObjectType activityRelatedObjectType;
        private ActivityType activityType;
        private String body;
        private Contact contact;
        private Temporal.DateTime createdAt;
        private String id;
        private String note;
        private String ownerId;
        private String primaryTeamId;
        private String threadId;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.Activity.AccountIdStep
        public ActivityRelatedObjectTypeStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.ActivityCategoryStep
        public ActivityTypeStep activityCategory(ActivityCategory activityCategory) {
            Objects.requireNonNull(activityCategory);
            this.activityCategory = activityCategory;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public BuildStep activityDoneByUserId(String str) {
            this.activityDoneByUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.ActivityRelatedObjectIdStep
        public ActivityCategoryStep activityRelatedObjectId(String str) {
            Objects.requireNonNull(str);
            this.activityRelatedObjectId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.ActivityRelatedObjectTypeStep
        public ActivityRelatedObjectIdStep activityRelatedObjectType(ActivityRelatedObjectType activityRelatedObjectType) {
            Objects.requireNonNull(activityRelatedObjectType);
            this.activityRelatedObjectType = activityRelatedObjectType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.ActivityTypeStep
        public OwnerIdStep activityType(ActivityType activityType) {
            Objects.requireNonNull(activityType);
            this.activityType = activityType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public BuildStep body(String str) {
            this.body = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public Activity build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new Activity(string, this.threadId, this.accountId, this.activityRelatedObjectType, this.activityRelatedObjectId, this.activityCategory, this.activityType, this.body, this.note, this.ownerId, this.primaryTeamId, this.contact, this.activityDoneByUserId, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public BuildStep note(String str) {
            this.note = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.OwnerIdStep
        public BuildStep ownerId(String str) {
            Objects.requireNonNull(str);
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public BuildStep primaryTeamId(String str) {
            this.primaryTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public BuildStep threadId(String str) {
            this.threadId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, ActivityRelatedObjectType activityRelatedObjectType, String str4, ActivityCategory activityCategory, ActivityType activityType, String str5, String str6, String str7, String str8, Contact contact, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.threadId = str2;
            this.accountId = str3;
            this.activityRelatedObjectType = activityRelatedObjectType;
            this.activityRelatedObjectId = str4;
            this.activityCategory = activityCategory;
            this.activityType = activityType;
            this.body = str5;
            this.note = str6;
            this.ownerId = str7;
            this.primaryTeamId = str8;
            this.contact = contact;
            this.activityDoneByUserId = str9;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, ActivityRelatedObjectType activityRelatedObjectType, String str4, ActivityCategory activityCategory, ActivityType activityType, String str5, String str6, String str7, String str8, Contact contact, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, activityRelatedObjectType, str4, activityCategory, activityType, str5, str6, str7, str8, contact, str9, dateTime, dateTime2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(activityRelatedObjectType);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(activityCategory);
            Objects.requireNonNull(activityType);
            Objects.requireNonNull(str7);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.ActivityCategoryStep
        public CopyOfBuilder activityCategory(ActivityCategory activityCategory) {
            return (CopyOfBuilder) super.activityCategory(activityCategory);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public CopyOfBuilder activityDoneByUserId(String str) {
            return (CopyOfBuilder) super.activityDoneByUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.ActivityRelatedObjectIdStep
        public CopyOfBuilder activityRelatedObjectId(String str) {
            return (CopyOfBuilder) super.activityRelatedObjectId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.ActivityRelatedObjectTypeStep
        public CopyOfBuilder activityRelatedObjectType(ActivityRelatedObjectType activityRelatedObjectType) {
            return (CopyOfBuilder) super.activityRelatedObjectType(activityRelatedObjectType);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.ActivityTypeStep
        public CopyOfBuilder activityType(ActivityType activityType) {
            return (CopyOfBuilder) super.activityType(activityType);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public CopyOfBuilder body(String str) {
            return (CopyOfBuilder) super.body(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public CopyOfBuilder note(String str) {
            return (CopyOfBuilder) super.note(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.OwnerIdStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public CopyOfBuilder primaryTeamId(String str) {
            return (CopyOfBuilder) super.primaryTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public CopyOfBuilder threadId(String str) {
            return (CopyOfBuilder) super.threadId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Activity.Builder, com.amplifyframework.datastore.generated.model.Activity.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface OwnerIdStep {
        BuildStep ownerId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static Activity justId(String str) {
        return new Activity(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.threadId, this.accountId, this.activityRelatedObjectType, this.activityRelatedObjectId, this.activityCategory, this.activityType, this.body, this.note, this.ownerId, this.primaryTeamId, this.contact, this.activityDoneByUserId, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Activity.class != obj.getClass()) {
            return false;
        }
        Activity activity = (Activity) obj;
        return s6c.m47909a(getId(), activity.getId()) && s6c.m47909a(getThreadId(), activity.getThreadId()) && s6c.m47909a(getAccountId(), activity.getAccountId()) && s6c.m47909a(getActivityRelatedObjectType(), activity.getActivityRelatedObjectType()) && s6c.m47909a(getActivityRelatedObjectId(), activity.getActivityRelatedObjectId()) && s6c.m47909a(getActivityCategory(), activity.getActivityCategory()) && s6c.m47909a(getActivityType(), activity.getActivityType()) && s6c.m47909a(getBody(), activity.getBody()) && s6c.m47909a(getNote(), activity.getNote()) && s6c.m47909a(getOwnerId(), activity.getOwnerId()) && s6c.m47909a(getPrimaryTeamId(), activity.getPrimaryTeamId()) && s6c.m47909a(getContact(), activity.getContact()) && s6c.m47909a(getActivityDoneByUserId(), activity.getActivityDoneByUserId()) && s6c.m47909a(getCreatedAt(), activity.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), activity.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public ActivityCategory getActivityCategory() {
        return this.activityCategory;
    }

    public User getActivityDoneByUser() {
        return this.activityDoneByUser;
    }

    public String getActivityDoneByUserId() {
        return this.activityDoneByUserId;
    }

    public String getActivityRelatedObjectId() {
        return this.activityRelatedObjectId;
    }

    public ActivityRelatedObjectType getActivityRelatedObjectType() {
        return this.activityRelatedObjectType;
    }

    public ActivityType getActivityType() {
        return this.activityType;
    }

    public String getBody() {
        return this.body;
    }

    public List<Comment> getComments() {
        return this.comments;
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

    public String getNote() {
        return this.note;
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

    public String getThreadId() {
        return this.threadId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public User getUser() {
        return this.user;
    }

    public int hashCode() {
        return (getId() + getThreadId() + getAccountId() + getActivityRelatedObjectType() + getActivityRelatedObjectId() + getActivityCategory() + getActivityType() + getBody() + getNote() + getOwnerId() + getPrimaryTeamId() + getContact() + getActivityDoneByUserId() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Activity {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("threadId=" + String.valueOf(getThreadId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("activityRelatedObjectType=" + String.valueOf(getActivityRelatedObjectType()) + ", ");
        sb.append("activityRelatedObjectId=" + String.valueOf(getActivityRelatedObjectId()) + ", ");
        sb.append("activityCategory=" + String.valueOf(getActivityCategory()) + ", ");
        sb.append("activityType=" + String.valueOf(getActivityType()) + ", ");
        sb.append("body=" + String.valueOf(getBody()) + ", ");
        sb.append("note=" + String.valueOf(getNote()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("primaryTeamId=" + String.valueOf(getPrimaryTeamId()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("activityDoneByUserId=" + String.valueOf(getActivityDoneByUserId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private Activity(String str, String str2, String str3, ActivityRelatedObjectType activityRelatedObjectType, String str4, ActivityCategory activityCategory, ActivityType activityType, String str5, String str6, String str7, String str8, Contact contact, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.user = null;
        this.primaryTeam = null;
        this.activityDoneByUser = null;
        this.comments = null;
        this.id = str;
        this.threadId = str2;
        this.accountId = str3;
        this.activityRelatedObjectType = activityRelatedObjectType;
        this.activityRelatedObjectId = str4;
        this.activityCategory = activityCategory;
        this.activityType = activityType;
        this.body = str5;
        this.note = str6;
        this.ownerId = str7;
        this.primaryTeamId = str8;
        this.contact = contact;
        this.activityDoneByUserId = str9;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
