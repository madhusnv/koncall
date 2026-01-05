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
public final class CreateContactInput implements InputType {
    private final String accountId;
    private final Input<String> accountPriority;
    private final Input<String> addedById;
    private final Input<List<AddressInput>> addresses;
    private final Input<String> assignedToId;
    private final Input<String> assignmentMethod;
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
    private final Input<String> department;
    private final Input<String> designation;
    private final Input<List<EmailInput>> emails;
    private final Input<List<ExternalReferenceInput>> externalReference;
    private final Input<String> firstProspectingDoneOn;
    private final Input<String> gender;
    private final Input<Boolean> hasTask;
    private final Input<String> id;
    private final Input<Boolean> isDecisionMaker;
    private final Input<Boolean> isPrivate;
    private final Input<CallDirection> lastCallDirection;
    private final Input<Integer> lastCallDuration;
    private final Input<String> lastCallEngagementId;
    private final Input<String> lastCallOutcome;
    private final Input<String> lastCallOutcomeNature;
    private final Input<String> lastCallUserId;
    private final Input<String> lastCalledTime;
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
    private final Input<String> lastWhatsappEngagementId;
    private final Input<String> lastWhatsappTime;
    private final Input<String> lastWhatsappUserId;
    private final Input<String> latestRemark;
    private final Input<LeadLifecycleStage> leadLifecycleStage;
    private final Input<LeadLifecycleStageSubCategory> leadLifecycleStageSubCategory;
    private final Input<String> lockPeriod;
    private final Input<String> manualClosedReason;
    private final Input<String> movedToClosedOn;
    private final Input<String> movedToOpportunityOn;
    private final Input<String> name;
    private final Input<String> nextProspectingDueOn;
    private final Input<String> nextProspectingNote;
    private final Input<String> nextProspectingSetBy;
    private final Input<TaskActivityType> openTaskActivityType;
    private final Input<Integer> openTaskCount;
    private final Input<String> ownerId;
    private final Input<List<Day>> preferredContactDays;
    private final Input<String> primaryTeamId;
    private final Input<List<String>> productService;
    private final Input<String> profilePhotoUrl;
    private final Input<Integer> prospectingAttempts;
    private final Input<String> referredBy;
    private final Input<String> salutation;
    private final Input<Seniority> seniority;
    private final Input<List<String>> sharedOwners;
    private final Input<List<String>> sharedTeams;
    private final Input<ContactAssignmentStatus> toBeAssigned;
    private final Input<String> updatedAt;
    private final Input<List<String>> userDefinedTags;

    public static final class Builder {
        private String accountId;
        private Input<String> id = Input.absent();
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
        private Input<String> lastPaymentStatus = Input.absent();
        private Input<String> movedToOpportunityOn = Input.absent();
        private Input<String> movedToClosedOn = Input.absent();
        private Input<String> latestRemark = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder accountPriority(String str) {
            this.accountPriority = Input.fromNullable(str);
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

        public CreateContactInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreateContactInput(this.id, this.accountId, this.ownerId, this.toBeAssigned, this.sharedOwners, this.primaryTeamId, this.sharedTeams, this.accountPriority, this.addedById, this.addresses, this.assignedToId, this.blockedForCallById, this.blockedForCallReason, this.blockedForCallUntil, this.callPriority, this.contactNumberDetail, this.businessDetail, this.contactSource, this.contactSourceDrillDownOne, this.contactSourceDrillDownTwo, this.contactSourceDrillDownThree, this.contactSourceDrillDownOneId, this.contactSourceDrillDownTwoId, this.contactSourceDrillDownThreeId, this.contactStatus, this.contactType, this.department, this.designation, this.emails, this.externalReference, this.gender, this.isDecisionMaker, this.isPrivate, this.lockPeriod, this.name, this.preferredContactDays, this.profilePhotoUrl, this.referredBy, this.salutation, this.seniority, this.hasTask, this.openTaskActivityType, this.lastCalledTime, this.lastCallDirection, this.lastCallOutcome, this.lastCallOutcomeNature, this.lastCallUserId, this.lastCallDuration, this.lastCallEngagementId, this.lastVisitTime, this.lastVisitOutcome, this.lastVisitOutcomeNature, this.lastVisitUserId, this.lastVisitEngagementId, this.lastEmailTime, this.lastEmailUserId, this.lastEmailEngagementId, this.lastWhatsappTime, this.lastWhatsappUserId, this.lastWhatsappEngagementId, this.lastSmsTime, this.lastSmsUserId, this.lastSmsEngagementId, this.lastNoteAddedTime, this.lastNoteUserId, this.lastNoteEngagementId, this.lastTaskDoneTime, this.lastTaskDoneUserId, this.lastTaskDoneEngagementId, this.openTaskCount, this.lastKnownDisposition, this.lastKnownDispositionTime, this.lastLeadAssignmentDateTime, this.lastEngagementFromAccount, this.lastEngagementFromContact, this.userDefinedTags, this.productService, this.createdAt, this.updatedAt, this.contactAssignedToId, this.contactBlockedForCallById, this.bulkUploadReference, this.assignmentMethod, this.customDataAddedFromAddContactForm, this.customAttributes, this.leadLifecycleStage, this.leadLifecycleStageSubCategory, this.manualClosedReason, this.lastDealStageType, this.prospectingAttempts, this.lastProspectingDoneOn, this.firstProspectingDoneOn, this.nextProspectingDueOn, this.nextProspectingSetBy, this.nextProspectingNote, this.lastPaymentStatus, this.movedToOpportunityOn, this.movedToClosedOn, this.latestRemark);
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

        public Builder gender(String str) {
            this.gender = Input.fromNullable(str);
            return this;
        }

        public Builder hasTask(Boolean bool) {
            this.hasTask = Input.fromNullable(bool);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
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

        public Builder openTaskActivityType(TaskActivityType taskActivityType) {
            this.openTaskActivityType = Input.fromNullable(taskActivityType);
            return this;
        }

        public Builder openTaskCount(Integer num) {
            this.openTaskCount = Input.fromNullable(num);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
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

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder userDefinedTags(List<String> list) {
            this.userDefinedTags = Input.fromNullable(list);
            return this;
        }
    }

    public CreateContactInput(Input<String> input, String str, Input<String> input2, Input<ContactAssignmentStatus> input3, Input<List<String>> input4, Input<String> input5, Input<List<String>> input6, Input<String> input7, Input<String> input8, Input<List<AddressInput>> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<List<ContactNumberDetailInput>> input15, Input<List<BusinessDetailInput>> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<ContactStatus> input24, Input<String> input25, Input<String> input26, Input<String> input27, Input<List<EmailInput>> input28, Input<List<ExternalReferenceInput>> input29, Input<String> input30, Input<Boolean> input31, Input<Boolean> input32, Input<String> input33, Input<String> input34, Input<List<Day>> input35, Input<String> input36, Input<String> input37, Input<String> input38, Input<Seniority> input39, Input<Boolean> input40, Input<TaskActivityType> input41, Input<String> input42, Input<CallDirection> input43, Input<String> input44, Input<String> input45, Input<String> input46, Input<Integer> input47, Input<String> input48, Input<String> input49, Input<String> input50, Input<String> input51, Input<String> input52, Input<String> input53, Input<String> input54, Input<String> input55, Input<String> input56, Input<String> input57, Input<String> input58, Input<String> input59, Input<String> input60, Input<String> input61, Input<String> input62, Input<String> input63, Input<String> input64, Input<String> input65, Input<String> input66, Input<String> input67, Input<String> input68, Input<Integer> input69, Input<String> input70, Input<String> input71, Input<String> input72, Input<String> input73, Input<String> input74, Input<List<String>> input75, Input<List<String>> input76, Input<String> input77, Input<String> input78, Input<String> input79, Input<String> input80, Input<String> input81, Input<String> input82, Input<String> input83, Input<String> input84, Input<LeadLifecycleStage> input85, Input<LeadLifecycleStageSubCategory> input86, Input<String> input87, Input<String> input88, Input<Integer> input89, Input<String> input90, Input<String> input91, Input<String> input92, Input<String> input93, Input<String> input94, Input<String> input95, Input<String> input96, Input<String> input97, Input<String> input98) {
        this.id = input;
        this.accountId = str;
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
        this.emails = input28;
        this.externalReference = input29;
        this.gender = input30;
        this.isDecisionMaker = input31;
        this.isPrivate = input32;
        this.lockPeriod = input33;
        this.name = input34;
        this.preferredContactDays = input35;
        this.profilePhotoUrl = input36;
        this.referredBy = input37;
        this.salutation = input38;
        this.seniority = input39;
        this.hasTask = input40;
        this.openTaskActivityType = input41;
        this.lastCalledTime = input42;
        this.lastCallDirection = input43;
        this.lastCallOutcome = input44;
        this.lastCallOutcomeNature = input45;
        this.lastCallUserId = input46;
        this.lastCallDuration = input47;
        this.lastCallEngagementId = input48;
        this.lastVisitTime = input49;
        this.lastVisitOutcome = input50;
        this.lastVisitOutcomeNature = input51;
        this.lastVisitUserId = input52;
        this.lastVisitEngagementId = input53;
        this.lastEmailTime = input54;
        this.lastEmailUserId = input55;
        this.lastEmailEngagementId = input56;
        this.lastWhatsappTime = input57;
        this.lastWhatsappUserId = input58;
        this.lastWhatsappEngagementId = input59;
        this.lastSmsTime = input60;
        this.lastSmsUserId = input61;
        this.lastSmsEngagementId = input62;
        this.lastNoteAddedTime = input63;
        this.lastNoteUserId = input64;
        this.lastNoteEngagementId = input65;
        this.lastTaskDoneTime = input66;
        this.lastTaskDoneUserId = input67;
        this.lastTaskDoneEngagementId = input68;
        this.openTaskCount = input69;
        this.lastKnownDisposition = input70;
        this.lastKnownDispositionTime = input71;
        this.lastLeadAssignmentDateTime = input72;
        this.lastEngagementFromAccount = input73;
        this.lastEngagementFromContact = input74;
        this.userDefinedTags = input75;
        this.productService = input76;
        this.createdAt = input77;
        this.updatedAt = input78;
        this.contactAssignedToId = input79;
        this.contactBlockedForCallById = input80;
        this.bulkUploadReference = input81;
        this.assignmentMethod = input82;
        this.customDataAddedFromAddContactForm = input83;
        this.customAttributes = input84;
        this.leadLifecycleStage = input85;
        this.leadLifecycleStageSubCategory = input86;
        this.manualClosedReason = input87;
        this.lastDealStageType = input88;
        this.prospectingAttempts = input89;
        this.lastProspectingDoneOn = input90;
        this.firstProspectingDoneOn = input91;
        this.nextProspectingDueOn = input92;
        this.nextProspectingSetBy = input93;
        this.nextProspectingNote = input94;
        this.lastPaymentStatus = input95;
        this.movedToOpportunityOn = input96;
        this.movedToClosedOn = input97;
        this.latestRemark = input98;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String accountPriority() {
        return this.accountPriority.value;
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

    public String gender() {
        return this.gender.value;
    }

    public Boolean hasTask() {
        return this.hasTask.value;
    }

    public String id() {
        return this.id.value;
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
        return new InputFieldMarshaller() { // from class: type.CreateContactInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateContactInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateContactInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateContactInput.this.accountId);
                if (CreateContactInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) CreateContactInput.this.ownerId.value);
                }
                if (CreateContactInput.this.toBeAssigned.defined) {
                    inputFieldWriter.writeString("toBeAssigned", CreateContactInput.this.toBeAssigned.value != 0 ? ((ContactAssignmentStatus) CreateContactInput.this.toBeAssigned.value).name() : null);
                }
                if (CreateContactInput.this.sharedOwners.defined) {
                    inputFieldWriter.writeList("sharedOwners", CreateContactInput.this.sharedOwners.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactInput.this.sharedOwners.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.ID, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateContactInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) CreateContactInput.this.primaryTeamId.value);
                }
                if (CreateContactInput.this.sharedTeams.defined) {
                    inputFieldWriter.writeList("sharedTeams", CreateContactInput.this.sharedTeams.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactInput.this.sharedTeams.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.ID, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateContactInput.this.accountPriority.defined) {
                    inputFieldWriter.writeString("accountPriority", (String) CreateContactInput.this.accountPriority.value);
                }
                if (CreateContactInput.this.addedById.defined) {
                    inputFieldWriter.writeString("addedById", (String) CreateContactInput.this.addedById.value);
                }
                if (CreateContactInput.this.addresses.defined) {
                    inputFieldWriter.writeList("addresses", CreateContactInput.this.addresses.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactInput.this.addresses.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((AddressInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateContactInput.this.assignedToId.defined) {
                    inputFieldWriter.writeString("assignedToId", (String) CreateContactInput.this.assignedToId.value);
                }
                if (CreateContactInput.this.blockedForCallById.defined) {
                    inputFieldWriter.writeString("blockedForCallById", (String) CreateContactInput.this.blockedForCallById.value);
                }
                if (CreateContactInput.this.blockedForCallReason.defined) {
                    inputFieldWriter.writeString("blockedForCallReason", (String) CreateContactInput.this.blockedForCallReason.value);
                }
                if (CreateContactInput.this.blockedForCallUntil.defined) {
                    inputFieldWriter.writeString("blockedForCallUntil", (String) CreateContactInput.this.blockedForCallUntil.value);
                }
                if (CreateContactInput.this.callPriority.defined) {
                    inputFieldWriter.writeString("callPriority", (String) CreateContactInput.this.callPriority.value);
                }
                if (CreateContactInput.this.contactNumberDetail.defined) {
                    inputFieldWriter.writeList("contactNumberDetail", CreateContactInput.this.contactNumberDetail.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactInput.1.4
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactInput.this.contactNumberDetail.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ContactNumberDetailInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateContactInput.this.businessDetail.defined) {
                    inputFieldWriter.writeList("businessDetail", CreateContactInput.this.businessDetail.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactInput.1.5
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactInput.this.businessDetail.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BusinessDetailInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateContactInput.this.contactSource.defined) {
                    inputFieldWriter.writeString("contactSource", (String) CreateContactInput.this.contactSource.value);
                }
                if (CreateContactInput.this.contactSourceDrillDownOne.defined) {
                    inputFieldWriter.writeString("contactSourceDrillDownOne", (String) CreateContactInput.this.contactSourceDrillDownOne.value);
                }
                if (CreateContactInput.this.contactSourceDrillDownTwo.defined) {
                    inputFieldWriter.writeString("contactSourceDrillDownTwo", (String) CreateContactInput.this.contactSourceDrillDownTwo.value);
                }
                if (CreateContactInput.this.contactSourceDrillDownThree.defined) {
                    inputFieldWriter.writeString("contactSourceDrillDownThree", (String) CreateContactInput.this.contactSourceDrillDownThree.value);
                }
                if (CreateContactInput.this.contactSourceDrillDownOneId.defined) {
                    inputFieldWriter.writeString("contactSourceDrillDownOneId", (String) CreateContactInput.this.contactSourceDrillDownOneId.value);
                }
                if (CreateContactInput.this.contactSourceDrillDownTwoId.defined) {
                    inputFieldWriter.writeString("contactSourceDrillDownTwoId", (String) CreateContactInput.this.contactSourceDrillDownTwoId.value);
                }
                if (CreateContactInput.this.contactSourceDrillDownThreeId.defined) {
                    inputFieldWriter.writeString("contactSourceDrillDownThreeId", (String) CreateContactInput.this.contactSourceDrillDownThreeId.value);
                }
                if (CreateContactInput.this.contactStatus.defined) {
                    inputFieldWriter.writeString("contactStatus", CreateContactInput.this.contactStatus.value != 0 ? ((ContactStatus) CreateContactInput.this.contactStatus.value).name() : null);
                }
                if (CreateContactInput.this.contactType.defined) {
                    inputFieldWriter.writeString("contactType", (String) CreateContactInput.this.contactType.value);
                }
                if (CreateContactInput.this.department.defined) {
                    inputFieldWriter.writeString("department", (String) CreateContactInput.this.department.value);
                }
                if (CreateContactInput.this.designation.defined) {
                    inputFieldWriter.writeString("designation", (String) CreateContactInput.this.designation.value);
                }
                if (CreateContactInput.this.emails.defined) {
                    inputFieldWriter.writeList("emails", CreateContactInput.this.emails.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactInput.1.6
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactInput.this.emails.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((EmailInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateContactInput.this.externalReference.defined) {
                    inputFieldWriter.writeList("externalReference", CreateContactInput.this.externalReference.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactInput.1.7
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactInput.this.externalReference.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ExternalReferenceInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateContactInput.this.gender.defined) {
                    inputFieldWriter.writeString("gender", (String) CreateContactInput.this.gender.value);
                }
                if (CreateContactInput.this.isDecisionMaker.defined) {
                    inputFieldWriter.writeBoolean("isDecisionMaker", (Boolean) CreateContactInput.this.isDecisionMaker.value);
                }
                if (CreateContactInput.this.isPrivate.defined) {
                    inputFieldWriter.writeBoolean("isPrivate", (Boolean) CreateContactInput.this.isPrivate.value);
                }
                if (CreateContactInput.this.lockPeriod.defined) {
                    inputFieldWriter.writeString("lockPeriod", (String) CreateContactInput.this.lockPeriod.value);
                }
                if (CreateContactInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) CreateContactInput.this.name.value);
                }
                if (CreateContactInput.this.preferredContactDays.defined) {
                    inputFieldWriter.writeList("preferredContactDays", CreateContactInput.this.preferredContactDays.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactInput.1.8
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactInput.this.preferredContactDays.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString(((Day) it.next()).name());
                            }
                        }
                    } : null);
                }
                if (CreateContactInput.this.profilePhotoUrl.defined) {
                    inputFieldWriter.writeString("profilePhotoUrl", (String) CreateContactInput.this.profilePhotoUrl.value);
                }
                if (CreateContactInput.this.referredBy.defined) {
                    inputFieldWriter.writeString("referredBy", (String) CreateContactInput.this.referredBy.value);
                }
                if (CreateContactInput.this.salutation.defined) {
                    inputFieldWriter.writeString("salutation", (String) CreateContactInput.this.salutation.value);
                }
                if (CreateContactInput.this.seniority.defined) {
                    inputFieldWriter.writeString("seniority", CreateContactInput.this.seniority.value != 0 ? ((Seniority) CreateContactInput.this.seniority.value).name() : null);
                }
                if (CreateContactInput.this.hasTask.defined) {
                    inputFieldWriter.writeBoolean("hasTask", (Boolean) CreateContactInput.this.hasTask.value);
                }
                if (CreateContactInput.this.openTaskActivityType.defined) {
                    inputFieldWriter.writeString("openTaskActivityType", CreateContactInput.this.openTaskActivityType.value != 0 ? ((TaskActivityType) CreateContactInput.this.openTaskActivityType.value).name() : null);
                }
                if (CreateContactInput.this.lastCalledTime.defined) {
                    inputFieldWriter.writeString("lastCalledTime", (String) CreateContactInput.this.lastCalledTime.value);
                }
                if (CreateContactInput.this.lastCallDirection.defined) {
                    inputFieldWriter.writeString("lastCallDirection", CreateContactInput.this.lastCallDirection.value != 0 ? ((CallDirection) CreateContactInput.this.lastCallDirection.value).name() : null);
                }
                if (CreateContactInput.this.lastCallOutcome.defined) {
                    inputFieldWriter.writeString("lastCallOutcome", (String) CreateContactInput.this.lastCallOutcome.value);
                }
                if (CreateContactInput.this.lastCallOutcomeNature.defined) {
                    inputFieldWriter.writeString("lastCallOutcomeNature", (String) CreateContactInput.this.lastCallOutcomeNature.value);
                }
                if (CreateContactInput.this.lastCallUserId.defined) {
                    inputFieldWriter.writeString("lastCallUserId", (String) CreateContactInput.this.lastCallUserId.value);
                }
                if (CreateContactInput.this.lastCallDuration.defined) {
                    inputFieldWriter.writeInt("lastCallDuration", (Integer) CreateContactInput.this.lastCallDuration.value);
                }
                if (CreateContactInput.this.lastCallEngagementId.defined) {
                    inputFieldWriter.writeString("lastCallEngagementId", (String) CreateContactInput.this.lastCallEngagementId.value);
                }
                if (CreateContactInput.this.lastVisitTime.defined) {
                    inputFieldWriter.writeString("lastVisitTime", (String) CreateContactInput.this.lastVisitTime.value);
                }
                if (CreateContactInput.this.lastVisitOutcome.defined) {
                    inputFieldWriter.writeString("lastVisitOutcome", (String) CreateContactInput.this.lastVisitOutcome.value);
                }
                if (CreateContactInput.this.lastVisitOutcomeNature.defined) {
                    inputFieldWriter.writeString("lastVisitOutcomeNature", (String) CreateContactInput.this.lastVisitOutcomeNature.value);
                }
                if (CreateContactInput.this.lastVisitUserId.defined) {
                    inputFieldWriter.writeString("lastVisitUserId", (String) CreateContactInput.this.lastVisitUserId.value);
                }
                if (CreateContactInput.this.lastVisitEngagementId.defined) {
                    inputFieldWriter.writeString("lastVisitEngagementId", (String) CreateContactInput.this.lastVisitEngagementId.value);
                }
                if (CreateContactInput.this.lastEmailTime.defined) {
                    inputFieldWriter.writeString("lastEmailTime", (String) CreateContactInput.this.lastEmailTime.value);
                }
                if (CreateContactInput.this.lastEmailUserId.defined) {
                    inputFieldWriter.writeString("lastEmailUserId", (String) CreateContactInput.this.lastEmailUserId.value);
                }
                if (CreateContactInput.this.lastEmailEngagementId.defined) {
                    inputFieldWriter.writeString("lastEmailEngagementId", (String) CreateContactInput.this.lastEmailEngagementId.value);
                }
                if (CreateContactInput.this.lastWhatsappTime.defined) {
                    inputFieldWriter.writeString("lastWhatsappTime", (String) CreateContactInput.this.lastWhatsappTime.value);
                }
                if (CreateContactInput.this.lastWhatsappUserId.defined) {
                    inputFieldWriter.writeString("lastWhatsappUserId", (String) CreateContactInput.this.lastWhatsappUserId.value);
                }
                if (CreateContactInput.this.lastWhatsappEngagementId.defined) {
                    inputFieldWriter.writeString("lastWhatsappEngagementId", (String) CreateContactInput.this.lastWhatsappEngagementId.value);
                }
                if (CreateContactInput.this.lastSmsTime.defined) {
                    inputFieldWriter.writeString("lastSmsTime", (String) CreateContactInput.this.lastSmsTime.value);
                }
                if (CreateContactInput.this.lastSmsUserId.defined) {
                    inputFieldWriter.writeString("lastSmsUserId", (String) CreateContactInput.this.lastSmsUserId.value);
                }
                if (CreateContactInput.this.lastSmsEngagementId.defined) {
                    inputFieldWriter.writeString("lastSmsEngagementId", (String) CreateContactInput.this.lastSmsEngagementId.value);
                }
                if (CreateContactInput.this.lastNoteAddedTime.defined) {
                    inputFieldWriter.writeString("lastNoteAddedTime", (String) CreateContactInput.this.lastNoteAddedTime.value);
                }
                if (CreateContactInput.this.lastNoteUserId.defined) {
                    inputFieldWriter.writeString("lastNoteUserId", (String) CreateContactInput.this.lastNoteUserId.value);
                }
                if (CreateContactInput.this.lastNoteEngagementId.defined) {
                    inputFieldWriter.writeString("lastNoteEngagementId", (String) CreateContactInput.this.lastNoteEngagementId.value);
                }
                if (CreateContactInput.this.lastTaskDoneTime.defined) {
                    inputFieldWriter.writeString("lastTaskDoneTime", (String) CreateContactInput.this.lastTaskDoneTime.value);
                }
                if (CreateContactInput.this.lastTaskDoneUserId.defined) {
                    inputFieldWriter.writeString("lastTaskDoneUserId", (String) CreateContactInput.this.lastTaskDoneUserId.value);
                }
                if (CreateContactInput.this.lastTaskDoneEngagementId.defined) {
                    inputFieldWriter.writeString("lastTaskDoneEngagementId", (String) CreateContactInput.this.lastTaskDoneEngagementId.value);
                }
                if (CreateContactInput.this.openTaskCount.defined) {
                    inputFieldWriter.writeInt("openTaskCount", (Integer) CreateContactInput.this.openTaskCount.value);
                }
                if (CreateContactInput.this.lastKnownDisposition.defined) {
                    inputFieldWriter.writeString("lastKnownDisposition", (String) CreateContactInput.this.lastKnownDisposition.value);
                }
                if (CreateContactInput.this.lastKnownDispositionTime.defined) {
                    inputFieldWriter.writeString("lastKnownDispositionTime", (String) CreateContactInput.this.lastKnownDispositionTime.value);
                }
                if (CreateContactInput.this.lastLeadAssignmentDateTime.defined) {
                    inputFieldWriter.writeString("lastLeadAssignmentDateTime", (String) CreateContactInput.this.lastLeadAssignmentDateTime.value);
                }
                if (CreateContactInput.this.lastEngagementFromAccount.defined) {
                    inputFieldWriter.writeString("lastEngagementFromAccount", (String) CreateContactInput.this.lastEngagementFromAccount.value);
                }
                if (CreateContactInput.this.lastEngagementFromContact.defined) {
                    inputFieldWriter.writeString("lastEngagementFromContact", (String) CreateContactInput.this.lastEngagementFromContact.value);
                }
                if (CreateContactInput.this.userDefinedTags.defined) {
                    inputFieldWriter.writeList("userDefinedTags", CreateContactInput.this.userDefinedTags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactInput.1.9
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactInput.this.userDefinedTags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateContactInput.this.productService.defined) {
                    inputFieldWriter.writeList("productService", CreateContactInput.this.productService.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactInput.1.10
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactInput.this.productService.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateContactInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateContactInput.this.createdAt.value);
                }
                if (CreateContactInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateContactInput.this.updatedAt.value);
                }
                if (CreateContactInput.this.contactAssignedToId.defined) {
                    inputFieldWriter.writeString("contactAssignedToId", (String) CreateContactInput.this.contactAssignedToId.value);
                }
                if (CreateContactInput.this.contactBlockedForCallById.defined) {
                    inputFieldWriter.writeString("contactBlockedForCallById", (String) CreateContactInput.this.contactBlockedForCallById.value);
                }
                if (CreateContactInput.this.bulkUploadReference.defined) {
                    inputFieldWriter.writeString("bulkUploadReference", (String) CreateContactInput.this.bulkUploadReference.value);
                }
                if (CreateContactInput.this.assignmentMethod.defined) {
                    inputFieldWriter.writeString("assignmentMethod", (String) CreateContactInput.this.assignmentMethod.value);
                }
                if (CreateContactInput.this.customDataAddedFromAddContactForm.defined) {
                    inputFieldWriter.writeString("customDataAddedFromAddContactForm", (String) CreateContactInput.this.customDataAddedFromAddContactForm.value);
                }
                if (CreateContactInput.this.customAttributes.defined) {
                    inputFieldWriter.writeString("customAttributes", (String) CreateContactInput.this.customAttributes.value);
                }
                if (CreateContactInput.this.leadLifecycleStage.defined) {
                    inputFieldWriter.writeString("leadLifecycleStage", CreateContactInput.this.leadLifecycleStage.value != 0 ? ((LeadLifecycleStage) CreateContactInput.this.leadLifecycleStage.value).name() : null);
                }
                if (CreateContactInput.this.leadLifecycleStageSubCategory.defined) {
                    inputFieldWriter.writeString("leadLifecycleStageSubCategory", CreateContactInput.this.leadLifecycleStageSubCategory.value != 0 ? ((LeadLifecycleStageSubCategory) CreateContactInput.this.leadLifecycleStageSubCategory.value).name() : null);
                }
                if (CreateContactInput.this.manualClosedReason.defined) {
                    inputFieldWriter.writeString("manualClosedReason", (String) CreateContactInput.this.manualClosedReason.value);
                }
                if (CreateContactInput.this.lastDealStageType.defined) {
                    inputFieldWriter.writeString("lastDealStageType", (String) CreateContactInput.this.lastDealStageType.value);
                }
                if (CreateContactInput.this.prospectingAttempts.defined) {
                    inputFieldWriter.writeInt("prospectingAttempts", (Integer) CreateContactInput.this.prospectingAttempts.value);
                }
                if (CreateContactInput.this.lastProspectingDoneOn.defined) {
                    inputFieldWriter.writeString("lastProspectingDoneOn", (String) CreateContactInput.this.lastProspectingDoneOn.value);
                }
                if (CreateContactInput.this.firstProspectingDoneOn.defined) {
                    inputFieldWriter.writeString("firstProspectingDoneOn", (String) CreateContactInput.this.firstProspectingDoneOn.value);
                }
                if (CreateContactInput.this.nextProspectingDueOn.defined) {
                    inputFieldWriter.writeString("nextProspectingDueOn", (String) CreateContactInput.this.nextProspectingDueOn.value);
                }
                if (CreateContactInput.this.nextProspectingSetBy.defined) {
                    inputFieldWriter.writeString("nextProspectingSetBy", (String) CreateContactInput.this.nextProspectingSetBy.value);
                }
                if (CreateContactInput.this.nextProspectingNote.defined) {
                    inputFieldWriter.writeString("nextProspectingNote", (String) CreateContactInput.this.nextProspectingNote.value);
                }
                if (CreateContactInput.this.lastPaymentStatus.defined) {
                    inputFieldWriter.writeString("lastPaymentStatus", (String) CreateContactInput.this.lastPaymentStatus.value);
                }
                if (CreateContactInput.this.movedToOpportunityOn.defined) {
                    inputFieldWriter.writeString("movedToOpportunityOn", (String) CreateContactInput.this.movedToOpportunityOn.value);
                }
                if (CreateContactInput.this.movedToClosedOn.defined) {
                    inputFieldWriter.writeString("movedToClosedOn", (String) CreateContactInput.this.movedToClosedOn.value);
                }
                if (CreateContactInput.this.latestRemark.defined) {
                    inputFieldWriter.writeString("latestRemark", (String) CreateContactInput.this.latestRemark.value);
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

    public String nextProspectingDueOn() {
        return this.nextProspectingDueOn.value;
    }

    public String nextProspectingNote() {
        return this.nextProspectingNote.value;
    }

    public String nextProspectingSetBy() {
        return this.nextProspectingSetBy.value;
    }

    public TaskActivityType openTaskActivityType() {
        return this.openTaskActivityType.value;
    }

    public Integer openTaskCount() {
        return this.openTaskCount.value;
    }

    public String ownerId() {
        return this.ownerId.value;
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

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public List<String> userDefinedTags() {
        return this.userDefinedTags.value;
    }
}
