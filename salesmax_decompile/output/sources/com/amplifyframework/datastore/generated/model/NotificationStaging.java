package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"notificationRelatedObjectId", "scheduledAt"}, name = "notificationsForObject"), @Index(fields = {"accountId", "ownerId", "scheduledAt"}, name = "allNotificationsByOwner")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ})}, pluralName = "NotificationStagings")
/* loaded from: classes5.dex */
public final class NotificationStaging implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ID")
    private final String activityDoneByUserId;

    @ModelField(targetType = "ID")
    private final String contactId;

    @ModelField(targetType = "String")
    private final String content;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "AWSTimestamp")
    private final Temporal.Timestamp expirationUnixTime;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String notificationChannel;

    @ModelField(targetType = "ID")
    private final String notificationId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String notificationRelatedObjectId;

    @ModelField(isRequired = true, targetType = "ActivityRelatedObjectType")
    private final ActivityRelatedObjectType notificationRelatedObjectType;

    @ModelField(targetType = "String")
    private final String notificationStatus;

    @ModelField(targetType = "String")
    private final String notificationType;

    @ModelField(isRequired = true, targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "ID")
    private final String primaryTeamId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime scheduledAt;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("NotificationStaging", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("NotificationStaging", "accountId");
    public static final QueryField NOTIFICATION_ID = QueryField.field("NotificationStaging", "notificationId");
    public static final QueryField NOTIFICATION_CHANNEL = QueryField.field("NotificationStaging", "notificationChannel");
    public static final QueryField NOTIFICATION_STATUS = QueryField.field("NotificationStaging", "notificationStatus");
    public static final QueryField NOTIFICATION_TYPE = QueryField.field("NotificationStaging", "notificationType");
    public static final QueryField NOTIFICATION_RELATED_OBJECT_TYPE = QueryField.field("NotificationStaging", "notificationRelatedObjectType");
    public static final QueryField NOTIFICATION_RELATED_OBJECT_ID = QueryField.field("NotificationStaging", "notificationRelatedObjectId");
    public static final QueryField OWNER_ID = QueryField.field("NotificationStaging", "ownerId");
    public static final QueryField PRIMARY_TEAM_ID = QueryField.field("NotificationStaging", "primaryTeamId");
    public static final QueryField CONTACT_ID = QueryField.field("NotificationStaging", "contactId");
    public static final QueryField ACTIVITY_DONE_BY_USER_ID = QueryField.field("NotificationStaging", "activityDoneByUserId");
    public static final QueryField CONTENT = QueryField.field("NotificationStaging", FirebaseAnalytics.Param.CONTENT);
    public static final QueryField CREATED_AT = QueryField.field("NotificationStaging", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("NotificationStaging", "updatedAt");
    public static final QueryField SCHEDULED_AT = QueryField.field("NotificationStaging", "scheduledAt");
    public static final QueryField EXPIRATION_UNIX_TIME = QueryField.field("NotificationStaging", "expirationUnixTime");

    public interface AccountIdStep {
        NotificationRelatedObjectTypeStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep activityDoneByUserId(String str);

        NotificationStaging build();

        BuildStep contactId(String str);

        BuildStep content(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep expirationUnixTime(Temporal.Timestamp timestamp);

        BuildStep id(String str);

        BuildStep notificationChannel(String str);

        BuildStep notificationId(String str);

        BuildStep notificationStatus(String str);

        BuildStep notificationType(String str);

        BuildStep primaryTeamId(String str);

        BuildStep scheduledAt(Temporal.DateTime dateTime);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, NotificationRelatedObjectTypeStep, NotificationRelatedObjectIdStep, OwnerIdStep, BuildStep {
        private String accountId;
        private String activityDoneByUserId;
        private String contactId;
        private String content;
        private Temporal.DateTime createdAt;
        private Temporal.Timestamp expirationUnixTime;
        private String id;
        private String notificationChannel;
        private String notificationId;
        private String notificationRelatedObjectId;
        private ActivityRelatedObjectType notificationRelatedObjectType;
        private String notificationStatus;
        private String notificationType;
        private String ownerId;
        private String primaryTeamId;
        private Temporal.DateTime scheduledAt;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.AccountIdStep
        public NotificationRelatedObjectTypeStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep activityDoneByUserId(String str) {
            this.activityDoneByUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public NotificationStaging build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new NotificationStaging(string, this.accountId, this.notificationId, this.notificationChannel, this.notificationStatus, this.notificationType, this.notificationRelatedObjectType, this.notificationRelatedObjectId, this.ownerId, this.primaryTeamId, this.contactId, this.activityDoneByUserId, this.content, this.createdAt, this.updatedAt, this.scheduledAt, this.expirationUnixTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep contactId(String str) {
            this.contactId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep content(String str) {
            this.content = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep expirationUnixTime(Temporal.Timestamp timestamp) {
            this.expirationUnixTime = timestamp;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep notificationChannel(String str) {
            this.notificationChannel = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep notificationId(String str) {
            this.notificationId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.NotificationRelatedObjectIdStep
        public OwnerIdStep notificationRelatedObjectId(String str) {
            Objects.requireNonNull(str);
            this.notificationRelatedObjectId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.NotificationRelatedObjectTypeStep
        public NotificationRelatedObjectIdStep notificationRelatedObjectType(ActivityRelatedObjectType activityRelatedObjectType) {
            Objects.requireNonNull(activityRelatedObjectType);
            this.notificationRelatedObjectType = activityRelatedObjectType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep notificationStatus(String str) {
            this.notificationStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep notificationType(String str) {
            this.notificationType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.OwnerIdStep
        public BuildStep ownerId(String str) {
            Objects.requireNonNull(str);
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep primaryTeamId(String str) {
            this.primaryTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep scheduledAt(Temporal.DateTime dateTime) {
            this.scheduledAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, ActivityRelatedObjectType activityRelatedObjectType, String str7, String str8, String str9, String str10, String str11, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.Timestamp timestamp) {
            this.id = str;
            this.accountId = str2;
            this.notificationId = str3;
            this.notificationChannel = str4;
            this.notificationStatus = str5;
            this.notificationType = str6;
            this.notificationRelatedObjectType = activityRelatedObjectType;
            this.notificationRelatedObjectId = str7;
            this.ownerId = str8;
            this.primaryTeamId = str9;
            this.contactId = str10;
            this.activityDoneByUserId = str11;
            this.content = str12;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
            this.scheduledAt = dateTime3;
            this.expirationUnixTime = timestamp;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, ActivityRelatedObjectType activityRelatedObjectType, String str7, String str8, String str9, String str10, String str11, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.Timestamp timestamp) {
            super(str, str2, str3, str4, str5, str6, activityRelatedObjectType, str7, str8, str9, str10, str11, str12, dateTime, dateTime2, dateTime3, timestamp);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(activityRelatedObjectType);
            Objects.requireNonNull(str7);
            Objects.requireNonNull(str8);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public CopyOfBuilder activityDoneByUserId(String str) {
            return (CopyOfBuilder) super.activityDoneByUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public CopyOfBuilder contactId(String str) {
            return (CopyOfBuilder) super.contactId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public CopyOfBuilder content(String str) {
            return (CopyOfBuilder) super.content(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public CopyOfBuilder expirationUnixTime(Temporal.Timestamp timestamp) {
            return (CopyOfBuilder) super.expirationUnixTime(timestamp);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public CopyOfBuilder notificationChannel(String str) {
            return (CopyOfBuilder) super.notificationChannel(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public CopyOfBuilder notificationId(String str) {
            return (CopyOfBuilder) super.notificationId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.NotificationRelatedObjectIdStep
        public CopyOfBuilder notificationRelatedObjectId(String str) {
            return (CopyOfBuilder) super.notificationRelatedObjectId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.NotificationRelatedObjectTypeStep
        public CopyOfBuilder notificationRelatedObjectType(ActivityRelatedObjectType activityRelatedObjectType) {
            return (CopyOfBuilder) super.notificationRelatedObjectType(activityRelatedObjectType);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public CopyOfBuilder notificationStatus(String str) {
            return (CopyOfBuilder) super.notificationStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public CopyOfBuilder notificationType(String str) {
            return (CopyOfBuilder) super.notificationType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.OwnerIdStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public CopyOfBuilder primaryTeamId(String str) {
            return (CopyOfBuilder) super.primaryTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public CopyOfBuilder scheduledAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.scheduledAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationStaging.Builder, com.amplifyframework.datastore.generated.model.NotificationStaging.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface NotificationRelatedObjectIdStep {
        OwnerIdStep notificationRelatedObjectId(String str);
    }

    public interface NotificationRelatedObjectTypeStep {
        NotificationRelatedObjectIdStep notificationRelatedObjectType(ActivityRelatedObjectType activityRelatedObjectType);
    }

    public interface OwnerIdStep {
        BuildStep ownerId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static NotificationStaging justId(String str) {
        return new NotificationStaging(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.notificationId, this.notificationChannel, this.notificationStatus, this.notificationType, this.notificationRelatedObjectType, this.notificationRelatedObjectId, this.ownerId, this.primaryTeamId, this.contactId, this.activityDoneByUserId, this.content, this.createdAt, this.updatedAt, this.scheduledAt, this.expirationUnixTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NotificationStaging.class != obj.getClass()) {
            return false;
        }
        NotificationStaging notificationStaging = (NotificationStaging) obj;
        return s6c.m47909a(getId(), notificationStaging.getId()) && s6c.m47909a(getAccountId(), notificationStaging.getAccountId()) && s6c.m47909a(getNotificationId(), notificationStaging.getNotificationId()) && s6c.m47909a(getNotificationChannel(), notificationStaging.getNotificationChannel()) && s6c.m47909a(getNotificationStatus(), notificationStaging.getNotificationStatus()) && s6c.m47909a(getNotificationType(), notificationStaging.getNotificationType()) && s6c.m47909a(getNotificationRelatedObjectType(), notificationStaging.getNotificationRelatedObjectType()) && s6c.m47909a(getNotificationRelatedObjectId(), notificationStaging.getNotificationRelatedObjectId()) && s6c.m47909a(getOwnerId(), notificationStaging.getOwnerId()) && s6c.m47909a(getPrimaryTeamId(), notificationStaging.getPrimaryTeamId()) && s6c.m47909a(getContactId(), notificationStaging.getContactId()) && s6c.m47909a(getActivityDoneByUserId(), notificationStaging.getActivityDoneByUserId()) && s6c.m47909a(getContent(), notificationStaging.getContent()) && s6c.m47909a(getCreatedAt(), notificationStaging.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), notificationStaging.getUpdatedAt()) && s6c.m47909a(getScheduledAt(), notificationStaging.getScheduledAt()) && s6c.m47909a(getExpirationUnixTime(), notificationStaging.getExpirationUnixTime());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getActivityDoneByUserId() {
        return this.activityDoneByUserId;
    }

    public String getContactId() {
        return this.contactId;
    }

    public String getContent() {
        return this.content;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Temporal.Timestamp getExpirationUnixTime() {
        return this.expirationUnixTime;
    }

    public String getId() {
        return this.id;
    }

    public String getNotificationChannel() {
        return this.notificationChannel;
    }

    public String getNotificationId() {
        return this.notificationId;
    }

    public String getNotificationRelatedObjectId() {
        return this.notificationRelatedObjectId;
    }

    public ActivityRelatedObjectType getNotificationRelatedObjectType() {
        return this.notificationRelatedObjectType;
    }

    public String getNotificationStatus() {
        return this.notificationStatus;
    }

    public String getNotificationType() {
        return this.notificationType;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public Temporal.DateTime getScheduledAt() {
        return this.scheduledAt;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getNotificationId() + getNotificationChannel() + getNotificationStatus() + getNotificationType() + getNotificationRelatedObjectType() + getNotificationRelatedObjectId() + getOwnerId() + getPrimaryTeamId() + getContactId() + getActivityDoneByUserId() + getContent() + getCreatedAt() + getUpdatedAt() + getScheduledAt() + getExpirationUnixTime()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationStaging {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("notificationId=" + String.valueOf(getNotificationId()) + ", ");
        sb.append("notificationChannel=" + String.valueOf(getNotificationChannel()) + ", ");
        sb.append("notificationStatus=" + String.valueOf(getNotificationStatus()) + ", ");
        sb.append("notificationType=" + String.valueOf(getNotificationType()) + ", ");
        sb.append("notificationRelatedObjectType=" + String.valueOf(getNotificationRelatedObjectType()) + ", ");
        sb.append("notificationRelatedObjectId=" + String.valueOf(getNotificationRelatedObjectId()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("primaryTeamId=" + String.valueOf(getPrimaryTeamId()) + ", ");
        sb.append("contactId=" + String.valueOf(getContactId()) + ", ");
        sb.append("activityDoneByUserId=" + String.valueOf(getActivityDoneByUserId()) + ", ");
        sb.append("content=" + String.valueOf(getContent()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("scheduledAt=" + String.valueOf(getScheduledAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expirationUnixTime=");
        sb2.append(String.valueOf(getExpirationUnixTime()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private NotificationStaging(String str, String str2, String str3, String str4, String str5, String str6, ActivityRelatedObjectType activityRelatedObjectType, String str7, String str8, String str9, String str10, String str11, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.Timestamp timestamp) {
        this.id = str;
        this.accountId = str2;
        this.notificationId = str3;
        this.notificationChannel = str4;
        this.notificationStatus = str5;
        this.notificationType = str6;
        this.notificationRelatedObjectType = activityRelatedObjectType;
        this.notificationRelatedObjectId = str7;
        this.ownerId = str8;
        this.primaryTeamId = str9;
        this.contactId = str10;
        this.activityDoneByUserId = str11;
        this.content = str12;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.scheduledAt = dateTime3;
        this.expirationUnixTime = timestamp;
    }
}
