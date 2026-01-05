package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableContactFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<SearchableStringFilterInput> accountPriority;
    private final Input<SearchableStringFilterInput> activeDealStage;
    private final Input<SearchableStringFilterInput> activeDealStageUpdatedAt;
    private final Input<SearchableIDFilterInput> addedById;
    private final Input<SearchableStringFilterInput> addresses__area;
    private final Input<SearchableStringFilterInput> addresses__city;
    private final Input<SearchableStringFilterInput> addresses__rawAddressText;
    private final Input<SearchableStringFilterInput> addresses__state;
    private final Input<List<SearchableContactFilterInput>> and;
    private final Input<SearchableIDFilterInput> assignedToId;
    private final Input<SearchableStringFilterInput> assignmentMethod;
    private final Input<SearchableStringFilterInput> becameCustomerOn;
    private final Input<SearchableIDFilterInput> blockedForCallById;
    private final Input<SearchableStringFilterInput> blockedForCallReason;
    private final Input<SearchableStringFilterInput> blockedForCallUntil;
    private final Input<SearchableStringFilterInput> bulkUploadReference;
    private final Input<SearchableStringFilterInput> businessDetail__name;
    private final Input<SearchableStringFilterInput> callPriority;
    private final Input<SearchableStringFilterInput> contactNumberDetail__phoneNumber;
    private final Input<SearchableStringFilterInput> contactSource;
    private final Input<SearchableStringFilterInput> contactSourceDrillDownOne;
    private final Input<SearchableIDFilterInput> contactSourceDrillDownOneId;
    private final Input<SearchableStringFilterInput> contactSourceDrillDownThree;
    private final Input<SearchableIDFilterInput> contactSourceDrillDownThreeId;
    private final Input<SearchableStringFilterInput> contactSourceDrillDownTwo;
    private final Input<SearchableIDFilterInput> contactSourceDrillDownTwoId;
    private final Input<SearchableStringFilterInput> contactStatus;
    private final Input<SearchableStringFilterInput> contactType;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableCustomAttributeFilterInput> customAttributes;
    private final Input<SearchableIDFilterInput> customAttributesSortable;
    private final Input<SearchableStringFilterInput> dealDescription;
    private final Input<SearchableStringFilterInput> department;
    private final Input<SearchableStringFilterInput> designation;
    private final Input<SearchableStringFilterInput> emails__email;
    private final Input<SearchableStringFilterInput> externalReference__externalReferenceId;
    private final Input<SearchableStringFilterInput> externalReference__externalReferenceIdSource;
    private final Input<SearchableStringFilterInput> externalReference__externalReferenceSourceDate;
    private final Input<SearchableStringFilterInput> firstProspectingDoneOn;
    private final Input<SearchableStringFilterInput> freshLeadTag;
    private final Input<SearchableStringFilterInput> gender;
    private final Input<SearchableBooleanFilterInput> hasTask;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> isCustomer;
    private final Input<SearchableBooleanFilterInput> isDecisionMaker;
    private final Input<SearchableBooleanFilterInput> isPrivate;
    private final Input<SearchableStringFilterInput> lastCallDirection;
    private final Input<SearchableIntFilterInput> lastCallDuration;
    private final Input<SearchableStringFilterInput> lastCallEngagementId;
    private final Input<SearchableStringFilterInput> lastCallOutcome;
    private final Input<SearchableStringFilterInput> lastCallOutcomeNature;
    private final Input<SearchableIDFilterInput> lastCallUserId;
    private final Input<SearchableStringFilterInput> lastCalledTime;
    private final Input<SearchableStringFilterInput> lastClosedTaskDetail__taskType;
    private final Input<SearchableStringFilterInput> lastDealStageType;
    private final Input<SearchableStringFilterInput> lastEmailEngagementId;
    private final Input<SearchableStringFilterInput> lastEmailTime;
    private final Input<SearchableIDFilterInput> lastEmailUserId;
    private final Input<SearchableStringFilterInput> lastEngagementFromAccount;
    private final Input<SearchableStringFilterInput> lastEngagementFromContact;
    private final Input<SearchableStringFilterInput> lastKnownDisposition;
    private final Input<SearchableStringFilterInput> lastKnownDispositionTime;
    private final Input<SearchableStringFilterInput> lastLeadAssignmentDateTime;
    private final Input<SearchableStringFilterInput> lastNoteAddedTime;
    private final Input<SearchableStringFilterInput> lastNoteEngagementId;
    private final Input<SearchableIDFilterInput> lastNoteUserId;
    private final Input<SearchableStringFilterInput> lastPaymentStatus;
    private final Input<SearchableStringFilterInput> lastProspectingDoneOn;
    private final Input<SearchableStringFilterInput> lastRepeatEnquiryDate;
    private final Input<SearchableStringFilterInput> lastRepeatEnquirySource;
    private final Input<SearchableIDFilterInput> lastSmsEngagementId;
    private final Input<ModelStringInput> lastSmsTime;
    private final Input<SearchableStringFilterInput> lastSmsUserId;
    private final Input<SearchableStringFilterInput> lastTaskDoneEngagementId;
    private final Input<SearchableStringFilterInput> lastTaskDoneTime;
    private final Input<SearchableIDFilterInput> lastTaskDoneUserId;
    private final Input<SearchableStringFilterInput> lastVisitEngagementId;
    private final Input<SearchableStringFilterInput> lastVisitOutcome;
    private final Input<SearchableStringFilterInput> lastVisitOutcomeNature;
    private final Input<SearchableStringFilterInput> lastVisitTime;
    private final Input<SearchableIDFilterInput> lastVisitUserId;
    private final Input<SearchableStringFilterInput> lastWabaBroadcastReplyBody;
    private final Input<SearchableStringFilterInput> lastWabaBroadcastReplyTime;
    private final Input<SearchableStringFilterInput> lastWabaBroadcastReplyType;
    private final Input<SearchableStringFilterInput> lastWabaBroadcastStatus;
    private final Input<SearchableStringFilterInput> lastWabaBroadcastTemplate;
    private final Input<SearchableStringFilterInput> lastWabaBroadcastTime;
    private final Input<SearchableIDFilterInput> lastWhatsappEngagementId;
    private final Input<SearchableStringFilterInput> lastWhatsappTime;
    private final Input<SearchableIDFilterInput> lastWhatsappUserId;
    private final Input<SearchableStringFilterInput> latestRemark;
    private final Input<SearchableIntFilterInput> leadCallsNotAnswered;
    private final Input<SearchableStringFilterInput> leadLifecycleStage;
    private final Input<SearchableStringFilterInput> leadLifecycleStageSubCategory;
    private final Input<SearchableStringFilterInput> lockPeriod;
    private final Input<SearchableStringFilterInput> manualClosedReason;
    private final Input<SearchableStringFilterInput> movedToClosedOn;
    private final Input<SearchableStringFilterInput> movedToOpportunityOn;
    private final Input<SearchableStringFilterInput> name;
    private final Input<SearchableStringFilterInput> needFollowUpTag;
    private final Input<SearchableStringFilterInput> needFollowUpTagUpdatedAt;
    private final Input<SearchableStringFilterInput> nextProspectingDueOn;
    private final Input<SearchableStringFilterInput> nextProspectingNote;
    private final Input<SearchableStringFilterInput> nextProspectingSetBy;
    private final Input<SearchableStringFilterInput> noWorkAfterAssignment;
    private final Input<SearchableContactFilterInput> not;
    private final Input<SearchableIntFilterInput> numberOfTimesRechurned;
    private final Input<SearchableStringFilterInput> openTaskActivityType;
    private final Input<SearchableIntFilterInput> openTaskCount;
    private final Input<SearchableStringFilterInput> openTaskDetail__taskType;
    private final Input<SearchableStringFilterInput> openVideoCallDetail;
    private final Input<List<SearchableContactFilterInput>> or;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableStringFilterInput> paymentRequestDetail;
    private final Input<SearchableIntFilterInput> paymentRequestDetail__amount;
    private final Input<SearchableIDFilterInput> primaryTeamId;
    private final Input<SearchableStringFilterInput> productService;
    private final Input<SearchableStringFilterInput> profilePhotoUrl;
    private final Input<SearchableIntFilterInput> prospectingAttempts;
    private final Input<SearchableStringFilterInput> recentEngagements;
    private final Input<SearchableStringFilterInput> recentEngagementsUpdatedAt;
    private final Input<SearchableStringFilterInput> referredBy;
    private final Input<SearchableStringFilterInput> salutation;
    private final Input<SearchableStringFilterInput> seniority;
    private final Input<SearchableIDFilterInput> sharedOwners;
    private final Input<SearchableIDFilterInput> sharedTeams;
    private final Input<SearchableStringFilterInput> toBeAssigned;
    private final Input<SearchableIntFilterInput> totalProspectingAttemptsAcrossRechurn;
    private final Input<SearchableIntFilterInput> unsuccessfulCallAttempts;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> updatedById;
    private final Input<SearchableStringFilterInput> userDefinedTags;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableStringFilterInput> toBeAssigned = Input.absent();
        private Input<SearchableIDFilterInput> sharedOwners = Input.absent();
        private Input<SearchableIDFilterInput> primaryTeamId = Input.absent();
        private Input<SearchableIDFilterInput> sharedTeams = Input.absent();
        private Input<SearchableStringFilterInput> accountPriority = Input.absent();
        private Input<SearchableIDFilterInput> addedById = Input.absent();
        private Input<SearchableIDFilterInput> assignedToId = Input.absent();
        private Input<SearchableIDFilterInput> blockedForCallById = Input.absent();
        private Input<SearchableStringFilterInput> blockedForCallReason = Input.absent();
        private Input<SearchableStringFilterInput> blockedForCallUntil = Input.absent();
        private Input<SearchableStringFilterInput> callPriority = Input.absent();
        private Input<SearchableStringFilterInput> contactSource = Input.absent();
        private Input<SearchableStringFilterInput> contactSourceDrillDownOne = Input.absent();
        private Input<SearchableStringFilterInput> contactSourceDrillDownTwo = Input.absent();
        private Input<SearchableStringFilterInput> contactSourceDrillDownThree = Input.absent();
        private Input<SearchableIDFilterInput> contactSourceDrillDownOneId = Input.absent();
        private Input<SearchableIDFilterInput> contactSourceDrillDownTwoId = Input.absent();
        private Input<SearchableIDFilterInput> contactSourceDrillDownThreeId = Input.absent();
        private Input<SearchableStringFilterInput> contactStatus = Input.absent();
        private Input<SearchableStringFilterInput> contactType = Input.absent();
        private Input<SearchableStringFilterInput> contactNumberDetail__phoneNumber = Input.absent();
        private Input<SearchableStringFilterInput> emails__email = Input.absent();
        private Input<SearchableStringFilterInput> externalReference__externalReferenceId = Input.absent();
        private Input<SearchableStringFilterInput> externalReference__externalReferenceIdSource = Input.absent();
        private Input<SearchableStringFilterInput> externalReference__externalReferenceSourceDate = Input.absent();
        private Input<SearchableStringFilterInput> addresses__rawAddressText = Input.absent();
        private Input<SearchableStringFilterInput> addresses__state = Input.absent();
        private Input<SearchableStringFilterInput> addresses__city = Input.absent();
        private Input<SearchableStringFilterInput> addresses__area = Input.absent();
        private Input<SearchableStringFilterInput> businessDetail__name = Input.absent();
        private Input<SearchableStringFilterInput> department = Input.absent();
        private Input<SearchableStringFilterInput> designation = Input.absent();
        private Input<SearchableStringFilterInput> lastRepeatEnquiryDate = Input.absent();
        private Input<SearchableStringFilterInput> lastRepeatEnquirySource = Input.absent();
        private Input<SearchableStringFilterInput> gender = Input.absent();
        private Input<SearchableBooleanFilterInput> isDecisionMaker = Input.absent();
        private Input<SearchableBooleanFilterInput> isPrivate = Input.absent();
        private Input<SearchableStringFilterInput> lockPeriod = Input.absent();
        private Input<SearchableStringFilterInput> name = Input.absent();
        private Input<SearchableStringFilterInput> profilePhotoUrl = Input.absent();
        private Input<SearchableStringFilterInput> referredBy = Input.absent();
        private Input<SearchableStringFilterInput> salutation = Input.absent();
        private Input<SearchableStringFilterInput> seniority = Input.absent();
        private Input<SearchableIDFilterInput> updatedById = Input.absent();
        private Input<SearchableBooleanFilterInput> hasTask = Input.absent();
        private Input<SearchableStringFilterInput> openTaskActivityType = Input.absent();
        private Input<SearchableStringFilterInput> lastCalledTime = Input.absent();
        private Input<SearchableStringFilterInput> lastCallDirection = Input.absent();
        private Input<SearchableStringFilterInput> lastCallOutcome = Input.absent();
        private Input<SearchableStringFilterInput> lastCallOutcomeNature = Input.absent();
        private Input<SearchableIDFilterInput> lastCallUserId = Input.absent();
        private Input<SearchableIntFilterInput> lastCallDuration = Input.absent();
        private Input<SearchableStringFilterInput> lastCallEngagementId = Input.absent();
        private Input<SearchableStringFilterInput> lastVisitTime = Input.absent();
        private Input<SearchableStringFilterInput> lastVisitOutcome = Input.absent();
        private Input<SearchableStringFilterInput> lastVisitOutcomeNature = Input.absent();
        private Input<SearchableIDFilterInput> lastVisitUserId = Input.absent();
        private Input<SearchableStringFilterInput> lastVisitEngagementId = Input.absent();
        private Input<SearchableStringFilterInput> lastEmailTime = Input.absent();
        private Input<SearchableIDFilterInput> lastEmailUserId = Input.absent();
        private Input<SearchableStringFilterInput> lastWhatsappTime = Input.absent();
        private Input<SearchableIDFilterInput> lastWhatsappUserId = Input.absent();
        private Input<SearchableIDFilterInput> lastWhatsappEngagementId = Input.absent();
        private Input<SearchableStringFilterInput> lastWabaBroadcastTime = Input.absent();
        private Input<SearchableStringFilterInput> lastWabaBroadcastStatus = Input.absent();
        private Input<SearchableStringFilterInput> lastWabaBroadcastTemplate = Input.absent();
        private Input<SearchableStringFilterInput> lastWabaBroadcastReplyBody = Input.absent();
        private Input<SearchableStringFilterInput> lastWabaBroadcastReplyTime = Input.absent();
        private Input<SearchableStringFilterInput> lastWabaBroadcastReplyType = Input.absent();
        private Input<ModelStringInput> lastSmsTime = Input.absent();
        private Input<SearchableStringFilterInput> lastSmsUserId = Input.absent();
        private Input<SearchableIDFilterInput> lastSmsEngagementId = Input.absent();
        private Input<SearchableStringFilterInput> lastEmailEngagementId = Input.absent();
        private Input<SearchableStringFilterInput> lastNoteAddedTime = Input.absent();
        private Input<SearchableIDFilterInput> lastNoteUserId = Input.absent();
        private Input<SearchableStringFilterInput> lastNoteEngagementId = Input.absent();
        private Input<SearchableStringFilterInput> lastTaskDoneTime = Input.absent();
        private Input<SearchableIDFilterInput> lastTaskDoneUserId = Input.absent();
        private Input<SearchableStringFilterInput> lastTaskDoneEngagementId = Input.absent();
        private Input<SearchableIntFilterInput> openTaskCount = Input.absent();
        private Input<SearchableStringFilterInput> lastKnownDisposition = Input.absent();
        private Input<SearchableStringFilterInput> lastKnownDispositionTime = Input.absent();
        private Input<SearchableStringFilterInput> lastLeadAssignmentDateTime = Input.absent();
        private Input<SearchableStringFilterInput> lastEngagementFromAccount = Input.absent();
        private Input<SearchableStringFilterInput> lastEngagementFromContact = Input.absent();
        private Input<SearchableStringFilterInput> freshLeadTag = Input.absent();
        private Input<SearchableStringFilterInput> noWorkAfterAssignment = Input.absent();
        private Input<SearchableStringFilterInput> needFollowUpTag = Input.absent();
        private Input<SearchableStringFilterInput> needFollowUpTagUpdatedAt = Input.absent();
        private Input<SearchableStringFilterInput> activeDealStage = Input.absent();
        private Input<SearchableStringFilterInput> activeDealStageUpdatedAt = Input.absent();
        private Input<SearchableStringFilterInput> dealDescription = Input.absent();
        private Input<SearchableStringFilterInput> isCustomer = Input.absent();
        private Input<SearchableStringFilterInput> becameCustomerOn = Input.absent();
        private Input<SearchableIntFilterInput> unsuccessfulCallAttempts = Input.absent();
        private Input<SearchableIntFilterInput> leadCallsNotAnswered = Input.absent();
        private Input<SearchableStringFilterInput> userDefinedTags = Input.absent();
        private Input<SearchableStringFilterInput> productService = Input.absent();
        private Input<SearchableStringFilterInput> bulkUploadReference = Input.absent();
        private Input<SearchableStringFilterInput> assignmentMethod = Input.absent();
        private Input<SearchableStringFilterInput> recentEngagements = Input.absent();
        private Input<SearchableStringFilterInput> recentEngagementsUpdatedAt = Input.absent();
        private Input<SearchableStringFilterInput> openTaskDetail__taskType = Input.absent();
        private Input<SearchableStringFilterInput> openVideoCallDetail = Input.absent();
        private Input<SearchableStringFilterInput> lastClosedTaskDetail__taskType = Input.absent();
        private Input<SearchableStringFilterInput> paymentRequestDetail = Input.absent();
        private Input<SearchableStringFilterInput> lastPaymentStatus = Input.absent();
        private Input<SearchableStringFilterInput> latestRemark = Input.absent();
        private Input<SearchableCustomAttributeFilterInput> customAttributes = Input.absent();
        private Input<SearchableIDFilterInput> customAttributesSortable = Input.absent();
        private Input<SearchableStringFilterInput> leadLifecycleStage = Input.absent();
        private Input<SearchableStringFilterInput> leadLifecycleStageSubCategory = Input.absent();
        private Input<SearchableStringFilterInput> manualClosedReason = Input.absent();
        private Input<SearchableStringFilterInput> lastDealStageType = Input.absent();
        private Input<SearchableIntFilterInput> prospectingAttempts = Input.absent();
        private Input<SearchableIntFilterInput> totalProspectingAttemptsAcrossRechurn = Input.absent();
        private Input<SearchableIntFilterInput> numberOfTimesRechurned = Input.absent();
        private Input<SearchableStringFilterInput> lastProspectingDoneOn = Input.absent();
        private Input<SearchableStringFilterInput> firstProspectingDoneOn = Input.absent();
        private Input<SearchableStringFilterInput> nextProspectingDueOn = Input.absent();
        private Input<SearchableStringFilterInput> nextProspectingSetBy = Input.absent();
        private Input<SearchableStringFilterInput> nextProspectingNote = Input.absent();
        private Input<SearchableStringFilterInput> movedToOpportunityOn = Input.absent();
        private Input<SearchableStringFilterInput> movedToClosedOn = Input.absent();
        private Input<SearchableIntFilterInput> paymentRequestDetail__amount = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableContactFilterInput>> and = Input.absent();
        private Input<List<SearchableContactFilterInput>> or = Input.absent();
        private Input<SearchableContactFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder accountPriority(SearchableStringFilterInput searchableStringFilterInput) {
            this.accountPriority = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder activeDealStage(SearchableStringFilterInput searchableStringFilterInput) {
            this.activeDealStage = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder activeDealStageUpdatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.activeDealStageUpdatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder addedById(SearchableIDFilterInput searchableIDFilterInput) {
            this.addedById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder addresses__area(SearchableStringFilterInput searchableStringFilterInput) {
            this.addresses__area = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder addresses__city(SearchableStringFilterInput searchableStringFilterInput) {
            this.addresses__city = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder addresses__rawAddressText(SearchableStringFilterInput searchableStringFilterInput) {
            this.addresses__rawAddressText = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder addresses__state(SearchableStringFilterInput searchableStringFilterInput) {
            this.addresses__state = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder and(List<SearchableContactFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder assignedToId(SearchableIDFilterInput searchableIDFilterInput) {
            this.assignedToId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder assignmentMethod(SearchableStringFilterInput searchableStringFilterInput) {
            this.assignmentMethod = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder becameCustomerOn(SearchableStringFilterInput searchableStringFilterInput) {
            this.becameCustomerOn = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder blockedForCallById(SearchableIDFilterInput searchableIDFilterInput) {
            this.blockedForCallById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder blockedForCallReason(SearchableStringFilterInput searchableStringFilterInput) {
            this.blockedForCallReason = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder blockedForCallUntil(SearchableStringFilterInput searchableStringFilterInput) {
            this.blockedForCallUntil = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public SearchableContactFilterInput build() {
            return new SearchableContactFilterInput(this.id, this.accountId, this.ownerId, this.toBeAssigned, this.sharedOwners, this.primaryTeamId, this.sharedTeams, this.accountPriority, this.addedById, this.assignedToId, this.blockedForCallById, this.blockedForCallReason, this.blockedForCallUntil, this.callPriority, this.contactSource, this.contactSourceDrillDownOne, this.contactSourceDrillDownTwo, this.contactSourceDrillDownThree, this.contactSourceDrillDownOneId, this.contactSourceDrillDownTwoId, this.contactSourceDrillDownThreeId, this.contactStatus, this.contactType, this.contactNumberDetail__phoneNumber, this.emails__email, this.externalReference__externalReferenceId, this.externalReference__externalReferenceIdSource, this.externalReference__externalReferenceSourceDate, this.addresses__rawAddressText, this.addresses__state, this.addresses__city, this.addresses__area, this.businessDetail__name, this.department, this.designation, this.lastRepeatEnquiryDate, this.lastRepeatEnquirySource, this.gender, this.isDecisionMaker, this.isPrivate, this.lockPeriod, this.name, this.profilePhotoUrl, this.referredBy, this.salutation, this.seniority, this.updatedById, this.hasTask, this.openTaskActivityType, this.lastCalledTime, this.lastCallDirection, this.lastCallOutcome, this.lastCallOutcomeNature, this.lastCallUserId, this.lastCallDuration, this.lastCallEngagementId, this.lastVisitTime, this.lastVisitOutcome, this.lastVisitOutcomeNature, this.lastVisitUserId, this.lastVisitEngagementId, this.lastEmailTime, this.lastEmailUserId, this.lastWhatsappTime, this.lastWhatsappUserId, this.lastWhatsappEngagementId, this.lastWabaBroadcastTime, this.lastWabaBroadcastStatus, this.lastWabaBroadcastTemplate, this.lastWabaBroadcastReplyBody, this.lastWabaBroadcastReplyTime, this.lastWabaBroadcastReplyType, this.lastSmsTime, this.lastSmsUserId, this.lastSmsEngagementId, this.lastEmailEngagementId, this.lastNoteAddedTime, this.lastNoteUserId, this.lastNoteEngagementId, this.lastTaskDoneTime, this.lastTaskDoneUserId, this.lastTaskDoneEngagementId, this.openTaskCount, this.lastKnownDisposition, this.lastKnownDispositionTime, this.lastLeadAssignmentDateTime, this.lastEngagementFromAccount, this.lastEngagementFromContact, this.freshLeadTag, this.noWorkAfterAssignment, this.needFollowUpTag, this.needFollowUpTagUpdatedAt, this.activeDealStage, this.activeDealStageUpdatedAt, this.dealDescription, this.isCustomer, this.becameCustomerOn, this.unsuccessfulCallAttempts, this.leadCallsNotAnswered, this.userDefinedTags, this.productService, this.bulkUploadReference, this.assignmentMethod, this.recentEngagements, this.recentEngagementsUpdatedAt, this.openTaskDetail__taskType, this.openVideoCallDetail, this.lastClosedTaskDetail__taskType, this.paymentRequestDetail, this.lastPaymentStatus, this.latestRemark, this.customAttributes, this.customAttributesSortable, this.leadLifecycleStage, this.leadLifecycleStageSubCategory, this.manualClosedReason, this.lastDealStageType, this.prospectingAttempts, this.totalProspectingAttemptsAcrossRechurn, this.numberOfTimesRechurned, this.lastProspectingDoneOn, this.firstProspectingDoneOn, this.nextProspectingDueOn, this.nextProspectingSetBy, this.nextProspectingNote, this.movedToOpportunityOn, this.movedToClosedOn, this.paymentRequestDetail__amount, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder bulkUploadReference(SearchableStringFilterInput searchableStringFilterInput) {
            this.bulkUploadReference = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder businessDetail__name(SearchableStringFilterInput searchableStringFilterInput) {
            this.businessDetail__name = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder callPriority(SearchableStringFilterInput searchableStringFilterInput) {
            this.callPriority = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder contactNumberDetail__phoneNumber(SearchableStringFilterInput searchableStringFilterInput) {
            this.contactNumberDetail__phoneNumber = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder contactSource(SearchableStringFilterInput searchableStringFilterInput) {
            this.contactSource = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder contactSourceDrillDownOne(SearchableStringFilterInput searchableStringFilterInput) {
            this.contactSourceDrillDownOne = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder contactSourceDrillDownOneId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactSourceDrillDownOneId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder contactSourceDrillDownThree(SearchableStringFilterInput searchableStringFilterInput) {
            this.contactSourceDrillDownThree = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder contactSourceDrillDownThreeId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactSourceDrillDownThreeId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder contactSourceDrillDownTwo(SearchableStringFilterInput searchableStringFilterInput) {
            this.contactSourceDrillDownTwo = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder contactSourceDrillDownTwoId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactSourceDrillDownTwoId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder contactStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.contactStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder contactType(SearchableStringFilterInput searchableStringFilterInput) {
            this.contactType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder customAttributes(SearchableCustomAttributeFilterInput searchableCustomAttributeFilterInput) {
            this.customAttributes = Input.fromNullable(searchableCustomAttributeFilterInput);
            return this;
        }

        public Builder customAttributesSortable(SearchableIDFilterInput searchableIDFilterInput) {
            this.customAttributesSortable = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder dealDescription(SearchableStringFilterInput searchableStringFilterInput) {
            this.dealDescription = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder department(SearchableStringFilterInput searchableStringFilterInput) {
            this.department = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder designation(SearchableStringFilterInput searchableStringFilterInput) {
            this.designation = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder emails__email(SearchableStringFilterInput searchableStringFilterInput) {
            this.emails__email = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder externalReference__externalReferenceId(SearchableStringFilterInput searchableStringFilterInput) {
            this.externalReference__externalReferenceId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder externalReference__externalReferenceIdSource(SearchableStringFilterInput searchableStringFilterInput) {
            this.externalReference__externalReferenceIdSource = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder externalReference__externalReferenceSourceDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.externalReference__externalReferenceSourceDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder firstProspectingDoneOn(SearchableStringFilterInput searchableStringFilterInput) {
            this.firstProspectingDoneOn = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder freshLeadTag(SearchableStringFilterInput searchableStringFilterInput) {
            this.freshLeadTag = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder gender(SearchableStringFilterInput searchableStringFilterInput) {
            this.gender = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder hasTask(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.hasTask = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder isCustomer(SearchableStringFilterInput searchableStringFilterInput) {
            this.isCustomer = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder isDecisionMaker(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isDecisionMaker = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isPrivate(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isPrivate = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder lastCallDirection(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastCallDirection = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastCallDuration(SearchableIntFilterInput searchableIntFilterInput) {
            this.lastCallDuration = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder lastCallEngagementId(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastCallEngagementId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastCallOutcome(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastCallOutcome = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastCallOutcomeNature(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastCallOutcomeNature = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastCallUserId(SearchableIDFilterInput searchableIDFilterInput) {
            this.lastCallUserId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder lastCalledTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastCalledTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastClosedTaskDetail__taskType(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastClosedTaskDetail__taskType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastDealStageType(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastDealStageType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastEmailEngagementId(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastEmailEngagementId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastEmailTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastEmailTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastEmailUserId(SearchableIDFilterInput searchableIDFilterInput) {
            this.lastEmailUserId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder lastEngagementFromAccount(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastEngagementFromAccount = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastEngagementFromContact(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastEngagementFromContact = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastKnownDisposition(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastKnownDisposition = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastKnownDispositionTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastKnownDispositionTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastLeadAssignmentDateTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastLeadAssignmentDateTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastNoteAddedTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastNoteAddedTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastNoteEngagementId(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastNoteEngagementId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastNoteUserId(SearchableIDFilterInput searchableIDFilterInput) {
            this.lastNoteUserId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder lastPaymentStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastPaymentStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastProspectingDoneOn(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastProspectingDoneOn = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastRepeatEnquiryDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastRepeatEnquiryDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastRepeatEnquirySource(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastRepeatEnquirySource = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastSmsEngagementId(SearchableIDFilterInput searchableIDFilterInput) {
            this.lastSmsEngagementId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder lastSmsTime(ModelStringInput modelStringInput) {
            this.lastSmsTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastSmsUserId(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastSmsUserId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastTaskDoneEngagementId(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastTaskDoneEngagementId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastTaskDoneTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastTaskDoneTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastTaskDoneUserId(SearchableIDFilterInput searchableIDFilterInput) {
            this.lastTaskDoneUserId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder lastVisitEngagementId(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastVisitEngagementId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastVisitOutcome(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastVisitOutcome = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastVisitOutcomeNature(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastVisitOutcomeNature = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastVisitTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastVisitTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastVisitUserId(SearchableIDFilterInput searchableIDFilterInput) {
            this.lastVisitUserId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder lastWabaBroadcastReplyBody(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastWabaBroadcastReplyBody = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastWabaBroadcastReplyTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastWabaBroadcastReplyTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastWabaBroadcastReplyType(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastWabaBroadcastReplyType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastWabaBroadcastStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastWabaBroadcastStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastWabaBroadcastTemplate(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastWabaBroadcastTemplate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastWabaBroadcastTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastWabaBroadcastTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastWhatsappEngagementId(SearchableIDFilterInput searchableIDFilterInput) {
            this.lastWhatsappEngagementId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder lastWhatsappTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastWhatsappTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastWhatsappUserId(SearchableIDFilterInput searchableIDFilterInput) {
            this.lastWhatsappUserId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder latestRemark(SearchableStringFilterInput searchableStringFilterInput) {
            this.latestRemark = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder leadCallsNotAnswered(SearchableIntFilterInput searchableIntFilterInput) {
            this.leadCallsNotAnswered = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder leadLifecycleStage(SearchableStringFilterInput searchableStringFilterInput) {
            this.leadLifecycleStage = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder leadLifecycleStageSubCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.leadLifecycleStageSubCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lockPeriod(SearchableStringFilterInput searchableStringFilterInput) {
            this.lockPeriod = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder manualClosedReason(SearchableStringFilterInput searchableStringFilterInput) {
            this.manualClosedReason = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder movedToClosedOn(SearchableStringFilterInput searchableStringFilterInput) {
            this.movedToClosedOn = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder movedToOpportunityOn(SearchableStringFilterInput searchableStringFilterInput) {
            this.movedToOpportunityOn = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder name(SearchableStringFilterInput searchableStringFilterInput) {
            this.name = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder needFollowUpTag(SearchableStringFilterInput searchableStringFilterInput) {
            this.needFollowUpTag = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder needFollowUpTagUpdatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.needFollowUpTagUpdatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder nextProspectingDueOn(SearchableStringFilterInput searchableStringFilterInput) {
            this.nextProspectingDueOn = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder nextProspectingNote(SearchableStringFilterInput searchableStringFilterInput) {
            this.nextProspectingNote = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder nextProspectingSetBy(SearchableStringFilterInput searchableStringFilterInput) {
            this.nextProspectingSetBy = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder noWorkAfterAssignment(SearchableStringFilterInput searchableStringFilterInput) {
            this.noWorkAfterAssignment = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableContactFilterInput searchableContactFilterInput) {
            this.not = Input.fromNullable(searchableContactFilterInput);
            return this;
        }

        public Builder numberOfTimesRechurned(SearchableIntFilterInput searchableIntFilterInput) {
            this.numberOfTimesRechurned = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder openTaskActivityType(SearchableStringFilterInput searchableStringFilterInput) {
            this.openTaskActivityType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder openTaskCount(SearchableIntFilterInput searchableIntFilterInput) {
            this.openTaskCount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder openTaskDetail__taskType(SearchableStringFilterInput searchableStringFilterInput) {
            this.openTaskDetail__taskType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder openVideoCallDetail(SearchableStringFilterInput searchableStringFilterInput) {
            this.openVideoCallDetail = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder or(List<SearchableContactFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.ownerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder paymentRequestDetail(SearchableStringFilterInput searchableStringFilterInput) {
            this.paymentRequestDetail = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder paymentRequestDetail__amount(SearchableIntFilterInput searchableIntFilterInput) {
            this.paymentRequestDetail__amount = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder primaryTeamId(SearchableIDFilterInput searchableIDFilterInput) {
            this.primaryTeamId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder productService(SearchableStringFilterInput searchableStringFilterInput) {
            this.productService = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder profilePhotoUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.profilePhotoUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder prospectingAttempts(SearchableIntFilterInput searchableIntFilterInput) {
            this.prospectingAttempts = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder recentEngagements(SearchableStringFilterInput searchableStringFilterInput) {
            this.recentEngagements = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder recentEngagementsUpdatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.recentEngagementsUpdatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder referredBy(SearchableStringFilterInput searchableStringFilterInput) {
            this.referredBy = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder salutation(SearchableStringFilterInput searchableStringFilterInput) {
            this.salutation = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder seniority(SearchableStringFilterInput searchableStringFilterInput) {
            this.seniority = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder sharedOwners(SearchableIDFilterInput searchableIDFilterInput) {
            this.sharedOwners = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder sharedTeams(SearchableIDFilterInput searchableIDFilterInput) {
            this.sharedTeams = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder toBeAssigned(SearchableStringFilterInput searchableStringFilterInput) {
            this.toBeAssigned = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder totalProspectingAttemptsAcrossRechurn(SearchableIntFilterInput searchableIntFilterInput) {
            this.totalProspectingAttemptsAcrossRechurn = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder unsuccessfulCallAttempts(SearchableIntFilterInput searchableIntFilterInput) {
            this.unsuccessfulCallAttempts = Input.fromNullable(searchableIntFilterInput);
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

        public Builder userDefinedTags(SearchableStringFilterInput searchableStringFilterInput) {
            this.userDefinedTags = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableContactFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableIDFilterInput> input5, Input<SearchableIDFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableIDFilterInput> input9, Input<SearchableIDFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableIDFilterInput> input19, Input<SearchableIDFilterInput> input20, Input<SearchableIDFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<SearchableStringFilterInput> input23, Input<SearchableStringFilterInput> input24, Input<SearchableStringFilterInput> input25, Input<SearchableStringFilterInput> input26, Input<SearchableStringFilterInput> input27, Input<SearchableStringFilterInput> input28, Input<SearchableStringFilterInput> input29, Input<SearchableStringFilterInput> input30, Input<SearchableStringFilterInput> input31, Input<SearchableStringFilterInput> input32, Input<SearchableStringFilterInput> input33, Input<SearchableStringFilterInput> input34, Input<SearchableStringFilterInput> input35, Input<SearchableStringFilterInput> input36, Input<SearchableStringFilterInput> input37, Input<SearchableStringFilterInput> input38, Input<SearchableBooleanFilterInput> input39, Input<SearchableBooleanFilterInput> input40, Input<SearchableStringFilterInput> input41, Input<SearchableStringFilterInput> input42, Input<SearchableStringFilterInput> input43, Input<SearchableStringFilterInput> input44, Input<SearchableStringFilterInput> input45, Input<SearchableStringFilterInput> input46, Input<SearchableIDFilterInput> input47, Input<SearchableBooleanFilterInput> input48, Input<SearchableStringFilterInput> input49, Input<SearchableStringFilterInput> input50, Input<SearchableStringFilterInput> input51, Input<SearchableStringFilterInput> input52, Input<SearchableStringFilterInput> input53, Input<SearchableIDFilterInput> input54, Input<SearchableIntFilterInput> input55, Input<SearchableStringFilterInput> input56, Input<SearchableStringFilterInput> input57, Input<SearchableStringFilterInput> input58, Input<SearchableStringFilterInput> input59, Input<SearchableIDFilterInput> input60, Input<SearchableStringFilterInput> input61, Input<SearchableStringFilterInput> input62, Input<SearchableIDFilterInput> input63, Input<SearchableStringFilterInput> input64, Input<SearchableIDFilterInput> input65, Input<SearchableIDFilterInput> input66, Input<SearchableStringFilterInput> input67, Input<SearchableStringFilterInput> input68, Input<SearchableStringFilterInput> input69, Input<SearchableStringFilterInput> input70, Input<SearchableStringFilterInput> input71, Input<SearchableStringFilterInput> input72, Input<ModelStringInput> input73, Input<SearchableStringFilterInput> input74, Input<SearchableIDFilterInput> input75, Input<SearchableStringFilterInput> input76, Input<SearchableStringFilterInput> input77, Input<SearchableIDFilterInput> input78, Input<SearchableStringFilterInput> input79, Input<SearchableStringFilterInput> input80, Input<SearchableIDFilterInput> input81, Input<SearchableStringFilterInput> input82, Input<SearchableIntFilterInput> input83, Input<SearchableStringFilterInput> input84, Input<SearchableStringFilterInput> input85, Input<SearchableStringFilterInput> input86, Input<SearchableStringFilterInput> input87, Input<SearchableStringFilterInput> input88, Input<SearchableStringFilterInput> input89, Input<SearchableStringFilterInput> input90, Input<SearchableStringFilterInput> input91, Input<SearchableStringFilterInput> input92, Input<SearchableStringFilterInput> input93, Input<SearchableStringFilterInput> input94, Input<SearchableStringFilterInput> input95, Input<SearchableStringFilterInput> input96, Input<SearchableStringFilterInput> input97, Input<SearchableIntFilterInput> input98, Input<SearchableIntFilterInput> input99, Input<SearchableStringFilterInput> input100, Input<SearchableStringFilterInput> input101, Input<SearchableStringFilterInput> input102, Input<SearchableStringFilterInput> input103, Input<SearchableStringFilterInput> input104, Input<SearchableStringFilterInput> input105, Input<SearchableStringFilterInput> input106, Input<SearchableStringFilterInput> input107, Input<SearchableStringFilterInput> input108, Input<SearchableStringFilterInput> input109, Input<SearchableStringFilterInput> input110, Input<SearchableStringFilterInput> input111, Input<SearchableCustomAttributeFilterInput> input112, Input<SearchableIDFilterInput> input113, Input<SearchableStringFilterInput> input114, Input<SearchableStringFilterInput> input115, Input<SearchableStringFilterInput> input116, Input<SearchableStringFilterInput> input117, Input<SearchableIntFilterInput> input118, Input<SearchableIntFilterInput> input119, Input<SearchableIntFilterInput> input120, Input<SearchableStringFilterInput> input121, Input<SearchableStringFilterInput> input122, Input<SearchableStringFilterInput> input123, Input<SearchableStringFilterInput> input124, Input<SearchableStringFilterInput> input125, Input<SearchableStringFilterInput> input126, Input<SearchableStringFilterInput> input127, Input<SearchableIntFilterInput> input128, Input<SearchableStringFilterInput> input129, Input<SearchableStringFilterInput> input130, Input<List<SearchableContactFilterInput>> input131, Input<List<SearchableContactFilterInput>> input132, Input<SearchableContactFilterInput> input133) {
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
        this.contactNumberDetail__phoneNumber = input24;
        this.emails__email = input25;
        this.externalReference__externalReferenceId = input26;
        this.externalReference__externalReferenceIdSource = input27;
        this.externalReference__externalReferenceSourceDate = input28;
        this.addresses__rawAddressText = input29;
        this.addresses__state = input30;
        this.addresses__city = input31;
        this.addresses__area = input32;
        this.businessDetail__name = input33;
        this.department = input34;
        this.designation = input35;
        this.lastRepeatEnquiryDate = input36;
        this.lastRepeatEnquirySource = input37;
        this.gender = input38;
        this.isDecisionMaker = input39;
        this.isPrivate = input40;
        this.lockPeriod = input41;
        this.name = input42;
        this.profilePhotoUrl = input43;
        this.referredBy = input44;
        this.salutation = input45;
        this.seniority = input46;
        this.updatedById = input47;
        this.hasTask = input48;
        this.openTaskActivityType = input49;
        this.lastCalledTime = input50;
        this.lastCallDirection = input51;
        this.lastCallOutcome = input52;
        this.lastCallOutcomeNature = input53;
        this.lastCallUserId = input54;
        this.lastCallDuration = input55;
        this.lastCallEngagementId = input56;
        this.lastVisitTime = input57;
        this.lastVisitOutcome = input58;
        this.lastVisitOutcomeNature = input59;
        this.lastVisitUserId = input60;
        this.lastVisitEngagementId = input61;
        this.lastEmailTime = input62;
        this.lastEmailUserId = input63;
        this.lastWhatsappTime = input64;
        this.lastWhatsappUserId = input65;
        this.lastWhatsappEngagementId = input66;
        this.lastWabaBroadcastTime = input67;
        this.lastWabaBroadcastStatus = input68;
        this.lastWabaBroadcastTemplate = input69;
        this.lastWabaBroadcastReplyBody = input70;
        this.lastWabaBroadcastReplyTime = input71;
        this.lastWabaBroadcastReplyType = input72;
        this.lastSmsTime = input73;
        this.lastSmsUserId = input74;
        this.lastSmsEngagementId = input75;
        this.lastEmailEngagementId = input76;
        this.lastNoteAddedTime = input77;
        this.lastNoteUserId = input78;
        this.lastNoteEngagementId = input79;
        this.lastTaskDoneTime = input80;
        this.lastTaskDoneUserId = input81;
        this.lastTaskDoneEngagementId = input82;
        this.openTaskCount = input83;
        this.lastKnownDisposition = input84;
        this.lastKnownDispositionTime = input85;
        this.lastLeadAssignmentDateTime = input86;
        this.lastEngagementFromAccount = input87;
        this.lastEngagementFromContact = input88;
        this.freshLeadTag = input89;
        this.noWorkAfterAssignment = input90;
        this.needFollowUpTag = input91;
        this.needFollowUpTagUpdatedAt = input92;
        this.activeDealStage = input93;
        this.activeDealStageUpdatedAt = input94;
        this.dealDescription = input95;
        this.isCustomer = input96;
        this.becameCustomerOn = input97;
        this.unsuccessfulCallAttempts = input98;
        this.leadCallsNotAnswered = input99;
        this.userDefinedTags = input100;
        this.productService = input101;
        this.bulkUploadReference = input102;
        this.assignmentMethod = input103;
        this.recentEngagements = input104;
        this.recentEngagementsUpdatedAt = input105;
        this.openTaskDetail__taskType = input106;
        this.openVideoCallDetail = input107;
        this.lastClosedTaskDetail__taskType = input108;
        this.paymentRequestDetail = input109;
        this.lastPaymentStatus = input110;
        this.latestRemark = input111;
        this.customAttributes = input112;
        this.customAttributesSortable = input113;
        this.leadLifecycleStage = input114;
        this.leadLifecycleStageSubCategory = input115;
        this.manualClosedReason = input116;
        this.lastDealStageType = input117;
        this.prospectingAttempts = input118;
        this.totalProspectingAttemptsAcrossRechurn = input119;
        this.numberOfTimesRechurned = input120;
        this.lastProspectingDoneOn = input121;
        this.firstProspectingDoneOn = input122;
        this.nextProspectingDueOn = input123;
        this.nextProspectingSetBy = input124;
        this.nextProspectingNote = input125;
        this.movedToOpportunityOn = input126;
        this.movedToClosedOn = input127;
        this.paymentRequestDetail__amount = input128;
        this.createdAt = input129;
        this.updatedAt = input130;
        this.and = input131;
        this.or = input132;
        this.not = input133;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public SearchableStringFilterInput accountPriority() {
        return this.accountPriority.value;
    }

    public SearchableStringFilterInput activeDealStage() {
        return this.activeDealStage.value;
    }

    public SearchableStringFilterInput activeDealStageUpdatedAt() {
        return this.activeDealStageUpdatedAt.value;
    }

    public SearchableIDFilterInput addedById() {
        return this.addedById.value;
    }

    public SearchableStringFilterInput addresses__area() {
        return this.addresses__area.value;
    }

    public SearchableStringFilterInput addresses__city() {
        return this.addresses__city.value;
    }

    public SearchableStringFilterInput addresses__rawAddressText() {
        return this.addresses__rawAddressText.value;
    }

    public SearchableStringFilterInput addresses__state() {
        return this.addresses__state.value;
    }

    public List<SearchableContactFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput assignedToId() {
        return this.assignedToId.value;
    }

    public SearchableStringFilterInput assignmentMethod() {
        return this.assignmentMethod.value;
    }

    public SearchableStringFilterInput becameCustomerOn() {
        return this.becameCustomerOn.value;
    }

    public SearchableIDFilterInput blockedForCallById() {
        return this.blockedForCallById.value;
    }

    public SearchableStringFilterInput blockedForCallReason() {
        return this.blockedForCallReason.value;
    }

    public SearchableStringFilterInput blockedForCallUntil() {
        return this.blockedForCallUntil.value;
    }

    public SearchableStringFilterInput bulkUploadReference() {
        return this.bulkUploadReference.value;
    }

    public SearchableStringFilterInput businessDetail__name() {
        return this.businessDetail__name.value;
    }

    public SearchableStringFilterInput callPriority() {
        return this.callPriority.value;
    }

    public SearchableStringFilterInput contactNumberDetail__phoneNumber() {
        return this.contactNumberDetail__phoneNumber.value;
    }

    public SearchableStringFilterInput contactSource() {
        return this.contactSource.value;
    }

    public SearchableStringFilterInput contactSourceDrillDownOne() {
        return this.contactSourceDrillDownOne.value;
    }

    public SearchableIDFilterInput contactSourceDrillDownOneId() {
        return this.contactSourceDrillDownOneId.value;
    }

    public SearchableStringFilterInput contactSourceDrillDownThree() {
        return this.contactSourceDrillDownThree.value;
    }

    public SearchableIDFilterInput contactSourceDrillDownThreeId() {
        return this.contactSourceDrillDownThreeId.value;
    }

    public SearchableStringFilterInput contactSourceDrillDownTwo() {
        return this.contactSourceDrillDownTwo.value;
    }

    public SearchableIDFilterInput contactSourceDrillDownTwoId() {
        return this.contactSourceDrillDownTwoId.value;
    }

    public SearchableStringFilterInput contactStatus() {
        return this.contactStatus.value;
    }

    public SearchableStringFilterInput contactType() {
        return this.contactType.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableCustomAttributeFilterInput customAttributes() {
        return this.customAttributes.value;
    }

    public SearchableIDFilterInput customAttributesSortable() {
        return this.customAttributesSortable.value;
    }

    public SearchableStringFilterInput dealDescription() {
        return this.dealDescription.value;
    }

    public SearchableStringFilterInput department() {
        return this.department.value;
    }

    public SearchableStringFilterInput designation() {
        return this.designation.value;
    }

    public SearchableStringFilterInput emails__email() {
        return this.emails__email.value;
    }

    public SearchableStringFilterInput externalReference__externalReferenceId() {
        return this.externalReference__externalReferenceId.value;
    }

    public SearchableStringFilterInput externalReference__externalReferenceIdSource() {
        return this.externalReference__externalReferenceIdSource.value;
    }

    public SearchableStringFilterInput externalReference__externalReferenceSourceDate() {
        return this.externalReference__externalReferenceSourceDate.value;
    }

    public SearchableStringFilterInput firstProspectingDoneOn() {
        return this.firstProspectingDoneOn.value;
    }

    public SearchableStringFilterInput freshLeadTag() {
        return this.freshLeadTag.value;
    }

    public SearchableStringFilterInput gender() {
        return this.gender.value;
    }

    public SearchableBooleanFilterInput hasTask() {
        return this.hasTask.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableStringFilterInput isCustomer() {
        return this.isCustomer.value;
    }

    public SearchableBooleanFilterInput isDecisionMaker() {
        return this.isDecisionMaker.value;
    }

    public SearchableBooleanFilterInput isPrivate() {
        return this.isPrivate.value;
    }

    public SearchableStringFilterInput lastCallDirection() {
        return this.lastCallDirection.value;
    }

    public SearchableIntFilterInput lastCallDuration() {
        return this.lastCallDuration.value;
    }

    public SearchableStringFilterInput lastCallEngagementId() {
        return this.lastCallEngagementId.value;
    }

    public SearchableStringFilterInput lastCallOutcome() {
        return this.lastCallOutcome.value;
    }

    public SearchableStringFilterInput lastCallOutcomeNature() {
        return this.lastCallOutcomeNature.value;
    }

    public SearchableIDFilterInput lastCallUserId() {
        return this.lastCallUserId.value;
    }

    public SearchableStringFilterInput lastCalledTime() {
        return this.lastCalledTime.value;
    }

    public SearchableStringFilterInput lastClosedTaskDetail__taskType() {
        return this.lastClosedTaskDetail__taskType.value;
    }

    public SearchableStringFilterInput lastDealStageType() {
        return this.lastDealStageType.value;
    }

    public SearchableStringFilterInput lastEmailEngagementId() {
        return this.lastEmailEngagementId.value;
    }

    public SearchableStringFilterInput lastEmailTime() {
        return this.lastEmailTime.value;
    }

    public SearchableIDFilterInput lastEmailUserId() {
        return this.lastEmailUserId.value;
    }

    public SearchableStringFilterInput lastEngagementFromAccount() {
        return this.lastEngagementFromAccount.value;
    }

    public SearchableStringFilterInput lastEngagementFromContact() {
        return this.lastEngagementFromContact.value;
    }

    public SearchableStringFilterInput lastKnownDisposition() {
        return this.lastKnownDisposition.value;
    }

    public SearchableStringFilterInput lastKnownDispositionTime() {
        return this.lastKnownDispositionTime.value;
    }

    public SearchableStringFilterInput lastLeadAssignmentDateTime() {
        return this.lastLeadAssignmentDateTime.value;
    }

    public SearchableStringFilterInput lastNoteAddedTime() {
        return this.lastNoteAddedTime.value;
    }

    public SearchableStringFilterInput lastNoteEngagementId() {
        return this.lastNoteEngagementId.value;
    }

    public SearchableIDFilterInput lastNoteUserId() {
        return this.lastNoteUserId.value;
    }

    public SearchableStringFilterInput lastPaymentStatus() {
        return this.lastPaymentStatus.value;
    }

    public SearchableStringFilterInput lastProspectingDoneOn() {
        return this.lastProspectingDoneOn.value;
    }

    public SearchableStringFilterInput lastRepeatEnquiryDate() {
        return this.lastRepeatEnquiryDate.value;
    }

    public SearchableStringFilterInput lastRepeatEnquirySource() {
        return this.lastRepeatEnquirySource.value;
    }

    public SearchableIDFilterInput lastSmsEngagementId() {
        return this.lastSmsEngagementId.value;
    }

    public ModelStringInput lastSmsTime() {
        return this.lastSmsTime.value;
    }

    public SearchableStringFilterInput lastSmsUserId() {
        return this.lastSmsUserId.value;
    }

    public SearchableStringFilterInput lastTaskDoneEngagementId() {
        return this.lastTaskDoneEngagementId.value;
    }

    public SearchableStringFilterInput lastTaskDoneTime() {
        return this.lastTaskDoneTime.value;
    }

    public SearchableIDFilterInput lastTaskDoneUserId() {
        return this.lastTaskDoneUserId.value;
    }

    public SearchableStringFilterInput lastVisitEngagementId() {
        return this.lastVisitEngagementId.value;
    }

    public SearchableStringFilterInput lastVisitOutcome() {
        return this.lastVisitOutcome.value;
    }

    public SearchableStringFilterInput lastVisitOutcomeNature() {
        return this.lastVisitOutcomeNature.value;
    }

    public SearchableStringFilterInput lastVisitTime() {
        return this.lastVisitTime.value;
    }

    public SearchableIDFilterInput lastVisitUserId() {
        return this.lastVisitUserId.value;
    }

    public SearchableStringFilterInput lastWabaBroadcastReplyBody() {
        return this.lastWabaBroadcastReplyBody.value;
    }

    public SearchableStringFilterInput lastWabaBroadcastReplyTime() {
        return this.lastWabaBroadcastReplyTime.value;
    }

    public SearchableStringFilterInput lastWabaBroadcastReplyType() {
        return this.lastWabaBroadcastReplyType.value;
    }

    public SearchableStringFilterInput lastWabaBroadcastStatus() {
        return this.lastWabaBroadcastStatus.value;
    }

    public SearchableStringFilterInput lastWabaBroadcastTemplate() {
        return this.lastWabaBroadcastTemplate.value;
    }

    public SearchableStringFilterInput lastWabaBroadcastTime() {
        return this.lastWabaBroadcastTime.value;
    }

    public SearchableIDFilterInput lastWhatsappEngagementId() {
        return this.lastWhatsappEngagementId.value;
    }

    public SearchableStringFilterInput lastWhatsappTime() {
        return this.lastWhatsappTime.value;
    }

    public SearchableIDFilterInput lastWhatsappUserId() {
        return this.lastWhatsappUserId.value;
    }

    public SearchableStringFilterInput latestRemark() {
        return this.latestRemark.value;
    }

    public SearchableIntFilterInput leadCallsNotAnswered() {
        return this.leadCallsNotAnswered.value;
    }

    public SearchableStringFilterInput leadLifecycleStage() {
        return this.leadLifecycleStage.value;
    }

    public SearchableStringFilterInput leadLifecycleStageSubCategory() {
        return this.leadLifecycleStageSubCategory.value;
    }

    public SearchableStringFilterInput lockPeriod() {
        return this.lockPeriod.value;
    }

    public SearchableStringFilterInput manualClosedReason() {
        return this.manualClosedReason.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableContactFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableContactFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableContactFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableContactFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableContactFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeObject("toBeAssigned", SearchableContactFilterInput.this.toBeAssigned.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.toBeAssigned.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.sharedOwners.defined) {
                    inputFieldWriter.writeObject("sharedOwners", SearchableContactFilterInput.this.sharedOwners.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.sharedOwners.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", SearchableContactFilterInput.this.primaryTeamId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.sharedTeams.defined) {
                    inputFieldWriter.writeObject("sharedTeams", SearchableContactFilterInput.this.sharedTeams.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.sharedTeams.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.accountPriority.defined) {
                    inputFieldWriter.writeObject("accountPriority", SearchableContactFilterInput.this.accountPriority.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.accountPriority.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", SearchableContactFilterInput.this.addedById.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.addedById.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.assignedToId.defined) {
                    inputFieldWriter.writeObject("assignedToId", SearchableContactFilterInput.this.assignedToId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.assignedToId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.blockedForCallById.defined) {
                    inputFieldWriter.writeObject("blockedForCallById", SearchableContactFilterInput.this.blockedForCallById.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.blockedForCallById.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.blockedForCallReason.defined) {
                    inputFieldWriter.writeObject("blockedForCallReason", SearchableContactFilterInput.this.blockedForCallReason.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.blockedForCallReason.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.blockedForCallUntil.defined) {
                    inputFieldWriter.writeObject("blockedForCallUntil", SearchableContactFilterInput.this.blockedForCallUntil.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.blockedForCallUntil.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.callPriority.defined) {
                    inputFieldWriter.writeObject("callPriority", SearchableContactFilterInput.this.callPriority.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.callPriority.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.contactSource.defined) {
                    inputFieldWriter.writeObject("contactSource", SearchableContactFilterInput.this.contactSource.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.contactSource.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.contactSourceDrillDownOne.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownOne", SearchableContactFilterInput.this.contactSourceDrillDownOne.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.contactSourceDrillDownOne.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.contactSourceDrillDownTwo.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownTwo", SearchableContactFilterInput.this.contactSourceDrillDownTwo.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.contactSourceDrillDownTwo.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.contactSourceDrillDownThree.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownThree", SearchableContactFilterInput.this.contactSourceDrillDownThree.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.contactSourceDrillDownThree.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.contactSourceDrillDownOneId.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownOneId", SearchableContactFilterInput.this.contactSourceDrillDownOneId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.contactSourceDrillDownOneId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.contactSourceDrillDownTwoId.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownTwoId", SearchableContactFilterInput.this.contactSourceDrillDownTwoId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.contactSourceDrillDownTwoId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.contactSourceDrillDownThreeId.defined) {
                    inputFieldWriter.writeObject("contactSourceDrillDownThreeId", SearchableContactFilterInput.this.contactSourceDrillDownThreeId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.contactSourceDrillDownThreeId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.contactStatus.defined) {
                    inputFieldWriter.writeObject("contactStatus", SearchableContactFilterInput.this.contactStatus.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.contactStatus.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.contactType.defined) {
                    inputFieldWriter.writeObject("contactType", SearchableContactFilterInput.this.contactType.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.contactType.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.contactNumberDetail__phoneNumber.defined) {
                    inputFieldWriter.writeObject("contactNumberDetail__phoneNumber", SearchableContactFilterInput.this.contactNumberDetail__phoneNumber.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.contactNumberDetail__phoneNumber.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.emails__email.defined) {
                    inputFieldWriter.writeObject("emails__email", SearchableContactFilterInput.this.emails__email.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.emails__email.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.externalReference__externalReferenceId.defined) {
                    inputFieldWriter.writeObject("externalReference__externalReferenceId", SearchableContactFilterInput.this.externalReference__externalReferenceId.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.externalReference__externalReferenceId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.externalReference__externalReferenceIdSource.defined) {
                    inputFieldWriter.writeObject("externalReference__externalReferenceIdSource", SearchableContactFilterInput.this.externalReference__externalReferenceIdSource.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.externalReference__externalReferenceIdSource.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.externalReference__externalReferenceSourceDate.defined) {
                    inputFieldWriter.writeObject("externalReference__externalReferenceSourceDate", SearchableContactFilterInput.this.externalReference__externalReferenceSourceDate.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.externalReference__externalReferenceSourceDate.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.addresses__rawAddressText.defined) {
                    inputFieldWriter.writeObject("addresses__rawAddressText", SearchableContactFilterInput.this.addresses__rawAddressText.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.addresses__rawAddressText.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.addresses__state.defined) {
                    inputFieldWriter.writeObject("addresses__state", SearchableContactFilterInput.this.addresses__state.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.addresses__state.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.addresses__city.defined) {
                    inputFieldWriter.writeObject("addresses__city", SearchableContactFilterInput.this.addresses__city.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.addresses__city.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.addresses__area.defined) {
                    inputFieldWriter.writeObject("addresses__area", SearchableContactFilterInput.this.addresses__area.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.addresses__area.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.businessDetail__name.defined) {
                    inputFieldWriter.writeObject("businessDetail__name", SearchableContactFilterInput.this.businessDetail__name.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.businessDetail__name.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.department.defined) {
                    inputFieldWriter.writeObject("department", SearchableContactFilterInput.this.department.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.department.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.designation.defined) {
                    inputFieldWriter.writeObject("designation", SearchableContactFilterInput.this.designation.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.designation.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastRepeatEnquiryDate.defined) {
                    inputFieldWriter.writeObject("lastRepeatEnquiryDate", SearchableContactFilterInput.this.lastRepeatEnquiryDate.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastRepeatEnquiryDate.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastRepeatEnquirySource.defined) {
                    inputFieldWriter.writeObject("lastRepeatEnquirySource", SearchableContactFilterInput.this.lastRepeatEnquirySource.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastRepeatEnquirySource.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.gender.defined) {
                    inputFieldWriter.writeObject("gender", SearchableContactFilterInput.this.gender.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.gender.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.isDecisionMaker.defined) {
                    inputFieldWriter.writeObject("isDecisionMaker", SearchableContactFilterInput.this.isDecisionMaker.value != 0 ? ((SearchableBooleanFilterInput) SearchableContactFilterInput.this.isDecisionMaker.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.isPrivate.defined) {
                    inputFieldWriter.writeObject("isPrivate", SearchableContactFilterInput.this.isPrivate.value != 0 ? ((SearchableBooleanFilterInput) SearchableContactFilterInput.this.isPrivate.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lockPeriod.defined) {
                    inputFieldWriter.writeObject("lockPeriod", SearchableContactFilterInput.this.lockPeriod.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lockPeriod.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", SearchableContactFilterInput.this.name.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.name.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.profilePhotoUrl.defined) {
                    inputFieldWriter.writeObject("profilePhotoUrl", SearchableContactFilterInput.this.profilePhotoUrl.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.profilePhotoUrl.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.referredBy.defined) {
                    inputFieldWriter.writeObject("referredBy", SearchableContactFilterInput.this.referredBy.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.referredBy.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.salutation.defined) {
                    inputFieldWriter.writeObject("salutation", SearchableContactFilterInput.this.salutation.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.salutation.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.seniority.defined) {
                    inputFieldWriter.writeObject("seniority", SearchableContactFilterInput.this.seniority.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.seniority.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", SearchableContactFilterInput.this.updatedById.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.hasTask.defined) {
                    inputFieldWriter.writeObject("hasTask", SearchableContactFilterInput.this.hasTask.value != 0 ? ((SearchableBooleanFilterInput) SearchableContactFilterInput.this.hasTask.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.openTaskActivityType.defined) {
                    inputFieldWriter.writeObject("openTaskActivityType", SearchableContactFilterInput.this.openTaskActivityType.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.openTaskActivityType.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastCalledTime.defined) {
                    inputFieldWriter.writeObject("lastCalledTime", SearchableContactFilterInput.this.lastCalledTime.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastCalledTime.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastCallDirection.defined) {
                    inputFieldWriter.writeObject("lastCallDirection", SearchableContactFilterInput.this.lastCallDirection.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastCallDirection.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastCallOutcome.defined) {
                    inputFieldWriter.writeObject("lastCallOutcome", SearchableContactFilterInput.this.lastCallOutcome.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastCallOutcome.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastCallOutcomeNature.defined) {
                    inputFieldWriter.writeObject("lastCallOutcomeNature", SearchableContactFilterInput.this.lastCallOutcomeNature.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastCallOutcomeNature.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastCallUserId.defined) {
                    inputFieldWriter.writeObject("lastCallUserId", SearchableContactFilterInput.this.lastCallUserId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.lastCallUserId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastCallDuration.defined) {
                    inputFieldWriter.writeObject("lastCallDuration", SearchableContactFilterInput.this.lastCallDuration.value != 0 ? ((SearchableIntFilterInput) SearchableContactFilterInput.this.lastCallDuration.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastCallEngagementId.defined) {
                    inputFieldWriter.writeObject("lastCallEngagementId", SearchableContactFilterInput.this.lastCallEngagementId.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastCallEngagementId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastVisitTime.defined) {
                    inputFieldWriter.writeObject("lastVisitTime", SearchableContactFilterInput.this.lastVisitTime.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastVisitTime.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastVisitOutcome.defined) {
                    inputFieldWriter.writeObject("lastVisitOutcome", SearchableContactFilterInput.this.lastVisitOutcome.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastVisitOutcome.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastVisitOutcomeNature.defined) {
                    inputFieldWriter.writeObject("lastVisitOutcomeNature", SearchableContactFilterInput.this.lastVisitOutcomeNature.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastVisitOutcomeNature.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastVisitUserId.defined) {
                    inputFieldWriter.writeObject("lastVisitUserId", SearchableContactFilterInput.this.lastVisitUserId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.lastVisitUserId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastVisitEngagementId.defined) {
                    inputFieldWriter.writeObject("lastVisitEngagementId", SearchableContactFilterInput.this.lastVisitEngagementId.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastVisitEngagementId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastEmailTime.defined) {
                    inputFieldWriter.writeObject("lastEmailTime", SearchableContactFilterInput.this.lastEmailTime.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastEmailTime.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastEmailUserId.defined) {
                    inputFieldWriter.writeObject("lastEmailUserId", SearchableContactFilterInput.this.lastEmailUserId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.lastEmailUserId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastWhatsappTime.defined) {
                    inputFieldWriter.writeObject("lastWhatsappTime", SearchableContactFilterInput.this.lastWhatsappTime.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastWhatsappTime.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastWhatsappUserId.defined) {
                    inputFieldWriter.writeObject("lastWhatsappUserId", SearchableContactFilterInput.this.lastWhatsappUserId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.lastWhatsappUserId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastWhatsappEngagementId.defined) {
                    inputFieldWriter.writeObject("lastWhatsappEngagementId", SearchableContactFilterInput.this.lastWhatsappEngagementId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.lastWhatsappEngagementId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastWabaBroadcastTime.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastTime", SearchableContactFilterInput.this.lastWabaBroadcastTime.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastWabaBroadcastTime.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastWabaBroadcastStatus.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastStatus", SearchableContactFilterInput.this.lastWabaBroadcastStatus.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastWabaBroadcastStatus.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastWabaBroadcastTemplate.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastTemplate", SearchableContactFilterInput.this.lastWabaBroadcastTemplate.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastWabaBroadcastTemplate.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastWabaBroadcastReplyBody.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastReplyBody", SearchableContactFilterInput.this.lastWabaBroadcastReplyBody.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastWabaBroadcastReplyBody.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastWabaBroadcastReplyTime.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastReplyTime", SearchableContactFilterInput.this.lastWabaBroadcastReplyTime.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastWabaBroadcastReplyTime.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastWabaBroadcastReplyType.defined) {
                    inputFieldWriter.writeObject("lastWabaBroadcastReplyType", SearchableContactFilterInput.this.lastWabaBroadcastReplyType.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastWabaBroadcastReplyType.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastSmsTime.defined) {
                    inputFieldWriter.writeObject("lastSmsTime", SearchableContactFilterInput.this.lastSmsTime.value != 0 ? ((ModelStringInput) SearchableContactFilterInput.this.lastSmsTime.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastSmsUserId.defined) {
                    inputFieldWriter.writeObject("lastSmsUserId", SearchableContactFilterInput.this.lastSmsUserId.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastSmsUserId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastSmsEngagementId.defined) {
                    inputFieldWriter.writeObject("lastSmsEngagementId", SearchableContactFilterInput.this.lastSmsEngagementId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.lastSmsEngagementId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastEmailEngagementId.defined) {
                    inputFieldWriter.writeObject("lastEmailEngagementId", SearchableContactFilterInput.this.lastEmailEngagementId.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastEmailEngagementId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastNoteAddedTime.defined) {
                    inputFieldWriter.writeObject("lastNoteAddedTime", SearchableContactFilterInput.this.lastNoteAddedTime.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastNoteAddedTime.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastNoteUserId.defined) {
                    inputFieldWriter.writeObject("lastNoteUserId", SearchableContactFilterInput.this.lastNoteUserId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.lastNoteUserId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastNoteEngagementId.defined) {
                    inputFieldWriter.writeObject("lastNoteEngagementId", SearchableContactFilterInput.this.lastNoteEngagementId.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastNoteEngagementId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastTaskDoneTime.defined) {
                    inputFieldWriter.writeObject("lastTaskDoneTime", SearchableContactFilterInput.this.lastTaskDoneTime.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastTaskDoneTime.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastTaskDoneUserId.defined) {
                    inputFieldWriter.writeObject("lastTaskDoneUserId", SearchableContactFilterInput.this.lastTaskDoneUserId.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.lastTaskDoneUserId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastTaskDoneEngagementId.defined) {
                    inputFieldWriter.writeObject("lastTaskDoneEngagementId", SearchableContactFilterInput.this.lastTaskDoneEngagementId.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastTaskDoneEngagementId.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.openTaskCount.defined) {
                    inputFieldWriter.writeObject("openTaskCount", SearchableContactFilterInput.this.openTaskCount.value != 0 ? ((SearchableIntFilterInput) SearchableContactFilterInput.this.openTaskCount.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastKnownDisposition.defined) {
                    inputFieldWriter.writeObject("lastKnownDisposition", SearchableContactFilterInput.this.lastKnownDisposition.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastKnownDisposition.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastKnownDispositionTime.defined) {
                    inputFieldWriter.writeObject("lastKnownDispositionTime", SearchableContactFilterInput.this.lastKnownDispositionTime.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastKnownDispositionTime.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastLeadAssignmentDateTime.defined) {
                    inputFieldWriter.writeObject("lastLeadAssignmentDateTime", SearchableContactFilterInput.this.lastLeadAssignmentDateTime.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastLeadAssignmentDateTime.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastEngagementFromAccount.defined) {
                    inputFieldWriter.writeObject("lastEngagementFromAccount", SearchableContactFilterInput.this.lastEngagementFromAccount.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastEngagementFromAccount.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastEngagementFromContact.defined) {
                    inputFieldWriter.writeObject("lastEngagementFromContact", SearchableContactFilterInput.this.lastEngagementFromContact.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastEngagementFromContact.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.freshLeadTag.defined) {
                    inputFieldWriter.writeObject("freshLeadTag", SearchableContactFilterInput.this.freshLeadTag.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.freshLeadTag.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.noWorkAfterAssignment.defined) {
                    inputFieldWriter.writeObject("noWorkAfterAssignment", SearchableContactFilterInput.this.noWorkAfterAssignment.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.noWorkAfterAssignment.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.needFollowUpTag.defined) {
                    inputFieldWriter.writeObject("needFollowUpTag", SearchableContactFilterInput.this.needFollowUpTag.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.needFollowUpTag.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.needFollowUpTagUpdatedAt.defined) {
                    inputFieldWriter.writeObject("needFollowUpTagUpdatedAt", SearchableContactFilterInput.this.needFollowUpTagUpdatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.needFollowUpTagUpdatedAt.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.activeDealStage.defined) {
                    inputFieldWriter.writeObject("activeDealStage", SearchableContactFilterInput.this.activeDealStage.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.activeDealStage.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.activeDealStageUpdatedAt.defined) {
                    inputFieldWriter.writeObject("activeDealStageUpdatedAt", SearchableContactFilterInput.this.activeDealStageUpdatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.activeDealStageUpdatedAt.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.dealDescription.defined) {
                    inputFieldWriter.writeObject("dealDescription", SearchableContactFilterInput.this.dealDescription.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.dealDescription.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.isCustomer.defined) {
                    inputFieldWriter.writeObject("isCustomer", SearchableContactFilterInput.this.isCustomer.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.isCustomer.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.becameCustomerOn.defined) {
                    inputFieldWriter.writeObject("becameCustomerOn", SearchableContactFilterInput.this.becameCustomerOn.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.becameCustomerOn.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.unsuccessfulCallAttempts.defined) {
                    inputFieldWriter.writeObject("unsuccessfulCallAttempts", SearchableContactFilterInput.this.unsuccessfulCallAttempts.value != 0 ? ((SearchableIntFilterInput) SearchableContactFilterInput.this.unsuccessfulCallAttempts.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.leadCallsNotAnswered.defined) {
                    inputFieldWriter.writeObject("leadCallsNotAnswered", SearchableContactFilterInput.this.leadCallsNotAnswered.value != 0 ? ((SearchableIntFilterInput) SearchableContactFilterInput.this.leadCallsNotAnswered.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.userDefinedTags.defined) {
                    inputFieldWriter.writeObject("userDefinedTags", SearchableContactFilterInput.this.userDefinedTags.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.userDefinedTags.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.productService.defined) {
                    inputFieldWriter.writeObject("productService", SearchableContactFilterInput.this.productService.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.productService.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.bulkUploadReference.defined) {
                    inputFieldWriter.writeObject("bulkUploadReference", SearchableContactFilterInput.this.bulkUploadReference.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.bulkUploadReference.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.assignmentMethod.defined) {
                    inputFieldWriter.writeObject("assignmentMethod", SearchableContactFilterInput.this.assignmentMethod.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.assignmentMethod.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.recentEngagements.defined) {
                    inputFieldWriter.writeObject("recentEngagements", SearchableContactFilterInput.this.recentEngagements.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.recentEngagements.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.recentEngagementsUpdatedAt.defined) {
                    inputFieldWriter.writeObject("recentEngagementsUpdatedAt", SearchableContactFilterInput.this.recentEngagementsUpdatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.recentEngagementsUpdatedAt.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.openTaskDetail__taskType.defined) {
                    inputFieldWriter.writeObject("openTaskDetail__taskType", SearchableContactFilterInput.this.openTaskDetail__taskType.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.openTaskDetail__taskType.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.openVideoCallDetail.defined) {
                    inputFieldWriter.writeObject("openVideoCallDetail", SearchableContactFilterInput.this.openVideoCallDetail.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.openVideoCallDetail.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastClosedTaskDetail__taskType.defined) {
                    inputFieldWriter.writeObject("lastClosedTaskDetail__taskType", SearchableContactFilterInput.this.lastClosedTaskDetail__taskType.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastClosedTaskDetail__taskType.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.paymentRequestDetail.defined) {
                    inputFieldWriter.writeObject("paymentRequestDetail", SearchableContactFilterInput.this.paymentRequestDetail.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.paymentRequestDetail.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastPaymentStatus.defined) {
                    inputFieldWriter.writeObject("lastPaymentStatus", SearchableContactFilterInput.this.lastPaymentStatus.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastPaymentStatus.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.latestRemark.defined) {
                    inputFieldWriter.writeObject("latestRemark", SearchableContactFilterInput.this.latestRemark.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.latestRemark.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.customAttributes.defined) {
                    inputFieldWriter.writeObject("customAttributes", SearchableContactFilterInput.this.customAttributes.value != 0 ? ((SearchableCustomAttributeFilterInput) SearchableContactFilterInput.this.customAttributes.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.customAttributesSortable.defined) {
                    inputFieldWriter.writeObject("customAttributesSortable", SearchableContactFilterInput.this.customAttributesSortable.value != 0 ? ((SearchableIDFilterInput) SearchableContactFilterInput.this.customAttributesSortable.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.leadLifecycleStage.defined) {
                    inputFieldWriter.writeObject("leadLifecycleStage", SearchableContactFilterInput.this.leadLifecycleStage.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.leadLifecycleStage.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.leadLifecycleStageSubCategory.defined) {
                    inputFieldWriter.writeObject("leadLifecycleStageSubCategory", SearchableContactFilterInput.this.leadLifecycleStageSubCategory.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.leadLifecycleStageSubCategory.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.manualClosedReason.defined) {
                    inputFieldWriter.writeObject("manualClosedReason", SearchableContactFilterInput.this.manualClosedReason.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.manualClosedReason.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastDealStageType.defined) {
                    inputFieldWriter.writeObject("lastDealStageType", SearchableContactFilterInput.this.lastDealStageType.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastDealStageType.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.prospectingAttempts.defined) {
                    inputFieldWriter.writeObject("prospectingAttempts", SearchableContactFilterInput.this.prospectingAttempts.value != 0 ? ((SearchableIntFilterInput) SearchableContactFilterInput.this.prospectingAttempts.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.totalProspectingAttemptsAcrossRechurn.defined) {
                    inputFieldWriter.writeObject("totalProspectingAttemptsAcrossRechurn", SearchableContactFilterInput.this.totalProspectingAttemptsAcrossRechurn.value != 0 ? ((SearchableIntFilterInput) SearchableContactFilterInput.this.totalProspectingAttemptsAcrossRechurn.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.numberOfTimesRechurned.defined) {
                    inputFieldWriter.writeObject("numberOfTimesRechurned", SearchableContactFilterInput.this.numberOfTimesRechurned.value != 0 ? ((SearchableIntFilterInput) SearchableContactFilterInput.this.numberOfTimesRechurned.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.lastProspectingDoneOn.defined) {
                    inputFieldWriter.writeObject("lastProspectingDoneOn", SearchableContactFilterInput.this.lastProspectingDoneOn.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.lastProspectingDoneOn.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.firstProspectingDoneOn.defined) {
                    inputFieldWriter.writeObject("firstProspectingDoneOn", SearchableContactFilterInput.this.firstProspectingDoneOn.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.firstProspectingDoneOn.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.nextProspectingDueOn.defined) {
                    inputFieldWriter.writeObject("nextProspectingDueOn", SearchableContactFilterInput.this.nextProspectingDueOn.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.nextProspectingDueOn.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.nextProspectingSetBy.defined) {
                    inputFieldWriter.writeObject("nextProspectingSetBy", SearchableContactFilterInput.this.nextProspectingSetBy.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.nextProspectingSetBy.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.nextProspectingNote.defined) {
                    inputFieldWriter.writeObject("nextProspectingNote", SearchableContactFilterInput.this.nextProspectingNote.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.nextProspectingNote.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.movedToOpportunityOn.defined) {
                    inputFieldWriter.writeObject("movedToOpportunityOn", SearchableContactFilterInput.this.movedToOpportunityOn.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.movedToOpportunityOn.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.movedToClosedOn.defined) {
                    inputFieldWriter.writeObject("movedToClosedOn", SearchableContactFilterInput.this.movedToClosedOn.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.movedToClosedOn.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.paymentRequestDetail__amount.defined) {
                    inputFieldWriter.writeObject("paymentRequestDetail__amount", SearchableContactFilterInput.this.paymentRequestDetail__amount.value != 0 ? ((SearchableIntFilterInput) SearchableContactFilterInput.this.paymentRequestDetail__amount.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableContactFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableContactFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableContactFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableContactFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableContactFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableContactFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableContactFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableContactFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableContactFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableContactFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableContactFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableContactFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableContactFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableContactFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableContactFilterInput.this.not.value != 0 ? ((SearchableContactFilterInput) SearchableContactFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput movedToClosedOn() {
        return this.movedToClosedOn.value;
    }

    public SearchableStringFilterInput movedToOpportunityOn() {
        return this.movedToOpportunityOn.value;
    }

    public SearchableStringFilterInput name() {
        return this.name.value;
    }

    public SearchableStringFilterInput needFollowUpTag() {
        return this.needFollowUpTag.value;
    }

    public SearchableStringFilterInput needFollowUpTagUpdatedAt() {
        return this.needFollowUpTagUpdatedAt.value;
    }

    public SearchableStringFilterInput nextProspectingDueOn() {
        return this.nextProspectingDueOn.value;
    }

    public SearchableStringFilterInput nextProspectingNote() {
        return this.nextProspectingNote.value;
    }

    public SearchableStringFilterInput nextProspectingSetBy() {
        return this.nextProspectingSetBy.value;
    }

    public SearchableStringFilterInput noWorkAfterAssignment() {
        return this.noWorkAfterAssignment.value;
    }

    public SearchableContactFilterInput not() {
        return this.not.value;
    }

    public SearchableIntFilterInput numberOfTimesRechurned() {
        return this.numberOfTimesRechurned.value;
    }

    public SearchableStringFilterInput openTaskActivityType() {
        return this.openTaskActivityType.value;
    }

    public SearchableIntFilterInput openTaskCount() {
        return this.openTaskCount.value;
    }

    public SearchableStringFilterInput openTaskDetail__taskType() {
        return this.openTaskDetail__taskType.value;
    }

    public SearchableStringFilterInput openVideoCallDetail() {
        return this.openVideoCallDetail.value;
    }

    public List<SearchableContactFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput ownerId() {
        return this.ownerId.value;
    }

    public SearchableStringFilterInput paymentRequestDetail() {
        return this.paymentRequestDetail.value;
    }

    public SearchableIntFilterInput paymentRequestDetail__amount() {
        return this.paymentRequestDetail__amount.value;
    }

    public SearchableIDFilterInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public SearchableStringFilterInput productService() {
        return this.productService.value;
    }

    public SearchableStringFilterInput profilePhotoUrl() {
        return this.profilePhotoUrl.value;
    }

    public SearchableIntFilterInput prospectingAttempts() {
        return this.prospectingAttempts.value;
    }

    public SearchableStringFilterInput recentEngagements() {
        return this.recentEngagements.value;
    }

    public SearchableStringFilterInput recentEngagementsUpdatedAt() {
        return this.recentEngagementsUpdatedAt.value;
    }

    public SearchableStringFilterInput referredBy() {
        return this.referredBy.value;
    }

    public SearchableStringFilterInput salutation() {
        return this.salutation.value;
    }

    public SearchableStringFilterInput seniority() {
        return this.seniority.value;
    }

    public SearchableIDFilterInput sharedOwners() {
        return this.sharedOwners.value;
    }

    public SearchableIDFilterInput sharedTeams() {
        return this.sharedTeams.value;
    }

    public SearchableStringFilterInput toBeAssigned() {
        return this.toBeAssigned.value;
    }

    public SearchableIntFilterInput totalProspectingAttemptsAcrossRechurn() {
        return this.totalProspectingAttemptsAcrossRechurn.value;
    }

    public SearchableIntFilterInput unsuccessfulCallAttempts() {
        return this.unsuccessfulCallAttempts.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput updatedById() {
        return this.updatedById.value;
    }

    public SearchableStringFilterInput userDefinedTags() {
        return this.userDefinedTags.value;
    }
}
