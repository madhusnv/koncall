package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateEngagementInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> addedById;
    private final Input<String> body;
    private final Input<String> calendarEventId;
    private final Input<String> calendarName;
    private final Input<CallConnectStatus> callConnectStatus;
    private final Input<CallDirection> callDirection;
    private final Input<String> callEndTime;
    private final Input<String> callOutcome;
    private final Input<String> callOutcomeNature;
    private final Input<String> callRecordingExternalResource;
    private final Input<String> callRecordingUrl;
    private final Input<String> callStartTime;
    private final Input<String> callStatus;
    private final Input<String> callTranscriptSummary;
    private final Input<String> callTranscriptUrl;
    private final Input<String> callType;
    private final Input<String> campaignId;
    private final Input<String> campaignRun;
    private final Input<String> cloudProvider;
    private final Input<String> cloudProviderNumber;
    private final Input<String> contactId;
    private final Input<String> contactOwnerId;
    private final Input<String> contactPrimaryTeamId;
    private final Input<String> createdAt;
    private final Input<String> customCallOutcomeData;
    private final Input<String> customTaskCompletionData;
    private final Input<String> customTaskInputData;
    private final Input<String> customVideoCallInputData;
    private final Input<String> customVisitOutcomeData;
    private final Input<String> deviceId;
    private final Input<String> dueDateTime;
    private final Input<Integer> durationInMillis;
    private final Input<String> engagementSource;
    private final Input<String> engagementSourceLevelTwo;
    private final Input<String> engagementSourceType;
    private final Input<EngagementStatus> engagementStatus;
    private final Input<EngagementType> engagementType;
    private final Input<String> externalEventRecordId;
    private final Input<String> externalNumber;
    private final Input<String> firstTaskEngagementActionOn;
    private final Input<String> hangupReason;
    private final String id;
    private final Input<Boolean> isManualTask;
    private final Input<String> meetingCode;
    private final Input<String> meetingName;
    private final Input<List<MeetingParticipantInput>> meetingParticipants;
    private final Input<String> nextFollowUpOn;
    private final Input<String> nextFollowUpSetBy;
    private final Input<String> nextStepTaskId;
    private final Input<NoteAdditionMethod> noteAdditionMethod;
    private final Input<String> noteHeading;
    private final Input<String> ownerId;
    private final Input<String> parentEngagementId;
    private final Input<String> paymentDataId;
    private final Input<String> phoneCallLogId;
    private final Input<String> primaryTeamId;
    private final Input<String> reminderDateTime;
    private final Input<Boolean> syncStatus;
    private final Input<String> systemAction;
    private final Input<TaskActivityType> taskActivityType;
    private final Input<String> taskCompletionNote;
    private final Input<String> taskCompletionTime;
    private final Input<String> taskCompletionType;
    private final Input<Integer> taskEngagementActionCount;
    private final Input<List<String>> taskEngagementActions;
    private final Input<String> taskEngagementActionsUpdatedAt;
    private final Input<String> taskHeading;
    private final Input<String> taskInputNote;
    private final Input<AddressInput> taskLocation;
    private final Input<String> taskPriority;
    private final Input<String> taskType;
    private final Input<ContactAssignmentStatus> toBeAssigned;
    private final Input<Integer> totalCallDuration;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<String> uploadedFiledUrl;
    private final Input<String> userNumber;
    private final Input<String> videoCallLink;
    private final Input<String> videoCallMetadata;
    private final Input<String> videoCallOutcome;
    private final Input<String> videoCallPlatform;
    private final Input<AddressInput> visitLocation;
    private final Input<String> visitNote;
    private final Input<String> visitOutcome;
    private final Input<String> visitOutcomeNature;
    private final Input<String> visitTime;
    private final Input<String> voiceNoteUrl;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<EngagementType> engagementType = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<ContactAssignmentStatus> toBeAssigned = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<String> contactPrimaryTeamId = Input.absent();
        private Input<String> contactOwnerId = Input.absent();
        private Input<String> addedById = Input.absent();
        private Input<String> updatedById = Input.absent();
        private Input<String> callStatus = Input.absent();
        private Input<EngagementStatus> engagementStatus = Input.absent();
        private Input<String> parentEngagementId = Input.absent();
        private Input<String> nextStepTaskId = Input.absent();
        private Input<Boolean> syncStatus = Input.absent();
        private Input<String> externalNumber = Input.absent();
        private Input<String> userNumber = Input.absent();
        private Input<CallDirection> callDirection = Input.absent();
        private Input<CallConnectStatus> callConnectStatus = Input.absent();
        private Input<String> callStartTime = Input.absent();
        private Input<String> callEndTime = Input.absent();
        private Input<Integer> durationInMillis = Input.absent();
        private Input<String> callOutcome = Input.absent();
        private Input<String> callOutcomeNature = Input.absent();
        private Input<String> callRecordingExternalResource = Input.absent();
        private Input<String> noteHeading = Input.absent();
        private Input<NoteAdditionMethod> noteAdditionMethod = Input.absent();
        private Input<String> voiceNoteUrl = Input.absent();
        private Input<String> body = Input.absent();
        private Input<Boolean> isManualTask = Input.absent();
        private Input<String> taskHeading = Input.absent();
        private Input<String> taskType = Input.absent();
        private Input<TaskActivityType> taskActivityType = Input.absent();
        private Input<String> taskInputNote = Input.absent();
        private Input<String> taskPriority = Input.absent();
        private Input<String> taskCompletionNote = Input.absent();
        private Input<String> taskCompletionTime = Input.absent();
        private Input<String> taskCompletionType = Input.absent();
        private Input<String> dueDateTime = Input.absent();
        private Input<String> nextFollowUpOn = Input.absent();
        private Input<String> nextFollowUpSetBy = Input.absent();
        private Input<String> reminderDateTime = Input.absent();
        private Input<AddressInput> taskLocation = Input.absent();
        private Input<String> callRecordingUrl = Input.absent();
        private Input<String> callTranscriptUrl = Input.absent();
        private Input<String> callTranscriptSummary = Input.absent();
        private Input<String> uploadedFiledUrl = Input.absent();
        private Input<AddressInput> visitLocation = Input.absent();
        private Input<String> visitTime = Input.absent();
        private Input<String> visitNote = Input.absent();
        private Input<String> visitOutcome = Input.absent();
        private Input<String> visitOutcomeNature = Input.absent();
        private Input<String> videoCallPlatform = Input.absent();
        private Input<String> videoCallLink = Input.absent();
        private Input<String> meetingName = Input.absent();
        private Input<String> meetingCode = Input.absent();
        private Input<String> videoCallMetadata = Input.absent();
        private Input<String> videoCallOutcome = Input.absent();
        private Input<List<MeetingParticipantInput>> meetingParticipants = Input.absent();
        private Input<String> paymentDataId = Input.absent();
        private Input<String> calendarEventId = Input.absent();
        private Input<String> calendarName = Input.absent();
        private Input<String> campaignId = Input.absent();
        private Input<String> campaignRun = Input.absent();
        private Input<String> engagementSourceType = Input.absent();
        private Input<String> engagementSource = Input.absent();
        private Input<String> engagementSourceLevelTwo = Input.absent();
        private Input<String> systemAction = Input.absent();
        private Input<List<String>> taskEngagementActions = Input.absent();
        private Input<String> taskEngagementActionsUpdatedAt = Input.absent();
        private Input<String> firstTaskEngagementActionOn = Input.absent();
        private Input<Integer> taskEngagementActionCount = Input.absent();
        private Input<String> customCallOutcomeData = Input.absent();
        private Input<String> customVisitOutcomeData = Input.absent();
        private Input<String> customTaskCompletionData = Input.absent();
        private Input<String> customTaskInputData = Input.absent();
        private Input<String> customVideoCallInputData = Input.absent();
        private Input<String> deviceId = Input.absent();
        private Input<Integer> totalCallDuration = Input.absent();
        private Input<String> cloudProviderNumber = Input.absent();
        private Input<String> hangupReason = Input.absent();
        private Input<String> cloudProvider = Input.absent();
        private Input<String> callType = Input.absent();
        private Input<String> phoneCallLogId = Input.absent();
        private Input<String> externalEventRecordId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder addedById(String str) {
            this.addedById = Input.fromNullable(str);
            return this;
        }

        public Builder body(String str) {
            this.body = Input.fromNullable(str);
            return this;
        }

        public UpdateEngagementInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateEngagementInput(this.id, this.accountId, this.engagementType, this.contactId, this.primaryTeamId, this.toBeAssigned, this.ownerId, this.contactPrimaryTeamId, this.contactOwnerId, this.addedById, this.updatedById, this.callStatus, this.engagementStatus, this.parentEngagementId, this.nextStepTaskId, this.syncStatus, this.externalNumber, this.userNumber, this.callDirection, this.callConnectStatus, this.callStartTime, this.callEndTime, this.durationInMillis, this.callOutcome, this.callOutcomeNature, this.callRecordingExternalResource, this.noteHeading, this.noteAdditionMethod, this.voiceNoteUrl, this.body, this.isManualTask, this.taskHeading, this.taskType, this.taskActivityType, this.taskInputNote, this.taskPriority, this.taskCompletionNote, this.taskCompletionTime, this.taskCompletionType, this.dueDateTime, this.nextFollowUpOn, this.nextFollowUpSetBy, this.reminderDateTime, this.taskLocation, this.callRecordingUrl, this.callTranscriptUrl, this.callTranscriptSummary, this.uploadedFiledUrl, this.visitLocation, this.visitTime, this.visitNote, this.visitOutcome, this.visitOutcomeNature, this.videoCallPlatform, this.videoCallLink, this.meetingName, this.meetingCode, this.videoCallMetadata, this.videoCallOutcome, this.meetingParticipants, this.paymentDataId, this.calendarEventId, this.calendarName, this.campaignId, this.campaignRun, this.engagementSourceType, this.engagementSource, this.engagementSourceLevelTwo, this.systemAction, this.taskEngagementActions, this.taskEngagementActionsUpdatedAt, this.firstTaskEngagementActionOn, this.taskEngagementActionCount, this.customCallOutcomeData, this.customVisitOutcomeData, this.customTaskCompletionData, this.customTaskInputData, this.customVideoCallInputData, this.deviceId, this.totalCallDuration, this.cloudProviderNumber, this.hangupReason, this.cloudProvider, this.callType, this.phoneCallLogId, this.externalEventRecordId, this.createdAt, this.updatedAt);
        }

        public Builder calendarEventId(String str) {
            this.calendarEventId = Input.fromNullable(str);
            return this;
        }

        public Builder calendarName(String str) {
            this.calendarName = Input.fromNullable(str);
            return this;
        }

        public Builder callConnectStatus(CallConnectStatus callConnectStatus) {
            this.callConnectStatus = Input.fromNullable(callConnectStatus);
            return this;
        }

        public Builder callDirection(CallDirection callDirection) {
            this.callDirection = Input.fromNullable(callDirection);
            return this;
        }

        public Builder callEndTime(String str) {
            this.callEndTime = Input.fromNullable(str);
            return this;
        }

        public Builder callOutcome(String str) {
            this.callOutcome = Input.fromNullable(str);
            return this;
        }

        public Builder callOutcomeNature(String str) {
            this.callOutcomeNature = Input.fromNullable(str);
            return this;
        }

        public Builder callRecordingExternalResource(String str) {
            this.callRecordingExternalResource = Input.fromNullable(str);
            return this;
        }

        public Builder callRecordingUrl(String str) {
            this.callRecordingUrl = Input.fromNullable(str);
            return this;
        }

        public Builder callStartTime(String str) {
            this.callStartTime = Input.fromNullable(str);
            return this;
        }

        public Builder callStatus(String str) {
            this.callStatus = Input.fromNullable(str);
            return this;
        }

        public Builder callTranscriptSummary(String str) {
            this.callTranscriptSummary = Input.fromNullable(str);
            return this;
        }

        public Builder callTranscriptUrl(String str) {
            this.callTranscriptUrl = Input.fromNullable(str);
            return this;
        }

        public Builder callType(String str) {
            this.callType = Input.fromNullable(str);
            return this;
        }

        public Builder campaignId(String str) {
            this.campaignId = Input.fromNullable(str);
            return this;
        }

        public Builder campaignRun(String str) {
            this.campaignRun = Input.fromNullable(str);
            return this;
        }

        public Builder cloudProvider(String str) {
            this.cloudProvider = Input.fromNullable(str);
            return this;
        }

        public Builder cloudProviderNumber(String str) {
            this.cloudProviderNumber = Input.fromNullable(str);
            return this;
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder contactOwnerId(String str) {
            this.contactOwnerId = Input.fromNullable(str);
            return this;
        }

        public Builder contactPrimaryTeamId(String str) {
            this.contactPrimaryTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder customCallOutcomeData(String str) {
            this.customCallOutcomeData = Input.fromNullable(str);
            return this;
        }

        public Builder customTaskCompletionData(String str) {
            this.customTaskCompletionData = Input.fromNullable(str);
            return this;
        }

        public Builder customTaskInputData(String str) {
            this.customTaskInputData = Input.fromNullable(str);
            return this;
        }

        public Builder customVideoCallInputData(String str) {
            this.customVideoCallInputData = Input.fromNullable(str);
            return this;
        }

        public Builder customVisitOutcomeData(String str) {
            this.customVisitOutcomeData = Input.fromNullable(str);
            return this;
        }

        public Builder deviceId(String str) {
            this.deviceId = Input.fromNullable(str);
            return this;
        }

        public Builder dueDateTime(String str) {
            this.dueDateTime = Input.fromNullable(str);
            return this;
        }

        public Builder durationInMillis(Integer num) {
            this.durationInMillis = Input.fromNullable(num);
            return this;
        }

        public Builder engagementSource(String str) {
            this.engagementSource = Input.fromNullable(str);
            return this;
        }

        public Builder engagementSourceLevelTwo(String str) {
            this.engagementSourceLevelTwo = Input.fromNullable(str);
            return this;
        }

        public Builder engagementSourceType(String str) {
            this.engagementSourceType = Input.fromNullable(str);
            return this;
        }

        public Builder engagementStatus(EngagementStatus engagementStatus) {
            this.engagementStatus = Input.fromNullable(engagementStatus);
            return this;
        }

        public Builder engagementType(EngagementType engagementType) {
            this.engagementType = Input.fromNullable(engagementType);
            return this;
        }

        public Builder externalEventRecordId(String str) {
            this.externalEventRecordId = Input.fromNullable(str);
            return this;
        }

        public Builder externalNumber(String str) {
            this.externalNumber = Input.fromNullable(str);
            return this;
        }

        public Builder firstTaskEngagementActionOn(String str) {
            this.firstTaskEngagementActionOn = Input.fromNullable(str);
            return this;
        }

        public Builder hangupReason(String str) {
            this.hangupReason = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder isManualTask(Boolean bool) {
            this.isManualTask = Input.fromNullable(bool);
            return this;
        }

        public Builder meetingCode(String str) {
            this.meetingCode = Input.fromNullable(str);
            return this;
        }

        public Builder meetingName(String str) {
            this.meetingName = Input.fromNullable(str);
            return this;
        }

        public Builder meetingParticipants(List<MeetingParticipantInput> list) {
            this.meetingParticipants = Input.fromNullable(list);
            return this;
        }

        public Builder nextFollowUpOn(String str) {
            this.nextFollowUpOn = Input.fromNullable(str);
            return this;
        }

        public Builder nextFollowUpSetBy(String str) {
            this.nextFollowUpSetBy = Input.fromNullable(str);
            return this;
        }

        public Builder nextStepTaskId(String str) {
            this.nextStepTaskId = Input.fromNullable(str);
            return this;
        }

        public Builder noteAdditionMethod(NoteAdditionMethod noteAdditionMethod) {
            this.noteAdditionMethod = Input.fromNullable(noteAdditionMethod);
            return this;
        }

        public Builder noteHeading(String str) {
            this.noteHeading = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder parentEngagementId(String str) {
            this.parentEngagementId = Input.fromNullable(str);
            return this;
        }

        public Builder paymentDataId(String str) {
            this.paymentDataId = Input.fromNullable(str);
            return this;
        }

        public Builder phoneCallLogId(String str) {
            this.phoneCallLogId = Input.fromNullable(str);
            return this;
        }

        public Builder primaryTeamId(String str) {
            this.primaryTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder reminderDateTime(String str) {
            this.reminderDateTime = Input.fromNullable(str);
            return this;
        }

        public Builder syncStatus(Boolean bool) {
            this.syncStatus = Input.fromNullable(bool);
            return this;
        }

        public Builder systemAction(String str) {
            this.systemAction = Input.fromNullable(str);
            return this;
        }

        public Builder taskActivityType(TaskActivityType taskActivityType) {
            this.taskActivityType = Input.fromNullable(taskActivityType);
            return this;
        }

        public Builder taskCompletionNote(String str) {
            this.taskCompletionNote = Input.fromNullable(str);
            return this;
        }

        public Builder taskCompletionTime(String str) {
            this.taskCompletionTime = Input.fromNullable(str);
            return this;
        }

        public Builder taskCompletionType(String str) {
            this.taskCompletionType = Input.fromNullable(str);
            return this;
        }

        public Builder taskEngagementActionCount(Integer num) {
            this.taskEngagementActionCount = Input.fromNullable(num);
            return this;
        }

        public Builder taskEngagementActions(List<String> list) {
            this.taskEngagementActions = Input.fromNullable(list);
            return this;
        }

        public Builder taskEngagementActionsUpdatedAt(String str) {
            this.taskEngagementActionsUpdatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder taskHeading(String str) {
            this.taskHeading = Input.fromNullable(str);
            return this;
        }

        public Builder taskInputNote(String str) {
            this.taskInputNote = Input.fromNullable(str);
            return this;
        }

        public Builder taskLocation(AddressInput addressInput) {
            this.taskLocation = Input.fromNullable(addressInput);
            return this;
        }

        public Builder taskPriority(String str) {
            this.taskPriority = Input.fromNullable(str);
            return this;
        }

        public Builder taskType(String str) {
            this.taskType = Input.fromNullable(str);
            return this;
        }

        public Builder toBeAssigned(ContactAssignmentStatus contactAssignmentStatus) {
            this.toBeAssigned = Input.fromNullable(contactAssignmentStatus);
            return this;
        }

        public Builder totalCallDuration(Integer num) {
            this.totalCallDuration = Input.fromNullable(num);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedById(String str) {
            this.updatedById = Input.fromNullable(str);
            return this;
        }

        public Builder uploadedFiledUrl(String str) {
            this.uploadedFiledUrl = Input.fromNullable(str);
            return this;
        }

        public Builder userNumber(String str) {
            this.userNumber = Input.fromNullable(str);
            return this;
        }

        public Builder videoCallLink(String str) {
            this.videoCallLink = Input.fromNullable(str);
            return this;
        }

        public Builder videoCallMetadata(String str) {
            this.videoCallMetadata = Input.fromNullable(str);
            return this;
        }

        public Builder videoCallOutcome(String str) {
            this.videoCallOutcome = Input.fromNullable(str);
            return this;
        }

        public Builder videoCallPlatform(String str) {
            this.videoCallPlatform = Input.fromNullable(str);
            return this;
        }

        public Builder visitLocation(AddressInput addressInput) {
            this.visitLocation = Input.fromNullable(addressInput);
            return this;
        }

        public Builder visitNote(String str) {
            this.visitNote = Input.fromNullable(str);
            return this;
        }

        public Builder visitOutcome(String str) {
            this.visitOutcome = Input.fromNullable(str);
            return this;
        }

        public Builder visitOutcomeNature(String str) {
            this.visitOutcomeNature = Input.fromNullable(str);
            return this;
        }

        public Builder visitTime(String str) {
            this.visitTime = Input.fromNullable(str);
            return this;
        }

        public Builder voiceNoteUrl(String str) {
            this.voiceNoteUrl = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateEngagementInput(String str, Input<String> input, Input<EngagementType> input2, Input<String> input3, Input<String> input4, Input<ContactAssignmentStatus> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<EngagementStatus> input12, Input<String> input13, Input<String> input14, Input<Boolean> input15, Input<String> input16, Input<String> input17, Input<CallDirection> input18, Input<CallConnectStatus> input19, Input<String> input20, Input<String> input21, Input<Integer> input22, Input<String> input23, Input<String> input24, Input<String> input25, Input<String> input26, Input<NoteAdditionMethod> input27, Input<String> input28, Input<String> input29, Input<Boolean> input30, Input<String> input31, Input<String> input32, Input<TaskActivityType> input33, Input<String> input34, Input<String> input35, Input<String> input36, Input<String> input37, Input<String> input38, Input<String> input39, Input<String> input40, Input<String> input41, Input<String> input42, Input<AddressInput> input43, Input<String> input44, Input<String> input45, Input<String> input46, Input<String> input47, Input<AddressInput> input48, Input<String> input49, Input<String> input50, Input<String> input51, Input<String> input52, Input<String> input53, Input<String> input54, Input<String> input55, Input<String> input56, Input<String> input57, Input<String> input58, Input<List<MeetingParticipantInput>> input59, Input<String> input60, Input<String> input61, Input<String> input62, Input<String> input63, Input<String> input64, Input<String> input65, Input<String> input66, Input<String> input67, Input<String> input68, Input<List<String>> input69, Input<String> input70, Input<String> input71, Input<Integer> input72, Input<String> input73, Input<String> input74, Input<String> input75, Input<String> input76, Input<String> input77, Input<String> input78, Input<Integer> input79, Input<String> input80, Input<String> input81, Input<String> input82, Input<String> input83, Input<String> input84, Input<String> input85, Input<String> input86, Input<String> input87) {
        this.id = str;
        this.accountId = input;
        this.engagementType = input2;
        this.contactId = input3;
        this.primaryTeamId = input4;
        this.toBeAssigned = input5;
        this.ownerId = input6;
        this.contactPrimaryTeamId = input7;
        this.contactOwnerId = input8;
        this.addedById = input9;
        this.updatedById = input10;
        this.callStatus = input11;
        this.engagementStatus = input12;
        this.parentEngagementId = input13;
        this.nextStepTaskId = input14;
        this.syncStatus = input15;
        this.externalNumber = input16;
        this.userNumber = input17;
        this.callDirection = input18;
        this.callConnectStatus = input19;
        this.callStartTime = input20;
        this.callEndTime = input21;
        this.durationInMillis = input22;
        this.callOutcome = input23;
        this.callOutcomeNature = input24;
        this.callRecordingExternalResource = input25;
        this.noteHeading = input26;
        this.noteAdditionMethod = input27;
        this.voiceNoteUrl = input28;
        this.body = input29;
        this.isManualTask = input30;
        this.taskHeading = input31;
        this.taskType = input32;
        this.taskActivityType = input33;
        this.taskInputNote = input34;
        this.taskPriority = input35;
        this.taskCompletionNote = input36;
        this.taskCompletionTime = input37;
        this.taskCompletionType = input38;
        this.dueDateTime = input39;
        this.nextFollowUpOn = input40;
        this.nextFollowUpSetBy = input41;
        this.reminderDateTime = input42;
        this.taskLocation = input43;
        this.callRecordingUrl = input44;
        this.callTranscriptUrl = input45;
        this.callTranscriptSummary = input46;
        this.uploadedFiledUrl = input47;
        this.visitLocation = input48;
        this.visitTime = input49;
        this.visitNote = input50;
        this.visitOutcome = input51;
        this.visitOutcomeNature = input52;
        this.videoCallPlatform = input53;
        this.videoCallLink = input54;
        this.meetingName = input55;
        this.meetingCode = input56;
        this.videoCallMetadata = input57;
        this.videoCallOutcome = input58;
        this.meetingParticipants = input59;
        this.paymentDataId = input60;
        this.calendarEventId = input61;
        this.calendarName = input62;
        this.campaignId = input63;
        this.campaignRun = input64;
        this.engagementSourceType = input65;
        this.engagementSource = input66;
        this.engagementSourceLevelTwo = input67;
        this.systemAction = input68;
        this.taskEngagementActions = input69;
        this.taskEngagementActionsUpdatedAt = input70;
        this.firstTaskEngagementActionOn = input71;
        this.taskEngagementActionCount = input72;
        this.customCallOutcomeData = input73;
        this.customVisitOutcomeData = input74;
        this.customTaskCompletionData = input75;
        this.customTaskInputData = input76;
        this.customVideoCallInputData = input77;
        this.deviceId = input78;
        this.totalCallDuration = input79;
        this.cloudProviderNumber = input80;
        this.hangupReason = input81;
        this.cloudProvider = input82;
        this.callType = input83;
        this.phoneCallLogId = input84;
        this.externalEventRecordId = input85;
        this.createdAt = input86;
        this.updatedAt = input87;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String addedById() {
        return this.addedById.value;
    }

    public String body() {
        return this.body.value;
    }

    public String calendarEventId() {
        return this.calendarEventId.value;
    }

    public String calendarName() {
        return this.calendarName.value;
    }

    public CallConnectStatus callConnectStatus() {
        return this.callConnectStatus.value;
    }

    public CallDirection callDirection() {
        return this.callDirection.value;
    }

    public String callEndTime() {
        return this.callEndTime.value;
    }

    public String callOutcome() {
        return this.callOutcome.value;
    }

    public String callOutcomeNature() {
        return this.callOutcomeNature.value;
    }

    public String callRecordingExternalResource() {
        return this.callRecordingExternalResource.value;
    }

    public String callRecordingUrl() {
        return this.callRecordingUrl.value;
    }

    public String callStartTime() {
        return this.callStartTime.value;
    }

    public String callStatus() {
        return this.callStatus.value;
    }

    public String callTranscriptSummary() {
        return this.callTranscriptSummary.value;
    }

    public String callTranscriptUrl() {
        return this.callTranscriptUrl.value;
    }

    public String callType() {
        return this.callType.value;
    }

    public String campaignId() {
        return this.campaignId.value;
    }

    public String campaignRun() {
        return this.campaignRun.value;
    }

    public String cloudProvider() {
        return this.cloudProvider.value;
    }

    public String cloudProviderNumber() {
        return this.cloudProviderNumber.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String contactOwnerId() {
        return this.contactOwnerId.value;
    }

    public String contactPrimaryTeamId() {
        return this.contactPrimaryTeamId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String customCallOutcomeData() {
        return this.customCallOutcomeData.value;
    }

    public String customTaskCompletionData() {
        return this.customTaskCompletionData.value;
    }

    public String customTaskInputData() {
        return this.customTaskInputData.value;
    }

    public String customVideoCallInputData() {
        return this.customVideoCallInputData.value;
    }

    public String customVisitOutcomeData() {
        return this.customVisitOutcomeData.value;
    }

    public String deviceId() {
        return this.deviceId.value;
    }

    public String dueDateTime() {
        return this.dueDateTime.value;
    }

    public Integer durationInMillis() {
        return this.durationInMillis.value;
    }

    public String engagementSource() {
        return this.engagementSource.value;
    }

    public String engagementSourceLevelTwo() {
        return this.engagementSourceLevelTwo.value;
    }

    public String engagementSourceType() {
        return this.engagementSourceType.value;
    }

    public EngagementStatus engagementStatus() {
        return this.engagementStatus.value;
    }

    public EngagementType engagementType() {
        return this.engagementType.value;
    }

    public String externalEventRecordId() {
        return this.externalEventRecordId.value;
    }

    public String externalNumber() {
        return this.externalNumber.value;
    }

    public String firstTaskEngagementActionOn() {
        return this.firstTaskEngagementActionOn.value;
    }

    public String hangupReason() {
        return this.hangupReason.value;
    }

    public String id() {
        return this.id;
    }

    public Boolean isManualTask() {
        return this.isManualTask.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateEngagementInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateEngagementInput.this.id);
                if (UpdateEngagementInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateEngagementInput.this.accountId.value);
                }
                if (UpdateEngagementInput.this.engagementType.defined) {
                    inputFieldWriter.writeString("engagementType", UpdateEngagementInput.this.engagementType.value != 0 ? ((EngagementType) UpdateEngagementInput.this.engagementType.value).name() : null);
                }
                if (UpdateEngagementInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateEngagementInput.this.contactId.value);
                }
                if (UpdateEngagementInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) UpdateEngagementInput.this.primaryTeamId.value);
                }
                if (UpdateEngagementInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeString("toBeAssigned", UpdateEngagementInput.this.toBeAssigned.value != 0 ? ((ContactAssignmentStatus) UpdateEngagementInput.this.toBeAssigned.value).name() : null);
                }
                if (UpdateEngagementInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) UpdateEngagementInput.this.ownerId.value);
                }
                if (UpdateEngagementInput.this.contactPrimaryTeamId.defined) {
                    inputFieldWriter.writeString("contactPrimaryTeamId", (String) UpdateEngagementInput.this.contactPrimaryTeamId.value);
                }
                if (UpdateEngagementInput.this.contactOwnerId.defined) {
                    inputFieldWriter.writeString("contactOwnerId", (String) UpdateEngagementInput.this.contactOwnerId.value);
                }
                if (UpdateEngagementInput.this.addedById.defined) {
                    inputFieldWriter.writeString("addedById", (String) UpdateEngagementInput.this.addedById.value);
                }
                if (UpdateEngagementInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateEngagementInput.this.updatedById.value);
                }
                if (UpdateEngagementInput.this.callStatus.defined) {
                    inputFieldWriter.writeString("callStatus", (String) UpdateEngagementInput.this.callStatus.value);
                }
                if (UpdateEngagementInput.this.engagementStatus.defined) {
                    inputFieldWriter.writeString("engagementStatus", UpdateEngagementInput.this.engagementStatus.value != 0 ? ((EngagementStatus) UpdateEngagementInput.this.engagementStatus.value).name() : null);
                }
                if (UpdateEngagementInput.this.parentEngagementId.defined) {
                    inputFieldWriter.writeString("parentEngagementId", (String) UpdateEngagementInput.this.parentEngagementId.value);
                }
                if (UpdateEngagementInput.this.nextStepTaskId.defined) {
                    inputFieldWriter.writeString("nextStepTaskId", (String) UpdateEngagementInput.this.nextStepTaskId.value);
                }
                if (UpdateEngagementInput.this.syncStatus.defined) {
                    inputFieldWriter.writeBoolean("syncStatus", (Boolean) UpdateEngagementInput.this.syncStatus.value);
                }
                if (UpdateEngagementInput.this.externalNumber.defined) {
                    inputFieldWriter.writeString("externalNumber", (String) UpdateEngagementInput.this.externalNumber.value);
                }
                if (UpdateEngagementInput.this.userNumber.defined) {
                    inputFieldWriter.writeString("userNumber", (String) UpdateEngagementInput.this.userNumber.value);
                }
                if (UpdateEngagementInput.this.callDirection.defined) {
                    inputFieldWriter.writeString("callDirection", UpdateEngagementInput.this.callDirection.value != 0 ? ((CallDirection) UpdateEngagementInput.this.callDirection.value).name() : null);
                }
                if (UpdateEngagementInput.this.callConnectStatus.defined) {
                    inputFieldWriter.writeString("callConnectStatus", UpdateEngagementInput.this.callConnectStatus.value != 0 ? ((CallConnectStatus) UpdateEngagementInput.this.callConnectStatus.value).name() : null);
                }
                if (UpdateEngagementInput.this.callStartTime.defined) {
                    inputFieldWriter.writeString("callStartTime", (String) UpdateEngagementInput.this.callStartTime.value);
                }
                if (UpdateEngagementInput.this.callEndTime.defined) {
                    inputFieldWriter.writeString("callEndTime", (String) UpdateEngagementInput.this.callEndTime.value);
                }
                if (UpdateEngagementInput.this.durationInMillis.defined) {
                    inputFieldWriter.writeInt("durationInMillis", (Integer) UpdateEngagementInput.this.durationInMillis.value);
                }
                if (UpdateEngagementInput.this.callOutcome.defined) {
                    inputFieldWriter.writeString("callOutcome", (String) UpdateEngagementInput.this.callOutcome.value);
                }
                if (UpdateEngagementInput.this.callOutcomeNature.defined) {
                    inputFieldWriter.writeString("callOutcomeNature", (String) UpdateEngagementInput.this.callOutcomeNature.value);
                }
                if (UpdateEngagementInput.this.callRecordingExternalResource.defined) {
                    inputFieldWriter.writeString("callRecordingExternalResource", (String) UpdateEngagementInput.this.callRecordingExternalResource.value);
                }
                if (UpdateEngagementInput.this.noteHeading.defined) {
                    inputFieldWriter.writeString("noteHeading", (String) UpdateEngagementInput.this.noteHeading.value);
                }
                if (UpdateEngagementInput.this.noteAdditionMethod.defined) {
                    inputFieldWriter.writeString("noteAdditionMethod", UpdateEngagementInput.this.noteAdditionMethod.value != 0 ? ((NoteAdditionMethod) UpdateEngagementInput.this.noteAdditionMethod.value).name() : null);
                }
                if (UpdateEngagementInput.this.voiceNoteUrl.defined) {
                    inputFieldWriter.writeString("voiceNoteUrl", (String) UpdateEngagementInput.this.voiceNoteUrl.value);
                }
                if (UpdateEngagementInput.this.body.defined) {
                    inputFieldWriter.writeString("body", (String) UpdateEngagementInput.this.body.value);
                }
                if (UpdateEngagementInput.this.isManualTask.defined) {
                    inputFieldWriter.writeBoolean("isManualTask", (Boolean) UpdateEngagementInput.this.isManualTask.value);
                }
                if (UpdateEngagementInput.this.taskHeading.defined) {
                    inputFieldWriter.writeString("taskHeading", (String) UpdateEngagementInput.this.taskHeading.value);
                }
                if (UpdateEngagementInput.this.taskType.defined) {
                    inputFieldWriter.writeString("taskType", (String) UpdateEngagementInput.this.taskType.value);
                }
                if (UpdateEngagementInput.this.taskActivityType.defined) {
                    inputFieldWriter.writeString("taskActivityType", UpdateEngagementInput.this.taskActivityType.value != 0 ? ((TaskActivityType) UpdateEngagementInput.this.taskActivityType.value).name() : null);
                }
                if (UpdateEngagementInput.this.taskInputNote.defined) {
                    inputFieldWriter.writeString("taskInputNote", (String) UpdateEngagementInput.this.taskInputNote.value);
                }
                if (UpdateEngagementInput.this.taskPriority.defined) {
                    inputFieldWriter.writeString("taskPriority", (String) UpdateEngagementInput.this.taskPriority.value);
                }
                if (UpdateEngagementInput.this.taskCompletionNote.defined) {
                    inputFieldWriter.writeString("taskCompletionNote", (String) UpdateEngagementInput.this.taskCompletionNote.value);
                }
                if (UpdateEngagementInput.this.taskCompletionTime.defined) {
                    inputFieldWriter.writeString("taskCompletionTime", (String) UpdateEngagementInput.this.taskCompletionTime.value);
                }
                if (UpdateEngagementInput.this.taskCompletionType.defined) {
                    inputFieldWriter.writeString("taskCompletionType", (String) UpdateEngagementInput.this.taskCompletionType.value);
                }
                if (UpdateEngagementInput.this.dueDateTime.defined) {
                    inputFieldWriter.writeString("dueDateTime", (String) UpdateEngagementInput.this.dueDateTime.value);
                }
                if (UpdateEngagementInput.this.nextFollowUpOn.defined) {
                    inputFieldWriter.writeString("nextFollowUpOn", (String) UpdateEngagementInput.this.nextFollowUpOn.value);
                }
                if (UpdateEngagementInput.this.nextFollowUpSetBy.defined) {
                    inputFieldWriter.writeString("nextFollowUpSetBy", (String) UpdateEngagementInput.this.nextFollowUpSetBy.value);
                }
                if (UpdateEngagementInput.this.reminderDateTime.defined) {
                    inputFieldWriter.writeString("reminderDateTime", (String) UpdateEngagementInput.this.reminderDateTime.value);
                }
                if (UpdateEngagementInput.this.taskLocation.defined) {
                    inputFieldWriter.writeObject("taskLocation", UpdateEngagementInput.this.taskLocation.value != 0 ? ((AddressInput) UpdateEngagementInput.this.taskLocation.value).marshaller() : null);
                }
                if (UpdateEngagementInput.this.callRecordingUrl.defined) {
                    inputFieldWriter.writeString("callRecordingUrl", (String) UpdateEngagementInput.this.callRecordingUrl.value);
                }
                if (UpdateEngagementInput.this.callTranscriptUrl.defined) {
                    inputFieldWriter.writeString("callTranscriptUrl", (String) UpdateEngagementInput.this.callTranscriptUrl.value);
                }
                if (UpdateEngagementInput.this.callTranscriptSummary.defined) {
                    inputFieldWriter.writeString("callTranscriptSummary", (String) UpdateEngagementInput.this.callTranscriptSummary.value);
                }
                if (UpdateEngagementInput.this.uploadedFiledUrl.defined) {
                    inputFieldWriter.writeString("uploadedFiledUrl", (String) UpdateEngagementInput.this.uploadedFiledUrl.value);
                }
                if (UpdateEngagementInput.this.visitLocation.defined) {
                    inputFieldWriter.writeObject("visitLocation", UpdateEngagementInput.this.visitLocation.value != 0 ? ((AddressInput) UpdateEngagementInput.this.visitLocation.value).marshaller() : null);
                }
                if (UpdateEngagementInput.this.visitTime.defined) {
                    inputFieldWriter.writeString("visitTime", (String) UpdateEngagementInput.this.visitTime.value);
                }
                if (UpdateEngagementInput.this.visitNote.defined) {
                    inputFieldWriter.writeString("visitNote", (String) UpdateEngagementInput.this.visitNote.value);
                }
                if (UpdateEngagementInput.this.visitOutcome.defined) {
                    inputFieldWriter.writeString("visitOutcome", (String) UpdateEngagementInput.this.visitOutcome.value);
                }
                if (UpdateEngagementInput.this.visitOutcomeNature.defined) {
                    inputFieldWriter.writeString("visitOutcomeNature", (String) UpdateEngagementInput.this.visitOutcomeNature.value);
                }
                if (UpdateEngagementInput.this.videoCallPlatform.defined) {
                    inputFieldWriter.writeString("videoCallPlatform", (String) UpdateEngagementInput.this.videoCallPlatform.value);
                }
                if (UpdateEngagementInput.this.videoCallLink.defined) {
                    inputFieldWriter.writeString("videoCallLink", (String) UpdateEngagementInput.this.videoCallLink.value);
                }
                if (UpdateEngagementInput.this.meetingName.defined) {
                    inputFieldWriter.writeString("meetingName", (String) UpdateEngagementInput.this.meetingName.value);
                }
                if (UpdateEngagementInput.this.meetingCode.defined) {
                    inputFieldWriter.writeString("meetingCode", (String) UpdateEngagementInput.this.meetingCode.value);
                }
                if (UpdateEngagementInput.this.videoCallMetadata.defined) {
                    inputFieldWriter.writeString("videoCallMetadata", (String) UpdateEngagementInput.this.videoCallMetadata.value);
                }
                if (UpdateEngagementInput.this.videoCallOutcome.defined) {
                    inputFieldWriter.writeString("videoCallOutcome", (String) UpdateEngagementInput.this.videoCallOutcome.value);
                }
                if (UpdateEngagementInput.this.meetingParticipants.defined) {
                    inputFieldWriter.writeList("meetingParticipants", UpdateEngagementInput.this.meetingParticipants.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateEngagementInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateEngagementInput.this.meetingParticipants.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MeetingParticipantInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateEngagementInput.this.paymentDataId.defined) {
                    inputFieldWriter.writeString("paymentDataId", (String) UpdateEngagementInput.this.paymentDataId.value);
                }
                if (UpdateEngagementInput.this.calendarEventId.defined) {
                    inputFieldWriter.writeString("calendarEventId", (String) UpdateEngagementInput.this.calendarEventId.value);
                }
                if (UpdateEngagementInput.this.calendarName.defined) {
                    inputFieldWriter.writeString("calendarName", (String) UpdateEngagementInput.this.calendarName.value);
                }
                if (UpdateEngagementInput.this.campaignId.defined) {
                    inputFieldWriter.writeString("campaignId", (String) UpdateEngagementInput.this.campaignId.value);
                }
                if (UpdateEngagementInput.this.campaignRun.defined) {
                    inputFieldWriter.writeString("campaignRun", (String) UpdateEngagementInput.this.campaignRun.value);
                }
                if (UpdateEngagementInput.this.engagementSourceType.defined) {
                    inputFieldWriter.writeString("engagementSourceType", (String) UpdateEngagementInput.this.engagementSourceType.value);
                }
                if (UpdateEngagementInput.this.engagementSource.defined) {
                    inputFieldWriter.writeString("engagementSource", (String) UpdateEngagementInput.this.engagementSource.value);
                }
                if (UpdateEngagementInput.this.engagementSourceLevelTwo.defined) {
                    inputFieldWriter.writeString("engagementSourceLevelTwo", (String) UpdateEngagementInput.this.engagementSourceLevelTwo.value);
                }
                if (UpdateEngagementInput.this.systemAction.defined) {
                    inputFieldWriter.writeString("systemAction", (String) UpdateEngagementInput.this.systemAction.value);
                }
                if (UpdateEngagementInput.this.taskEngagementActions.defined) {
                    inputFieldWriter.writeList("taskEngagementActions", UpdateEngagementInput.this.taskEngagementActions.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateEngagementInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateEngagementInput.this.taskEngagementActions.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.AWSJSON, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateEngagementInput.this.taskEngagementActionsUpdatedAt.defined) {
                    inputFieldWriter.writeString("taskEngagementActionsUpdatedAt", (String) UpdateEngagementInput.this.taskEngagementActionsUpdatedAt.value);
                }
                if (UpdateEngagementInput.this.firstTaskEngagementActionOn.defined) {
                    inputFieldWriter.writeString("firstTaskEngagementActionOn", (String) UpdateEngagementInput.this.firstTaskEngagementActionOn.value);
                }
                if (UpdateEngagementInput.this.taskEngagementActionCount.defined) {
                    inputFieldWriter.writeInt("taskEngagementActionCount", (Integer) UpdateEngagementInput.this.taskEngagementActionCount.value);
                }
                if (UpdateEngagementInput.this.customCallOutcomeData.defined) {
                    inputFieldWriter.writeString("customCallOutcomeData", (String) UpdateEngagementInput.this.customCallOutcomeData.value);
                }
                if (UpdateEngagementInput.this.customVisitOutcomeData.defined) {
                    inputFieldWriter.writeString("customVisitOutcomeData", (String) UpdateEngagementInput.this.customVisitOutcomeData.value);
                }
                if (UpdateEngagementInput.this.customTaskCompletionData.defined) {
                    inputFieldWriter.writeString("customTaskCompletionData", (String) UpdateEngagementInput.this.customTaskCompletionData.value);
                }
                if (UpdateEngagementInput.this.customTaskInputData.defined) {
                    inputFieldWriter.writeString("customTaskInputData", (String) UpdateEngagementInput.this.customTaskInputData.value);
                }
                if (UpdateEngagementInput.this.customVideoCallInputData.defined) {
                    inputFieldWriter.writeString("customVideoCallInputData", (String) UpdateEngagementInput.this.customVideoCallInputData.value);
                }
                if (UpdateEngagementInput.this.deviceId.defined) {
                    inputFieldWriter.writeString("deviceId", (String) UpdateEngagementInput.this.deviceId.value);
                }
                if (UpdateEngagementInput.this.totalCallDuration.defined) {
                    inputFieldWriter.writeInt("totalCallDuration", (Integer) UpdateEngagementInput.this.totalCallDuration.value);
                }
                if (UpdateEngagementInput.this.cloudProviderNumber.defined) {
                    inputFieldWriter.writeString("cloudProviderNumber", (String) UpdateEngagementInput.this.cloudProviderNumber.value);
                }
                if (UpdateEngagementInput.this.hangupReason.defined) {
                    inputFieldWriter.writeString("hangupReason", (String) UpdateEngagementInput.this.hangupReason.value);
                }
                if (UpdateEngagementInput.this.cloudProvider.defined) {
                    inputFieldWriter.writeString("cloudProvider", (String) UpdateEngagementInput.this.cloudProvider.value);
                }
                if (UpdateEngagementInput.this.callType.defined) {
                    inputFieldWriter.writeString("callType", (String) UpdateEngagementInput.this.callType.value);
                }
                if (UpdateEngagementInput.this.phoneCallLogId.defined) {
                    inputFieldWriter.writeString("phoneCallLogId", (String) UpdateEngagementInput.this.phoneCallLogId.value);
                }
                if (UpdateEngagementInput.this.externalEventRecordId.defined) {
                    inputFieldWriter.writeString("externalEventRecordId", (String) UpdateEngagementInput.this.externalEventRecordId.value);
                }
                if (UpdateEngagementInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateEngagementInput.this.createdAt.value);
                }
                if (UpdateEngagementInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateEngagementInput.this.updatedAt.value);
                }
            }
        };
    }

    public String meetingCode() {
        return this.meetingCode.value;
    }

    public String meetingName() {
        return this.meetingName.value;
    }

    public List<MeetingParticipantInput> meetingParticipants() {
        return this.meetingParticipants.value;
    }

    public String nextFollowUpOn() {
        return this.nextFollowUpOn.value;
    }

    public String nextFollowUpSetBy() {
        return this.nextFollowUpSetBy.value;
    }

    public String nextStepTaskId() {
        return this.nextStepTaskId.value;
    }

    public NoteAdditionMethod noteAdditionMethod() {
        return this.noteAdditionMethod.value;
    }

    public String noteHeading() {
        return this.noteHeading.value;
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public String parentEngagementId() {
        return this.parentEngagementId.value;
    }

    public String paymentDataId() {
        return this.paymentDataId.value;
    }

    public String phoneCallLogId() {
        return this.phoneCallLogId.value;
    }

    public String primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public String reminderDateTime() {
        return this.reminderDateTime.value;
    }

    public Boolean syncStatus() {
        return this.syncStatus.value;
    }

    public String systemAction() {
        return this.systemAction.value;
    }

    public TaskActivityType taskActivityType() {
        return this.taskActivityType.value;
    }

    public String taskCompletionNote() {
        return this.taskCompletionNote.value;
    }

    public String taskCompletionTime() {
        return this.taskCompletionTime.value;
    }

    public String taskCompletionType() {
        return this.taskCompletionType.value;
    }

    public Integer taskEngagementActionCount() {
        return this.taskEngagementActionCount.value;
    }

    public List<String> taskEngagementActions() {
        return this.taskEngagementActions.value;
    }

    public String taskEngagementActionsUpdatedAt() {
        return this.taskEngagementActionsUpdatedAt.value;
    }

    public String taskHeading() {
        return this.taskHeading.value;
    }

    public String taskInputNote() {
        return this.taskInputNote.value;
    }

    public AddressInput taskLocation() {
        return this.taskLocation.value;
    }

    public String taskPriority() {
        return this.taskPriority.value;
    }

    public String taskType() {
        return this.taskType.value;
    }

    public ContactAssignmentStatus toBeAssigned() {
        return this.toBeAssigned.value;
    }

    public Integer totalCallDuration() {
        return this.totalCallDuration.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }

    public String uploadedFiledUrl() {
        return this.uploadedFiledUrl.value;
    }

    public String userNumber() {
        return this.userNumber.value;
    }

    public String videoCallLink() {
        return this.videoCallLink.value;
    }

    public String videoCallMetadata() {
        return this.videoCallMetadata.value;
    }

    public String videoCallOutcome() {
        return this.videoCallOutcome.value;
    }

    public String videoCallPlatform() {
        return this.videoCallPlatform.value;
    }

    public AddressInput visitLocation() {
        return this.visitLocation.value;
    }

    public String visitNote() {
        return this.visitNote.value;
    }

    public String visitOutcome() {
        return this.visitOutcome.value;
    }

    public String visitOutcomeNature() {
        return this.visitOutcomeNature.value;
    }

    public String visitTime() {
        return this.visitTime.value;
    }

    public String voiceNoteUrl() {
        return this.voiceNoteUrl.value;
    }
}
