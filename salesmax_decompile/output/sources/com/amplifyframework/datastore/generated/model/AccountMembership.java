package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "userId"}, name = "usersByAccount"), @Index(fields = {"userId", "userAccountStatus"}, name = "accountsByUser")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.UPDATE})}, pluralName = "AccountMemberships")
/* loaded from: classes5.dex */
public final class AccountMembership implements Model {

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime acceptedOn;

    @BelongsTo(targetName = "accountId", type = Account.class)
    @ModelField(targetType = "Account")
    private final Account account;

    @ModelField(targetType = "AWSEmail")
    private final String accountEmail;

    @ModelField(targetType = "Boolean")
    private final Boolean accountEmailVerified;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User addedBy;

    @ModelField(targetType = "ID")
    private final String addedById;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime addedOn;

    @ModelField(targetType = "String")
    private final List<String> allowedDeviceId;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User approvedBy;

    @ModelField(targetType = "ID")
    private final String approvedById;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime approvedOn;

    @ModelField(isRequired = true, targetType = "AuthorizationLevel")
    private final AuthorizationLevel authorizationLevel;

    @ModelField(targetType = "String")
    private final String canCreateWaCampaigns;

    @ModelField(targetType = "String")
    private final String canInitiateNewConversation;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "AWSJSON")
    private final String customMemberAttributes;

    @ModelField(targetType = "String")
    private final String designation;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean isBillingMember;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastViewedChatNotification;

    @ModelField(isRequired = true, targetType = "Boolean")
    private final Boolean mapRegisteredMobileNumberToAccount;

    @ModelField(isRequired = true, targetType = "Boolean")
    private final Boolean mapSecondaryMobileNumberToAccount;

    @ModelField(targetType = "ID")
    private final String migrateToUserIdOnRemoval;

    @ModelField(targetType = "NotificationPreferences")
    private final List<NotificationPreferences> notificationPreferences;

    @ModelField(targetType = "Boolean")
    private final Boolean onLeave;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime onLeaveTill;

    @ModelField(targetType = "Int")
    private final Integer prefDefaultSimToCall;

    @ModelField(targetType = "Boolean")
    private final Boolean prefPostCallDisposition;

    @ModelField(targetType = "AWSJSON")
    private final String prefReadOnlyInfo;

    @ModelField(targetType = "Boolean")
    private final Boolean prefSaveBusinessCall;

    @ModelField(targetType = "Boolean")
    private final Boolean prefScreenPop;

    @ModelField(targetType = "Boolean")
    private final Boolean prefTrackAllCalls;

    @ModelField(targetType = "Int")
    private final Integer prefTrackAllCallsSpecificSim;

    @ModelField(targetType = "Boolean")
    private final Boolean prefTrackLocationOnActivity;

    @ModelField(targetType = "Boolean")
    private final Boolean prefUseBusinessWhatsapp;

    @ModelField(targetType = "String")
    private final String sharedInboxPermission;

    @ModelField(targetType = "String")
    private final String signature;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User updatedBy;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User user;

    @ModelField(isRequired = true, targetType = "UserStatus")
    private final UserStatus userAccountStatus;

    @ModelField(isRequired = true, targetType = "ID")
    private final String userId;

    @ModelField(targetType = "String")
    private final String whatsappApiAccess;
    public static final QueryField ID = QueryField.field("AccountMembership", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT = QueryField.field("AccountMembership", "accountId");
    public static final QueryField USER_ID = QueryField.field("AccountMembership", "userId");
    public static final QueryField ALLOWED_DEVICE_ID = QueryField.field("AccountMembership", "allowedDeviceId");
    public static final QueryField DESIGNATION = QueryField.field("AccountMembership", "designation");
    public static final QueryField AUTHORIZATION_LEVEL = QueryField.field("AccountMembership", "authorizationLevel");
    public static final QueryField SIGNATURE = QueryField.field("AccountMembership", "signature");
    public static final QueryField IS_BILLING_MEMBER = QueryField.field("AccountMembership", "isBillingMember");
    public static final QueryField ADDED_BY_ID = QueryField.field("AccountMembership", "addedById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("AccountMembership", "updatedById");
    public static final QueryField ADDED_ON = QueryField.field("AccountMembership", "addedOn");
    public static final QueryField APPROVED_BY_ID = QueryField.field("AccountMembership", "approvedById");
    public static final QueryField APPROVED_ON = QueryField.field("AccountMembership", "approvedOn");
    public static final QueryField ACCEPTED_ON = QueryField.field("AccountMembership", "acceptedOn");
    public static final QueryField USER_ACCOUNT_STATUS = QueryField.field("AccountMembership", "userAccountStatus");
    public static final QueryField WHATSAPP_API_ACCESS = QueryField.field("AccountMembership", "whatsappApiAccess");
    public static final QueryField SHARED_INBOX_PERMISSION = QueryField.field("AccountMembership", "sharedInboxPermission");
    public static final QueryField CAN_INITIATE_NEW_CONVERSATION = QueryField.field("AccountMembership", "canInitiateNewConversation");
    public static final QueryField CAN_CREATE_WA_CAMPAIGNS = QueryField.field("AccountMembership", "canCreateWaCampaigns");
    public static final QueryField MAP_REGISTERED_MOBILE_NUMBER_TO_ACCOUNT = QueryField.field("AccountMembership", "mapRegisteredMobileNumberToAccount");
    public static final QueryField MAP_SECONDARY_MOBILE_NUMBER_TO_ACCOUNT = QueryField.field("AccountMembership", "mapSecondaryMobileNumberToAccount");
    public static final QueryField ACCOUNT_EMAIL = QueryField.field("AccountMembership", "accountEmail");
    public static final QueryField ACCOUNT_EMAIL_VERIFIED = QueryField.field("AccountMembership", "accountEmailVerified");
    public static final QueryField NOTIFICATION_PREFERENCES = QueryField.field("AccountMembership", "notificationPreferences");
    public static final QueryField MIGRATE_TO_USER_ID_ON_REMOVAL = QueryField.field("AccountMembership", "migrateToUserIdOnRemoval");
    public static final QueryField PREF_SCREEN_POP = QueryField.field("AccountMembership", "prefScreenPop");
    public static final QueryField PREF_SAVE_BUSINESS_CALL = QueryField.field("AccountMembership", "prefSaveBusinessCall");
    public static final QueryField PREF_POST_CALL_DISPOSITION = QueryField.field("AccountMembership", "prefPostCallDisposition");
    public static final QueryField PREF_DEFAULT_SIM_TO_CALL = QueryField.field("AccountMembership", "prefDefaultSimToCall");
    public static final QueryField PREF_TRACK_LOCATION_ON_ACTIVITY = QueryField.field("AccountMembership", "prefTrackLocationOnActivity");
    public static final QueryField PREF_USE_BUSINESS_WHATSAPP = QueryField.field("AccountMembership", "prefUseBusinessWhatsapp");
    public static final QueryField PREF_TRACK_ALL_CALLS = QueryField.field("AccountMembership", "prefTrackAllCalls");
    public static final QueryField PREF_TRACK_ALL_CALLS_SPECIFIC_SIM = QueryField.field("AccountMembership", "prefTrackAllCallsSpecificSim");
    public static final QueryField ON_LEAVE = QueryField.field("AccountMembership", "onLeave");
    public static final QueryField ON_LEAVE_TILL = QueryField.field("AccountMembership", "onLeaveTill");
    public static final QueryField LAST_VIEWED_CHAT_NOTIFICATION = QueryField.field("AccountMembership", "lastViewedChatNotification");
    public static final QueryField PREF_READ_ONLY_INFO = QueryField.field("AccountMembership", "prefReadOnlyInfo");
    public static final QueryField CUSTOM_MEMBER_ATTRIBUTES = QueryField.field("AccountMembership", "customMemberAttributes");
    public static final QueryField CREATED_AT = QueryField.field("AccountMembership", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("AccountMembership", "updatedAt");

    public interface AuthorizationLevelStep {
        UserAccountStatusStep authorizationLevel(AuthorizationLevel authorizationLevel);
    }

    public interface BuildStep {
        BuildStep acceptedOn(Temporal.DateTime dateTime);

        BuildStep account(Account account);

        BuildStep accountEmail(String str);

        BuildStep accountEmailVerified(Boolean bool);

        BuildStep addedById(String str);

        BuildStep addedOn(Temporal.DateTime dateTime);

        BuildStep allowedDeviceId(List<String> list);

        BuildStep approvedById(String str);

        BuildStep approvedOn(Temporal.DateTime dateTime);

        AccountMembership build();

        BuildStep canCreateWaCampaigns(String str);

        BuildStep canInitiateNewConversation(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep customMemberAttributes(String str);

        BuildStep designation(String str);

        BuildStep id(String str);

        BuildStep isBillingMember(Boolean bool);

        BuildStep lastViewedChatNotification(Temporal.DateTime dateTime);

        BuildStep migrateToUserIdOnRemoval(String str);

        BuildStep notificationPreferences(List<NotificationPreferences> list);

        BuildStep onLeave(Boolean bool);

        BuildStep onLeaveTill(Temporal.DateTime dateTime);

        BuildStep prefDefaultSimToCall(Integer num);

        BuildStep prefPostCallDisposition(Boolean bool);

        BuildStep prefReadOnlyInfo(String str);

        BuildStep prefSaveBusinessCall(Boolean bool);

        BuildStep prefScreenPop(Boolean bool);

        BuildStep prefTrackAllCalls(Boolean bool);

        BuildStep prefTrackAllCallsSpecificSim(Integer num);

        BuildStep prefTrackLocationOnActivity(Boolean bool);

        BuildStep prefUseBusinessWhatsapp(Boolean bool);

        BuildStep sharedInboxPermission(String str);

        BuildStep signature(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);

        BuildStep whatsappApiAccess(String str);
    }

    public static class Builder implements UserIdStep, AuthorizationLevelStep, UserAccountStatusStep, MapRegisteredMobileNumberToAccountStep, MapSecondaryMobileNumberToAccountStep, BuildStep {
        private Temporal.DateTime acceptedOn;
        private Account account;
        private String accountEmail;
        private Boolean accountEmailVerified;
        private String addedById;
        private Temporal.DateTime addedOn;
        private List<String> allowedDeviceId;
        private String approvedById;
        private Temporal.DateTime approvedOn;
        private AuthorizationLevel authorizationLevel;
        private String canCreateWaCampaigns;
        private String canInitiateNewConversation;
        private Temporal.DateTime createdAt;
        private String customMemberAttributes;
        private String designation;
        private String id;
        private Boolean isBillingMember;
        private Temporal.DateTime lastViewedChatNotification;
        private Boolean mapRegisteredMobileNumberToAccount;
        private Boolean mapSecondaryMobileNumberToAccount;
        private String migrateToUserIdOnRemoval;
        private List<NotificationPreferences> notificationPreferences;
        private Boolean onLeave;
        private Temporal.DateTime onLeaveTill;
        private Integer prefDefaultSimToCall;
        private Boolean prefPostCallDisposition;
        private String prefReadOnlyInfo;
        private Boolean prefSaveBusinessCall;
        private Boolean prefScreenPop;
        private Boolean prefTrackAllCalls;
        private Integer prefTrackAllCallsSpecificSim;
        private Boolean prefTrackLocationOnActivity;
        private Boolean prefUseBusinessWhatsapp;
        private String sharedInboxPermission;
        private String signature;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private UserStatus userAccountStatus;
        private String userId;
        private String whatsappApiAccess;

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep acceptedOn(Temporal.DateTime dateTime) {
            this.acceptedOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep account(Account account) {
            this.account = account;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep accountEmail(String str) {
            this.accountEmail = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep accountEmailVerified(Boolean bool) {
            this.accountEmailVerified = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep addedById(String str) {
            this.addedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep addedOn(Temporal.DateTime dateTime) {
            this.addedOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep allowedDeviceId(List<String> list) {
            this.allowedDeviceId = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep approvedById(String str) {
            this.approvedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep approvedOn(Temporal.DateTime dateTime) {
            this.approvedOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.AuthorizationLevelStep
        public UserAccountStatusStep authorizationLevel(AuthorizationLevel authorizationLevel) {
            Objects.requireNonNull(authorizationLevel);
            this.authorizationLevel = authorizationLevel;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public AccountMembership build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new AccountMembership(string, this.account, this.userId, this.allowedDeviceId, this.designation, this.authorizationLevel, this.signature, this.isBillingMember, this.addedById, this.updatedById, this.addedOn, this.approvedById, this.approvedOn, this.acceptedOn, this.userAccountStatus, this.whatsappApiAccess, this.sharedInboxPermission, this.canInitiateNewConversation, this.canCreateWaCampaigns, this.mapRegisteredMobileNumberToAccount, this.mapSecondaryMobileNumberToAccount, this.accountEmail, this.accountEmailVerified, this.notificationPreferences, this.migrateToUserIdOnRemoval, this.prefScreenPop, this.prefSaveBusinessCall, this.prefPostCallDisposition, this.prefDefaultSimToCall, this.prefTrackLocationOnActivity, this.prefUseBusinessWhatsapp, this.prefTrackAllCalls, this.prefTrackAllCallsSpecificSim, this.onLeave, this.onLeaveTill, this.lastViewedChatNotification, this.prefReadOnlyInfo, this.customMemberAttributes, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep canCreateWaCampaigns(String str) {
            this.canCreateWaCampaigns = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep canInitiateNewConversation(String str) {
            this.canInitiateNewConversation = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep customMemberAttributes(String str) {
            this.customMemberAttributes = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep designation(String str) {
            this.designation = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep isBillingMember(Boolean bool) {
            this.isBillingMember = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep lastViewedChatNotification(Temporal.DateTime dateTime) {
            this.lastViewedChatNotification = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.MapRegisteredMobileNumberToAccountStep
        public MapSecondaryMobileNumberToAccountStep mapRegisteredMobileNumberToAccount(Boolean bool) {
            Objects.requireNonNull(bool);
            this.mapRegisteredMobileNumberToAccount = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.MapSecondaryMobileNumberToAccountStep
        public BuildStep mapSecondaryMobileNumberToAccount(Boolean bool) {
            Objects.requireNonNull(bool);
            this.mapSecondaryMobileNumberToAccount = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep migrateToUserIdOnRemoval(String str) {
            this.migrateToUserIdOnRemoval = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep notificationPreferences(List<NotificationPreferences> list) {
            this.notificationPreferences = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep onLeave(Boolean bool) {
            this.onLeave = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep onLeaveTill(Temporal.DateTime dateTime) {
            this.onLeaveTill = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep prefDefaultSimToCall(Integer num) {
            this.prefDefaultSimToCall = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep prefPostCallDisposition(Boolean bool) {
            this.prefPostCallDisposition = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep prefReadOnlyInfo(String str) {
            this.prefReadOnlyInfo = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep prefSaveBusinessCall(Boolean bool) {
            this.prefSaveBusinessCall = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep prefScreenPop(Boolean bool) {
            this.prefScreenPop = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep prefTrackAllCalls(Boolean bool) {
            this.prefTrackAllCalls = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep prefTrackAllCallsSpecificSim(Integer num) {
            this.prefTrackAllCallsSpecificSim = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep prefTrackLocationOnActivity(Boolean bool) {
            this.prefTrackLocationOnActivity = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep prefUseBusinessWhatsapp(Boolean bool) {
            this.prefUseBusinessWhatsapp = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep sharedInboxPermission(String str) {
            this.sharedInboxPermission = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep signature(String str) {
            this.signature = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.UserAccountStatusStep
        public MapRegisteredMobileNumberToAccountStep userAccountStatus(UserStatus userStatus) {
            Objects.requireNonNull(userStatus);
            this.userAccountStatus = userStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.UserIdStep
        public AuthorizationLevelStep userId(String str) {
            Objects.requireNonNull(str);
            this.userId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public BuildStep whatsappApiAccess(String str) {
            this.whatsappApiAccess = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Account account, String str2, List<String> list, String str3, AuthorizationLevel authorizationLevel, String str4, Boolean bool, String str5, String str6, Temporal.DateTime dateTime, String str7, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, UserStatus userStatus, String str8, String str9, String str10, String str11, Boolean bool2, Boolean bool3, String str12, Boolean bool4, List<NotificationPreferences> list2, String str13, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Boolean bool8, Boolean bool9, Boolean bool10, Integer num2, Boolean bool11, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, String str14, String str15, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7) {
            this.id = str;
            this.account = account;
            this.userId = str2;
            this.allowedDeviceId = list;
            this.designation = str3;
            this.authorizationLevel = authorizationLevel;
            this.signature = str4;
            this.isBillingMember = bool;
            this.addedById = str5;
            this.updatedById = str6;
            this.addedOn = dateTime;
            this.approvedById = str7;
            this.approvedOn = dateTime2;
            this.acceptedOn = dateTime3;
            this.userAccountStatus = userStatus;
            this.whatsappApiAccess = str8;
            this.sharedInboxPermission = str9;
            this.canInitiateNewConversation = str10;
            this.canCreateWaCampaigns = str11;
            this.mapRegisteredMobileNumberToAccount = bool2;
            this.mapSecondaryMobileNumberToAccount = bool3;
            this.accountEmail = str12;
            this.accountEmailVerified = bool4;
            this.notificationPreferences = list2;
            this.migrateToUserIdOnRemoval = str13;
            this.prefScreenPop = bool5;
            this.prefSaveBusinessCall = bool6;
            this.prefPostCallDisposition = bool7;
            this.prefDefaultSimToCall = num;
            this.prefTrackLocationOnActivity = bool8;
            this.prefUseBusinessWhatsapp = bool9;
            this.prefTrackAllCalls = bool10;
            this.prefTrackAllCallsSpecificSim = num2;
            this.onLeave = bool11;
            this.onLeaveTill = dateTime4;
            this.lastViewedChatNotification = dateTime5;
            this.prefReadOnlyInfo = str14;
            this.customMemberAttributes = str15;
            this.createdAt = dateTime6;
            this.updatedAt = dateTime7;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public /* bridge */ /* synthetic */ BuildStep allowedDeviceId(List list) {
            return allowedDeviceId((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public /* bridge */ /* synthetic */ BuildStep notificationPreferences(List list) {
            return notificationPreferences((List<NotificationPreferences>) list);
        }

        private CopyOfBuilder(String str, Account account, String str2, List<String> list, String str3, AuthorizationLevel authorizationLevel, String str4, Boolean bool, String str5, String str6, Temporal.DateTime dateTime, String str7, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, UserStatus userStatus, String str8, String str9, String str10, String str11, Boolean bool2, Boolean bool3, String str12, Boolean bool4, List<NotificationPreferences> list2, String str13, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Boolean bool8, Boolean bool9, Boolean bool10, Integer num2, Boolean bool11, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, String str14, String str15, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7) {
            super(str, account, str2, list, str3, authorizationLevel, str4, bool, str5, str6, dateTime, str7, dateTime2, dateTime3, userStatus, str8, str9, str10, str11, bool2, bool3, str12, bool4, list2, str13, bool5, bool6, bool7, num, bool8, bool9, bool10, num2, bool11, dateTime4, dateTime5, str14, str15, dateTime6, dateTime7);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(authorizationLevel);
            Objects.requireNonNull(userStatus);
            Objects.requireNonNull(bool2);
            Objects.requireNonNull(bool3);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder acceptedOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.acceptedOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder account(Account account) {
            return (CopyOfBuilder) super.account(account);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder accountEmail(String str) {
            return (CopyOfBuilder) super.accountEmail(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder accountEmailVerified(Boolean bool) {
            return (CopyOfBuilder) super.accountEmailVerified(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder addedById(String str) {
            return (CopyOfBuilder) super.addedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder addedOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.addedOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder allowedDeviceId(List<String> list) {
            return (CopyOfBuilder) super.allowedDeviceId(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder approvedById(String str) {
            return (CopyOfBuilder) super.approvedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder approvedOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.approvedOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.AuthorizationLevelStep
        public CopyOfBuilder authorizationLevel(AuthorizationLevel authorizationLevel) {
            return (CopyOfBuilder) super.authorizationLevel(authorizationLevel);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder canCreateWaCampaigns(String str) {
            return (CopyOfBuilder) super.canCreateWaCampaigns(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder canInitiateNewConversation(String str) {
            return (CopyOfBuilder) super.canInitiateNewConversation(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder customMemberAttributes(String str) {
            return (CopyOfBuilder) super.customMemberAttributes(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder designation(String str) {
            return (CopyOfBuilder) super.designation(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder isBillingMember(Boolean bool) {
            return (CopyOfBuilder) super.isBillingMember(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder lastViewedChatNotification(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastViewedChatNotification(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.MapRegisteredMobileNumberToAccountStep
        public CopyOfBuilder mapRegisteredMobileNumberToAccount(Boolean bool) {
            return (CopyOfBuilder) super.mapRegisteredMobileNumberToAccount(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.MapSecondaryMobileNumberToAccountStep
        public CopyOfBuilder mapSecondaryMobileNumberToAccount(Boolean bool) {
            return (CopyOfBuilder) super.mapSecondaryMobileNumberToAccount(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder migrateToUserIdOnRemoval(String str) {
            return (CopyOfBuilder) super.migrateToUserIdOnRemoval(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder notificationPreferences(List<NotificationPreferences> list) {
            return (CopyOfBuilder) super.notificationPreferences(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder onLeave(Boolean bool) {
            return (CopyOfBuilder) super.onLeave(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder onLeaveTill(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.onLeaveTill(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder prefDefaultSimToCall(Integer num) {
            return (CopyOfBuilder) super.prefDefaultSimToCall(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder prefPostCallDisposition(Boolean bool) {
            return (CopyOfBuilder) super.prefPostCallDisposition(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder prefReadOnlyInfo(String str) {
            return (CopyOfBuilder) super.prefReadOnlyInfo(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder prefSaveBusinessCall(Boolean bool) {
            return (CopyOfBuilder) super.prefSaveBusinessCall(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder prefScreenPop(Boolean bool) {
            return (CopyOfBuilder) super.prefScreenPop(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder prefTrackAllCalls(Boolean bool) {
            return (CopyOfBuilder) super.prefTrackAllCalls(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder prefTrackAllCallsSpecificSim(Integer num) {
            return (CopyOfBuilder) super.prefTrackAllCallsSpecificSim(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder prefTrackLocationOnActivity(Boolean bool) {
            return (CopyOfBuilder) super.prefTrackLocationOnActivity(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder prefUseBusinessWhatsapp(Boolean bool) {
            return (CopyOfBuilder) super.prefUseBusinessWhatsapp(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder sharedInboxPermission(String str) {
            return (CopyOfBuilder) super.sharedInboxPermission(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder signature(String str) {
            return (CopyOfBuilder) super.signature(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.UserAccountStatusStep
        public CopyOfBuilder userAccountStatus(UserStatus userStatus) {
            return (CopyOfBuilder) super.userAccountStatus(userStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.UserIdStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountMembership.Builder, com.amplifyframework.datastore.generated.model.AccountMembership.BuildStep
        public CopyOfBuilder whatsappApiAccess(String str) {
            return (CopyOfBuilder) super.whatsappApiAccess(str);
        }
    }

    public interface MapRegisteredMobileNumberToAccountStep {
        MapSecondaryMobileNumberToAccountStep mapRegisteredMobileNumberToAccount(Boolean bool);
    }

    public interface MapSecondaryMobileNumberToAccountStep {
        BuildStep mapSecondaryMobileNumberToAccount(Boolean bool);
    }

    public interface UserAccountStatusStep {
        MapRegisteredMobileNumberToAccountStep userAccountStatus(UserStatus userStatus);
    }

    public interface UserIdStep {
        AuthorizationLevelStep userId(String str);
    }

    public static UserIdStep builder() {
        return new Builder();
    }

    public static AccountMembership justId(String str) {
        return new AccountMembership(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.account, this.userId, this.allowedDeviceId, this.designation, this.authorizationLevel, this.signature, this.isBillingMember, this.addedById, this.updatedById, this.addedOn, this.approvedById, this.approvedOn, this.acceptedOn, this.userAccountStatus, this.whatsappApiAccess, this.sharedInboxPermission, this.canInitiateNewConversation, this.canCreateWaCampaigns, this.mapRegisteredMobileNumberToAccount, this.mapSecondaryMobileNumberToAccount, this.accountEmail, this.accountEmailVerified, this.notificationPreferences, this.migrateToUserIdOnRemoval, this.prefScreenPop, this.prefSaveBusinessCall, this.prefPostCallDisposition, this.prefDefaultSimToCall, this.prefTrackLocationOnActivity, this.prefUseBusinessWhatsapp, this.prefTrackAllCalls, this.prefTrackAllCallsSpecificSim, this.onLeave, this.onLeaveTill, this.lastViewedChatNotification, this.prefReadOnlyInfo, this.customMemberAttributes, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccountMembership.class != obj.getClass()) {
            return false;
        }
        AccountMembership accountMembership = (AccountMembership) obj;
        return s6c.m47909a(getId(), accountMembership.getId()) && s6c.m47909a(getAccount(), accountMembership.getAccount()) && s6c.m47909a(getUserId(), accountMembership.getUserId()) && s6c.m47909a(getAllowedDeviceId(), accountMembership.getAllowedDeviceId()) && s6c.m47909a(getDesignation(), accountMembership.getDesignation()) && s6c.m47909a(getAuthorizationLevel(), accountMembership.getAuthorizationLevel()) && s6c.m47909a(getSignature(), accountMembership.getSignature()) && s6c.m47909a(getIsBillingMember(), accountMembership.getIsBillingMember()) && s6c.m47909a(getAddedById(), accountMembership.getAddedById()) && s6c.m47909a(getUpdatedById(), accountMembership.getUpdatedById()) && s6c.m47909a(getAddedOn(), accountMembership.getAddedOn()) && s6c.m47909a(getApprovedById(), accountMembership.getApprovedById()) && s6c.m47909a(getApprovedOn(), accountMembership.getApprovedOn()) && s6c.m47909a(getAcceptedOn(), accountMembership.getAcceptedOn()) && s6c.m47909a(getUserAccountStatus(), accountMembership.getUserAccountStatus()) && s6c.m47909a(getWhatsappApiAccess(), accountMembership.getWhatsappApiAccess()) && s6c.m47909a(getSharedInboxPermission(), accountMembership.getSharedInboxPermission()) && s6c.m47909a(getCanInitiateNewConversation(), accountMembership.getCanInitiateNewConversation()) && s6c.m47909a(getCanCreateWaCampaigns(), accountMembership.getCanCreateWaCampaigns()) && s6c.m47909a(getMapRegisteredMobileNumberToAccount(), accountMembership.getMapRegisteredMobileNumberToAccount()) && s6c.m47909a(getMapSecondaryMobileNumberToAccount(), accountMembership.getMapSecondaryMobileNumberToAccount()) && s6c.m47909a(getAccountEmail(), accountMembership.getAccountEmail()) && s6c.m47909a(getAccountEmailVerified(), accountMembership.getAccountEmailVerified()) && s6c.m47909a(getNotificationPreferences(), accountMembership.getNotificationPreferences()) && s6c.m47909a(getMigrateToUserIdOnRemoval(), accountMembership.getMigrateToUserIdOnRemoval()) && s6c.m47909a(getPrefScreenPop(), accountMembership.getPrefScreenPop()) && s6c.m47909a(getPrefSaveBusinessCall(), accountMembership.getPrefSaveBusinessCall()) && s6c.m47909a(getPrefPostCallDisposition(), accountMembership.getPrefPostCallDisposition()) && s6c.m47909a(getPrefDefaultSimToCall(), accountMembership.getPrefDefaultSimToCall()) && s6c.m47909a(getPrefTrackLocationOnActivity(), accountMembership.getPrefTrackLocationOnActivity()) && s6c.m47909a(getPrefUseBusinessWhatsapp(), accountMembership.getPrefUseBusinessWhatsapp()) && s6c.m47909a(getPrefTrackAllCalls(), accountMembership.getPrefTrackAllCalls()) && s6c.m47909a(getPrefTrackAllCallsSpecificSim(), accountMembership.getPrefTrackAllCallsSpecificSim()) && s6c.m47909a(getOnLeave(), accountMembership.getOnLeave()) && s6c.m47909a(getOnLeaveTill(), accountMembership.getOnLeaveTill()) && s6c.m47909a(getLastViewedChatNotification(), accountMembership.getLastViewedChatNotification()) && s6c.m47909a(getPrefReadOnlyInfo(), accountMembership.getPrefReadOnlyInfo()) && s6c.m47909a(getCustomMemberAttributes(), accountMembership.getCustomMemberAttributes()) && s6c.m47909a(getCreatedAt(), accountMembership.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), accountMembership.getUpdatedAt());
    }

    public Temporal.DateTime getAcceptedOn() {
        return this.acceptedOn;
    }

    public Account getAccount() {
        return this.account;
    }

    public String getAccountEmail() {
        return this.accountEmail;
    }

    public Boolean getAccountEmailVerified() {
        return this.accountEmailVerified;
    }

    public User getAddedBy() {
        return this.addedBy;
    }

    public String getAddedById() {
        return this.addedById;
    }

    public Temporal.DateTime getAddedOn() {
        return this.addedOn;
    }

    public List<String> getAllowedDeviceId() {
        return this.allowedDeviceId;
    }

    public User getApprovedBy() {
        return this.approvedBy;
    }

    public String getApprovedById() {
        return this.approvedById;
    }

    public Temporal.DateTime getApprovedOn() {
        return this.approvedOn;
    }

    public AuthorizationLevel getAuthorizationLevel() {
        return this.authorizationLevel;
    }

    public String getCanCreateWaCampaigns() {
        return this.canCreateWaCampaigns;
    }

    public String getCanInitiateNewConversation() {
        return this.canInitiateNewConversation;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCustomMemberAttributes() {
        return this.customMemberAttributes;
    }

    public String getDesignation() {
        return this.designation;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsBillingMember() {
        return this.isBillingMember;
    }

    public Temporal.DateTime getLastViewedChatNotification() {
        return this.lastViewedChatNotification;
    }

    public Boolean getMapRegisteredMobileNumberToAccount() {
        return this.mapRegisteredMobileNumberToAccount;
    }

    public Boolean getMapSecondaryMobileNumberToAccount() {
        return this.mapSecondaryMobileNumberToAccount;
    }

    public String getMigrateToUserIdOnRemoval() {
        return this.migrateToUserIdOnRemoval;
    }

    public List<NotificationPreferences> getNotificationPreferences() {
        return this.notificationPreferences;
    }

    public Boolean getOnLeave() {
        return this.onLeave;
    }

    public Temporal.DateTime getOnLeaveTill() {
        return this.onLeaveTill;
    }

    public Integer getPrefDefaultSimToCall() {
        return this.prefDefaultSimToCall;
    }

    public Boolean getPrefPostCallDisposition() {
        return this.prefPostCallDisposition;
    }

    public String getPrefReadOnlyInfo() {
        return this.prefReadOnlyInfo;
    }

    public Boolean getPrefSaveBusinessCall() {
        return this.prefSaveBusinessCall;
    }

    public Boolean getPrefScreenPop() {
        return this.prefScreenPop;
    }

    public Boolean getPrefTrackAllCalls() {
        return this.prefTrackAllCalls;
    }

    public Integer getPrefTrackAllCallsSpecificSim() {
        return this.prefTrackAllCallsSpecificSim;
    }

    public Boolean getPrefTrackLocationOnActivity() {
        return this.prefTrackLocationOnActivity;
    }

    public Boolean getPrefUseBusinessWhatsapp() {
        return this.prefUseBusinessWhatsapp;
    }

    public String getSharedInboxPermission() {
        return this.sharedInboxPermission;
    }

    public String getSignature() {
        return this.signature;
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

    public User getUser() {
        return this.user;
    }

    public UserStatus getUserAccountStatus() {
        return this.userAccountStatus;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getWhatsappApiAccess() {
        return this.whatsappApiAccess;
    }

    public int hashCode() {
        return (getId() + getAccount() + getUserId() + getAllowedDeviceId() + getDesignation() + getAuthorizationLevel() + getSignature() + getIsBillingMember() + getAddedById() + getUpdatedById() + getAddedOn() + getApprovedById() + getApprovedOn() + getAcceptedOn() + getUserAccountStatus() + getWhatsappApiAccess() + getSharedInboxPermission() + getCanInitiateNewConversation() + getCanCreateWaCampaigns() + getMapRegisteredMobileNumberToAccount() + getMapSecondaryMobileNumberToAccount() + getAccountEmail() + getAccountEmailVerified() + getNotificationPreferences() + getMigrateToUserIdOnRemoval() + getPrefScreenPop() + getPrefSaveBusinessCall() + getPrefPostCallDisposition() + getPrefDefaultSimToCall() + getPrefTrackLocationOnActivity() + getPrefUseBusinessWhatsapp() + getPrefTrackAllCalls() + getPrefTrackAllCallsSpecificSim() + getOnLeave() + getOnLeaveTill() + getLastViewedChatNotification() + getPrefReadOnlyInfo() + getCustomMemberAttributes() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountMembership {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("account=" + String.valueOf(getAccount()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("allowedDeviceId=" + String.valueOf(getAllowedDeviceId()) + ", ");
        sb.append("designation=" + String.valueOf(getDesignation()) + ", ");
        sb.append("authorizationLevel=" + String.valueOf(getAuthorizationLevel()) + ", ");
        sb.append("signature=" + String.valueOf(getSignature()) + ", ");
        sb.append("isBillingMember=" + String.valueOf(getIsBillingMember()) + ", ");
        sb.append("addedById=" + String.valueOf(getAddedById()) + ", ");
        sb.append("updatedById=" + String.valueOf(getUpdatedById()) + ", ");
        sb.append("addedOn=" + String.valueOf(getAddedOn()) + ", ");
        sb.append("approvedById=" + String.valueOf(getApprovedById()) + ", ");
        sb.append("approvedOn=" + String.valueOf(getApprovedOn()) + ", ");
        sb.append("acceptedOn=" + String.valueOf(getAcceptedOn()) + ", ");
        sb.append("userAccountStatus=" + String.valueOf(getUserAccountStatus()) + ", ");
        sb.append("whatsappApiAccess=" + String.valueOf(getWhatsappApiAccess()) + ", ");
        sb.append("sharedInboxPermission=" + String.valueOf(getSharedInboxPermission()) + ", ");
        sb.append("canInitiateNewConversation=" + String.valueOf(getCanInitiateNewConversation()) + ", ");
        sb.append("canCreateWaCampaigns=" + String.valueOf(getCanCreateWaCampaigns()) + ", ");
        sb.append("mapRegisteredMobileNumberToAccount=" + String.valueOf(getMapRegisteredMobileNumberToAccount()) + ", ");
        sb.append("mapSecondaryMobileNumberToAccount=" + String.valueOf(getMapSecondaryMobileNumberToAccount()) + ", ");
        sb.append("accountEmail=" + String.valueOf(getAccountEmail()) + ", ");
        sb.append("accountEmailVerified=" + String.valueOf(getAccountEmailVerified()) + ", ");
        sb.append("notificationPreferences=" + String.valueOf(getNotificationPreferences()) + ", ");
        sb.append("migrateToUserIdOnRemoval=" + String.valueOf(getMigrateToUserIdOnRemoval()) + ", ");
        sb.append("prefScreenPop=" + String.valueOf(getPrefScreenPop()) + ", ");
        sb.append("prefSaveBusinessCall=" + String.valueOf(getPrefSaveBusinessCall()) + ", ");
        sb.append("prefPostCallDisposition=" + String.valueOf(getPrefPostCallDisposition()) + ", ");
        sb.append("prefDefaultSimToCall=" + String.valueOf(getPrefDefaultSimToCall()) + ", ");
        sb.append("prefTrackLocationOnActivity=" + String.valueOf(getPrefTrackLocationOnActivity()) + ", ");
        sb.append("prefUseBusinessWhatsapp=" + String.valueOf(getPrefUseBusinessWhatsapp()) + ", ");
        sb.append("prefTrackAllCalls=" + String.valueOf(getPrefTrackAllCalls()) + ", ");
        sb.append("prefTrackAllCallsSpecificSim=" + String.valueOf(getPrefTrackAllCallsSpecificSim()) + ", ");
        sb.append("onLeave=" + String.valueOf(getOnLeave()) + ", ");
        sb.append("onLeaveTill=" + String.valueOf(getOnLeaveTill()) + ", ");
        sb.append("lastViewedChatNotification=" + String.valueOf(getLastViewedChatNotification()) + ", ");
        sb.append("prefReadOnlyInfo=" + String.valueOf(getPrefReadOnlyInfo()) + ", ");
        sb.append("customMemberAttributes=" + String.valueOf(getCustomMemberAttributes()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private AccountMembership(String str, Account account, String str2, List<String> list, String str3, AuthorizationLevel authorizationLevel, String str4, Boolean bool, String str5, String str6, Temporal.DateTime dateTime, String str7, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, UserStatus userStatus, String str8, String str9, String str10, String str11, Boolean bool2, Boolean bool3, String str12, Boolean bool4, List<NotificationPreferences> list2, String str13, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Boolean bool8, Boolean bool9, Boolean bool10, Integer num2, Boolean bool11, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, String str14, String str15, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7) {
        this.user = null;
        this.addedBy = null;
        this.updatedBy = null;
        this.approvedBy = null;
        this.id = str;
        this.account = account;
        this.userId = str2;
        this.allowedDeviceId = list;
        this.designation = str3;
        this.authorizationLevel = authorizationLevel;
        this.signature = str4;
        this.isBillingMember = bool;
        this.addedById = str5;
        this.updatedById = str6;
        this.addedOn = dateTime;
        this.approvedById = str7;
        this.approvedOn = dateTime2;
        this.acceptedOn = dateTime3;
        this.userAccountStatus = userStatus;
        this.whatsappApiAccess = str8;
        this.sharedInboxPermission = str9;
        this.canInitiateNewConversation = str10;
        this.canCreateWaCampaigns = str11;
        this.mapRegisteredMobileNumberToAccount = bool2;
        this.mapSecondaryMobileNumberToAccount = bool3;
        this.accountEmail = str12;
        this.accountEmailVerified = bool4;
        this.notificationPreferences = list2;
        this.migrateToUserIdOnRemoval = str13;
        this.prefScreenPop = bool5;
        this.prefSaveBusinessCall = bool6;
        this.prefPostCallDisposition = bool7;
        this.prefDefaultSimToCall = num;
        this.prefTrackLocationOnActivity = bool8;
        this.prefUseBusinessWhatsapp = bool9;
        this.prefTrackAllCalls = bool10;
        this.prefTrackAllCallsSpecificSim = num2;
        this.onLeave = bool11;
        this.onLeaveTill = dateTime4;
        this.lastViewedChatNotification = dateTime5;
        this.prefReadOnlyInfo = str14;
        this.customMemberAttributes = str15;
        this.createdAt = dateTime6;
        this.updatedAt = dateTime7;
    }
}
