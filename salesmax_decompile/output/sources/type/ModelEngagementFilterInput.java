package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelEngagementFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> addedById;
    private final Input<List<ModelEngagementFilterInput>> and;
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
    private final Input<ModelIDInput> contactId;
    private final Input<ModelIDInput> contactOwnerId;
    private final Input<ModelIDInput> contactPrimaryTeamId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> dueDateTime;
    private final Input<ModelIntInput> durationInMillis;
    private final Input<ModelEngagementStatusInput> engagementStatus;
    private final Input<ModelEngagementTypeInput> engagementType;
    private final Input<ModelStringInput> externalNumber;
    private final Input<ModelIDInput> id;
    private final Input<ModelBooleanInput> isManualTask;
    private final Input<ModelStringInput> meetingCode;
    private final Input<ModelStringInput> meetingName;
    private final Input<ModelStringInput> nextFollowUpOn;
    private final Input<ModelStringInput> nextFollowUpSetBy;
    private final Input<ModelIDInput> nextStepTaskId;
    private final Input<ModelEngagementFilterInput> not;
    private final Input<ModelNoteAdditionMethodInput> noteAdditionMethod;
    private final Input<ModelStringInput> noteHeading;
    private final Input<List<ModelEngagementFilterInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> parentEngagementId;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelStringInput> reminderDateTime;
    private final Input<ModelBooleanInput> syncStatus;
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
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<ModelStringInput> callRecordingUrl = Input.absent();
        private Input<ModelStringInput> callTranscriptUrl = Input.absent();
        private Input<ModelStringInput> callTranscriptSummary = Input.absent();
        private Input<ModelStringInput> voiceNoteUrl = Input.absent();
        private Input<ModelStringInput> uploadedFiledUrl = Input.absent();
        private Input<ModelStringInput> visitTime = Input.absent();
        private Input<ModelStringInput> visitNote = Input.absent();
        private Input<ModelStringInput> visitOutcome = Input.absent();
        private Input<ModelStringInput> visitOutcomeNature = Input.absent();
        private Input<ModelStringInput> videoCallPlatform = Input.absent();
        private Input<ModelStringInput> videoCallLink = Input.absent();
        private Input<ModelStringInput> meetingName = Input.absent();
        private Input<ModelStringInput> meetingCode = Input.absent();
        private Input<ModelStringInput> videoCallMetadata = Input.absent();
        private Input<ModelStringInput> videoCallOutcome = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelEngagementFilterInput>> and = Input.absent();
        private Input<List<ModelEngagementFilterInput>> or = Input.absent();
        private Input<ModelEngagementFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder addedById(ModelIDInput modelIDInput) {
            this.addedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelEngagementFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder body(ModelStringInput modelStringInput) {
            this.body = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelEngagementFilterInput build() {
            return new ModelEngagementFilterInput(this.id, this.accountId, this.engagementType, this.contactId, this.primaryTeamId, this.toBeAssigned, this.ownerId, this.contactPrimaryTeamId, this.contactOwnerId, this.addedById, this.updatedById, this.engagementStatus, this.callStatus, this.parentEngagementId, this.nextStepTaskId, this.syncStatus, this.externalNumber, this.userNumber, this.callDirection, this.callConnectStatus, this.callStartTime, this.callEndTime, this.durationInMillis, this.callOutcome, this.callOutcomeNature, this.noteHeading, this.noteAdditionMethod, this.body, this.isManualTask, this.taskHeading, this.taskType, this.taskActivityType, this.taskInputNote, this.taskPriority, this.taskCompletionNote, this.taskCompletionTime, this.taskCompletionType, this.dueDateTime, this.nextFollowUpOn, this.nextFollowUpSetBy, this.reminderDateTime, this.callRecordingUrl, this.callTranscriptUrl, this.callTranscriptSummary, this.voiceNoteUrl, this.uploadedFiledUrl, this.visitTime, this.visitNote, this.visitOutcome, this.visitOutcomeNature, this.videoCallPlatform, this.videoCallLink, this.meetingName, this.meetingCode, this.videoCallMetadata, this.videoCallOutcome, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelEngagementFilterInput modelEngagementFilterInput) {
            this.not = Input.fromNullable(modelEngagementFilterInput);
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

        public Builder or(List<ModelEngagementFilterInput> list) {
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

    public ModelEngagementFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelEngagementTypeInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelContactAssignmentStatusInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelIDInput> input11, Input<ModelEngagementStatusInput> input12, Input<ModelStringInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<ModelBooleanInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelCallDirectionInput> input19, Input<ModelCallConnectStatusInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelIntInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelStringInput> input26, Input<ModelNoteAdditionMethodInput> input27, Input<ModelStringInput> input28, Input<ModelBooleanInput> input29, Input<ModelStringInput> input30, Input<ModelStringInput> input31, Input<ModelTaskActivityTypeInput> input32, Input<ModelStringInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<ModelStringInput> input36, Input<ModelStringInput> input37, Input<ModelStringInput> input38, Input<ModelStringInput> input39, Input<ModelStringInput> input40, Input<ModelStringInput> input41, Input<ModelStringInput> input42, Input<ModelStringInput> input43, Input<ModelStringInput> input44, Input<ModelStringInput> input45, Input<ModelStringInput> input46, Input<ModelStringInput> input47, Input<ModelStringInput> input48, Input<ModelStringInput> input49, Input<ModelStringInput> input50, Input<ModelStringInput> input51, Input<ModelStringInput> input52, Input<ModelStringInput> input53, Input<ModelStringInput> input54, Input<ModelStringInput> input55, Input<ModelStringInput> input56, Input<ModelStringInput> input57, Input<ModelStringInput> input58, Input<List<ModelEngagementFilterInput>> input59, Input<List<ModelEngagementFilterInput>> input60, Input<ModelEngagementFilterInput> input61) {
        this.id = input;
        this.accountId = input2;
        this.engagementType = input3;
        this.contactId = input4;
        this.primaryTeamId = input5;
        this.toBeAssigned = input6;
        this.ownerId = input7;
        this.contactPrimaryTeamId = input8;
        this.contactOwnerId = input9;
        this.addedById = input10;
        this.updatedById = input11;
        this.engagementStatus = input12;
        this.callStatus = input13;
        this.parentEngagementId = input14;
        this.nextStepTaskId = input15;
        this.syncStatus = input16;
        this.externalNumber = input17;
        this.userNumber = input18;
        this.callDirection = input19;
        this.callConnectStatus = input20;
        this.callStartTime = input21;
        this.callEndTime = input22;
        this.durationInMillis = input23;
        this.callOutcome = input24;
        this.callOutcomeNature = input25;
        this.noteHeading = input26;
        this.noteAdditionMethod = input27;
        this.body = input28;
        this.isManualTask = input29;
        this.taskHeading = input30;
        this.taskType = input31;
        this.taskActivityType = input32;
        this.taskInputNote = input33;
        this.taskPriority = input34;
        this.taskCompletionNote = input35;
        this.taskCompletionTime = input36;
        this.taskCompletionType = input37;
        this.dueDateTime = input38;
        this.nextFollowUpOn = input39;
        this.nextFollowUpSetBy = input40;
        this.reminderDateTime = input41;
        this.callRecordingUrl = input42;
        this.callTranscriptUrl = input43;
        this.callTranscriptSummary = input44;
        this.voiceNoteUrl = input45;
        this.uploadedFiledUrl = input46;
        this.visitTime = input47;
        this.visitNote = input48;
        this.visitOutcome = input49;
        this.visitOutcomeNature = input50;
        this.videoCallPlatform = input51;
        this.videoCallLink = input52;
        this.meetingName = input53;
        this.meetingCode = input54;
        this.videoCallMetadata = input55;
        this.videoCallOutcome = input56;
        this.createdAt = input57;
        this.updatedAt = input58;
        this.and = input59;
        this.or = input60;
        this.not = input61;
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

    public List<ModelEngagementFilterInput> and() {
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

    public ModelEngagementStatusInput engagementStatus() {
        return this.engagementStatus.value;
    }

    public ModelEngagementTypeInput engagementType() {
        return this.engagementType.value;
    }

    public ModelStringInput externalNumber() {
        return this.externalNumber.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelBooleanInput isManualTask() {
        return this.isManualTask.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEngagementFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEngagementFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelEngagementFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelEngagementFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelEngagementFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelEngagementFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.engagementType.defined) {
                    inputFieldWriter.writeObject("engagementType", ModelEngagementFilterInput.this.engagementType.value != 0 ? ((ModelEngagementTypeInput) ModelEngagementFilterInput.this.engagementType.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelEngagementFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelEngagementFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelEngagementFilterInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelEngagementFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeObject("toBeAssigned", ModelEngagementFilterInput.this.toBeAssigned.value != 0 ? ((ModelContactAssignmentStatusInput) ModelEngagementFilterInput.this.toBeAssigned.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelEngagementFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelEngagementFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.contactPrimaryTeamId.defined) {
                    inputFieldWriter.writeObject("contactPrimaryTeamId", ModelEngagementFilterInput.this.contactPrimaryTeamId.value != 0 ? ((ModelIDInput) ModelEngagementFilterInput.this.contactPrimaryTeamId.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.contactOwnerId.defined) {
                    inputFieldWriter.writeObject("contactOwnerId", ModelEngagementFilterInput.this.contactOwnerId.value != 0 ? ((ModelIDInput) ModelEngagementFilterInput.this.contactOwnerId.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", ModelEngagementFilterInput.this.addedById.value != 0 ? ((ModelIDInput) ModelEngagementFilterInput.this.addedById.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelEngagementFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelEngagementFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.engagementStatus.defined) {
                    inputFieldWriter.writeObject("engagementStatus", ModelEngagementFilterInput.this.engagementStatus.value != 0 ? ((ModelEngagementStatusInput) ModelEngagementFilterInput.this.engagementStatus.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.callStatus.defined) {
                    inputFieldWriter.writeObject("callStatus", ModelEngagementFilterInput.this.callStatus.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.callStatus.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.parentEngagementId.defined) {
                    inputFieldWriter.writeObject("parentEngagementId", ModelEngagementFilterInput.this.parentEngagementId.value != 0 ? ((ModelIDInput) ModelEngagementFilterInput.this.parentEngagementId.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.nextStepTaskId.defined) {
                    inputFieldWriter.writeObject("nextStepTaskId", ModelEngagementFilterInput.this.nextStepTaskId.value != 0 ? ((ModelIDInput) ModelEngagementFilterInput.this.nextStepTaskId.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.syncStatus.defined) {
                    inputFieldWriter.writeObject("syncStatus", ModelEngagementFilterInput.this.syncStatus.value != 0 ? ((ModelBooleanInput) ModelEngagementFilterInput.this.syncStatus.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.externalNumber.defined) {
                    inputFieldWriter.writeObject("externalNumber", ModelEngagementFilterInput.this.externalNumber.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.externalNumber.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.userNumber.defined) {
                    inputFieldWriter.writeObject("userNumber", ModelEngagementFilterInput.this.userNumber.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.userNumber.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.callDirection.defined) {
                    inputFieldWriter.writeObject("callDirection", ModelEngagementFilterInput.this.callDirection.value != 0 ? ((ModelCallDirectionInput) ModelEngagementFilterInput.this.callDirection.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.callConnectStatus.defined) {
                    inputFieldWriter.writeObject("callConnectStatus", ModelEngagementFilterInput.this.callConnectStatus.value != 0 ? ((ModelCallConnectStatusInput) ModelEngagementFilterInput.this.callConnectStatus.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.callStartTime.defined) {
                    inputFieldWriter.writeObject("callStartTime", ModelEngagementFilterInput.this.callStartTime.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.callStartTime.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.callEndTime.defined) {
                    inputFieldWriter.writeObject("callEndTime", ModelEngagementFilterInput.this.callEndTime.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.callEndTime.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.durationInMillis.defined) {
                    inputFieldWriter.writeObject("durationInMillis", ModelEngagementFilterInput.this.durationInMillis.value != 0 ? ((ModelIntInput) ModelEngagementFilterInput.this.durationInMillis.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.callOutcome.defined) {
                    inputFieldWriter.writeObject("callOutcome", ModelEngagementFilterInput.this.callOutcome.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.callOutcome.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.callOutcomeNature.defined) {
                    inputFieldWriter.writeObject("callOutcomeNature", ModelEngagementFilterInput.this.callOutcomeNature.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.callOutcomeNature.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.noteHeading.defined) {
                    inputFieldWriter.writeObject("noteHeading", ModelEngagementFilterInput.this.noteHeading.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.noteHeading.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.noteAdditionMethod.defined) {
                    inputFieldWriter.writeObject("noteAdditionMethod", ModelEngagementFilterInput.this.noteAdditionMethod.value != 0 ? ((ModelNoteAdditionMethodInput) ModelEngagementFilterInput.this.noteAdditionMethod.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.body.defined) {
                    inputFieldWriter.writeObject("body", ModelEngagementFilterInput.this.body.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.body.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.isManualTask.defined) {
                    inputFieldWriter.writeObject("isManualTask", ModelEngagementFilterInput.this.isManualTask.value != 0 ? ((ModelBooleanInput) ModelEngagementFilterInput.this.isManualTask.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.taskHeading.defined) {
                    inputFieldWriter.writeObject("taskHeading", ModelEngagementFilterInput.this.taskHeading.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.taskHeading.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.taskType.defined) {
                    inputFieldWriter.writeObject("taskType", ModelEngagementFilterInput.this.taskType.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.taskType.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.taskActivityType.defined) {
                    inputFieldWriter.writeObject("taskActivityType", ModelEngagementFilterInput.this.taskActivityType.value != 0 ? ((ModelTaskActivityTypeInput) ModelEngagementFilterInput.this.taskActivityType.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.taskInputNote.defined) {
                    inputFieldWriter.writeObject("taskInputNote", ModelEngagementFilterInput.this.taskInputNote.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.taskInputNote.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.taskPriority.defined) {
                    inputFieldWriter.writeObject("taskPriority", ModelEngagementFilterInput.this.taskPriority.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.taskPriority.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.taskCompletionNote.defined) {
                    inputFieldWriter.writeObject("taskCompletionNote", ModelEngagementFilterInput.this.taskCompletionNote.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.taskCompletionNote.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.taskCompletionTime.defined) {
                    inputFieldWriter.writeObject("taskCompletionTime", ModelEngagementFilterInput.this.taskCompletionTime.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.taskCompletionTime.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.taskCompletionType.defined) {
                    inputFieldWriter.writeObject("taskCompletionType", ModelEngagementFilterInput.this.taskCompletionType.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.taskCompletionType.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.dueDateTime.defined) {
                    inputFieldWriter.writeObject("dueDateTime", ModelEngagementFilterInput.this.dueDateTime.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.dueDateTime.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.nextFollowUpOn.defined) {
                    inputFieldWriter.writeObject("nextFollowUpOn", ModelEngagementFilterInput.this.nextFollowUpOn.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.nextFollowUpOn.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.nextFollowUpSetBy.defined) {
                    inputFieldWriter.writeObject("nextFollowUpSetBy", ModelEngagementFilterInput.this.nextFollowUpSetBy.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.nextFollowUpSetBy.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.reminderDateTime.defined) {
                    inputFieldWriter.writeObject("reminderDateTime", ModelEngagementFilterInput.this.reminderDateTime.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.reminderDateTime.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.callRecordingUrl.defined) {
                    inputFieldWriter.writeObject("callRecordingUrl", ModelEngagementFilterInput.this.callRecordingUrl.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.callRecordingUrl.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.callTranscriptUrl.defined) {
                    inputFieldWriter.writeObject("callTranscriptUrl", ModelEngagementFilterInput.this.callTranscriptUrl.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.callTranscriptUrl.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.callTranscriptSummary.defined) {
                    inputFieldWriter.writeObject("callTranscriptSummary", ModelEngagementFilterInput.this.callTranscriptSummary.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.callTranscriptSummary.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.voiceNoteUrl.defined) {
                    inputFieldWriter.writeObject("voiceNoteUrl", ModelEngagementFilterInput.this.voiceNoteUrl.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.voiceNoteUrl.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.uploadedFiledUrl.defined) {
                    inputFieldWriter.writeObject("uploadedFiledUrl", ModelEngagementFilterInput.this.uploadedFiledUrl.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.uploadedFiledUrl.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.visitTime.defined) {
                    inputFieldWriter.writeObject("visitTime", ModelEngagementFilterInput.this.visitTime.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.visitTime.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.visitNote.defined) {
                    inputFieldWriter.writeObject("visitNote", ModelEngagementFilterInput.this.visitNote.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.visitNote.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.visitOutcome.defined) {
                    inputFieldWriter.writeObject("visitOutcome", ModelEngagementFilterInput.this.visitOutcome.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.visitOutcome.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.visitOutcomeNature.defined) {
                    inputFieldWriter.writeObject("visitOutcomeNature", ModelEngagementFilterInput.this.visitOutcomeNature.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.visitOutcomeNature.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.videoCallPlatform.defined) {
                    inputFieldWriter.writeObject("videoCallPlatform", ModelEngagementFilterInput.this.videoCallPlatform.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.videoCallPlatform.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.videoCallLink.defined) {
                    inputFieldWriter.writeObject("videoCallLink", ModelEngagementFilterInput.this.videoCallLink.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.videoCallLink.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.meetingName.defined) {
                    inputFieldWriter.writeObject("meetingName", ModelEngagementFilterInput.this.meetingName.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.meetingName.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.meetingCode.defined) {
                    inputFieldWriter.writeObject("meetingCode", ModelEngagementFilterInput.this.meetingCode.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.meetingCode.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.videoCallMetadata.defined) {
                    inputFieldWriter.writeObject("videoCallMetadata", ModelEngagementFilterInput.this.videoCallMetadata.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.videoCallMetadata.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.videoCallOutcome.defined) {
                    inputFieldWriter.writeObject("videoCallOutcome", ModelEngagementFilterInput.this.videoCallOutcome.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.videoCallOutcome.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelEngagementFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelEngagementFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelEngagementFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelEngagementFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelEngagementFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEngagementFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEngagementFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEngagementFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEngagementFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelEngagementFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelEngagementFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelEngagementFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelEngagementFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelEngagementFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelEngagementFilterInput.this.not.value != 0 ? ((ModelEngagementFilterInput) ModelEngagementFilterInput.this.not.value).marshaller() : null);
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

    public ModelEngagementFilterInput not() {
        return this.not.value;
    }

    public ModelNoteAdditionMethodInput noteAdditionMethod() {
        return this.noteAdditionMethod.value;
    }

    public ModelStringInput noteHeading() {
        return this.noteHeading.value;
    }

    public List<ModelEngagementFilterInput> or() {
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
