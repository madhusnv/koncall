package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableEngagementFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<SearchableIDFilterInput> addedById;
    private final Input<List<SearchableEngagementFilterInput>> and;
    private final Input<SearchableStringFilterInput> body;
    private final Input<SearchableStringFilterInput> callConnectStatus;
    private final Input<SearchableStringFilterInput> callDirection;
    private final Input<SearchableStringFilterInput> callEndTime;
    private final Input<SearchableStringFilterInput> callOutcome;
    private final Input<SearchableStringFilterInput> callOutcomeNature;
    private final Input<SearchableStringFilterInput> callRecordingUrl;
    private final Input<SearchableStringFilterInput> callStartTime;
    private final Input<SearchableStringFilterInput> callStatus;
    private final Input<SearchableStringFilterInput> callTranscriptSummary;
    private final Input<SearchableStringFilterInput> callTranscriptUrl;
    private final Input<SearchableStringFilterInput> callType;
    private final Input<SearchableIDFilterInput> campaignId;
    private final Input<SearchableStringFilterInput> campaignRun;
    private final Input<SearchableStringFilterInput> cloudProvider;
    private final Input<SearchableStringFilterInput> cloudProviderNumber;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableIDFilterInput> contactOwnerId;
    private final Input<SearchableIDFilterInput> contactPrimaryTeamId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> dueDateTime;
    private final Input<SearchableIntFilterInput> durationInMillis;
    private final Input<SearchableStringFilterInput> engagementSource;
    private final Input<SearchableStringFilterInput> engagementSourceLevelTwo;
    private final Input<SearchableStringFilterInput> engagementSourceType;
    private final Input<SearchableStringFilterInput> engagementStatus;
    private final Input<SearchableStringFilterInput> engagementType;
    private final Input<SearchableStringFilterInput> externalNumber;
    private final Input<SearchableStringFilterInput> firstTaskEngagementActionOn;
    private final Input<SearchableStringFilterInput> hangupReason;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableBooleanFilterInput> isManualTask;
    private final Input<SearchableStringFilterInput> meetingCode;
    private final Input<SearchableStringFilterInput> meetingName;
    private final Input<SearchableStringFilterInput> nextFollowUpOn;
    private final Input<SearchableStringFilterInput> nextFollowUpSetBy;
    private final Input<SearchableIDFilterInputWithExists> nextStepTaskId;
    private final Input<SearchableEngagementFilterInput> not;
    private final Input<SearchableStringFilterInput> noteAdditionMethod;
    private final Input<SearchableStringFilterInput> noteHeading;
    private final Input<List<SearchableEngagementFilterInput>> or;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableIDFilterInput> parentEngagementId;
    private final Input<SearchableStringFilterInput> phoneCallLogId;
    private final Input<SearchableIDFilterInput> primaryTeamId;
    private final Input<SearchableStringFilterInput> reminderDateTime;
    private final Input<SearchableBooleanFilterInput> syncStatus;
    private final Input<SearchableStringFilterInput> systemAction;
    private final Input<SearchableStringFilterInput> taskActivityType;
    private final Input<SearchableStringFilterInput> taskCompletionNote;
    private final Input<SearchableStringFilterInput> taskCompletionTime;
    private final Input<SearchableStringFilterInput> taskCompletionType;
    private final Input<SearchableIntFilterInput> taskEngagementActionCount;
    private final Input<SearchableStringFilterInput> taskEngagementActionsUpdatedAt;
    private final Input<SearchableStringFilterInput> taskHeading;
    private final Input<SearchableStringFilterInput> taskInputNote;
    private final Input<SearchableStringFilterInput> taskPriority;
    private final Input<SearchableStringFilterInput> taskType;
    private final Input<SearchableStringFilterInput> toBeAssigned;
    private final Input<SearchableIntFilterInput> totalCallDuration;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> updatedById;
    private final Input<SearchableStringFilterInput> uploadedFiledUrl;
    private final Input<SearchableStringFilterInput> userNumber;
    private final Input<SearchableStringFilterInput> videoCallLink;
    private final Input<SearchableStringFilterInput> videoCallMetadata;
    private final Input<SearchableStringFilterInput> videoCallOutcome;
    private final Input<SearchableStringFilterInput> videoCallPlatform;
    private final Input<SearchableStringFilterInput> visitNote;
    private final Input<SearchableStringFilterInput> visitOutcome;
    private final Input<SearchableStringFilterInput> visitOutcomeNature;
    private final Input<SearchableStringFilterInput> visitTime;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> engagementType = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableIDFilterInput> primaryTeamId = Input.absent();
        private Input<SearchableStringFilterInput> toBeAssigned = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableIDFilterInput> contactPrimaryTeamId = Input.absent();
        private Input<SearchableIDFilterInput> contactOwnerId = Input.absent();
        private Input<SearchableIDFilterInput> addedById = Input.absent();
        private Input<SearchableIDFilterInput> updatedById = Input.absent();
        private Input<SearchableStringFilterInput> engagementStatus = Input.absent();
        private Input<SearchableStringFilterInput> callStatus = Input.absent();
        private Input<SearchableIDFilterInput> parentEngagementId = Input.absent();
        private Input<SearchableIDFilterInputWithExists> nextStepTaskId = Input.absent();
        private Input<SearchableBooleanFilterInput> syncStatus = Input.absent();
        private Input<SearchableStringFilterInput> externalNumber = Input.absent();
        private Input<SearchableStringFilterInput> userNumber = Input.absent();
        private Input<SearchableStringFilterInput> callDirection = Input.absent();
        private Input<SearchableStringFilterInput> callConnectStatus = Input.absent();
        private Input<SearchableStringFilterInput> callStartTime = Input.absent();
        private Input<SearchableStringFilterInput> callEndTime = Input.absent();
        private Input<SearchableIntFilterInput> durationInMillis = Input.absent();
        private Input<SearchableStringFilterInput> callOutcome = Input.absent();
        private Input<SearchableStringFilterInput> callOutcomeNature = Input.absent();
        private Input<SearchableStringFilterInput> noteHeading = Input.absent();
        private Input<SearchableStringFilterInput> noteAdditionMethod = Input.absent();
        private Input<SearchableStringFilterInput> body = Input.absent();
        private Input<SearchableBooleanFilterInput> isManualTask = Input.absent();
        private Input<SearchableStringFilterInput> taskHeading = Input.absent();
        private Input<SearchableStringFilterInput> taskType = Input.absent();
        private Input<SearchableStringFilterInput> taskActivityType = Input.absent();
        private Input<SearchableStringFilterInput> taskInputNote = Input.absent();
        private Input<SearchableStringFilterInput> taskPriority = Input.absent();
        private Input<SearchableStringFilterInput> taskCompletionNote = Input.absent();
        private Input<SearchableStringFilterInput> taskCompletionTime = Input.absent();
        private Input<SearchableStringFilterInput> taskCompletionType = Input.absent();
        private Input<SearchableStringFilterInput> dueDateTime = Input.absent();
        private Input<SearchableStringFilterInput> nextFollowUpOn = Input.absent();
        private Input<SearchableStringFilterInput> nextFollowUpSetBy = Input.absent();
        private Input<SearchableStringFilterInput> reminderDateTime = Input.absent();
        private Input<SearchableStringFilterInput> callRecordingUrl = Input.absent();
        private Input<SearchableStringFilterInput> callTranscriptUrl = Input.absent();
        private Input<SearchableStringFilterInput> callTranscriptSummary = Input.absent();
        private Input<SearchableStringFilterInput> uploadedFiledUrl = Input.absent();
        private Input<SearchableStringFilterInput> visitTime = Input.absent();
        private Input<SearchableStringFilterInput> visitNote = Input.absent();
        private Input<SearchableStringFilterInput> visitOutcome = Input.absent();
        private Input<SearchableStringFilterInput> visitOutcomeNature = Input.absent();
        private Input<SearchableStringFilterInput> videoCallPlatform = Input.absent();
        private Input<SearchableStringFilterInput> videoCallLink = Input.absent();
        private Input<SearchableStringFilterInput> meetingName = Input.absent();
        private Input<SearchableStringFilterInput> meetingCode = Input.absent();
        private Input<SearchableStringFilterInput> videoCallMetadata = Input.absent();
        private Input<SearchableStringFilterInput> videoCallOutcome = Input.absent();
        private Input<SearchableIDFilterInput> campaignId = Input.absent();
        private Input<SearchableStringFilterInput> campaignRun = Input.absent();
        private Input<SearchableStringFilterInput> engagementSourceType = Input.absent();
        private Input<SearchableStringFilterInput> engagementSource = Input.absent();
        private Input<SearchableStringFilterInput> engagementSourceLevelTwo = Input.absent();
        private Input<SearchableStringFilterInput> systemAction = Input.absent();
        private Input<SearchableStringFilterInput> firstTaskEngagementActionOn = Input.absent();
        private Input<SearchableIntFilterInput> taskEngagementActionCount = Input.absent();
        private Input<SearchableStringFilterInput> taskEngagementActionsUpdatedAt = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<SearchableIntFilterInput> totalCallDuration = Input.absent();
        private Input<SearchableStringFilterInput> cloudProviderNumber = Input.absent();
        private Input<SearchableStringFilterInput> hangupReason = Input.absent();
        private Input<SearchableStringFilterInput> cloudProvider = Input.absent();
        private Input<SearchableStringFilterInput> callType = Input.absent();
        private Input<SearchableStringFilterInput> phoneCallLogId = Input.absent();
        private Input<List<SearchableEngagementFilterInput>> and = Input.absent();
        private Input<List<SearchableEngagementFilterInput>> or = Input.absent();
        private Input<SearchableEngagementFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder addedById(SearchableIDFilterInput searchableIDFilterInput) {
            this.addedById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableEngagementFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder body(SearchableStringFilterInput searchableStringFilterInput) {
            this.body = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public SearchableEngagementFilterInput build() {
            return new SearchableEngagementFilterInput(this.id, this.accountId, this.engagementType, this.contactId, this.primaryTeamId, this.toBeAssigned, this.ownerId, this.contactPrimaryTeamId, this.contactOwnerId, this.addedById, this.updatedById, this.engagementStatus, this.callStatus, this.parentEngagementId, this.nextStepTaskId, this.syncStatus, this.externalNumber, this.userNumber, this.callDirection, this.callConnectStatus, this.callStartTime, this.callEndTime, this.durationInMillis, this.callOutcome, this.callOutcomeNature, this.noteHeading, this.noteAdditionMethod, this.body, this.isManualTask, this.taskHeading, this.taskType, this.taskActivityType, this.taskInputNote, this.taskPriority, this.taskCompletionNote, this.taskCompletionTime, this.taskCompletionType, this.dueDateTime, this.nextFollowUpOn, this.nextFollowUpSetBy, this.reminderDateTime, this.callRecordingUrl, this.callTranscriptUrl, this.callTranscriptSummary, this.uploadedFiledUrl, this.visitTime, this.visitNote, this.visitOutcome, this.visitOutcomeNature, this.videoCallPlatform, this.videoCallLink, this.meetingName, this.meetingCode, this.videoCallMetadata, this.videoCallOutcome, this.campaignId, this.campaignRun, this.engagementSourceType, this.engagementSource, this.engagementSourceLevelTwo, this.systemAction, this.firstTaskEngagementActionOn, this.taskEngagementActionCount, this.taskEngagementActionsUpdatedAt, this.createdAt, this.updatedAt, this.totalCallDuration, this.cloudProviderNumber, this.hangupReason, this.cloudProvider, this.callType, this.phoneCallLogId, this.and, this.or, this.not);
        }

        public Builder callConnectStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.callConnectStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder callDirection(SearchableStringFilterInput searchableStringFilterInput) {
            this.callDirection = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder callEndTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.callEndTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder callOutcome(SearchableStringFilterInput searchableStringFilterInput) {
            this.callOutcome = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder callOutcomeNature(SearchableStringFilterInput searchableStringFilterInput) {
            this.callOutcomeNature = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder callRecordingUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.callRecordingUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder callStartTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.callStartTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder callStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.callStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder callTranscriptSummary(SearchableStringFilterInput searchableStringFilterInput) {
            this.callTranscriptSummary = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder callTranscriptUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.callTranscriptUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder callType(SearchableStringFilterInput searchableStringFilterInput) {
            this.callType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder campaignId(SearchableIDFilterInput searchableIDFilterInput) {
            this.campaignId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder campaignRun(SearchableStringFilterInput searchableStringFilterInput) {
            this.campaignRun = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder cloudProvider(SearchableStringFilterInput searchableStringFilterInput) {
            this.cloudProvider = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder cloudProviderNumber(SearchableStringFilterInput searchableStringFilterInput) {
            this.cloudProviderNumber = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder contactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder contactOwnerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactOwnerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder contactPrimaryTeamId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactPrimaryTeamId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder dueDateTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.dueDateTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder durationInMillis(SearchableIntFilterInput searchableIntFilterInput) {
            this.durationInMillis = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder engagementSource(SearchableStringFilterInput searchableStringFilterInput) {
            this.engagementSource = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder engagementSourceLevelTwo(SearchableStringFilterInput searchableStringFilterInput) {
            this.engagementSourceLevelTwo = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder engagementSourceType(SearchableStringFilterInput searchableStringFilterInput) {
            this.engagementSourceType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder engagementStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.engagementStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder engagementType(SearchableStringFilterInput searchableStringFilterInput) {
            this.engagementType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder externalNumber(SearchableStringFilterInput searchableStringFilterInput) {
            this.externalNumber = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder firstTaskEngagementActionOn(SearchableStringFilterInput searchableStringFilterInput) {
            this.firstTaskEngagementActionOn = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder hangupReason(SearchableStringFilterInput searchableStringFilterInput) {
            this.hangupReason = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder isManualTask(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isManualTask = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder meetingCode(SearchableStringFilterInput searchableStringFilterInput) {
            this.meetingCode = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder meetingName(SearchableStringFilterInput searchableStringFilterInput) {
            this.meetingName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder nextFollowUpOn(SearchableStringFilterInput searchableStringFilterInput) {
            this.nextFollowUpOn = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder nextFollowUpSetBy(SearchableStringFilterInput searchableStringFilterInput) {
            this.nextFollowUpSetBy = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder nextStepTaskId(SearchableIDFilterInputWithExists searchableIDFilterInputWithExists) {
            this.nextStepTaskId = Input.fromNullable(searchableIDFilterInputWithExists);
            return this;
        }

        public Builder not(SearchableEngagementFilterInput searchableEngagementFilterInput) {
            this.not = Input.fromNullable(searchableEngagementFilterInput);
            return this;
        }

        public Builder noteAdditionMethod(SearchableStringFilterInput searchableStringFilterInput) {
            this.noteAdditionMethod = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder noteHeading(SearchableStringFilterInput searchableStringFilterInput) {
            this.noteHeading = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder or(List<SearchableEngagementFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.ownerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder parentEngagementId(SearchableIDFilterInput searchableIDFilterInput) {
            this.parentEngagementId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder phoneCallLogId(SearchableStringFilterInput searchableStringFilterInput) {
            this.phoneCallLogId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder primaryTeamId(SearchableIDFilterInput searchableIDFilterInput) {
            this.primaryTeamId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder reminderDateTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.reminderDateTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder syncStatus(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.syncStatus = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder systemAction(SearchableStringFilterInput searchableStringFilterInput) {
            this.systemAction = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taskActivityType(SearchableStringFilterInput searchableStringFilterInput) {
            this.taskActivityType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taskCompletionNote(SearchableStringFilterInput searchableStringFilterInput) {
            this.taskCompletionNote = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taskCompletionTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.taskCompletionTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taskCompletionType(SearchableStringFilterInput searchableStringFilterInput) {
            this.taskCompletionType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taskEngagementActionCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.taskEngagementActionCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder taskEngagementActionsUpdatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.taskEngagementActionsUpdatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taskHeading(SearchableStringFilterInput searchableStringFilterInput) {
            this.taskHeading = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taskInputNote(SearchableStringFilterInput searchableStringFilterInput) {
            this.taskInputNote = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taskPriority(SearchableStringFilterInput searchableStringFilterInput) {
            this.taskPriority = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder taskType(SearchableStringFilterInput searchableStringFilterInput) {
            this.taskType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder toBeAssigned(SearchableStringFilterInput searchableStringFilterInput) {
            this.toBeAssigned = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder totalCallDuration(SearchableIntFilterInput searchableIntFilterInput) {
            this.totalCallDuration = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedById(SearchableIDFilterInput searchableIDFilterInput) {
            this.updatedById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder uploadedFiledUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.uploadedFiledUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder userNumber(SearchableStringFilterInput searchableStringFilterInput) {
            this.userNumber = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder videoCallLink(SearchableStringFilterInput searchableStringFilterInput) {
            this.videoCallLink = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder videoCallMetadata(SearchableStringFilterInput searchableStringFilterInput) {
            this.videoCallMetadata = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder videoCallOutcome(SearchableStringFilterInput searchableStringFilterInput) {
            this.videoCallOutcome = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder videoCallPlatform(SearchableStringFilterInput searchableStringFilterInput) {
            this.videoCallPlatform = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder visitNote(SearchableStringFilterInput searchableStringFilterInput) {
            this.visitNote = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder visitOutcome(SearchableStringFilterInput searchableStringFilterInput) {
            this.visitOutcome = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder visitOutcomeNature(SearchableStringFilterInput searchableStringFilterInput) {
            this.visitOutcomeNature = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder visitTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.visitTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableEngagementFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableIDFilterInput> input4, Input<SearchableIDFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableIDFilterInput> input8, Input<SearchableIDFilterInput> input9, Input<SearchableIDFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableIDFilterInput> input14, Input<SearchableIDFilterInputWithExists> input15, Input<SearchableBooleanFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<SearchableIntFilterInput> input23, Input<SearchableStringFilterInput> input24, Input<SearchableStringFilterInput> input25, Input<SearchableStringFilterInput> input26, Input<SearchableStringFilterInput> input27, Input<SearchableStringFilterInput> input28, Input<SearchableBooleanFilterInput> input29, Input<SearchableStringFilterInput> input30, Input<SearchableStringFilterInput> input31, Input<SearchableStringFilterInput> input32, Input<SearchableStringFilterInput> input33, Input<SearchableStringFilterInput> input34, Input<SearchableStringFilterInput> input35, Input<SearchableStringFilterInput> input36, Input<SearchableStringFilterInput> input37, Input<SearchableStringFilterInput> input38, Input<SearchableStringFilterInput> input39, Input<SearchableStringFilterInput> input40, Input<SearchableStringFilterInput> input41, Input<SearchableStringFilterInput> input42, Input<SearchableStringFilterInput> input43, Input<SearchableStringFilterInput> input44, Input<SearchableStringFilterInput> input45, Input<SearchableStringFilterInput> input46, Input<SearchableStringFilterInput> input47, Input<SearchableStringFilterInput> input48, Input<SearchableStringFilterInput> input49, Input<SearchableStringFilterInput> input50, Input<SearchableStringFilterInput> input51, Input<SearchableStringFilterInput> input52, Input<SearchableStringFilterInput> input53, Input<SearchableStringFilterInput> input54, Input<SearchableStringFilterInput> input55, Input<SearchableIDFilterInput> input56, Input<SearchableStringFilterInput> input57, Input<SearchableStringFilterInput> input58, Input<SearchableStringFilterInput> input59, Input<SearchableStringFilterInput> input60, Input<SearchableStringFilterInput> input61, Input<SearchableStringFilterInput> input62, Input<SearchableIntFilterInput> input63, Input<SearchableStringFilterInput> input64, Input<SearchableStringFilterInput> input65, Input<SearchableStringFilterInput> input66, Input<SearchableIntFilterInput> input67, Input<SearchableStringFilterInput> input68, Input<SearchableStringFilterInput> input69, Input<SearchableStringFilterInput> input70, Input<SearchableStringFilterInput> input71, Input<SearchableStringFilterInput> input72, Input<List<SearchableEngagementFilterInput>> input73, Input<List<SearchableEngagementFilterInput>> input74, Input<SearchableEngagementFilterInput> input75) {
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
        this.uploadedFiledUrl = input45;
        this.visitTime = input46;
        this.visitNote = input47;
        this.visitOutcome = input48;
        this.visitOutcomeNature = input49;
        this.videoCallPlatform = input50;
        this.videoCallLink = input51;
        this.meetingName = input52;
        this.meetingCode = input53;
        this.videoCallMetadata = input54;
        this.videoCallOutcome = input55;
        this.campaignId = input56;
        this.campaignRun = input57;
        this.engagementSourceType = input58;
        this.engagementSource = input59;
        this.engagementSourceLevelTwo = input60;
        this.systemAction = input61;
        this.firstTaskEngagementActionOn = input62;
        this.taskEngagementActionCount = input63;
        this.taskEngagementActionsUpdatedAt = input64;
        this.createdAt = input65;
        this.updatedAt = input66;
        this.totalCallDuration = input67;
        this.cloudProviderNumber = input68;
        this.hangupReason = input69;
        this.cloudProvider = input70;
        this.callType = input71;
        this.phoneCallLogId = input72;
        this.and = input73;
        this.or = input74;
        this.not = input75;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public SearchableIDFilterInput addedById() {
        return this.addedById.value;
    }

    public List<SearchableEngagementFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput body() {
        return this.body.value;
    }

    public SearchableStringFilterInput callConnectStatus() {
        return this.callConnectStatus.value;
    }

    public SearchableStringFilterInput callDirection() {
        return this.callDirection.value;
    }

    public SearchableStringFilterInput callEndTime() {
        return this.callEndTime.value;
    }

    public SearchableStringFilterInput callOutcome() {
        return this.callOutcome.value;
    }

    public SearchableStringFilterInput callOutcomeNature() {
        return this.callOutcomeNature.value;
    }

    public SearchableStringFilterInput callRecordingUrl() {
        return this.callRecordingUrl.value;
    }

    public SearchableStringFilterInput callStartTime() {
        return this.callStartTime.value;
    }

    public SearchableStringFilterInput callStatus() {
        return this.callStatus.value;
    }

    public SearchableStringFilterInput callTranscriptSummary() {
        return this.callTranscriptSummary.value;
    }

    public SearchableStringFilterInput callTranscriptUrl() {
        return this.callTranscriptUrl.value;
    }

    public SearchableStringFilterInput callType() {
        return this.callType.value;
    }

    public SearchableIDFilterInput campaignId() {
        return this.campaignId.value;
    }

    public SearchableStringFilterInput campaignRun() {
        return this.campaignRun.value;
    }

    public SearchableStringFilterInput cloudProvider() {
        return this.cloudProvider.value;
    }

    public SearchableStringFilterInput cloudProviderNumber() {
        return this.cloudProviderNumber.value;
    }

    public SearchableIDFilterInput contactId() {
        return this.contactId.value;
    }

    public SearchableIDFilterInput contactOwnerId() {
        return this.contactOwnerId.value;
    }

    public SearchableIDFilterInput contactPrimaryTeamId() {
        return this.contactPrimaryTeamId.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableStringFilterInput dueDateTime() {
        return this.dueDateTime.value;
    }

    public SearchableIntFilterInput durationInMillis() {
        return this.durationInMillis.value;
    }

    public SearchableStringFilterInput engagementSource() {
        return this.engagementSource.value;
    }

    public SearchableStringFilterInput engagementSourceLevelTwo() {
        return this.engagementSourceLevelTwo.value;
    }

    public SearchableStringFilterInput engagementSourceType() {
        return this.engagementSourceType.value;
    }

    public SearchableStringFilterInput engagementStatus() {
        return this.engagementStatus.value;
    }

    public SearchableStringFilterInput engagementType() {
        return this.engagementType.value;
    }

    public SearchableStringFilterInput externalNumber() {
        return this.externalNumber.value;
    }

    public SearchableStringFilterInput firstTaskEngagementActionOn() {
        return this.firstTaskEngagementActionOn.value;
    }

    public SearchableStringFilterInput hangupReason() {
        return this.hangupReason.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableBooleanFilterInput isManualTask() {
        return this.isManualTask.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableEngagementFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableEngagementFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableEngagementFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableEngagementFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableEngagementFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableEngagementFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.engagementType.defined) {
                    inputFieldWriter.writeObject("engagementType", SearchableEngagementFilterInput.this.engagementType.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.engagementType.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchableEngagementFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchableEngagementFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", SearchableEngagementFilterInput.this.primaryTeamId.value != 0 ? ((SearchableIDFilterInput) SearchableEngagementFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeObject("toBeAssigned", SearchableEngagementFilterInput.this.toBeAssigned.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.toBeAssigned.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableEngagementFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableEngagementFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.contactPrimaryTeamId.defined) {
                    inputFieldWriter.writeObject("contactPrimaryTeamId", SearchableEngagementFilterInput.this.contactPrimaryTeamId.value != 0 ? ((SearchableIDFilterInput) SearchableEngagementFilterInput.this.contactPrimaryTeamId.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.contactOwnerId.defined) {
                    inputFieldWriter.writeObject("contactOwnerId", SearchableEngagementFilterInput.this.contactOwnerId.value != 0 ? ((SearchableIDFilterInput) SearchableEngagementFilterInput.this.contactOwnerId.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", SearchableEngagementFilterInput.this.addedById.value != 0 ? ((SearchableIDFilterInput) SearchableEngagementFilterInput.this.addedById.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", SearchableEngagementFilterInput.this.updatedById.value != 0 ? ((SearchableIDFilterInput) SearchableEngagementFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.engagementStatus.defined) {
                    inputFieldWriter.writeObject("engagementStatus", SearchableEngagementFilterInput.this.engagementStatus.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.engagementStatus.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.callStatus.defined) {
                    inputFieldWriter.writeObject("callStatus", SearchableEngagementFilterInput.this.callStatus.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.callStatus.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.parentEngagementId.defined) {
                    inputFieldWriter.writeObject("parentEngagementId", SearchableEngagementFilterInput.this.parentEngagementId.value != 0 ? ((SearchableIDFilterInput) SearchableEngagementFilterInput.this.parentEngagementId.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.nextStepTaskId.defined) {
                    inputFieldWriter.writeObject("nextStepTaskId", SearchableEngagementFilterInput.this.nextStepTaskId.value != 0 ? ((SearchableIDFilterInputWithExists) SearchableEngagementFilterInput.this.nextStepTaskId.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.syncStatus.defined) {
                    inputFieldWriter.writeObject("syncStatus", SearchableEngagementFilterInput.this.syncStatus.value != 0 ? ((SearchableBooleanFilterInput) SearchableEngagementFilterInput.this.syncStatus.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.externalNumber.defined) {
                    inputFieldWriter.writeObject("externalNumber", SearchableEngagementFilterInput.this.externalNumber.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.externalNumber.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.userNumber.defined) {
                    inputFieldWriter.writeObject("userNumber", SearchableEngagementFilterInput.this.userNumber.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.userNumber.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.callDirection.defined) {
                    inputFieldWriter.writeObject("callDirection", SearchableEngagementFilterInput.this.callDirection.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.callDirection.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.callConnectStatus.defined) {
                    inputFieldWriter.writeObject("callConnectStatus", SearchableEngagementFilterInput.this.callConnectStatus.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.callConnectStatus.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.callStartTime.defined) {
                    inputFieldWriter.writeObject("callStartTime", SearchableEngagementFilterInput.this.callStartTime.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.callStartTime.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.callEndTime.defined) {
                    inputFieldWriter.writeObject("callEndTime", SearchableEngagementFilterInput.this.callEndTime.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.callEndTime.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.durationInMillis.defined) {
                    inputFieldWriter.writeObject("durationInMillis", SearchableEngagementFilterInput.this.durationInMillis.value != 0 ? ((SearchableIntFilterInput) SearchableEngagementFilterInput.this.durationInMillis.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.callOutcome.defined) {
                    inputFieldWriter.writeObject("callOutcome", SearchableEngagementFilterInput.this.callOutcome.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.callOutcome.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.callOutcomeNature.defined) {
                    inputFieldWriter.writeObject("callOutcomeNature", SearchableEngagementFilterInput.this.callOutcomeNature.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.callOutcomeNature.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.noteHeading.defined) {
                    inputFieldWriter.writeObject("noteHeading", SearchableEngagementFilterInput.this.noteHeading.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.noteHeading.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.noteAdditionMethod.defined) {
                    inputFieldWriter.writeObject("noteAdditionMethod", SearchableEngagementFilterInput.this.noteAdditionMethod.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.noteAdditionMethod.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.body.defined) {
                    inputFieldWriter.writeObject("body", SearchableEngagementFilterInput.this.body.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.body.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.isManualTask.defined) {
                    inputFieldWriter.writeObject("isManualTask", SearchableEngagementFilterInput.this.isManualTask.value != 0 ? ((SearchableBooleanFilterInput) SearchableEngagementFilterInput.this.isManualTask.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.taskHeading.defined) {
                    inputFieldWriter.writeObject("taskHeading", SearchableEngagementFilterInput.this.taskHeading.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.taskHeading.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.taskType.defined) {
                    inputFieldWriter.writeObject("taskType", SearchableEngagementFilterInput.this.taskType.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.taskType.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.taskActivityType.defined) {
                    inputFieldWriter.writeObject("taskActivityType", SearchableEngagementFilterInput.this.taskActivityType.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.taskActivityType.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.taskInputNote.defined) {
                    inputFieldWriter.writeObject("taskInputNote", SearchableEngagementFilterInput.this.taskInputNote.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.taskInputNote.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.taskPriority.defined) {
                    inputFieldWriter.writeObject("taskPriority", SearchableEngagementFilterInput.this.taskPriority.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.taskPriority.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.taskCompletionNote.defined) {
                    inputFieldWriter.writeObject("taskCompletionNote", SearchableEngagementFilterInput.this.taskCompletionNote.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.taskCompletionNote.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.taskCompletionTime.defined) {
                    inputFieldWriter.writeObject("taskCompletionTime", SearchableEngagementFilterInput.this.taskCompletionTime.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.taskCompletionTime.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.taskCompletionType.defined) {
                    inputFieldWriter.writeObject("taskCompletionType", SearchableEngagementFilterInput.this.taskCompletionType.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.taskCompletionType.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.dueDateTime.defined) {
                    inputFieldWriter.writeObject("dueDateTime", SearchableEngagementFilterInput.this.dueDateTime.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.dueDateTime.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.nextFollowUpOn.defined) {
                    inputFieldWriter.writeObject("nextFollowUpOn", SearchableEngagementFilterInput.this.nextFollowUpOn.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.nextFollowUpOn.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.nextFollowUpSetBy.defined) {
                    inputFieldWriter.writeObject("nextFollowUpSetBy", SearchableEngagementFilterInput.this.nextFollowUpSetBy.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.nextFollowUpSetBy.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.reminderDateTime.defined) {
                    inputFieldWriter.writeObject("reminderDateTime", SearchableEngagementFilterInput.this.reminderDateTime.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.reminderDateTime.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.callRecordingUrl.defined) {
                    inputFieldWriter.writeObject("callRecordingUrl", SearchableEngagementFilterInput.this.callRecordingUrl.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.callRecordingUrl.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.callTranscriptUrl.defined) {
                    inputFieldWriter.writeObject("callTranscriptUrl", SearchableEngagementFilterInput.this.callTranscriptUrl.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.callTranscriptUrl.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.callTranscriptSummary.defined) {
                    inputFieldWriter.writeObject("callTranscriptSummary", SearchableEngagementFilterInput.this.callTranscriptSummary.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.callTranscriptSummary.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.uploadedFiledUrl.defined) {
                    inputFieldWriter.writeObject("uploadedFiledUrl", SearchableEngagementFilterInput.this.uploadedFiledUrl.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.uploadedFiledUrl.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.visitTime.defined) {
                    inputFieldWriter.writeObject("visitTime", SearchableEngagementFilterInput.this.visitTime.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.visitTime.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.visitNote.defined) {
                    inputFieldWriter.writeObject("visitNote", SearchableEngagementFilterInput.this.visitNote.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.visitNote.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.visitOutcome.defined) {
                    inputFieldWriter.writeObject("visitOutcome", SearchableEngagementFilterInput.this.visitOutcome.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.visitOutcome.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.visitOutcomeNature.defined) {
                    inputFieldWriter.writeObject("visitOutcomeNature", SearchableEngagementFilterInput.this.visitOutcomeNature.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.visitOutcomeNature.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.videoCallPlatform.defined) {
                    inputFieldWriter.writeObject("videoCallPlatform", SearchableEngagementFilterInput.this.videoCallPlatform.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.videoCallPlatform.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.videoCallLink.defined) {
                    inputFieldWriter.writeObject("videoCallLink", SearchableEngagementFilterInput.this.videoCallLink.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.videoCallLink.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.meetingName.defined) {
                    inputFieldWriter.writeObject("meetingName", SearchableEngagementFilterInput.this.meetingName.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.meetingName.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.meetingCode.defined) {
                    inputFieldWriter.writeObject("meetingCode", SearchableEngagementFilterInput.this.meetingCode.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.meetingCode.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.videoCallMetadata.defined) {
                    inputFieldWriter.writeObject("videoCallMetadata", SearchableEngagementFilterInput.this.videoCallMetadata.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.videoCallMetadata.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.videoCallOutcome.defined) {
                    inputFieldWriter.writeObject("videoCallOutcome", SearchableEngagementFilterInput.this.videoCallOutcome.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.videoCallOutcome.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.campaignId.defined) {
                    inputFieldWriter.writeObject("campaignId", SearchableEngagementFilterInput.this.campaignId.value != 0 ? ((SearchableIDFilterInput) SearchableEngagementFilterInput.this.campaignId.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.campaignRun.defined) {
                    inputFieldWriter.writeObject("campaignRun", SearchableEngagementFilterInput.this.campaignRun.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.campaignRun.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.engagementSourceType.defined) {
                    inputFieldWriter.writeObject("engagementSourceType", SearchableEngagementFilterInput.this.engagementSourceType.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.engagementSourceType.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.engagementSource.defined) {
                    inputFieldWriter.writeObject("engagementSource", SearchableEngagementFilterInput.this.engagementSource.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.engagementSource.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.engagementSourceLevelTwo.defined) {
                    inputFieldWriter.writeObject("engagementSourceLevelTwo", SearchableEngagementFilterInput.this.engagementSourceLevelTwo.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.engagementSourceLevelTwo.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.systemAction.defined) {
                    inputFieldWriter.writeObject("systemAction", SearchableEngagementFilterInput.this.systemAction.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.systemAction.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.firstTaskEngagementActionOn.defined) {
                    inputFieldWriter.writeObject("firstTaskEngagementActionOn", SearchableEngagementFilterInput.this.firstTaskEngagementActionOn.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.firstTaskEngagementActionOn.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.taskEngagementActionCount.defined) {
                    inputFieldWriter.writeObject("taskEngagementActionCount", SearchableEngagementFilterInput.this.taskEngagementActionCount.value != 0 ? ((SearchableIntFilterInput) SearchableEngagementFilterInput.this.taskEngagementActionCount.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.taskEngagementActionsUpdatedAt.defined) {
                    inputFieldWriter.writeObject("taskEngagementActionsUpdatedAt", SearchableEngagementFilterInput.this.taskEngagementActionsUpdatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.taskEngagementActionsUpdatedAt.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableEngagementFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableEngagementFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.totalCallDuration.defined) {
                    inputFieldWriter.writeObject("totalCallDuration", SearchableEngagementFilterInput.this.totalCallDuration.value != 0 ? ((SearchableIntFilterInput) SearchableEngagementFilterInput.this.totalCallDuration.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.cloudProviderNumber.defined) {
                    inputFieldWriter.writeObject("cloudProviderNumber", SearchableEngagementFilterInput.this.cloudProviderNumber.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.cloudProviderNumber.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.hangupReason.defined) {
                    inputFieldWriter.writeObject("hangupReason", SearchableEngagementFilterInput.this.hangupReason.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.hangupReason.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.cloudProvider.defined) {
                    inputFieldWriter.writeObject("cloudProvider", SearchableEngagementFilterInput.this.cloudProvider.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.cloudProvider.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.callType.defined) {
                    inputFieldWriter.writeObject("callType", SearchableEngagementFilterInput.this.callType.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.callType.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.phoneCallLogId.defined) {
                    inputFieldWriter.writeObject("phoneCallLogId", SearchableEngagementFilterInput.this.phoneCallLogId.value != 0 ? ((SearchableStringFilterInput) SearchableEngagementFilterInput.this.phoneCallLogId.value).marshaller() : null);
                }
                if (SearchableEngagementFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableEngagementFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableEngagementFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableEngagementFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableEngagementFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableEngagementFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableEngagementFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableEngagementFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableEngagementFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableEngagementFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableEngagementFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableEngagementFilterInput.this.not.value != 0 ? ((SearchableEngagementFilterInput) SearchableEngagementFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput meetingCode() {
        return this.meetingCode.value;
    }

    public SearchableStringFilterInput meetingName() {
        return this.meetingName.value;
    }

    public SearchableStringFilterInput nextFollowUpOn() {
        return this.nextFollowUpOn.value;
    }

    public SearchableStringFilterInput nextFollowUpSetBy() {
        return this.nextFollowUpSetBy.value;
    }

    public SearchableIDFilterInputWithExists nextStepTaskId() {
        return this.nextStepTaskId.value;
    }

    public SearchableEngagementFilterInput not() {
        return this.not.value;
    }

    public SearchableStringFilterInput noteAdditionMethod() {
        return this.noteAdditionMethod.value;
    }

    public SearchableStringFilterInput noteHeading() {
        return this.noteHeading.value;
    }

    public List<SearchableEngagementFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput ownerId() {
        return this.ownerId.value;
    }

    public SearchableIDFilterInput parentEngagementId() {
        return this.parentEngagementId.value;
    }

    public SearchableStringFilterInput phoneCallLogId() {
        return this.phoneCallLogId.value;
    }

    public SearchableIDFilterInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public SearchableStringFilterInput reminderDateTime() {
        return this.reminderDateTime.value;
    }

    public SearchableBooleanFilterInput syncStatus() {
        return this.syncStatus.value;
    }

    public SearchableStringFilterInput systemAction() {
        return this.systemAction.value;
    }

    public SearchableStringFilterInput taskActivityType() {
        return this.taskActivityType.value;
    }

    public SearchableStringFilterInput taskCompletionNote() {
        return this.taskCompletionNote.value;
    }

    public SearchableStringFilterInput taskCompletionTime() {
        return this.taskCompletionTime.value;
    }

    public SearchableStringFilterInput taskCompletionType() {
        return this.taskCompletionType.value;
    }

    public SearchableIntFilterInput taskEngagementActionCount() {
        return this.taskEngagementActionCount.value;
    }

    public SearchableStringFilterInput taskEngagementActionsUpdatedAt() {
        return this.taskEngagementActionsUpdatedAt.value;
    }

    public SearchableStringFilterInput taskHeading() {
        return this.taskHeading.value;
    }

    public SearchableStringFilterInput taskInputNote() {
        return this.taskInputNote.value;
    }

    public SearchableStringFilterInput taskPriority() {
        return this.taskPriority.value;
    }

    public SearchableStringFilterInput taskType() {
        return this.taskType.value;
    }

    public SearchableStringFilterInput toBeAssigned() {
        return this.toBeAssigned.value;
    }

    public SearchableIntFilterInput totalCallDuration() {
        return this.totalCallDuration.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput updatedById() {
        return this.updatedById.value;
    }

    public SearchableStringFilterInput uploadedFiledUrl() {
        return this.uploadedFiledUrl.value;
    }

    public SearchableStringFilterInput userNumber() {
        return this.userNumber.value;
    }

    public SearchableStringFilterInput videoCallLink() {
        return this.videoCallLink.value;
    }

    public SearchableStringFilterInput videoCallMetadata() {
        return this.videoCallMetadata.value;
    }

    public SearchableStringFilterInput videoCallOutcome() {
        return this.videoCallOutcome.value;
    }

    public SearchableStringFilterInput videoCallPlatform() {
        return this.videoCallPlatform.value;
    }

    public SearchableStringFilterInput visitNote() {
        return this.visitNote.value;
    }

    public SearchableStringFilterInput visitOutcome() {
        return this.visitOutcome.value;
    }

    public SearchableStringFilterInput visitOutcomeNature() {
        return this.visitOutcomeNature.value;
    }

    public SearchableStringFilterInput visitTime() {
        return this.visitTime.value;
    }
}
