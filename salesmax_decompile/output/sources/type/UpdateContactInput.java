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
public final class UpdateContactInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> accountPriority;
    private final Input<String> activeDealStage;
    private final Input<String> activeDealStageUpdatedAt;
    private final Input<String> addedById;
    private final Input<List<AddressInput>> addresses;
    private final Input<String> assignedToId;
    private final Input<String> assignmentMethod;
    private final Input<String> becameCustomerOn;
    private final Input<String> blockedForCallById;
    private final Input<String> blockedForCallReason;
    private final Input<String> blockedForCallUntil;
    private final Input<String> bulkUploadReference;
    private final Input<List<BusinessDetailInput>> businessDetail;
    private final Input<String> callPriority;
    private final Input<String> contactAssignedToId;
    private final Input<String> contactBlockedForCallById;
    private final Input<List<ContactNumberDetailInput>> contactNumberDetail;
    private final Input<String> contactSource;
    private final Input<String> contactSourceDrillDownOne;
    private final Input<String> contactSourceDrillDownOneId;
    private final Input<String> contactSourceDrillDownThree;
    private final Input<String> contactSourceDrillDownThreeId;
    private final Input<String> contactSourceDrillDownTwo;
    private final Input<String> contactSourceDrillDownTwoId;
    private final Input<ContactStatus> contactStatus;
    private final Input<String> contactType;
    private final Input<String> createdAt;
    private final Input<String> customAttributes;
    private final Input<String> customDataAddedFromAddContactForm;
    private final Input<String> dealDescription;
    private final Input<String> department;
    private final Input<String> designation;
    private final Input<List<EmailInput>> emails;
    private final Input<List<ExternalReferenceInput>> externalReference;
    private final Input<String> firstProspectingDoneOn;
    private final Input<String> freshLeadTag;
    private final Input<String> gender;
    private final Input<Boolean> hasTask;
    private final String id;
    private final Input<String> isCustomer;
    private final Input<Boolean> isDecisionMaker;
    private final Input<Boolean> isPrivate;
    private final Input<CallDirection> lastCallDirection;
    private final Input<Integer> lastCallDuration;
    private final Input<String> lastCallEngagementId;
    private final Input<String> lastCallOutcome;
    private final Input<String> lastCallOutcomeNature;
    private final Input<String> lastCallUserId;
    private final Input<String> lastCalledTime;
    private final Input<String> lastClosedTaskDetail;
    private final Input<String> lastDealStageType;
    private final Input<String> lastEmailEngagementId;
    private final Input<String> lastEmailTime;
    private final Input<String> lastEmailUserId;
    private final Input<String> lastEngagementFromAccount;
    private final Input<String> lastEngagementFromContact;
    private final Input<String> lastKnownDisposition;
    private final Input<String> lastKnownDispositionTime;
    private final Input<String> lastLeadAssignmentDateTime;
    private final Input<String> lastNoteAddedTime;
    private final Input<String> lastNoteEngagementId;
    private final Input<String> lastNoteUserId;
    private final Input<String> lastPaymentStatus;
    private final Input<String> lastProspectingDoneOn;
    private final Input<String> lastRepeatEnquiryDate;
    private final Input<String> lastRepeatEnquirySource;
    private final Input<String> lastSmsEngagementId;
    private final Input<String> lastSmsTime;
    private final Input<String> lastSmsUserId;
    private final Input<String> lastTaskDoneEngagementId;
    private final Input<String> lastTaskDoneTime;
    private final Input<String> lastTaskDoneUserId;
    private final Input<String> lastVisitEngagementId;
    private final Input<String> lastVisitOutcome;
    private final Input<String> lastVisitOutcomeNature;
    private final Input<String> lastVisitTime;
    private final Input<String> lastVisitUserId;
    private final Input<String> lastWabaBroadcastReplyBody;
    private final Input<String> lastWabaBroadcastReplyTime;
    private final Input<String> lastWabaBroadcastReplyType;
    private final Input<String> lastWabaBroadcastStatus;
    private final Input<String> lastWabaBroadcastTemplate;
    private final Input<String> lastWabaBroadcastTime;
    private final Input<String> lastWhatsappEngagementId;
    private final Input<String> lastWhatsappTime;
    private final Input<String> lastWhatsappUserId;
    private final Input<String> latestRemark;
    private final Input<Integer> leadCallsNotAnswered;
    private final Input<LeadLifecycleStage> leadLifecycleStage;
    private final Input<LeadLifecycleStageSubCategory> leadLifecycleStageSubCategory;
    private final Input<String> lockPeriod;
    private final Input<String> manualClosedReason;
    private final Input<String> movedToClosedOn;
    private final Input<String> movedToOpportunityOn;
    private final Input<String> name;
    private final Input<String> needFollowUpTag;
    private final Input<String> needFollowUpTagUpdatedAt;
    private final Input<String> nextProspectingDueOn;
    private final Input<String> nextProspectingNote;
    private final Input<String> nextProspectingSetBy;
    private final Input<String> noWorkAfterAssignment;
    private final Input<TaskActivityType> openTaskActivityType;
    private final Input<Integer> openTaskCount;
    private final Input<String> openTaskDetail;
    private final Input<String> openVideoCallDetail;
    private final Input<String> ownerId;
    private final Input<String> paymentRequestDetail;
    private final Input<List<Day>> preferredContactDays;
    private final Input<String> primaryTeamId;
    private final Input<List<String>> productService;
    private final Input<String> profilePhotoUrl;
    private final Input<Integer> prospectingAttempts;
    private final Input<List<String>> recentEngagements;
    private final Input<String> recentEngagementsUpdatedAt;
    private final Input<String> referredBy;
    private final Input<String> salutation;
    private final Input<Seniority> seniority;
    private final Input<List<String>> sharedOwners;
    private final Input<List<String>> sharedTeams;
    private final Input<ContactAssignmentStatus> toBeAssigned;
    private final Input<Integer> unsuccessfulCallAttempts;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<List<String>> userDefinedTags;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<ContactAssignmentStatus> toBeAssigned = Input.absent();
        private Input<List<String>> sharedOwners = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<List<String>> sharedTeams = Input.absent();
        private Input<String> accountPriority = Input.absent();
        private Input<String> addedById = Input.absent();
        private Input<List<AddressInput>> addresses = Input.absent();
        private Input<String> assignedToId = Input.absent();
        private Input<String> blockedForCallById = Input.absent();
        private Input<String> blockedForCallReason = Input.absent();
        private Input<String> blockedForCallUntil = Input.absent();
        private Input<String> callPriority = Input.absent();
        private Input<List<ContactNumberDetailInput>> contactNumberDetail = Input.absent();
        private Input<List<BusinessDetailInput>> businessDetail = Input.absent();
        private Input<String> contactSource = Input.absent();
        private Input<String> contactSourceDrillDownOne = Input.absent();
        private Input<String> contactSourceDrillDownTwo = Input.absent();
        private Input<String> contactSourceDrillDownThree = Input.absent();
        private Input<String> contactSourceDrillDownOneId = Input.absent();
        private Input<String> contactSourceDrillDownTwoId = Input.absent();
        private Input<String> contactSourceDrillDownThreeId = Input.absent();
        private Input<ContactStatus> contactStatus = Input.absent();
        private Input<String> contactType = Input.absent();
        private Input<String> department = Input.absent();
        private Input<String> designation = Input.absent();
        private Input<String> lastRepeatEnquiryDate = Input.absent();
        private Input<String> lastRepeatEnquirySource = Input.absent();
        private Input<List<EmailInput>> emails = Input.absent();
        private Input<List<ExternalReferenceInput>> externalReference = Input.absent();
        private Input<String> gender = Input.absent();
        private Input<Boolean> isDecisionMaker = Input.absent();
        private Input<Boolean> isPrivate = Input.absent();
        private Input<String> lockPeriod = Input.absent();
        private Input<String> name = Input.absent();
        private Input<List<Day>> preferredContactDays = Input.absent();
        private Input<String> profilePhotoUrl = Input.absent();
        private Input<String> referredBy = Input.absent();
        private Input<String> salutation = Input.absent();
        private Input<Seniority> seniority = Input.absent();
        private Input<String> updatedById = Input.absent();
        private Input<Boolean> hasTask = Input.absent();
        private Input<TaskActivityType> openTaskActivityType = Input.absent();
        private Input<String> lastCalledTime = Input.absent();
        private Input<CallDirection> lastCallDirection = Input.absent();
        private Input<String> lastCallOutcome = Input.absent();
        private Input<String> lastCallOutcomeNature = Input.absent();
        private Input<String> lastCallUserId = Input.absent();
        private Input<Integer> lastCallDuration = Input.absent();
        private Input<String> lastCallEngagementId = Input.absent();
        private Input<String> lastVisitTime = Input.absent();
        private Input<String> lastVisitOutcome = Input.absent();
        private Input<String> lastVisitOutcomeNature = Input.absent();
        private Input<String> lastVisitUserId = Input.absent();
        private Input<String> lastVisitEngagementId = Input.absent();
        private Input<String> lastEmailTime = Input.absent();
        private Input<String> lastEmailUserId = Input.absent();
        private Input<String> lastEmailEngagementId = Input.absent();
        private Input<String> lastWhatsappTime = Input.absent();
        private Input<String> lastWhatsappUserId = Input.absent();
        private Input<String> lastWhatsappEngagementId = Input.absent();
        private Input<String> lastWabaBroadcastTime = Input.absent();
        private Input<String> lastWabaBroadcastStatus = Input.absent();
        private Input<String> lastWabaBroadcastTemplate = Input.absent();
        private Input<String> lastWabaBroadcastReplyBody = Input.absent();
        private Input<String> lastWabaBroadcastReplyTime = Input.absent();
        private Input<String> lastWabaBroadcastReplyType = Input.absent();
        private Input<String> lastSmsTime = Input.absent();
        private Input<String> lastSmsUserId = Input.absent();
        private Input<String> lastSmsEngagementId = Input.absent();
        private Input<String> lastNoteAddedTime = Input.absent();
        private Input<String> lastNoteUserId = Input.absent();
        private Input<String> lastNoteEngagementId = Input.absent();
        private Input<String> lastTaskDoneTime = Input.absent();
        private Input<String> lastTaskDoneUserId = Input.absent();
        private Input<String> lastTaskDoneEngagementId = Input.absent();
        private Input<Integer> openTaskCount = Input.absent();
        private Input<String> lastKnownDisposition = Input.absent();
        private Input<String> lastKnownDispositionTime = Input.absent();
        private Input<String> lastLeadAssignmentDateTime = Input.absent();
        private Input<String> lastEngagementFromAccount = Input.absent();
        private Input<String> lastEngagementFromContact = Input.absent();
        private Input<String> freshLeadTag = Input.absent();
        private Input<String> noWorkAfterAssignment = Input.absent();
        private Input<String> needFollowUpTag = Input.absent();
        private Input<String> needFollowUpTagUpdatedAt = Input.absent();
        private Input<String> activeDealStage = Input.absent();
        private Input<String> activeDealStageUpdatedAt = Input.absent();
        private Input<String> dealDescription = Input.absent();
        private Input<String> isCustomer = Input.absent();
        private Input<String> becameCustomerOn = Input.absent();
        private Input<Integer> unsuccessfulCallAttempts = Input.absent();
        private Input<Integer> leadCallsNotAnswered = Input.absent();
        private Input<List<String>> userDefinedTags = Input.absent();
        private Input<List<String>> productService = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> contactAssignedToId = Input.absent();
        private Input<String> contactBlockedForCallById = Input.absent();
        private Input<String> bulkUploadReference = Input.absent();
        private Input<String> assignmentMethod = Input.absent();
        private Input<String> customDataAddedFromAddContactForm = Input.absent();
        private Input<String> customAttributes = Input.absent();
        private Input<LeadLifecycleStage> leadLifecycleStage = Input.absent();
        private Input<LeadLifecycleStageSubCategory> leadLifecycleStageSubCategory = Input.absent();
        private Input<String> manualClosedReason = Input.absent();
        private Input<String> lastDealStageType = Input.absent();
        private Input<Integer> prospectingAttempts = Input.absent();
        private Input<String> lastProspectingDoneOn = Input.absent();
        private Input<String> firstProspectingDoneOn = Input.absent();
        private Input<String> nextProspectingDueOn = Input.absent();
        private Input<String> nextProspectingSetBy = Input.absent();
        private Input<String> nextProspectingNote = Input.absent();
        private Input<String> movedToOpportunityOn = Input.absent();
        private Input<String> movedToClosedOn = Input.absent();
        private Input<String> recentEngagementsUpdatedAt = Input.absent();
        private Input<String> openTaskDetail = Input.absent();
        private Input<String> paymentRequestDetail = Input.absent();
        private Input<String> lastPaymentStatus = Input.absent();
        private Input<List<String>> recentEngagements = Input.absent();
        private Input<String> latestRemark = Input.absent();
        private Input<String> openVideoCallDetail = Input.absent();
        private Input<String> lastClosedTaskDetail = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder accountPriority(String str) {
            this.accountPriority = Input.fromNullable(str);
            return this;
        }

        public Builder activeDealStage(String str) {
            this.activeDealStage = Input.fromNullable(str);
            return this;
        }

        public Builder activeDealStageUpdatedAt(String str) {
            this.activeDealStageUpdatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder addedById(String str) {
            this.addedById = Input.fromNullable(str);
            return this;
        }

        public Builder addresses(List<AddressInput> list) {
            this.addresses = Input.fromNullable(list);
            return this;
        }

        public Builder assignedToId(String str) {
            this.assignedToId = Input.fromNullable(str);
            return this;
        }

        public Builder assignmentMethod(String str) {
            this.assignmentMethod = Input.fromNullable(str);
            return this;
        }

        public Builder becameCustomerOn(String str) {
            this.becameCustomerOn = Input.fromNullable(str);
            return this;
        }

        public Builder blockedForCallById(String str) {
            this.blockedForCallById = Input.fromNullable(str);
            return this;
        }

        public Builder blockedForCallReason(String str) {
            this.blockedForCallReason = Input.fromNullable(str);
            return this;
        }

        public Builder blockedForCallUntil(String str) {
            this.blockedForCallUntil = Input.fromNullable(str);
            return this;
        }

        public UpdateContactInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateContactInput(this.id, this.accountId, this.ownerId, this.toBeAssigned, this.sharedOwners, this.primaryTeamId, this.sharedTeams, this.accountPriority, this.addedById, this.addresses, this.assignedToId, this.blockedForCallById, this.blockedForCallReason, this.blockedForCallUntil, this.callPriority, this.contactNumberDetail, this.businessDetail, this.contactSource, this.contactSourceDrillDownOne, this.contactSourceDrillDownTwo, this.contactSourceDrillDownThree, this.contactSourceDrillDownOneId, this.contactSourceDrillDownTwoId, this.contactSourceDrillDownThreeId, this.contactStatus, this.contactType, this.department, this.designation, this.lastRepeatEnquiryDate, this.lastRepeatEnquirySource, this.emails, this.externalReference, this.gender, this.isDecisionMaker, this.isPrivate, this.lockPeriod, this.name, this.preferredContactDays, this.profilePhotoUrl, this.referredBy, this.salutation, this.seniority, this.updatedById, this.hasTask, this.openTaskActivityType, this.lastCalledTime, this.lastCallDirection, this.lastCallOutcome, this.lastCallOutcomeNature, this.lastCallUserId, this.lastCallDuration, this.lastCallEngagementId, this.lastVisitTime, this.lastVisitOutcome, this.lastVisitOutcomeNature, this.lastVisitUserId, this.lastVisitEngagementId, this.lastEmailTime, this.lastEmailUserId, this.lastEmailEngagementId, this.lastWhatsappTime, this.lastWhatsappUserId, this.lastWhatsappEngagementId, this.lastWabaBroadcastTime, this.lastWabaBroadcastStatus, this.lastWabaBroadcastTemplate, this.lastWabaBroadcastReplyBody, this.lastWabaBroadcastReplyTime, this.lastWabaBroadcastReplyType, this.lastSmsTime, this.lastSmsUserId, this.lastSmsEngagementId, this.lastNoteAddedTime, this.lastNoteUserId, this.lastNoteEngagementId, this.lastTaskDoneTime, this.lastTaskDoneUserId, this.lastTaskDoneEngagementId, this.openTaskCount, this.lastKnownDisposition, this.lastKnownDispositionTime, this.lastLeadAssignmentDateTime, this.lastEngagementFromAccount, this.lastEngagementFromContact, this.freshLeadTag, this.noWorkAfterAssignment, this.needFollowUpTag, this.needFollowUpTagUpdatedAt, this.activeDealStage, this.activeDealStageUpdatedAt, this.dealDescription, this.isCustomer, this.becameCustomerOn, this.unsuccessfulCallAttempts, this.leadCallsNotAnswered, this.userDefinedTags, this.productService, this.createdAt, this.updatedAt, this.contactAssignedToId, this.contactBlockedForCallById, this.bulkUploadReference, this.assignmentMethod, this.customDataAddedFromAddContactForm, this.customAttributes, this.leadLifecycleStage, this.leadLifecycleStageSubCategory, this.manualClosedReason, this.lastDealStageType, this.prospectingAttempts, this.lastProspectingDoneOn, this.firstProspectingDoneOn, this.nextProspectingDueOn, this.nextProspectingSetBy, this.nextProspectingNote, this.movedToOpportunityOn, this.movedToClosedOn, this.recentEngagementsUpdatedAt, this.openTaskDetail, this.paymentRequestDetail, this.lastPaymentStatus, this.recentEngagements, this.latestRemark, this.openVideoCallDetail, this.lastClosedTaskDetail);
        }

        public Builder bulkUploadReference(String str) {
            this.bulkUploadReference = Input.fromNullable(str);
            return this;
        }

        public Builder businessDetail(List<BusinessDetailInput> list) {
            this.businessDetail = Input.fromNullable(list);
            return this;
        }

        public Builder callPriority(String str) {
            this.callPriority = Input.fromNullable(str);
            return this;
        }

        public Builder contactAssignedToId(String str) {
            this.contactAssignedToId = Input.fromNullable(str);
            return this;
        }

        public Builder contactBlockedForCallById(String str) {
            this.contactBlockedForCallById = Input.fromNullable(str);
            return this;
        }

        public Builder contactNumberDetail(List<ContactNumberDetailInput> list) {
            this.contactNumberDetail = Input.fromNullable(list);
            return this;
        }

        public Builder contactSource(String str) {
            this.contactSource = Input.fromNullable(str);
            return this;
        }

        public Builder contactSourceDrillDownOne(String str) {
            this.contactSourceDrillDownOne = Input.fromNullable(str);
            return this;
        }

        public Builder contactSourceDrillDownOneId(String str) {
            this.contactSourceDrillDownOneId = Input.fromNullable(str);
            return this;
        }

        public Builder contactSourceDrillDownThree(String str) {
            this.contactSourceDrillDownThree = Input.fromNullable(str);
            return this;
        }

        public Builder contactSourceDrillDownThreeId(String str) {
            this.contactSourceDrillDownThreeId = Input.fromNullable(str);
            return this;
        }

        public Builder contactSourceDrillDownTwo(String str) {
            this.contactSourceDrillDownTwo = Input.fromNullable(str);
            return this;
        }

        public Builder contactSourceDrillDownTwoId(String str) {
            this.contactSourceDrillDownTwoId = Input.fromNullable(str);
            return this;
        }

        public Builder contactStatus(ContactStatus contactStatus) {
            this.contactStatus = Input.fromNullable(contactStatus);
            return this;
        }

        public Builder contactType(String str) {
            this.contactType = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder customAttributes(String str) {
            this.customAttributes = Input.fromNullable(str);
            return this;
        }

        public Builder customDataAddedFromAddContactForm(String str) {
            this.customDataAddedFromAddContactForm = Input.fromNullable(str);
            return this;
        }

        public Builder dealDescription(String str) {
            this.dealDescription = Input.fromNullable(str);
            return this;
        }

        public Builder department(String str) {
            this.department = Input.fromNullable(str);
            return this;
        }

        public Builder designation(String str) {
            this.designation = Input.fromNullable(str);
            return this;
        }

        public Builder emails(List<EmailInput> list) {
            this.emails = Input.fromNullable(list);
            return this;
        }

        public Builder externalReference(List<ExternalReferenceInput> list) {
            this.externalReference = Input.fromNullable(list);
            return this;
        }

        public Builder firstProspectingDoneOn(String str) {
            this.firstProspectingDoneOn = Input.fromNullable(str);
            return this;
        }

        public Builder freshLeadTag(String str) {
            this.freshLeadTag = Input.fromNullable(str);
            return this;
        }

        public Builder gender(String str) {
            this.gender = Input.fromNullable(str);
            return this;
        }

        public Builder hasTask(Boolean bool) {
            this.hasTask = Input.fromNullable(bool);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder isCustomer(String str) {
            this.isCustomer = Input.fromNullable(str);
            return this;
        }

        public Builder isDecisionMaker(Boolean bool) {
            this.isDecisionMaker = Input.fromNullable(bool);
            return this;
        }

        public Builder isPrivate(Boolean bool) {
            this.isPrivate = Input.fromNullable(bool);
            return this;
        }

        public Builder lastCallDirection(CallDirection callDirection) {
            this.lastCallDirection = Input.fromNullable(callDirection);
            return this;
        }

        public Builder lastCallDuration(Integer num) {
            this.lastCallDuration = Input.fromNullable(num);
            return this;
        }

        public Builder lastCallEngagementId(String str) {
            this.lastCallEngagementId = Input.fromNullable(str);
            return this;
        }

        public Builder lastCallOutcome(String str) {
            this.lastCallOutcome = Input.fromNullable(str);
            return this;
        }

        public Builder lastCallOutcomeNature(String str) {
            this.lastCallOutcomeNature = Input.fromNullable(str);
            return this;
        }

        public Builder lastCallUserId(String str) {
            this.lastCallUserId = Input.fromNullable(str);
            return this;
        }

        public Builder lastCalledTime(String str) {
            this.lastCalledTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastClosedTaskDetail(String str) {
            this.lastClosedTaskDetail = Input.fromNullable(str);
            return this;
        }

        public Builder lastDealStageType(String str) {
            this.lastDealStageType = Input.fromNullable(str);
            return this;
        }

        public Builder lastEmailEngagementId(String str) {
            this.lastEmailEngagementId = Input.fromNullable(str);
            return this;
        }

        public Builder lastEmailTime(String str) {
            this.lastEmailTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastEmailUserId(String str) {
            this.lastEmailUserId = Input.fromNullable(str);
            return this;
        }

        public Builder lastEngagementFromAccount(String str) {
            this.lastEngagementFromAccount = Input.fromNullable(str);
            return this;
        }

        public Builder lastEngagementFromContact(String str) {
            this.lastEngagementFromContact = Input.fromNullable(str);
            return this;
        }

        public Builder lastKnownDisposition(String str) {
            this.lastKnownDisposition = Input.fromNullable(str);
            return this;
        }

        public Builder lastKnownDispositionTime(String str) {
            this.lastKnownDispositionTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastLeadAssignmentDateTime(String str) {
            this.lastLeadAssignmentDateTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastNoteAddedTime(String str) {
            this.lastNoteAddedTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastNoteEngagementId(String str) {
            this.lastNoteEngagementId = Input.fromNullable(str);
            return this;
        }

        public Builder lastNoteUserId(String str) {
            this.lastNoteUserId = Input.fromNullable(str);
            return this;
        }

        public Builder lastPaymentStatus(String str) {
            this.lastPaymentStatus = Input.fromNullable(str);
            return this;
        }

        public Builder lastProspectingDoneOn(String str) {
            this.lastProspectingDoneOn = Input.fromNullable(str);
            return this;
        }

        public Builder lastRepeatEnquiryDate(String str) {
            this.lastRepeatEnquiryDate = Input.fromNullable(str);
            return this;
        }

        public Builder lastRepeatEnquirySource(String str) {
            this.lastRepeatEnquirySource = Input.fromNullable(str);
            return this;
        }

        public Builder lastSmsEngagementId(String str) {
            this.lastSmsEngagementId = Input.fromNullable(str);
            return this;
        }

        public Builder lastSmsTime(String str) {
            this.lastSmsTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastSmsUserId(String str) {
            this.lastSmsUserId = Input.fromNullable(str);
            return this;
        }

        public Builder lastTaskDoneEngagementId(String str) {
            this.lastTaskDoneEngagementId = Input.fromNullable(str);
            return this;
        }

        public Builder lastTaskDoneTime(String str) {
            this.lastTaskDoneTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastTaskDoneUserId(String str) {
            this.lastTaskDoneUserId = Input.fromNullable(str);
            return this;
        }

        public Builder lastVisitEngagementId(String str) {
            this.lastVisitEngagementId = Input.fromNullable(str);
            return this;
        }

        public Builder lastVisitOutcome(String str) {
            this.lastVisitOutcome = Input.fromNullable(str);
            return this;
        }

        public Builder lastVisitOutcomeNature(String str) {
            this.lastVisitOutcomeNature = Input.fromNullable(str);
            return this;
        }

        public Builder lastVisitTime(String str) {
            this.lastVisitTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastVisitUserId(String str) {
            this.lastVisitUserId = Input.fromNullable(str);
            return this;
        }

        public Builder lastWabaBroadcastReplyBody(String str) {
            this.lastWabaBroadcastReplyBody = Input.fromNullable(str);
            return this;
        }

        public Builder lastWabaBroadcastReplyTime(String str) {
            this.lastWabaBroadcastReplyTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastWabaBroadcastReplyType(String str) {
            this.lastWabaBroadcastReplyType = Input.fromNullable(str);
            return this;
        }

        public Builder lastWabaBroadcastStatus(String str) {
            this.lastWabaBroadcastStatus = Input.fromNullable(str);
            return this;
        }

        public Builder lastWabaBroadcastTemplate(String str) {
            this.lastWabaBroadcastTemplate = Input.fromNullable(str);
            return this;
        }

        public Builder lastWabaBroadcastTime(String str) {
            this.lastWabaBroadcastTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastWhatsappEngagementId(String str) {
            this.lastWhatsappEngagementId = Input.fromNullable(str);
            return this;
        }

        public Builder lastWhatsappTime(String str) {
            this.lastWhatsappTime = Input.fromNullable(str);
            return this;
        }

        public Builder lastWhatsappUserId(String str) {
            this.lastWhatsappUserId = Input.fromNullable(str);
            return this;
        }

        public Builder latestRemark(String str) {
            this.latestRemark = Input.fromNullable(str);
            return this;
        }

        public Builder leadCallsNotAnswered(Integer num) {
            this.leadCallsNotAnswered = Input.fromNullable(num);
            return this;
        }

        public Builder leadLifecycleStage(LeadLifecycleStage leadLifecycleStage) {
            this.leadLifecycleStage = Input.fromNullable(leadLifecycleStage);
            return this;
        }

        public Builder leadLifecycleStageSubCategory(LeadLifecycleStageSubCategory leadLifecycleStageSubCategory) {
            this.leadLifecycleStageSubCategory = Input.fromNullable(leadLifecycleStageSubCategory);
            return this;
        }

        public Builder lockPeriod(String str) {
            this.lockPeriod = Input.fromNullable(str);
            return this;
        }

        public Builder manualClosedReason(String str) {
            this.manualClosedReason = Input.fromNullable(str);
            return this;
        }

        public Builder movedToClosedOn(String str) {
            this.movedToClosedOn = Input.fromNullable(str);
            return this;
        }

        public Builder movedToOpportunityOn(String str) {
            this.movedToOpportunityOn = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder needFollowUpTag(String str) {
            this.needFollowUpTag = Input.fromNullable(str);
            return this;
        }

        public Builder needFollowUpTagUpdatedAt(String str) {
            this.needFollowUpTagUpdatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder nextProspectingDueOn(String str) {
            this.nextProspectingDueOn = Input.fromNullable(str);
            return this;
        }

        public Builder nextProspectingNote(String str) {
            this.nextProspectingNote = Input.fromNullable(str);
            return this;
        }

        public Builder nextProspectingSetBy(String str) {
            this.nextProspectingSetBy = Input.fromNullable(str);
            return this;
        }

        public Builder noWorkAfterAssignment(String str) {
            this.noWorkAfterAssignment = Input.fromNullable(str);
            return this;
        }

        public Builder openTaskActivityType(TaskActivityType taskActivityType) {
            this.openTaskActivityType = Input.fromNullable(taskActivityType);
            return this;
        }

        public Builder openTaskCount(Integer num) {
            this.openTaskCount = Input.fromNullable(num);
            return this;
        }

        public Builder openTaskDetail(String str) {
            this.openTaskDetail = Input.fromNullable(str);
            return this;
        }

        public Builder openVideoCallDetail(String str) {
            this.openVideoCallDetail = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder paymentRequestDetail(String str) {
            this.paymentRequestDetail = Input.fromNullable(str);
            return this;
        }

        public Builder preferredContactDays(List<Day> list) {
            this.preferredContactDays = Input.fromNullable(list);
            return this;
        }

        public Builder primaryTeamId(String str) {
            this.primaryTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder productService(List<String> list) {
            this.productService = Input.fromNullable(list);
            return this;
        }

        public Builder profilePhotoUrl(String str) {
            this.profilePhotoUrl = Input.fromNullable(str);
            return this;
        }

        public Builder prospectingAttempts(Integer num) {
            this.prospectingAttempts = Input.fromNullable(num);
            return this;
        }

        public Builder recentEngagements(List<String> list) {
            this.recentEngagements = Input.fromNullable(list);
            return this;
        }

        public Builder recentEngagementsUpdatedAt(String str) {
            this.recentEngagementsUpdatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder referredBy(String str) {
            this.referredBy = Input.fromNullable(str);
            return this;
        }

        public Builder salutation(String str) {
            this.salutation = Input.fromNullable(str);
            return this;
        }

        public Builder seniority(Seniority seniority) {
            this.seniority = Input.fromNullable(seniority);
            return this;
        }

        public Builder sharedOwners(List<String> list) {
            this.sharedOwners = Input.fromNullable(list);
            return this;
        }

        public Builder sharedTeams(List<String> list) {
            this.sharedTeams = Input.fromNullable(list);
            return this;
        }

        public Builder toBeAssigned(ContactAssignmentStatus contactAssignmentStatus) {
            this.toBeAssigned = Input.fromNullable(contactAssignmentStatus);
            return this;
        }

        public Builder unsuccessfulCallAttempts(Integer num) {
            this.unsuccessfulCallAttempts = Input.fromNullable(num);
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

        public Builder userDefinedTags(List<String> list) {
            this.userDefinedTags = Input.fromNullable(list);
            return this;
        }
    }

    public UpdateContactInput(String str, Input<String> input, Input<String> input2, Input<ContactAssignmentStatus> input3, Input<List<String>> input4, Input<String> input5, Input<List<String>> input6, Input<String> input7, Input<String> input8, Input<List<AddressInput>> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<List<ContactNumberDetailInput>> input15, Input<List<BusinessDetailInput>> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<ContactStatus> input24, Input<String> input25, Input<String> input26, Input<String> input27, Input<String> input28, Input<String> input29, Input<List<EmailInput>> input30, Input<List<ExternalReferenceInput>> input31, Input<String> input32, Input<Boolean> input33, Input<Boolean> input34, Input<String> input35, Input<String> input36, Input<List<Day>> input37, Input<String> input38, Input<String> input39, Input<String> input40, Input<Seniority> input41, Input<String> input42, Input<Boolean> input43, Input<TaskActivityType> input44, Input<String> input45, Input<CallDirection> input46, Input<String> input47, Input<String> input48, Input<String> input49, Input<Integer> input50, Input<String> input51, Input<String> input52, Input<String> input53, Input<String> input54, Input<String> input55, Input<String> input56, Input<String> input57, Input<String> input58, Input<String> input59, Input<String> input60, Input<String> input61, Input<String> input62, Input<String> input63, Input<String> input64, Input<String> input65, Input<String> input66, Input<String> input67, Input<String> input68, Input<String> input69, Input<String> input70, Input<String> input71, Input<String> input72, Input<String> input73, Input<String> input74, Input<String> input75, Input<String> input76, Input<String> input77, Input<Integer> input78, Input<String> input79, Input<String> input80, Input<String> input81, Input<String> input82, Input<String> input83, Input<String> input84, Input<String> input85, Input<String> input86, Input<String> input87, Input<String> input88, Input<String> input89, Input<String> input90, Input<String> input91, Input<String> input92, Input<Integer> input93, Input<Integer> input94, Input<List<String>> input95, Input<List<String>> input96, Input<String> input97, Input<String> input98, Input<String> input99, Input<String> input100, Input<String> input101, Input<String> input102, Input<String> input103, Input<String> input104, Input<LeadLifecycleStage> input105, Input<LeadLifecycleStageSubCategory> input106, Input<String> input107, Input<String> input108, Input<Integer> input109, Input<String> input110, Input<String> input111, Input<String> input112, Input<String> input113, Input<String> input114, Input<String> input115, Input<String> input116, Input<String> input117, Input<String> input118, Input<String> input119, Input<String> input120, Input<List<String>> input121, Input<String> input122, Input<String> input123, Input<String> input124) {
        this.id = str;
        this.accountId = input;
        this.ownerId = input2;
        this.toBeAssigned = input3;
        this.sharedOwners = input4;
        this.primaryTeamId = input5;
        this.sharedTeams = input6;
        this.accountPriority = input7;
        this.addedById = input8;
        this.addresses = input9;
        this.assignedToId = input10;
        this.blockedForCallById = input11;
        this.blockedForCallReason = input12;
        this.blockedForCallUntil = input13;
        this.callPriority = input14;
        this.contactNumberDetail = input15;
        this.businessDetail = input16;
        this.contactSource = input17;
        this.contactSourceDrillDownOne = input18;
        this.contactSourceDrillDownTwo = input19;
        this.contactSourceDrillDownThree = input20;
        this.contactSourceDrillDownOneId = input21;
        this.contactSourceDrillDownTwoId = input22;
        this.contactSourceDrillDownThreeId = input23;
        this.contactStatus = input24;
        this.contactType = input25;
        this.department = input26;
        this.designation = input27;
        this.lastRepeatEnquiryDate = input28;
        this.lastRepeatEnquirySource = input29;
        this.emails = input30;
        this.externalReference = input31;
        this.gender = input32;
        this.isDecisionMaker = input33;
        this.isPrivate = input34;
        this.lockPeriod = input35;
        this.name = input36;
        this.preferredContactDays = input37;
        this.profilePhotoUrl = input38;
        this.referredBy = input39;
        this.salutation = input40;
        this.seniority = input41;
        this.updatedById = input42;
        this.hasTask = input43;
        this.openTaskActivityType = input44;
        this.lastCalledTime = input45;
        this.lastCallDirection = input46;
        this.lastCallOutcome = input47;
        this.lastCallOutcomeNature = input48;
        this.lastCallUserId = input49;
        this.lastCallDuration = input50;
        this.lastCallEngagementId = input51;
        this.lastVisitTime = input52;
        this.lastVisitOutcome = input53;
        this.lastVisitOutcomeNature = input54;
        this.lastVisitUserId = input55;
        this.lastVisitEngagementId = input56;
        this.lastEmailTime = input57;
        this.lastEmailUserId = input58;
        this.lastEmailEngagementId = input59;
        this.lastWhatsappTime = input60;
        this.lastWhatsappUserId = input61;
        this.lastWhatsappEngagementId = input62;
        this.lastWabaBroadcastTime = input63;
        this.lastWabaBroadcastStatus = input64;
        this.lastWabaBroadcastTemplate = input65;
        this.lastWabaBroadcastReplyBody = input66;
        this.lastWabaBroadcastReplyTime = input67;
        this.lastWabaBroadcastReplyType = input68;
        this.lastSmsTime = input69;
        this.lastSmsUserId = input70;
        this.lastSmsEngagementId = input71;
        this.lastNoteAddedTime = input72;
        this.lastNoteUserId = input73;
        this.lastNoteEngagementId = input74;
        this.lastTaskDoneTime = input75;
        this.lastTaskDoneUserId = input76;
        this.lastTaskDoneEngagementId = input77;
        this.openTaskCount = input78;
        this.lastKnownDisposition = input79;
        this.lastKnownDispositionTime = input80;
        this.lastLeadAssignmentDateTime = input81;
        this.lastEngagementFromAccount = input82;
        this.lastEngagementFromContact = input83;
        this.freshLeadTag = input84;
        this.noWorkAfterAssignment = input85;
        this.needFollowUpTag = input86;
        this.needFollowUpTagUpdatedAt = input87;
        this.activeDealStage = input88;
        this.activeDealStageUpdatedAt = input89;
        this.dealDescription = input90;
        this.isCustomer = input91;
        this.becameCustomerOn = input92;
        this.unsuccessfulCallAttempts = input93;
        this.leadCallsNotAnswered = input94;
        this.userDefinedTags = input95;
        this.productService = input96;
        this.createdAt = input97;
        this.updatedAt = input98;
        this.contactAssignedToId = input99;
        this.contactBlockedForCallById = input100;
        this.bulkUploadReference = input101;
        this.assignmentMethod = input102;
        this.customDataAddedFromAddContactForm = input103;
        this.customAttributes = input104;
        this.leadLifecycleStage = input105;
        this.leadLifecycleStageSubCategory = input106;
        this.manualClosedReason = input107;
        this.lastDealStageType = input108;
        this.prospectingAttempts = input109;
        this.lastProspectingDoneOn = input110;
        this.firstProspectingDoneOn = input111;
        this.nextProspectingDueOn = input112;
        this.nextProspectingSetBy = input113;
        this.nextProspectingNote = input114;
        this.movedToOpportunityOn = input115;
        this.movedToClosedOn = input116;
        this.recentEngagementsUpdatedAt = input117;
        this.openTaskDetail = input118;
        this.paymentRequestDetail = input119;
        this.lastPaymentStatus = input120;
        this.recentEngagements = input121;
        this.latestRemark = input122;
        this.openVideoCallDetail = input123;
        this.lastClosedTaskDetail = input124;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String accountPriority() {
        return this.accountPriority.value;
    }

    public String activeDealStage() {
        return this.activeDealStage.value;
    }

    public String activeDealStageUpdatedAt() {
        return this.activeDealStageUpdatedAt.value;
    }

    public String addedById() {
        return this.addedById.value;
    }

    public List<AddressInput> addresses() {
        return this.addresses.value;
    }

    public String assignedToId() {
        return this.assignedToId.value;
    }

    public String assignmentMethod() {
        return this.assignmentMethod.value;
    }

    public String becameCustomerOn() {
        return this.becameCustomerOn.value;
    }

    public String blockedForCallById() {
        return this.blockedForCallById.value;
    }

    public String blockedForCallReason() {
        return this.blockedForCallReason.value;
    }

    public String blockedForCallUntil() {
        return this.blockedForCallUntil.value;
    }

    public String bulkUploadReference() {
        return this.bulkUploadReference.value;
    }

    public List<BusinessDetailInput> businessDetail() {
        return this.businessDetail.value;
    }

    public String callPriority() {
        return this.callPriority.value;
    }

    public String contactAssignedToId() {
        return this.contactAssignedToId.value;
    }

    public String contactBlockedForCallById() {
        return this.contactBlockedForCallById.value;
    }

    public List<ContactNumberDetailInput> contactNumberDetail() {
        return this.contactNumberDetail.value;
    }

    public String contactSource() {
        return this.contactSource.value;
    }

    public String contactSourceDrillDownOne() {
        return this.contactSourceDrillDownOne.value;
    }

    public String contactSourceDrillDownOneId() {
        return this.contactSourceDrillDownOneId.value;
    }

    public String contactSourceDrillDownThree() {
        return this.contactSourceDrillDownThree.value;
    }

    public String contactSourceDrillDownThreeId() {
        return this.contactSourceDrillDownThreeId.value;
    }

    public String contactSourceDrillDownTwo() {
        return this.contactSourceDrillDownTwo.value;
    }

    public String contactSourceDrillDownTwoId() {
        return this.contactSourceDrillDownTwoId.value;
    }

    public ContactStatus contactStatus() {
        return this.contactStatus.value;
    }

    public String contactType() {
        return this.contactType.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String customAttributes() {
        return this.customAttributes.value;
    }

    public String customDataAddedFromAddContactForm() {
        return this.customDataAddedFromAddContactForm.value;
    }

    public String dealDescription() {
        return this.dealDescription.value;
    }

    public String department() {
        return this.department.value;
    }

    public String designation() {
        return this.designation.value;
    }

    public List<EmailInput> emails() {
        return this.emails.value;
    }

    public List<ExternalReferenceInput> externalReference() {
        return this.externalReference.value;
    }

    public String firstProspectingDoneOn() {
        return this.firstProspectingDoneOn.value;
    }

    public String freshLeadTag() {
        return this.freshLeadTag.value;
    }

    public String gender() {
        return this.gender.value;
    }

    public Boolean hasTask() {
        return this.hasTask.value;
    }

    public String id() {
        return this.id;
    }

    public String isCustomer() {
        return this.isCustomer.value;
    }

    public Boolean isDecisionMaker() {
        return this.isDecisionMaker.value;
    }

    public Boolean isPrivate() {
        return this.isPrivate.value;
    }

    public CallDirection lastCallDirection() {
        return this.lastCallDirection.value;
    }

    public Integer lastCallDuration() {
        return this.lastCallDuration.value;
    }

    public String lastCallEngagementId() {
        return this.lastCallEngagementId.value;
    }

    public String lastCallOutcome() {
        return this.lastCallOutcome.value;
    }

    public String lastCallOutcomeNature() {
        return this.lastCallOutcomeNature.value;
    }

    public String lastCallUserId() {
        return this.lastCallUserId.value;
    }

    public String lastCalledTime() {
        return this.lastCalledTime.value;
    }

    public String lastClosedTaskDetail() {
        return this.lastClosedTaskDetail.value;
    }

    public String lastDealStageType() {
        return this.lastDealStageType.value;
    }

    public String lastEmailEngagementId() {
        return this.lastEmailEngagementId.value;
    }

    public String lastEmailTime() {
        return this.lastEmailTime.value;
    }

    public String lastEmailUserId() {
        return this.lastEmailUserId.value;
    }

    public String lastEngagementFromAccount() {
        return this.lastEngagementFromAccount.value;
    }

    public String lastEngagementFromContact() {
        return this.lastEngagementFromContact.value;
    }

    public String lastKnownDisposition() {
        return this.lastKnownDisposition.value;
    }

    public String lastKnownDispositionTime() {
        return this.lastKnownDispositionTime.value;
    }

    public String lastLeadAssignmentDateTime() {
        return this.lastLeadAssignmentDateTime.value;
    }

    public String lastNoteAddedTime() {
        return this.lastNoteAddedTime.value;
    }

    public String lastNoteEngagementId() {
        return this.lastNoteEngagementId.value;
    }

    public String lastNoteUserId() {
        return this.lastNoteUserId.value;
    }

    public String lastPaymentStatus() {
        return this.lastPaymentStatus.value;
    }

    public String lastProspectingDoneOn() {
        return this.lastProspectingDoneOn.value;
    }

    public String lastRepeatEnquiryDate() {
        return this.lastRepeatEnquiryDate.value;
    }

    public String lastRepeatEnquirySource() {
        return this.lastRepeatEnquirySource.value;
    }

    public String lastSmsEngagementId() {
        return this.lastSmsEngagementId.value;
    }

    public String lastSmsTime() {
        return this.lastSmsTime.value;
    }

    public String lastSmsUserId() {
        return this.lastSmsUserId.value;
    }

    public String lastTaskDoneEngagementId() {
        return this.lastTaskDoneEngagementId.value;
    }

    public String lastTaskDoneTime() {
        return this.lastTaskDoneTime.value;
    }

    public String lastTaskDoneUserId() {
        return this.lastTaskDoneUserId.value;
    }

    public String lastVisitEngagementId() {
        return this.lastVisitEngagementId.value;
    }

    public String lastVisitOutcome() {
        return this.lastVisitOutcome.value;
    }

    public String lastVisitOutcomeNature() {
        return this.lastVisitOutcomeNature.value;
    }

    public String lastVisitTime() {
        return this.lastVisitTime.value;
    }

    public String lastVisitUserId() {
        return this.lastVisitUserId.value;
    }

    public String lastWabaBroadcastReplyBody() {
        return this.lastWabaBroadcastReplyBody.value;
    }

    public String lastWabaBroadcastReplyTime() {
        return this.lastWabaBroadcastReplyTime.value;
    }

    public String lastWabaBroadcastReplyType() {
        return this.lastWabaBroadcastReplyType.value;
    }

    public String lastWabaBroadcastStatus() {
        return this.lastWabaBroadcastStatus.value;
    }

    public String lastWabaBroadcastTemplate() {
        return this.lastWabaBroadcastTemplate.value;
    }

    public String lastWabaBroadcastTime() {
        return this.lastWabaBroadcastTime.value;
    }

    public String lastWhatsappEngagementId() {
        return this.lastWhatsappEngagementId.value;
    }

    public String lastWhatsappTime() {
        return this.lastWhatsappTime.value;
    }

    public String lastWhatsappUserId() {
        return this.lastWhatsappUserId.value;
    }

    public String latestRemark() {
        return this.latestRemark.value;
    }

    public Integer leadCallsNotAnswered() {
        return this.leadCallsNotAnswered.value;
    }

    public LeadLifecycleStage leadLifecycleStage() {
        return this.leadLifecycleStage.value;
    }

    public LeadLifecycleStageSubCategory leadLifecycleStageSubCategory() {
        return this.leadLifecycleStageSubCategory.value;
    }

    public String lockPeriod() {
        return this.lockPeriod.value;
    }

    public String manualClosedReason() {
        return this.manualClosedReason.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateContactInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateContactInput.this.id);
                if (UpdateContactInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateContactInput.this.accountId.value);
                }
                if (UpdateContactInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) UpdateContactInput.this.ownerId.value);
                }
                if (UpdateContactInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeString("toBeAssigned", UpdateContactInput.this.toBeAssigned.value != 0 ? ((ContactAssignmentStatus) UpdateContactInput.this.toBeAssigned.value).name() : null);
                }
                if (UpdateContactInput.this.sharedOwners.defined) {
                    inputFieldWriter.writeList("sharedOwners", UpdateContactInput.this.sharedOwners.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateContactInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateContactInput.this.sharedOwners.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.ID, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateContactInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) UpdateContactInput.this.primaryTeamId.value);
                }
                if (UpdateContactInput.this.sharedTeams.defined) {
                    inputFieldWriter.writeList("sharedTeams", UpdateContactInput.this.sharedTeams.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateContactInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateContactInput.this.sharedTeams.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.ID, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateContactInput.this.accountPriority.defined) {
                    inputFieldWriter.writeString("accountPriority", (String) UpdateContactInput.this.accountPriority.value);
                }
                if (UpdateContactInput.this.addedById.defined) {
                    inputFieldWriter.writeString("addedById", (String) UpdateContactInput.this.addedById.value);
                }
                if (UpdateContactInput.this.addresses.defined) {
                    inputFieldWriter.writeList("addresses", UpdateContactInput.this.addresses.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateContactInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateContactInput.this.addresses.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((AddressInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateContactInput.this.assignedToId.defined) {
                    inputFieldWriter.writeString("assignedToId", (String) UpdateContactInput.this.assignedToId.value);
                }
                if (UpdateContactInput.this.blockedForCallById.defined) {
                    inputFieldWriter.writeString("blockedForCallById", (String) UpdateContactInput.this.blockedForCallById.value);
                }
                if (UpdateContactInput.this.blockedForCallReason.defined) {
                    inputFieldWriter.writeString("blockedForCallReason", (String) UpdateContactInput.this.blockedForCallReason.value);
                }
                if (UpdateContactInput.this.blockedForCallUntil.defined) {
                    inputFieldWriter.writeString("blockedForCallUntil", (String) UpdateContactInput.this.blockedForCallUntil.value);
                }
                if (UpdateContactInput.this.callPriority.defined) {
                    inputFieldWriter.writeString("callPriority", (String) UpdateContactInput.this.callPriority.value);
                }
                if (UpdateContactInput.this.contactNumberDetail.defined) {
                    inputFieldWriter.writeList("contactNumberDetail", UpdateContactInput.this.contactNumberDetail.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateContactInput.1.4
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateContactInput.this.contactNumberDetail.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ContactNumberDetailInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateContactInput.this.businessDetail.defined) {
                    inputFieldWriter.writeList("businessDetail", UpdateContactInput.this.businessDetail.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateContactInput.1.5
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateContactInput.this.businessDetail.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BusinessDetailInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateContactInput.this.contactSource.defined) {
                    inputFieldWriter.writeString("contactSource", (String) UpdateContactInput.this.contactSource.value);
                }
                if (UpdateContactInput.this.contactSourceDrillDownOne.defined) {
                    inputFieldWriter.writeString("contactSourceDrillDownOne", (String) UpdateContactInput.this.contactSourceDrillDownOne.value);
                }
                if (UpdateContactInput.this.contactSourceDrillDownTwo.defined) {
                    inputFieldWriter.writeString("contactSourceDrillDownTwo", (String) UpdateContactInput.this.contactSourceDrillDownTwo.value);
                }
                if (UpdateContactInput.this.contactSourceDrillDownThree.defined) {
                    inputFieldWriter.writeString("contactSourceDrillDownThree", (String) UpdateContactInput.this.contactSourceDrillDownThree.value);
                }
                if (UpdateContactInput.this.contactSourceDrillDownOneId.defined) {
                    inputFieldWriter.writeString("contactSourceDrillDownOneId", (String) UpdateContactInput.this.contactSourceDrillDownOneId.value);
                }
                if (UpdateContactInput.this.contactSourceDrillDownTwoId.defined) {
                    inputFieldWriter.writeString("contactSourceDrillDownTwoId", (String) UpdateContactInput.this.contactSourceDrillDownTwoId.value);
                }
                if (UpdateContactInput.this.contactSourceDrillDownThreeId.defined) {
                    inputFieldWriter.writeString("contactSourceDrillDownThreeId", (String) UpdateContactInput.this.contactSourceDrillDownThreeId.value);
                }
                if (UpdateContactInput.this.contactStatus.defined) {
                    inputFieldWriter.writeString("contactStatus", UpdateContactInput.this.contactStatus.value != 0 ? ((ContactStatus) UpdateContactInput.this.contactStatus.value).name() : null);
                }
                if (UpdateContactInput.this.contactType.defined) {
                    inputFieldWriter.writeString("contactType", (String) UpdateContactInput.this.contactType.value);
                }
                if (UpdateContactInput.this.department.defined) {
                    inputFieldWriter.writeString("department", (String) UpdateContactInput.this.department.value);
                }
                if (UpdateContactInput.this.designation.defined) {
                    inputFieldWriter.writeString("designation", (String) UpdateContactInput.this.designation.value);
                }
                if (UpdateContactInput.this.lastRepeatEnquiryDate.defined) {
                    inputFieldWriter.writeString("lastRepeatEnquiryDate", (String) UpdateContactInput.this.lastRepeatEnquiryDate.value);
                }
                if (UpdateContactInput.this.lastRepeatEnquirySource.defined) {
                    inputFieldWriter.writeString("lastRepeatEnquirySource", (String) UpdateContactInput.this.lastRepeatEnquirySource.value);
                }
                if (UpdateContactInput.this.emails.defined) {
                    inputFieldWriter.writeList("emails", UpdateContactInput.this.emails.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateContactInput.1.6
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateContactInput.this.emails.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((EmailInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateContactInput.this.externalReference.defined) {
                    inputFieldWriter.writeList("externalReference", UpdateContactInput.this.externalReference.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateContactInput.1.7
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateContactInput.this.externalReference.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ExternalReferenceInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateContactInput.this.gender.defined) {
                    inputFieldWriter.writeString("gender", (String) UpdateContactInput.this.gender.value);
                }
                if (UpdateContactInput.this.isDecisionMaker.defined) {
                    inputFieldWriter.writeBoolean("isDecisionMaker", (Boolean) UpdateContactInput.this.isDecisionMaker.value);
                }
                if (UpdateContactInput.this.isPrivate.defined) {
                    inputFieldWriter.writeBoolean("isPrivate", (Boolean) UpdateContactInput.this.isPrivate.value);
                }
                if (UpdateContactInput.this.lockPeriod.defined) {
                    inputFieldWriter.writeString("lockPeriod", (String) UpdateContactInput.this.lockPeriod.value);
                }
                if (UpdateContactInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) UpdateContactInput.this.name.value);
                }
                if (UpdateContactInput.this.preferredContactDays.defined) {
                    inputFieldWriter.writeList("preferredContactDays", UpdateContactInput.this.preferredContactDays.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateContactInput.1.8
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateContactInput.this.preferredContactDays.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString(((Day) it.next()).name());
                            }
                        }
                    } : null);
                }
                if (UpdateContactInput.this.profilePhotoUrl.defined) {
                    inputFieldWriter.writeString("profilePhotoUrl", (String) UpdateContactInput.this.profilePhotoUrl.value);
                }
                if (UpdateContactInput.this.referredBy.defined) {
                    inputFieldWriter.writeString("referredBy", (String) UpdateContactInput.this.referredBy.value);
                }
                if (UpdateContactInput.this.salutation.defined) {
                    inputFieldWriter.writeString("salutation", (String) UpdateContactInput.this.salutation.value);
                }
                if (UpdateContactInput.this.seniority.defined) {
                    inputFieldWriter.writeString("seniority", UpdateContactInput.this.seniority.value != 0 ? ((Seniority) UpdateContactInput.this.seniority.value).name() : null);
                }
                if (UpdateContactInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateContactInput.this.updatedById.value);
                }
                if (UpdateContactInput.this.hasTask.defined) {
                    inputFieldWriter.writeBoolean("hasTask", (Boolean) UpdateContactInput.this.hasTask.value);
                }
                if (UpdateContactInput.this.openTaskActivityType.defined) {
                    inputFieldWriter.writeString("openTaskActivityType", UpdateContactInput.this.openTaskActivityType.value != 0 ? ((TaskActivityType) UpdateContactInput.this.openTaskActivityType.value).name() : null);
                }
                if (UpdateContactInput.this.lastCalledTime.defined) {
                    inputFieldWriter.writeString("lastCalledTime", (String) UpdateContactInput.this.lastCalledTime.value);
                }
                if (UpdateContactInput.this.lastCallDirection.defined) {
                    inputFieldWriter.writeString("lastCallDirection", UpdateContactInput.this.lastCallDirection.value != 0 ? ((CallDirection) UpdateContactInput.this.lastCallDirection.value).name() : null);
                }
                if (UpdateContactInput.this.lastCallOutcome.defined) {
                    inputFieldWriter.writeString("lastCallOutcome", (String) UpdateContactInput.this.lastCallOutcome.value);
                }
                if (UpdateContactInput.this.lastCallOutcomeNature.defined) {
                    inputFieldWriter.writeString("lastCallOutcomeNature", (String) UpdateContactInput.this.lastCallOutcomeNature.value);
                }
                if (UpdateContactInput.this.lastCallUserId.defined) {
                    inputFieldWriter.writeString("lastCallUserId", (String) UpdateContactInput.this.lastCallUserId.value);
                }
                if (UpdateContactInput.this.lastCallDuration.defined) {
                    inputFieldWriter.writeInt("lastCallDuration", (Integer) UpdateContactInput.this.lastCallDuration.value);
                }
                if (UpdateContactInput.this.lastCallEngagementId.defined) {
                    inputFieldWriter.writeString("lastCallEngagementId", (String) UpdateContactInput.this.lastCallEngagementId.value);
                }
                if (UpdateContactInput.this.lastVisitTime.defined) {
                    inputFieldWriter.writeString("lastVisitTime", (String) UpdateContactInput.this.lastVisitTime.value);
                }
                if (UpdateContactInput.this.lastVisitOutcome.defined) {
                    inputFieldWriter.writeString("lastVisitOutcome", (String) UpdateContactInput.this.lastVisitOutcome.value);
                }
                if (UpdateContactInput.this.lastVisitOutcomeNature.defined) {
                    inputFieldWriter.writeString("lastVisitOutcomeNature", (String) UpdateContactInput.this.lastVisitOutcomeNature.value);
                }
                if (UpdateContactInput.this.lastVisitUserId.defined) {
                    inputFieldWriter.writeString("lastVisitUserId", (String) UpdateContactInput.this.lastVisitUserId.value);
                }
                if (UpdateContactInput.this.lastVisitEngagementId.defined) {
                    inputFieldWriter.writeString("lastVisitEngagementId", (String) UpdateContactInput.this.lastVisitEngagementId.value);
                }
                if (UpdateContactInput.this.lastEmailTime.defined) {
                    inputFieldWriter.writeString("lastEmailTime", (String) UpdateContactInput.this.lastEmailTime.value);
                }
                if (UpdateContactInput.this.lastEmailUserId.defined) {
                    inputFieldWriter.writeString("lastEmailUserId", (String) UpdateContactInput.this.lastEmailUserId.value);
                }
                if (UpdateContactInput.this.lastEmailEngagementId.defined) {
                    inputFieldWriter.writeString("lastEmailEngagementId", (String) UpdateContactInput.this.lastEmailEngagementId.value);
                }
                if (UpdateContactInput.this.lastWhatsappTime.defined) {
                    inputFieldWriter.writeString("lastWhatsappTime", (String) UpdateContactInput.this.lastWhatsappTime.value);
                }
                if (UpdateContactInput.this.lastWhatsappUserId.defined) {
                    inputFieldWriter.writeString("lastWhatsappUserId", (String) UpdateContactInput.this.lastWhatsappUserId.value);
                }
                if (UpdateContactInput.this.lastWhatsappEngagementId.defined) {
                    inputFieldWriter.writeString("lastWhatsappEngagementId", (String) UpdateContactInput.this.lastWhatsappEngagementId.value);
                }
                if (UpdateContactInput.this.lastWabaBroadcastTime.defined) {
                    inputFieldWriter.writeString("lastWabaBroadcastTime", (String) UpdateContactInput.this.lastWabaBroadcastTime.value);
                }
                if (UpdateContactInput.this.lastWabaBroadcastStatus.defined) {
                    inputFieldWriter.writeString("lastWabaBroadcastStatus", (String) UpdateContactInput.this.lastWabaBroadcastStatus.value);
                }
                if (UpdateContactInput.this.lastWabaBroadcastTemplate.defined) {
                    inputFieldWriter.writeString("lastWabaBroadcastTemplate", (String) UpdateContactInput.this.lastWabaBroadcastTemplate.value);
                }
                if (UpdateContactInput.this.lastWabaBroadcastReplyBody.defined) {
                    inputFieldWriter.writeString("lastWabaBroadcastReplyBody", (String) UpdateContactInput.this.lastWabaBroadcastReplyBody.value);
                }
                if (UpdateContactInput.this.lastWabaBroadcastReplyTime.defined) {
                    inputFieldWriter.writeString("lastWabaBroadcastReplyTime", (String) UpdateContactInput.this.lastWabaBroadcastReplyTime.value);
                }
                if (UpdateContactInput.this.lastWabaBroadcastReplyType.defined) {
                    inputFieldWriter.writeString("lastWabaBroadcastReplyType", (String) UpdateContactInput.this.lastWabaBroadcastReplyType.value);
                }
                if (UpdateContactInput.this.lastSmsTime.defined) {
                    inputFieldWriter.writeString("lastSmsTime", (String) UpdateContactInput.this.lastSmsTime.value);
                }
                if (UpdateContactInput.this.lastSmsUserId.defined) {
                    inputFieldWriter.writeString("lastSmsUserId", (String) UpdateContactInput.this.lastSmsUserId.value);
                }
                if (UpdateContactInput.this.lastSmsEngagementId.defined) {
                    inputFieldWriter.writeString("lastSmsEngagementId", (String) UpdateContactInput.this.lastSmsEngagementId.value);
                }
                if (UpdateContactInput.this.lastNoteAddedTime.defined) {
                    inputFieldWriter.writeString("lastNoteAddedTime", (String) UpdateContactInput.this.lastNoteAddedTime.value);
                }
                if (UpdateContactInput.this.lastNoteUserId.defined) {
                    inputFieldWriter.writeString("lastNoteUserId", (String) UpdateContactInput.this.lastNoteUserId.value);
                }
                if (UpdateContactInput.this.lastNoteEngagementId.defined) {
                    inputFieldWriter.writeString("lastNoteEngagementId", (String) UpdateContactInput.this.lastNoteEngagementId.value);
                }
                if (UpdateContactInput.this.lastTaskDoneTime.defined) {
                    inputFieldWriter.writeString("lastTaskDoneTime", (String) UpdateContactInput.this.lastTaskDoneTime.value);
                }
                if (UpdateContactInput.this.lastTaskDoneUserId.defined) {
                    inputFieldWriter.writeString("lastTaskDoneUserId", (String) UpdateContactInput.this.lastTaskDoneUserId.value);
                }
                if (UpdateContactInput.this.lastTaskDoneEngagementId.defined) {
                    inputFieldWriter.writeString("lastTaskDoneEngagementId", (String) UpdateContactInput.this.lastTaskDoneEngagementId.value);
                }
                if (UpdateContactInput.this.openTaskCount.defined) {
                    inputFieldWriter.writeInt("openTaskCount", (Integer) UpdateContactInput.this.openTaskCount.value);
                }
                if (UpdateContactInput.this.lastKnownDisposition.defined) {
                    inputFieldWriter.writeString("lastKnownDisposition", (String) UpdateContactInput.this.lastKnownDisposition.value);
                }
                if (UpdateContactInput.this.lastKnownDispositionTime.defined) {
                    inputFieldWriter.writeString("lastKnownDispositionTime", (String) UpdateContactInput.this.lastKnownDispositionTime.value);
                }
                if (UpdateContactInput.this.lastLeadAssignmentDateTime.defined) {
                    inputFieldWriter.writeString("lastLeadAssignmentDateTime", (String) UpdateContactInput.this.lastLeadAssignmentDateTime.value);
                }
                if (UpdateContactInput.this.lastEngagementFromAccount.defined) {
                    inputFieldWriter.writeString("lastEngagementFromAccount", (String) UpdateContactInput.this.lastEngagementFromAccount.value);
                }
                if (UpdateContactInput.this.lastEngagementFromContact.defined) {
                    inputFieldWriter.writeString("lastEngagementFromContact", (String) UpdateContactInput.this.lastEngagementFromContact.value);
                }
                if (UpdateContactInput.this.freshLeadTag.defined) {
                    inputFieldWriter.writeString("freshLeadTag", (String) UpdateContactInput.this.freshLeadTag.value);
                }
                if (UpdateContactInput.this.noWorkAfterAssignment.defined) {
                    inputFieldWriter.writeString("noWorkAfterAssignment", (String) UpdateContactInput.this.noWorkAfterAssignment.value);
                }
                if (UpdateContactInput.this.needFollowUpTag.defined) {
                    inputFieldWriter.writeString("needFollowUpTag", (String) UpdateContactInput.this.needFollowUpTag.value);
                }
                if (UpdateContactInput.this.needFollowUpTagUpdatedAt.defined) {
                    inputFieldWriter.writeString("needFollowUpTagUpdatedAt", (String) UpdateContactInput.this.needFollowUpTagUpdatedAt.value);
                }
                if (UpdateContactInput.this.activeDealStage.defined) {
                    inputFieldWriter.writeString("activeDealStage", (String) UpdateContactInput.this.activeDealStage.value);
                }
                if (UpdateContactInput.this.activeDealStageUpdatedAt.defined) {
                    inputFieldWriter.writeString("activeDealStageUpdatedAt", (String) UpdateContactInput.this.activeDealStageUpdatedAt.value);
                }
                if (UpdateContactInput.this.dealDescription.defined) {
                    inputFieldWriter.writeString("dealDescription", (String) UpdateContactInput.this.dealDescription.value);
                }
                if (UpdateContactInput.this.isCustomer.defined) {
                    inputFieldWriter.writeString("isCustomer", (String) UpdateContactInput.this.isCustomer.value);
                }
                if (UpdateContactInput.this.becameCustomerOn.defined) {
                    inputFieldWriter.writeString("becameCustomerOn", (String) UpdateContactInput.this.becameCustomerOn.value);
                }
                if (UpdateContactInput.this.unsuccessfulCallAttempts.defined) {
                    inputFieldWriter.writeInt("unsuccessfulCallAttempts", (Integer) UpdateContactInput.this.unsuccessfulCallAttempts.value);
                }
                if (UpdateContactInput.this.leadCallsNotAnswered.defined) {
                    inputFieldWriter.writeInt("leadCallsNotAnswered", (Integer) UpdateContactInput.this.leadCallsNotAnswered.value);
                }
                if (UpdateContactInput.this.userDefinedTags.defined) {
                    inputFieldWriter.writeList("userDefinedTags", UpdateContactInput.this.userDefinedTags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateContactInput.1.9
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateContactInput.this.userDefinedTags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateContactInput.this.productService.defined) {
                    inputFieldWriter.writeList("productService", UpdateContactInput.this.productService.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateContactInput.1.10
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateContactInput.this.productService.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateContactInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateContactInput.this.createdAt.value);
                }
                if (UpdateContactInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateContactInput.this.updatedAt.value);
                }
                if (UpdateContactInput.this.contactAssignedToId.defined) {
                    inputFieldWriter.writeString("contactAssignedToId", (String) UpdateContactInput.this.contactAssignedToId.value);
                }
                if (UpdateContactInput.this.contactBlockedForCallById.defined) {
                    inputFieldWriter.writeString("contactBlockedForCallById", (String) UpdateContactInput.this.contactBlockedForCallById.value);
                }
                if (UpdateContactInput.this.bulkUploadReference.defined) {
                    inputFieldWriter.writeString("bulkUploadReference", (String) UpdateContactInput.this.bulkUploadReference.value);
                }
                if (UpdateContactInput.this.assignmentMethod.defined) {
                    inputFieldWriter.writeString("assignmentMethod", (String) UpdateContactInput.this.assignmentMethod.value);
                }
                if (UpdateContactInput.this.customDataAddedFromAddContactForm.defined) {
                    inputFieldWriter.writeString("customDataAddedFromAddContactForm", (String) UpdateContactInput.this.customDataAddedFromAddContactForm.value);
                }
                if (UpdateContactInput.this.customAttributes.defined) {
                    inputFieldWriter.writeString("customAttributes", (String) UpdateContactInput.this.customAttributes.value);
                }
                if (UpdateContactInput.this.leadLifecycleStage.defined) {
                    inputFieldWriter.writeString("leadLifecycleStage", UpdateContactInput.this.leadLifecycleStage.value != 0 ? ((LeadLifecycleStage) UpdateContactInput.this.leadLifecycleStage.value).name() : null);
                }
                if (UpdateContactInput.this.leadLifecycleStageSubCategory.defined) {
                    inputFieldWriter.writeString("leadLifecycleStageSubCategory", UpdateContactInput.this.leadLifecycleStageSubCategory.value != 0 ? ((LeadLifecycleStageSubCategory) UpdateContactInput.this.leadLifecycleStageSubCategory.value).name() : null);
                }
                if (UpdateContactInput.this.manualClosedReason.defined) {
                    inputFieldWriter.writeString("manualClosedReason", (String) UpdateContactInput.this.manualClosedReason.value);
                }
                if (UpdateContactInput.this.lastDealStageType.defined) {
                    inputFieldWriter.writeString("lastDealStageType", (String) UpdateContactInput.this.lastDealStageType.value);
                }
                if (UpdateContactInput.this.prospectingAttempts.defined) {
                    inputFieldWriter.writeInt("prospectingAttempts", (Integer) UpdateContactInput.this.prospectingAttempts.value);
                }
                if (UpdateContactInput.this.lastProspectingDoneOn.defined) {
                    inputFieldWriter.writeString("lastProspectingDoneOn", (String) UpdateContactInput.this.lastProspectingDoneOn.value);
                }
                if (UpdateContactInput.this.firstProspectingDoneOn.defined) {
                    inputFieldWriter.writeString("firstProspectingDoneOn", (String) UpdateContactInput.this.firstProspectingDoneOn.value);
                }
                if (UpdateContactInput.this.nextProspectingDueOn.defined) {
                    inputFieldWriter.writeString("nextProspectingDueOn", (String) UpdateContactInput.this.nextProspectingDueOn.value);
                }
                if (UpdateContactInput.this.nextProspectingSetBy.defined) {
                    inputFieldWriter.writeString("nextProspectingSetBy", (String) UpdateContactInput.this.nextProspectingSetBy.value);
                }
                if (UpdateContactInput.this.nextProspectingNote.defined) {
                    inputFieldWriter.writeString("nextProspectingNote", (String) UpdateContactInput.this.nextProspectingNote.value);
                }
                if (UpdateContactInput.this.movedToOpportunityOn.defined) {
                    inputFieldWriter.writeString("movedToOpportunityOn", (String) UpdateContactInput.this.movedToOpportunityOn.value);
                }
                if (UpdateContactInput.this.movedToClosedOn.defined) {
                    inputFieldWriter.writeString("movedToClosedOn", (String) UpdateContactInput.this.movedToClosedOn.value);
                }
                if (UpdateContactInput.this.recentEngagementsUpdatedAt.defined) {
                    inputFieldWriter.writeString("recentEngagementsUpdatedAt", (String) UpdateContactInput.this.recentEngagementsUpdatedAt.value);
                }
                if (UpdateContactInput.this.openTaskDetail.defined) {
                    inputFieldWriter.writeString("openTaskDetail", (String) UpdateContactInput.this.openTaskDetail.value);
                }
                if (UpdateContactInput.this.paymentRequestDetail.defined) {
                    inputFieldWriter.writeString("paymentRequestDetail", (String) UpdateContactInput.this.paymentRequestDetail.value);
                }
                if (UpdateContactInput.this.lastPaymentStatus.defined) {
                    inputFieldWriter.writeString("lastPaymentStatus", (String) UpdateContactInput.this.lastPaymentStatus.value);
                }
                if (UpdateContactInput.this.recentEngagements.defined) {
                    inputFieldWriter.writeList("recentEngagements", UpdateContactInput.this.recentEngagements.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateContactInput.1.11
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateContactInput.this.recentEngagements.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.AWSJSON, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateContactInput.this.latestRemark.defined) {
                    inputFieldWriter.writeString("latestRemark", (String) UpdateContactInput.this.latestRemark.value);
                }
                if (UpdateContactInput.this.openVideoCallDetail.defined) {
                    inputFieldWriter.writeString("openVideoCallDetail", (String) UpdateContactInput.this.openVideoCallDetail.value);
                }
                if (UpdateContactInput.this.lastClosedTaskDetail.defined) {
                    inputFieldWriter.writeString("lastClosedTaskDetail", (String) UpdateContactInput.this.lastClosedTaskDetail.value);
                }
            }
        };
    }

    public String movedToClosedOn() {
        return this.movedToClosedOn.value;
    }

    public String movedToOpportunityOn() {
        return this.movedToOpportunityOn.value;
    }

    public String name() {
        return this.name.value;
    }

    public String needFollowUpTag() {
        return this.needFollowUpTag.value;
    }

    public String needFollowUpTagUpdatedAt() {
        return this.needFollowUpTagUpdatedAt.value;
    }

    public String nextProspectingDueOn() {
        return this.nextProspectingDueOn.value;
    }

    public String nextProspectingNote() {
        return this.nextProspectingNote.value;
    }

    public String nextProspectingSetBy() {
        return this.nextProspectingSetBy.value;
    }

    public String noWorkAfterAssignment() {
        return this.noWorkAfterAssignment.value;
    }

    public TaskActivityType openTaskActivityType() {
        return this.openTaskActivityType.value;
    }

    public Integer openTaskCount() {
        return this.openTaskCount.value;
    }

    public String openTaskDetail() {
        return this.openTaskDetail.value;
    }

    public String openVideoCallDetail() {
        return this.openVideoCallDetail.value;
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public String paymentRequestDetail() {
        return this.paymentRequestDetail.value;
    }

    public List<Day> preferredContactDays() {
        return this.preferredContactDays.value;
    }

    public String primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public List<String> productService() {
        return this.productService.value;
    }

    public String profilePhotoUrl() {
        return this.profilePhotoUrl.value;
    }

    public Integer prospectingAttempts() {
        return this.prospectingAttempts.value;
    }

    public List<String> recentEngagements() {
        return this.recentEngagements.value;
    }

    public String recentEngagementsUpdatedAt() {
        return this.recentEngagementsUpdatedAt.value;
    }

    public String referredBy() {
        return this.referredBy.value;
    }

    public String salutation() {
        return this.salutation.value;
    }

    public Seniority seniority() {
        return this.seniority.value;
    }

    public List<String> sharedOwners() {
        return this.sharedOwners.value;
    }

    public List<String> sharedTeams() {
        return this.sharedTeams.value;
    }

    public ContactAssignmentStatus toBeAssigned() {
        return this.toBeAssigned.value;
    }

    public Integer unsuccessfulCallAttempts() {
        return this.unsuccessfulCallAttempts.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }

    public List<String> userDefinedTags() {
        return this.userDefinedTags.value;
    }
}
