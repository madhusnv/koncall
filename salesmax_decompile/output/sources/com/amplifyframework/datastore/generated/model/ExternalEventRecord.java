package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"externalSourceType", "externalSourceId"}, name = "eventByExternalSourceId")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "ExternalEventRecords")
/* loaded from: classes5.dex */
public final class ExternalEventRecord implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ID")
    private final String contactId;

    @ModelField(targetType = "String")
    private final String contactName;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String engagementId;

    @ModelField(targetType = "String")
    private final String eventDescription;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime eventEndTime;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime eventStartTime;

    @ModelField(targetType = "String")
    private final String eventSummary;

    @ModelField(targetType = "String")
    private final String eventUrl;

    @ModelField(isRequired = true, targetType = "ID")
    private final String externalSourceId;

    @ModelField(isRequired = true, targetType = "String")
    private final String externalSourceType;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "AWSJSON")
    private final String message;

    @ModelField(targetType = "AWSEmail")
    private final String primaryParticipantEmailId;

    @ModelField(targetType = "String")
    private final String primaryParticipantName;

    @ModelField(targetType = "AWSJSON")
    private final String rawEvent;

    @ModelField(targetType = "String")
    private final String recordingUrl;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "String")
    private final String transcriptUrl;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String userId;
    public static final QueryField ID = QueryField.field("ExternalEventRecord", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ExternalEventRecord", "accountId");
    public static final QueryField EXTERNAL_SOURCE_ID = QueryField.field("ExternalEventRecord", "externalSourceId");
    public static final QueryField EXTERNAL_SOURCE_TYPE = QueryField.field("ExternalEventRecord", "externalSourceType");
    public static final QueryField ENGAGEMENT_ID = QueryField.field("ExternalEventRecord", "engagementId");
    public static final QueryField USER_ID = QueryField.field("ExternalEventRecord", "userId");
    public static final QueryField CONTACT_ID = QueryField.field("ExternalEventRecord", "contactId");
    public static final QueryField CONTACT_NAME = QueryField.field("ExternalEventRecord", "contactName");
    public static final QueryField PRIMARY_PARTICIPANT_EMAIL_ID = QueryField.field("ExternalEventRecord", "primaryParticipantEmailId");
    public static final QueryField PRIMARY_PARTICIPANT_NAME = QueryField.field("ExternalEventRecord", "primaryParticipantName");
    public static final QueryField RECORDING_URL = QueryField.field("ExternalEventRecord", "recordingUrl");
    public static final QueryField TRANSCRIPT_URL = QueryField.field("ExternalEventRecord", "transcriptUrl");
    public static final QueryField RAW_EVENT = QueryField.field("ExternalEventRecord", "rawEvent");
    public static final QueryField MESSAGE = QueryField.field("ExternalEventRecord", OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
    public static final QueryField STATUS = QueryField.field("ExternalEventRecord", "status");
    public static final QueryField EVENT_SUMMARY = QueryField.field("ExternalEventRecord", "eventSummary");
    public static final QueryField EVENT_DESCRIPTION = QueryField.field("ExternalEventRecord", "eventDescription");
    public static final QueryField EVENT_URL = QueryField.field("ExternalEventRecord", "eventUrl");
    public static final QueryField EVENT_START_TIME = QueryField.field("ExternalEventRecord", "eventStartTime");
    public static final QueryField EVENT_END_TIME = QueryField.field("ExternalEventRecord", "eventEndTime");
    public static final QueryField CREATED_AT = QueryField.field("ExternalEventRecord", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ExternalEventRecord", "updatedAt");

    public interface AccountIdStep {
        ExternalSourceIdStep accountId(String str);
    }

    public interface BuildStep {
        ExternalEventRecord build();

        BuildStep contactId(String str);

        BuildStep contactName(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep engagementId(String str);

        BuildStep eventDescription(String str);

        BuildStep eventEndTime(Temporal.DateTime dateTime);

        BuildStep eventStartTime(Temporal.DateTime dateTime);

        BuildStep eventSummary(String str);

        BuildStep eventUrl(String str);

        BuildStep id(String str);

        BuildStep message(String str);

        BuildStep primaryParticipantEmailId(String str);

        BuildStep primaryParticipantName(String str);

        BuildStep rawEvent(String str);

        BuildStep recordingUrl(String str);

        BuildStep status(String str);

        BuildStep transcriptUrl(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep userId(String str);
    }

    public static class Builder implements AccountIdStep, ExternalSourceIdStep, ExternalSourceTypeStep, BuildStep {
        private String accountId;
        private String contactId;
        private String contactName;
        private Temporal.DateTime createdAt;
        private String engagementId;
        private String eventDescription;
        private Temporal.DateTime eventEndTime;
        private Temporal.DateTime eventStartTime;
        private String eventSummary;
        private String eventUrl;
        private String externalSourceId;
        private String externalSourceType;
        private String id;
        private String message;
        private String primaryParticipantEmailId;
        private String primaryParticipantName;
        private String rawEvent;
        private String recordingUrl;
        private String status;
        private String transcriptUrl;
        private Temporal.DateTime updatedAt;
        private String userId;

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.AccountIdStep
        public ExternalSourceIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public ExternalEventRecord build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ExternalEventRecord(string, this.accountId, this.externalSourceId, this.externalSourceType, this.engagementId, this.userId, this.contactId, this.contactName, this.primaryParticipantEmailId, this.primaryParticipantName, this.recordingUrl, this.transcriptUrl, this.rawEvent, this.message, this.status, this.eventSummary, this.eventDescription, this.eventUrl, this.eventStartTime, this.eventEndTime, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep contactId(String str) {
            this.contactId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep contactName(String str) {
            this.contactName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep engagementId(String str) {
            this.engagementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep eventDescription(String str) {
            this.eventDescription = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep eventEndTime(Temporal.DateTime dateTime) {
            this.eventEndTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep eventStartTime(Temporal.DateTime dateTime) {
            this.eventStartTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep eventSummary(String str) {
            this.eventSummary = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep eventUrl(String str) {
            this.eventUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.ExternalSourceIdStep
        public ExternalSourceTypeStep externalSourceId(String str) {
            Objects.requireNonNull(str);
            this.externalSourceId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.ExternalSourceTypeStep
        public BuildStep externalSourceType(String str) {
            Objects.requireNonNull(str);
            this.externalSourceType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep message(String str) {
            this.message = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep primaryParticipantEmailId(String str) {
            this.primaryParticipantEmailId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep primaryParticipantName(String str) {
            this.primaryParticipantName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep rawEvent(String str) {
            this.rawEvent = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep recordingUrl(String str) {
            this.recordingUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep transcriptUrl(String str) {
            this.transcriptUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public BuildStep userId(String str) {
            this.userId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            this.id = str;
            this.accountId = str2;
            this.externalSourceId = str3;
            this.externalSourceType = str4;
            this.engagementId = str5;
            this.userId = str6;
            this.contactId = str7;
            this.contactName = str8;
            this.primaryParticipantEmailId = str9;
            this.primaryParticipantName = str10;
            this.recordingUrl = str11;
            this.transcriptUrl = str12;
            this.rawEvent = str13;
            this.message = str14;
            this.status = str15;
            this.eventSummary = str16;
            this.eventDescription = str17;
            this.eventUrl = str18;
            this.eventStartTime = dateTime;
            this.eventEndTime = dateTime2;
            this.createdAt = dateTime3;
            this.updatedAt = dateTime4;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            super(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, dateTime, dateTime2, dateTime3, dateTime4);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder contactId(String str) {
            return (CopyOfBuilder) super.contactId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder contactName(String str) {
            return (CopyOfBuilder) super.contactName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder engagementId(String str) {
            return (CopyOfBuilder) super.engagementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder eventDescription(String str) {
            return (CopyOfBuilder) super.eventDescription(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder eventEndTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.eventEndTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder eventStartTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.eventStartTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder eventSummary(String str) {
            return (CopyOfBuilder) super.eventSummary(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder eventUrl(String str) {
            return (CopyOfBuilder) super.eventUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.ExternalSourceIdStep
        public CopyOfBuilder externalSourceId(String str) {
            return (CopyOfBuilder) super.externalSourceId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.ExternalSourceTypeStep
        public CopyOfBuilder externalSourceType(String str) {
            return (CopyOfBuilder) super.externalSourceType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder message(String str) {
            return (CopyOfBuilder) super.message(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder primaryParticipantEmailId(String str) {
            return (CopyOfBuilder) super.primaryParticipantEmailId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder primaryParticipantName(String str) {
            return (CopyOfBuilder) super.primaryParticipantName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder rawEvent(String str) {
            return (CopyOfBuilder) super.rawEvent(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder recordingUrl(String str) {
            return (CopyOfBuilder) super.recordingUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder transcriptUrl(String str) {
            return (CopyOfBuilder) super.transcriptUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalEventRecord.Builder, com.amplifyframework.datastore.generated.model.ExternalEventRecord.BuildStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }
    }

    public interface ExternalSourceIdStep {
        ExternalSourceTypeStep externalSourceId(String str);
    }

    public interface ExternalSourceTypeStep {
        BuildStep externalSourceType(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ExternalEventRecord justId(String str) {
        return new ExternalEventRecord(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.externalSourceId, this.externalSourceType, this.engagementId, this.userId, this.contactId, this.contactName, this.primaryParticipantEmailId, this.primaryParticipantName, this.recordingUrl, this.transcriptUrl, this.rawEvent, this.message, this.status, this.eventSummary, this.eventDescription, this.eventUrl, this.eventStartTime, this.eventEndTime, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ExternalEventRecord.class != obj.getClass()) {
            return false;
        }
        ExternalEventRecord externalEventRecord = (ExternalEventRecord) obj;
        return s6c.m47909a(getId(), externalEventRecord.getId()) && s6c.m47909a(getAccountId(), externalEventRecord.getAccountId()) && s6c.m47909a(getExternalSourceId(), externalEventRecord.getExternalSourceId()) && s6c.m47909a(getExternalSourceType(), externalEventRecord.getExternalSourceType()) && s6c.m47909a(getEngagementId(), externalEventRecord.getEngagementId()) && s6c.m47909a(getUserId(), externalEventRecord.getUserId()) && s6c.m47909a(getContactId(), externalEventRecord.getContactId()) && s6c.m47909a(getContactName(), externalEventRecord.getContactName()) && s6c.m47909a(getPrimaryParticipantEmailId(), externalEventRecord.getPrimaryParticipantEmailId()) && s6c.m47909a(getPrimaryParticipantName(), externalEventRecord.getPrimaryParticipantName()) && s6c.m47909a(getRecordingUrl(), externalEventRecord.getRecordingUrl()) && s6c.m47909a(getTranscriptUrl(), externalEventRecord.getTranscriptUrl()) && s6c.m47909a(getRawEvent(), externalEventRecord.getRawEvent()) && s6c.m47909a(getMessage(), externalEventRecord.getMessage()) && s6c.m47909a(getStatus(), externalEventRecord.getStatus()) && s6c.m47909a(getEventSummary(), externalEventRecord.getEventSummary()) && s6c.m47909a(getEventDescription(), externalEventRecord.getEventDescription()) && s6c.m47909a(getEventUrl(), externalEventRecord.getEventUrl()) && s6c.m47909a(getEventStartTime(), externalEventRecord.getEventStartTime()) && s6c.m47909a(getEventEndTime(), externalEventRecord.getEventEndTime()) && s6c.m47909a(getCreatedAt(), externalEventRecord.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), externalEventRecord.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getContactId() {
        return this.contactId;
    }

    public String getContactName() {
        return this.contactName;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public String getEventDescription() {
        return this.eventDescription;
    }

    public Temporal.DateTime getEventEndTime() {
        return this.eventEndTime;
    }

    public Temporal.DateTime getEventStartTime() {
        return this.eventStartTime;
    }

    public String getEventSummary() {
        return this.eventSummary;
    }

    public String getEventUrl() {
        return this.eventUrl;
    }

    public String getExternalSourceId() {
        return this.externalSourceId;
    }

    public String getExternalSourceType() {
        return this.externalSourceType;
    }

    public String getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPrimaryParticipantEmailId() {
        return this.primaryParticipantEmailId;
    }

    public String getPrimaryParticipantName() {
        return this.primaryParticipantName;
    }

    public String getRawEvent() {
        return this.rawEvent;
    }

    public String getRecordingUrl() {
        return this.recordingUrl;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTranscriptUrl() {
        return this.transcriptUrl;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getExternalSourceId() + getExternalSourceType() + getEngagementId() + getUserId() + getContactId() + getContactName() + getPrimaryParticipantEmailId() + getPrimaryParticipantName() + getRecordingUrl() + getTranscriptUrl() + getRawEvent() + getMessage() + getStatus() + getEventSummary() + getEventDescription() + getEventUrl() + getEventStartTime() + getEventEndTime() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExternalEventRecord {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("externalSourceId=" + String.valueOf(getExternalSourceId()) + ", ");
        sb.append("externalSourceType=" + String.valueOf(getExternalSourceType()) + ", ");
        sb.append("engagementId=" + String.valueOf(getEngagementId()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("contactId=" + String.valueOf(getContactId()) + ", ");
        sb.append("contactName=" + String.valueOf(getContactName()) + ", ");
        sb.append("primaryParticipantEmailId=" + String.valueOf(getPrimaryParticipantEmailId()) + ", ");
        sb.append("primaryParticipantName=" + String.valueOf(getPrimaryParticipantName()) + ", ");
        sb.append("recordingUrl=" + String.valueOf(getRecordingUrl()) + ", ");
        sb.append("transcriptUrl=" + String.valueOf(getTranscriptUrl()) + ", ");
        sb.append("rawEvent=" + String.valueOf(getRawEvent()) + ", ");
        sb.append("message=" + String.valueOf(getMessage()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("eventSummary=" + String.valueOf(getEventSummary()) + ", ");
        sb.append("eventDescription=" + String.valueOf(getEventDescription()) + ", ");
        sb.append("eventUrl=" + String.valueOf(getEventUrl()) + ", ");
        sb.append("eventStartTime=" + String.valueOf(getEventStartTime()) + ", ");
        sb.append("eventEndTime=" + String.valueOf(getEventEndTime()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ExternalEventRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
        this.id = str;
        this.accountId = str2;
        this.externalSourceId = str3;
        this.externalSourceType = str4;
        this.engagementId = str5;
        this.userId = str6;
        this.contactId = str7;
        this.contactName = str8;
        this.primaryParticipantEmailId = str9;
        this.primaryParticipantName = str10;
        this.recordingUrl = str11;
        this.transcriptUrl = str12;
        this.rawEvent = str13;
        this.message = str14;
        this.status = str15;
        this.eventSummary = str16;
        this.eventDescription = str17;
        this.eventUrl = str18;
        this.eventStartTime = dateTime;
        this.eventEndTime = dateTime2;
        this.createdAt = dateTime3;
        this.updatedAt = dateTime4;
    }
}
