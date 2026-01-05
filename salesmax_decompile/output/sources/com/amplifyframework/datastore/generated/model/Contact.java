package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "updatedAt"}, name = "byAccount"), @Index(fields = {"ownerId", "accountId", "updatedAt"}, name = "byOwner"), @Index(fields = {"primaryTeamId", "updatedAt"}, name = "byTeam")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.OWNER, identityClaim = "userId", operations = {ModelOperation.UPDATE}, ownerField = "ownerId", provider = "userPools")}, pluralName = "Contacts")
/* loaded from: classes5.dex */
public final class Contact implements Model {

    @BelongsTo(targetName = "accountId", type = Account.class)
    @ModelField(targetType = "Account")
    private final Account account;

    @ModelField(targetType = "String")
    private final String accountPriority;

    @ModelField(targetType = "String")
    private final String activeDealStage;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime activeDealStageUpdatedAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User addedBy;

    @ModelField(targetType = "ID")
    private final String addedById;

    @ModelField(targetType = "Address")
    private final List<Address> addresses;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User assignedTo;

    @ModelField(targetType = "ID")
    private final String assignedToId;

    @ModelField(targetType = "String")
    private final String assignmentMethod;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime becameCustomerOn;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User blockedForCallBy;

    @ModelField(targetType = "ID")
    private final String blockedForCallById;

    @ModelField(targetType = "String")
    private final String blockedForCallReason;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime blockedForCallUntil;

    @ModelField(targetType = "String")
    private final String bulkUploadReference;

    @ModelField(targetType = "BusinessDetail")
    private final List<BusinessDetail> businessDetail;

    @ModelField(targetType = "ContactBusinessMembership")
    @HasMany(associatedWith = "contact", type = ContactBusinessMembership.class)
    private final List<ContactBusinessMembership> businesses;

    @ModelField(targetType = "String")
    private final String callPriority;

    @ModelField(targetType = "ChatChannel")
    @HasMany(associatedWith = "contact", type = ChatChannel.class)
    private final List<ChatChannel> chatChannels;

    @ModelField(targetType = "ContactNumberDetail")
    private final List<ContactNumberDetail> contactNumberDetail;

    @ModelField(targetType = "ContactNumber")
    @HasMany(associatedWith = "contact", type = ContactNumber.class)
    private final List<ContactNumber> contactNumbers;

    @ModelField(targetType = "String")
    private final String contactSource;

    @ModelField(targetType = "String")
    private final String contactSourceDrillDownOne;

    @ModelField(targetType = "ID")
    private final String contactSourceDrillDownOneId;

    @ModelField(targetType = "String")
    private final String contactSourceDrillDownThree;

    @ModelField(targetType = "ID")
    private final String contactSourceDrillDownThreeId;

    @ModelField(targetType = "String")
    private final String contactSourceDrillDownTwo;

    @ModelField(targetType = "ID")
    private final String contactSourceDrillDownTwoId;

    @ModelField(targetType = "ContactStatus")
    private final ContactStatus contactStatus;

    @ModelField(targetType = "String")
    private final String contactType;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "AWSJSON")
    private final String customAttributes;

    @ModelField(targetType = "AWSJSON")
    private final String customDataAddedFromAddContactForm;

    @ModelField(targetType = "String")
    private final String dealDescription;

    @ModelField(targetType = "DealAssociation")
    @HasMany(associatedWith = "contact", type = DealAssociation.class)
    private final List<DealAssociation> deals;

    @ModelField(targetType = "String")
    private final String department;

    @ModelField(targetType = "String")
    private final String designation;

    @ModelField(targetType = "Email")
    private final List<Email> emails;

    @ModelField(targetType = "ExternalReference")
    private final List<ExternalReference> externalReference;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime firstProspectingDoneOn;

    @ModelField(targetType = "String")
    private final String freshLeadTag;

    @ModelField(targetType = "String")
    private final String gender;

    @ModelField(targetType = "Boolean")
    private final Boolean hasTask;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String isCustomer;

    @ModelField(targetType = "Boolean")
    private final Boolean isDecisionMaker;

    @ModelField(targetType = "Boolean")
    private final Boolean isPrivate;

    @ModelField(targetType = "CallDirection")
    private final CallDirection lastCallDirection;

    @ModelField(targetType = "Int")
    private final Integer lastCallDuration;

    @ModelField(targetType = "String")
    private final String lastCallEngagementId;

    @ModelField(targetType = "String")
    private final String lastCallOutcome;

    @ModelField(targetType = "String")
    private final String lastCallOutcomeNature;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User lastCallUser;

    @ModelField(targetType = "ID")
    private final String lastCallUserId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastCalledTime;

    @ModelField(targetType = "AWSJSON")
    private final String lastClosedTaskDetail;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastClosedTaskDetailUpdatedAt;

    @ModelField(targetType = "String")
    private final String lastDealStageType;

    @ModelField(targetType = "String")
    private final String lastEmailEngagementId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastEmailTime;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User lastEmailUser;

    @ModelField(targetType = "ID")
    private final String lastEmailUserId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastEngagementFromAccount;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastEngagementFromContact;

    @ModelField(targetType = "String")
    private final String lastKnownDisposition;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastKnownDispositionTime;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastLeadAssignmentDateTime;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastNoteAddedTime;

    @ModelField(targetType = "String")
    private final String lastNoteEngagementId;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User lastNoteUser;

    @ModelField(targetType = "ID")
    private final String lastNoteUserId;

    @ModelField(targetType = "String")
    private final String lastPaymentStatus;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastProspectingDoneOn;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastRepeatEnquiryDate;

    @ModelField(targetType = "String")
    private final String lastRepeatEnquirySource;

    @ModelField(targetType = "String")
    private final String lastSmsEngagementId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastSmsTime;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User lastSmsUser;

    @ModelField(targetType = "ID")
    private final String lastSmsUserId;

    @ModelField(targetType = "String")
    private final String lastTaskDoneEngagementId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastTaskDoneTime;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User lastTaskDoneUser;

    @ModelField(targetType = "ID")
    private final String lastTaskDoneUserId;

    @ModelField(targetType = "String")
    private final String lastVisitEngagementId;

    @ModelField(targetType = "String")
    private final String lastVisitOutcome;

    @ModelField(targetType = "String")
    private final String lastVisitOutcomeNature;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastVisitTime;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User lastVisitUser;

    @ModelField(targetType = "ID")
    private final String lastVisitUserId;

    @ModelField(targetType = "String")
    private final String lastWabaBroadcastReplyBody;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastWabaBroadcastReplyTime;

    @ModelField(targetType = "String")
    private final String lastWabaBroadcastReplyType;

    @ModelField(targetType = "String")
    private final String lastWabaBroadcastStatus;

    @ModelField(targetType = "String")
    private final String lastWabaBroadcastTemplate;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastWabaBroadcastTime;

    @ModelField(targetType = "String")
    private final String lastWhatsappEngagementId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastWhatsappTime;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User lastWhatsappUser;

    @ModelField(targetType = "ID")
    private final String lastWhatsappUserId;

    @ModelField(targetType = "AWSJSON")
    private final String latestRemark;

    @ModelField(targetType = "Int")
    private final Integer leadCallsNotAnswered;

    @ModelField(targetType = "LeadLifecycleStage")
    private final LeadLifecycleStage leadLifecycleStage;

    @ModelField(targetType = "LeadLifecycleStageSubCategory")
    private final LeadLifecycleStageSubCategory leadLifecycleStageSubCategory;

    @ModelField(targetType = "fileObjectRelationship")
    @HasMany(associatedWith = "contact", type = fileObjectRelationship.class)
    private final List<fileObjectRelationship> linkedFiles;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lockPeriod;

    @ModelField(targetType = "String")
    private final String manualClosedReason;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime movedToClosedOn;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime movedToOpportunityOn;

    @ModelField(targetType = "String")
    private final String name;

    @ModelField(targetType = "String")
    private final String needFollowUpTag;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime needFollowUpTagUpdatedAt;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime nextProspectingDueOn;

    @ModelField(targetType = "String")
    private final String nextProspectingNote;

    @ModelField(targetType = "String")
    private final String nextProspectingSetBy;

    @ModelField(targetType = "String")
    private final String noWorkAfterAssignment;

    @ModelField(targetType = "Int")
    private final Integer numberOfTimesRechurned;

    @ModelField(targetType = "TaskActivityType")
    private final TaskActivityType openTaskActivityType;

    @ModelField(targetType = "Int")
    private final Integer openTaskCount;

    @ModelField(targetType = "AWSJSON")
    private final String openTaskDetail;

    @ModelField(targetType = "AWSJSON")
    private final String openVideoCallDetail;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User owner;

    @ModelField(targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "AWSJSON")
    private final String paymentRequestDetail;

    @ModelField(targetType = "Day")
    private final List<Day> preferredContactDays;

    @ModelField(targetType = "Team")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = Team.class)
    private final Team primaryTeam;

    @ModelField(targetType = "ID")
    private final String primaryTeamId;

    @ModelField(targetType = "String")
    private final List<String> productService;

    @ModelField(targetType = "String")
    private final String profilePhotoUrl;

    @ModelField(targetType = "Int")
    private final Integer prospectingAttempts;

    @ModelField(targetType = "AWSJSON")
    private final List<String> recentEngagements;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime recentEngagementsUpdatedAt;

    @ModelField(targetType = "String")
    private final String referredBy;

    @ModelField(targetType = "String")
    private final String salutation;

    @ModelField(targetType = "Seniority")
    private final Seniority seniority;

    @ModelField(targetType = "ID")
    private final List<String> sharedOwners;

    @ModelField(targetType = "ID")
    private final List<String> sharedTeams;

    @ModelField(targetType = "ContactAssignmentStatus")
    private final ContactAssignmentStatus toBeAssigned;

    @ModelField(targetType = "Int")
    private final Integer totalProspectingAttemptsAcrossRechurn;

    @ModelField(targetType = "Int")
    private final Integer unsuccessfulCallAttempts;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User updatedBy;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(targetType = "String")
    private final List<String> userDefinedTags;

    @ModelField(targetType = "ID")
    private final String waChatChannelId;

    @ModelField(targetType = "String")
    private final String whatsappOptInStatus;
    public static final QueryField ID = QueryField.field("Contact", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT = QueryField.field("Contact", "accountId");
    public static final QueryField OWNER_ID = QueryField.field("Contact", "ownerId");
    public static final QueryField TO_BE_ASSIGNED = QueryField.field("Contact", "toBeAssigned");
    public static final QueryField SHARED_OWNERS = QueryField.field("Contact", "sharedOwners");
    public static final QueryField PRIMARY_TEAM_ID = QueryField.field("Contact", "primaryTeamId");
    public static final QueryField SHARED_TEAMS = QueryField.field("Contact", "sharedTeams");
    public static final QueryField ACCOUNT_PRIORITY = QueryField.field("Contact", "accountPriority");
    public static final QueryField ADDED_BY_ID = QueryField.field("Contact", "addedById");
    public static final QueryField ADDRESSES = QueryField.field("Contact", "addresses");
    public static final QueryField ASSIGNED_TO_ID = QueryField.field("Contact", "assignedToId");
    public static final QueryField BLOCKED_FOR_CALL_BY_ID = QueryField.field("Contact", "blockedForCallById");
    public static final QueryField BLOCKED_FOR_CALL_REASON = QueryField.field("Contact", "blockedForCallReason");
    public static final QueryField BLOCKED_FOR_CALL_UNTIL = QueryField.field("Contact", "blockedForCallUntil");
    public static final QueryField CALL_PRIORITY = QueryField.field("Contact", "callPriority");
    public static final QueryField WA_CHAT_CHANNEL_ID = QueryField.field("Contact", "waChatChannelId");
    public static final QueryField CONTACT_NUMBER_DETAIL = QueryField.field("Contact", "contactNumberDetail");
    public static final QueryField BUSINESS_DETAIL = QueryField.field("Contact", "businessDetail");
    public static final QueryField CONTACT_SOURCE = QueryField.field("Contact", "contactSource");
    public static final QueryField CONTACT_SOURCE_DRILL_DOWN_ONE = QueryField.field("Contact", "contactSourceDrillDownOne");
    public static final QueryField CONTACT_SOURCE_DRILL_DOWN_TWO = QueryField.field("Contact", "contactSourceDrillDownTwo");
    public static final QueryField CONTACT_SOURCE_DRILL_DOWN_THREE = QueryField.field("Contact", "contactSourceDrillDownThree");
    public static final QueryField CONTACT_SOURCE_DRILL_DOWN_ONE_ID = QueryField.field("Contact", "contactSourceDrillDownOneId");
    public static final QueryField CONTACT_SOURCE_DRILL_DOWN_TWO_ID = QueryField.field("Contact", "contactSourceDrillDownTwoId");
    public static final QueryField CONTACT_SOURCE_DRILL_DOWN_THREE_ID = QueryField.field("Contact", "contactSourceDrillDownThreeId");
    public static final QueryField CONTACT_STATUS = QueryField.field("Contact", "contactStatus");
    public static final QueryField CONTACT_TYPE = QueryField.field("Contact", "contactType");
    public static final QueryField DEPARTMENT = QueryField.field("Contact", "department");
    public static final QueryField DESIGNATION = QueryField.field("Contact", "designation");
    public static final QueryField EMAILS = QueryField.field("Contact", "emails");
    public static final QueryField LAST_REPEAT_ENQUIRY_DATE = QueryField.field("Contact", "lastRepeatEnquiryDate");
    public static final QueryField LAST_REPEAT_ENQUIRY_SOURCE = QueryField.field("Contact", "lastRepeatEnquirySource");
    public static final QueryField EXTERNAL_REFERENCE = QueryField.field("Contact", "externalReference");
    public static final QueryField GENDER = QueryField.field("Contact", "gender");
    public static final QueryField IS_DECISION_MAKER = QueryField.field("Contact", "isDecisionMaker");
    public static final QueryField IS_PRIVATE = QueryField.field("Contact", "isPrivate");
    public static final QueryField LOCK_PERIOD = QueryField.field("Contact", "lockPeriod");
    public static final QueryField NAME = QueryField.field("Contact", "name");
    public static final QueryField PREFERRED_CONTACT_DAYS = QueryField.field("Contact", "preferredContactDays");
    public static final QueryField PROFILE_PHOTO_URL = QueryField.field("Contact", "profilePhotoUrl");
    public static final QueryField REFERRED_BY = QueryField.field("Contact", "referredBy");
    public static final QueryField SALUTATION = QueryField.field("Contact", "salutation");
    public static final QueryField SENIORITY = QueryField.field("Contact", "seniority");
    public static final QueryField UPDATED_BY_ID = QueryField.field("Contact", "updatedById");
    public static final QueryField HAS_TASK = QueryField.field("Contact", "hasTask");
    public static final QueryField OPEN_TASK_ACTIVITY_TYPE = QueryField.field("Contact", "openTaskActivityType");
    public static final QueryField LAST_CALLED_TIME = QueryField.field("Contact", "lastCalledTime");
    public static final QueryField LAST_CALL_DIRECTION = QueryField.field("Contact", "lastCallDirection");
    public static final QueryField LAST_CALL_OUTCOME = QueryField.field("Contact", "lastCallOutcome");
    public static final QueryField LAST_CALL_OUTCOME_NATURE = QueryField.field("Contact", "lastCallOutcomeNature");
    public static final QueryField LAST_CALL_USER_ID = QueryField.field("Contact", "lastCallUserId");
    public static final QueryField LAST_CALL_DURATION = QueryField.field("Contact", "lastCallDuration");
    public static final QueryField LAST_CALL_ENGAGEMENT_ID = QueryField.field("Contact", "lastCallEngagementId");
    public static final QueryField LAST_VISIT_TIME = QueryField.field("Contact", "lastVisitTime");
    public static final QueryField LAST_VISIT_OUTCOME = QueryField.field("Contact", "lastVisitOutcome");
    public static final QueryField LAST_VISIT_OUTCOME_NATURE = QueryField.field("Contact", "lastVisitOutcomeNature");
    public static final QueryField LAST_VISIT_USER_ID = QueryField.field("Contact", "lastVisitUserId");
    public static final QueryField LAST_VISIT_ENGAGEMENT_ID = QueryField.field("Contact", "lastVisitEngagementId");
    public static final QueryField LAST_EMAIL_TIME = QueryField.field("Contact", "lastEmailTime");
    public static final QueryField LAST_EMAIL_USER_ID = QueryField.field("Contact", "lastEmailUserId");
    public static final QueryField LAST_EMAIL_ENGAGEMENT_ID = QueryField.field("Contact", "lastEmailEngagementId");
    public static final QueryField LAST_WHATSAPP_TIME = QueryField.field("Contact", "lastWhatsappTime");
    public static final QueryField LAST_WHATSAPP_USER_ID = QueryField.field("Contact", "lastWhatsappUserId");
    public static final QueryField LAST_WHATSAPP_ENGAGEMENT_ID = QueryField.field("Contact", "lastWhatsappEngagementId");
    public static final QueryField LAST_WABA_BROADCAST_TIME = QueryField.field("Contact", "lastWabaBroadcastTime");
    public static final QueryField LAST_WABA_BROADCAST_STATUS = QueryField.field("Contact", "lastWabaBroadcastStatus");
    public static final QueryField LAST_WABA_BROADCAST_TEMPLATE = QueryField.field("Contact", "lastWabaBroadcastTemplate");
    public static final QueryField LAST_WABA_BROADCAST_REPLY_BODY = QueryField.field("Contact", "lastWabaBroadcastReplyBody");
    public static final QueryField LAST_WABA_BROADCAST_REPLY_TIME = QueryField.field("Contact", "lastWabaBroadcastReplyTime");
    public static final QueryField LAST_WABA_BROADCAST_REPLY_TYPE = QueryField.field("Contact", "lastWabaBroadcastReplyType");
    public static final QueryField LAST_SMS_TIME = QueryField.field("Contact", "lastSmsTime");
    public static final QueryField LAST_SMS_USER_ID = QueryField.field("Contact", "lastSmsUserId");
    public static final QueryField LAST_SMS_ENGAGEMENT_ID = QueryField.field("Contact", "lastSmsEngagementId");
    public static final QueryField LAST_NOTE_ADDED_TIME = QueryField.field("Contact", "lastNoteAddedTime");
    public static final QueryField LAST_NOTE_USER_ID = QueryField.field("Contact", "lastNoteUserId");
    public static final QueryField LAST_NOTE_ENGAGEMENT_ID = QueryField.field("Contact", "lastNoteEngagementId");
    public static final QueryField LAST_TASK_DONE_TIME = QueryField.field("Contact", "lastTaskDoneTime");
    public static final QueryField LAST_TASK_DONE_USER_ID = QueryField.field("Contact", "lastTaskDoneUserId");
    public static final QueryField LAST_TASK_DONE_ENGAGEMENT_ID = QueryField.field("Contact", "lastTaskDoneEngagementId");
    public static final QueryField OPEN_TASK_COUNT = QueryField.field("Contact", "openTaskCount");
    public static final QueryField LAST_KNOWN_DISPOSITION = QueryField.field("Contact", "lastKnownDisposition");
    public static final QueryField LAST_KNOWN_DISPOSITION_TIME = QueryField.field("Contact", "lastKnownDispositionTime");
    public static final QueryField LAST_LEAD_ASSIGNMENT_DATE_TIME = QueryField.field("Contact", "lastLeadAssignmentDateTime");
    public static final QueryField LAST_ENGAGEMENT_FROM_ACCOUNT = QueryField.field("Contact", "lastEngagementFromAccount");
    public static final QueryField LAST_ENGAGEMENT_FROM_CONTACT = QueryField.field("Contact", "lastEngagementFromContact");
    public static final QueryField FRESH_LEAD_TAG = QueryField.field("Contact", "freshLeadTag");
    public static final QueryField NO_WORK_AFTER_ASSIGNMENT = QueryField.field("Contact", "noWorkAfterAssignment");
    public static final QueryField NEED_FOLLOW_UP_TAG = QueryField.field("Contact", "needFollowUpTag");
    public static final QueryField NEED_FOLLOW_UP_TAG_UPDATED_AT = QueryField.field("Contact", "needFollowUpTagUpdatedAt");
    public static final QueryField ACTIVE_DEAL_STAGE = QueryField.field("Contact", "activeDealStage");
    public static final QueryField ACTIVE_DEAL_STAGE_UPDATED_AT = QueryField.field("Contact", "activeDealStageUpdatedAt");
    public static final QueryField DEAL_DESCRIPTION = QueryField.field("Contact", "dealDescription");
    public static final QueryField IS_CUSTOMER = QueryField.field("Contact", "isCustomer");
    public static final QueryField BECAME_CUSTOMER_ON = QueryField.field("Contact", "becameCustomerOn");
    public static final QueryField UNSUCCESSFUL_CALL_ATTEMPTS = QueryField.field("Contact", "unsuccessfulCallAttempts");
    public static final QueryField LEAD_CALLS_NOT_ANSWERED = QueryField.field("Contact", "leadCallsNotAnswered");
    public static final QueryField USER_DEFINED_TAGS = QueryField.field("Contact", "userDefinedTags");
    public static final QueryField PRODUCT_SERVICE = QueryField.field("Contact", "productService");
    public static final QueryField BULK_UPLOAD_REFERENCE = QueryField.field("Contact", "bulkUploadReference");
    public static final QueryField ASSIGNMENT_METHOD = QueryField.field("Contact", "assignmentMethod");
    public static final QueryField WHATSAPP_OPT_IN_STATUS = QueryField.field("Contact", "whatsappOptInStatus");
    public static final QueryField RECENT_ENGAGEMENTS = QueryField.field("Contact", "recentEngagements");
    public static final QueryField RECENT_ENGAGEMENTS_UPDATED_AT = QueryField.field("Contact", "recentEngagementsUpdatedAt");
    public static final QueryField OPEN_TASK_DETAIL = QueryField.field("Contact", "openTaskDetail");
    public static final QueryField OPEN_VIDEO_CALL_DETAIL = QueryField.field("Contact", "openVideoCallDetail");
    public static final QueryField LAST_CLOSED_TASK_DETAIL = QueryField.field("Contact", "lastClosedTaskDetail");
    public static final QueryField LAST_CLOSED_TASK_DETAIL_UPDATED_AT = QueryField.field("Contact", "lastClosedTaskDetailUpdatedAt");
    public static final QueryField LATEST_REMARK = QueryField.field("Contact", "latestRemark");
    public static final QueryField CUSTOM_ATTRIBUTES = QueryField.field("Contact", "customAttributes");
    public static final QueryField PAYMENT_REQUEST_DETAIL = QueryField.field("Contact", "paymentRequestDetail");
    public static final QueryField LAST_PAYMENT_STATUS = QueryField.field("Contact", "lastPaymentStatus");
    public static final QueryField CUSTOM_DATA_ADDED_FROM_ADD_CONTACT_FORM = QueryField.field("Contact", "customDataAddedFromAddContactForm");
    public static final QueryField LEAD_LIFECYCLE_STAGE = QueryField.field("Contact", "leadLifecycleStage");
    public static final QueryField LEAD_LIFECYCLE_STAGE_SUB_CATEGORY = QueryField.field("Contact", "leadLifecycleStageSubCategory");
    public static final QueryField MANUAL_CLOSED_REASON = QueryField.field("Contact", "manualClosedReason");
    public static final QueryField LAST_DEAL_STAGE_TYPE = QueryField.field("Contact", "lastDealStageType");
    public static final QueryField PROSPECTING_ATTEMPTS = QueryField.field("Contact", "prospectingAttempts");
    public static final QueryField TOTAL_PROSPECTING_ATTEMPTS_ACROSS_RECHURN = QueryField.field("Contact", "totalProspectingAttemptsAcrossRechurn");
    public static final QueryField NUMBER_OF_TIMES_RECHURNED = QueryField.field("Contact", "numberOfTimesRechurned");
    public static final QueryField LAST_PROSPECTING_DONE_ON = QueryField.field("Contact", "lastProspectingDoneOn");
    public static final QueryField FIRST_PROSPECTING_DONE_ON = QueryField.field("Contact", "firstProspectingDoneOn");
    public static final QueryField NEXT_PROSPECTING_DUE_ON = QueryField.field("Contact", "nextProspectingDueOn");
    public static final QueryField NEXT_PROSPECTING_SET_BY = QueryField.field("Contact", "nextProspectingSetBy");
    public static final QueryField NEXT_PROSPECTING_NOTE = QueryField.field("Contact", "nextProspectingNote");
    public static final QueryField MOVED_TO_OPPORTUNITY_ON = QueryField.field("Contact", "movedToOpportunityOn");
    public static final QueryField MOVED_TO_CLOSED_ON = QueryField.field("Contact", "movedToClosedOn");
    public static final QueryField CREATED_AT = QueryField.field("Contact", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("Contact", "updatedAt");

    public interface BuildStep {
        BuildStep account(Account account);

        BuildStep accountPriority(String str);

        BuildStep activeDealStage(String str);

        BuildStep activeDealStageUpdatedAt(Temporal.DateTime dateTime);

        BuildStep addedById(String str);

        BuildStep addresses(List<Address> list);

        BuildStep assignedToId(String str);

        BuildStep assignmentMethod(String str);

        BuildStep becameCustomerOn(Temporal.DateTime dateTime);

        BuildStep blockedForCallById(String str);

        BuildStep blockedForCallReason(String str);

        BuildStep blockedForCallUntil(Temporal.DateTime dateTime);

        Contact build();

        BuildStep bulkUploadReference(String str);

        BuildStep businessDetail(List<BusinessDetail> list);

        BuildStep callPriority(String str);

        BuildStep contactNumberDetail(List<ContactNumberDetail> list);

        BuildStep contactSource(String str);

        BuildStep contactSourceDrillDownOne(String str);

        BuildStep contactSourceDrillDownOneId(String str);

        BuildStep contactSourceDrillDownThree(String str);

        BuildStep contactSourceDrillDownThreeId(String str);

        BuildStep contactSourceDrillDownTwo(String str);

        BuildStep contactSourceDrillDownTwoId(String str);

        BuildStep contactStatus(ContactStatus contactStatus);

        BuildStep contactType(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep customAttributes(String str);

        BuildStep customDataAddedFromAddContactForm(String str);

        BuildStep dealDescription(String str);

        BuildStep department(String str);

        BuildStep designation(String str);

        BuildStep emails(List<Email> list);

        BuildStep externalReference(List<ExternalReference> list);

        BuildStep firstProspectingDoneOn(Temporal.DateTime dateTime);

        BuildStep freshLeadTag(String str);

        BuildStep gender(String str);

        BuildStep hasTask(Boolean bool);

        BuildStep id(String str);

        BuildStep isCustomer(String str);

        BuildStep isDecisionMaker(Boolean bool);

        BuildStep isPrivate(Boolean bool);

        BuildStep lastCallDirection(CallDirection callDirection);

        BuildStep lastCallDuration(Integer num);

        BuildStep lastCallEngagementId(String str);

        BuildStep lastCallOutcome(String str);

        BuildStep lastCallOutcomeNature(String str);

        BuildStep lastCallUserId(String str);

        BuildStep lastCalledTime(Temporal.DateTime dateTime);

        BuildStep lastClosedTaskDetail(String str);

        BuildStep lastClosedTaskDetailUpdatedAt(Temporal.DateTime dateTime);

        BuildStep lastDealStageType(String str);

        BuildStep lastEmailEngagementId(String str);

        BuildStep lastEmailTime(Temporal.DateTime dateTime);

        BuildStep lastEmailUserId(String str);

        BuildStep lastEngagementFromAccount(Temporal.DateTime dateTime);

        BuildStep lastEngagementFromContact(Temporal.DateTime dateTime);

        BuildStep lastKnownDisposition(String str);

        BuildStep lastKnownDispositionTime(Temporal.DateTime dateTime);

        BuildStep lastLeadAssignmentDateTime(Temporal.DateTime dateTime);

        BuildStep lastNoteAddedTime(Temporal.DateTime dateTime);

        BuildStep lastNoteEngagementId(String str);

        BuildStep lastNoteUserId(String str);

        BuildStep lastPaymentStatus(String str);

        BuildStep lastProspectingDoneOn(Temporal.DateTime dateTime);

        BuildStep lastRepeatEnquiryDate(Temporal.DateTime dateTime);

        BuildStep lastRepeatEnquirySource(String str);

        BuildStep lastSmsEngagementId(String str);

        BuildStep lastSmsTime(Temporal.DateTime dateTime);

        BuildStep lastSmsUserId(String str);

        BuildStep lastTaskDoneEngagementId(String str);

        BuildStep lastTaskDoneTime(Temporal.DateTime dateTime);

        BuildStep lastTaskDoneUserId(String str);

        BuildStep lastVisitEngagementId(String str);

        BuildStep lastVisitOutcome(String str);

        BuildStep lastVisitOutcomeNature(String str);

        BuildStep lastVisitTime(Temporal.DateTime dateTime);

        BuildStep lastVisitUserId(String str);

        BuildStep lastWabaBroadcastReplyBody(String str);

        BuildStep lastWabaBroadcastReplyTime(Temporal.DateTime dateTime);

        BuildStep lastWabaBroadcastReplyType(String str);

        BuildStep lastWabaBroadcastStatus(String str);

        BuildStep lastWabaBroadcastTemplate(String str);

        BuildStep lastWabaBroadcastTime(Temporal.DateTime dateTime);

        BuildStep lastWhatsappEngagementId(String str);

        BuildStep lastWhatsappTime(Temporal.DateTime dateTime);

        BuildStep lastWhatsappUserId(String str);

        BuildStep latestRemark(String str);

        BuildStep leadCallsNotAnswered(Integer num);

        BuildStep leadLifecycleStage(LeadLifecycleStage leadLifecycleStage);

        BuildStep leadLifecycleStageSubCategory(LeadLifecycleStageSubCategory leadLifecycleStageSubCategory);

        BuildStep lockPeriod(Temporal.DateTime dateTime);

        BuildStep manualClosedReason(String str);

        BuildStep movedToClosedOn(Temporal.DateTime dateTime);

        BuildStep movedToOpportunityOn(Temporal.DateTime dateTime);

        BuildStep name(String str);

        BuildStep needFollowUpTag(String str);

        BuildStep needFollowUpTagUpdatedAt(Temporal.DateTime dateTime);

        BuildStep nextProspectingDueOn(Temporal.DateTime dateTime);

        BuildStep nextProspectingNote(String str);

        BuildStep nextProspectingSetBy(String str);

        BuildStep noWorkAfterAssignment(String str);

        BuildStep numberOfTimesRechurned(Integer num);

        BuildStep openTaskActivityType(TaskActivityType taskActivityType);

        BuildStep openTaskCount(Integer num);

        BuildStep openTaskDetail(String str);

        BuildStep openVideoCallDetail(String str);

        BuildStep ownerId(String str);

        BuildStep paymentRequestDetail(String str);

        BuildStep preferredContactDays(List<Day> list);

        BuildStep primaryTeamId(String str);

        BuildStep productService(List<String> list);

        BuildStep profilePhotoUrl(String str);

        BuildStep prospectingAttempts(Integer num);

        BuildStep recentEngagements(List<String> list);

        BuildStep recentEngagementsUpdatedAt(Temporal.DateTime dateTime);

        BuildStep referredBy(String str);

        BuildStep salutation(String str);

        BuildStep seniority(Seniority seniority);

        BuildStep sharedOwners(List<String> list);

        BuildStep sharedTeams(List<String> list);

        BuildStep toBeAssigned(ContactAssignmentStatus contactAssignmentStatus);

        BuildStep totalProspectingAttemptsAcrossRechurn(Integer num);

        BuildStep unsuccessfulCallAttempts(Integer num);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);

        BuildStep userDefinedTags(List<String> list);

        BuildStep waChatChannelId(String str);

        BuildStep whatsappOptInStatus(String str);
    }

    public static class Builder implements BuildStep {
        private Account account;
        private String accountPriority;
        private String activeDealStage;
        private Temporal.DateTime activeDealStageUpdatedAt;
        private String addedById;
        private List<Address> addresses;
        private String assignedToId;
        private String assignmentMethod;
        private Temporal.DateTime becameCustomerOn;
        private String blockedForCallById;
        private String blockedForCallReason;
        private Temporal.DateTime blockedForCallUntil;
        private String bulkUploadReference;
        private List<BusinessDetail> businessDetail;
        private String callPriority;
        private List<ContactNumberDetail> contactNumberDetail;
        private String contactSource;
        private String contactSourceDrillDownOne;
        private String contactSourceDrillDownOneId;
        private String contactSourceDrillDownThree;
        private String contactSourceDrillDownThreeId;
        private String contactSourceDrillDownTwo;
        private String contactSourceDrillDownTwoId;
        private ContactStatus contactStatus;
        private String contactType;
        private Temporal.DateTime createdAt;
        private String customAttributes;
        private String customDataAddedFromAddContactForm;
        private String dealDescription;
        private String department;
        private String designation;
        private List<Email> emails;
        private List<ExternalReference> externalReference;
        private Temporal.DateTime firstProspectingDoneOn;
        private String freshLeadTag;
        private String gender;
        private Boolean hasTask;
        private String id;
        private String isCustomer;
        private Boolean isDecisionMaker;
        private Boolean isPrivate;
        private CallDirection lastCallDirection;
        private Integer lastCallDuration;
        private String lastCallEngagementId;
        private String lastCallOutcome;
        private String lastCallOutcomeNature;
        private String lastCallUserId;
        private Temporal.DateTime lastCalledTime;
        private String lastClosedTaskDetail;
        private Temporal.DateTime lastClosedTaskDetailUpdatedAt;
        private String lastDealStageType;
        private String lastEmailEngagementId;
        private Temporal.DateTime lastEmailTime;
        private String lastEmailUserId;
        private Temporal.DateTime lastEngagementFromAccount;
        private Temporal.DateTime lastEngagementFromContact;
        private String lastKnownDisposition;
        private Temporal.DateTime lastKnownDispositionTime;
        private Temporal.DateTime lastLeadAssignmentDateTime;
        private Temporal.DateTime lastNoteAddedTime;
        private String lastNoteEngagementId;
        private String lastNoteUserId;
        private String lastPaymentStatus;
        private Temporal.DateTime lastProspectingDoneOn;
        private Temporal.DateTime lastRepeatEnquiryDate;
        private String lastRepeatEnquirySource;
        private String lastSmsEngagementId;
        private Temporal.DateTime lastSmsTime;
        private String lastSmsUserId;
        private String lastTaskDoneEngagementId;
        private Temporal.DateTime lastTaskDoneTime;
        private String lastTaskDoneUserId;
        private String lastVisitEngagementId;
        private String lastVisitOutcome;
        private String lastVisitOutcomeNature;
        private Temporal.DateTime lastVisitTime;
        private String lastVisitUserId;
        private String lastWabaBroadcastReplyBody;
        private Temporal.DateTime lastWabaBroadcastReplyTime;
        private String lastWabaBroadcastReplyType;
        private String lastWabaBroadcastStatus;
        private String lastWabaBroadcastTemplate;
        private Temporal.DateTime lastWabaBroadcastTime;
        private String lastWhatsappEngagementId;
        private Temporal.DateTime lastWhatsappTime;
        private String lastWhatsappUserId;
        private String latestRemark;
        private Integer leadCallsNotAnswered;
        private LeadLifecycleStage leadLifecycleStage;
        private LeadLifecycleStageSubCategory leadLifecycleStageSubCategory;
        private Temporal.DateTime lockPeriod;
        private String manualClosedReason;
        private Temporal.DateTime movedToClosedOn;
        private Temporal.DateTime movedToOpportunityOn;
        private String name;
        private String needFollowUpTag;
        private Temporal.DateTime needFollowUpTagUpdatedAt;
        private Temporal.DateTime nextProspectingDueOn;
        private String nextProspectingNote;
        private String nextProspectingSetBy;
        private String noWorkAfterAssignment;
        private Integer numberOfTimesRechurned;
        private TaskActivityType openTaskActivityType;
        private Integer openTaskCount;
        private String openTaskDetail;
        private String openVideoCallDetail;
        private String ownerId;
        private String paymentRequestDetail;
        private List<Day> preferredContactDays;
        private String primaryTeamId;
        private List<String> productService;
        private String profilePhotoUrl;
        private Integer prospectingAttempts;
        private List<String> recentEngagements;
        private Temporal.DateTime recentEngagementsUpdatedAt;
        private String referredBy;
        private String salutation;
        private Seniority seniority;
        private List<String> sharedOwners;
        private List<String> sharedTeams;
        private ContactAssignmentStatus toBeAssigned;
        private Integer totalProspectingAttemptsAcrossRechurn;
        private Integer unsuccessfulCallAttempts;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private List<String> userDefinedTags;
        private String waChatChannelId;
        private String whatsappOptInStatus;

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep account(Account account) {
            this.account = account;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep accountPriority(String str) {
            this.accountPriority = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep activeDealStage(String str) {
            this.activeDealStage = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep activeDealStageUpdatedAt(Temporal.DateTime dateTime) {
            this.activeDealStageUpdatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep addedById(String str) {
            this.addedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep addresses(List<Address> list) {
            this.addresses = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep assignedToId(String str) {
            this.assignedToId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep assignmentMethod(String str) {
            this.assignmentMethod = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep becameCustomerOn(Temporal.DateTime dateTime) {
            this.becameCustomerOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep blockedForCallById(String str) {
            this.blockedForCallById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep blockedForCallReason(String str) {
            this.blockedForCallReason = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep blockedForCallUntil(Temporal.DateTime dateTime) {
            this.blockedForCallUntil = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public Contact build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new Contact(string, this.account, this.ownerId, this.toBeAssigned, this.sharedOwners, this.primaryTeamId, this.sharedTeams, this.accountPriority, this.addedById, this.addresses, this.assignedToId, this.blockedForCallById, this.blockedForCallReason, this.blockedForCallUntil, this.callPriority, this.waChatChannelId, this.contactNumberDetail, this.businessDetail, this.contactSource, this.contactSourceDrillDownOne, this.contactSourceDrillDownTwo, this.contactSourceDrillDownThree, this.contactSourceDrillDownOneId, this.contactSourceDrillDownTwoId, this.contactSourceDrillDownThreeId, this.contactStatus, this.contactType, this.department, this.designation, this.emails, this.lastRepeatEnquiryDate, this.lastRepeatEnquirySource, this.externalReference, this.gender, this.isDecisionMaker, this.isPrivate, this.lockPeriod, this.name, this.preferredContactDays, this.profilePhotoUrl, this.referredBy, this.salutation, this.seniority, this.updatedById, this.hasTask, this.openTaskActivityType, this.lastCalledTime, this.lastCallDirection, this.lastCallOutcome, this.lastCallOutcomeNature, this.lastCallUserId, this.lastCallDuration, this.lastCallEngagementId, this.lastVisitTime, this.lastVisitOutcome, this.lastVisitOutcomeNature, this.lastVisitUserId, this.lastVisitEngagementId, this.lastEmailTime, this.lastEmailUserId, this.lastEmailEngagementId, this.lastWhatsappTime, this.lastWhatsappUserId, this.lastWhatsappEngagementId, this.lastWabaBroadcastTime, this.lastWabaBroadcastStatus, this.lastWabaBroadcastTemplate, this.lastWabaBroadcastReplyBody, this.lastWabaBroadcastReplyTime, this.lastWabaBroadcastReplyType, this.lastSmsTime, this.lastSmsUserId, this.lastSmsEngagementId, this.lastNoteAddedTime, this.lastNoteUserId, this.lastNoteEngagementId, this.lastTaskDoneTime, this.lastTaskDoneUserId, this.lastTaskDoneEngagementId, this.openTaskCount, this.lastKnownDisposition, this.lastKnownDispositionTime, this.lastLeadAssignmentDateTime, this.lastEngagementFromAccount, this.lastEngagementFromContact, this.freshLeadTag, this.noWorkAfterAssignment, this.needFollowUpTag, this.needFollowUpTagUpdatedAt, this.activeDealStage, this.activeDealStageUpdatedAt, this.dealDescription, this.isCustomer, this.becameCustomerOn, this.unsuccessfulCallAttempts, this.leadCallsNotAnswered, this.userDefinedTags, this.productService, this.bulkUploadReference, this.assignmentMethod, this.whatsappOptInStatus, this.recentEngagements, this.recentEngagementsUpdatedAt, this.openTaskDetail, this.openVideoCallDetail, this.lastClosedTaskDetail, this.lastClosedTaskDetailUpdatedAt, this.latestRemark, this.customAttributes, this.paymentRequestDetail, this.lastPaymentStatus, this.customDataAddedFromAddContactForm, this.leadLifecycleStage, this.leadLifecycleStageSubCategory, this.manualClosedReason, this.lastDealStageType, this.prospectingAttempts, this.totalProspectingAttemptsAcrossRechurn, this.numberOfTimesRechurned, this.lastProspectingDoneOn, this.firstProspectingDoneOn, this.nextProspectingDueOn, this.nextProspectingSetBy, this.nextProspectingNote, this.movedToOpportunityOn, this.movedToClosedOn, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep bulkUploadReference(String str) {
            this.bulkUploadReference = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep businessDetail(List<BusinessDetail> list) {
            this.businessDetail = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep callPriority(String str) {
            this.callPriority = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep contactNumberDetail(List<ContactNumberDetail> list) {
            this.contactNumberDetail = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep contactSource(String str) {
            this.contactSource = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep contactSourceDrillDownOne(String str) {
            this.contactSourceDrillDownOne = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep contactSourceDrillDownOneId(String str) {
            this.contactSourceDrillDownOneId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep contactSourceDrillDownThree(String str) {
            this.contactSourceDrillDownThree = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep contactSourceDrillDownThreeId(String str) {
            this.contactSourceDrillDownThreeId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep contactSourceDrillDownTwo(String str) {
            this.contactSourceDrillDownTwo = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep contactSourceDrillDownTwoId(String str) {
            this.contactSourceDrillDownTwoId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep contactStatus(ContactStatus contactStatus) {
            this.contactStatus = contactStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep contactType(String str) {
            this.contactType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep customAttributes(String str) {
            this.customAttributes = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep customDataAddedFromAddContactForm(String str) {
            this.customDataAddedFromAddContactForm = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep dealDescription(String str) {
            this.dealDescription = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep department(String str) {
            this.department = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep designation(String str) {
            this.designation = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep emails(List<Email> list) {
            this.emails = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep externalReference(List<ExternalReference> list) {
            this.externalReference = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep firstProspectingDoneOn(Temporal.DateTime dateTime) {
            this.firstProspectingDoneOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep freshLeadTag(String str) {
            this.freshLeadTag = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep gender(String str) {
            this.gender = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep hasTask(Boolean bool) {
            this.hasTask = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep isCustomer(String str) {
            this.isCustomer = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep isDecisionMaker(Boolean bool) {
            this.isDecisionMaker = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep isPrivate(Boolean bool) {
            this.isPrivate = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastCallDirection(CallDirection callDirection) {
            this.lastCallDirection = callDirection;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastCallDuration(Integer num) {
            this.lastCallDuration = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastCallEngagementId(String str) {
            this.lastCallEngagementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastCallOutcome(String str) {
            this.lastCallOutcome = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastCallOutcomeNature(String str) {
            this.lastCallOutcomeNature = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastCallUserId(String str) {
            this.lastCallUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastCalledTime(Temporal.DateTime dateTime) {
            this.lastCalledTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastClosedTaskDetail(String str) {
            this.lastClosedTaskDetail = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastClosedTaskDetailUpdatedAt(Temporal.DateTime dateTime) {
            this.lastClosedTaskDetailUpdatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastDealStageType(String str) {
            this.lastDealStageType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastEmailEngagementId(String str) {
            this.lastEmailEngagementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastEmailTime(Temporal.DateTime dateTime) {
            this.lastEmailTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastEmailUserId(String str) {
            this.lastEmailUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastEngagementFromAccount(Temporal.DateTime dateTime) {
            this.lastEngagementFromAccount = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastEngagementFromContact(Temporal.DateTime dateTime) {
            this.lastEngagementFromContact = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastKnownDisposition(String str) {
            this.lastKnownDisposition = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastKnownDispositionTime(Temporal.DateTime dateTime) {
            this.lastKnownDispositionTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastLeadAssignmentDateTime(Temporal.DateTime dateTime) {
            this.lastLeadAssignmentDateTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastNoteAddedTime(Temporal.DateTime dateTime) {
            this.lastNoteAddedTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastNoteEngagementId(String str) {
            this.lastNoteEngagementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastNoteUserId(String str) {
            this.lastNoteUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastPaymentStatus(String str) {
            this.lastPaymentStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastProspectingDoneOn(Temporal.DateTime dateTime) {
            this.lastProspectingDoneOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastRepeatEnquiryDate(Temporal.DateTime dateTime) {
            this.lastRepeatEnquiryDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastRepeatEnquirySource(String str) {
            this.lastRepeatEnquirySource = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastSmsEngagementId(String str) {
            this.lastSmsEngagementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastSmsTime(Temporal.DateTime dateTime) {
            this.lastSmsTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastSmsUserId(String str) {
            this.lastSmsUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastTaskDoneEngagementId(String str) {
            this.lastTaskDoneEngagementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastTaskDoneTime(Temporal.DateTime dateTime) {
            this.lastTaskDoneTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastTaskDoneUserId(String str) {
            this.lastTaskDoneUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastVisitEngagementId(String str) {
            this.lastVisitEngagementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastVisitOutcome(String str) {
            this.lastVisitOutcome = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastVisitOutcomeNature(String str) {
            this.lastVisitOutcomeNature = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastVisitTime(Temporal.DateTime dateTime) {
            this.lastVisitTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastVisitUserId(String str) {
            this.lastVisitUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastWabaBroadcastReplyBody(String str) {
            this.lastWabaBroadcastReplyBody = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastWabaBroadcastReplyTime(Temporal.DateTime dateTime) {
            this.lastWabaBroadcastReplyTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastWabaBroadcastReplyType(String str) {
            this.lastWabaBroadcastReplyType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastWabaBroadcastStatus(String str) {
            this.lastWabaBroadcastStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastWabaBroadcastTemplate(String str) {
            this.lastWabaBroadcastTemplate = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastWabaBroadcastTime(Temporal.DateTime dateTime) {
            this.lastWabaBroadcastTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastWhatsappEngagementId(String str) {
            this.lastWhatsappEngagementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastWhatsappTime(Temporal.DateTime dateTime) {
            this.lastWhatsappTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lastWhatsappUserId(String str) {
            this.lastWhatsappUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep latestRemark(String str) {
            this.latestRemark = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep leadCallsNotAnswered(Integer num) {
            this.leadCallsNotAnswered = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep leadLifecycleStage(LeadLifecycleStage leadLifecycleStage) {
            this.leadLifecycleStage = leadLifecycleStage;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep leadLifecycleStageSubCategory(LeadLifecycleStageSubCategory leadLifecycleStageSubCategory) {
            this.leadLifecycleStageSubCategory = leadLifecycleStageSubCategory;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep lockPeriod(Temporal.DateTime dateTime) {
            this.lockPeriod = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep manualClosedReason(String str) {
            this.manualClosedReason = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep movedToClosedOn(Temporal.DateTime dateTime) {
            this.movedToClosedOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep movedToOpportunityOn(Temporal.DateTime dateTime) {
            this.movedToOpportunityOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep needFollowUpTag(String str) {
            this.needFollowUpTag = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep needFollowUpTagUpdatedAt(Temporal.DateTime dateTime) {
            this.needFollowUpTagUpdatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep nextProspectingDueOn(Temporal.DateTime dateTime) {
            this.nextProspectingDueOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep nextProspectingNote(String str) {
            this.nextProspectingNote = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep nextProspectingSetBy(String str) {
            this.nextProspectingSetBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep noWorkAfterAssignment(String str) {
            this.noWorkAfterAssignment = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep numberOfTimesRechurned(Integer num) {
            this.numberOfTimesRechurned = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep openTaskActivityType(TaskActivityType taskActivityType) {
            this.openTaskActivityType = taskActivityType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep openTaskCount(Integer num) {
            this.openTaskCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep openTaskDetail(String str) {
            this.openTaskDetail = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep openVideoCallDetail(String str) {
            this.openVideoCallDetail = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep paymentRequestDetail(String str) {
            this.paymentRequestDetail = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep preferredContactDays(List<Day> list) {
            this.preferredContactDays = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep primaryTeamId(String str) {
            this.primaryTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep productService(List<String> list) {
            this.productService = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep profilePhotoUrl(String str) {
            this.profilePhotoUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep prospectingAttempts(Integer num) {
            this.prospectingAttempts = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep recentEngagements(List<String> list) {
            this.recentEngagements = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep recentEngagementsUpdatedAt(Temporal.DateTime dateTime) {
            this.recentEngagementsUpdatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep referredBy(String str) {
            this.referredBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep salutation(String str) {
            this.salutation = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep seniority(Seniority seniority) {
            this.seniority = seniority;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep sharedOwners(List<String> list) {
            this.sharedOwners = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep sharedTeams(List<String> list) {
            this.sharedTeams = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep toBeAssigned(ContactAssignmentStatus contactAssignmentStatus) {
            this.toBeAssigned = contactAssignmentStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep totalProspectingAttemptsAcrossRechurn(Integer num) {
            this.totalProspectingAttemptsAcrossRechurn = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep unsuccessfulCallAttempts(Integer num) {
            this.unsuccessfulCallAttempts = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep userDefinedTags(List<String> list) {
            this.userDefinedTags = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep waChatChannelId(String str) {
            this.waChatChannelId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public BuildStep whatsappOptInStatus(String str) {
            this.whatsappOptInStatus = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Account account, String str2, ContactAssignmentStatus contactAssignmentStatus, List<String> list, String str3, List<String> list2, String str4, String str5, List<Address> list3, String str6, String str7, String str8, Temporal.DateTime dateTime, String str9, String str10, List<ContactNumberDetail> list4, List<BusinessDetail> list5, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ContactStatus contactStatus, String str18, String str19, String str20, List<Email> list6, Temporal.DateTime dateTime2, String str21, List<ExternalReference> list7, String str22, Boolean bool, Boolean bool2, Temporal.DateTime dateTime3, String str23, List<Day> list8, String str24, String str25, String str26, Seniority seniority, String str27, Boolean bool3, TaskActivityType taskActivityType, Temporal.DateTime dateTime4, CallDirection callDirection, String str28, String str29, String str30, Integer num, String str31, Temporal.DateTime dateTime5, String str32, String str33, String str34, String str35, Temporal.DateTime dateTime6, String str36, String str37, Temporal.DateTime dateTime7, String str38, String str39, Temporal.DateTime dateTime8, String str40, String str41, String str42, Temporal.DateTime dateTime9, String str43, Temporal.DateTime dateTime10, String str44, String str45, Temporal.DateTime dateTime11, String str46, String str47, Temporal.DateTime dateTime12, String str48, String str49, Integer num2, String str50, Temporal.DateTime dateTime13, Temporal.DateTime dateTime14, Temporal.DateTime dateTime15, Temporal.DateTime dateTime16, String str51, String str52, String str53, Temporal.DateTime dateTime17, String str54, Temporal.DateTime dateTime18, String str55, String str56, Temporal.DateTime dateTime19, Integer num3, Integer num4, List<String> list9, List<String> list10, String str57, String str58, String str59, List<String> list11, Temporal.DateTime dateTime20, String str60, String str61, String str62, Temporal.DateTime dateTime21, String str63, String str64, String str65, String str66, String str67, LeadLifecycleStage leadLifecycleStage, LeadLifecycleStageSubCategory leadLifecycleStageSubCategory, String str68, String str69, Integer num5, Integer num6, Integer num7, Temporal.DateTime dateTime22, Temporal.DateTime dateTime23, Temporal.DateTime dateTime24, String str70, String str71, Temporal.DateTime dateTime25, Temporal.DateTime dateTime26, Temporal.DateTime dateTime27, Temporal.DateTime dateTime28) {
            this.id = str;
            this.account = account;
            this.ownerId = str2;
            this.toBeAssigned = contactAssignmentStatus;
            this.sharedOwners = list;
            this.primaryTeamId = str3;
            this.sharedTeams = list2;
            this.accountPriority = str4;
            this.addedById = str5;
            this.addresses = list3;
            this.assignedToId = str6;
            this.blockedForCallById = str7;
            this.blockedForCallReason = str8;
            this.blockedForCallUntil = dateTime;
            this.callPriority = str9;
            this.waChatChannelId = str10;
            this.contactNumberDetail = list4;
            this.businessDetail = list5;
            this.contactSource = str11;
            this.contactSourceDrillDownOne = str12;
            this.contactSourceDrillDownTwo = str13;
            this.contactSourceDrillDownThree = str14;
            this.contactSourceDrillDownOneId = str15;
            this.contactSourceDrillDownTwoId = str16;
            this.contactSourceDrillDownThreeId = str17;
            this.contactStatus = contactStatus;
            this.contactType = str18;
            this.department = str19;
            this.designation = str20;
            this.emails = list6;
            this.lastRepeatEnquiryDate = dateTime2;
            this.lastRepeatEnquirySource = str21;
            this.externalReference = list7;
            this.gender = str22;
            this.isDecisionMaker = bool;
            this.isPrivate = bool2;
            this.lockPeriod = dateTime3;
            this.name = str23;
            this.preferredContactDays = list8;
            this.profilePhotoUrl = str24;
            this.referredBy = str25;
            this.salutation = str26;
            this.seniority = seniority;
            this.updatedById = str27;
            this.hasTask = bool3;
            this.openTaskActivityType = taskActivityType;
            this.lastCalledTime = dateTime4;
            this.lastCallDirection = callDirection;
            this.lastCallOutcome = str28;
            this.lastCallOutcomeNature = str29;
            this.lastCallUserId = str30;
            this.lastCallDuration = num;
            this.lastCallEngagementId = str31;
            this.lastVisitTime = dateTime5;
            this.lastVisitOutcome = str32;
            this.lastVisitOutcomeNature = str33;
            this.lastVisitUserId = str34;
            this.lastVisitEngagementId = str35;
            this.lastEmailTime = dateTime6;
            this.lastEmailUserId = str36;
            this.lastEmailEngagementId = str37;
            this.lastWhatsappTime = dateTime7;
            this.lastWhatsappUserId = str38;
            this.lastWhatsappEngagementId = str39;
            this.lastWabaBroadcastTime = dateTime8;
            this.lastWabaBroadcastStatus = str40;
            this.lastWabaBroadcastTemplate = str41;
            this.lastWabaBroadcastReplyBody = str42;
            this.lastWabaBroadcastReplyTime = dateTime9;
            this.lastWabaBroadcastReplyType = str43;
            this.lastSmsTime = dateTime10;
            this.lastSmsUserId = str44;
            this.lastSmsEngagementId = str45;
            this.lastNoteAddedTime = dateTime11;
            this.lastNoteUserId = str46;
            this.lastNoteEngagementId = str47;
            this.lastTaskDoneTime = dateTime12;
            this.lastTaskDoneUserId = str48;
            this.lastTaskDoneEngagementId = str49;
            this.openTaskCount = num2;
            this.lastKnownDisposition = str50;
            this.lastKnownDispositionTime = dateTime13;
            this.lastLeadAssignmentDateTime = dateTime14;
            this.lastEngagementFromAccount = dateTime15;
            this.lastEngagementFromContact = dateTime16;
            this.freshLeadTag = str51;
            this.noWorkAfterAssignment = str52;
            this.needFollowUpTag = str53;
            this.needFollowUpTagUpdatedAt = dateTime17;
            this.activeDealStage = str54;
            this.activeDealStageUpdatedAt = dateTime18;
            this.dealDescription = str55;
            this.isCustomer = str56;
            this.becameCustomerOn = dateTime19;
            this.unsuccessfulCallAttempts = num3;
            this.leadCallsNotAnswered = num4;
            this.userDefinedTags = list9;
            this.productService = list10;
            this.bulkUploadReference = str57;
            this.assignmentMethod = str58;
            this.whatsappOptInStatus = str59;
            this.recentEngagements = list11;
            this.recentEngagementsUpdatedAt = dateTime20;
            this.openTaskDetail = str60;
            this.openVideoCallDetail = str61;
            this.lastClosedTaskDetail = str62;
            this.lastClosedTaskDetailUpdatedAt = dateTime21;
            this.latestRemark = str63;
            this.customAttributes = str64;
            this.paymentRequestDetail = str65;
            this.lastPaymentStatus = str66;
            this.customDataAddedFromAddContactForm = str67;
            this.leadLifecycleStage = leadLifecycleStage;
            this.leadLifecycleStageSubCategory = leadLifecycleStageSubCategory;
            this.manualClosedReason = str68;
            this.lastDealStageType = str69;
            this.prospectingAttempts = num5;
            this.totalProspectingAttemptsAcrossRechurn = num6;
            this.numberOfTimesRechurned = num7;
            this.lastProspectingDoneOn = dateTime22;
            this.firstProspectingDoneOn = dateTime23;
            this.nextProspectingDueOn = dateTime24;
            this.nextProspectingSetBy = str70;
            this.nextProspectingNote = str71;
            this.movedToOpportunityOn = dateTime25;
            this.movedToClosedOn = dateTime26;
            this.createdAt = dateTime27;
            this.updatedAt = dateTime28;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public /* bridge */ /* synthetic */ BuildStep addresses(List list) {
            return addresses((List<Address>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public /* bridge */ /* synthetic */ BuildStep businessDetail(List list) {
            return businessDetail((List<BusinessDetail>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public /* bridge */ /* synthetic */ BuildStep contactNumberDetail(List list) {
            return contactNumberDetail((List<ContactNumberDetail>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public /* bridge */ /* synthetic */ BuildStep emails(List list) {
            return emails((List<Email>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public /* bridge */ /* synthetic */ BuildStep externalReference(List list) {
            return externalReference((List<ExternalReference>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public /* bridge */ /* synthetic */ BuildStep preferredContactDays(List list) {
            return preferredContactDays((List<Day>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public /* bridge */ /* synthetic */ BuildStep productService(List list) {
            return productService((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public /* bridge */ /* synthetic */ BuildStep recentEngagements(List list) {
            return recentEngagements((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public /* bridge */ /* synthetic */ BuildStep sharedOwners(List list) {
            return sharedOwners((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public /* bridge */ /* synthetic */ BuildStep sharedTeams(List list) {
            return sharedTeams((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public /* bridge */ /* synthetic */ BuildStep userDefinedTags(List list) {
            return userDefinedTags((List<String>) list);
        }

        private CopyOfBuilder(String str, Account account, String str2, ContactAssignmentStatus contactAssignmentStatus, List<String> list, String str3, List<String> list2, String str4, String str5, List<Address> list3, String str6, String str7, String str8, Temporal.DateTime dateTime, String str9, String str10, List<ContactNumberDetail> list4, List<BusinessDetail> list5, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ContactStatus contactStatus, String str18, String str19, String str20, List<Email> list6, Temporal.DateTime dateTime2, String str21, List<ExternalReference> list7, String str22, Boolean bool, Boolean bool2, Temporal.DateTime dateTime3, String str23, List<Day> list8, String str24, String str25, String str26, Seniority seniority, String str27, Boolean bool3, TaskActivityType taskActivityType, Temporal.DateTime dateTime4, CallDirection callDirection, String str28, String str29, String str30, Integer num, String str31, Temporal.DateTime dateTime5, String str32, String str33, String str34, String str35, Temporal.DateTime dateTime6, String str36, String str37, Temporal.DateTime dateTime7, String str38, String str39, Temporal.DateTime dateTime8, String str40, String str41, String str42, Temporal.DateTime dateTime9, String str43, Temporal.DateTime dateTime10, String str44, String str45, Temporal.DateTime dateTime11, String str46, String str47, Temporal.DateTime dateTime12, String str48, String str49, Integer num2, String str50, Temporal.DateTime dateTime13, Temporal.DateTime dateTime14, Temporal.DateTime dateTime15, Temporal.DateTime dateTime16, String str51, String str52, String str53, Temporal.DateTime dateTime17, String str54, Temporal.DateTime dateTime18, String str55, String str56, Temporal.DateTime dateTime19, Integer num3, Integer num4, List<String> list9, List<String> list10, String str57, String str58, String str59, List<String> list11, Temporal.DateTime dateTime20, String str60, String str61, String str62, Temporal.DateTime dateTime21, String str63, String str64, String str65, String str66, String str67, LeadLifecycleStage leadLifecycleStage, LeadLifecycleStageSubCategory leadLifecycleStageSubCategory, String str68, String str69, Integer num5, Integer num6, Integer num7, Temporal.DateTime dateTime22, Temporal.DateTime dateTime23, Temporal.DateTime dateTime24, String str70, String str71, Temporal.DateTime dateTime25, Temporal.DateTime dateTime26, Temporal.DateTime dateTime27, Temporal.DateTime dateTime28) {
            super(str, account, str2, contactAssignmentStatus, list, str3, list2, str4, str5, list3, str6, str7, str8, dateTime, str9, str10, list4, list5, str11, str12, str13, str14, str15, str16, str17, contactStatus, str18, str19, str20, list6, dateTime2, str21, list7, str22, bool, bool2, dateTime3, str23, list8, str24, str25, str26, seniority, str27, bool3, taskActivityType, dateTime4, callDirection, str28, str29, str30, num, str31, dateTime5, str32, str33, str34, str35, dateTime6, str36, str37, dateTime7, str38, str39, dateTime8, str40, str41, str42, dateTime9, str43, dateTime10, str44, str45, dateTime11, str46, str47, dateTime12, str48, str49, num2, str50, dateTime13, dateTime14, dateTime15, dateTime16, str51, str52, str53, dateTime17, str54, dateTime18, str55, str56, dateTime19, num3, num4, list9, list10, str57, str58, str59, list11, dateTime20, str60, str61, str62, dateTime21, str63, str64, str65, str66, str67, leadLifecycleStage, leadLifecycleStageSubCategory, str68, str69, num5, num6, num7, dateTime22, dateTime23, dateTime24, str70, str71, dateTime25, dateTime26, dateTime27, dateTime28);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder account(Account account) {
            return (CopyOfBuilder) super.account(account);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder accountPriority(String str) {
            return (CopyOfBuilder) super.accountPriority(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder activeDealStage(String str) {
            return (CopyOfBuilder) super.activeDealStage(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder activeDealStageUpdatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.activeDealStageUpdatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder addedById(String str) {
            return (CopyOfBuilder) super.addedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder addresses(List<Address> list) {
            return (CopyOfBuilder) super.addresses(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder assignedToId(String str) {
            return (CopyOfBuilder) super.assignedToId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder assignmentMethod(String str) {
            return (CopyOfBuilder) super.assignmentMethod(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder becameCustomerOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.becameCustomerOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder blockedForCallById(String str) {
            return (CopyOfBuilder) super.blockedForCallById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder blockedForCallReason(String str) {
            return (CopyOfBuilder) super.blockedForCallReason(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder blockedForCallUntil(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.blockedForCallUntil(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder bulkUploadReference(String str) {
            return (CopyOfBuilder) super.bulkUploadReference(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder businessDetail(List<BusinessDetail> list) {
            return (CopyOfBuilder) super.businessDetail(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder callPriority(String str) {
            return (CopyOfBuilder) super.callPriority(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder contactNumberDetail(List<ContactNumberDetail> list) {
            return (CopyOfBuilder) super.contactNumberDetail(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder contactSource(String str) {
            return (CopyOfBuilder) super.contactSource(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder contactSourceDrillDownOne(String str) {
            return (CopyOfBuilder) super.contactSourceDrillDownOne(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder contactSourceDrillDownOneId(String str) {
            return (CopyOfBuilder) super.contactSourceDrillDownOneId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder contactSourceDrillDownThree(String str) {
            return (CopyOfBuilder) super.contactSourceDrillDownThree(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder contactSourceDrillDownThreeId(String str) {
            return (CopyOfBuilder) super.contactSourceDrillDownThreeId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder contactSourceDrillDownTwo(String str) {
            return (CopyOfBuilder) super.contactSourceDrillDownTwo(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder contactSourceDrillDownTwoId(String str) {
            return (CopyOfBuilder) super.contactSourceDrillDownTwoId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder contactStatus(ContactStatus contactStatus) {
            return (CopyOfBuilder) super.contactStatus(contactStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder contactType(String str) {
            return (CopyOfBuilder) super.contactType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder customAttributes(String str) {
            return (CopyOfBuilder) super.customAttributes(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder customDataAddedFromAddContactForm(String str) {
            return (CopyOfBuilder) super.customDataAddedFromAddContactForm(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder dealDescription(String str) {
            return (CopyOfBuilder) super.dealDescription(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder department(String str) {
            return (CopyOfBuilder) super.department(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder designation(String str) {
            return (CopyOfBuilder) super.designation(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder emails(List<Email> list) {
            return (CopyOfBuilder) super.emails(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder externalReference(List<ExternalReference> list) {
            return (CopyOfBuilder) super.externalReference(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder firstProspectingDoneOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.firstProspectingDoneOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder freshLeadTag(String str) {
            return (CopyOfBuilder) super.freshLeadTag(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder gender(String str) {
            return (CopyOfBuilder) super.gender(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder hasTask(Boolean bool) {
            return (CopyOfBuilder) super.hasTask(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder isCustomer(String str) {
            return (CopyOfBuilder) super.isCustomer(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder isDecisionMaker(Boolean bool) {
            return (CopyOfBuilder) super.isDecisionMaker(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder isPrivate(Boolean bool) {
            return (CopyOfBuilder) super.isPrivate(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastCallDirection(CallDirection callDirection) {
            return (CopyOfBuilder) super.lastCallDirection(callDirection);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastCallDuration(Integer num) {
            return (CopyOfBuilder) super.lastCallDuration(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastCallEngagementId(String str) {
            return (CopyOfBuilder) super.lastCallEngagementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastCallOutcome(String str) {
            return (CopyOfBuilder) super.lastCallOutcome(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastCallOutcomeNature(String str) {
            return (CopyOfBuilder) super.lastCallOutcomeNature(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastCallUserId(String str) {
            return (CopyOfBuilder) super.lastCallUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastCalledTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastCalledTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastClosedTaskDetail(String str) {
            return (CopyOfBuilder) super.lastClosedTaskDetail(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastClosedTaskDetailUpdatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastClosedTaskDetailUpdatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastDealStageType(String str) {
            return (CopyOfBuilder) super.lastDealStageType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastEmailEngagementId(String str) {
            return (CopyOfBuilder) super.lastEmailEngagementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastEmailTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastEmailTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastEmailUserId(String str) {
            return (CopyOfBuilder) super.lastEmailUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastEngagementFromAccount(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastEngagementFromAccount(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastEngagementFromContact(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastEngagementFromContact(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastKnownDisposition(String str) {
            return (CopyOfBuilder) super.lastKnownDisposition(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastKnownDispositionTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastKnownDispositionTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastLeadAssignmentDateTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastLeadAssignmentDateTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastNoteAddedTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastNoteAddedTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastNoteEngagementId(String str) {
            return (CopyOfBuilder) super.lastNoteEngagementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastNoteUserId(String str) {
            return (CopyOfBuilder) super.lastNoteUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastPaymentStatus(String str) {
            return (CopyOfBuilder) super.lastPaymentStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastProspectingDoneOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastProspectingDoneOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastRepeatEnquiryDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastRepeatEnquiryDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastRepeatEnquirySource(String str) {
            return (CopyOfBuilder) super.lastRepeatEnquirySource(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastSmsEngagementId(String str) {
            return (CopyOfBuilder) super.lastSmsEngagementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastSmsTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastSmsTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastSmsUserId(String str) {
            return (CopyOfBuilder) super.lastSmsUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastTaskDoneEngagementId(String str) {
            return (CopyOfBuilder) super.lastTaskDoneEngagementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastTaskDoneTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastTaskDoneTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastTaskDoneUserId(String str) {
            return (CopyOfBuilder) super.lastTaskDoneUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastVisitEngagementId(String str) {
            return (CopyOfBuilder) super.lastVisitEngagementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastVisitOutcome(String str) {
            return (CopyOfBuilder) super.lastVisitOutcome(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastVisitOutcomeNature(String str) {
            return (CopyOfBuilder) super.lastVisitOutcomeNature(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastVisitTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastVisitTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastVisitUserId(String str) {
            return (CopyOfBuilder) super.lastVisitUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastWabaBroadcastReplyBody(String str) {
            return (CopyOfBuilder) super.lastWabaBroadcastReplyBody(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastWabaBroadcastReplyTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastWabaBroadcastReplyTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastWabaBroadcastReplyType(String str) {
            return (CopyOfBuilder) super.lastWabaBroadcastReplyType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastWabaBroadcastStatus(String str) {
            return (CopyOfBuilder) super.lastWabaBroadcastStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastWabaBroadcastTemplate(String str) {
            return (CopyOfBuilder) super.lastWabaBroadcastTemplate(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastWabaBroadcastTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastWabaBroadcastTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastWhatsappEngagementId(String str) {
            return (CopyOfBuilder) super.lastWhatsappEngagementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastWhatsappTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastWhatsappTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lastWhatsappUserId(String str) {
            return (CopyOfBuilder) super.lastWhatsappUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder latestRemark(String str) {
            return (CopyOfBuilder) super.latestRemark(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder leadCallsNotAnswered(Integer num) {
            return (CopyOfBuilder) super.leadCallsNotAnswered(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder leadLifecycleStage(LeadLifecycleStage leadLifecycleStage) {
            return (CopyOfBuilder) super.leadLifecycleStage(leadLifecycleStage);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder leadLifecycleStageSubCategory(LeadLifecycleStageSubCategory leadLifecycleStageSubCategory) {
            return (CopyOfBuilder) super.leadLifecycleStageSubCategory(leadLifecycleStageSubCategory);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder lockPeriod(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lockPeriod(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder manualClosedReason(String str) {
            return (CopyOfBuilder) super.manualClosedReason(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder movedToClosedOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.movedToClosedOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder movedToOpportunityOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.movedToOpportunityOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder needFollowUpTag(String str) {
            return (CopyOfBuilder) super.needFollowUpTag(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder needFollowUpTagUpdatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.needFollowUpTagUpdatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder nextProspectingDueOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.nextProspectingDueOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder nextProspectingNote(String str) {
            return (CopyOfBuilder) super.nextProspectingNote(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder nextProspectingSetBy(String str) {
            return (CopyOfBuilder) super.nextProspectingSetBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder noWorkAfterAssignment(String str) {
            return (CopyOfBuilder) super.noWorkAfterAssignment(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder numberOfTimesRechurned(Integer num) {
            return (CopyOfBuilder) super.numberOfTimesRechurned(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder openTaskActivityType(TaskActivityType taskActivityType) {
            return (CopyOfBuilder) super.openTaskActivityType(taskActivityType);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder openTaskCount(Integer num) {
            return (CopyOfBuilder) super.openTaskCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder openTaskDetail(String str) {
            return (CopyOfBuilder) super.openTaskDetail(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder openVideoCallDetail(String str) {
            return (CopyOfBuilder) super.openVideoCallDetail(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder paymentRequestDetail(String str) {
            return (CopyOfBuilder) super.paymentRequestDetail(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder preferredContactDays(List<Day> list) {
            return (CopyOfBuilder) super.preferredContactDays(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder primaryTeamId(String str) {
            return (CopyOfBuilder) super.primaryTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder productService(List<String> list) {
            return (CopyOfBuilder) super.productService(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder profilePhotoUrl(String str) {
            return (CopyOfBuilder) super.profilePhotoUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder prospectingAttempts(Integer num) {
            return (CopyOfBuilder) super.prospectingAttempts(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder recentEngagements(List<String> list) {
            return (CopyOfBuilder) super.recentEngagements(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder recentEngagementsUpdatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.recentEngagementsUpdatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder referredBy(String str) {
            return (CopyOfBuilder) super.referredBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder salutation(String str) {
            return (CopyOfBuilder) super.salutation(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder seniority(Seniority seniority) {
            return (CopyOfBuilder) super.seniority(seniority);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder sharedOwners(List<String> list) {
            return (CopyOfBuilder) super.sharedOwners(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder sharedTeams(List<String> list) {
            return (CopyOfBuilder) super.sharedTeams(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder toBeAssigned(ContactAssignmentStatus contactAssignmentStatus) {
            return (CopyOfBuilder) super.toBeAssigned(contactAssignmentStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder totalProspectingAttemptsAcrossRechurn(Integer num) {
            return (CopyOfBuilder) super.totalProspectingAttemptsAcrossRechurn(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder unsuccessfulCallAttempts(Integer num) {
            return (CopyOfBuilder) super.unsuccessfulCallAttempts(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder userDefinedTags(List<String> list) {
            return (CopyOfBuilder) super.userDefinedTags(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder waChatChannelId(String str) {
            return (CopyOfBuilder) super.waChatChannelId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Contact.Builder, com.amplifyframework.datastore.generated.model.Contact.BuildStep
        public CopyOfBuilder whatsappOptInStatus(String str) {
            return (CopyOfBuilder) super.whatsappOptInStatus(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public static Contact justId(String str) {
        return new Contact(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.account, this.ownerId, this.toBeAssigned, this.sharedOwners, this.primaryTeamId, this.sharedTeams, this.accountPriority, this.addedById, this.addresses, this.assignedToId, this.blockedForCallById, this.blockedForCallReason, this.blockedForCallUntil, this.callPriority, this.waChatChannelId, this.contactNumberDetail, this.businessDetail, this.contactSource, this.contactSourceDrillDownOne, this.contactSourceDrillDownTwo, this.contactSourceDrillDownThree, this.contactSourceDrillDownOneId, this.contactSourceDrillDownTwoId, this.contactSourceDrillDownThreeId, this.contactStatus, this.contactType, this.department, this.designation, this.emails, this.lastRepeatEnquiryDate, this.lastRepeatEnquirySource, this.externalReference, this.gender, this.isDecisionMaker, this.isPrivate, this.lockPeriod, this.name, this.preferredContactDays, this.profilePhotoUrl, this.referredBy, this.salutation, this.seniority, this.updatedById, this.hasTask, this.openTaskActivityType, this.lastCalledTime, this.lastCallDirection, this.lastCallOutcome, this.lastCallOutcomeNature, this.lastCallUserId, this.lastCallDuration, this.lastCallEngagementId, this.lastVisitTime, this.lastVisitOutcome, this.lastVisitOutcomeNature, this.lastVisitUserId, this.lastVisitEngagementId, this.lastEmailTime, this.lastEmailUserId, this.lastEmailEngagementId, this.lastWhatsappTime, this.lastWhatsappUserId, this.lastWhatsappEngagementId, this.lastWabaBroadcastTime, this.lastWabaBroadcastStatus, this.lastWabaBroadcastTemplate, this.lastWabaBroadcastReplyBody, this.lastWabaBroadcastReplyTime, this.lastWabaBroadcastReplyType, this.lastSmsTime, this.lastSmsUserId, this.lastSmsEngagementId, this.lastNoteAddedTime, this.lastNoteUserId, this.lastNoteEngagementId, this.lastTaskDoneTime, this.lastTaskDoneUserId, this.lastTaskDoneEngagementId, this.openTaskCount, this.lastKnownDisposition, this.lastKnownDispositionTime, this.lastLeadAssignmentDateTime, this.lastEngagementFromAccount, this.lastEngagementFromContact, this.freshLeadTag, this.noWorkAfterAssignment, this.needFollowUpTag, this.needFollowUpTagUpdatedAt, this.activeDealStage, this.activeDealStageUpdatedAt, this.dealDescription, this.isCustomer, this.becameCustomerOn, this.unsuccessfulCallAttempts, this.leadCallsNotAnswered, this.userDefinedTags, this.productService, this.bulkUploadReference, this.assignmentMethod, this.whatsappOptInStatus, this.recentEngagements, this.recentEngagementsUpdatedAt, this.openTaskDetail, this.openVideoCallDetail, this.lastClosedTaskDetail, this.lastClosedTaskDetailUpdatedAt, this.latestRemark, this.customAttributes, this.paymentRequestDetail, this.lastPaymentStatus, this.customDataAddedFromAddContactForm, this.leadLifecycleStage, this.leadLifecycleStageSubCategory, this.manualClosedReason, this.lastDealStageType, this.prospectingAttempts, this.totalProspectingAttemptsAcrossRechurn, this.numberOfTimesRechurned, this.lastProspectingDoneOn, this.firstProspectingDoneOn, this.nextProspectingDueOn, this.nextProspectingSetBy, this.nextProspectingNote, this.movedToOpportunityOn, this.movedToClosedOn, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Contact.class != obj.getClass()) {
            return false;
        }
        Contact contact = (Contact) obj;
        return s6c.m47909a(getId(), contact.getId()) && s6c.m47909a(getAccount(), contact.getAccount()) && s6c.m47909a(getOwnerId(), contact.getOwnerId()) && s6c.m47909a(getToBeAssigned(), contact.getToBeAssigned()) && s6c.m47909a(getSharedOwners(), contact.getSharedOwners()) && s6c.m47909a(getPrimaryTeamId(), contact.getPrimaryTeamId()) && s6c.m47909a(getSharedTeams(), contact.getSharedTeams()) && s6c.m47909a(getAccountPriority(), contact.getAccountPriority()) && s6c.m47909a(getAddedById(), contact.getAddedById()) && s6c.m47909a(getAddresses(), contact.getAddresses()) && s6c.m47909a(getAssignedToId(), contact.getAssignedToId()) && s6c.m47909a(getBlockedForCallById(), contact.getBlockedForCallById()) && s6c.m47909a(getBlockedForCallReason(), contact.getBlockedForCallReason()) && s6c.m47909a(getBlockedForCallUntil(), contact.getBlockedForCallUntil()) && s6c.m47909a(getCallPriority(), contact.getCallPriority()) && s6c.m47909a(getWaChatChannelId(), contact.getWaChatChannelId()) && s6c.m47909a(getContactNumberDetail(), contact.getContactNumberDetail()) && s6c.m47909a(getBusinessDetail(), contact.getBusinessDetail()) && s6c.m47909a(getContactSource(), contact.getContactSource()) && s6c.m47909a(getContactSourceDrillDownOne(), contact.getContactSourceDrillDownOne()) && s6c.m47909a(getContactSourceDrillDownTwo(), contact.getContactSourceDrillDownTwo()) && s6c.m47909a(getContactSourceDrillDownThree(), contact.getContactSourceDrillDownThree()) && s6c.m47909a(getContactSourceDrillDownOneId(), contact.getContactSourceDrillDownOneId()) && s6c.m47909a(getContactSourceDrillDownTwoId(), contact.getContactSourceDrillDownTwoId()) && s6c.m47909a(getContactSourceDrillDownThreeId(), contact.getContactSourceDrillDownThreeId()) && s6c.m47909a(getContactStatus(), contact.getContactStatus()) && s6c.m47909a(getContactType(), contact.getContactType()) && s6c.m47909a(getDepartment(), contact.getDepartment()) && s6c.m47909a(getDesignation(), contact.getDesignation()) && s6c.m47909a(getEmails(), contact.getEmails()) && s6c.m47909a(getLastRepeatEnquiryDate(), contact.getLastRepeatEnquiryDate()) && s6c.m47909a(getLastRepeatEnquirySource(), contact.getLastRepeatEnquirySource()) && s6c.m47909a(getExternalReference(), contact.getExternalReference()) && s6c.m47909a(getGender(), contact.getGender()) && s6c.m47909a(getIsDecisionMaker(), contact.getIsDecisionMaker()) && s6c.m47909a(getIsPrivate(), contact.getIsPrivate()) && s6c.m47909a(getLockPeriod(), contact.getLockPeriod()) && s6c.m47909a(getName(), contact.getName()) && s6c.m47909a(getPreferredContactDays(), contact.getPreferredContactDays()) && s6c.m47909a(getProfilePhotoUrl(), contact.getProfilePhotoUrl()) && s6c.m47909a(getReferredBy(), contact.getReferredBy()) && s6c.m47909a(getSalutation(), contact.getSalutation()) && s6c.m47909a(getSeniority(), contact.getSeniority()) && s6c.m47909a(getUpdatedById(), contact.getUpdatedById()) && s6c.m47909a(getHasTask(), contact.getHasTask()) && s6c.m47909a(getOpenTaskActivityType(), contact.getOpenTaskActivityType()) && s6c.m47909a(getLastCalledTime(), contact.getLastCalledTime()) && s6c.m47909a(getLastCallDirection(), contact.getLastCallDirection()) && s6c.m47909a(getLastCallOutcome(), contact.getLastCallOutcome()) && s6c.m47909a(getLastCallOutcomeNature(), contact.getLastCallOutcomeNature()) && s6c.m47909a(getLastCallUserId(), contact.getLastCallUserId()) && s6c.m47909a(getLastCallDuration(), contact.getLastCallDuration()) && s6c.m47909a(getLastCallEngagementId(), contact.getLastCallEngagementId()) && s6c.m47909a(getLastVisitTime(), contact.getLastVisitTime()) && s6c.m47909a(getLastVisitOutcome(), contact.getLastVisitOutcome()) && s6c.m47909a(getLastVisitOutcomeNature(), contact.getLastVisitOutcomeNature()) && s6c.m47909a(getLastVisitUserId(), contact.getLastVisitUserId()) && s6c.m47909a(getLastVisitEngagementId(), contact.getLastVisitEngagementId()) && s6c.m47909a(getLastEmailTime(), contact.getLastEmailTime()) && s6c.m47909a(getLastEmailUserId(), contact.getLastEmailUserId()) && s6c.m47909a(getLastEmailEngagementId(), contact.getLastEmailEngagementId()) && s6c.m47909a(getLastWhatsappTime(), contact.getLastWhatsappTime()) && s6c.m47909a(getLastWhatsappUserId(), contact.getLastWhatsappUserId()) && s6c.m47909a(getLastWhatsappEngagementId(), contact.getLastWhatsappEngagementId()) && s6c.m47909a(getLastWabaBroadcastTime(), contact.getLastWabaBroadcastTime()) && s6c.m47909a(getLastWabaBroadcastStatus(), contact.getLastWabaBroadcastStatus()) && s6c.m47909a(getLastWabaBroadcastTemplate(), contact.getLastWabaBroadcastTemplate()) && s6c.m47909a(getLastWabaBroadcastReplyBody(), contact.getLastWabaBroadcastReplyBody()) && s6c.m47909a(getLastWabaBroadcastReplyTime(), contact.getLastWabaBroadcastReplyTime()) && s6c.m47909a(getLastWabaBroadcastReplyType(), contact.getLastWabaBroadcastReplyType()) && s6c.m47909a(getLastSmsTime(), contact.getLastSmsTime()) && s6c.m47909a(getLastSmsUserId(), contact.getLastSmsUserId()) && s6c.m47909a(getLastSmsEngagementId(), contact.getLastSmsEngagementId()) && s6c.m47909a(getLastNoteAddedTime(), contact.getLastNoteAddedTime()) && s6c.m47909a(getLastNoteUserId(), contact.getLastNoteUserId()) && s6c.m47909a(getLastNoteEngagementId(), contact.getLastNoteEngagementId()) && s6c.m47909a(getLastTaskDoneTime(), contact.getLastTaskDoneTime()) && s6c.m47909a(getLastTaskDoneUserId(), contact.getLastTaskDoneUserId()) && s6c.m47909a(getLastTaskDoneEngagementId(), contact.getLastTaskDoneEngagementId()) && s6c.m47909a(getOpenTaskCount(), contact.getOpenTaskCount()) && s6c.m47909a(getLastKnownDisposition(), contact.getLastKnownDisposition()) && s6c.m47909a(getLastKnownDispositionTime(), contact.getLastKnownDispositionTime()) && s6c.m47909a(getLastLeadAssignmentDateTime(), contact.getLastLeadAssignmentDateTime()) && s6c.m47909a(getLastEngagementFromAccount(), contact.getLastEngagementFromAccount()) && s6c.m47909a(getLastEngagementFromContact(), contact.getLastEngagementFromContact()) && s6c.m47909a(getFreshLeadTag(), contact.getFreshLeadTag()) && s6c.m47909a(getNoWorkAfterAssignment(), contact.getNoWorkAfterAssignment()) && s6c.m47909a(getNeedFollowUpTag(), contact.getNeedFollowUpTag()) && s6c.m47909a(getNeedFollowUpTagUpdatedAt(), contact.getNeedFollowUpTagUpdatedAt()) && s6c.m47909a(getActiveDealStage(), contact.getActiveDealStage()) && s6c.m47909a(getActiveDealStageUpdatedAt(), contact.getActiveDealStageUpdatedAt()) && s6c.m47909a(getDealDescription(), contact.getDealDescription()) && s6c.m47909a(getIsCustomer(), contact.getIsCustomer()) && s6c.m47909a(getBecameCustomerOn(), contact.getBecameCustomerOn()) && s6c.m47909a(getUnsuccessfulCallAttempts(), contact.getUnsuccessfulCallAttempts()) && s6c.m47909a(getLeadCallsNotAnswered(), contact.getLeadCallsNotAnswered()) && s6c.m47909a(getUserDefinedTags(), contact.getUserDefinedTags()) && s6c.m47909a(getProductService(), contact.getProductService()) && s6c.m47909a(getBulkUploadReference(), contact.getBulkUploadReference()) && s6c.m47909a(getAssignmentMethod(), contact.getAssignmentMethod()) && s6c.m47909a(getWhatsappOptInStatus(), contact.getWhatsappOptInStatus()) && s6c.m47909a(getRecentEngagements(), contact.getRecentEngagements()) && s6c.m47909a(getRecentEngagementsUpdatedAt(), contact.getRecentEngagementsUpdatedAt()) && s6c.m47909a(getOpenTaskDetail(), contact.getOpenTaskDetail()) && s6c.m47909a(getOpenVideoCallDetail(), contact.getOpenVideoCallDetail()) && s6c.m47909a(getLastClosedTaskDetail(), contact.getLastClosedTaskDetail()) && s6c.m47909a(getLastClosedTaskDetailUpdatedAt(), contact.getLastClosedTaskDetailUpdatedAt()) && s6c.m47909a(getLatestRemark(), contact.getLatestRemark()) && s6c.m47909a(getCustomAttributes(), contact.getCustomAttributes()) && s6c.m47909a(getPaymentRequestDetail(), contact.getPaymentRequestDetail()) && s6c.m47909a(getLastPaymentStatus(), contact.getLastPaymentStatus()) && s6c.m47909a(getCustomDataAddedFromAddContactForm(), contact.getCustomDataAddedFromAddContactForm()) && s6c.m47909a(getLeadLifecycleStage(), contact.getLeadLifecycleStage()) && s6c.m47909a(getLeadLifecycleStageSubCategory(), contact.getLeadLifecycleStageSubCategory()) && s6c.m47909a(getManualClosedReason(), contact.getManualClosedReason()) && s6c.m47909a(getLastDealStageType(), contact.getLastDealStageType()) && s6c.m47909a(getProspectingAttempts(), contact.getProspectingAttempts()) && s6c.m47909a(getTotalProspectingAttemptsAcrossRechurn(), contact.getTotalProspectingAttemptsAcrossRechurn()) && s6c.m47909a(getNumberOfTimesRechurned(), contact.getNumberOfTimesRechurned()) && s6c.m47909a(getLastProspectingDoneOn(), contact.getLastProspectingDoneOn()) && s6c.m47909a(getFirstProspectingDoneOn(), contact.getFirstProspectingDoneOn()) && s6c.m47909a(getNextProspectingDueOn(), contact.getNextProspectingDueOn()) && s6c.m47909a(getNextProspectingSetBy(), contact.getNextProspectingSetBy()) && s6c.m47909a(getNextProspectingNote(), contact.getNextProspectingNote()) && s6c.m47909a(getMovedToOpportunityOn(), contact.getMovedToOpportunityOn()) && s6c.m47909a(getMovedToClosedOn(), contact.getMovedToClosedOn()) && s6c.m47909a(getCreatedAt(), contact.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), contact.getUpdatedAt());
    }

    public Account getAccount() {
        return this.account;
    }

    public String getAccountPriority() {
        return this.accountPriority;
    }

    public String getActiveDealStage() {
        return this.activeDealStage;
    }

    public Temporal.DateTime getActiveDealStageUpdatedAt() {
        return this.activeDealStageUpdatedAt;
    }

    public User getAddedBy() {
        return this.addedBy;
    }

    public String getAddedById() {
        return this.addedById;
    }

    public List<Address> getAddresses() {
        return this.addresses;
    }

    public User getAssignedTo() {
        return this.assignedTo;
    }

    public String getAssignedToId() {
        return this.assignedToId;
    }

    public String getAssignmentMethod() {
        return this.assignmentMethod;
    }

    public Temporal.DateTime getBecameCustomerOn() {
        return this.becameCustomerOn;
    }

    public User getBlockedForCallBy() {
        return this.blockedForCallBy;
    }

    public String getBlockedForCallById() {
        return this.blockedForCallById;
    }

    public String getBlockedForCallReason() {
        return this.blockedForCallReason;
    }

    public Temporal.DateTime getBlockedForCallUntil() {
        return this.blockedForCallUntil;
    }

    public String getBulkUploadReference() {
        return this.bulkUploadReference;
    }

    public List<BusinessDetail> getBusinessDetail() {
        return this.businessDetail;
    }

    public List<ContactBusinessMembership> getBusinesses() {
        return this.businesses;
    }

    public String getCallPriority() {
        return this.callPriority;
    }

    public List<ChatChannel> getChatChannels() {
        return this.chatChannels;
    }

    public List<ContactNumberDetail> getContactNumberDetail() {
        return this.contactNumberDetail;
    }

    public List<ContactNumber> getContactNumbers() {
        return this.contactNumbers;
    }

    public String getContactSource() {
        return this.contactSource;
    }

    public String getContactSourceDrillDownOne() {
        return this.contactSourceDrillDownOne;
    }

    public String getContactSourceDrillDownOneId() {
        return this.contactSourceDrillDownOneId;
    }

    public String getContactSourceDrillDownThree() {
        return this.contactSourceDrillDownThree;
    }

    public String getContactSourceDrillDownThreeId() {
        return this.contactSourceDrillDownThreeId;
    }

    public String getContactSourceDrillDownTwo() {
        return this.contactSourceDrillDownTwo;
    }

    public String getContactSourceDrillDownTwoId() {
        return this.contactSourceDrillDownTwoId;
    }

    public ContactStatus getContactStatus() {
        return this.contactStatus;
    }

    public String getContactType() {
        return this.contactType;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCustomAttributes() {
        return this.customAttributes;
    }

    public String getCustomDataAddedFromAddContactForm() {
        return this.customDataAddedFromAddContactForm;
    }

    public String getDealDescription() {
        return this.dealDescription;
    }

    public List<DealAssociation> getDeals() {
        return this.deals;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getDesignation() {
        return this.designation;
    }

    public List<Email> getEmails() {
        return this.emails;
    }

    public List<ExternalReference> getExternalReference() {
        return this.externalReference;
    }

    public Temporal.DateTime getFirstProspectingDoneOn() {
        return this.firstProspectingDoneOn;
    }

    public String getFreshLeadTag() {
        return this.freshLeadTag;
    }

    public String getGender() {
        return this.gender;
    }

    public Boolean getHasTask() {
        return this.hasTask;
    }

    public String getId() {
        return this.id;
    }

    public String getIsCustomer() {
        return this.isCustomer;
    }

    public Boolean getIsDecisionMaker() {
        return this.isDecisionMaker;
    }

    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    public CallDirection getLastCallDirection() {
        return this.lastCallDirection;
    }

    public Integer getLastCallDuration() {
        return this.lastCallDuration;
    }

    public String getLastCallEngagementId() {
        return this.lastCallEngagementId;
    }

    public String getLastCallOutcome() {
        return this.lastCallOutcome;
    }

    public String getLastCallOutcomeNature() {
        return this.lastCallOutcomeNature;
    }

    public User getLastCallUser() {
        return this.lastCallUser;
    }

    public String getLastCallUserId() {
        return this.lastCallUserId;
    }

    public Temporal.DateTime getLastCalledTime() {
        return this.lastCalledTime;
    }

    public String getLastClosedTaskDetail() {
        return this.lastClosedTaskDetail;
    }

    public Temporal.DateTime getLastClosedTaskDetailUpdatedAt() {
        return this.lastClosedTaskDetailUpdatedAt;
    }

    public String getLastDealStageType() {
        return this.lastDealStageType;
    }

    public String getLastEmailEngagementId() {
        return this.lastEmailEngagementId;
    }

    public Temporal.DateTime getLastEmailTime() {
        return this.lastEmailTime;
    }

    public User getLastEmailUser() {
        return this.lastEmailUser;
    }

    public String getLastEmailUserId() {
        return this.lastEmailUserId;
    }

    public Temporal.DateTime getLastEngagementFromAccount() {
        return this.lastEngagementFromAccount;
    }

    public Temporal.DateTime getLastEngagementFromContact() {
        return this.lastEngagementFromContact;
    }

    public String getLastKnownDisposition() {
        return this.lastKnownDisposition;
    }

    public Temporal.DateTime getLastKnownDispositionTime() {
        return this.lastKnownDispositionTime;
    }

    public Temporal.DateTime getLastLeadAssignmentDateTime() {
        return this.lastLeadAssignmentDateTime;
    }

    public Temporal.DateTime getLastNoteAddedTime() {
        return this.lastNoteAddedTime;
    }

    public String getLastNoteEngagementId() {
        return this.lastNoteEngagementId;
    }

    public User getLastNoteUser() {
        return this.lastNoteUser;
    }

    public String getLastNoteUserId() {
        return this.lastNoteUserId;
    }

    public String getLastPaymentStatus() {
        return this.lastPaymentStatus;
    }

    public Temporal.DateTime getLastProspectingDoneOn() {
        return this.lastProspectingDoneOn;
    }

    public Temporal.DateTime getLastRepeatEnquiryDate() {
        return this.lastRepeatEnquiryDate;
    }

    public String getLastRepeatEnquirySource() {
        return this.lastRepeatEnquirySource;
    }

    public String getLastSmsEngagementId() {
        return this.lastSmsEngagementId;
    }

    public Temporal.DateTime getLastSmsTime() {
        return this.lastSmsTime;
    }

    public User getLastSmsUser() {
        return this.lastSmsUser;
    }

    public String getLastSmsUserId() {
        return this.lastSmsUserId;
    }

    public String getLastTaskDoneEngagementId() {
        return this.lastTaskDoneEngagementId;
    }

    public Temporal.DateTime getLastTaskDoneTime() {
        return this.lastTaskDoneTime;
    }

    public User getLastTaskDoneUser() {
        return this.lastTaskDoneUser;
    }

    public String getLastTaskDoneUserId() {
        return this.lastTaskDoneUserId;
    }

    public String getLastVisitEngagementId() {
        return this.lastVisitEngagementId;
    }

    public String getLastVisitOutcome() {
        return this.lastVisitOutcome;
    }

    public String getLastVisitOutcomeNature() {
        return this.lastVisitOutcomeNature;
    }

    public Temporal.DateTime getLastVisitTime() {
        return this.lastVisitTime;
    }

    public User getLastVisitUser() {
        return this.lastVisitUser;
    }

    public String getLastVisitUserId() {
        return this.lastVisitUserId;
    }

    public String getLastWabaBroadcastReplyBody() {
        return this.lastWabaBroadcastReplyBody;
    }

    public Temporal.DateTime getLastWabaBroadcastReplyTime() {
        return this.lastWabaBroadcastReplyTime;
    }

    public String getLastWabaBroadcastReplyType() {
        return this.lastWabaBroadcastReplyType;
    }

    public String getLastWabaBroadcastStatus() {
        return this.lastWabaBroadcastStatus;
    }

    public String getLastWabaBroadcastTemplate() {
        return this.lastWabaBroadcastTemplate;
    }

    public Temporal.DateTime getLastWabaBroadcastTime() {
        return this.lastWabaBroadcastTime;
    }

    public String getLastWhatsappEngagementId() {
        return this.lastWhatsappEngagementId;
    }

    public Temporal.DateTime getLastWhatsappTime() {
        return this.lastWhatsappTime;
    }

    public User getLastWhatsappUser() {
        return this.lastWhatsappUser;
    }

    public String getLastWhatsappUserId() {
        return this.lastWhatsappUserId;
    }

    public String getLatestRemark() {
        return this.latestRemark;
    }

    public Integer getLeadCallsNotAnswered() {
        return this.leadCallsNotAnswered;
    }

    public LeadLifecycleStage getLeadLifecycleStage() {
        return this.leadLifecycleStage;
    }

    public LeadLifecycleStageSubCategory getLeadLifecycleStageSubCategory() {
        return this.leadLifecycleStageSubCategory;
    }

    public List<fileObjectRelationship> getLinkedFiles() {
        return this.linkedFiles;
    }

    public Temporal.DateTime getLockPeriod() {
        return this.lockPeriod;
    }

    public String getManualClosedReason() {
        return this.manualClosedReason;
    }

    public Temporal.DateTime getMovedToClosedOn() {
        return this.movedToClosedOn;
    }

    public Temporal.DateTime getMovedToOpportunityOn() {
        return this.movedToOpportunityOn;
    }

    public String getName() {
        return this.name;
    }

    public String getNeedFollowUpTag() {
        return this.needFollowUpTag;
    }

    public Temporal.DateTime getNeedFollowUpTagUpdatedAt() {
        return this.needFollowUpTagUpdatedAt;
    }

    public Temporal.DateTime getNextProspectingDueOn() {
        return this.nextProspectingDueOn;
    }

    public String getNextProspectingNote() {
        return this.nextProspectingNote;
    }

    public String getNextProspectingSetBy() {
        return this.nextProspectingSetBy;
    }

    public String getNoWorkAfterAssignment() {
        return this.noWorkAfterAssignment;
    }

    public Integer getNumberOfTimesRechurned() {
        return this.numberOfTimesRechurned;
    }

    public TaskActivityType getOpenTaskActivityType() {
        return this.openTaskActivityType;
    }

    public Integer getOpenTaskCount() {
        return this.openTaskCount;
    }

    public String getOpenTaskDetail() {
        return this.openTaskDetail;
    }

    public String getOpenVideoCallDetail() {
        return this.openVideoCallDetail;
    }

    public User getOwner() {
        return this.owner;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getPaymentRequestDetail() {
        return this.paymentRequestDetail;
    }

    public List<Day> getPreferredContactDays() {
        return this.preferredContactDays;
    }

    public Team getPrimaryTeam() {
        return this.primaryTeam;
    }

    public String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public List<String> getProductService() {
        return this.productService;
    }

    public String getProfilePhotoUrl() {
        return this.profilePhotoUrl;
    }

    public Integer getProspectingAttempts() {
        return this.prospectingAttempts;
    }

    public List<String> getRecentEngagements() {
        return this.recentEngagements;
    }

    public Temporal.DateTime getRecentEngagementsUpdatedAt() {
        return this.recentEngagementsUpdatedAt;
    }

    public String getReferredBy() {
        return this.referredBy;
    }

    public String getSalutation() {
        return this.salutation;
    }

    public Seniority getSeniority() {
        return this.seniority;
    }

    public List<String> getSharedOwners() {
        return this.sharedOwners;
    }

    public List<String> getSharedTeams() {
        return this.sharedTeams;
    }

    public ContactAssignmentStatus getToBeAssigned() {
        return this.toBeAssigned;
    }

    public Integer getTotalProspectingAttemptsAcrossRechurn() {
        return this.totalProspectingAttemptsAcrossRechurn;
    }

    public Integer getUnsuccessfulCallAttempts() {
        return this.unsuccessfulCallAttempts;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public User getUpdatedBy() {
        return this.updatedBy;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public List<String> getUserDefinedTags() {
        return this.userDefinedTags;
    }

    public String getWaChatChannelId() {
        return this.waChatChannelId;
    }

    public String getWhatsappOptInStatus() {
        return this.whatsappOptInStatus;
    }

    public int hashCode() {
        return (getId() + getAccount() + getOwnerId() + getToBeAssigned() + getSharedOwners() + getPrimaryTeamId() + getSharedTeams() + getAccountPriority() + getAddedById() + getAddresses() + getAssignedToId() + getBlockedForCallById() + getBlockedForCallReason() + getBlockedForCallUntil() + getCallPriority() + getWaChatChannelId() + getContactNumberDetail() + getBusinessDetail() + getContactSource() + getContactSourceDrillDownOne() + getContactSourceDrillDownTwo() + getContactSourceDrillDownThree() + getContactSourceDrillDownOneId() + getContactSourceDrillDownTwoId() + getContactSourceDrillDownThreeId() + getContactStatus() + getContactType() + getDepartment() + getDesignation() + getEmails() + getLastRepeatEnquiryDate() + getLastRepeatEnquirySource() + getExternalReference() + getGender() + getIsDecisionMaker() + getIsPrivate() + getLockPeriod() + getName() + getPreferredContactDays() + getProfilePhotoUrl() + getReferredBy() + getSalutation() + getSeniority() + getUpdatedById() + getHasTask() + getOpenTaskActivityType() + getLastCalledTime() + getLastCallDirection() + getLastCallOutcome() + getLastCallOutcomeNature() + getLastCallUserId() + getLastCallDuration() + getLastCallEngagementId() + getLastVisitTime() + getLastVisitOutcome() + getLastVisitOutcomeNature() + getLastVisitUserId() + getLastVisitEngagementId() + getLastEmailTime() + getLastEmailUserId() + getLastEmailEngagementId() + getLastWhatsappTime() + getLastWhatsappUserId() + getLastWhatsappEngagementId() + getLastWabaBroadcastTime() + getLastWabaBroadcastStatus() + getLastWabaBroadcastTemplate() + getLastWabaBroadcastReplyBody() + getLastWabaBroadcastReplyTime() + getLastWabaBroadcastReplyType() + getLastSmsTime() + getLastSmsUserId() + getLastSmsEngagementId() + getLastNoteAddedTime() + getLastNoteUserId() + getLastNoteEngagementId() + getLastTaskDoneTime() + getLastTaskDoneUserId() + getLastTaskDoneEngagementId() + getOpenTaskCount() + getLastKnownDisposition() + getLastKnownDispositionTime() + getLastLeadAssignmentDateTime() + getLastEngagementFromAccount() + getLastEngagementFromContact() + getFreshLeadTag() + getNoWorkAfterAssignment() + getNeedFollowUpTag() + getNeedFollowUpTagUpdatedAt() + getActiveDealStage() + getActiveDealStageUpdatedAt() + getDealDescription() + getIsCustomer() + getBecameCustomerOn() + getUnsuccessfulCallAttempts() + getLeadCallsNotAnswered() + getUserDefinedTags() + getProductService() + getBulkUploadReference() + getAssignmentMethod() + getWhatsappOptInStatus() + getRecentEngagements() + getRecentEngagementsUpdatedAt() + getOpenTaskDetail() + getOpenVideoCallDetail() + getLastClosedTaskDetail() + getLastClosedTaskDetailUpdatedAt() + getLatestRemark() + getCustomAttributes() + getPaymentRequestDetail() + getLastPaymentStatus() + getCustomDataAddedFromAddContactForm() + getLeadLifecycleStage() + getLeadLifecycleStageSubCategory() + getManualClosedReason() + getLastDealStageType() + getProspectingAttempts() + getTotalProspectingAttemptsAcrossRechurn() + getNumberOfTimesRechurned() + getLastProspectingDoneOn() + getFirstProspectingDoneOn() + getNextProspectingDueOn() + getNextProspectingSetBy() + getNextProspectingNote() + getMovedToOpportunityOn() + getMovedToClosedOn() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contact {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("account=" + String.valueOf(getAccount()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("toBeAssigned=" + String.valueOf(getToBeAssigned()) + ", ");
        sb.append("sharedOwners=" + String.valueOf(getSharedOwners()) + ", ");
        sb.append("primaryTeamId=" + String.valueOf(getPrimaryTeamId()) + ", ");
        sb.append("sharedTeams=" + String.valueOf(getSharedTeams()) + ", ");
        sb.append("accountPriority=" + String.valueOf(getAccountPriority()) + ", ");
        sb.append("addedById=" + String.valueOf(getAddedById()) + ", ");
        sb.append("addresses=" + String.valueOf(getAddresses()) + ", ");
        sb.append("assignedToId=" + String.valueOf(getAssignedToId()) + ", ");
        sb.append("blockedForCallById=" + String.valueOf(getBlockedForCallById()) + ", ");
        sb.append("blockedForCallReason=" + String.valueOf(getBlockedForCallReason()) + ", ");
        sb.append("blockedForCallUntil=" + String.valueOf(getBlockedForCallUntil()) + ", ");
        sb.append("callPriority=" + String.valueOf(getCallPriority()) + ", ");
        sb.append("waChatChannelId=" + String.valueOf(getWaChatChannelId()) + ", ");
        sb.append("contactNumberDetail=" + String.valueOf(getContactNumberDetail()) + ", ");
        sb.append("businessDetail=" + String.valueOf(getBusinessDetail()) + ", ");
        sb.append("contactSource=" + String.valueOf(getContactSource()) + ", ");
        sb.append("contactSourceDrillDownOne=" + String.valueOf(getContactSourceDrillDownOne()) + ", ");
        sb.append("contactSourceDrillDownTwo=" + String.valueOf(getContactSourceDrillDownTwo()) + ", ");
        sb.append("contactSourceDrillDownThree=" + String.valueOf(getContactSourceDrillDownThree()) + ", ");
        sb.append("contactSourceDrillDownOneId=" + String.valueOf(getContactSourceDrillDownOneId()) + ", ");
        sb.append("contactSourceDrillDownTwoId=" + String.valueOf(getContactSourceDrillDownTwoId()) + ", ");
        sb.append("contactSourceDrillDownThreeId=" + String.valueOf(getContactSourceDrillDownThreeId()) + ", ");
        sb.append("contactStatus=" + String.valueOf(getContactStatus()) + ", ");
        sb.append("contactType=" + String.valueOf(getContactType()) + ", ");
        sb.append("department=" + String.valueOf(getDepartment()) + ", ");
        sb.append("designation=" + String.valueOf(getDesignation()) + ", ");
        sb.append("emails=" + String.valueOf(getEmails()) + ", ");
        sb.append("lastRepeatEnquiryDate=" + String.valueOf(getLastRepeatEnquiryDate()) + ", ");
        sb.append("lastRepeatEnquirySource=" + String.valueOf(getLastRepeatEnquirySource()) + ", ");
        sb.append("externalReference=" + String.valueOf(getExternalReference()) + ", ");
        sb.append("gender=" + String.valueOf(getGender()) + ", ");
        sb.append("isDecisionMaker=" + String.valueOf(getIsDecisionMaker()) + ", ");
        sb.append("isPrivate=" + String.valueOf(getIsPrivate()) + ", ");
        sb.append("lockPeriod=" + String.valueOf(getLockPeriod()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("preferredContactDays=" + String.valueOf(getPreferredContactDays()) + ", ");
        sb.append("profilePhotoUrl=" + String.valueOf(getProfilePhotoUrl()) + ", ");
        sb.append("referredBy=" + String.valueOf(getReferredBy()) + ", ");
        sb.append("salutation=" + String.valueOf(getSalutation()) + ", ");
        sb.append("seniority=" + String.valueOf(getSeniority()) + ", ");
        sb.append("updatedById=" + String.valueOf(getUpdatedById()) + ", ");
        sb.append("hasTask=" + String.valueOf(getHasTask()) + ", ");
        sb.append("openTaskActivityType=" + String.valueOf(getOpenTaskActivityType()) + ", ");
        sb.append("lastCalledTime=" + String.valueOf(getLastCalledTime()) + ", ");
        sb.append("lastCallDirection=" + String.valueOf(getLastCallDirection()) + ", ");
        sb.append("lastCallOutcome=" + String.valueOf(getLastCallOutcome()) + ", ");
        sb.append("lastCallOutcomeNature=" + String.valueOf(getLastCallOutcomeNature()) + ", ");
        sb.append("lastCallUserId=" + String.valueOf(getLastCallUserId()) + ", ");
        sb.append("lastCallDuration=" + String.valueOf(getLastCallDuration()) + ", ");
        sb.append("lastCallEngagementId=" + String.valueOf(getLastCallEngagementId()) + ", ");
        sb.append("lastVisitTime=" + String.valueOf(getLastVisitTime()) + ", ");
        sb.append("lastVisitOutcome=" + String.valueOf(getLastVisitOutcome()) + ", ");
        sb.append("lastVisitOutcomeNature=" + String.valueOf(getLastVisitOutcomeNature()) + ", ");
        sb.append("lastVisitUserId=" + String.valueOf(getLastVisitUserId()) + ", ");
        sb.append("lastVisitEngagementId=" + String.valueOf(getLastVisitEngagementId()) + ", ");
        sb.append("lastEmailTime=" + String.valueOf(getLastEmailTime()) + ", ");
        sb.append("lastEmailUserId=" + String.valueOf(getLastEmailUserId()) + ", ");
        sb.append("lastEmailEngagementId=" + String.valueOf(getLastEmailEngagementId()) + ", ");
        sb.append("lastWhatsappTime=" + String.valueOf(getLastWhatsappTime()) + ", ");
        sb.append("lastWhatsappUserId=" + String.valueOf(getLastWhatsappUserId()) + ", ");
        sb.append("lastWhatsappEngagementId=" + String.valueOf(getLastWhatsappEngagementId()) + ", ");
        sb.append("lastWabaBroadcastTime=" + String.valueOf(getLastWabaBroadcastTime()) + ", ");
        sb.append("lastWabaBroadcastStatus=" + String.valueOf(getLastWabaBroadcastStatus()) + ", ");
        sb.append("lastWabaBroadcastTemplate=" + String.valueOf(getLastWabaBroadcastTemplate()) + ", ");
        sb.append("lastWabaBroadcastReplyBody=" + String.valueOf(getLastWabaBroadcastReplyBody()) + ", ");
        sb.append("lastWabaBroadcastReplyTime=" + String.valueOf(getLastWabaBroadcastReplyTime()) + ", ");
        sb.append("lastWabaBroadcastReplyType=" + String.valueOf(getLastWabaBroadcastReplyType()) + ", ");
        sb.append("lastSmsTime=" + String.valueOf(getLastSmsTime()) + ", ");
        sb.append("lastSmsUserId=" + String.valueOf(getLastSmsUserId()) + ", ");
        sb.append("lastSmsEngagementId=" + String.valueOf(getLastSmsEngagementId()) + ", ");
        sb.append("lastNoteAddedTime=" + String.valueOf(getLastNoteAddedTime()) + ", ");
        sb.append("lastNoteUserId=" + String.valueOf(getLastNoteUserId()) + ", ");
        sb.append("lastNoteEngagementId=" + String.valueOf(getLastNoteEngagementId()) + ", ");
        sb.append("lastTaskDoneTime=" + String.valueOf(getLastTaskDoneTime()) + ", ");
        sb.append("lastTaskDoneUserId=" + String.valueOf(getLastTaskDoneUserId()) + ", ");
        sb.append("lastTaskDoneEngagementId=" + String.valueOf(getLastTaskDoneEngagementId()) + ", ");
        sb.append("openTaskCount=" + String.valueOf(getOpenTaskCount()) + ", ");
        sb.append("lastKnownDisposition=" + String.valueOf(getLastKnownDisposition()) + ", ");
        sb.append("lastKnownDispositionTime=" + String.valueOf(getLastKnownDispositionTime()) + ", ");
        sb.append("lastLeadAssignmentDateTime=" + String.valueOf(getLastLeadAssignmentDateTime()) + ", ");
        sb.append("lastEngagementFromAccount=" + String.valueOf(getLastEngagementFromAccount()) + ", ");
        sb.append("lastEngagementFromContact=" + String.valueOf(getLastEngagementFromContact()) + ", ");
        sb.append("freshLeadTag=" + String.valueOf(getFreshLeadTag()) + ", ");
        sb.append("noWorkAfterAssignment=" + String.valueOf(getNoWorkAfterAssignment()) + ", ");
        sb.append("needFollowUpTag=" + String.valueOf(getNeedFollowUpTag()) + ", ");
        sb.append("needFollowUpTagUpdatedAt=" + String.valueOf(getNeedFollowUpTagUpdatedAt()) + ", ");
        sb.append("activeDealStage=" + String.valueOf(getActiveDealStage()) + ", ");
        sb.append("activeDealStageUpdatedAt=" + String.valueOf(getActiveDealStageUpdatedAt()) + ", ");
        sb.append("dealDescription=" + String.valueOf(getDealDescription()) + ", ");
        sb.append("isCustomer=" + String.valueOf(getIsCustomer()) + ", ");
        sb.append("becameCustomerOn=" + String.valueOf(getBecameCustomerOn()) + ", ");
        sb.append("unsuccessfulCallAttempts=" + String.valueOf(getUnsuccessfulCallAttempts()) + ", ");
        sb.append("leadCallsNotAnswered=" + String.valueOf(getLeadCallsNotAnswered()) + ", ");
        sb.append("userDefinedTags=" + String.valueOf(getUserDefinedTags()) + ", ");
        sb.append("productService=" + String.valueOf(getProductService()) + ", ");
        sb.append("bulkUploadReference=" + String.valueOf(getBulkUploadReference()) + ", ");
        sb.append("assignmentMethod=" + String.valueOf(getAssignmentMethod()) + ", ");
        sb.append("whatsappOptInStatus=" + String.valueOf(getWhatsappOptInStatus()) + ", ");
        sb.append("recentEngagements=" + String.valueOf(getRecentEngagements()) + ", ");
        sb.append("recentEngagementsUpdatedAt=" + String.valueOf(getRecentEngagementsUpdatedAt()) + ", ");
        sb.append("openTaskDetail=" + String.valueOf(getOpenTaskDetail()) + ", ");
        sb.append("openVideoCallDetail=" + String.valueOf(getOpenVideoCallDetail()) + ", ");
        sb.append("lastClosedTaskDetail=" + String.valueOf(getLastClosedTaskDetail()) + ", ");
        sb.append("lastClosedTaskDetailUpdatedAt=" + String.valueOf(getLastClosedTaskDetailUpdatedAt()) + ", ");
        sb.append("latestRemark=" + String.valueOf(getLatestRemark()) + ", ");
        sb.append("customAttributes=" + String.valueOf(getCustomAttributes()) + ", ");
        sb.append("paymentRequestDetail=" + String.valueOf(getPaymentRequestDetail()) + ", ");
        sb.append("lastPaymentStatus=" + String.valueOf(getLastPaymentStatus()) + ", ");
        sb.append("customDataAddedFromAddContactForm=" + String.valueOf(getCustomDataAddedFromAddContactForm()) + ", ");
        sb.append("leadLifecycleStage=" + String.valueOf(getLeadLifecycleStage()) + ", ");
        sb.append("leadLifecycleStageSubCategory=" + String.valueOf(getLeadLifecycleStageSubCategory()) + ", ");
        sb.append("manualClosedReason=" + String.valueOf(getManualClosedReason()) + ", ");
        sb.append("lastDealStageType=" + String.valueOf(getLastDealStageType()) + ", ");
        sb.append("prospectingAttempts=" + String.valueOf(getProspectingAttempts()) + ", ");
        sb.append("totalProspectingAttemptsAcrossRechurn=" + String.valueOf(getTotalProspectingAttemptsAcrossRechurn()) + ", ");
        sb.append("numberOfTimesRechurned=" + String.valueOf(getNumberOfTimesRechurned()) + ", ");
        sb.append("lastProspectingDoneOn=" + String.valueOf(getLastProspectingDoneOn()) + ", ");
        sb.append("firstProspectingDoneOn=" + String.valueOf(getFirstProspectingDoneOn()) + ", ");
        sb.append("nextProspectingDueOn=" + String.valueOf(getNextProspectingDueOn()) + ", ");
        sb.append("nextProspectingSetBy=" + String.valueOf(getNextProspectingSetBy()) + ", ");
        sb.append("nextProspectingNote=" + String.valueOf(getNextProspectingNote()) + ", ");
        sb.append("movedToOpportunityOn=" + String.valueOf(getMovedToOpportunityOn()) + ", ");
        sb.append("movedToClosedOn=" + String.valueOf(getMovedToClosedOn()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private Contact(String str, Account account, String str2, ContactAssignmentStatus contactAssignmentStatus, List<String> list, String str3, List<String> list2, String str4, String str5, List<Address> list3, String str6, String str7, String str8, Temporal.DateTime dateTime, String str9, String str10, List<ContactNumberDetail> list4, List<BusinessDetail> list5, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ContactStatus contactStatus, String str18, String str19, String str20, List<Email> list6, Temporal.DateTime dateTime2, String str21, List<ExternalReference> list7, String str22, Boolean bool, Boolean bool2, Temporal.DateTime dateTime3, String str23, List<Day> list8, String str24, String str25, String str26, Seniority seniority, String str27, Boolean bool3, TaskActivityType taskActivityType, Temporal.DateTime dateTime4, CallDirection callDirection, String str28, String str29, String str30, Integer num, String str31, Temporal.DateTime dateTime5, String str32, String str33, String str34, String str35, Temporal.DateTime dateTime6, String str36, String str37, Temporal.DateTime dateTime7, String str38, String str39, Temporal.DateTime dateTime8, String str40, String str41, String str42, Temporal.DateTime dateTime9, String str43, Temporal.DateTime dateTime10, String str44, String str45, Temporal.DateTime dateTime11, String str46, String str47, Temporal.DateTime dateTime12, String str48, String str49, Integer num2, String str50, Temporal.DateTime dateTime13, Temporal.DateTime dateTime14, Temporal.DateTime dateTime15, Temporal.DateTime dateTime16, String str51, String str52, String str53, Temporal.DateTime dateTime17, String str54, Temporal.DateTime dateTime18, String str55, String str56, Temporal.DateTime dateTime19, Integer num3, Integer num4, List<String> list9, List<String> list10, String str57, String str58, String str59, List<String> list11, Temporal.DateTime dateTime20, String str60, String str61, String str62, Temporal.DateTime dateTime21, String str63, String str64, String str65, String str66, String str67, LeadLifecycleStage leadLifecycleStage, LeadLifecycleStageSubCategory leadLifecycleStageSubCategory, String str68, String str69, Integer num5, Integer num6, Integer num7, Temporal.DateTime dateTime22, Temporal.DateTime dateTime23, Temporal.DateTime dateTime24, String str70, String str71, Temporal.DateTime dateTime25, Temporal.DateTime dateTime26, Temporal.DateTime dateTime27, Temporal.DateTime dateTime28) {
        this.owner = null;
        this.primaryTeam = null;
        this.addedBy = null;
        this.assignedTo = null;
        this.blockedForCallBy = null;
        this.contactNumbers = null;
        this.chatChannels = null;
        this.linkedFiles = null;
        this.businesses = null;
        this.deals = null;
        this.updatedBy = null;
        this.lastCallUser = null;
        this.lastVisitUser = null;
        this.lastEmailUser = null;
        this.lastWhatsappUser = null;
        this.lastSmsUser = null;
        this.lastNoteUser = null;
        this.lastTaskDoneUser = null;
        this.id = str;
        this.account = account;
        this.ownerId = str2;
        this.toBeAssigned = contactAssignmentStatus;
        this.sharedOwners = list;
        this.primaryTeamId = str3;
        this.sharedTeams = list2;
        this.accountPriority = str4;
        this.addedById = str5;
        this.addresses = list3;
        this.assignedToId = str6;
        this.blockedForCallById = str7;
        this.blockedForCallReason = str8;
        this.blockedForCallUntil = dateTime;
        this.callPriority = str9;
        this.waChatChannelId = str10;
        this.contactNumberDetail = list4;
        this.businessDetail = list5;
        this.contactSource = str11;
        this.contactSourceDrillDownOne = str12;
        this.contactSourceDrillDownTwo = str13;
        this.contactSourceDrillDownThree = str14;
        this.contactSourceDrillDownOneId = str15;
        this.contactSourceDrillDownTwoId = str16;
        this.contactSourceDrillDownThreeId = str17;
        this.contactStatus = contactStatus;
        this.contactType = str18;
        this.department = str19;
        this.designation = str20;
        this.emails = list6;
        this.lastRepeatEnquiryDate = dateTime2;
        this.lastRepeatEnquirySource = str21;
        this.externalReference = list7;
        this.gender = str22;
        this.isDecisionMaker = bool;
        this.isPrivate = bool2;
        this.lockPeriod = dateTime3;
        this.name = str23;
        this.preferredContactDays = list8;
        this.profilePhotoUrl = str24;
        this.referredBy = str25;
        this.salutation = str26;
        this.seniority = seniority;
        this.updatedById = str27;
        this.hasTask = bool3;
        this.openTaskActivityType = taskActivityType;
        this.lastCalledTime = dateTime4;
        this.lastCallDirection = callDirection;
        this.lastCallOutcome = str28;
        this.lastCallOutcomeNature = str29;
        this.lastCallUserId = str30;
        this.lastCallDuration = num;
        this.lastCallEngagementId = str31;
        this.lastVisitTime = dateTime5;
        this.lastVisitOutcome = str32;
        this.lastVisitOutcomeNature = str33;
        this.lastVisitUserId = str34;
        this.lastVisitEngagementId = str35;
        this.lastEmailTime = dateTime6;
        this.lastEmailUserId = str36;
        this.lastEmailEngagementId = str37;
        this.lastWhatsappTime = dateTime7;
        this.lastWhatsappUserId = str38;
        this.lastWhatsappEngagementId = str39;
        this.lastWabaBroadcastTime = dateTime8;
        this.lastWabaBroadcastStatus = str40;
        this.lastWabaBroadcastTemplate = str41;
        this.lastWabaBroadcastReplyBody = str42;
        this.lastWabaBroadcastReplyTime = dateTime9;
        this.lastWabaBroadcastReplyType = str43;
        this.lastSmsTime = dateTime10;
        this.lastSmsUserId = str44;
        this.lastSmsEngagementId = str45;
        this.lastNoteAddedTime = dateTime11;
        this.lastNoteUserId = str46;
        this.lastNoteEngagementId = str47;
        this.lastTaskDoneTime = dateTime12;
        this.lastTaskDoneUserId = str48;
        this.lastTaskDoneEngagementId = str49;
        this.openTaskCount = num2;
        this.lastKnownDisposition = str50;
        this.lastKnownDispositionTime = dateTime13;
        this.lastLeadAssignmentDateTime = dateTime14;
        this.lastEngagementFromAccount = dateTime15;
        this.lastEngagementFromContact = dateTime16;
        this.freshLeadTag = str51;
        this.noWorkAfterAssignment = str52;
        this.needFollowUpTag = str53;
        this.needFollowUpTagUpdatedAt = dateTime17;
        this.activeDealStage = str54;
        this.activeDealStageUpdatedAt = dateTime18;
        this.dealDescription = str55;
        this.isCustomer = str56;
        this.becameCustomerOn = dateTime19;
        this.unsuccessfulCallAttempts = num3;
        this.leadCallsNotAnswered = num4;
        this.userDefinedTags = list9;
        this.productService = list10;
        this.bulkUploadReference = str57;
        this.assignmentMethod = str58;
        this.whatsappOptInStatus = str59;
        this.recentEngagements = list11;
        this.recentEngagementsUpdatedAt = dateTime20;
        this.openTaskDetail = str60;
        this.openVideoCallDetail = str61;
        this.lastClosedTaskDetail = str62;
        this.lastClosedTaskDetailUpdatedAt = dateTime21;
        this.latestRemark = str63;
        this.customAttributes = str64;
        this.paymentRequestDetail = str65;
        this.lastPaymentStatus = str66;
        this.customDataAddedFromAddContactForm = str67;
        this.leadLifecycleStage = leadLifecycleStage;
        this.leadLifecycleStageSubCategory = leadLifecycleStageSubCategory;
        this.manualClosedReason = str68;
        this.lastDealStageType = str69;
        this.prospectingAttempts = num5;
        this.totalProspectingAttemptsAcrossRechurn = num6;
        this.numberOfTimesRechurned = num7;
        this.lastProspectingDoneOn = dateTime22;
        this.firstProspectingDoneOn = dateTime23;
        this.nextProspectingDueOn = dateTime24;
        this.nextProspectingSetBy = str70;
        this.nextProspectingNote = str71;
        this.movedToOpportunityOn = dateTime25;
        this.movedToClosedOn = dateTime26;
        this.createdAt = dateTime27;
        this.updatedAt = dateTime28;
    }
}
