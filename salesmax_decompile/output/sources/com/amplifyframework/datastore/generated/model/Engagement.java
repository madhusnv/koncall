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

@Indexes({@Index(fields = {"parentEngagementId"}, name = "ByParentEngagement"), @Index(fields = {"contactId", "engagementType", "updatedAt"}, name = "listEngagementTypeByContact")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "Engagements")
/* loaded from: classes5.dex */
public final class Engagement implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User addedBy;

    @ModelField(targetType = "ID")
    private final String addedById;

    @ModelField(targetType = "String")
    private final String body;

    @ModelField(targetType = "String")
    private final String calendarEventId;

    @ModelField(targetType = "String")
    private final String calendarName;

    @ModelField(targetType = "CallConnectStatus")
    private final CallConnectStatus callConnectStatus;

    @ModelField(targetType = "CallDirection")
    private final CallDirection callDirection;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime callEndTime;

    @ModelField(targetType = "String")
    private final String callOutcome;

    @ModelField(targetType = "String")
    private final String callOutcomeNature;

    @ModelField(targetType = "String")
    private final String callRecordingExternalResource;

    @ModelField(targetType = "String")
    private final String callRecordingUrl;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime callStartTime;

    @ModelField(targetType = "String")
    private final String callStatus;

    @ModelField(targetType = "String")
    private final String callTranscriptSummary;

    @ModelField(targetType = "String")
    private final String callTranscriptUrl;

    @ModelField(targetType = "String")
    private final String callType;

    @ModelField(targetType = "DistributionDefinition")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = DistributionDefinition.class)
    private final DistributionDefinition campaign;

    @ModelField(targetType = "ID")
    private final String campaignId;

    @ModelField(targetType = "String")
    private final String campaignRun;

    @ModelField(targetType = "Engagement")
    @HasMany(associatedWith = "parentEngagement", type = Engagement.class)
    private final List<Engagement> childEngagements;

    @ModelField(targetType = "String")
    private final String cloudProvider;

    @ModelField(targetType = "String")
    private final String cloudProviderNumber;

    @ModelField(targetType = "Comment")
    @HasMany(associatedWith = "engagement", type = Comment.class)
    private final List<Comment> comments;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "ID")
    private final String contactOwnerId;

    @ModelField(targetType = "ID")
    private final String contactPrimaryTeamId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "AWSJSON")
    private final String customCallOutcomeData;

    @ModelField(targetType = "AWSJSON")
    private final String customTaskCompletionData;

    @ModelField(targetType = "AWSJSON")
    private final String customTaskInputData;

    @ModelField(targetType = "AWSJSON")
    private final String customVideoCallInputData;

    @ModelField(targetType = "AWSJSON")
    private final String customVisitOutcomeData;

    @ModelField(targetType = "String")
    private final String deviceId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime dueDateTime;

    @ModelField(targetType = "Int")
    private final Integer durationInMillis;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User engagementOwner;

    @ModelField(targetType = "String")
    private final String engagementSource;

    @ModelField(targetType = "String")
    private final String engagementSourceLevelTwo;

    @ModelField(targetType = "String")
    private final String engagementSourceType;

    @ModelField(isRequired = true, targetType = "EngagementStatus")
    private final EngagementStatus engagementStatus;

    @ModelField(isRequired = true, targetType = "EngagementType")
    private final EngagementType engagementType;

    @ModelField(targetType = "EngagementUpdate")
    @HasMany(associatedWith = "engagement", type = EngagementUpdate.class)
    private final List<EngagementUpdate> engagementUpdate;

    @ModelField(targetType = "ExternalEventRecord")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = ExternalEventRecord.class)
    private final ExternalEventRecord externalEventRecord;

    @ModelField(targetType = "ID")
    private final String externalEventRecordId;

    @ModelField(targetType = "String")
    private final String externalNumber;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime firstTaskEngagementActionOn;

    @ModelField(targetType = "String")
    private final String hangupReason;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean isManualTask;

    @ModelField(targetType = "CampaignDefinition")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = CampaignDefinition.class)
    private final CampaignDefinition linkedCampaign;

    @ModelField(targetType = "fileObjectRelationship")
    @HasMany(associatedWith = "engagement", type = fileObjectRelationship.class)
    private final List<fileObjectRelationship> linkedFiles;

    @ModelField(targetType = "ActivityLocation")
    @HasMany(associatedWith = "engagementId", type = ActivityLocation.class)
    private final List<ActivityLocation> locations;

    @ModelField(targetType = "String")
    private final String meetingCode;

    @ModelField(targetType = "String")
    private final String meetingName;

    @ModelField(targetType = "MeetingParticipant")
    private final List<MeetingParticipant> meetingParticipants;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime nextFollowUpOn;

    @ModelField(targetType = "String")
    private final String nextFollowUpSetBy;

    @BelongsTo(targetName = "nextStepTaskId", type = Engagement.class)
    @ModelField(targetType = "Engagement")
    private final Engagement nextStepTask;

    @ModelField(targetType = "NoteAdditionMethod")
    private final NoteAdditionMethod noteAdditionMethod;

    @ModelField(targetType = "String")
    private final String noteHeading;

    @ModelField(targetType = "ID")
    private final String ownerId;

    @BelongsTo(targetName = "parentEngagementId", type = Engagement.class)
    @ModelField(targetType = "Engagement")
    private final Engagement parentEngagement;

    @ModelField(targetType = "PaymentData")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = PaymentData.class)
    private final PaymentData paymentData;

    @ModelField(targetType = "ID")
    private final String paymentDataId;

    @ModelField(targetType = "String")
    private final String phoneCallLogId;

    @ModelField(targetType = "Team")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = Team.class)
    private final Team primaryTeam;

    @ModelField(targetType = "ID")
    private final String primaryTeamId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime reminderDateTime;

    @ModelField(targetType = "Boolean")
    private final Boolean syncStatus;

    @ModelField(targetType = "String")
    private final String systemAction;

    @ModelField(targetType = "TaskActivityType")
    private final TaskActivityType taskActivityType;

    @ModelField(targetType = "String")
    private final String taskCompletionNote;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime taskCompletionTime;

    @ModelField(targetType = "String")
    private final String taskCompletionType;

    @ModelField(targetType = "Int")
    private final Integer taskEngagementActionCount;

    @ModelField(targetType = "AWSJSON")
    private final List<String> taskEngagementActions;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime taskEngagementActionsUpdatedAt;

    @ModelField(targetType = "String")
    private final String taskHeading;

    @ModelField(targetType = "String")
    private final String taskInputNote;

    @ModelField(targetType = "Address")
    private final Address taskLocation;

    @ModelField(targetType = "String")
    private final String taskPriority;

    @ModelField(targetType = "String")
    private final String taskType;

    @ModelField(targetType = "ContactAssignmentStatus")
    private final ContactAssignmentStatus toBeAssigned;

    @ModelField(targetType = "Int")
    private final Integer totalCallDuration;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User updatedBy;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(targetType = "String")
    private final String uploadedFiledUrl;

    @ModelField(targetType = "String")
    private final String userNumber;

    @ModelField(targetType = "String")
    private final String videoCallLink;

    @ModelField(targetType = "AWSJSON")
    private final String videoCallMetadata;

    @ModelField(targetType = "String")
    private final String videoCallOutcome;

    @ModelField(targetType = "String")
    private final String videoCallPlatform;

    @ModelField(targetType = "Address")
    private final Address visitLocation;

    @ModelField(targetType = "String")
    private final String visitNote;

    @ModelField(targetType = "String")
    private final String visitOutcome;

    @ModelField(targetType = "String")
    private final String visitOutcomeNature;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime visitTime;

    @ModelField(targetType = "String")
    private final String voiceNoteUrl;
    public static final QueryField ID = QueryField.field("Engagement", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("Engagement", "accountId");
    public static final QueryField ENGAGEMENT_TYPE = QueryField.field("Engagement", "engagementType");
    public static final QueryField CONTACT = QueryField.field("Engagement", "contactId");
    public static final QueryField PRIMARY_TEAM_ID = QueryField.field("Engagement", "primaryTeamId");
    public static final QueryField TO_BE_ASSIGNED = QueryField.field("Engagement", "toBeAssigned");
    public static final QueryField OWNER_ID = QueryField.field("Engagement", "ownerId");
    public static final QueryField CONTACT_PRIMARY_TEAM_ID = QueryField.field("Engagement", "contactPrimaryTeamId");
    public static final QueryField CONTACT_OWNER_ID = QueryField.field("Engagement", "contactOwnerId");
    public static final QueryField ADDED_BY_ID = QueryField.field("Engagement", "addedById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("Engagement", "updatedById");
    public static final QueryField CALL_STATUS = QueryField.field("Engagement", "callStatus");
    public static final QueryField ENGAGEMENT_STATUS = QueryField.field("Engagement", "engagementStatus");
    public static final QueryField PARENT_ENGAGEMENT = QueryField.field("Engagement", "parentEngagementId");
    public static final QueryField NEXT_STEP_TASK = QueryField.field("Engagement", "nextStepTaskId");
    public static final QueryField SYNC_STATUS = QueryField.field("Engagement", "syncStatus");
    public static final QueryField EXTERNAL_NUMBER = QueryField.field("Engagement", "externalNumber");
    public static final QueryField USER_NUMBER = QueryField.field("Engagement", "userNumber");
    public static final QueryField CALL_DIRECTION = QueryField.field("Engagement", "callDirection");
    public static final QueryField CALL_CONNECT_STATUS = QueryField.field("Engagement", "callConnectStatus");
    public static final QueryField CALL_START_TIME = QueryField.field("Engagement", "callStartTime");
    public static final QueryField CALL_END_TIME = QueryField.field("Engagement", "callEndTime");
    public static final QueryField DURATION_IN_MILLIS = QueryField.field("Engagement", "durationInMillis");
    public static final QueryField CALL_OUTCOME = QueryField.field("Engagement", "callOutcome");
    public static final QueryField CALL_OUTCOME_NATURE = QueryField.field("Engagement", "callOutcomeNature");
    public static final QueryField CALL_RECORDING_EXTERNAL_RESOURCE = QueryField.field("Engagement", "callRecordingExternalResource");
    public static final QueryField NOTE_HEADING = QueryField.field("Engagement", "noteHeading");
    public static final QueryField NOTE_ADDITION_METHOD = QueryField.field("Engagement", "noteAdditionMethod");
    public static final QueryField VOICE_NOTE_URL = QueryField.field("Engagement", "voiceNoteUrl");
    public static final QueryField BODY = QueryField.field("Engagement", "body");
    public static final QueryField IS_MANUAL_TASK = QueryField.field("Engagement", "isManualTask");
    public static final QueryField TASK_HEADING = QueryField.field("Engagement", "taskHeading");
    public static final QueryField TASK_TYPE = QueryField.field("Engagement", "taskType");
    public static final QueryField TASK_ACTIVITY_TYPE = QueryField.field("Engagement", "taskActivityType");
    public static final QueryField TASK_INPUT_NOTE = QueryField.field("Engagement", "taskInputNote");
    public static final QueryField TASK_PRIORITY = QueryField.field("Engagement", "taskPriority");
    public static final QueryField TASK_COMPLETION_NOTE = QueryField.field("Engagement", "taskCompletionNote");
    public static final QueryField TASK_COMPLETION_TIME = QueryField.field("Engagement", "taskCompletionTime");
    public static final QueryField TASK_COMPLETION_TYPE = QueryField.field("Engagement", "taskCompletionType");
    public static final QueryField DUE_DATE_TIME = QueryField.field("Engagement", "dueDateTime");
    public static final QueryField NEXT_FOLLOW_UP_ON = QueryField.field("Engagement", "nextFollowUpOn");
    public static final QueryField NEXT_FOLLOW_UP_SET_BY = QueryField.field("Engagement", "nextFollowUpSetBy");
    public static final QueryField REMINDER_DATE_TIME = QueryField.field("Engagement", "reminderDateTime");
    public static final QueryField TASK_LOCATION = QueryField.field("Engagement", "taskLocation");
    public static final QueryField CALL_RECORDING_URL = QueryField.field("Engagement", "callRecordingUrl");
    public static final QueryField CALL_TRANSCRIPT_URL = QueryField.field("Engagement", "callTranscriptUrl");
    public static final QueryField CALL_TRANSCRIPT_SUMMARY = QueryField.field("Engagement", "callTranscriptSummary");
    public static final QueryField UPLOADED_FILED_URL = QueryField.field("Engagement", "uploadedFiledUrl");
    public static final QueryField VISIT_LOCATION = QueryField.field("Engagement", "visitLocation");
    public static final QueryField VISIT_TIME = QueryField.field("Engagement", "visitTime");
    public static final QueryField VISIT_NOTE = QueryField.field("Engagement", "visitNote");
    public static final QueryField VISIT_OUTCOME = QueryField.field("Engagement", "visitOutcome");
    public static final QueryField VISIT_OUTCOME_NATURE = QueryField.field("Engagement", "visitOutcomeNature");
    public static final QueryField VIDEO_CALL_PLATFORM = QueryField.field("Engagement", "videoCallPlatform");
    public static final QueryField VIDEO_CALL_LINK = QueryField.field("Engagement", "videoCallLink");
    public static final QueryField MEETING_NAME = QueryField.field("Engagement", "meetingName");
    public static final QueryField MEETING_CODE = QueryField.field("Engagement", "meetingCode");
    public static final QueryField VIDEO_CALL_METADATA = QueryField.field("Engagement", "videoCallMetadata");
    public static final QueryField VIDEO_CALL_OUTCOME = QueryField.field("Engagement", "videoCallOutcome");
    public static final QueryField MEETING_PARTICIPANTS = QueryField.field("Engagement", "meetingParticipants");
    public static final QueryField PAYMENT_DATA_ID = QueryField.field("Engagement", "paymentDataId");
    public static final QueryField CALENDAR_EVENT_ID = QueryField.field("Engagement", "calendarEventId");
    public static final QueryField CALENDAR_NAME = QueryField.field("Engagement", "calendarName");
    public static final QueryField CAMPAIGN_ID = QueryField.field("Engagement", "campaignId");
    public static final QueryField CAMPAIGN_RUN = QueryField.field("Engagement", "campaignRun");
    public static final QueryField ENGAGEMENT_SOURCE_TYPE = QueryField.field("Engagement", "engagementSourceType");
    public static final QueryField ENGAGEMENT_SOURCE = QueryField.field("Engagement", "engagementSource");
    public static final QueryField ENGAGEMENT_SOURCE_LEVEL_TWO = QueryField.field("Engagement", "engagementSourceLevelTwo");
    public static final QueryField SYSTEM_ACTION = QueryField.field("Engagement", "systemAction");
    public static final QueryField TASK_ENGAGEMENT_ACTIONS = QueryField.field("Engagement", "taskEngagementActions");
    public static final QueryField TASK_ENGAGEMENT_ACTIONS_UPDATED_AT = QueryField.field("Engagement", "taskEngagementActionsUpdatedAt");
    public static final QueryField FIRST_TASK_ENGAGEMENT_ACTION_ON = QueryField.field("Engagement", "firstTaskEngagementActionOn");
    public static final QueryField TASK_ENGAGEMENT_ACTION_COUNT = QueryField.field("Engagement", "taskEngagementActionCount");
    public static final QueryField CUSTOM_CALL_OUTCOME_DATA = QueryField.field("Engagement", "customCallOutcomeData");
    public static final QueryField CUSTOM_VISIT_OUTCOME_DATA = QueryField.field("Engagement", "customVisitOutcomeData");
    public static final QueryField CUSTOM_TASK_COMPLETION_DATA = QueryField.field("Engagement", "customTaskCompletionData");
    public static final QueryField CUSTOM_TASK_INPUT_DATA = QueryField.field("Engagement", "customTaskInputData");
    public static final QueryField CUSTOM_VIDEO_CALL_INPUT_DATA = QueryField.field("Engagement", "customVideoCallInputData");
    public static final QueryField DEVICE_ID = QueryField.field("Engagement", "deviceId");
    public static final QueryField TOTAL_CALL_DURATION = QueryField.field("Engagement", "totalCallDuration");
    public static final QueryField CLOUD_PROVIDER_NUMBER = QueryField.field("Engagement", "cloudProviderNumber");
    public static final QueryField HANGUP_REASON = QueryField.field("Engagement", "hangupReason");
    public static final QueryField CLOUD_PROVIDER = QueryField.field("Engagement", "cloudProvider");
    public static final QueryField CALL_TYPE = QueryField.field("Engagement", "callType");
    public static final QueryField PHONE_CALL_LOG_ID = QueryField.field("Engagement", "phoneCallLogId");
    public static final QueryField EXTERNAL_EVENT_RECORD_ID = QueryField.field("Engagement", "externalEventRecordId");
    public static final QueryField CREATED_AT = QueryField.field("Engagement", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("Engagement", "updatedAt");

    public interface AccountIdStep {
        EngagementTypeStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep addedById(String str);

        BuildStep body(String str);

        Engagement build();

        BuildStep calendarEventId(String str);

        BuildStep calendarName(String str);

        BuildStep callConnectStatus(CallConnectStatus callConnectStatus);

        BuildStep callDirection(CallDirection callDirection);

        BuildStep callEndTime(Temporal.DateTime dateTime);

        BuildStep callOutcome(String str);

        BuildStep callOutcomeNature(String str);

        BuildStep callRecordingExternalResource(String str);

        BuildStep callRecordingUrl(String str);

        BuildStep callStartTime(Temporal.DateTime dateTime);

        BuildStep callStatus(String str);

        BuildStep callTranscriptSummary(String str);

        BuildStep callTranscriptUrl(String str);

        BuildStep callType(String str);

        BuildStep campaignId(String str);

        BuildStep campaignRun(String str);

        BuildStep cloudProvider(String str);

        BuildStep cloudProviderNumber(String str);

        BuildStep contact(Contact contact);

        BuildStep contactOwnerId(String str);

        BuildStep contactPrimaryTeamId(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep customCallOutcomeData(String str);

        BuildStep customTaskCompletionData(String str);

        BuildStep customTaskInputData(String str);

        BuildStep customVideoCallInputData(String str);

        BuildStep customVisitOutcomeData(String str);

        BuildStep deviceId(String str);

        BuildStep dueDateTime(Temporal.DateTime dateTime);

        BuildStep durationInMillis(Integer num);

        BuildStep engagementSource(String str);

        BuildStep engagementSourceLevelTwo(String str);

        BuildStep engagementSourceType(String str);

        BuildStep externalEventRecordId(String str);

        BuildStep externalNumber(String str);

        BuildStep firstTaskEngagementActionOn(Temporal.DateTime dateTime);

        BuildStep hangupReason(String str);

        BuildStep id(String str);

        BuildStep isManualTask(Boolean bool);

        BuildStep meetingCode(String str);

        BuildStep meetingName(String str);

        BuildStep meetingParticipants(List<MeetingParticipant> list);

        BuildStep nextFollowUpOn(Temporal.DateTime dateTime);

        BuildStep nextFollowUpSetBy(String str);

        BuildStep nextStepTask(Engagement engagement);

        BuildStep noteAdditionMethod(NoteAdditionMethod noteAdditionMethod);

        BuildStep noteHeading(String str);

        BuildStep ownerId(String str);

        BuildStep parentEngagement(Engagement engagement);

        BuildStep paymentDataId(String str);

        BuildStep phoneCallLogId(String str);

        BuildStep primaryTeamId(String str);

        BuildStep reminderDateTime(Temporal.DateTime dateTime);

        BuildStep syncStatus(Boolean bool);

        BuildStep systemAction(String str);

        BuildStep taskActivityType(TaskActivityType taskActivityType);

        BuildStep taskCompletionNote(String str);

        BuildStep taskCompletionTime(Temporal.DateTime dateTime);

        BuildStep taskCompletionType(String str);

        BuildStep taskEngagementActionCount(Integer num);

        BuildStep taskEngagementActions(List<String> list);

        BuildStep taskEngagementActionsUpdatedAt(Temporal.DateTime dateTime);

        BuildStep taskHeading(String str);

        BuildStep taskInputNote(String str);

        BuildStep taskLocation(Address address);

        BuildStep taskPriority(String str);

        BuildStep taskType(String str);

        BuildStep toBeAssigned(ContactAssignmentStatus contactAssignmentStatus);

        BuildStep totalCallDuration(Integer num);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);

        BuildStep uploadedFiledUrl(String str);

        BuildStep userNumber(String str);

        BuildStep videoCallLink(String str);

        BuildStep videoCallMetadata(String str);

        BuildStep videoCallOutcome(String str);

        BuildStep videoCallPlatform(String str);

        BuildStep visitLocation(Address address);

        BuildStep visitNote(String str);

        BuildStep visitOutcome(String str);

        BuildStep visitOutcomeNature(String str);

        BuildStep visitTime(Temporal.DateTime dateTime);

        BuildStep voiceNoteUrl(String str);
    }

    public static class Builder implements AccountIdStep, EngagementTypeStep, EngagementStatusStep, BuildStep {
        private String accountId;
        private String addedById;
        private String body;
        private String calendarEventId;
        private String calendarName;
        private CallConnectStatus callConnectStatus;
        private CallDirection callDirection;
        private Temporal.DateTime callEndTime;
        private String callOutcome;
        private String callOutcomeNature;
        private String callRecordingExternalResource;
        private String callRecordingUrl;
        private Temporal.DateTime callStartTime;
        private String callStatus;
        private String callTranscriptSummary;
        private String callTranscriptUrl;
        private String callType;
        private String campaignId;
        private String campaignRun;
        private String cloudProvider;
        private String cloudProviderNumber;
        private Contact contact;
        private String contactOwnerId;
        private String contactPrimaryTeamId;
        private Temporal.DateTime createdAt;
        private String customCallOutcomeData;
        private String customTaskCompletionData;
        private String customTaskInputData;
        private String customVideoCallInputData;
        private String customVisitOutcomeData;
        private String deviceId;
        private Temporal.DateTime dueDateTime;
        private Integer durationInMillis;
        private String engagementSource;
        private String engagementSourceLevelTwo;
        private String engagementSourceType;
        private EngagementStatus engagementStatus;
        private EngagementType engagementType;
        private String externalEventRecordId;
        private String externalNumber;
        private Temporal.DateTime firstTaskEngagementActionOn;
        private String hangupReason;
        private String id;
        private Boolean isManualTask;
        private String meetingCode;
        private String meetingName;
        private List<MeetingParticipant> meetingParticipants;
        private Temporal.DateTime nextFollowUpOn;
        private String nextFollowUpSetBy;
        private Engagement nextStepTask;
        private NoteAdditionMethod noteAdditionMethod;
        private String noteHeading;
        private String ownerId;
        private Engagement parentEngagement;
        private String paymentDataId;
        private String phoneCallLogId;
        private String primaryTeamId;
        private Temporal.DateTime reminderDateTime;
        private Boolean syncStatus;
        private String systemAction;
        private TaskActivityType taskActivityType;
        private String taskCompletionNote;
        private Temporal.DateTime taskCompletionTime;
        private String taskCompletionType;
        private Integer taskEngagementActionCount;
        private List<String> taskEngagementActions;
        private Temporal.DateTime taskEngagementActionsUpdatedAt;
        private String taskHeading;
        private String taskInputNote;
        private Address taskLocation;
        private String taskPriority;
        private String taskType;
        private ContactAssignmentStatus toBeAssigned;
        private Integer totalCallDuration;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private String uploadedFiledUrl;
        private String userNumber;
        private String videoCallLink;
        private String videoCallMetadata;
        private String videoCallOutcome;
        private String videoCallPlatform;
        private Address visitLocation;
        private String visitNote;
        private String visitOutcome;
        private String visitOutcomeNature;
        private Temporal.DateTime visitTime;
        private String voiceNoteUrl;

        @Override // com.amplifyframework.datastore.generated.model.Engagement.AccountIdStep
        public EngagementTypeStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep addedById(String str) {
            this.addedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep body(String str) {
            this.body = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public Engagement build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new Engagement(string, this.accountId, this.engagementType, this.contact, this.primaryTeamId, this.toBeAssigned, this.ownerId, this.contactPrimaryTeamId, this.contactOwnerId, this.addedById, this.updatedById, this.callStatus, this.engagementStatus, this.parentEngagement, this.nextStepTask, this.syncStatus, this.externalNumber, this.userNumber, this.callDirection, this.callConnectStatus, this.callStartTime, this.callEndTime, this.durationInMillis, this.callOutcome, this.callOutcomeNature, this.callRecordingExternalResource, this.noteHeading, this.noteAdditionMethod, this.voiceNoteUrl, this.body, this.isManualTask, this.taskHeading, this.taskType, this.taskActivityType, this.taskInputNote, this.taskPriority, this.taskCompletionNote, this.taskCompletionTime, this.taskCompletionType, this.dueDateTime, this.nextFollowUpOn, this.nextFollowUpSetBy, this.reminderDateTime, this.taskLocation, this.callRecordingUrl, this.callTranscriptUrl, this.callTranscriptSummary, this.uploadedFiledUrl, this.visitLocation, this.visitTime, this.visitNote, this.visitOutcome, this.visitOutcomeNature, this.videoCallPlatform, this.videoCallLink, this.meetingName, this.meetingCode, this.videoCallMetadata, this.videoCallOutcome, this.meetingParticipants, this.paymentDataId, this.calendarEventId, this.calendarName, this.campaignId, this.campaignRun, this.engagementSourceType, this.engagementSource, this.engagementSourceLevelTwo, this.systemAction, this.taskEngagementActions, this.taskEngagementActionsUpdatedAt, this.firstTaskEngagementActionOn, this.taskEngagementActionCount, this.customCallOutcomeData, this.customVisitOutcomeData, this.customTaskCompletionData, this.customTaskInputData, this.customVideoCallInputData, this.deviceId, this.totalCallDuration, this.cloudProviderNumber, this.hangupReason, this.cloudProvider, this.callType, this.phoneCallLogId, this.externalEventRecordId, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep calendarEventId(String str) {
            this.calendarEventId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep calendarName(String str) {
            this.calendarName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep callConnectStatus(CallConnectStatus callConnectStatus) {
            this.callConnectStatus = callConnectStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep callDirection(CallDirection callDirection) {
            this.callDirection = callDirection;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep callEndTime(Temporal.DateTime dateTime) {
            this.callEndTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep callOutcome(String str) {
            this.callOutcome = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep callOutcomeNature(String str) {
            this.callOutcomeNature = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep callRecordingExternalResource(String str) {
            this.callRecordingExternalResource = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep callRecordingUrl(String str) {
            this.callRecordingUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep callStartTime(Temporal.DateTime dateTime) {
            this.callStartTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep callStatus(String str) {
            this.callStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep callTranscriptSummary(String str) {
            this.callTranscriptSummary = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep callTranscriptUrl(String str) {
            this.callTranscriptUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep callType(String str) {
            this.callType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep campaignId(String str) {
            this.campaignId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep campaignRun(String str) {
            this.campaignRun = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep cloudProvider(String str) {
            this.cloudProvider = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep cloudProviderNumber(String str) {
            this.cloudProviderNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep contactOwnerId(String str) {
            this.contactOwnerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep contactPrimaryTeamId(String str) {
            this.contactPrimaryTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep customCallOutcomeData(String str) {
            this.customCallOutcomeData = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep customTaskCompletionData(String str) {
            this.customTaskCompletionData = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep customTaskInputData(String str) {
            this.customTaskInputData = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep customVideoCallInputData(String str) {
            this.customVideoCallInputData = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep customVisitOutcomeData(String str) {
            this.customVisitOutcomeData = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep deviceId(String str) {
            this.deviceId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep dueDateTime(Temporal.DateTime dateTime) {
            this.dueDateTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep durationInMillis(Integer num) {
            this.durationInMillis = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep engagementSource(String str) {
            this.engagementSource = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep engagementSourceLevelTwo(String str) {
            this.engagementSourceLevelTwo = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep engagementSourceType(String str) {
            this.engagementSourceType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.EngagementStatusStep
        public BuildStep engagementStatus(EngagementStatus engagementStatus) {
            Objects.requireNonNull(engagementStatus);
            this.engagementStatus = engagementStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.EngagementTypeStep
        public EngagementStatusStep engagementType(EngagementType engagementType) {
            Objects.requireNonNull(engagementType);
            this.engagementType = engagementType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep externalEventRecordId(String str) {
            this.externalEventRecordId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep externalNumber(String str) {
            this.externalNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep firstTaskEngagementActionOn(Temporal.DateTime dateTime) {
            this.firstTaskEngagementActionOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep hangupReason(String str) {
            this.hangupReason = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep isManualTask(Boolean bool) {
            this.isManualTask = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep meetingCode(String str) {
            this.meetingCode = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep meetingName(String str) {
            this.meetingName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep meetingParticipants(List<MeetingParticipant> list) {
            this.meetingParticipants = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep nextFollowUpOn(Temporal.DateTime dateTime) {
            this.nextFollowUpOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep nextFollowUpSetBy(String str) {
            this.nextFollowUpSetBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep nextStepTask(Engagement engagement) {
            this.nextStepTask = engagement;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep noteAdditionMethod(NoteAdditionMethod noteAdditionMethod) {
            this.noteAdditionMethod = noteAdditionMethod;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep noteHeading(String str) {
            this.noteHeading = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep parentEngagement(Engagement engagement) {
            this.parentEngagement = engagement;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep paymentDataId(String str) {
            this.paymentDataId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep phoneCallLogId(String str) {
            this.phoneCallLogId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep primaryTeamId(String str) {
            this.primaryTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep reminderDateTime(Temporal.DateTime dateTime) {
            this.reminderDateTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep syncStatus(Boolean bool) {
            this.syncStatus = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep systemAction(String str) {
            this.systemAction = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep taskActivityType(TaskActivityType taskActivityType) {
            this.taskActivityType = taskActivityType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep taskCompletionNote(String str) {
            this.taskCompletionNote = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep taskCompletionTime(Temporal.DateTime dateTime) {
            this.taskCompletionTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep taskCompletionType(String str) {
            this.taskCompletionType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep taskEngagementActionCount(Integer num) {
            this.taskEngagementActionCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep taskEngagementActions(List<String> list) {
            this.taskEngagementActions = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep taskEngagementActionsUpdatedAt(Temporal.DateTime dateTime) {
            this.taskEngagementActionsUpdatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep taskHeading(String str) {
            this.taskHeading = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep taskInputNote(String str) {
            this.taskInputNote = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep taskLocation(Address address) {
            this.taskLocation = address;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep taskPriority(String str) {
            this.taskPriority = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep taskType(String str) {
            this.taskType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep toBeAssigned(ContactAssignmentStatus contactAssignmentStatus) {
            this.toBeAssigned = contactAssignmentStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep totalCallDuration(Integer num) {
            this.totalCallDuration = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep uploadedFiledUrl(String str) {
            this.uploadedFiledUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep userNumber(String str) {
            this.userNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep videoCallLink(String str) {
            this.videoCallLink = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep videoCallMetadata(String str) {
            this.videoCallMetadata = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep videoCallOutcome(String str) {
            this.videoCallOutcome = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep videoCallPlatform(String str) {
            this.videoCallPlatform = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep visitLocation(Address address) {
            this.visitLocation = address;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep visitNote(String str) {
            this.visitNote = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep visitOutcome(String str) {
            this.visitOutcome = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep visitOutcomeNature(String str) {
            this.visitOutcomeNature = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep visitTime(Temporal.DateTime dateTime) {
            this.visitTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public BuildStep voiceNoteUrl(String str) {
            this.voiceNoteUrl = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, EngagementType engagementType, Contact contact, String str3, ContactAssignmentStatus contactAssignmentStatus, String str4, String str5, String str6, String str7, String str8, String str9, EngagementStatus engagementStatus, Engagement engagement, Engagement engagement2, Boolean bool, String str10, String str11, CallDirection callDirection, CallConnectStatus callConnectStatus, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Integer num, String str12, String str13, String str14, String str15, NoteAdditionMethod noteAdditionMethod, String str16, String str17, Boolean bool2, String str18, String str19, TaskActivityType taskActivityType, String str20, String str21, String str22, Temporal.DateTime dateTime3, String str23, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, String str24, Temporal.DateTime dateTime6, Address address, String str25, String str26, String str27, String str28, Address address2, Temporal.DateTime dateTime7, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, List<MeetingParticipant> list, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, List<String> list2, Temporal.DateTime dateTime8, Temporal.DateTime dateTime9, Integer num2, String str47, String str48, String str49, String str50, String str51, String str52, Integer num3, String str53, String str54, String str55, String str56, String str57, String str58, Temporal.DateTime dateTime10, Temporal.DateTime dateTime11) {
            this.id = str;
            this.accountId = str2;
            this.engagementType = engagementType;
            this.contact = contact;
            this.primaryTeamId = str3;
            this.toBeAssigned = contactAssignmentStatus;
            this.ownerId = str4;
            this.contactPrimaryTeamId = str5;
            this.contactOwnerId = str6;
            this.addedById = str7;
            this.updatedById = str8;
            this.callStatus = str9;
            this.engagementStatus = engagementStatus;
            this.parentEngagement = engagement;
            this.nextStepTask = engagement2;
            this.syncStatus = bool;
            this.externalNumber = str10;
            this.userNumber = str11;
            this.callDirection = callDirection;
            this.callConnectStatus = callConnectStatus;
            this.callStartTime = dateTime;
            this.callEndTime = dateTime2;
            this.durationInMillis = num;
            this.callOutcome = str12;
            this.callOutcomeNature = str13;
            this.callRecordingExternalResource = str14;
            this.noteHeading = str15;
            this.noteAdditionMethod = noteAdditionMethod;
            this.voiceNoteUrl = str16;
            this.body = str17;
            this.isManualTask = bool2;
            this.taskHeading = str18;
            this.taskType = str19;
            this.taskActivityType = taskActivityType;
            this.taskInputNote = str20;
            this.taskPriority = str21;
            this.taskCompletionNote = str22;
            this.taskCompletionTime = dateTime3;
            this.taskCompletionType = str23;
            this.dueDateTime = dateTime4;
            this.nextFollowUpOn = dateTime5;
            this.nextFollowUpSetBy = str24;
            this.reminderDateTime = dateTime6;
            this.taskLocation = address;
            this.callRecordingUrl = str25;
            this.callTranscriptUrl = str26;
            this.callTranscriptSummary = str27;
            this.uploadedFiledUrl = str28;
            this.visitLocation = address2;
            this.visitTime = dateTime7;
            this.visitNote = str29;
            this.visitOutcome = str30;
            this.visitOutcomeNature = str31;
            this.videoCallPlatform = str32;
            this.videoCallLink = str33;
            this.meetingName = str34;
            this.meetingCode = str35;
            this.videoCallMetadata = str36;
            this.videoCallOutcome = str37;
            this.meetingParticipants = list;
            this.paymentDataId = str38;
            this.calendarEventId = str39;
            this.calendarName = str40;
            this.campaignId = str41;
            this.campaignRun = str42;
            this.engagementSourceType = str43;
            this.engagementSource = str44;
            this.engagementSourceLevelTwo = str45;
            this.systemAction = str46;
            this.taskEngagementActions = list2;
            this.taskEngagementActionsUpdatedAt = dateTime8;
            this.firstTaskEngagementActionOn = dateTime9;
            this.taskEngagementActionCount = num2;
            this.customCallOutcomeData = str47;
            this.customVisitOutcomeData = str48;
            this.customTaskCompletionData = str49;
            this.customTaskInputData = str50;
            this.customVideoCallInputData = str51;
            this.deviceId = str52;
            this.totalCallDuration = num3;
            this.cloudProviderNumber = str53;
            this.hangupReason = str54;
            this.cloudProvider = str55;
            this.callType = str56;
            this.phoneCallLogId = str57;
            this.externalEventRecordId = str58;
            this.createdAt = dateTime10;
            this.updatedAt = dateTime11;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public /* bridge */ /* synthetic */ BuildStep meetingParticipants(List list) {
            return meetingParticipants((List<MeetingParticipant>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public /* bridge */ /* synthetic */ BuildStep taskEngagementActions(List list) {
            return taskEngagementActions((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, EngagementType engagementType, Contact contact, String str3, ContactAssignmentStatus contactAssignmentStatus, String str4, String str5, String str6, String str7, String str8, String str9, EngagementStatus engagementStatus, Engagement engagement, Engagement engagement2, Boolean bool, String str10, String str11, CallDirection callDirection, CallConnectStatus callConnectStatus, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Integer num, String str12, String str13, String str14, String str15, NoteAdditionMethod noteAdditionMethod, String str16, String str17, Boolean bool2, String str18, String str19, TaskActivityType taskActivityType, String str20, String str21, String str22, Temporal.DateTime dateTime3, String str23, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, String str24, Temporal.DateTime dateTime6, Address address, String str25, String str26, String str27, String str28, Address address2, Temporal.DateTime dateTime7, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, List<MeetingParticipant> list, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, List<String> list2, Temporal.DateTime dateTime8, Temporal.DateTime dateTime9, Integer num2, String str47, String str48, String str49, String str50, String str51, String str52, Integer num3, String str53, String str54, String str55, String str56, String str57, String str58, Temporal.DateTime dateTime10, Temporal.DateTime dateTime11) {
            super(str, str2, engagementType, contact, str3, contactAssignmentStatus, str4, str5, str6, str7, str8, str9, engagementStatus, engagement, engagement2, bool, str10, str11, callDirection, callConnectStatus, dateTime, dateTime2, num, str12, str13, str14, str15, noteAdditionMethod, str16, str17, bool2, str18, str19, taskActivityType, str20, str21, str22, dateTime3, str23, dateTime4, dateTime5, str24, dateTime6, address, str25, str26, str27, str28, address2, dateTime7, str29, str30, str31, str32, str33, str34, str35, str36, str37, list, str38, str39, str40, str41, str42, str43, str44, str45, str46, list2, dateTime8, dateTime9, num2, str47, str48, str49, str50, str51, str52, num3, str53, str54, str55, str56, str57, str58, dateTime10, dateTime11);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(engagementType);
            Objects.requireNonNull(engagementStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder addedById(String str) {
            return (CopyOfBuilder) super.addedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder body(String str) {
            return (CopyOfBuilder) super.body(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder calendarEventId(String str) {
            return (CopyOfBuilder) super.calendarEventId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder calendarName(String str) {
            return (CopyOfBuilder) super.calendarName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder callConnectStatus(CallConnectStatus callConnectStatus) {
            return (CopyOfBuilder) super.callConnectStatus(callConnectStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder callDirection(CallDirection callDirection) {
            return (CopyOfBuilder) super.callDirection(callDirection);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder callEndTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.callEndTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder callOutcome(String str) {
            return (CopyOfBuilder) super.callOutcome(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder callOutcomeNature(String str) {
            return (CopyOfBuilder) super.callOutcomeNature(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder callRecordingExternalResource(String str) {
            return (CopyOfBuilder) super.callRecordingExternalResource(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder callRecordingUrl(String str) {
            return (CopyOfBuilder) super.callRecordingUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder callStartTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.callStartTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder callStatus(String str) {
            return (CopyOfBuilder) super.callStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder callTranscriptSummary(String str) {
            return (CopyOfBuilder) super.callTranscriptSummary(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder callTranscriptUrl(String str) {
            return (CopyOfBuilder) super.callTranscriptUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder callType(String str) {
            return (CopyOfBuilder) super.callType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder campaignId(String str) {
            return (CopyOfBuilder) super.campaignId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder campaignRun(String str) {
            return (CopyOfBuilder) super.campaignRun(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder cloudProvider(String str) {
            return (CopyOfBuilder) super.cloudProvider(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder cloudProviderNumber(String str) {
            return (CopyOfBuilder) super.cloudProviderNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder contactOwnerId(String str) {
            return (CopyOfBuilder) super.contactOwnerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder contactPrimaryTeamId(String str) {
            return (CopyOfBuilder) super.contactPrimaryTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder customCallOutcomeData(String str) {
            return (CopyOfBuilder) super.customCallOutcomeData(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder customTaskCompletionData(String str) {
            return (CopyOfBuilder) super.customTaskCompletionData(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder customTaskInputData(String str) {
            return (CopyOfBuilder) super.customTaskInputData(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder customVideoCallInputData(String str) {
            return (CopyOfBuilder) super.customVideoCallInputData(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder customVisitOutcomeData(String str) {
            return (CopyOfBuilder) super.customVisitOutcomeData(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder deviceId(String str) {
            return (CopyOfBuilder) super.deviceId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder dueDateTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.dueDateTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder durationInMillis(Integer num) {
            return (CopyOfBuilder) super.durationInMillis(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder engagementSource(String str) {
            return (CopyOfBuilder) super.engagementSource(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder engagementSourceLevelTwo(String str) {
            return (CopyOfBuilder) super.engagementSourceLevelTwo(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder engagementSourceType(String str) {
            return (CopyOfBuilder) super.engagementSourceType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.EngagementStatusStep
        public CopyOfBuilder engagementStatus(EngagementStatus engagementStatus) {
            return (CopyOfBuilder) super.engagementStatus(engagementStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.EngagementTypeStep
        public CopyOfBuilder engagementType(EngagementType engagementType) {
            return (CopyOfBuilder) super.engagementType(engagementType);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder externalEventRecordId(String str) {
            return (CopyOfBuilder) super.externalEventRecordId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder externalNumber(String str) {
            return (CopyOfBuilder) super.externalNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder firstTaskEngagementActionOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.firstTaskEngagementActionOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder hangupReason(String str) {
            return (CopyOfBuilder) super.hangupReason(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder isManualTask(Boolean bool) {
            return (CopyOfBuilder) super.isManualTask(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder meetingCode(String str) {
            return (CopyOfBuilder) super.meetingCode(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder meetingName(String str) {
            return (CopyOfBuilder) super.meetingName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder meetingParticipants(List<MeetingParticipant> list) {
            return (CopyOfBuilder) super.meetingParticipants(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder nextFollowUpOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.nextFollowUpOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder nextFollowUpSetBy(String str) {
            return (CopyOfBuilder) super.nextFollowUpSetBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder nextStepTask(Engagement engagement) {
            return (CopyOfBuilder) super.nextStepTask(engagement);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder noteAdditionMethod(NoteAdditionMethod noteAdditionMethod) {
            return (CopyOfBuilder) super.noteAdditionMethod(noteAdditionMethod);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder noteHeading(String str) {
            return (CopyOfBuilder) super.noteHeading(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder parentEngagement(Engagement engagement) {
            return (CopyOfBuilder) super.parentEngagement(engagement);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder paymentDataId(String str) {
            return (CopyOfBuilder) super.paymentDataId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder phoneCallLogId(String str) {
            return (CopyOfBuilder) super.phoneCallLogId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder primaryTeamId(String str) {
            return (CopyOfBuilder) super.primaryTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder reminderDateTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.reminderDateTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder syncStatus(Boolean bool) {
            return (CopyOfBuilder) super.syncStatus(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder systemAction(String str) {
            return (CopyOfBuilder) super.systemAction(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder taskActivityType(TaskActivityType taskActivityType) {
            return (CopyOfBuilder) super.taskActivityType(taskActivityType);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder taskCompletionNote(String str) {
            return (CopyOfBuilder) super.taskCompletionNote(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder taskCompletionTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.taskCompletionTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder taskCompletionType(String str) {
            return (CopyOfBuilder) super.taskCompletionType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder taskEngagementActionCount(Integer num) {
            return (CopyOfBuilder) super.taskEngagementActionCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder taskEngagementActions(List<String> list) {
            return (CopyOfBuilder) super.taskEngagementActions(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder taskEngagementActionsUpdatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.taskEngagementActionsUpdatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder taskHeading(String str) {
            return (CopyOfBuilder) super.taskHeading(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder taskInputNote(String str) {
            return (CopyOfBuilder) super.taskInputNote(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder taskLocation(Address address) {
            return (CopyOfBuilder) super.taskLocation(address);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder taskPriority(String str) {
            return (CopyOfBuilder) super.taskPriority(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder taskType(String str) {
            return (CopyOfBuilder) super.taskType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder toBeAssigned(ContactAssignmentStatus contactAssignmentStatus) {
            return (CopyOfBuilder) super.toBeAssigned(contactAssignmentStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder totalCallDuration(Integer num) {
            return (CopyOfBuilder) super.totalCallDuration(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder uploadedFiledUrl(String str) {
            return (CopyOfBuilder) super.uploadedFiledUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder userNumber(String str) {
            return (CopyOfBuilder) super.userNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder videoCallLink(String str) {
            return (CopyOfBuilder) super.videoCallLink(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder videoCallMetadata(String str) {
            return (CopyOfBuilder) super.videoCallMetadata(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder videoCallOutcome(String str) {
            return (CopyOfBuilder) super.videoCallOutcome(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder videoCallPlatform(String str) {
            return (CopyOfBuilder) super.videoCallPlatform(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder visitLocation(Address address) {
            return (CopyOfBuilder) super.visitLocation(address);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder visitNote(String str) {
            return (CopyOfBuilder) super.visitNote(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder visitOutcome(String str) {
            return (CopyOfBuilder) super.visitOutcome(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder visitOutcomeNature(String str) {
            return (CopyOfBuilder) super.visitOutcomeNature(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder visitTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.visitTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Engagement.Builder, com.amplifyframework.datastore.generated.model.Engagement.BuildStep
        public CopyOfBuilder voiceNoteUrl(String str) {
            return (CopyOfBuilder) super.voiceNoteUrl(str);
        }
    }

    public interface EngagementStatusStep {
        BuildStep engagementStatus(EngagementStatus engagementStatus);
    }

    public interface EngagementTypeStep {
        EngagementStatusStep engagementType(EngagementType engagementType);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static Engagement justId(String str) {
        return new Engagement(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.engagementType, this.contact, this.primaryTeamId, this.toBeAssigned, this.ownerId, this.contactPrimaryTeamId, this.contactOwnerId, this.addedById, this.updatedById, this.callStatus, this.engagementStatus, this.parentEngagement, this.nextStepTask, this.syncStatus, this.externalNumber, this.userNumber, this.callDirection, this.callConnectStatus, this.callStartTime, this.callEndTime, this.durationInMillis, this.callOutcome, this.callOutcomeNature, this.callRecordingExternalResource, this.noteHeading, this.noteAdditionMethod, this.voiceNoteUrl, this.body, this.isManualTask, this.taskHeading, this.taskType, this.taskActivityType, this.taskInputNote, this.taskPriority, this.taskCompletionNote, this.taskCompletionTime, this.taskCompletionType, this.dueDateTime, this.nextFollowUpOn, this.nextFollowUpSetBy, this.reminderDateTime, this.taskLocation, this.callRecordingUrl, this.callTranscriptUrl, this.callTranscriptSummary, this.uploadedFiledUrl, this.visitLocation, this.visitTime, this.visitNote, this.visitOutcome, this.visitOutcomeNature, this.videoCallPlatform, this.videoCallLink, this.meetingName, this.meetingCode, this.videoCallMetadata, this.videoCallOutcome, this.meetingParticipants, this.paymentDataId, this.calendarEventId, this.calendarName, this.campaignId, this.campaignRun, this.engagementSourceType, this.engagementSource, this.engagementSourceLevelTwo, this.systemAction, this.taskEngagementActions, this.taskEngagementActionsUpdatedAt, this.firstTaskEngagementActionOn, this.taskEngagementActionCount, this.customCallOutcomeData, this.customVisitOutcomeData, this.customTaskCompletionData, this.customTaskInputData, this.customVideoCallInputData, this.deviceId, this.totalCallDuration, this.cloudProviderNumber, this.hangupReason, this.cloudProvider, this.callType, this.phoneCallLogId, this.externalEventRecordId, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Engagement.class != obj.getClass()) {
            return false;
        }
        Engagement engagement = (Engagement) obj;
        return s6c.m47909a(getId(), engagement.getId()) && s6c.m47909a(getAccountId(), engagement.getAccountId()) && s6c.m47909a(getEngagementType(), engagement.getEngagementType()) && s6c.m47909a(getContact(), engagement.getContact()) && s6c.m47909a(getPrimaryTeamId(), engagement.getPrimaryTeamId()) && s6c.m47909a(getToBeAssigned(), engagement.getToBeAssigned()) && s6c.m47909a(getOwnerId(), engagement.getOwnerId()) && s6c.m47909a(getContactPrimaryTeamId(), engagement.getContactPrimaryTeamId()) && s6c.m47909a(getContactOwnerId(), engagement.getContactOwnerId()) && s6c.m47909a(getAddedById(), engagement.getAddedById()) && s6c.m47909a(getUpdatedById(), engagement.getUpdatedById()) && s6c.m47909a(getCallStatus(), engagement.getCallStatus()) && s6c.m47909a(getEngagementStatus(), engagement.getEngagementStatus()) && s6c.m47909a(getParentEngagement(), engagement.getParentEngagement()) && s6c.m47909a(getNextStepTask(), engagement.getNextStepTask()) && s6c.m47909a(getSyncStatus(), engagement.getSyncStatus()) && s6c.m47909a(getExternalNumber(), engagement.getExternalNumber()) && s6c.m47909a(getUserNumber(), engagement.getUserNumber()) && s6c.m47909a(getCallDirection(), engagement.getCallDirection()) && s6c.m47909a(getCallConnectStatus(), engagement.getCallConnectStatus()) && s6c.m47909a(getCallStartTime(), engagement.getCallStartTime()) && s6c.m47909a(getCallEndTime(), engagement.getCallEndTime()) && s6c.m47909a(getDurationInMillis(), engagement.getDurationInMillis()) && s6c.m47909a(getCallOutcome(), engagement.getCallOutcome()) && s6c.m47909a(getCallOutcomeNature(), engagement.getCallOutcomeNature()) && s6c.m47909a(getCallRecordingExternalResource(), engagement.getCallRecordingExternalResource()) && s6c.m47909a(getNoteHeading(), engagement.getNoteHeading()) && s6c.m47909a(getNoteAdditionMethod(), engagement.getNoteAdditionMethod()) && s6c.m47909a(getVoiceNoteUrl(), engagement.getVoiceNoteUrl()) && s6c.m47909a(getBody(), engagement.getBody()) && s6c.m47909a(getIsManualTask(), engagement.getIsManualTask()) && s6c.m47909a(getTaskHeading(), engagement.getTaskHeading()) && s6c.m47909a(getTaskType(), engagement.getTaskType()) && s6c.m47909a(getTaskActivityType(), engagement.getTaskActivityType()) && s6c.m47909a(getTaskInputNote(), engagement.getTaskInputNote()) && s6c.m47909a(getTaskPriority(), engagement.getTaskPriority()) && s6c.m47909a(getTaskCompletionNote(), engagement.getTaskCompletionNote()) && s6c.m47909a(getTaskCompletionTime(), engagement.getTaskCompletionTime()) && s6c.m47909a(getTaskCompletionType(), engagement.getTaskCompletionType()) && s6c.m47909a(getDueDateTime(), engagement.getDueDateTime()) && s6c.m47909a(getNextFollowUpOn(), engagement.getNextFollowUpOn()) && s6c.m47909a(getNextFollowUpSetBy(), engagement.getNextFollowUpSetBy()) && s6c.m47909a(getReminderDateTime(), engagement.getReminderDateTime()) && s6c.m47909a(getTaskLocation(), engagement.getTaskLocation()) && s6c.m47909a(getCallRecordingUrl(), engagement.getCallRecordingUrl()) && s6c.m47909a(getCallTranscriptUrl(), engagement.getCallTranscriptUrl()) && s6c.m47909a(getCallTranscriptSummary(), engagement.getCallTranscriptSummary()) && s6c.m47909a(getUploadedFiledUrl(), engagement.getUploadedFiledUrl()) && s6c.m47909a(getVisitLocation(), engagement.getVisitLocation()) && s6c.m47909a(getVisitTime(), engagement.getVisitTime()) && s6c.m47909a(getVisitNote(), engagement.getVisitNote()) && s6c.m47909a(getVisitOutcome(), engagement.getVisitOutcome()) && s6c.m47909a(getVisitOutcomeNature(), engagement.getVisitOutcomeNature()) && s6c.m47909a(getVideoCallPlatform(), engagement.getVideoCallPlatform()) && s6c.m47909a(getVideoCallLink(), engagement.getVideoCallLink()) && s6c.m47909a(getMeetingName(), engagement.getMeetingName()) && s6c.m47909a(getMeetingCode(), engagement.getMeetingCode()) && s6c.m47909a(getVideoCallMetadata(), engagement.getVideoCallMetadata()) && s6c.m47909a(getVideoCallOutcome(), engagement.getVideoCallOutcome()) && s6c.m47909a(getMeetingParticipants(), engagement.getMeetingParticipants()) && s6c.m47909a(getPaymentDataId(), engagement.getPaymentDataId()) && s6c.m47909a(getCalendarEventId(), engagement.getCalendarEventId()) && s6c.m47909a(getCalendarName(), engagement.getCalendarName()) && s6c.m47909a(getCampaignId(), engagement.getCampaignId()) && s6c.m47909a(getCampaignRun(), engagement.getCampaignRun()) && s6c.m47909a(getEngagementSourceType(), engagement.getEngagementSourceType()) && s6c.m47909a(getEngagementSource(), engagement.getEngagementSource()) && s6c.m47909a(getEngagementSourceLevelTwo(), engagement.getEngagementSourceLevelTwo()) && s6c.m47909a(getSystemAction(), engagement.getSystemAction()) && s6c.m47909a(getTaskEngagementActions(), engagement.getTaskEngagementActions()) && s6c.m47909a(getTaskEngagementActionsUpdatedAt(), engagement.getTaskEngagementActionsUpdatedAt()) && s6c.m47909a(getFirstTaskEngagementActionOn(), engagement.getFirstTaskEngagementActionOn()) && s6c.m47909a(getTaskEngagementActionCount(), engagement.getTaskEngagementActionCount()) && s6c.m47909a(getCustomCallOutcomeData(), engagement.getCustomCallOutcomeData()) && s6c.m47909a(getCustomVisitOutcomeData(), engagement.getCustomVisitOutcomeData()) && s6c.m47909a(getCustomTaskCompletionData(), engagement.getCustomTaskCompletionData()) && s6c.m47909a(getCustomTaskInputData(), engagement.getCustomTaskInputData()) && s6c.m47909a(getCustomVideoCallInputData(), engagement.getCustomVideoCallInputData()) && s6c.m47909a(getDeviceId(), engagement.getDeviceId()) && s6c.m47909a(getTotalCallDuration(), engagement.getTotalCallDuration()) && s6c.m47909a(getCloudProviderNumber(), engagement.getCloudProviderNumber()) && s6c.m47909a(getHangupReason(), engagement.getHangupReason()) && s6c.m47909a(getCloudProvider(), engagement.getCloudProvider()) && s6c.m47909a(getCallType(), engagement.getCallType()) && s6c.m47909a(getPhoneCallLogId(), engagement.getPhoneCallLogId()) && s6c.m47909a(getExternalEventRecordId(), engagement.getExternalEventRecordId()) && s6c.m47909a(getCreatedAt(), engagement.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), engagement.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public User getAddedBy() {
        return this.addedBy;
    }

    public String getAddedById() {
        return this.addedById;
    }

    public String getBody() {
        return this.body;
    }

    public String getCalendarEventId() {
        return this.calendarEventId;
    }

    public String getCalendarName() {
        return this.calendarName;
    }

    public CallConnectStatus getCallConnectStatus() {
        return this.callConnectStatus;
    }

    public CallDirection getCallDirection() {
        return this.callDirection;
    }

    public Temporal.DateTime getCallEndTime() {
        return this.callEndTime;
    }

    public String getCallOutcome() {
        return this.callOutcome;
    }

    public String getCallOutcomeNature() {
        return this.callOutcomeNature;
    }

    public String getCallRecordingExternalResource() {
        return this.callRecordingExternalResource;
    }

    public String getCallRecordingUrl() {
        return this.callRecordingUrl;
    }

    public Temporal.DateTime getCallStartTime() {
        return this.callStartTime;
    }

    public String getCallStatus() {
        return this.callStatus;
    }

    public String getCallTranscriptSummary() {
        return this.callTranscriptSummary;
    }

    public String getCallTranscriptUrl() {
        return this.callTranscriptUrl;
    }

    public String getCallType() {
        return this.callType;
    }

    public DistributionDefinition getCampaign() {
        return this.campaign;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public String getCampaignRun() {
        return this.campaignRun;
    }

    public List<Engagement> getChildEngagements() {
        return this.childEngagements;
    }

    public String getCloudProvider() {
        return this.cloudProvider;
    }

    public String getCloudProviderNumber() {
        return this.cloudProviderNumber;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public Contact getContact() {
        return this.contact;
    }

    public String getContactOwnerId() {
        return this.contactOwnerId;
    }

    public String getContactPrimaryTeamId() {
        return this.contactPrimaryTeamId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCustomCallOutcomeData() {
        return this.customCallOutcomeData;
    }

    public String getCustomTaskCompletionData() {
        return this.customTaskCompletionData;
    }

    public String getCustomTaskInputData() {
        return this.customTaskInputData;
    }

    public String getCustomVideoCallInputData() {
        return this.customVideoCallInputData;
    }

    public String getCustomVisitOutcomeData() {
        return this.customVisitOutcomeData;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public Temporal.DateTime getDueDateTime() {
        return this.dueDateTime;
    }

    public Integer getDurationInMillis() {
        return this.durationInMillis;
    }

    public User getEngagementOwner() {
        return this.engagementOwner;
    }

    public String getEngagementSource() {
        return this.engagementSource;
    }

    public String getEngagementSourceLevelTwo() {
        return this.engagementSourceLevelTwo;
    }

    public String getEngagementSourceType() {
        return this.engagementSourceType;
    }

    public EngagementStatus getEngagementStatus() {
        return this.engagementStatus;
    }

    public EngagementType getEngagementType() {
        return this.engagementType;
    }

    public List<EngagementUpdate> getEngagementUpdate() {
        return this.engagementUpdate;
    }

    public ExternalEventRecord getExternalEventRecord() {
        return this.externalEventRecord;
    }

    public String getExternalEventRecordId() {
        return this.externalEventRecordId;
    }

    public String getExternalNumber() {
        return this.externalNumber;
    }

    public Temporal.DateTime getFirstTaskEngagementActionOn() {
        return this.firstTaskEngagementActionOn;
    }

    public String getHangupReason() {
        return this.hangupReason;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsManualTask() {
        return this.isManualTask;
    }

    public CampaignDefinition getLinkedCampaign() {
        return this.linkedCampaign;
    }

    public List<fileObjectRelationship> getLinkedFiles() {
        return this.linkedFiles;
    }

    public List<ActivityLocation> getLocations() {
        return this.locations;
    }

    public String getMeetingCode() {
        return this.meetingCode;
    }

    public String getMeetingName() {
        return this.meetingName;
    }

    public List<MeetingParticipant> getMeetingParticipants() {
        return this.meetingParticipants;
    }

    public Temporal.DateTime getNextFollowUpOn() {
        return this.nextFollowUpOn;
    }

    public String getNextFollowUpSetBy() {
        return this.nextFollowUpSetBy;
    }

    public Engagement getNextStepTask() {
        return this.nextStepTask;
    }

    public NoteAdditionMethod getNoteAdditionMethod() {
        return this.noteAdditionMethod;
    }

    public String getNoteHeading() {
        return this.noteHeading;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public Engagement getParentEngagement() {
        return this.parentEngagement;
    }

    public PaymentData getPaymentData() {
        return this.paymentData;
    }

    public String getPaymentDataId() {
        return this.paymentDataId;
    }

    public String getPhoneCallLogId() {
        return this.phoneCallLogId;
    }

    public Team getPrimaryTeam() {
        return this.primaryTeam;
    }

    public String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public Temporal.DateTime getReminderDateTime() {
        return this.reminderDateTime;
    }

    public Boolean getSyncStatus() {
        return this.syncStatus;
    }

    public String getSystemAction() {
        return this.systemAction;
    }

    public TaskActivityType getTaskActivityType() {
        return this.taskActivityType;
    }

    public String getTaskCompletionNote() {
        return this.taskCompletionNote;
    }

    public Temporal.DateTime getTaskCompletionTime() {
        return this.taskCompletionTime;
    }

    public String getTaskCompletionType() {
        return this.taskCompletionType;
    }

    public Integer getTaskEngagementActionCount() {
        return this.taskEngagementActionCount;
    }

    public List<String> getTaskEngagementActions() {
        return this.taskEngagementActions;
    }

    public Temporal.DateTime getTaskEngagementActionsUpdatedAt() {
        return this.taskEngagementActionsUpdatedAt;
    }

    public String getTaskHeading() {
        return this.taskHeading;
    }

    public String getTaskInputNote() {
        return this.taskInputNote;
    }

    public Address getTaskLocation() {
        return this.taskLocation;
    }

    public String getTaskPriority() {
        return this.taskPriority;
    }

    public String getTaskType() {
        return this.taskType;
    }

    public ContactAssignmentStatus getToBeAssigned() {
        return this.toBeAssigned;
    }

    public Integer getTotalCallDuration() {
        return this.totalCallDuration;
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

    public String getUploadedFiledUrl() {
        return this.uploadedFiledUrl;
    }

    public String getUserNumber() {
        return this.userNumber;
    }

    public String getVideoCallLink() {
        return this.videoCallLink;
    }

    public String getVideoCallMetadata() {
        return this.videoCallMetadata;
    }

    public String getVideoCallOutcome() {
        return this.videoCallOutcome;
    }

    public String getVideoCallPlatform() {
        return this.videoCallPlatform;
    }

    public Address getVisitLocation() {
        return this.visitLocation;
    }

    public String getVisitNote() {
        return this.visitNote;
    }

    public String getVisitOutcome() {
        return this.visitOutcome;
    }

    public String getVisitOutcomeNature() {
        return this.visitOutcomeNature;
    }

    public Temporal.DateTime getVisitTime() {
        return this.visitTime;
    }

    public String getVoiceNoteUrl() {
        return this.voiceNoteUrl;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getEngagementType() + getContact() + getPrimaryTeamId() + getToBeAssigned() + getOwnerId() + getContactPrimaryTeamId() + getContactOwnerId() + getAddedById() + getUpdatedById() + getCallStatus() + getEngagementStatus() + getParentEngagement() + getNextStepTask() + getSyncStatus() + getExternalNumber() + getUserNumber() + getCallDirection() + getCallConnectStatus() + getCallStartTime() + getCallEndTime() + getDurationInMillis() + getCallOutcome() + getCallOutcomeNature() + getCallRecordingExternalResource() + getNoteHeading() + getNoteAdditionMethod() + getVoiceNoteUrl() + getBody() + getIsManualTask() + getTaskHeading() + getTaskType() + getTaskActivityType() + getTaskInputNote() + getTaskPriority() + getTaskCompletionNote() + getTaskCompletionTime() + getTaskCompletionType() + getDueDateTime() + getNextFollowUpOn() + getNextFollowUpSetBy() + getReminderDateTime() + getTaskLocation() + getCallRecordingUrl() + getCallTranscriptUrl() + getCallTranscriptSummary() + getUploadedFiledUrl() + getVisitLocation() + getVisitTime() + getVisitNote() + getVisitOutcome() + getVisitOutcomeNature() + getVideoCallPlatform() + getVideoCallLink() + getMeetingName() + getMeetingCode() + getVideoCallMetadata() + getVideoCallOutcome() + getMeetingParticipants() + getPaymentDataId() + getCalendarEventId() + getCalendarName() + getCampaignId() + getCampaignRun() + getEngagementSourceType() + getEngagementSource() + getEngagementSourceLevelTwo() + getSystemAction() + getTaskEngagementActions() + getTaskEngagementActionsUpdatedAt() + getFirstTaskEngagementActionOn() + getTaskEngagementActionCount() + getCustomCallOutcomeData() + getCustomVisitOutcomeData() + getCustomTaskCompletionData() + getCustomTaskInputData() + getCustomVideoCallInputData() + getDeviceId() + getTotalCallDuration() + getCloudProviderNumber() + getHangupReason() + getCloudProvider() + getCallType() + getPhoneCallLogId() + getExternalEventRecordId() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Engagement {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("engagementType=" + String.valueOf(getEngagementType()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("primaryTeamId=" + String.valueOf(getPrimaryTeamId()) + ", ");
        sb.append("toBeAssigned=" + String.valueOf(getToBeAssigned()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("contactPrimaryTeamId=" + String.valueOf(getContactPrimaryTeamId()) + ", ");
        sb.append("contactOwnerId=" + String.valueOf(getContactOwnerId()) + ", ");
        sb.append("addedById=" + String.valueOf(getAddedById()) + ", ");
        sb.append("updatedById=" + String.valueOf(getUpdatedById()) + ", ");
        sb.append("callStatus=" + String.valueOf(getCallStatus()) + ", ");
        sb.append("engagementStatus=" + String.valueOf(getEngagementStatus()) + ", ");
        sb.append("parentEngagement=" + String.valueOf(getParentEngagement()) + ", ");
        sb.append("nextStepTask=" + String.valueOf(getNextStepTask()) + ", ");
        sb.append("syncStatus=" + String.valueOf(getSyncStatus()) + ", ");
        sb.append("externalNumber=" + String.valueOf(getExternalNumber()) + ", ");
        sb.append("userNumber=" + String.valueOf(getUserNumber()) + ", ");
        sb.append("callDirection=" + String.valueOf(getCallDirection()) + ", ");
        sb.append("callConnectStatus=" + String.valueOf(getCallConnectStatus()) + ", ");
        sb.append("callStartTime=" + String.valueOf(getCallStartTime()) + ", ");
        sb.append("callEndTime=" + String.valueOf(getCallEndTime()) + ", ");
        sb.append("durationInMillis=" + String.valueOf(getDurationInMillis()) + ", ");
        sb.append("callOutcome=" + String.valueOf(getCallOutcome()) + ", ");
        sb.append("callOutcomeNature=" + String.valueOf(getCallOutcomeNature()) + ", ");
        sb.append("callRecordingExternalResource=" + String.valueOf(getCallRecordingExternalResource()) + ", ");
        sb.append("noteHeading=" + String.valueOf(getNoteHeading()) + ", ");
        sb.append("noteAdditionMethod=" + String.valueOf(getNoteAdditionMethod()) + ", ");
        sb.append("voiceNoteUrl=" + String.valueOf(getVoiceNoteUrl()) + ", ");
        sb.append("body=" + String.valueOf(getBody()) + ", ");
        sb.append("isManualTask=" + String.valueOf(getIsManualTask()) + ", ");
        sb.append("taskHeading=" + String.valueOf(getTaskHeading()) + ", ");
        sb.append("taskType=" + String.valueOf(getTaskType()) + ", ");
        sb.append("taskActivityType=" + String.valueOf(getTaskActivityType()) + ", ");
        sb.append("taskInputNote=" + String.valueOf(getTaskInputNote()) + ", ");
        sb.append("taskPriority=" + String.valueOf(getTaskPriority()) + ", ");
        sb.append("taskCompletionNote=" + String.valueOf(getTaskCompletionNote()) + ", ");
        sb.append("taskCompletionTime=" + String.valueOf(getTaskCompletionTime()) + ", ");
        sb.append("taskCompletionType=" + String.valueOf(getTaskCompletionType()) + ", ");
        sb.append("dueDateTime=" + String.valueOf(getDueDateTime()) + ", ");
        sb.append("nextFollowUpOn=" + String.valueOf(getNextFollowUpOn()) + ", ");
        sb.append("nextFollowUpSetBy=" + String.valueOf(getNextFollowUpSetBy()) + ", ");
        sb.append("reminderDateTime=" + String.valueOf(getReminderDateTime()) + ", ");
        sb.append("taskLocation=" + String.valueOf(getTaskLocation()) + ", ");
        sb.append("callRecordingUrl=" + String.valueOf(getCallRecordingUrl()) + ", ");
        sb.append("callTranscriptUrl=" + String.valueOf(getCallTranscriptUrl()) + ", ");
        sb.append("callTranscriptSummary=" + String.valueOf(getCallTranscriptSummary()) + ", ");
        sb.append("uploadedFiledUrl=" + String.valueOf(getUploadedFiledUrl()) + ", ");
        sb.append("visitLocation=" + String.valueOf(getVisitLocation()) + ", ");
        sb.append("visitTime=" + String.valueOf(getVisitTime()) + ", ");
        sb.append("visitNote=" + String.valueOf(getVisitNote()) + ", ");
        sb.append("visitOutcome=" + String.valueOf(getVisitOutcome()) + ", ");
        sb.append("visitOutcomeNature=" + String.valueOf(getVisitOutcomeNature()) + ", ");
        sb.append("videoCallPlatform=" + String.valueOf(getVideoCallPlatform()) + ", ");
        sb.append("videoCallLink=" + String.valueOf(getVideoCallLink()) + ", ");
        sb.append("meetingName=" + String.valueOf(getMeetingName()) + ", ");
        sb.append("meetingCode=" + String.valueOf(getMeetingCode()) + ", ");
        sb.append("videoCallMetadata=" + String.valueOf(getVideoCallMetadata()) + ", ");
        sb.append("videoCallOutcome=" + String.valueOf(getVideoCallOutcome()) + ", ");
        sb.append("meetingParticipants=" + String.valueOf(getMeetingParticipants()) + ", ");
        sb.append("paymentDataId=" + String.valueOf(getPaymentDataId()) + ", ");
        sb.append("calendarEventId=" + String.valueOf(getCalendarEventId()) + ", ");
        sb.append("calendarName=" + String.valueOf(getCalendarName()) + ", ");
        sb.append("campaignId=" + String.valueOf(getCampaignId()) + ", ");
        sb.append("campaignRun=" + String.valueOf(getCampaignRun()) + ", ");
        sb.append("engagementSourceType=" + String.valueOf(getEngagementSourceType()) + ", ");
        sb.append("engagementSource=" + String.valueOf(getEngagementSource()) + ", ");
        sb.append("engagementSourceLevelTwo=" + String.valueOf(getEngagementSourceLevelTwo()) + ", ");
        sb.append("systemAction=" + String.valueOf(getSystemAction()) + ", ");
        sb.append("taskEngagementActions=" + String.valueOf(getTaskEngagementActions()) + ", ");
        sb.append("taskEngagementActionsUpdatedAt=" + String.valueOf(getTaskEngagementActionsUpdatedAt()) + ", ");
        sb.append("firstTaskEngagementActionOn=" + String.valueOf(getFirstTaskEngagementActionOn()) + ", ");
        sb.append("taskEngagementActionCount=" + String.valueOf(getTaskEngagementActionCount()) + ", ");
        sb.append("customCallOutcomeData=" + String.valueOf(getCustomCallOutcomeData()) + ", ");
        sb.append("customVisitOutcomeData=" + String.valueOf(getCustomVisitOutcomeData()) + ", ");
        sb.append("customTaskCompletionData=" + String.valueOf(getCustomTaskCompletionData()) + ", ");
        sb.append("customTaskInputData=" + String.valueOf(getCustomTaskInputData()) + ", ");
        sb.append("customVideoCallInputData=" + String.valueOf(getCustomVideoCallInputData()) + ", ");
        sb.append("deviceId=" + String.valueOf(getDeviceId()) + ", ");
        sb.append("totalCallDuration=" + String.valueOf(getTotalCallDuration()) + ", ");
        sb.append("cloudProviderNumber=" + String.valueOf(getCloudProviderNumber()) + ", ");
        sb.append("hangupReason=" + String.valueOf(getHangupReason()) + ", ");
        sb.append("cloudProvider=" + String.valueOf(getCloudProvider()) + ", ");
        sb.append("callType=" + String.valueOf(getCallType()) + ", ");
        sb.append("phoneCallLogId=" + String.valueOf(getPhoneCallLogId()) + ", ");
        sb.append("externalEventRecordId=" + String.valueOf(getExternalEventRecordId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private Engagement(String str, String str2, EngagementType engagementType, Contact contact, String str3, ContactAssignmentStatus contactAssignmentStatus, String str4, String str5, String str6, String str7, String str8, String str9, EngagementStatus engagementStatus, Engagement engagement, Engagement engagement2, Boolean bool, String str10, String str11, CallDirection callDirection, CallConnectStatus callConnectStatus, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Integer num, String str12, String str13, String str14, String str15, NoteAdditionMethod noteAdditionMethod, String str16, String str17, Boolean bool2, String str18, String str19, TaskActivityType taskActivityType, String str20, String str21, String str22, Temporal.DateTime dateTime3, String str23, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, String str24, Temporal.DateTime dateTime6, Address address, String str25, String str26, String str27, String str28, Address address2, Temporal.DateTime dateTime7, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, List<MeetingParticipant> list, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, List<String> list2, Temporal.DateTime dateTime8, Temporal.DateTime dateTime9, Integer num2, String str47, String str48, String str49, String str50, String str51, String str52, Integer num3, String str53, String str54, String str55, String str56, String str57, String str58, Temporal.DateTime dateTime10, Temporal.DateTime dateTime11) {
        this.primaryTeam = null;
        this.engagementOwner = null;
        this.addedBy = null;
        this.updatedBy = null;
        this.comments = null;
        this.locations = null;
        this.childEngagements = null;
        this.linkedFiles = null;
        this.engagementUpdate = null;
        this.paymentData = null;
        this.linkedCampaign = null;
        this.campaign = null;
        this.externalEventRecord = null;
        this.id = str;
        this.accountId = str2;
        this.engagementType = engagementType;
        this.contact = contact;
        this.primaryTeamId = str3;
        this.toBeAssigned = contactAssignmentStatus;
        this.ownerId = str4;
        this.contactPrimaryTeamId = str5;
        this.contactOwnerId = str6;
        this.addedById = str7;
        this.updatedById = str8;
        this.callStatus = str9;
        this.engagementStatus = engagementStatus;
        this.parentEngagement = engagement;
        this.nextStepTask = engagement2;
        this.syncStatus = bool;
        this.externalNumber = str10;
        this.userNumber = str11;
        this.callDirection = callDirection;
        this.callConnectStatus = callConnectStatus;
        this.callStartTime = dateTime;
        this.callEndTime = dateTime2;
        this.durationInMillis = num;
        this.callOutcome = str12;
        this.callOutcomeNature = str13;
        this.callRecordingExternalResource = str14;
        this.noteHeading = str15;
        this.noteAdditionMethod = noteAdditionMethod;
        this.voiceNoteUrl = str16;
        this.body = str17;
        this.isManualTask = bool2;
        this.taskHeading = str18;
        this.taskType = str19;
        this.taskActivityType = taskActivityType;
        this.taskInputNote = str20;
        this.taskPriority = str21;
        this.taskCompletionNote = str22;
        this.taskCompletionTime = dateTime3;
        this.taskCompletionType = str23;
        this.dueDateTime = dateTime4;
        this.nextFollowUpOn = dateTime5;
        this.nextFollowUpSetBy = str24;
        this.reminderDateTime = dateTime6;
        this.taskLocation = address;
        this.callRecordingUrl = str25;
        this.callTranscriptUrl = str26;
        this.callTranscriptSummary = str27;
        this.uploadedFiledUrl = str28;
        this.visitLocation = address2;
        this.visitTime = dateTime7;
        this.visitNote = str29;
        this.visitOutcome = str30;
        this.visitOutcomeNature = str31;
        this.videoCallPlatform = str32;
        this.videoCallLink = str33;
        this.meetingName = str34;
        this.meetingCode = str35;
        this.videoCallMetadata = str36;
        this.videoCallOutcome = str37;
        this.meetingParticipants = list;
        this.paymentDataId = str38;
        this.calendarEventId = str39;
        this.calendarName = str40;
        this.campaignId = str41;
        this.campaignRun = str42;
        this.engagementSourceType = str43;
        this.engagementSource = str44;
        this.engagementSourceLevelTwo = str45;
        this.systemAction = str46;
        this.taskEngagementActions = list2;
        this.taskEngagementActionsUpdatedAt = dateTime8;
        this.firstTaskEngagementActionOn = dateTime9;
        this.taskEngagementActionCount = num2;
        this.customCallOutcomeData = str47;
        this.customVisitOutcomeData = str48;
        this.customTaskCompletionData = str49;
        this.customTaskInputData = str50;
        this.customVideoCallInputData = str51;
        this.deviceId = str52;
        this.totalCallDuration = num3;
        this.cloudProviderNumber = str53;
        this.hangupReason = str54;
        this.cloudProvider = str55;
        this.callType = str56;
        this.phoneCallLogId = str57;
        this.externalEventRecordId = str58;
        this.createdAt = dateTime10;
        this.updatedAt = dateTime11;
    }
}
