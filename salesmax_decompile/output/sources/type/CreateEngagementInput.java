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
public final class CreateEngagementInput implements InputType {
    private final String accountId;
    private final Input<String> body;
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
    private final EngagementStatus engagementStatus;
    private final EngagementType engagementType;
    private final Input<String> externalNumber;
    private final Input<String> hangupReason;
    private final Input<String> id;
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
    private final Input<String> phoneCallLogId;
    private final Input<String> primaryTeamId;
    private final Input<String> reminderDateTime;
    private final Input<Boolean> syncStatus;
    private final Input<String> systemAction;
    private final Input<TaskActivityType> taskActivityType;
    private final Input<String> taskCompletionNote;
    private final Input<String> taskCompletionTime;
    private final Input<String> taskCompletionType;
    private final Input<String> taskHeading;
    private final Input<String> taskInputNote;
    private final Input<AddressInput> taskLocation;
    private final Input<String> taskPriority;
    private final Input<String> taskType;
    private final Input<ContactAssignmentStatus> toBeAssigned;
    private final Input<Integer> totalCallDuration;
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
        private String accountId;
        private EngagementStatus engagementStatus;
        private EngagementType engagementType;
        private Input<String> id = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<ContactAssignmentStatus> toBeAssigned = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<String> contactPrimaryTeamId = Input.absent();
        private Input<String> contactOwnerId = Input.absent();
        private Input<String> callStatus = Input.absent();
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
        private Input<String> callRecordingExternalResource = Input.absent();
        private Input<String> callOutcome = Input.absent();
        private Input<String> callOutcomeNature = Input.absent();
        private Input<String> noteHeading = Input.absent();
        private Input<NoteAdditionMethod> noteAdditionMethod = Input.absent();
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
        private Input<String> uploadedFiledUrl = Input.absent();
        private Input<String> callRecordingUrl = Input.absent();
        private Input<String> callTranscriptUrl = Input.absent();
        private Input<String> callTranscriptSummary = Input.absent();
        private Input<String> voiceNoteUrl = Input.absent();
        private Input<AddressInput> visitLocation = Input.absent();
        private Input<String> visitTime = Input.absent();
        private Input<String> visitNote = Input.absent();
        private Input<String> visitOutcome = Input.absent();
        private Input<String> visitOutcomeNature = Input.absent();
        private Input<String> videoCallPlatform = Input.absent();
        private Input<String> videoCallOutcome = Input.absent();
        private Input<List<MeetingParticipantInput>> meetingParticipants = Input.absent();
        private Input<String> videoCallLink = Input.absent();
        private Input<String> meetingName = Input.absent();
        private Input<String> meetingCode = Input.absent();
        private Input<String> videoCallMetadata = Input.absent();
        private Input<String> campaignId = Input.absent();
        private Input<String> campaignRun = Input.absent();
        private Input<String> engagementSourceType = Input.absent();
        private Input<String> engagementSource = Input.absent();
        private Input<String> engagementSourceLevelTwo = Input.absent();
        private Input<String> systemAction = Input.absent();
        private Input<String> customCallOutcomeData = Input.absent();
        private Input<String> customVisitOutcomeData = Input.absent();
        private Input<String> customTaskCompletionData = Input.absent();
        private Input<String> customTaskInputData = Input.absent();
        private Input<String> customVideoCallInputData = Input.absent();
        private Input<Integer> totalCallDuration = Input.absent();
        private Input<String> cloudProviderNumber = Input.absent();
        private Input<String> hangupReason = Input.absent();
        private Input<String> cloudProvider = Input.absent();
        private Input<String> callType = Input.absent();
        private Input<String> phoneCallLogId = Input.absent();
        private Input<String> deviceId = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder body(String str) {
            this.body = Input.fromNullable(str);
            return this;
        }

        public CreateEngagementInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.engagementType, "engagementType == null");
            Utils.checkNotNull(this.engagementStatus, "engagementStatus == null");
            return new CreateEngagementInput(this.id, this.accountId, this.engagementType, this.contactId, this.primaryTeamId, this.toBeAssigned, this.ownerId, this.contactPrimaryTeamId, this.contactOwnerId, this.engagementStatus, this.callStatus, this.parentEngagementId, this.nextStepTaskId, this.syncStatus, this.externalNumber, this.userNumber, this.callDirection, this.callConnectStatus, this.callStartTime, this.callEndTime, this.durationInMillis, this.callRecordingExternalResource, this.callOutcome, this.callOutcomeNature, this.noteHeading, this.noteAdditionMethod, this.body, this.isManualTask, this.taskHeading, this.taskType, this.taskActivityType, this.taskInputNote, this.taskPriority, this.taskCompletionNote, this.taskCompletionTime, this.taskCompletionType, this.dueDateTime, this.nextFollowUpOn, this.nextFollowUpSetBy, this.reminderDateTime, this.taskLocation, this.uploadedFiledUrl, this.callRecordingUrl, this.callTranscriptUrl, this.callTranscriptSummary, this.voiceNoteUrl, this.visitLocation, this.visitTime, this.visitNote, this.visitOutcome, this.visitOutcomeNature, this.videoCallPlatform, this.videoCallOutcome, this.meetingParticipants, this.videoCallLink, this.meetingName, this.meetingCode, this.videoCallMetadata, this.campaignId, this.campaignRun, this.engagementSourceType, this.engagementSource, this.engagementSourceLevelTwo, this.systemAction, this.customCallOutcomeData, this.customVisitOutcomeData, this.customTaskCompletionData, this.customTaskInputData, this.customVideoCallInputData, this.totalCallDuration, this.cloudProviderNumber, this.hangupReason, this.cloudProvider, this.callType, this.phoneCallLogId, this.deviceId);
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
            this.engagementStatus = engagementStatus;
            return this;
        }

        public Builder engagementType(EngagementType engagementType) {
            this.engagementType = engagementType;
            return this;
        }

        public Builder externalNumber(String str) {
            this.externalNumber = Input.fromNullable(str);
            return this;
        }

        public Builder hangupReason(String str) {
            this.hangupReason = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
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

    public CreateEngagementInput(Input<String> input, String str, EngagementType engagementType, Input<String> input2, Input<String> input3, Input<ContactAssignmentStatus> input4, Input<String> input5, Input<String> input6, Input<String> input7, EngagementStatus engagementStatus, Input<String> input8, Input<String> input9, Input<String> input10, Input<Boolean> input11, Input<String> input12, Input<String> input13, Input<CallDirection> input14, Input<CallConnectStatus> input15, Input<String> input16, Input<String> input17, Input<Integer> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<NoteAdditionMethod> input23, Input<String> input24, Input<Boolean> input25, Input<String> input26, Input<String> input27, Input<TaskActivityType> input28, Input<String> input29, Input<String> input30, Input<String> input31, Input<String> input32, Input<String> input33, Input<String> input34, Input<String> input35, Input<String> input36, Input<String> input37, Input<AddressInput> input38, Input<String> input39, Input<String> input40, Input<String> input41, Input<String> input42, Input<String> input43, Input<AddressInput> input44, Input<String> input45, Input<String> input46, Input<String> input47, Input<String> input48, Input<String> input49, Input<String> input50, Input<List<MeetingParticipantInput>> input51, Input<String> input52, Input<String> input53, Input<String> input54, Input<String> input55, Input<String> input56, Input<String> input57, Input<String> input58, Input<String> input59, Input<String> input60, Input<String> input61, Input<String> input62, Input<String> input63, Input<String> input64, Input<String> input65, Input<String> input66, Input<Integer> input67, Input<String> input68, Input<String> input69, Input<String> input70, Input<String> input71, Input<String> input72, Input<String> input73) {
        this.id = input;
        this.accountId = str;
        this.engagementType = engagementType;
        this.contactId = input2;
        this.primaryTeamId = input3;
        this.toBeAssigned = input4;
        this.ownerId = input5;
        this.contactPrimaryTeamId = input6;
        this.contactOwnerId = input7;
        this.engagementStatus = engagementStatus;
        this.callStatus = input8;
        this.parentEngagementId = input9;
        this.nextStepTaskId = input10;
        this.syncStatus = input11;
        this.externalNumber = input12;
        this.userNumber = input13;
        this.callDirection = input14;
        this.callConnectStatus = input15;
        this.callStartTime = input16;
        this.callEndTime = input17;
        this.durationInMillis = input18;
        this.callRecordingExternalResource = input19;
        this.callOutcome = input20;
        this.callOutcomeNature = input21;
        this.noteHeading = input22;
        this.noteAdditionMethod = input23;
        this.body = input24;
        this.isManualTask = input25;
        this.taskHeading = input26;
        this.taskType = input27;
        this.taskActivityType = input28;
        this.taskInputNote = input29;
        this.taskPriority = input30;
        this.taskCompletionNote = input31;
        this.taskCompletionTime = input32;
        this.taskCompletionType = input33;
        this.dueDateTime = input34;
        this.nextFollowUpOn = input35;
        this.nextFollowUpSetBy = input36;
        this.reminderDateTime = input37;
        this.taskLocation = input38;
        this.uploadedFiledUrl = input39;
        this.callRecordingUrl = input40;
        this.callTranscriptUrl = input41;
        this.callTranscriptSummary = input42;
        this.voiceNoteUrl = input43;
        this.visitLocation = input44;
        this.visitTime = input45;
        this.visitNote = input46;
        this.visitOutcome = input47;
        this.visitOutcomeNature = input48;
        this.videoCallPlatform = input49;
        this.videoCallOutcome = input50;
        this.meetingParticipants = input51;
        this.videoCallLink = input52;
        this.meetingName = input53;
        this.meetingCode = input54;
        this.videoCallMetadata = input55;
        this.campaignId = input56;
        this.campaignRun = input57;
        this.engagementSourceType = input58;
        this.engagementSource = input59;
        this.engagementSourceLevelTwo = input60;
        this.systemAction = input61;
        this.customCallOutcomeData = input62;
        this.customVisitOutcomeData = input63;
        this.customTaskCompletionData = input64;
        this.customTaskInputData = input65;
        this.customVideoCallInputData = input66;
        this.totalCallDuration = input67;
        this.cloudProviderNumber = input68;
        this.hangupReason = input69;
        this.cloudProvider = input70;
        this.callType = input71;
        this.phoneCallLogId = input72;
        this.deviceId = input73;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String body() {
        return this.body.value;
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
        return this.engagementStatus;
    }

    public EngagementType engagementType() {
        return this.engagementType;
    }

    public String externalNumber() {
        return this.externalNumber.value;
    }

    public String hangupReason() {
        return this.hangupReason.value;
    }

    public String id() {
        return this.id.value;
    }

    public Boolean isManualTask() {
        return this.isManualTask.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateEngagementInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateEngagementInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateEngagementInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateEngagementInput.this.accountId);
                inputFieldWriter.writeString("engagementType", CreateEngagementInput.this.engagementType.name());
                if (CreateEngagementInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateEngagementInput.this.contactId.value);
                }
                if (CreateEngagementInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) CreateEngagementInput.this.primaryTeamId.value);
                }
                if (CreateEngagementInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeString("toBeAssigned", CreateEngagementInput.this.toBeAssigned.value != 0 ? ((ContactAssignmentStatus) CreateEngagementInput.this.toBeAssigned.value).name() : null);
                }
                if (CreateEngagementInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) CreateEngagementInput.this.ownerId.value);
                }
                if (CreateEngagementInput.this.contactPrimaryTeamId.defined) {
                    inputFieldWriter.writeString("contactPrimaryTeamId", (String) CreateEngagementInput.this.contactPrimaryTeamId.value);
                }
                if (CreateEngagementInput.this.contactOwnerId.defined) {
                    inputFieldWriter.writeString("contactOwnerId", (String) CreateEngagementInput.this.contactOwnerId.value);
                }
                inputFieldWriter.writeString("engagementStatus", CreateEngagementInput.this.engagementStatus.name());
                if (CreateEngagementInput.this.callStatus.defined) {
                    inputFieldWriter.writeString("callStatus", (String) CreateEngagementInput.this.callStatus.value);
                }
                if (CreateEngagementInput.this.parentEngagementId.defined) {
                    inputFieldWriter.writeString("parentEngagementId", (String) CreateEngagementInput.this.parentEngagementId.value);
                }
                if (CreateEngagementInput.this.nextStepTaskId.defined) {
                    inputFieldWriter.writeString("nextStepTaskId", (String) CreateEngagementInput.this.nextStepTaskId.value);
                }
                if (CreateEngagementInput.this.syncStatus.defined) {
                    inputFieldWriter.writeBoolean("syncStatus", (Boolean) CreateEngagementInput.this.syncStatus.value);
                }
                if (CreateEngagementInput.this.externalNumber.defined) {
                    inputFieldWriter.writeString("externalNumber", (String) CreateEngagementInput.this.externalNumber.value);
                }
                if (CreateEngagementInput.this.userNumber.defined) {
                    inputFieldWriter.writeString("userNumber", (String) CreateEngagementInput.this.userNumber.value);
                }
                if (CreateEngagementInput.this.callDirection.defined) {
                    inputFieldWriter.writeString("callDirection", CreateEngagementInput.this.callDirection.value != 0 ? ((CallDirection) CreateEngagementInput.this.callDirection.value).name() : null);
                }
                if (CreateEngagementInput.this.callConnectStatus.defined) {
                    inputFieldWriter.writeString("callConnectStatus", CreateEngagementInput.this.callConnectStatus.value != 0 ? ((CallConnectStatus) CreateEngagementInput.this.callConnectStatus.value).name() : null);
                }
                if (CreateEngagementInput.this.callStartTime.defined) {
                    inputFieldWriter.writeString("callStartTime", (String) CreateEngagementInput.this.callStartTime.value);
                }
                if (CreateEngagementInput.this.callEndTime.defined) {
                    inputFieldWriter.writeString("callEndTime", (String) CreateEngagementInput.this.callEndTime.value);
                }
                if (CreateEngagementInput.this.durationInMillis.defined) {
                    inputFieldWriter.writeInt("durationInMillis", (Integer) CreateEngagementInput.this.durationInMillis.value);
                }
                if (CreateEngagementInput.this.callRecordingExternalResource.defined) {
                    inputFieldWriter.writeString("callRecordingExternalResource", (String) CreateEngagementInput.this.callRecordingExternalResource.value);
                }
                if (CreateEngagementInput.this.callOutcome.defined) {
                    inputFieldWriter.writeString("callOutcome", (String) CreateEngagementInput.this.callOutcome.value);
                }
                if (CreateEngagementInput.this.callOutcomeNature.defined) {
                    inputFieldWriter.writeString("callOutcomeNature", (String) CreateEngagementInput.this.callOutcomeNature.value);
                }
                if (CreateEngagementInput.this.noteHeading.defined) {
                    inputFieldWriter.writeString("noteHeading", (String) CreateEngagementInput.this.noteHeading.value);
                }
                if (CreateEngagementInput.this.noteAdditionMethod.defined) {
                    inputFieldWriter.writeString("noteAdditionMethod", CreateEngagementInput.this.noteAdditionMethod.value != 0 ? ((NoteAdditionMethod) CreateEngagementInput.this.noteAdditionMethod.value).name() : null);
                }
                if (CreateEngagementInput.this.body.defined) {
                    inputFieldWriter.writeString("body", (String) CreateEngagementInput.this.body.value);
                }
                if (CreateEngagementInput.this.isManualTask.defined) {
                    inputFieldWriter.writeBoolean("isManualTask", (Boolean) CreateEngagementInput.this.isManualTask.value);
                }
                if (CreateEngagementInput.this.taskHeading.defined) {
                    inputFieldWriter.writeString("taskHeading", (String) CreateEngagementInput.this.taskHeading.value);
                }
                if (CreateEngagementInput.this.taskType.defined) {
                    inputFieldWriter.writeString("taskType", (String) CreateEngagementInput.this.taskType.value);
                }
                if (CreateEngagementInput.this.taskActivityType.defined) {
                    inputFieldWriter.writeString("taskActivityType", CreateEngagementInput.this.taskActivityType.value != 0 ? ((TaskActivityType) CreateEngagementInput.this.taskActivityType.value).name() : null);
                }
                if (CreateEngagementInput.this.taskInputNote.defined) {
                    inputFieldWriter.writeString("taskInputNote", (String) CreateEngagementInput.this.taskInputNote.value);
                }
                if (CreateEngagementInput.this.taskPriority.defined) {
                    inputFieldWriter.writeString("taskPriority", (String) CreateEngagementInput.this.taskPriority.value);
                }
                if (CreateEngagementInput.this.taskCompletionNote.defined) {
                    inputFieldWriter.writeString("taskCompletionNote", (String) CreateEngagementInput.this.taskCompletionNote.value);
                }
                if (CreateEngagementInput.this.taskCompletionTime.defined) {
                    inputFieldWriter.writeString("taskCompletionTime", (String) CreateEngagementInput.this.taskCompletionTime.value);
                }
                if (CreateEngagementInput.this.taskCompletionType.defined) {
                    inputFieldWriter.writeString("taskCompletionType", (String) CreateEngagementInput.this.taskCompletionType.value);
                }
                if (CreateEngagementInput.this.dueDateTime.defined) {
                    inputFieldWriter.writeString("dueDateTime", (String) CreateEngagementInput.this.dueDateTime.value);
                }
                if (CreateEngagementInput.this.nextFollowUpOn.defined) {
                    inputFieldWriter.writeString("nextFollowUpOn", (String) CreateEngagementInput.this.nextFollowUpOn.value);
                }
                if (CreateEngagementInput.this.nextFollowUpSetBy.defined) {
                    inputFieldWriter.writeString("nextFollowUpSetBy", (String) CreateEngagementInput.this.nextFollowUpSetBy.value);
                }
                if (CreateEngagementInput.this.reminderDateTime.defined) {
                    inputFieldWriter.writeString("reminderDateTime", (String) CreateEngagementInput.this.reminderDateTime.value);
                }
                if (CreateEngagementInput.this.taskLocation.defined) {
                    inputFieldWriter.writeObject("taskLocation", CreateEngagementInput.this.taskLocation.value != 0 ? ((AddressInput) CreateEngagementInput.this.taskLocation.value).marshaller() : null);
                }
                if (CreateEngagementInput.this.uploadedFiledUrl.defined) {
                    inputFieldWriter.writeString("uploadedFiledUrl", (String) CreateEngagementInput.this.uploadedFiledUrl.value);
                }
                if (CreateEngagementInput.this.callRecordingUrl.defined) {
                    inputFieldWriter.writeString("callRecordingUrl", (String) CreateEngagementInput.this.callRecordingUrl.value);
                }
                if (CreateEngagementInput.this.callTranscriptUrl.defined) {
                    inputFieldWriter.writeString("callTranscriptUrl", (String) CreateEngagementInput.this.callTranscriptUrl.value);
                }
                if (CreateEngagementInput.this.callTranscriptSummary.defined) {
                    inputFieldWriter.writeString("callTranscriptSummary", (String) CreateEngagementInput.this.callTranscriptSummary.value);
                }
                if (CreateEngagementInput.this.voiceNoteUrl.defined) {
                    inputFieldWriter.writeString("voiceNoteUrl", (String) CreateEngagementInput.this.voiceNoteUrl.value);
                }
                if (CreateEngagementInput.this.visitLocation.defined) {
                    inputFieldWriter.writeObject("visitLocation", CreateEngagementInput.this.visitLocation.value != 0 ? ((AddressInput) CreateEngagementInput.this.visitLocation.value).marshaller() : null);
                }
                if (CreateEngagementInput.this.visitTime.defined) {
                    inputFieldWriter.writeString("visitTime", (String) CreateEngagementInput.this.visitTime.value);
                }
                if (CreateEngagementInput.this.visitNote.defined) {
                    inputFieldWriter.writeString("visitNote", (String) CreateEngagementInput.this.visitNote.value);
                }
                if (CreateEngagementInput.this.visitOutcome.defined) {
                    inputFieldWriter.writeString("visitOutcome", (String) CreateEngagementInput.this.visitOutcome.value);
                }
                if (CreateEngagementInput.this.visitOutcomeNature.defined) {
                    inputFieldWriter.writeString("visitOutcomeNature", (String) CreateEngagementInput.this.visitOutcomeNature.value);
                }
                if (CreateEngagementInput.this.videoCallPlatform.defined) {
                    inputFieldWriter.writeString("videoCallPlatform", (String) CreateEngagementInput.this.videoCallPlatform.value);
                }
                if (CreateEngagementInput.this.videoCallOutcome.defined) {
                    inputFieldWriter.writeString("videoCallOutcome", (String) CreateEngagementInput.this.videoCallOutcome.value);
                }
                if (CreateEngagementInput.this.meetingParticipants.defined) {
                    inputFieldWriter.writeList("meetingParticipants", CreateEngagementInput.this.meetingParticipants.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateEngagementInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateEngagementInput.this.meetingParticipants.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MeetingParticipantInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateEngagementInput.this.videoCallLink.defined) {
                    inputFieldWriter.writeString("videoCallLink", (String) CreateEngagementInput.this.videoCallLink.value);
                }
                if (CreateEngagementInput.this.meetingName.defined) {
                    inputFieldWriter.writeString("meetingName", (String) CreateEngagementInput.this.meetingName.value);
                }
                if (CreateEngagementInput.this.meetingCode.defined) {
                    inputFieldWriter.writeString("meetingCode", (String) CreateEngagementInput.this.meetingCode.value);
                }
                if (CreateEngagementInput.this.videoCallMetadata.defined) {
                    inputFieldWriter.writeString("videoCallMetadata", (String) CreateEngagementInput.this.videoCallMetadata.value);
                }
                if (CreateEngagementInput.this.campaignId.defined) {
                    inputFieldWriter.writeString("campaignId", (String) CreateEngagementInput.this.campaignId.value);
                }
                if (CreateEngagementInput.this.campaignRun.defined) {
                    inputFieldWriter.writeString("campaignRun", (String) CreateEngagementInput.this.campaignRun.value);
                }
                if (CreateEngagementInput.this.engagementSourceType.defined) {
                    inputFieldWriter.writeString("engagementSourceType", (String) CreateEngagementInput.this.engagementSourceType.value);
                }
                if (CreateEngagementInput.this.engagementSource.defined) {
                    inputFieldWriter.writeString("engagementSource", (String) CreateEngagementInput.this.engagementSource.value);
                }
                if (CreateEngagementInput.this.engagementSourceLevelTwo.defined) {
                    inputFieldWriter.writeString("engagementSourceLevelTwo", (String) CreateEngagementInput.this.engagementSourceLevelTwo.value);
                }
                if (CreateEngagementInput.this.systemAction.defined) {
                    inputFieldWriter.writeString("systemAction", (String) CreateEngagementInput.this.systemAction.value);
                }
                if (CreateEngagementInput.this.customCallOutcomeData.defined) {
                    inputFieldWriter.writeString("customCallOutcomeData", (String) CreateEngagementInput.this.customCallOutcomeData.value);
                }
                if (CreateEngagementInput.this.customVisitOutcomeData.defined) {
                    inputFieldWriter.writeString("customVisitOutcomeData", (String) CreateEngagementInput.this.customVisitOutcomeData.value);
                }
                if (CreateEngagementInput.this.customTaskCompletionData.defined) {
                    inputFieldWriter.writeString("customTaskCompletionData", (String) CreateEngagementInput.this.customTaskCompletionData.value);
                }
                if (CreateEngagementInput.this.customTaskInputData.defined) {
                    inputFieldWriter.writeString("customTaskInputData", (String) CreateEngagementInput.this.customTaskInputData.value);
                }
                if (CreateEngagementInput.this.customVideoCallInputData.defined) {
                    inputFieldWriter.writeString("customVideoCallInputData", (String) CreateEngagementInput.this.customVideoCallInputData.value);
                }
                if (CreateEngagementInput.this.totalCallDuration.defined) {
                    inputFieldWriter.writeInt("totalCallDuration", (Integer) CreateEngagementInput.this.totalCallDuration.value);
                }
                if (CreateEngagementInput.this.cloudProviderNumber.defined) {
                    inputFieldWriter.writeString("cloudProviderNumber", (String) CreateEngagementInput.this.cloudProviderNumber.value);
                }
                if (CreateEngagementInput.this.hangupReason.defined) {
                    inputFieldWriter.writeString("hangupReason", (String) CreateEngagementInput.this.hangupReason.value);
                }
                if (CreateEngagementInput.this.cloudProvider.defined) {
                    inputFieldWriter.writeString("cloudProvider", (String) CreateEngagementInput.this.cloudProvider.value);
                }
                if (CreateEngagementInput.this.callType.defined) {
                    inputFieldWriter.writeString("callType", (String) CreateEngagementInput.this.callType.value);
                }
                if (CreateEngagementInput.this.phoneCallLogId.defined) {
                    inputFieldWriter.writeString("phoneCallLogId", (String) CreateEngagementInput.this.phoneCallLogId.value);
                }
                if (CreateEngagementInput.this.deviceId.defined) {
                    inputFieldWriter.writeString("deviceId", (String) CreateEngagementInput.this.deviceId.value);
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
