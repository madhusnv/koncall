package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelContactConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> accountPriority;
    private final Input<ModelStringInput> activeDealStage;
    private final Input<ModelStringInput> activeDealStageUpdatedAt;
    private final Input<ModelIDInput> addedById;
    private final Input<List<ModelContactConditionInput>> and;
    private final Input<ModelIDInput> assignedToId;
    private final Input<ModelStringInput> assignmentMethod;
    private final Input<ModelStringInput> becameCustomerOn;
    private final Input<ModelIDInput> blockedForCallById;
    private final Input<ModelStringInput> blockedForCallReason;
    private final Input<ModelStringInput> blockedForCallUntil;
    private final Input<ModelStringInput> bulkUploadReference;
    private final Input<ModelStringInput> callPriority;
    private final Input<ModelStringInput> contactSource;
    private final Input<ModelStringInput> contactSourceDrillDownOne;
    private final Input<ModelIDInput> contactSourceDrillDownOneId;
    private final Input<ModelStringInput> contactSourceDrillDownThree;
    private final Input<ModelIDInput> contactSourceDrillDownThreeId;
    private final Input<ModelStringInput> contactSourceDrillDownTwo;
    private final Input<ModelIDInput> contactSourceDrillDownTwoId;
    private final Input<ModelContactStatusInput> contactStatus;
    private final Input<ModelStringInput> contactType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> dealDescription;
    private final Input<ModelStringInput> department;
    private final Input<ModelStringInput> designation;
    private final Input<ModelStringInput> freshLeadTag;
    private final Input<ModelStringInput> gender;
    private final Input<ModelBooleanInput> hasTask;
    private final Input<ModelStringInput> isCustomer;
    private final Input<ModelBooleanInput> isDecisionMaker;
    private final Input<ModelBooleanInput> isPrivate;
    private final Input<ModelCallDirectionInput> lastCallDirection;
    private final Input<ModelIntInput> lastCallDuration;
    private final Input<ModelStringInput> lastCallEngagementId;
    private final Input<ModelStringInput> lastCallOutcome;
    private final Input<ModelStringInput> lastCallOutcomeNature;
    private final Input<ModelIDInput> lastCallUserId;
    private final Input<ModelStringInput> lastCalledTime;
    private final Input<ModelStringInput> lastEmailEngagementId;
    private final Input<ModelStringInput> lastEmailTime;
    private final Input<ModelIDInput> lastEmailUserId;
    private final Input<ModelStringInput> lastEngagementFromAccount;
    private final Input<ModelStringInput> lastEngagementFromContact;
    private final Input<ModelStringInput> lastKnownDisposition;
    private final Input<ModelStringInput> lastKnownDispositionTime;
    private final Input<ModelStringInput> lastLeadAssignmentDateTime;
    private final Input<ModelStringInput> lastNoteAddedTime;
    private final Input<ModelIDInput> lastNoteUserId;
    private final Input<ModelStringInput> lastRepeatEnquiryDate;
    private final Input<ModelStringInput> lastRepeatEnquirySource;
    private final Input<ModelIDInput> lastSmsEngagementId;
    private final Input<ModelStringInput> lastSmsTime;
    private final Input<ModelIDInput> lastSmsUserId;
    private final Input<ModelStringInput> lastTaskDoneEngagementId;
    private final Input<ModelStringInput> lastTaskDoneTime;
    private final Input<ModelIDInput> lastTaskDoneUserId;
    private final Input<ModelStringInput> lastVisitEngagementId;
    private final Input<ModelStringInput> lastVisitOutcome;
    private final Input<ModelStringInput> lastVisitOutcomeNature;
    private final Input<ModelStringInput> lastVisitTime;
    private final Input<ModelIDInput> lastVisitUserId;
    private final Input<ModelStringInput> lastWabaBroadcastReplyBody;
    private final Input<ModelStringInput> lastWabaBroadcastReplyTime;
    private final Input<ModelStringInput> lastWabaBroadcastReplyType;
    private final Input<ModelStringInput> lastWabaBroadcastStatus;
    private final Input<ModelStringInput> lastWabaBroadcastTemplate;
    private final Input<ModelStringInput> lastWabaBroadcastTime;
    private final Input<ModelIDInput> lastWhatsappEngagementId;
    private final Input<ModelStringInput> lastWhatsappTime;
    private final Input<ModelIDInput> lastWhatsappUserId;
    private final Input<ModelIntInput> leadCallsNotAnswered;
    private final Input<ModelStringInput> lockPeriod;
    private final Input<ModelStringInput> name;
    private final Input<ModelStringInput> needFollowUpTag;
    private final Input<ModelStringInput> needFollowUpTagUpdatedAt;
    private final Input<ModelStringInput> noWorkAfterAssignment;
    private final Input<ModelContactConditionInput> not;
    private final Input<ModelTaskActivityTypeInput> openTaskActivityType;
    private final Input<ModelIntInput> openTaskCount;
    private final Input<List<ModelContactConditionInput>> or;
    private final Input<ModelDayListInput> preferredContactDays;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelStringInput> productService;
    private final Input<ModelStringInput> profilePhotoUrl;
    private final Input<ModelStringInput> referredBy;
    private final Input<ModelStringInput> salutation;
    private final Input<ModelSeniorityInput> seniority;
    private final Input<ModelIDInput> sharedOwners;
    private final Input<ModelIDInput> sharedTeams;
    private final Input<ModelContactAssignmentStatusInput> toBeAssigned;
    private final Input<ModelIntInput> unsuccessfulCallAttempts;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelStringInput> userDefinedTags;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelContactAssignmentStatusInput> toBeAssigned = Input.absent();
        private Input<ModelIDInput> sharedOwners = Input.absent();
        private Input<ModelIDInput> primaryTeamId = Input.absent();
        private Input<ModelIDInput> sharedTeams = Input.absent();
        private Input<ModelStringInput> accountPriority = Input.absent();
        private Input<ModelIDInput> addedById = Input.absent();
        private Input<ModelIDInput> assignedToId = Input.absent();
        private Input<ModelIDInput> blockedForCallById = Input.absent();
        private Input<ModelStringInput> blockedForCallReason = Input.absent();
        private Input<ModelStringInput> blockedForCallUntil = Input.absent();
        private Input<ModelStringInput> callPriority = Input.absent();
        private Input<ModelStringInput> contactSource = Input.absent();
        private Input<ModelStringInput> contactSourceDrillDownOne = Input.absent();
        private Input<ModelStringInput> contactSourceDrillDownTwo = Input.absent();
        private Input<ModelStringInput> contactSourceDrillDownThree = Input.absent();
        private Input<ModelIDInput> contactSourceDrillDownOneId = Input.absent();
        private Input<ModelIDInput> contactSourceDrillDownTwoId = Input.absent();
        private Input<ModelIDInput> contactSourceDrillDownThreeId = Input.absent();
        private Input<ModelContactStatusInput> contactStatus = Input.absent();
        private Input<ModelStringInput> contactType = Input.absent();
        private Input<ModelStringInput> department = Input.absent();
        private Input<ModelStringInput> designation = Input.absent();
        private Input<ModelStringInput> lastRepeatEnquiryDate = Input.absent();
        private Input<ModelStringInput> lastRepeatEnquirySource = Input.absent();
        private Input<ModelStringInput> gender = Input.absent();
        private Input<ModelBooleanInput> isDecisionMaker = Input.absent();
        private Input<ModelBooleanInput> isPrivate = Input.absent();
        private Input<ModelStringInput> lockPeriod = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelDayListInput> preferredContactDays = Input.absent();
        private Input<ModelStringInput> profilePhotoUrl = Input.absent();
        private Input<ModelStringInput> referredBy = Input.absent();
        private Input<ModelStringInput> salutation = Input.absent();
        private Input<ModelSeniorityInput> seniority = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelBooleanInput> hasTask = Input.absent();
        private Input<ModelTaskActivityTypeInput> openTaskActivityType = Input.absent();
        private Input<ModelStringInput> lastCalledTime = Input.absent();
        private Input<ModelCallDirectionInput> lastCallDirection = Input.absent();
        private Input<ModelStringInput> lastCallOutcome = Input.absent();
        private Input<ModelStringInput> lastCallOutcomeNature = Input.absent();
        private Input<ModelIDInput> lastCallUserId = Input.absent();
        private Input<ModelIntInput> lastCallDuration = Input.absent();
        private Input<ModelStringInput> lastVisitTime = Input.absent();
        private Input<ModelStringInput> lastVisitOutcome = Input.absent();
        private Input<ModelStringInput> lastVisitOutcomeNature = Input.absent();
        private Input<ModelIDInput> lastVisitUserId = Input.absent();
        private Input<ModelStringInput> lastEmailTime = Input.absent();
        private Input<ModelIDInput> lastEmailUserId = Input.absent();
        private Input<ModelStringInput> lastKnownDisposition = Input.absent();
        private Input<ModelStringInput> lastEngagementFromAccount = Input.absent();
        private Input<ModelStringInput> lastEngagementFromContact = Input.absent();
        private Input<ModelStringInput> freshLeadTag = Input.absent();
        private Input<ModelStringInput> noWorkAfterAssignment = Input.absent();
        private Input<ModelStringInput> needFollowUpTag = Input.absent();
        private Input<ModelStringInput> needFollowUpTagUpdatedAt = Input.absent();
        private Input<ModelStringInput> activeDealStage = Input.absent();
        private Input<ModelStringInput> activeDealStageUpdatedAt = Input.absent();
        private Input<ModelStringInput> dealDescription = Input.absent();
        private Input<ModelStringInput> isCustomer = Input.absent();
        private Input<ModelStringInput> becameCustomerOn = Input.absent();
        private Input<ModelIntInput> unsuccessfulCallAttempts = Input.absent();
        private Input<ModelIntInput> leadCallsNotAnswered = Input.absent();
        private Input<ModelStringInput> lastCallEngagementId = Input.absent();
        private Input<ModelStringInput> lastVisitEngagementId = Input.absent();
        private Input<ModelStringInput> lastEmailEngagementId = Input.absent();
        private Input<ModelStringInput> lastWhatsappTime = Input.absent();
        private Input<ModelIDInput> lastWhatsappUserId = Input.absent();
        private Input<ModelIDInput> lastWhatsappEngagementId = Input.absent();
        private Input<ModelStringInput> lastWabaBroadcastTime = Input.absent();
        private Input<ModelStringInput> lastWabaBroadcastStatus = Input.absent();
        private Input<ModelStringInput> lastWabaBroadcastTemplate = Input.absent();
        private Input<ModelStringInput> lastWabaBroadcastReplyBody = Input.absent();
        private Input<ModelStringInput> lastWabaBroadcastReplyTime = Input.absent();
        private Input<ModelStringInput> lastWabaBroadcastReplyType = Input.absent();
        private Input<ModelStringInput> lastSmsTime = Input.absent();
        private Input<ModelIDInput> lastSmsUserId = Input.absent();
        private Input<ModelIDInput> lastSmsEngagementId = Input.absent();
        private Input<ModelStringInput> lastNoteAddedTime = Input.absent();
        private Input<ModelIDInput> lastNoteUserId = Input.absent();
        private Input<ModelStringInput> lastTaskDoneTime = Input.absent();
        private Input<ModelIDInput> lastTaskDoneUserId = Input.absent();
        private Input<ModelStringInput> lastTaskDoneEngagementId = Input.absent();
        private Input<ModelIntInput> openTaskCount = Input.absent();
        private Input<ModelStringInput> lastKnownDispositionTime = Input.absent();
        private Input<ModelStringInput> lastLeadAssignmentDateTime = Input.absent();
        private Input<ModelStringInput> userDefinedTags = Input.absent();
        private Input<ModelStringInput> productService = Input.absent();
        private Input<ModelStringInput> bulkUploadReference = Input.absent();
        private Input<ModelStringInput> assignmentMethod = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelContactConditionInput>> and = Input.absent();
        private Input<List<ModelContactConditionInput>> or = Input.absent();
        private Input<ModelContactConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder accountPriority(ModelStringInput modelStringInput) {
            this.accountPriority = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder activeDealStage(ModelStringInput modelStringInput) {
            this.activeDealStage = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder activeDealStageUpdatedAt(ModelStringInput modelStringInput) {
            this.activeDealStageUpdatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder addedById(ModelIDInput modelIDInput) {
            this.addedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelContactConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder assignedToId(ModelIDInput modelIDInput) {
            this.assignedToId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder assignmentMethod(ModelStringInput modelStringInput) {
            this.assignmentMethod = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder becameCustomerOn(ModelStringInput modelStringInput) {
            this.becameCustomerOn = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder blockedForCallById(ModelIDInput modelIDInput) {
            this.blockedForCallById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder blockedForCallReason(ModelStringInput modelStringInput) {
            this.blockedForCallReason = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder blockedForCallUntil(ModelStringInput modelStringInput) {
            this.blockedForCallUntil = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelContactConditionInput build() {
            return new ModelContactConditionInput(this.accountId, this.toBeAssigned, this.sharedOwners, this.primaryTeamId, this.sharedTeams, this.accountPriority, this.addedById, this.assignedToId, this.blockedForCallById, this.blockedForCallReason, this.blockedForCallUntil, this.callPriority, this.contactSource, this.contactSourceDrillDownOne, this.contactSourceDrillDownTwo, this.contactSourceDrillDownThree, this.contactSourceDrillDownOneId, this.contactSourceDrillDownTwoId, this.contactSourceDrillDownThreeId, this.contactStatus, this.contactType, this.department, this.designation, this.lastRepeatEnquiryDate, this.lastRepeatEnquirySource, this.gender, this.isDecisionMaker, this.isPrivate, this.lockPeriod, this.name, this.preferredContactDays, this.profilePhotoUrl, this.referredBy, this.salutation, this.seniority, this.updatedById, this.hasTask, this.openTaskActivityType, this.lastCalledTime, this.lastCallDirection, this.lastCallOutcome, this.lastCallOutcomeNature, this.lastCallUserId, this.lastCallDuration, this.lastVisitTime, this.lastVisitOutcome, this.lastVisitOutcomeNature, this.lastVisitUserId, this.lastEmailTime, this.lastEmailUserId, this.lastKnownDisposition, this.lastEngagementFromAccount, this.lastEngagementFromContact, this.freshLeadTag, this.noWorkAfterAssignment, this.needFollowUpTag, this.needFollowUpTagUpdatedAt, this.activeDealStage, this.activeDealStageUpdatedAt, this.dealDescription, this.isCustomer, this.becameCustomerOn, this.unsuccessfulCallAttempts, this.leadCallsNotAnswered, this.lastCallEngagementId, this.lastVisitEngagementId, this.lastEmailEngagementId, this.lastWhatsappTime, this.lastWhatsappUserId, this.lastWhatsappEngagementId, this.lastWabaBroadcastTime, this.lastWabaBroadcastStatus, this.lastWabaBroadcastTemplate, this.lastWabaBroadcastReplyBody, this.lastWabaBroadcastReplyTime, this.lastWabaBroadcastReplyType, this.lastSmsTime, this.lastSmsUserId, this.lastSmsEngagementId, this.lastNoteAddedTime, this.lastNoteUserId, this.lastTaskDoneTime, this.lastTaskDoneUserId, this.lastTaskDoneEngagementId, this.openTaskCount, this.lastKnownDispositionTime, this.lastLeadAssignmentDateTime, this.userDefinedTags, this.productService, this.bulkUploadReference, this.assignmentMethod, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder bulkUploadReference(ModelStringInput modelStringInput) {
            this.bulkUploadReference = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callPriority(ModelStringInput modelStringInput) {
            this.callPriority = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder contactSource(ModelStringInput modelStringInput) {
            this.contactSource = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder contactSourceDrillDownOne(ModelStringInput modelStringInput) {
            this.contactSourceDrillDownOne = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder contactSourceDrillDownOneId(ModelIDInput modelIDInput) {
            this.contactSourceDrillDownOneId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactSourceDrillDownThree(ModelStringInput modelStringInput) {
            this.contactSourceDrillDownThree = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder contactSourceDrillDownThreeId(ModelIDInput modelIDInput) {
            this.contactSourceDrillDownThreeId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactSourceDrillDownTwo(ModelStringInput modelStringInput) {
            this.contactSourceDrillDownTwo = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder contactSourceDrillDownTwoId(ModelIDInput modelIDInput) {
            this.contactSourceDrillDownTwoId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactStatus(ModelContactStatusInput modelContactStatusInput) {
            this.contactStatus = Input.fromNullable(modelContactStatusInput);
            return this;
        }

        public Builder contactType(ModelStringInput modelStringInput) {
            this.contactType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dealDescription(ModelStringInput modelStringInput) {
            this.dealDescription = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder department(ModelStringInput modelStringInput) {
            this.department = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder designation(ModelStringInput modelStringInput) {
            this.designation = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder freshLeadTag(ModelStringInput modelStringInput) {
            this.freshLeadTag = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder gender(ModelStringInput modelStringInput) {
            this.gender = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder hasTask(ModelBooleanInput modelBooleanInput) {
            this.hasTask = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isCustomer(ModelStringInput modelStringInput) {
            this.isCustomer = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder isDecisionMaker(ModelBooleanInput modelBooleanInput) {
            this.isDecisionMaker = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isPrivate(ModelBooleanInput modelBooleanInput) {
            this.isPrivate = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder lastCallDirection(ModelCallDirectionInput modelCallDirectionInput) {
            this.lastCallDirection = Input.fromNullable(modelCallDirectionInput);
            return this;
        }

        public Builder lastCallDuration(ModelIntInput modelIntInput) {
            this.lastCallDuration = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder lastCallEngagementId(ModelStringInput modelStringInput) {
            this.lastCallEngagementId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastCallOutcome(ModelStringInput modelStringInput) {
            this.lastCallOutcome = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastCallOutcomeNature(ModelStringInput modelStringInput) {
            this.lastCallOutcomeNature = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastCallUserId(ModelIDInput modelIDInput) {
            this.lastCallUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastCalledTime(ModelStringInput modelStringInput) {
            this.lastCalledTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastEmailEngagementId(ModelStringInput modelStringInput) {
            this.lastEmailEngagementId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastEmailTime(ModelStringInput modelStringInput) {
            this.lastEmailTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastEmailUserId(ModelIDInput modelIDInput) {
            this.lastEmailUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastEngagementFromAccount(ModelStringInput modelStringInput) {
            this.lastEngagementFromAccount = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastEngagementFromContact(ModelStringInput modelStringInput) {
            this.lastEngagementFromContact = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastKnownDisposition(ModelStringInput modelStringInput) {
            this.lastKnownDisposition = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastKnownDispositionTime(ModelStringInput modelStringInput) {
            this.lastKnownDispositionTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastLeadAssignmentDateTime(ModelStringInput modelStringInput) {
            this.lastLeadAssignmentDateTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastNoteAddedTime(ModelStringInput modelStringInput) {
            this.lastNoteAddedTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastNoteUserId(ModelIDInput modelIDInput) {
            this.lastNoteUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastRepeatEnquiryDate(ModelStringInput modelStringInput) {
            this.lastRepeatEnquiryDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastRepeatEnquirySource(ModelStringInput modelStringInput) {
            this.lastRepeatEnquirySource = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastSmsEngagementId(ModelIDInput modelIDInput) {
            this.lastSmsEngagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastSmsTime(ModelStringInput modelStringInput) {
            this.lastSmsTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastSmsUserId(ModelIDInput modelIDInput) {
            this.lastSmsUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastTaskDoneEngagementId(ModelStringInput modelStringInput) {
            this.lastTaskDoneEngagementId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastTaskDoneTime(ModelStringInput modelStringInput) {
            this.lastTaskDoneTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastTaskDoneUserId(ModelIDInput modelIDInput) {
            this.lastTaskDoneUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastVisitEngagementId(ModelStringInput modelStringInput) {
            this.lastVisitEngagementId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastVisitOutcome(ModelStringInput modelStringInput) {
            this.lastVisitOutcome = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastVisitOutcomeNature(ModelStringInput modelStringInput) {
            this.lastVisitOutcomeNature = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastVisitTime(ModelStringInput modelStringInput) {
            this.lastVisitTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastVisitUserId(ModelIDInput modelIDInput) {
            this.lastVisitUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastWabaBroadcastReplyBody(ModelStringInput modelStringInput) {
            this.lastWabaBroadcastReplyBody = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastWabaBroadcastReplyTime(ModelStringInput modelStringInput) {
            this.lastWabaBroadcastReplyTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastWabaBroadcastReplyType(ModelStringInput modelStringInput) {
            this.lastWabaBroadcastReplyType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastWabaBroadcastStatus(ModelStringInput modelStringInput) {
            this.lastWabaBroadcastStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastWabaBroadcastTemplate(ModelStringInput modelStringInput) {
            this.lastWabaBroadcastTemplate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastWabaBroadcastTime(ModelStringInput modelStringInput) {
            this.lastWabaBroadcastTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastWhatsappEngagementId(ModelIDInput modelIDInput) {
            this.lastWhatsappEngagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder lastWhatsappTime(ModelStringInput modelStringInput) {
            this.lastWhatsappTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastWhatsappUserId(ModelIDInput modelIDInput) {
            this.lastWhatsappUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder leadCallsNotAnswered(ModelIntInput modelIntInput) {
            this.leadCallsNotAnswered = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder lockPeriod(ModelStringInput modelStringInput) {
            this.lockPeriod = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder needFollowUpTag(ModelStringInput modelStringInput) {
            this.needFollowUpTag = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder needFollowUpTagUpdatedAt(ModelStringInput modelStringInput) {
            this.needFollowUpTagUpdatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder noWorkAfterAssignment(ModelStringInput modelStringInput) {
            this.noWorkAfterAssignment = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelContactConditionInput modelContactConditionInput) {
            this.not = Input.fromNullable(modelContactConditionInput);
            return this;
        }

        public Builder openTaskActivityType(ModelTaskActivityTypeInput modelTaskActivityTypeInput) {
            this.openTaskActivityType = Input.fromNullable(modelTaskActivityTypeInput);
            return this;
        }

        public Builder openTaskCount(ModelIntInput modelIntInput) {
            this.openTaskCount = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder or(List<ModelContactConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder preferredContactDays(ModelDayListInput modelDayListInput) {
            this.preferredContactDays = Input.fromNullable(modelDayListInput);
            return this;
        }

        public Builder primaryTeamId(ModelIDInput modelIDInput) {
            this.primaryTeamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder productService(ModelStringInput modelStringInput) {
            this.productService = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder profilePhotoUrl(ModelStringInput modelStringInput) {
            this.profilePhotoUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder referredBy(ModelStringInput modelStringInput) {
            this.referredBy = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder salutation(ModelStringInput modelStringInput) {
            this.salutation = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder seniority(ModelSeniorityInput modelSeniorityInput) {
            this.seniority = Input.fromNullable(modelSeniorityInput);
            return this;
        }

        public Builder sharedOwners(ModelIDInput modelIDInput) {
            this.sharedOwners = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder sharedTeams(ModelIDInput modelIDInput) {
            this.sharedTeams = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder toBeAssigned(ModelContactAssignmentStatusInput modelContactAssignmentStatusInput) {
            this.toBeAssigned = Input.fromNullable(modelContactAssignmentStatusInput);
            return this;
        }

        public Builder unsuccessfulCallAttempts(ModelIntInput modelIntInput) {
            this.unsuccessfulCallAttempts = Input.fromNullable(modelIntInput);
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

        public Builder userDefinedTags(ModelStringInput modelStringInput) {
            this.userDefinedTags = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelContactConditionInput(Input<ModelIDInput> input, Input<ModelContactAssignmentStatusInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelIDInput> input17, Input<ModelIDInput> input18, Input<ModelIDInput> input19, Input<ModelContactStatusInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelStringInput> input26, Input<ModelBooleanInput> input27, Input<ModelBooleanInput> input28, Input<ModelStringInput> input29, Input<ModelStringInput> input30, Input<ModelDayListInput> input31, Input<ModelStringInput> input32, Input<ModelStringInput> input33, Input<ModelStringInput> input34, Input<ModelSeniorityInput> input35, Input<ModelIDInput> input36, Input<ModelBooleanInput> input37, Input<ModelTaskActivityTypeInput> input38, Input<ModelStringInput> input39, Input<ModelCallDirectionInput> input40, Input<ModelStringInput> input41, Input<ModelStringInput> input42, Input<ModelIDInput> input43, Input<ModelIntInput> input44, Input<ModelStringInput> input45, Input<ModelStringInput> input46, Input<ModelStringInput> input47, Input<ModelIDInput> input48, Input<ModelStringInput> input49, Input<ModelIDInput> input50, Input<ModelStringInput> input51, Input<ModelStringInput> input52, Input<ModelStringInput> input53, Input<ModelStringInput> input54, Input<ModelStringInput> input55, Input<ModelStringInput> input56, Input<ModelStringInput> input57, Input<ModelStringInput> input58, Input<ModelStringInput> input59, Input<ModelStringInput> input60, Input<ModelStringInput> input61, Input<ModelStringInput> input62, Input<ModelIntInput> input63, Input<ModelIntInput> input64, Input<ModelStringInput> input65, Input<ModelStringInput> input66, Input<ModelStringInput> input67, Input<ModelStringInput> input68, Input<ModelIDInput> input69, Input<ModelIDInput> input70, Input<ModelStringInput> input71, Input<ModelStringInput> input72, Input<ModelStringInput> input73, Input<ModelStringInput> input74, Input<ModelStringInput> input75, Input<ModelStringInput> input76, Input<ModelStringInput> input77, Input<ModelIDInput> input78, Input<ModelIDInput> input79, Input<ModelStringInput> input80, Input<ModelIDInput> input81, Input<ModelStringInput> input82, Input<ModelIDInput> input83, Input<ModelStringInput> input84, Input<ModelIntInput> input85, Input<ModelStringInput> input86, Input<ModelStringInput> input87, Input<ModelStringInput> input88, Input<ModelStringInput> input89, Input<ModelStringInput> input90, Input<ModelStringInput> input91, Input<ModelStringInput> input92, Input<ModelStringInput> input93, Input<List<ModelContactConditionInput>> input94, Input<List<ModelContactConditionInput>> input95, Input<ModelContactConditionInput> input96) {
        this.accountId = input;
        this.toBeAssigned = input2;
        this.sharedOwners = input3;
        this.primaryTeamId = input4;
        this.sharedTeams = input5;
        this.accountPriority = input6;
        this.addedById = input7;
        this.assignedToId = input8;
        this.blockedForCallById = input9;
        this.blockedForCallReason = input10;
        this.blockedForCallUntil = input11;
        this.callPriority = input12;
        this.contactSource = input13;
        this.contactSourceDrillDownOne = input14;
        this.contactSourceDrillDownTwo = input15;
        this.contactSourceDrillDownThree = input16;
        this.contactSourceDrillDownOneId = input17;
        this.contactSourceDrillDownTwoId = input18;
        this.contactSourceDrillDownThreeId = input19;
        this.contactStatus = input20;
        this.contactType = input21;
        this.department = input22;
        this.designation = input23;
        this.lastRepeatEnquiryDate = input24;
        this.lastRepeatEnquirySource = input25;
        this.gender = input26;
        this.isDecisionMaker = input27;
        this.isPrivate = input28;
        this.lockPeriod = input29;
        this.name = input30;
        this.preferredContactDays = input31;
        this.profilePhotoUrl = input32;
        this.referredBy = input33;
        this.salutation = input34;
        this.seniority = input35;
        this.updatedById = input36;
        this.hasTask = input37;
        this.openTaskActivityType = input38;
        this.lastCalledTime = input39;
        this.lastCallDirection = input40;
        this.lastCallOutcome = input41;
        this.lastCallOutcomeNature = input42;
        this.lastCallUserId = input43;
        this.lastCallDuration = input44;
        this.lastVisitTime = input45;
        this.lastVisitOutcome = input46;
        this.lastVisitOutcomeNature = input47;
        this.lastVisitUserId = input48;
        this.lastEmailTime = input49;
        this.lastEmailUserId = input50;
        this.lastKnownDisposition = input51;
        this.lastEngagementFromAccount = input52;
        this.lastEngagementFromContact = input53;
        this.freshLeadTag = input54;
        this.noWorkAfterAssignment = input55;
        this.needFollowUpTag = input56;
        this.needFollowUpTagUpdatedAt = input57;
        this.activeDealStage = input58;
        this.activeDealStageUpdatedAt = input59;
        this.dealDescription = input60;
        this.isCustomer = input61;
        this.becameCustomerOn = input62;
        this.unsuccessfulCallAttempts = input63;
        this.leadCallsNotAnswered = input64;
        this.lastCallEngagementId = input65;
        this.lastVisitEngagementId = input66;
        this.lastEmailEngagementId = input67;
        this.lastWhatsappTime = input68;
        this.lastWhatsappUserId = input69;
        this.lastWhatsappEngagementId = input70;
        this.lastWabaBroadcastTime = input71;
        this.lastWabaBroadcastStatus = input72;
        this.lastWabaBroadcastTemplate = input73;
        this.lastWabaBroadcastReplyBody = input74;
        this.lastWabaBroadcastReplyTime = input75;
        this.lastWabaBroadcastReplyType = input76;
        this.lastSmsTime = input77;
        this.lastSmsUserId = input78;
        this.lastSmsEngagementId = input79;
        this.lastNoteAddedTime = input80;
        this.lastNoteUserId = input81;
        this.lastTaskDoneTime = input82;
        this.lastTaskDoneUserId = input83;
        this.lastTaskDoneEngagementId = input84;
        this.openTaskCount = input85;
        this.lastKnownDispositionTime = input86;
        this.lastLeadAssignmentDateTime = input87;
        this.userDefinedTags = input88;
        this.productService = input89;
        this.bulkUploadReference = input90;
        this.assignmentMethod = input91;
        this.createdAt = input92;
        this.updatedAt = input93;
        this.and = input94;
        this.or = input95;
        this.not = input96;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelStringInput accountPriority() {
        return this.accountPriority.value;
    }

    public ModelStringInput activeDealStage() {
        return this.activeDealStage.value;
    }

    public ModelStringInput activeDealStageUpdatedAt() {
        return this.activeDealStageUpdatedAt.value;
    }

    public ModelIDInput addedById() {
        return this.addedById.value;
    }

    public List<ModelContactConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput assignedToId() {
        return this.assignedToId.value;
    }

    public ModelStringInput assignmentMethod() {
        return this.assignmentMethod.value;
    }

    public ModelStringInput becameCustomerOn() {
        return this.becameCustomerOn.value;
    }

    public ModelIDInput blockedForCallById() {
        return this.blockedForCallById.value;
    }

    public ModelStringInput blockedForCallReason() {
        return this.blockedForCallReason.value;
    }

    public ModelStringInput blockedForCallUntil() {
        return this.blockedForCallUntil.value;
    }

    public ModelStringInput bulkUploadReference() {
        return this.bulkUploadReference.value;
    }

    public ModelStringInput callPriority() {
        return this.callPriority.value;
    }

    public ModelStringInput contactSource() {
        return this.contactSource.value;
    }

    public ModelStringInput contactSourceDrillDownOne() {
        return this.contactSourceDrillDownOne.value;
    }

    public ModelIDInput contactSourceDrillDownOneId() {
        return this.contactSourceDrillDownOneId.value;
    }

    public ModelStringInput contactSourceDrillDownThree() {
        return this.contactSourceDrillDownThree.value;
    }

    public ModelIDInput contactSourceDrillDownThreeId() {
        return this.contactSourceDrillDownThreeId.value;
    }

    public ModelStringInput contactSourceDrillDownTwo() {
        return this.contactSourceDrillDownTwo.value;
    }

    public ModelIDInput contactSourceDrillDownTwoId() {
        return this.contactSourceDrillDownTwoId.value;
    }

    public ModelContactStatusInput contactStatus() {
        return this.contactStatus.value;
    }

    public ModelStringInput contactType() {
        return this.contactType.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput dealDescription() {
        return this.dealDescription.value;
    }

    public ModelStringInput department() {
        return this.department.value;
    }

    public ModelStringInput designation() {
        return this.designation.value;
    }

    public ModelStringInput freshLeadTag() {
        return this.freshLeadTag.value;
    }

    public ModelStringInput gender() {
        return this.gender.value;
    }

    public ModelBooleanInput hasTask() {
        return this.hasTask.value;
    }

    public ModelStringInput isCustomer() {
        return this.isCustomer.value;
    }

    public ModelBooleanInput isDecisionMaker() {
        return this.isDecisionMaker.value;
    }

    public ModelBooleanInput isPrivate() {
        return this.isPrivate.value;
    }

    public ModelCallDirectionInput lastCallDirection() {
        return this.lastCallDirection.value;
    }

    public ModelIntInput lastCallDuration() {
        return this.lastCallDuration.value;
    }

    public ModelStringInput lastCallEngagementId() {
        return this.lastCallEngagementId.value;
    }

    public ModelStringInput lastCallOutcome() {
        return this.lastCallOutcome.value;
    }

    public ModelStringInput lastCallOutcomeNature() {
        return this.lastCallOutcomeNature.value;
    }

    public ModelIDInput lastCallUserId() {
        return this.lastCallUserId.value;
    }

    public ModelStringInput lastCalledTime() {
        return this.lastCalledTime.value;
    }

    public ModelStringInput lastEmailEngagementId() {
        return this.lastEmailEngagementId.value;
    }

    public ModelStringInput lastEmailTime() {
        return this.lastEmailTime.value;
    }

    public ModelIDInput lastEmailUserId() {
        return this.lastEmailUserId.value;
    }

    public ModelStringInput lastEngagementFromAccount() {
        return this.lastEngagementFromAccount.value;
    }

    public ModelStringInput lastEngagementFromContact() {
        return this.lastEngagementFromContact.value;
    }

    public ModelStringInput lastKnownDisposition() {
        return this.lastKnownDisposition.value;
    }

    public ModelStringInput lastKnownDispositionTime() {
        return this.lastKnownDispositionTime.value;
    }

    public ModelStringInput lastLeadAssignmentDateTime() {
        return this.lastLeadAssignmentDateTime.value;
    }

    public ModelStringInput lastNoteAddedTime() {
        return this.lastNoteAddedTime.value;
    }

    public ModelIDInput lastNoteUserId() {
        return this.lastNoteUserId.value;
    }

    public ModelStringInput lastRepeatEnquiryDate() {
        return this.lastRepeatEnquiryDate.value;
    }

    public ModelStringInput lastRepeatEnquirySource() {
        return this.lastRepeatEnquirySource.value;
    }

    public ModelIDInput lastSmsEngagementId() {
        return this.lastSmsEngagementId.value;
    }

    public ModelStringInput lastSmsTime() {
        return this.lastSmsTime.value;
    }

    public ModelIDInput lastSmsUserId() {
        return this.lastSmsUserId.value;
    }

    public ModelStringInput lastTaskDoneEngagementId() {
        return this.lastTaskDoneEngagementId.value;
    }

    public ModelStringInput lastTaskDoneTime() {
        return this.lastTaskDoneTime.value;
    }

    public ModelIDInput lastTaskDoneUserId() {
        return this.lastTaskDoneUserId.value;
    }

    public ModelStringInput lastVisitEngagementId() {
        return this.lastVisitEngagementId.value;
    }

    public ModelStringInput lastVisitOutcome() {
        return this.lastVisitOutcome.value;
    }

    public ModelStringInput lastVisitOutcomeNature() {
        return this.lastVisitOutcomeNature.value;
    }

    public ModelStringInput lastVisitTime() {
        return this.lastVisitTime.value;
    }

    public ModelIDInput lastVisitUserId() {
        return this.lastVisitUserId.value;
    }

    public ModelStringInput lastWabaBroadcastReplyBody() {
        return this.lastWabaBroadcastReplyBody.value;
    }

    public ModelStringInput lastWabaBroadcastReplyTime() {
        return this.lastWabaBroadcastReplyTime.value;
    }

    public ModelStringInput lastWabaBroadcastReplyType() {
        return this.lastWabaBroadcastReplyType.value;
    }

    public ModelStringInput lastWabaBroadcastStatus() {
        return this.lastWabaBroadcastStatus.value;
    }

    public ModelStringInput lastWabaBroadcastTemplate() {
        return this.lastWabaBroadcastTemplate.value;
    }

    public ModelStringInput lastWabaBroadcastTime() {
        return this.lastWabaBroadcastTime.value;
    }

    public ModelIDInput lastWhatsappEngagementId() {
        return this.lastWhatsappEngagementId.value;
    }

    public ModelStringInput lastWhatsappTime() {
        return this.lastWhatsappTime.value;
    }

    public ModelIDInput lastWhatsappUserId() {
        return this.lastWhatsappUserId.value;
    }

    public ModelIntInput leadCallsNotAnswered() {
        return this.leadCallsNotAnswered.value;
    }

    public ModelStringInput lockPeriod() {
        return this.lockPeriod.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelContactConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelContactConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelContactConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeObject("toBeAssigned", ModelContactConditionInput.this.toBeAssigned.value != 0 ? ((ModelContactAssignmentStatusInput) ModelContactConditionInput.this.toBeAssigned.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.sharedOwners.defined) {
                    inputFieldWriter.writeObject("sharedOwners", ModelContactConditionInput.this.sharedOwners.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.sharedOwners.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelContactConditionInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.sharedTeams.defined) {
                    inputFieldWriter.writeObject("sharedTeams", ModelContactConditionInput.this.sharedTeams.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.sharedTeams.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.accountPriority.defined) {
                    inputFieldWriter.writeObject("accountPriority", ModelContactConditionInput.this.accountPriority.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.accountPriority.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", ModelContactConditionInput.this.addedById.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.addedById.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.assignedToId.defined) {
                    inputFieldWriter.writeObject("assignedToId", ModelContactConditionInput.this.assignedToId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.assignedToId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.blockedForCallById.defined) {
                    inputFieldWriter.writeObject("blockedForCallById", ModelContactConditionInput.this.blockedForCallById.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.blockedForCallById.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.blockedForCallReason.defined) {
                    inputFieldWriter.writeObject("blockedForCallReason", ModelContactConditionInput.this.blockedForCallReason.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.blockedForCallReason.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.blockedForCallUntil.defined) {
                    inputFieldWriter.writeObject("blockedForCallUntil", ModelContactConditionInput.this.blockedForCallUntil.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.blockedForCallUntil.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.callPriority.defined) {
                    inputFieldWriter.writeObject("callPriority", ModelContactConditionInput.this.callPriority.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.callPriority.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.contactSource.defined) {
                    inputFieldWriter.writeObject("contactSource", ModelContactConditionInput.this.contactSource.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.contactSource.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.contactSourceDrillDownOne.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownOne", ModelContactConditionInput.this.contactSourceDrillDownOne.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.contactSourceDrillDownOne.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.contactSourceDrillDownTwo.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownTwo", ModelContactConditionInput.this.contactSourceDrillDownTwo.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.contactSourceDrillDownTwo.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.contactSourceDrillDownThree.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownThree", ModelContactConditionInput.this.contactSourceDrillDownThree.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.contactSourceDrillDownThree.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.contactSourceDrillDownOneId.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownOneId", ModelContactConditionInput.this.contactSourceDrillDownOneId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.contactSourceDrillDownOneId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.contactSourceDrillDownTwoId.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownTwoId", ModelContactConditionInput.this.contactSourceDrillDownTwoId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.contactSourceDrillDownTwoId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.contactSourceDrillDownThreeId.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownThreeId", ModelContactConditionInput.this.contactSourceDrillDownThreeId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.contactSourceDrillDownThreeId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.contactStatus.defined) {
                    inputFieldWriter.writeObject("contactStatus", ModelContactConditionInput.this.contactStatus.value != 0 ? ((ModelContactStatusInput) ModelContactConditionInput.this.contactStatus.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.contactType.defined) {
                    inputFieldWriter.writeObject("contactType", ModelContactConditionInput.this.contactType.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.contactType.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.department.defined) {
                    inputFieldWriter.writeObject("department", ModelContactConditionInput.this.department.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.department.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.designation.defined) {
                    inputFieldWriter.writeObject("designation", ModelContactConditionInput.this.designation.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.designation.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastRepeatEnquiryDate.defined) {
                    inputFieldWriter.writeObject("lastRepeatEnquiryDate", ModelContactConditionInput.this.lastRepeatEnquiryDate.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastRepeatEnquiryDate.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastRepeatEnquirySource.defined) {
                    inputFieldWriter.writeObject("lastRepeatEnquirySource", ModelContactConditionInput.this.lastRepeatEnquirySource.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastRepeatEnquirySource.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.gender.defined) {
                    inputFieldWriter.writeObject("gender", ModelContactConditionInput.this.gender.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.gender.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.isDecisionMaker.defined) {
                    inputFieldWriter.writeObject("isDecisionMaker", ModelContactConditionInput.this.isDecisionMaker.value != 0 ? ((ModelBooleanInput) ModelContactConditionInput.this.isDecisionMaker.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.isPrivate.defined) {
                    inputFieldWriter.writeObject("isPrivate", ModelContactConditionInput.this.isPrivate.value != 0 ? ((ModelBooleanInput) ModelContactConditionInput.this.isPrivate.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lockPeriod.defined) {
                    inputFieldWriter.writeObject("lockPeriod", ModelContactConditionInput.this.lockPeriod.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lockPeriod.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelContactConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.preferredContactDays.defined) {
                    inputFieldWriter.writeObject("preferredContactDays", ModelContactConditionInput.this.preferredContactDays.value != 0 ? ((ModelDayListInput) ModelContactConditionInput.this.preferredContactDays.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.profilePhotoUrl.defined) {
                    inputFieldWriter.writeObject("profilePhotoUrl", ModelContactConditionInput.this.profilePhotoUrl.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.profilePhotoUrl.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.referredBy.defined) {
                    inputFieldWriter.writeObject("referredBy", ModelContactConditionInput.this.referredBy.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.referredBy.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.salutation.defined) {
                    inputFieldWriter.writeObject("salutation", ModelContactConditionInput.this.salutation.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.salutation.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.seniority.defined) {
                    inputFieldWriter.writeObject("seniority", ModelContactConditionInput.this.seniority.value != 0 ? ((ModelSeniorityInput) ModelContactConditionInput.this.seniority.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelContactConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.hasTask.defined) {
                    inputFieldWriter.writeObject("hasTask", ModelContactConditionInput.this.hasTask.value != 0 ? ((ModelBooleanInput) ModelContactConditionInput.this.hasTask.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.openTaskActivityType.defined) {
                    inputFieldWriter.writeObject("openTaskActivityType", ModelContactConditionInput.this.openTaskActivityType.value != 0 ? ((ModelTaskActivityTypeInput) ModelContactConditionInput.this.openTaskActivityType.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastCalledTime.defined) {
                    inputFieldWriter.writeObject("lastCalledTime", ModelContactConditionInput.this.lastCalledTime.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastCalledTime.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastCallDirection.defined) {
                    inputFieldWriter.writeObject("lastCallDirection", ModelContactConditionInput.this.lastCallDirection.value != 0 ? ((ModelCallDirectionInput) ModelContactConditionInput.this.lastCallDirection.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastCallOutcome.defined) {
                    inputFieldWriter.writeObject("lastCallOutcome", ModelContactConditionInput.this.lastCallOutcome.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastCallOutcome.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastCallOutcomeNature.defined) {
                    inputFieldWriter.writeObject("lastCallOutcomeNature", ModelContactConditionInput.this.lastCallOutcomeNature.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastCallOutcomeNature.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastCallUserId.defined) {
                    inputFieldWriter.writeObject("lastCallUserId", ModelContactConditionInput.this.lastCallUserId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.lastCallUserId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastCallDuration.defined) {
                    inputFieldWriter.writeObject("lastCallDuration", ModelContactConditionInput.this.lastCallDuration.value != 0 ? ((ModelIntInput) ModelContactConditionInput.this.lastCallDuration.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastVisitTime.defined) {
                    inputFieldWriter.writeObject("lastVisitTime", ModelContactConditionInput.this.lastVisitTime.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastVisitTime.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastVisitOutcome.defined) {
                    inputFieldWriter.writeObject("lastVisitOutcome", ModelContactConditionInput.this.lastVisitOutcome.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastVisitOutcome.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastVisitOutcomeNature.defined) {
                    inputFieldWriter.writeObject("lastVisitOutcomeNature", ModelContactConditionInput.this.lastVisitOutcomeNature.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastVisitOutcomeNature.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastVisitUserId.defined) {
                    inputFieldWriter.writeObject("lastVisitUserId", ModelContactConditionInput.this.lastVisitUserId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.lastVisitUserId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastEmailTime.defined) {
                    inputFieldWriter.writeObject("lastEmailTime", ModelContactConditionInput.this.lastEmailTime.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastEmailTime.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastEmailUserId.defined) {
                    inputFieldWriter.writeObject("lastEmailUserId", ModelContactConditionInput.this.lastEmailUserId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.lastEmailUserId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastKnownDisposition.defined) {
                    inputFieldWriter.writeObject("lastKnownDisposition", ModelContactConditionInput.this.lastKnownDisposition.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastKnownDisposition.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastEngagementFromAccount.defined) {
                    inputFieldWriter.writeObject("lastEngagementFromAccount", ModelContactConditionInput.this.lastEngagementFromAccount.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastEngagementFromAccount.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastEngagementFromContact.defined) {
                    inputFieldWriter.writeObject("lastEngagementFromContact", ModelContactConditionInput.this.lastEngagementFromContact.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastEngagementFromContact.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.freshLeadTag.defined) {
                    inputFieldWriter.writeObject("freshLeadTag", ModelContactConditionInput.this.freshLeadTag.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.freshLeadTag.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.noWorkAfterAssignment.defined) {
                    inputFieldWriter.writeObject("noWorkAfterAssignment", ModelContactConditionInput.this.noWorkAfterAssignment.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.noWorkAfterAssignment.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.needFollowUpTag.defined) {
                    inputFieldWriter.writeObject("needFollowUpTag", ModelContactConditionInput.this.needFollowUpTag.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.needFollowUpTag.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.needFollowUpTagUpdatedAt.defined) {
                    inputFieldWriter.writeObject("needFollowUpTagUpdatedAt", ModelContactConditionInput.this.needFollowUpTagUpdatedAt.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.needFollowUpTagUpdatedAt.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.activeDealStage.defined) {
                    inputFieldWriter.writeObject("activeDealStage", ModelContactConditionInput.this.activeDealStage.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.activeDealStage.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.activeDealStageUpdatedAt.defined) {
                    inputFieldWriter.writeObject("activeDealStageUpdatedAt", ModelContactConditionInput.this.activeDealStageUpdatedAt.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.activeDealStageUpdatedAt.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.dealDescription.defined) {
                    inputFieldWriter.writeObject("dealDescription", ModelContactConditionInput.this.dealDescription.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.dealDescription.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.isCustomer.defined) {
                    inputFieldWriter.writeObject("isCustomer", ModelContactConditionInput.this.isCustomer.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.isCustomer.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.becameCustomerOn.defined) {
                    inputFieldWriter.writeObject("becameCustomerOn", ModelContactConditionInput.this.becameCustomerOn.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.becameCustomerOn.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.unsuccessfulCallAttempts.defined) {
                    inputFieldWriter.writeObject("unsuccessfulCallAttempts", ModelContactConditionInput.this.unsuccessfulCallAttempts.value != 0 ? ((ModelIntInput) ModelContactConditionInput.this.unsuccessfulCallAttempts.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.leadCallsNotAnswered.defined) {
                    inputFieldWriter.writeObject("leadCallsNotAnswered", ModelContactConditionInput.this.leadCallsNotAnswered.value != 0 ? ((ModelIntInput) ModelContactConditionInput.this.leadCallsNotAnswered.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastCallEngagementId.defined) {
                    inputFieldWriter.writeObject("lastCallEngagementId", ModelContactConditionInput.this.lastCallEngagementId.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastCallEngagementId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastVisitEngagementId.defined) {
                    inputFieldWriter.writeObject("lastVisitEngagementId", ModelContactConditionInput.this.lastVisitEngagementId.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastVisitEngagementId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastEmailEngagementId.defined) {
                    inputFieldWriter.writeObject("lastEmailEngagementId", ModelContactConditionInput.this.lastEmailEngagementId.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastEmailEngagementId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastWhatsappTime.defined) {
                    inputFieldWriter.writeObject("lastWhatsappTime", ModelContactConditionInput.this.lastWhatsappTime.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastWhatsappTime.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastWhatsappUserId.defined) {
                    inputFieldWriter.writeObject("lastWhatsappUserId", ModelContactConditionInput.this.lastWhatsappUserId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.lastWhatsappUserId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastWhatsappEngagementId.defined) {
                    inputFieldWriter.writeObject("lastWhatsappEngagementId", ModelContactConditionInput.this.lastWhatsappEngagementId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.lastWhatsappEngagementId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastWabaBroadcastTime.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastTime", ModelContactConditionInput.this.lastWabaBroadcastTime.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastWabaBroadcastTime.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastWabaBroadcastStatus.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastStatus", ModelContactConditionInput.this.lastWabaBroadcastStatus.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastWabaBroadcastStatus.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastWabaBroadcastTemplate.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastTemplate", ModelContactConditionInput.this.lastWabaBroadcastTemplate.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastWabaBroadcastTemplate.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastWabaBroadcastReplyBody.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastReplyBody", ModelContactConditionInput.this.lastWabaBroadcastReplyBody.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastWabaBroadcastReplyBody.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastWabaBroadcastReplyTime.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastReplyTime", ModelContactConditionInput.this.lastWabaBroadcastReplyTime.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastWabaBroadcastReplyTime.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastWabaBroadcastReplyType.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastReplyType", ModelContactConditionInput.this.lastWabaBroadcastReplyType.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastWabaBroadcastReplyType.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastSmsTime.defined) {
                    inputFieldWriter.writeObject("lastSmsTime", ModelContactConditionInput.this.lastSmsTime.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastSmsTime.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastSmsUserId.defined) {
                    inputFieldWriter.writeObject("lastSmsUserId", ModelContactConditionInput.this.lastSmsUserId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.lastSmsUserId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastSmsEngagementId.defined) {
                    inputFieldWriter.writeObject("lastSmsEngagementId", ModelContactConditionInput.this.lastSmsEngagementId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.lastSmsEngagementId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastNoteAddedTime.defined) {
                    inputFieldWriter.writeObject("lastNoteAddedTime", ModelContactConditionInput.this.lastNoteAddedTime.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastNoteAddedTime.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastNoteUserId.defined) {
                    inputFieldWriter.writeObject("lastNoteUserId", ModelContactConditionInput.this.lastNoteUserId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.lastNoteUserId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastTaskDoneTime.defined) {
                    inputFieldWriter.writeObject("lastTaskDoneTime", ModelContactConditionInput.this.lastTaskDoneTime.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastTaskDoneTime.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastTaskDoneUserId.defined) {
                    inputFieldWriter.writeObject("lastTaskDoneUserId", ModelContactConditionInput.this.lastTaskDoneUserId.value != 0 ? ((ModelIDInput) ModelContactConditionInput.this.lastTaskDoneUserId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastTaskDoneEngagementId.defined) {
                    inputFieldWriter.writeObject("lastTaskDoneEngagementId", ModelContactConditionInput.this.lastTaskDoneEngagementId.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastTaskDoneEngagementId.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.openTaskCount.defined) {
                    inputFieldWriter.writeObject("openTaskCount", ModelContactConditionInput.this.openTaskCount.value != 0 ? ((ModelIntInput) ModelContactConditionInput.this.openTaskCount.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastKnownDispositionTime.defined) {
                    inputFieldWriter.writeObject("lastKnownDispositionTime", ModelContactConditionInput.this.lastKnownDispositionTime.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastKnownDispositionTime.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.lastLeadAssignmentDateTime.defined) {
                    inputFieldWriter.writeObject("lastLeadAssignmentDateTime", ModelContactConditionInput.this.lastLeadAssignmentDateTime.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.lastLeadAssignmentDateTime.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.userDefinedTags.defined) {
                    inputFieldWriter.writeObject("userDefinedTags", ModelContactConditionInput.this.userDefinedTags.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.userDefinedTags.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.productService.defined) {
                    inputFieldWriter.writeObject("productService", ModelContactConditionInput.this.productService.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.productService.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.bulkUploadReference.defined) {
                    inputFieldWriter.writeObject("bulkUploadReference", ModelContactConditionInput.this.bulkUploadReference.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.bulkUploadReference.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.assignmentMethod.defined) {
                    inputFieldWriter.writeObject("assignmentMethod", ModelContactConditionInput.this.assignmentMethod.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.assignmentMethod.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelContactConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelContactConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelContactConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelContactConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelContactConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelContactConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelContactConditionInput.this.not.value != 0 ? ((ModelContactConditionInput) ModelContactConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelStringInput needFollowUpTag() {
        return this.needFollowUpTag.value;
    }

    public ModelStringInput needFollowUpTagUpdatedAt() {
        return this.needFollowUpTagUpdatedAt.value;
    }

    public ModelStringInput noWorkAfterAssignment() {
        return this.noWorkAfterAssignment.value;
    }

    public ModelContactConditionInput not() {
        return this.not.value;
    }

    public ModelTaskActivityTypeInput openTaskActivityType() {
        return this.openTaskActivityType.value;
    }

    public ModelIntInput openTaskCount() {
        return this.openTaskCount.value;
    }

    public List<ModelContactConditionInput> or() {
        return this.or.value;
    }

    public ModelDayListInput preferredContactDays() {
        return this.preferredContactDays.value;
    }

    public ModelIDInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public ModelStringInput productService() {
        return this.productService.value;
    }

    public ModelStringInput profilePhotoUrl() {
        return this.profilePhotoUrl.value;
    }

    public ModelStringInput referredBy() {
        return this.referredBy.value;
    }

    public ModelStringInput salutation() {
        return this.salutation.value;
    }

    public ModelSeniorityInput seniority() {
        return this.seniority.value;
    }

    public ModelIDInput sharedOwners() {
        return this.sharedOwners.value;
    }

    public ModelIDInput sharedTeams() {
        return this.sharedTeams.value;
    }

    public ModelContactAssignmentStatusInput toBeAssigned() {
        return this.toBeAssigned.value;
    }

    public ModelIntInput unsuccessfulCallAttempts() {
        return this.unsuccessfulCallAttempts.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelStringInput userDefinedTags() {
        return this.userDefinedTags.value;
    }
}
