package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelEngagementConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> addedById;
    private final Input<List<ModelEngagementConditionInput>> and;
    private final Input<ModelStringInput> body;
    private final Input<ModelCallConnectStatusInput> callConnectStatus;
    private final Input<ModelCallDirectionInput> callDirection;
    private final Input<ModelStringInput> callEndTime;
    private final Input<ModelStringInput> callOutcome;
    private final Input<ModelStringInput> callOutcomeNature;
    private final Input<ModelStringInput> callRecordingUrl;
    private final Input<ModelStringInput> callStartTime;
    private final Input<ModelStringInput> callStatus;
    private final Input<ModelStringInput> callTranscriptSummary;
    private final Input<ModelStringInput> callTranscriptUrl;
    private final Input<ModelIDInput> campaignId;
    private final Input<ModelStringInput> campaignRun;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelIDInput> contactOwnerId;
    private final Input<ModelIDInput> contactPrimaryTeamId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> dueDateTime;
    private final Input<ModelIntInput> durationInMillis;
    private final Input<ModelStringInput> engagementSource;
    private final Input<ModelStringInput> engagementSourceLevelTwo;
    private final Input<ModelStringInput> engagementSourceType;
    private final Input<ModelEngagementStatusInput> engagementStatus;
    private final Input<ModelEngagementTypeInput> engagementType;
    private final Input<ModelStringInput> externalNumber;
    private final Input<ModelBooleanInput> isManualTask;
    private final Input<ModelStringInput> meetingCode;
    private final Input<ModelStringInput> meetingName;
    private final Input<ModelStringInput> nextFollowUpOn;
    private final Input<ModelStringInput> nextFollowUpSetBy;
    private final Input<ModelIDInput> nextStepTaskId;
    private final Input<ModelEngagementConditionInput> not;
    private final Input<ModelNoteAdditionMethodInput> noteAdditionMethod;
    private final Input<ModelStringInput> noteHeading;
    private final Input<List<ModelEngagementConditionInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> parentEngagementId;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelStringInput> reminderDateTime;
    private final Input<ModelBooleanInput> syncStatus;
    private final Input<ModelStringInput> systemAction;
    private final Input<ModelTaskActivityTypeInput> taskActivityType;
    private final Input<ModelStringInput> taskCompletionNote;
    private final Input<ModelStringInput> taskCompletionTime;
    private final Input<ModelStringInput> taskCompletionType;
    private final Input<ModelStringInput> taskHeading;
    private final Input<ModelStringInput> taskInputNote;
    private final Input<ModelStringInput> taskPriority;
    private final Input<ModelStringInput> taskType;
    private final Input<ModelContactAssignmentStatusInput> toBeAssigned;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelStringInput> uploadedFiledUrl;
    private final Input<ModelStringInput> userNumber;
    private final Input<ModelStringInput> videoCallLink;
    private final Input<ModelStringInput> videoCallMetadata;
    private final Input<ModelStringInput> videoCallOutcome;
    private final Input<ModelStringInput> videoCallPlatform;
    private final Input<ModelStringInput> visitNote;
    private final Input<ModelStringInput> visitOutcome;
    private final Input<ModelStringInput> visitOutcomeNature;
    private final Input<ModelStringInput> visitTime;
    private final Input<ModelStringInput> voiceNoteUrl;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelEngagementTypeInput> engagementType = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> primaryTeamId = Input.absent();
        private Input<ModelContactAssignmentStatusInput> toBeAssigned = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelIDInput> contactPrimaryTeamId = Input.absent();
        private Input<ModelIDInput> contactOwnerId = Input.absent();
        private Input<ModelIDInput> addedById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelEngagementStatusInput> engagementStatus = Input.absent();
        private Input<ModelStringInput> callStatus = Input.absent();
        private Input<ModelIDInput> parentEngagementId = Input.absent();
        private Input<ModelIDInput> nextStepTaskId = Input.absent();
        private Input<ModelBooleanInput> syncStatus = Input.absent();
        private Input<ModelStringInput> externalNumber = Input.absent();
        private Input<ModelStringInput> userNumber = Input.absent();
        private Input<ModelCallDirectionInput> callDirection = Input.absent();
        private Input<ModelCallConnectStatusInput> callConnectStatus = Input.absent();
        private Input<ModelStringInput> callStartTime = Input.absent();
        private Input<ModelStringInput> callEndTime = Input.absent();
        private Input<ModelIntInput> durationInMillis = Input.absent();
        private Input<ModelStringInput> callOutcome = Input.absent();
        private Input<ModelStringInput> callOutcomeNature = Input.absent();
        private Input<ModelStringInput> noteHeading = Input.absent();
        private Input<ModelNoteAdditionMethodInput> noteAdditionMethod = Input.absent();
        private Input<ModelStringInput> body = Input.absent();
        private Input<ModelBooleanInput> isManualTask = Input.absent();
        private Input<ModelStringInput> taskHeading = Input.absent();
        private Input<ModelStringInput> taskType = Input.absent();
        private Input<ModelTaskActivityTypeInput> taskActivityType = Input.absent();
        private Input<ModelStringInput> taskInputNote = Input.absent();
        private Input<ModelStringInput> taskPriority = Input.absent();
        private Input<ModelStringInput> taskCompletionNote = Input.absent();
        private Input<ModelStringInput> taskCompletionTime = Input.absent();
        private Input<ModelStringInput> taskCompletionType = Input.absent();
        private Input<ModelStringInput> dueDateTime = Input.absent();
        private Input<ModelStringInput> nextFollowUpOn = Input.absent();
        private Input<ModelStringInput> nextFollowUpSetBy = Input.absent();
        private Input<ModelStringInput> reminderDateTime = Input.absent();
        private Input<ModelStringInput> uploadedFiledUrl = Input.absent();
        private Input<ModelStringInput> callRecordingUrl = Input.absent();
        private Input<ModelStringInput> callTranscriptUrl = Input.absent();
        private Input<ModelStringInput> callTranscriptSummary = Input.absent();
        private Input<ModelStringInput> voiceNoteUrl = Input.absent();
        private Input<ModelStringInput> visitTime = Input.absent();
        private Input<ModelStringInput> visitNote = Input.absent();
        private Input<ModelStringInput> visitOutcome = Input.absent();
        private Input<ModelStringInput> visitOutcomeNature = Input.absent();
        private Input<ModelStringInput> videoCallPlatform = Input.absent();
        private Input<ModelStringInput> videoCallOutcome = Input.absent();
        private Input<ModelStringInput> videoCallLink = Input.absent();
        private Input<ModelStringInput> meetingName = Input.absent();
        private Input<ModelStringInput> meetingCode = Input.absent();
        private Input<ModelStringInput> videoCallMetadata = Input.absent();
        private Input<ModelIDInput> campaignId = Input.absent();
        private Input<ModelStringInput> campaignRun = Input.absent();
        private Input<ModelStringInput> engagementSourceType = Input.absent();
        private Input<ModelStringInput> engagementSource = Input.absent();
        private Input<ModelStringInput> engagementSourceLevelTwo = Input.absent();
        private Input<ModelStringInput> systemAction = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelEngagementConditionInput>> and = Input.absent();
        private Input<List<ModelEngagementConditionInput>> or = Input.absent();
        private Input<ModelEngagementConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder addedById(ModelIDInput modelIDInput) {
            this.addedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelEngagementConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder body(ModelStringInput modelStringInput) {
            this.body = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelEngagementConditionInput build() {
            return new ModelEngagementConditionInput(this.accountId, this.engagementType, this.contactId, this.primaryTeamId, this.toBeAssigned, this.ownerId, this.contactPrimaryTeamId, this.contactOwnerId, this.addedById, this.updatedById, this.engagementStatus, this.callStatus, this.parentEngagementId, this.nextStepTaskId, this.syncStatus, this.externalNumber, this.userNumber, this.callDirection, this.callConnectStatus, this.callStartTime, this.callEndTime, this.durationInMillis, this.callOutcome, this.callOutcomeNature, this.noteHeading, this.noteAdditionMethod, this.body, this.isManualTask, this.taskHeading, this.taskType, this.taskActivityType, this.taskInputNote, this.taskPriority, this.taskCompletionNote, this.taskCompletionTime, this.taskCompletionType, this.dueDateTime, this.nextFollowUpOn, this.nextFollowUpSetBy, this.reminderDateTime, this.uploadedFiledUrl, this.callRecordingUrl, this.callTranscriptUrl, this.callTranscriptSummary, this.voiceNoteUrl, this.visitTime, this.visitNote, this.visitOutcome, this.visitOutcomeNature, this.videoCallPlatform, this.videoCallOutcome, this.videoCallLink, this.meetingName, this.meetingCode, this.videoCallMetadata, this.campaignId, this.campaignRun, this.engagementSourceType, this.engagementSource, this.engagementSourceLevelTwo, this.systemAction, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder callConnectStatus(ModelCallConnectStatusInput modelCallConnectStatusInput) {
            this.callConnectStatus = Input.fromNullable(modelCallConnectStatusInput);
            return this;
        }

        public Builder callDirection(ModelCallDirectionInput modelCallDirectionInput) {
            this.callDirection = Input.fromNullable(modelCallDirectionInput);
            return this;
        }

        public Builder callEndTime(ModelStringInput modelStringInput) {
            this.callEndTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callOutcome(ModelStringInput modelStringInput) {
            this.callOutcome = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callOutcomeNature(ModelStringInput modelStringInput) {
            this.callOutcomeNature = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callRecordingUrl(ModelStringInput modelStringInput) {
            this.callRecordingUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callStartTime(ModelStringInput modelStringInput) {
            this.callStartTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callStatus(ModelStringInput modelStringInput) {
            this.callStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callTranscriptSummary(ModelStringInput modelStringInput) {
            this.callTranscriptSummary = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callTranscriptUrl(ModelStringInput modelStringInput) {
            this.callTranscriptUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder campaignId(ModelIDInput modelIDInput) {
            this.campaignId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder campaignRun(ModelStringInput modelStringInput) {
            this.campaignRun = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactOwnerId(ModelIDInput modelIDInput) {
            this.contactOwnerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactPrimaryTeamId(ModelIDInput modelIDInput) {
            this.contactPrimaryTeamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dueDateTime(ModelStringInput modelStringInput) {
            this.dueDateTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder durationInMillis(ModelIntInput modelIntInput) {
            this.durationInMillis = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder engagementSource(ModelStringInput modelStringInput) {
            this.engagementSource = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder engagementSourceLevelTwo(ModelStringInput modelStringInput) {
            this.engagementSourceLevelTwo = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder engagementSourceType(ModelStringInput modelStringInput) {
            this.engagementSourceType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder engagementStatus(ModelEngagementStatusInput modelEngagementStatusInput) {
            this.engagementStatus = Input.fromNullable(modelEngagementStatusInput);
            return this;
        }

        public Builder engagementType(ModelEngagementTypeInput modelEngagementTypeInput) {
            this.engagementType = Input.fromNullable(modelEngagementTypeInput);
            return this;
        }

        public Builder externalNumber(ModelStringInput modelStringInput) {
            this.externalNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder isManualTask(ModelBooleanInput modelBooleanInput) {
            this.isManualTask = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder meetingCode(ModelStringInput modelStringInput) {
            this.meetingCode = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder meetingName(ModelStringInput modelStringInput) {
            this.meetingName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder nextFollowUpOn(ModelStringInput modelStringInput) {
            this.nextFollowUpOn = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder nextFollowUpSetBy(ModelStringInput modelStringInput) {
            this.nextFollowUpSetBy = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder nextStepTaskId(ModelIDInput modelIDInput) {
            this.nextStepTaskId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelEngagementConditionInput modelEngagementConditionInput) {
            this.not = Input.fromNullable(modelEngagementConditionInput);
            return this;
        }

        public Builder noteAdditionMethod(ModelNoteAdditionMethodInput modelNoteAdditionMethodInput) {
            this.noteAdditionMethod = Input.fromNullable(modelNoteAdditionMethodInput);
            return this;
        }

        public Builder noteHeading(ModelStringInput modelStringInput) {
            this.noteHeading = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelEngagementConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder parentEngagementId(ModelIDInput modelIDInput) {
            this.parentEngagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder primaryTeamId(ModelIDInput modelIDInput) {
            this.primaryTeamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder reminderDateTime(ModelStringInput modelStringInput) {
            this.reminderDateTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder syncStatus(ModelBooleanInput modelBooleanInput) {
            this.syncStatus = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder systemAction(ModelStringInput modelStringInput) {
            this.systemAction = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder taskActivityType(ModelTaskActivityTypeInput modelTaskActivityTypeInput) {
            this.taskActivityType = Input.fromNullable(modelTaskActivityTypeInput);
            return this;
        }

        public Builder taskCompletionNote(ModelStringInput modelStringInput) {
            this.taskCompletionNote = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder taskCompletionTime(ModelStringInput modelStringInput) {
            this.taskCompletionTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder taskCompletionType(ModelStringInput modelStringInput) {
            this.taskCompletionType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder taskHeading(ModelStringInput modelStringInput) {
            this.taskHeading = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder taskInputNote(ModelStringInput modelStringInput) {
            this.taskInputNote = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder taskPriority(ModelStringInput modelStringInput) {
            this.taskPriority = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder taskType(ModelStringInput modelStringInput) {
            this.taskType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder toBeAssigned(ModelContactAssignmentStatusInput modelContactAssignmentStatusInput) {
            this.toBeAssigned = Input.fromNullable(modelContactAssignmentStatusInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder uploadedFiledUrl(ModelStringInput modelStringInput) {
            this.uploadedFiledUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder userNumber(ModelStringInput modelStringInput) {
            this.userNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder videoCallLink(ModelStringInput modelStringInput) {
            this.videoCallLink = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder videoCallMetadata(ModelStringInput modelStringInput) {
            this.videoCallMetadata = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder videoCallOutcome(ModelStringInput modelStringInput) {
            this.videoCallOutcome = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder videoCallPlatform(ModelStringInput modelStringInput) {
            this.videoCallPlatform = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder visitNote(ModelStringInput modelStringInput) {
            this.visitNote = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder visitOutcome(ModelStringInput modelStringInput) {
            this.visitOutcome = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder visitOutcomeNature(ModelStringInput modelStringInput) {
            this.visitOutcomeNature = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder visitTime(ModelStringInput modelStringInput) {
            this.visitTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder voiceNoteUrl(ModelStringInput modelStringInput) {
            this.voiceNoteUrl = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelEngagementConditionInput(Input<ModelIDInput> input, Input<ModelEngagementTypeInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelContactAssignmentStatusInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelEngagementStatusInput> input11, Input<ModelStringInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<ModelBooleanInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelCallDirectionInput> input18, Input<ModelCallConnectStatusInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelIntInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelNoteAdditionMethodInput> input26, Input<ModelStringInput> input27, Input<ModelBooleanInput> input28, Input<ModelStringInput> input29, Input<ModelStringInput> input30, Input<ModelTaskActivityTypeInput> input31, Input<ModelStringInput> input32, Input<ModelStringInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<ModelStringInput> input36, Input<ModelStringInput> input37, Input<ModelStringInput> input38, Input<ModelStringInput> input39, Input<ModelStringInput> input40, Input<ModelStringInput> input41, Input<ModelStringInput> input42, Input<ModelStringInput> input43, Input<ModelStringInput> input44, Input<ModelStringInput> input45, Input<ModelStringInput> input46, Input<ModelStringInput> input47, Input<ModelStringInput> input48, Input<ModelStringInput> input49, Input<ModelStringInput> input50, Input<ModelStringInput> input51, Input<ModelStringInput> input52, Input<ModelStringInput> input53, Input<ModelStringInput> input54, Input<ModelStringInput> input55, Input<ModelIDInput> input56, Input<ModelStringInput> input57, Input<ModelStringInput> input58, Input<ModelStringInput> input59, Input<ModelStringInput> input60, Input<ModelStringInput> input61, Input<ModelStringInput> input62, Input<ModelStringInput> input63, Input<List<ModelEngagementConditionInput>> input64, Input<List<ModelEngagementConditionInput>> input65, Input<ModelEngagementConditionInput> input66) {
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
        this.engagementStatus = input11;
        this.callStatus = input12;
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
        this.noteHeading = input25;
        this.noteAdditionMethod = input26;
        this.body = input27;
        this.isManualTask = input28;
        this.taskHeading = input29;
        this.taskType = input30;
        this.taskActivityType = input31;
        this.taskInputNote = input32;
        this.taskPriority = input33;
        this.taskCompletionNote = input34;
        this.taskCompletionTime = input35;
        this.taskCompletionType = input36;
        this.dueDateTime = input37;
        this.nextFollowUpOn = input38;
        this.nextFollowUpSetBy = input39;
        this.reminderDateTime = input40;
        this.uploadedFiledUrl = input41;
        this.callRecordingUrl = input42;
        this.callTranscriptUrl = input43;
        this.callTranscriptSummary = input44;
        this.voiceNoteUrl = input45;
        this.visitTime = input46;
        this.visitNote = input47;
        this.visitOutcome = input48;
        this.visitOutcomeNature = input49;
        this.videoCallPlatform = input50;
        this.videoCallOutcome = input51;
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
        this.createdAt = input62;
        this.updatedAt = input63;
        this.and = input64;
        this.or = input65;
        this.not = input66;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelIDInput addedById() {
        return this.addedById.value;
    }

    public List<ModelEngagementConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput body() {
        return this.body.value;
    }

    public ModelCallConnectStatusInput callConnectStatus() {
        return this.callConnectStatus.value;
    }

    public ModelCallDirectionInput callDirection() {
        return this.callDirection.value;
    }

    public ModelStringInput callEndTime() {
        return this.callEndTime.value;
    }

    public ModelStringInput callOutcome() {
        return this.callOutcome.value;
    }

    public ModelStringInput callOutcomeNature() {
        return this.callOutcomeNature.value;
    }

    public ModelStringInput callRecordingUrl() {
        return this.callRecordingUrl.value;
    }

    public ModelStringInput callStartTime() {
        return this.callStartTime.value;
    }

    public ModelStringInput callStatus() {
        return this.callStatus.value;
    }

    public ModelStringInput callTranscriptSummary() {
        return this.callTranscriptSummary.value;
    }

    public ModelStringInput callTranscriptUrl() {
        return this.callTranscriptUrl.value;
    }

    public ModelIDInput campaignId() {
        return this.campaignId.value;
    }

    public ModelStringInput campaignRun() {
        return this.campaignRun.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelIDInput contactOwnerId() {
        return this.contactOwnerId.value;
    }

    public ModelIDInput contactPrimaryTeamId() {
        return this.contactPrimaryTeamId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput dueDateTime() {
        return this.dueDateTime.value;
    }

    public ModelIntInput durationInMillis() {
        return this.durationInMillis.value;
    }

    public ModelStringInput engagementSource() {
        return this.engagementSource.value;
    }

    public ModelStringInput engagementSourceLevelTwo() {
        return this.engagementSourceLevelTwo.value;
    }

    public ModelStringInput engagementSourceType() {
        return this.engagementSourceType.value;
    }

    public ModelEngagementStatusInput engagementStatus() {
        return this.engagementStatus.value;
    }

    public ModelEngagementTypeInput engagementType() {
        return this.engagementType.value;
    }

    public ModelStringInput externalNumber() {
        return this.externalNumber.value;
    }

    public ModelBooleanInput isManualTask() {
        return this.isManualTask.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEngagementConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEngagementConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelEngagementConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelEngagementConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.engagementType.defined) {
                    inputFieldWriter.writeObject("engagementType", ModelEngagementConditionInput.this.engagementType.value != 0 ? ((ModelEngagementTypeInput) ModelEngagementConditionInput.this.engagementType.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelEngagementConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelEngagementConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelEngagementConditionInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelEngagementConditionInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeObject("toBeAssigned", ModelEngagementConditionInput.this.toBeAssigned.value != 0 ? ((ModelContactAssignmentStatusInput) ModelEngagementConditionInput.this.toBeAssigned.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelEngagementConditionInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelEngagementConditionInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.contactPrimaryTeamId.defined) {
                    inputFieldWriter.writeObject("contactPrimaryTeamId", ModelEngagementConditionInput.this.contactPrimaryTeamId.value != 0 ? ((ModelIDInput) ModelEngagementConditionInput.this.contactPrimaryTeamId.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.contactOwnerId.defined) {
                    inputFieldWriter.writeObject("contactOwnerId", ModelEngagementConditionInput.this.contactOwnerId.value != 0 ? ((ModelIDInput) ModelEngagementConditionInput.this.contactOwnerId.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", ModelEngagementConditionInput.this.addedById.value != 0 ? ((ModelIDInput) ModelEngagementConditionInput.this.addedById.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelEngagementConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelEngagementConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.engagementStatus.defined) {
                    inputFieldWriter.writeObject("engagementStatus", ModelEngagementConditionInput.this.engagementStatus.value != 0 ? ((ModelEngagementStatusInput) ModelEngagementConditionInput.this.engagementStatus.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.callStatus.defined) {
                    inputFieldWriter.writeObject("callStatus", ModelEngagementConditionInput.this.callStatus.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.callStatus.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.parentEngagementId.defined) {
                    inputFieldWriter.writeObject("parentEngagementId", ModelEngagementConditionInput.this.parentEngagementId.value != 0 ? ((ModelIDInput) ModelEngagementConditionInput.this.parentEngagementId.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.nextStepTaskId.defined) {
                    inputFieldWriter.writeObject("nextStepTaskId", ModelEngagementConditionInput.this.nextStepTaskId.value != 0 ? ((ModelIDInput) ModelEngagementConditionInput.this.nextStepTaskId.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.syncStatus.defined) {
                    inputFieldWriter.writeObject("syncStatus", ModelEngagementConditionInput.this.syncStatus.value != 0 ? ((ModelBooleanInput) ModelEngagementConditionInput.this.syncStatus.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.externalNumber.defined) {
                    inputFieldWriter.writeObject("externalNumber", ModelEngagementConditionInput.this.externalNumber.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.externalNumber.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.userNumber.defined) {
                    inputFieldWriter.writeObject("userNumber", ModelEngagementConditionInput.this.userNumber.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.userNumber.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.callDirection.defined) {
                    inputFieldWriter.writeObject("callDirection", ModelEngagementConditionInput.this.callDirection.value != 0 ? ((ModelCallDirectionInput) ModelEngagementConditionInput.this.callDirection.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.callConnectStatus.defined) {
                    inputFieldWriter.writeObject("callConnectStatus", ModelEngagementConditionInput.this.callConnectStatus.value != 0 ? ((ModelCallConnectStatusInput) ModelEngagementConditionInput.this.callConnectStatus.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.callStartTime.defined) {
                    inputFieldWriter.writeObject("callStartTime", ModelEngagementConditionInput.this.callStartTime.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.callStartTime.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.callEndTime.defined) {
                    inputFieldWriter.writeObject("callEndTime", ModelEngagementConditionInput.this.callEndTime.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.callEndTime.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.durationInMillis.defined) {
                    inputFieldWriter.writeObject("durationInMillis", ModelEngagementConditionInput.this.durationInMillis.value != 0 ? ((ModelIntInput) ModelEngagementConditionInput.this.durationInMillis.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.callOutcome.defined) {
                    inputFieldWriter.writeObject("callOutcome", ModelEngagementConditionInput.this.callOutcome.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.callOutcome.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.callOutcomeNature.defined) {
                    inputFieldWriter.writeObject("callOutcomeNature", ModelEngagementConditionInput.this.callOutcomeNature.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.callOutcomeNature.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.noteHeading.defined) {
                    inputFieldWriter.writeObject("noteHeading", ModelEngagementConditionInput.this.noteHeading.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.noteHeading.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.noteAdditionMethod.defined) {
                    inputFieldWriter.writeObject("noteAdditionMethod", ModelEngagementConditionInput.this.noteAdditionMethod.value != 0 ? ((ModelNoteAdditionMethodInput) ModelEngagementConditionInput.this.noteAdditionMethod.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.body.defined) {
                    inputFieldWriter.writeObject("body", ModelEngagementConditionInput.this.body.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.body.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.isManualTask.defined) {
                    inputFieldWriter.writeObject("isManualTask", ModelEngagementConditionInput.this.isManualTask.value != 0 ? ((ModelBooleanInput) ModelEngagementConditionInput.this.isManualTask.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.taskHeading.defined) {
                    inputFieldWriter.writeObject("taskHeading", ModelEngagementConditionInput.this.taskHeading.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.taskHeading.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.taskType.defined) {
                    inputFieldWriter.writeObject("taskType", ModelEngagementConditionInput.this.taskType.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.taskType.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.taskActivityType.defined) {
                    inputFieldWriter.writeObject("taskActivityType", ModelEngagementConditionInput.this.taskActivityType.value != 0 ? ((ModelTaskActivityTypeInput) ModelEngagementConditionInput.this.taskActivityType.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.taskInputNote.defined) {
                    inputFieldWriter.writeObject("taskInputNote", ModelEngagementConditionInput.this.taskInputNote.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.taskInputNote.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.taskPriority.defined) {
                    inputFieldWriter.writeObject("taskPriority", ModelEngagementConditionInput.this.taskPriority.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.taskPriority.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.taskCompletionNote.defined) {
                    inputFieldWriter.writeObject("taskCompletionNote", ModelEngagementConditionInput.this.taskCompletionNote.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.taskCompletionNote.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.taskCompletionTime.defined) {
                    inputFieldWriter.writeObject("taskCompletionTime", ModelEngagementConditionInput.this.taskCompletionTime.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.taskCompletionTime.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.taskCompletionType.defined) {
                    inputFieldWriter.writeObject("taskCompletionType", ModelEngagementConditionInput.this.taskCompletionType.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.taskCompletionType.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.dueDateTime.defined) {
                    inputFieldWriter.writeObject("dueDateTime", ModelEngagementConditionInput.this.dueDateTime.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.dueDateTime.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.nextFollowUpOn.defined) {
                    inputFieldWriter.writeObject("nextFollowUpOn", ModelEngagementConditionInput.this.nextFollowUpOn.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.nextFollowUpOn.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.nextFollowUpSetBy.defined) {
                    inputFieldWriter.writeObject("nextFollowUpSetBy", ModelEngagementConditionInput.this.nextFollowUpSetBy.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.nextFollowUpSetBy.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.reminderDateTime.defined) {
                    inputFieldWriter.writeObject("reminderDateTime", ModelEngagementConditionInput.this.reminderDateTime.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.reminderDateTime.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.uploadedFiledUrl.defined) {
                    inputFieldWriter.writeObject("uploadedFiledUrl", ModelEngagementConditionInput.this.uploadedFiledUrl.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.uploadedFiledUrl.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.callRecordingUrl.defined) {
                    inputFieldWriter.writeObject("callRecordingUrl", ModelEngagementConditionInput.this.callRecordingUrl.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.callRecordingUrl.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.callTranscriptUrl.defined) {
                    inputFieldWriter.writeObject("callTranscriptUrl", ModelEngagementConditionInput.this.callTranscriptUrl.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.callTranscriptUrl.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.callTranscriptSummary.defined) {
                    inputFieldWriter.writeObject("callTranscriptSummary", ModelEngagementConditionInput.this.callTranscriptSummary.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.callTranscriptSummary.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.voiceNoteUrl.defined) {
                    inputFieldWriter.writeObject("voiceNoteUrl", ModelEngagementConditionInput.this.voiceNoteUrl.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.voiceNoteUrl.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.visitTime.defined) {
                    inputFieldWriter.writeObject("visitTime", ModelEngagementConditionInput.this.visitTime.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.visitTime.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.visitNote.defined) {
                    inputFieldWriter.writeObject("visitNote", ModelEngagementConditionInput.this.visitNote.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.visitNote.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.visitOutcome.defined) {
                    inputFieldWriter.writeObject("visitOutcome", ModelEngagementConditionInput.this.visitOutcome.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.visitOutcome.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.visitOutcomeNature.defined) {
                    inputFieldWriter.writeObject("visitOutcomeNature", ModelEngagementConditionInput.this.visitOutcomeNature.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.visitOutcomeNature.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.videoCallPlatform.defined) {
                    inputFieldWriter.writeObject("videoCallPlatform", ModelEngagementConditionInput.this.videoCallPlatform.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.videoCallPlatform.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.videoCallOutcome.defined) {
                    inputFieldWriter.writeObject("videoCallOutcome", ModelEngagementConditionInput.this.videoCallOutcome.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.videoCallOutcome.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.videoCallLink.defined) {
                    inputFieldWriter.writeObject("videoCallLink", ModelEngagementConditionInput.this.videoCallLink.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.videoCallLink.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.meetingName.defined) {
                    inputFieldWriter.writeObject("meetingName", ModelEngagementConditionInput.this.meetingName.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.meetingName.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.meetingCode.defined) {
                    inputFieldWriter.writeObject("meetingCode", ModelEngagementConditionInput.this.meetingCode.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.meetingCode.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.videoCallMetadata.defined) {
                    inputFieldWriter.writeObject("videoCallMetadata", ModelEngagementConditionInput.this.videoCallMetadata.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.videoCallMetadata.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.campaignId.defined) {
                    inputFieldWriter.writeObject("campaignId", ModelEngagementConditionInput.this.campaignId.value != 0 ? ((ModelIDInput) ModelEngagementConditionInput.this.campaignId.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.campaignRun.defined) {
                    inputFieldWriter.writeObject("campaignRun", ModelEngagementConditionInput.this.campaignRun.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.campaignRun.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.engagementSourceType.defined) {
                    inputFieldWriter.writeObject("engagementSourceType", ModelEngagementConditionInput.this.engagementSourceType.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.engagementSourceType.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.engagementSource.defined) {
                    inputFieldWriter.writeObject("engagementSource", ModelEngagementConditionInput.this.engagementSource.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.engagementSource.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.engagementSourceLevelTwo.defined) {
                    inputFieldWriter.writeObject("engagementSourceLevelTwo", ModelEngagementConditionInput.this.engagementSourceLevelTwo.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.engagementSourceLevelTwo.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.systemAction.defined) {
                    inputFieldWriter.writeObject("systemAction", ModelEngagementConditionInput.this.systemAction.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.systemAction.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelEngagementConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelEngagementConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelEngagementConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelEngagementConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelEngagementConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEngagementConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEngagementConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEngagementConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEngagementConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelEngagementConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEngagementConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEngagementConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEngagementConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEngagementConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelEngagementConditionInput.this.not.value != 0 ? ((ModelEngagementConditionInput) ModelEngagementConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput meetingCode() {
        return this.meetingCode.value;
    }

    public ModelStringInput meetingName() {
        return this.meetingName.value;
    }

    public ModelStringInput nextFollowUpOn() {
        return this.nextFollowUpOn.value;
    }

    public ModelStringInput nextFollowUpSetBy() {
        return this.nextFollowUpSetBy.value;
    }

    public ModelIDInput nextStepTaskId() {
        return this.nextStepTaskId.value;
    }

    public ModelEngagementConditionInput not() {
        return this.not.value;
    }

    public ModelNoteAdditionMethodInput noteAdditionMethod() {
        return this.noteAdditionMethod.value;
    }

    public ModelStringInput noteHeading() {
        return this.noteHeading.value;
    }

    public List<ModelEngagementConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelIDInput parentEngagementId() {
        return this.parentEngagementId.value;
    }

    public ModelIDInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public ModelStringInput reminderDateTime() {
        return this.reminderDateTime.value;
    }

    public ModelBooleanInput syncStatus() {
        return this.syncStatus.value;
    }

    public ModelStringInput systemAction() {
        return this.systemAction.value;
    }

    public ModelTaskActivityTypeInput taskActivityType() {
        return this.taskActivityType.value;
    }

    public ModelStringInput taskCompletionNote() {
        return this.taskCompletionNote.value;
    }

    public ModelStringInput taskCompletionTime() {
        return this.taskCompletionTime.value;
    }

    public ModelStringInput taskCompletionType() {
        return this.taskCompletionType.value;
    }

    public ModelStringInput taskHeading() {
        return this.taskHeading.value;
    }

    public ModelStringInput taskInputNote() {
        return this.taskInputNote.value;
    }

    public ModelStringInput taskPriority() {
        return this.taskPriority.value;
    }

    public ModelStringInput taskType() {
        return this.taskType.value;
    }

    public ModelContactAssignmentStatusInput toBeAssigned() {
        return this.toBeAssigned.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelStringInput uploadedFiledUrl() {
        return this.uploadedFiledUrl.value;
    }

    public ModelStringInput userNumber() {
        return this.userNumber.value;
    }

    public ModelStringInput videoCallLink() {
        return this.videoCallLink.value;
    }

    public ModelStringInput videoCallMetadata() {
        return this.videoCallMetadata.value;
    }

    public ModelStringInput videoCallOutcome() {
        return this.videoCallOutcome.value;
    }

    public ModelStringInput videoCallPlatform() {
        return this.videoCallPlatform.value;
    }

    public ModelStringInput visitNote() {
        return this.visitNote.value;
    }

    public ModelStringInput visitOutcome() {
        return this.visitOutcome.value;
    }

    public ModelStringInput visitOutcomeNature() {
        return this.visitOutcomeNature.value;
    }

    public ModelStringInput visitTime() {
        return this.visitTime.value;
    }

    public ModelStringInput voiceNoteUrl() {
        return this.voiceNoteUrl.value;
    }
}
