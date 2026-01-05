package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelContactFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> accountPriority;
    private final Input<ModelStringInput> activeDealStage;
    private final Input<ModelStringInput> activeDealStageUpdatedAt;
    private final Input<ModelIDInput> addedById;
    private final Input<List<ModelContactFilterInput>> and;
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
    private final Input<ModelIDInput> id;
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
    private final Input<ModelContactFilterInput> not;
    private final Input<ModelTaskActivityTypeInput> openTaskActivityType;
    private final Input<ModelIntInput> openTaskCount;
    private final Input<List<ModelContactFilterInput>> or;
    private final Input<ModelIDInput> ownerId;
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
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
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
        private Input<List<ModelContactFilterInput>> and = Input.absent();
        private Input<List<ModelContactFilterInput>> or = Input.absent();
        private Input<ModelContactFilterInput> not = Input.absent();

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

        public Builder and(List<ModelContactFilterInput> list) {
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

        public ModelContactFilterInput build() {
            return new ModelContactFilterInput(this.id, this.accountId, this.ownerId, this.toBeAssigned, this.sharedOwners, this.primaryTeamId, this.sharedTeams, this.accountPriority, this.addedById, this.assignedToId, this.blockedForCallById, this.blockedForCallReason, this.blockedForCallUntil, this.callPriority, this.contactSource, this.contactSourceDrillDownOne, this.contactSourceDrillDownTwo, this.contactSourceDrillDownThree, this.contactSourceDrillDownOneId, this.contactSourceDrillDownTwoId, this.contactSourceDrillDownThreeId, this.contactStatus, this.contactType, this.department, this.designation, this.lastRepeatEnquiryDate, this.lastRepeatEnquirySource, this.gender, this.isDecisionMaker, this.isPrivate, this.lockPeriod, this.name, this.preferredContactDays, this.profilePhotoUrl, this.referredBy, this.salutation, this.seniority, this.updatedById, this.hasTask, this.openTaskActivityType, this.lastCalledTime, this.lastCallDirection, this.lastCallOutcome, this.lastCallOutcomeNature, this.lastCallUserId, this.lastCallDuration, this.lastVisitTime, this.lastVisitOutcome, this.lastVisitOutcomeNature, this.lastVisitUserId, this.lastEmailTime, this.lastEmailUserId, this.lastKnownDisposition, this.lastEngagementFromAccount, this.lastEngagementFromContact, this.freshLeadTag, this.noWorkAfterAssignment, this.needFollowUpTag, this.needFollowUpTagUpdatedAt, this.activeDealStage, this.activeDealStageUpdatedAt, this.dealDescription, this.isCustomer, this.becameCustomerOn, this.unsuccessfulCallAttempts, this.leadCallsNotAnswered, this.lastCallEngagementId, this.lastVisitEngagementId, this.lastEmailEngagementId, this.lastWhatsappTime, this.lastWhatsappUserId, this.lastWhatsappEngagementId, this.lastWabaBroadcastTime, this.lastWabaBroadcastStatus, this.lastWabaBroadcastTemplate, this.lastWabaBroadcastReplyBody, this.lastWabaBroadcastReplyTime, this.lastWabaBroadcastReplyType, this.lastSmsTime, this.lastSmsUserId, this.lastSmsEngagementId, this.lastNoteAddedTime, this.lastNoteUserId, this.lastTaskDoneTime, this.lastTaskDoneUserId, this.lastTaskDoneEngagementId, this.openTaskCount, this.lastKnownDispositionTime, this.lastLeadAssignmentDateTime, this.userDefinedTags, this.productService, this.bulkUploadReference, this.assignmentMethod, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelContactFilterInput modelContactFilterInput) {
            this.not = Input.fromNullable(modelContactFilterInput);
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

        public Builder or(List<ModelContactFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
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

    public ModelContactFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelContactAssignmentStatusInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelStringInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelIDInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelIDInput> input19, Input<ModelIDInput> input20, Input<ModelIDInput> input21, Input<ModelContactStatusInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelStringInput> input26, Input<ModelStringInput> input27, Input<ModelStringInput> input28, Input<ModelBooleanInput> input29, Input<ModelBooleanInput> input30, Input<ModelStringInput> input31, Input<ModelStringInput> input32, Input<ModelDayListInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<ModelStringInput> input36, Input<ModelSeniorityInput> input37, Input<ModelIDInput> input38, Input<ModelBooleanInput> input39, Input<ModelTaskActivityTypeInput> input40, Input<ModelStringInput> input41, Input<ModelCallDirectionInput> input42, Input<ModelStringInput> input43, Input<ModelStringInput> input44, Input<ModelIDInput> input45, Input<ModelIntInput> input46, Input<ModelStringInput> input47, Input<ModelStringInput> input48, Input<ModelStringInput> input49, Input<ModelIDInput> input50, Input<ModelStringInput> input51, Input<ModelIDInput> input52, Input<ModelStringInput> input53, Input<ModelStringInput> input54, Input<ModelStringInput> input55, Input<ModelStringInput> input56, Input<ModelStringInput> input57, Input<ModelStringInput> input58, Input<ModelStringInput> input59, Input<ModelStringInput> input60, Input<ModelStringInput> input61, Input<ModelStringInput> input62, Input<ModelStringInput> input63, Input<ModelStringInput> input64, Input<ModelIntInput> input65, Input<ModelIntInput> input66, Input<ModelStringInput> input67, Input<ModelStringInput> input68, Input<ModelStringInput> input69, Input<ModelStringInput> input70, Input<ModelIDInput> input71, Input<ModelIDInput> input72, Input<ModelStringInput> input73, Input<ModelStringInput> input74, Input<ModelStringInput> input75, Input<ModelStringInput> input76, Input<ModelStringInput> input77, Input<ModelStringInput> input78, Input<ModelStringInput> input79, Input<ModelIDInput> input80, Input<ModelIDInput> input81, Input<ModelStringInput> input82, Input<ModelIDInput> input83, Input<ModelStringInput> input84, Input<ModelIDInput> input85, Input<ModelStringInput> input86, Input<ModelIntInput> input87, Input<ModelStringInput> input88, Input<ModelStringInput> input89, Input<ModelStringInput> input90, Input<ModelStringInput> input91, Input<ModelStringInput> input92, Input<ModelStringInput> input93, Input<ModelStringInput> input94, Input<ModelStringInput> input95, Input<List<ModelContactFilterInput>> input96, Input<List<ModelContactFilterInput>> input97, Input<ModelContactFilterInput> input98) {
        this.id = input;
        this.accountId = input2;
        this.ownerId = input3;
        this.toBeAssigned = input4;
        this.sharedOwners = input5;
        this.primaryTeamId = input6;
        this.sharedTeams = input7;
        this.accountPriority = input8;
        this.addedById = input9;
        this.assignedToId = input10;
        this.blockedForCallById = input11;
        this.blockedForCallReason = input12;
        this.blockedForCallUntil = input13;
        this.callPriority = input14;
        this.contactSource = input15;
        this.contactSourceDrillDownOne = input16;
        this.contactSourceDrillDownTwo = input17;
        this.contactSourceDrillDownThree = input18;
        this.contactSourceDrillDownOneId = input19;
        this.contactSourceDrillDownTwoId = input20;
        this.contactSourceDrillDownThreeId = input21;
        this.contactStatus = input22;
        this.contactType = input23;
        this.department = input24;
        this.designation = input25;
        this.lastRepeatEnquiryDate = input26;
        this.lastRepeatEnquirySource = input27;
        this.gender = input28;
        this.isDecisionMaker = input29;
        this.isPrivate = input30;
        this.lockPeriod = input31;
        this.name = input32;
        this.preferredContactDays = input33;
        this.profilePhotoUrl = input34;
        this.referredBy = input35;
        this.salutation = input36;
        this.seniority = input37;
        this.updatedById = input38;
        this.hasTask = input39;
        this.openTaskActivityType = input40;
        this.lastCalledTime = input41;
        this.lastCallDirection = input42;
        this.lastCallOutcome = input43;
        this.lastCallOutcomeNature = input44;
        this.lastCallUserId = input45;
        this.lastCallDuration = input46;
        this.lastVisitTime = input47;
        this.lastVisitOutcome = input48;
        this.lastVisitOutcomeNature = input49;
        this.lastVisitUserId = input50;
        this.lastEmailTime = input51;
        this.lastEmailUserId = input52;
        this.lastKnownDisposition = input53;
        this.lastEngagementFromAccount = input54;
        this.lastEngagementFromContact = input55;
        this.freshLeadTag = input56;
        this.noWorkAfterAssignment = input57;
        this.needFollowUpTag = input58;
        this.needFollowUpTagUpdatedAt = input59;
        this.activeDealStage = input60;
        this.activeDealStageUpdatedAt = input61;
        this.dealDescription = input62;
        this.isCustomer = input63;
        this.becameCustomerOn = input64;
        this.unsuccessfulCallAttempts = input65;
        this.leadCallsNotAnswered = input66;
        this.lastCallEngagementId = input67;
        this.lastVisitEngagementId = input68;
        this.lastEmailEngagementId = input69;
        this.lastWhatsappTime = input70;
        this.lastWhatsappUserId = input71;
        this.lastWhatsappEngagementId = input72;
        this.lastWabaBroadcastTime = input73;
        this.lastWabaBroadcastStatus = input74;
        this.lastWabaBroadcastTemplate = input75;
        this.lastWabaBroadcastReplyBody = input76;
        this.lastWabaBroadcastReplyTime = input77;
        this.lastWabaBroadcastReplyType = input78;
        this.lastSmsTime = input79;
        this.lastSmsUserId = input80;
        this.lastSmsEngagementId = input81;
        this.lastNoteAddedTime = input82;
        this.lastNoteUserId = input83;
        this.lastTaskDoneTime = input84;
        this.lastTaskDoneUserId = input85;
        this.lastTaskDoneEngagementId = input86;
        this.openTaskCount = input87;
        this.lastKnownDispositionTime = input88;
        this.lastLeadAssignmentDateTime = input89;
        this.userDefinedTags = input90;
        this.productService = input91;
        this.bulkUploadReference = input92;
        this.assignmentMethod = input93;
        this.createdAt = input94;
        this.updatedAt = input95;
        this.and = input96;
        this.or = input97;
        this.not = input98;
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

    public List<ModelContactFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
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
        return new InputFieldMarshaller() { // from class: type.ModelContactFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelContactFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelContactFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelContactFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelContactFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeObject("toBeAssigned", ModelContactFilterInput.this.toBeAssigned.value != 0 ? ((ModelContactAssignmentStatusInput) ModelContactFilterInput.this.toBeAssigned.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.sharedOwners.defined) {
                    inputFieldWriter.writeObject("sharedOwners", ModelContactFilterInput.this.sharedOwners.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.sharedOwners.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelContactFilterInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.sharedTeams.defined) {
                    inputFieldWriter.writeObject("sharedTeams", ModelContactFilterInput.this.sharedTeams.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.sharedTeams.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.accountPriority.defined) {
                    inputFieldWriter.writeObject("accountPriority", ModelContactFilterInput.this.accountPriority.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.accountPriority.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", ModelContactFilterInput.this.addedById.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.addedById.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.assignedToId.defined) {
                    inputFieldWriter.writeObject("assignedToId", ModelContactFilterInput.this.assignedToId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.assignedToId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.blockedForCallById.defined) {
                    inputFieldWriter.writeObject("blockedForCallById", ModelContactFilterInput.this.blockedForCallById.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.blockedForCallById.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.blockedForCallReason.defined) {
                    inputFieldWriter.writeObject("blockedForCallReason", ModelContactFilterInput.this.blockedForCallReason.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.blockedForCallReason.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.blockedForCallUntil.defined) {
                    inputFieldWriter.writeObject("blockedForCallUntil", ModelContactFilterInput.this.blockedForCallUntil.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.blockedForCallUntil.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.callPriority.defined) {
                    inputFieldWriter.writeObject("callPriority", ModelContactFilterInput.this.callPriority.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.callPriority.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.contactSource.defined) {
                    inputFieldWriter.writeObject("contactSource", ModelContactFilterInput.this.contactSource.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.contactSource.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.contactSourceDrillDownOne.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownOne", ModelContactFilterInput.this.contactSourceDrillDownOne.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.contactSourceDrillDownOne.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.contactSourceDrillDownTwo.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownTwo", ModelContactFilterInput.this.contactSourceDrillDownTwo.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.contactSourceDrillDownTwo.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.contactSourceDrillDownThree.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownThree", ModelContactFilterInput.this.contactSourceDrillDownThree.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.contactSourceDrillDownThree.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.contactSourceDrillDownOneId.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownOneId", ModelContactFilterInput.this.contactSourceDrillDownOneId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.contactSourceDrillDownOneId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.contactSourceDrillDownTwoId.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownTwoId", ModelContactFilterInput.this.contactSourceDrillDownTwoId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.contactSourceDrillDownTwoId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.contactSourceDrillDownThreeId.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownThreeId", ModelContactFilterInput.this.contactSourceDrillDownThreeId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.contactSourceDrillDownThreeId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.contactStatus.defined) {
                    inputFieldWriter.writeObject("contactStatus", ModelContactFilterInput.this.contactStatus.value != 0 ? ((ModelContactStatusInput) ModelContactFilterInput.this.contactStatus.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.contactType.defined) {
                    inputFieldWriter.writeObject("contactType", ModelContactFilterInput.this.contactType.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.contactType.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.department.defined) {
                    inputFieldWriter.writeObject("department", ModelContactFilterInput.this.department.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.department.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.designation.defined) {
                    inputFieldWriter.writeObject("designation", ModelContactFilterInput.this.designation.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.designation.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastRepeatEnquiryDate.defined) {
                    inputFieldWriter.writeObject("lastRepeatEnquiryDate", ModelContactFilterInput.this.lastRepeatEnquiryDate.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastRepeatEnquiryDate.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastRepeatEnquirySource.defined) {
                    inputFieldWriter.writeObject("lastRepeatEnquirySource", ModelContactFilterInput.this.lastRepeatEnquirySource.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastRepeatEnquirySource.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.gender.defined) {
                    inputFieldWriter.writeObject("gender", ModelContactFilterInput.this.gender.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.gender.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.isDecisionMaker.defined) {
                    inputFieldWriter.writeObject("isDecisionMaker", ModelContactFilterInput.this.isDecisionMaker.value != 0 ? ((ModelBooleanInput) ModelContactFilterInput.this.isDecisionMaker.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.isPrivate.defined) {
                    inputFieldWriter.writeObject("isPrivate", ModelContactFilterInput.this.isPrivate.value != 0 ? ((ModelBooleanInput) ModelContactFilterInput.this.isPrivate.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lockPeriod.defined) {
                    inputFieldWriter.writeObject("lockPeriod", ModelContactFilterInput.this.lockPeriod.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lockPeriod.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelContactFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.preferredContactDays.defined) {
                    inputFieldWriter.writeObject("preferredContactDays", ModelContactFilterInput.this.preferredContactDays.value != 0 ? ((ModelDayListInput) ModelContactFilterInput.this.preferredContactDays.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.profilePhotoUrl.defined) {
                    inputFieldWriter.writeObject("profilePhotoUrl", ModelContactFilterInput.this.profilePhotoUrl.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.profilePhotoUrl.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.referredBy.defined) {
                    inputFieldWriter.writeObject("referredBy", ModelContactFilterInput.this.referredBy.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.referredBy.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.salutation.defined) {
                    inputFieldWriter.writeObject("salutation", ModelContactFilterInput.this.salutation.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.salutation.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.seniority.defined) {
                    inputFieldWriter.writeObject("seniority", ModelContactFilterInput.this.seniority.value != 0 ? ((ModelSeniorityInput) ModelContactFilterInput.this.seniority.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelContactFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.hasTask.defined) {
                    inputFieldWriter.writeObject("hasTask", ModelContactFilterInput.this.hasTask.value != 0 ? ((ModelBooleanInput) ModelContactFilterInput.this.hasTask.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.openTaskActivityType.defined) {
                    inputFieldWriter.writeObject("openTaskActivityType", ModelContactFilterInput.this.openTaskActivityType.value != 0 ? ((ModelTaskActivityTypeInput) ModelContactFilterInput.this.openTaskActivityType.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastCalledTime.defined) {
                    inputFieldWriter.writeObject("lastCalledTime", ModelContactFilterInput.this.lastCalledTime.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastCalledTime.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastCallDirection.defined) {
                    inputFieldWriter.writeObject("lastCallDirection", ModelContactFilterInput.this.lastCallDirection.value != 0 ? ((ModelCallDirectionInput) ModelContactFilterInput.this.lastCallDirection.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastCallOutcome.defined) {
                    inputFieldWriter.writeObject("lastCallOutcome", ModelContactFilterInput.this.lastCallOutcome.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastCallOutcome.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastCallOutcomeNature.defined) {
                    inputFieldWriter.writeObject("lastCallOutcomeNature", ModelContactFilterInput.this.lastCallOutcomeNature.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastCallOutcomeNature.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastCallUserId.defined) {
                    inputFieldWriter.writeObject("lastCallUserId", ModelContactFilterInput.this.lastCallUserId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.lastCallUserId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastCallDuration.defined) {
                    inputFieldWriter.writeObject("lastCallDuration", ModelContactFilterInput.this.lastCallDuration.value != 0 ? ((ModelIntInput) ModelContactFilterInput.this.lastCallDuration.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastVisitTime.defined) {
                    inputFieldWriter.writeObject("lastVisitTime", ModelContactFilterInput.this.lastVisitTime.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastVisitTime.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastVisitOutcome.defined) {
                    inputFieldWriter.writeObject("lastVisitOutcome", ModelContactFilterInput.this.lastVisitOutcome.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastVisitOutcome.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastVisitOutcomeNature.defined) {
                    inputFieldWriter.writeObject("lastVisitOutcomeNature", ModelContactFilterInput.this.lastVisitOutcomeNature.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastVisitOutcomeNature.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastVisitUserId.defined) {
                    inputFieldWriter.writeObject("lastVisitUserId", ModelContactFilterInput.this.lastVisitUserId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.lastVisitUserId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastEmailTime.defined) {
                    inputFieldWriter.writeObject("lastEmailTime", ModelContactFilterInput.this.lastEmailTime.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastEmailTime.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastEmailUserId.defined) {
                    inputFieldWriter.writeObject("lastEmailUserId", ModelContactFilterInput.this.lastEmailUserId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.lastEmailUserId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastKnownDisposition.defined) {
                    inputFieldWriter.writeObject("lastKnownDisposition", ModelContactFilterInput.this.lastKnownDisposition.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastKnownDisposition.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastEngagementFromAccount.defined) {
                    inputFieldWriter.writeObject("lastEngagementFromAccount", ModelContactFilterInput.this.lastEngagementFromAccount.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastEngagementFromAccount.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastEngagementFromContact.defined) {
                    inputFieldWriter.writeObject("lastEngagementFromContact", ModelContactFilterInput.this.lastEngagementFromContact.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastEngagementFromContact.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.freshLeadTag.defined) {
                    inputFieldWriter.writeObject("freshLeadTag", ModelContactFilterInput.this.freshLeadTag.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.freshLeadTag.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.noWorkAfterAssignment.defined) {
                    inputFieldWriter.writeObject("noWorkAfterAssignment", ModelContactFilterInput.this.noWorkAfterAssignment.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.noWorkAfterAssignment.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.needFollowUpTag.defined) {
                    inputFieldWriter.writeObject("needFollowUpTag", ModelContactFilterInput.this.needFollowUpTag.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.needFollowUpTag.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.needFollowUpTagUpdatedAt.defined) {
                    inputFieldWriter.writeObject("needFollowUpTagUpdatedAt", ModelContactFilterInput.this.needFollowUpTagUpdatedAt.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.needFollowUpTagUpdatedAt.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.activeDealStage.defined) {
                    inputFieldWriter.writeObject("activeDealStage", ModelContactFilterInput.this.activeDealStage.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.activeDealStage.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.activeDealStageUpdatedAt.defined) {
                    inputFieldWriter.writeObject("activeDealStageUpdatedAt", ModelContactFilterInput.this.activeDealStageUpdatedAt.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.activeDealStageUpdatedAt.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.dealDescription.defined) {
                    inputFieldWriter.writeObject("dealDescription", ModelContactFilterInput.this.dealDescription.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.dealDescription.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.isCustomer.defined) {
                    inputFieldWriter.writeObject("isCustomer", ModelContactFilterInput.this.isCustomer.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.isCustomer.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.becameCustomerOn.defined) {
                    inputFieldWriter.writeObject("becameCustomerOn", ModelContactFilterInput.this.becameCustomerOn.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.becameCustomerOn.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.unsuccessfulCallAttempts.defined) {
                    inputFieldWriter.writeObject("unsuccessfulCallAttempts", ModelContactFilterInput.this.unsuccessfulCallAttempts.value != 0 ? ((ModelIntInput) ModelContactFilterInput.this.unsuccessfulCallAttempts.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.leadCallsNotAnswered.defined) {
                    inputFieldWriter.writeObject("leadCallsNotAnswered", ModelContactFilterInput.this.leadCallsNotAnswered.value != 0 ? ((ModelIntInput) ModelContactFilterInput.this.leadCallsNotAnswered.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastCallEngagementId.defined) {
                    inputFieldWriter.writeObject("lastCallEngagementId", ModelContactFilterInput.this.lastCallEngagementId.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastCallEngagementId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastVisitEngagementId.defined) {
                    inputFieldWriter.writeObject("lastVisitEngagementId", ModelContactFilterInput.this.lastVisitEngagementId.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastVisitEngagementId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastEmailEngagementId.defined) {
                    inputFieldWriter.writeObject("lastEmailEngagementId", ModelContactFilterInput.this.lastEmailEngagementId.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastEmailEngagementId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastWhatsappTime.defined) {
                    inputFieldWriter.writeObject("lastWhatsappTime", ModelContactFilterInput.this.lastWhatsappTime.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastWhatsappTime.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastWhatsappUserId.defined) {
                    inputFieldWriter.writeObject("lastWhatsappUserId", ModelContactFilterInput.this.lastWhatsappUserId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.lastWhatsappUserId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastWhatsappEngagementId.defined) {
                    inputFieldWriter.writeObject("lastWhatsappEngagementId", ModelContactFilterInput.this.lastWhatsappEngagementId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.lastWhatsappEngagementId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastWabaBroadcastTime.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastTime", ModelContactFilterInput.this.lastWabaBroadcastTime.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastWabaBroadcastTime.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastWabaBroadcastStatus.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastStatus", ModelContactFilterInput.this.lastWabaBroadcastStatus.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastWabaBroadcastStatus.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastWabaBroadcastTemplate.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastTemplate", ModelContactFilterInput.this.lastWabaBroadcastTemplate.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastWabaBroadcastTemplate.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastWabaBroadcastReplyBody.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastReplyBody", ModelContactFilterInput.this.lastWabaBroadcastReplyBody.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastWabaBroadcastReplyBody.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastWabaBroadcastReplyTime.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastReplyTime", ModelContactFilterInput.this.lastWabaBroadcastReplyTime.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastWabaBroadcastReplyTime.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastWabaBroadcastReplyType.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastReplyType", ModelContactFilterInput.this.lastWabaBroadcastReplyType.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastWabaBroadcastReplyType.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastSmsTime.defined) {
                    inputFieldWriter.writeObject("lastSmsTime", ModelContactFilterInput.this.lastSmsTime.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastSmsTime.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastSmsUserId.defined) {
                    inputFieldWriter.writeObject("lastSmsUserId", ModelContactFilterInput.this.lastSmsUserId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.lastSmsUserId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastSmsEngagementId.defined) {
                    inputFieldWriter.writeObject("lastSmsEngagementId", ModelContactFilterInput.this.lastSmsEngagementId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.lastSmsEngagementId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastNoteAddedTime.defined) {
                    inputFieldWriter.writeObject("lastNoteAddedTime", ModelContactFilterInput.this.lastNoteAddedTime.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastNoteAddedTime.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastNoteUserId.defined) {
                    inputFieldWriter.writeObject("lastNoteUserId", ModelContactFilterInput.this.lastNoteUserId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.lastNoteUserId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastTaskDoneTime.defined) {
                    inputFieldWriter.writeObject("lastTaskDoneTime", ModelContactFilterInput.this.lastTaskDoneTime.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastTaskDoneTime.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastTaskDoneUserId.defined) {
                    inputFieldWriter.writeObject("lastTaskDoneUserId", ModelContactFilterInput.this.lastTaskDoneUserId.value != 0 ? ((ModelIDInput) ModelContactFilterInput.this.lastTaskDoneUserId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastTaskDoneEngagementId.defined) {
                    inputFieldWriter.writeObject("lastTaskDoneEngagementId", ModelContactFilterInput.this.lastTaskDoneEngagementId.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastTaskDoneEngagementId.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.openTaskCount.defined) {
                    inputFieldWriter.writeObject("openTaskCount", ModelContactFilterInput.this.openTaskCount.value != 0 ? ((ModelIntInput) ModelContactFilterInput.this.openTaskCount.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastKnownDispositionTime.defined) {
                    inputFieldWriter.writeObject("lastKnownDispositionTime", ModelContactFilterInput.this.lastKnownDispositionTime.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastKnownDispositionTime.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.lastLeadAssignmentDateTime.defined) {
                    inputFieldWriter.writeObject("lastLeadAssignmentDateTime", ModelContactFilterInput.this.lastLeadAssignmentDateTime.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.lastLeadAssignmentDateTime.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.userDefinedTags.defined) {
                    inputFieldWriter.writeObject("userDefinedTags", ModelContactFilterInput.this.userDefinedTags.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.userDefinedTags.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.productService.defined) {
                    inputFieldWriter.writeObject("productService", ModelContactFilterInput.this.productService.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.productService.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.bulkUploadReference.defined) {
                    inputFieldWriter.writeObject("bulkUploadReference", ModelContactFilterInput.this.bulkUploadReference.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.bulkUploadReference.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.assignmentMethod.defined) {
                    inputFieldWriter.writeObject("assignmentMethod", ModelContactFilterInput.this.assignmentMethod.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.assignmentMethod.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelContactFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelContactFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelContactFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelContactFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelContactFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelContactFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelContactFilterInput.this.not.value != 0 ? ((ModelContactFilterInput) ModelContactFilterInput.this.not.value).marshaller() : null);
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

    public ModelContactFilterInput not() {
        return this.not.value;
    }

    public ModelTaskActivityTypeInput openTaskActivityType() {
        return this.openTaskActivityType.value;
    }

    public ModelIntInput openTaskCount() {
        return this.openTaskCount.value;
    }

    public List<ModelContactFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
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
