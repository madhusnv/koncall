package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ}), @AuthRule(allow = AuthStrategy.OWNER, identityClaim = "userId", operations = {ModelOperation.CREATE, ModelOperation.DELETE}, ownerField = "createdById", provider = "userPools"), @AuthRule(allow = AuthStrategy.OWNER, identityClaim = "userId", operations = {ModelOperation.UPDATE}, ownerField = "updatedById", provider = "userPools")}, pluralName = "Accounts")
/* loaded from: classes5.dex */
public final class Account implements Model {

    @ModelField(isRequired = true, targetType = "String")
    private final String accountName;

    @ModelField(targetType = "AccountStats")
    private final AccountStats accountStats;

    @ModelField(targetType = "AccountStatus")
    private final AccountStatus accountStatus;

    @ModelField(isRequired = true, targetType = "AccountType")
    private final AccountType accountType;

    @ModelField(targetType = "Boolean")
    private final Boolean allowAddingSeat;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime allowAddingSeatTill;

    @ModelField(targetType = "String")
    private final String billingCurrency;

    @ModelField(targetType = "AWSEmail")
    private final String billingEmail;

    @ModelField(targetType = "String")
    private final String businessLogoUrl;

    @ModelField(targetType = "AWSJSON")
    private final String chatWidgetConfig;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User createdByUser;

    @ModelField(targetType = "Int")
    private final Integer currentActiveUsers;

    @ModelField(targetType = "Int")
    private final Integer currentTotalUsers;

    @ModelField(targetType = "String")
    private final String dateFormat;

    @ModelField(targetType = "String")
    private final String dateTimeViewStyle;

    @ModelField(targetType = "String")
    private final String dealMode;

    @ModelField(targetType = "String")
    private final String defaultCurrency;

    @ModelField(targetType = "String")
    private final String denomination;

    @ModelField(targetType = "String")
    private final String deviceKey;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime deviceKeyLastUpdated;

    @ModelField(targetType = "Boolean")
    private final Boolean eligibleForExtension;

    @ModelField(targetType = "Boolean")
    private final Boolean enableCustomCharts;

    @ModelField(targetType = "Int")
    private final Integer extraActiveUsers;

    @ModelField(targetType = "Int")
    private final Integer freeSeats;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String industry;

    @ModelField(targetType = "String")
    private final String integrationNeeded;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastChurnDate;

    @ModelField(targetType = "String")
    private final String lastChurnReason;

    @ModelField(targetType = "PaymentData")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = PaymentData.class)
    private final PaymentData lastPaymentData;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastPaymentDataCreatedAt;

    @ModelField(targetType = "ID")
    private final String lastPaymentDataId;

    @ModelField(targetType = "String")
    private final String lastPaymentStatus;

    @ModelField(targetType = "Float")
    private final Double locationPeriodicFrequency;

    @BelongsTo(targetName = "matchingDealId", type = Deal.class)
    @ModelField(targetType = "Deal")
    private final Deal matchingDeal;

    @ModelField(targetType = "String")
    private final String nameOfBusiness;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime nextRenewalDateIfPaid;

    @ModelField(targetType = "String")
    private final String onboardingStatus;

    @ModelField(targetType = "String")
    private final String openAiApiKey;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime paidForTillDate;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime paidUpTo;

    @ModelField(targetType = "Int")
    private final Integer partPaymentAmountIfAny;

    @ModelField(targetType = "AWSJSON")
    private final List<String> permissions;

    @ModelField(targetType = "String")
    private final String plan;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime possibleReactivationDate;

    @ModelField(targetType = "Int")
    private final Integer pricePerSeat;

    @ModelField(targetType = "String")
    private final List<String> productOrService;

    @ModelField(targetType = "ID")
    private final List<String> relatedAccountIds;

    @ModelField(targetType = "String")
    private final List<String> salesmaxSalesContacts;

    @ModelField(targetType = "String")
    private final List<String> salesmaxSupportContacts;

    @ModelField(targetType = "Int")
    private final Integer seatReductionMarkedForNextCycle;

    @ModelField(targetType = "Int")
    private final Integer seats;

    @ModelField(targetType = "ProductPlanSubscription")
    @HasMany(associatedWith = "accountId", type = ProductPlanSubscription.class)
    private final List<ProductPlanSubscription> subscriptions;

    @ModelField(targetType = "String")
    private final String taxId;

    @ModelField(targetType = "String")
    private final String taxIdType;

    @ModelField(targetType = "String")
    private final String timeFormat;

    @ModelField(targetType = "String")
    private final String timeZone;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime trialAccountEndDate;

    @ModelField(targetType = "Int")
    private final Integer trialExtensionTimes;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User updatedByUser;

    @ModelField(targetType = "WebPreferences")
    private final List<WebPreferences> webPreferences;

    @ModelField(targetType = "AWSURL")
    private final String website;

    @ModelField(targetType = "WorkingHour")
    private final List<WorkingHour> workingHours;
    public static final QueryField ID = QueryField.field("Account", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_NAME = QueryField.field("Account", "accountName");
    public static final QueryField ACCOUNT_TYPE = QueryField.field("Account", "accountType");
    public static final QueryField DEVICE_KEY = QueryField.field("Account", "deviceKey");
    public static final QueryField DEVICE_KEY_LAST_UPDATED = QueryField.field("Account", "deviceKeyLastUpdated");
    public static final QueryField ACCOUNT_STATUS = QueryField.field("Account", "accountStatus");
    public static final QueryField BUSINESS_LOGO_URL = QueryField.field("Account", "businessLogoUrl");
    public static final QueryField CREATED_BY_ID = QueryField.field("Account", "createdById");
    public static final QueryField DATE_FORMAT = QueryField.field("Account", "dateFormat");
    public static final QueryField DATE_TIME_VIEW_STYLE = QueryField.field("Account", "dateTimeViewStyle");
    public static final QueryField DEFAULT_CURRENCY = QueryField.field("Account", "defaultCurrency");
    public static final QueryField DENOMINATION = QueryField.field("Account", "denomination");
    public static final QueryField INDUSTRY = QueryField.field("Account", "industry");
    public static final QueryField NAME_OF_BUSINESS = QueryField.field("Account", "nameOfBusiness");
    public static final QueryField PRODUCT_OR_SERVICE = QueryField.field("Account", "productOrService");
    public static final QueryField TIME_FORMAT = QueryField.field("Account", "timeFormat");
    public static final QueryField TIME_ZONE = QueryField.field("Account", RemoteConfigConstants.RequestFieldKey.TIME_ZONE);
    public static final QueryField PLAN = QueryField.field("Account", "plan");
    public static final QueryField PAID_UP_TO = QueryField.field("Account", "paidUpTo");
    public static final QueryField SEATS = QueryField.field("Account", "seats");
    public static final QueryField FREE_SEATS = QueryField.field("Account", "freeSeats");
    public static final QueryField CURRENT_TOTAL_USERS = QueryField.field("Account", "currentTotalUsers");
    public static final QueryField CURRENT_ACTIVE_USERS = QueryField.field("Account", "currentActiveUsers");
    public static final QueryField EXTRA_ACTIVE_USERS = QueryField.field("Account", "extraActiveUsers");
    public static final QueryField PRICE_PER_SEAT = QueryField.field("Account", "pricePerSeat");
    public static final QueryField ALLOW_ADDING_SEAT = QueryField.field("Account", "allowAddingSeat");
    public static final QueryField ALLOW_ADDING_SEAT_TILL = QueryField.field("Account", "allowAddingSeatTill");
    public static final QueryField SEAT_REDUCTION_MARKED_FOR_NEXT_CYCLE = QueryField.field("Account", "seatReductionMarkedForNextCycle");
    public static final QueryField BILLING_CURRENCY = QueryField.field("Account", "billingCurrency");
    public static final QueryField BILLING_EMAIL = QueryField.field("Account", "billingEmail");
    public static final QueryField TAX_ID = QueryField.field("Account", "taxId");
    public static final QueryField TAX_ID_TYPE = QueryField.field("Account", "taxIdType");
    public static final QueryField TRIAL_ACCOUNT_END_DATE = QueryField.field("Account", "trialAccountEndDate");
    public static final QueryField TRIAL_EXTENSION_TIMES = QueryField.field("Account", "trialExtensionTimes");
    public static final QueryField ELIGIBLE_FOR_EXTENSION = QueryField.field("Account", "eligibleForExtension");
    public static final QueryField PAID_FOR_TILL_DATE = QueryField.field("Account", "paidForTillDate");
    public static final QueryField UPDATED_BY_ID = QueryField.field("Account", "updatedById");
    public static final QueryField WEBSITE = QueryField.field("Account", "website");
    public static final QueryField WORKING_HOURS = QueryField.field("Account", "workingHours");
    public static final QueryField WEB_PREFERENCES = QueryField.field("Account", "webPreferences");
    public static final QueryField PERMISSIONS = QueryField.field("Account", "permissions");
    public static final QueryField ENABLE_CUSTOM_CHARTS = QueryField.field("Account", "enableCustomCharts");
    public static final QueryField CREATED_AT = QueryField.field("Account", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("Account", "updatedAt");
    public static final QueryField DEAL_MODE = QueryField.field("Account", "dealMode");
    public static final QueryField OPEN_AI_API_KEY = QueryField.field("Account", "openAiApiKey");
    public static final QueryField SALESMAX_SALES_CONTACTS = QueryField.field("Account", "salesmaxSalesContacts");
    public static final QueryField SALESMAX_SUPPORT_CONTACTS = QueryField.field("Account", "salesmaxSupportContacts");
    public static final QueryField CHAT_WIDGET_CONFIG = QueryField.field("Account", "chatWidgetConfig");
    public static final QueryField ONBOARDING_STATUS = QueryField.field("Account", "onboardingStatus");
    public static final QueryField INTEGRATION_NEEDED = QueryField.field("Account", "integrationNeeded");
    public static final QueryField MATCHING_DEAL = QueryField.field("Account", "matchingDealId");
    public static final QueryField RELATED_ACCOUNT_IDS = QueryField.field("Account", "relatedAccountIds");
    public static final QueryField ACCOUNT_STATS = QueryField.field("Account", "accountStats");
    public static final QueryField LAST_CHURN_DATE = QueryField.field("Account", "lastChurnDate");
    public static final QueryField LAST_CHURN_REASON = QueryField.field("Account", "lastChurnReason");
    public static final QueryField POSSIBLE_REACTIVATION_DATE = QueryField.field("Account", "possibleReactivationDate");
    public static final QueryField LOCATION_PERIODIC_FREQUENCY = QueryField.field("Account", "locationPeriodicFrequency");
    public static final QueryField LAST_PAYMENT_DATA_ID = QueryField.field("Account", "lastPaymentDataId");
    public static final QueryField LAST_PAYMENT_DATA_CREATED_AT = QueryField.field("Account", "lastPaymentDataCreatedAt");
    public static final QueryField NEXT_RENEWAL_DATE_IF_PAID = QueryField.field("Account", "nextRenewalDateIfPaid");
    public static final QueryField LAST_PAYMENT_STATUS = QueryField.field("Account", "lastPaymentStatus");
    public static final QueryField PART_PAYMENT_AMOUNT_IF_ANY = QueryField.field("Account", "partPaymentAmountIfAny");

    public interface AccountNameStep {
        AccountTypeStep accountName(String str);
    }

    public interface AccountTypeStep {
        BuildStep accountType(AccountType accountType);
    }

    public interface BuildStep {
        BuildStep accountStats(AccountStats accountStats);

        BuildStep accountStatus(AccountStatus accountStatus);

        BuildStep allowAddingSeat(Boolean bool);

        BuildStep allowAddingSeatTill(Temporal.DateTime dateTime);

        BuildStep billingCurrency(String str);

        BuildStep billingEmail(String str);

        Account build();

        BuildStep businessLogoUrl(String str);

        BuildStep chatWidgetConfig(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep currentActiveUsers(Integer num);

        BuildStep currentTotalUsers(Integer num);

        BuildStep dateFormat(String str);

        BuildStep dateTimeViewStyle(String str);

        BuildStep dealMode(String str);

        BuildStep defaultCurrency(String str);

        BuildStep denomination(String str);

        BuildStep deviceKey(String str);

        BuildStep deviceKeyLastUpdated(Temporal.DateTime dateTime);

        BuildStep eligibleForExtension(Boolean bool);

        BuildStep enableCustomCharts(Boolean bool);

        BuildStep extraActiveUsers(Integer num);

        BuildStep freeSeats(Integer num);

        BuildStep id(String str);

        BuildStep industry(String str);

        BuildStep integrationNeeded(String str);

        BuildStep lastChurnDate(Temporal.DateTime dateTime);

        BuildStep lastChurnReason(String str);

        BuildStep lastPaymentDataCreatedAt(Temporal.DateTime dateTime);

        BuildStep lastPaymentDataId(String str);

        BuildStep lastPaymentStatus(String str);

        BuildStep locationPeriodicFrequency(Double d);

        BuildStep matchingDeal(Deal deal);

        BuildStep nameOfBusiness(String str);

        BuildStep nextRenewalDateIfPaid(Temporal.DateTime dateTime);

        BuildStep onboardingStatus(String str);

        BuildStep openAiApiKey(String str);

        BuildStep paidForTillDate(Temporal.DateTime dateTime);

        BuildStep paidUpTo(Temporal.DateTime dateTime);

        BuildStep partPaymentAmountIfAny(Integer num);

        BuildStep permissions(List<String> list);

        BuildStep plan(String str);

        BuildStep possibleReactivationDate(Temporal.DateTime dateTime);

        BuildStep pricePerSeat(Integer num);

        BuildStep productOrService(List<String> list);

        BuildStep relatedAccountIds(List<String> list);

        BuildStep salesmaxSalesContacts(List<String> list);

        BuildStep salesmaxSupportContacts(List<String> list);

        BuildStep seatReductionMarkedForNextCycle(Integer num);

        BuildStep seats(Integer num);

        BuildStep taxId(String str);

        BuildStep taxIdType(String str);

        BuildStep timeFormat(String str);

        BuildStep timeZone(String str);

        BuildStep trialAccountEndDate(Temporal.DateTime dateTime);

        BuildStep trialExtensionTimes(Integer num);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);

        BuildStep webPreferences(List<WebPreferences> list);

        BuildStep website(String str);

        BuildStep workingHours(List<WorkingHour> list);
    }

    public static class Builder implements AccountNameStep, AccountTypeStep, BuildStep {
        private String accountName;
        private AccountStats accountStats;
        private AccountStatus accountStatus;
        private AccountType accountType;
        private Boolean allowAddingSeat;
        private Temporal.DateTime allowAddingSeatTill;
        private String billingCurrency;
        private String billingEmail;
        private String businessLogoUrl;
        private String chatWidgetConfig;
        private Temporal.DateTime createdAt;
        private String createdById;
        private Integer currentActiveUsers;
        private Integer currentTotalUsers;
        private String dateFormat;
        private String dateTimeViewStyle;
        private String dealMode;
        private String defaultCurrency;
        private String denomination;
        private String deviceKey;
        private Temporal.DateTime deviceKeyLastUpdated;
        private Boolean eligibleForExtension;
        private Boolean enableCustomCharts;
        private Integer extraActiveUsers;
        private Integer freeSeats;
        private String id;
        private String industry;
        private String integrationNeeded;
        private Temporal.DateTime lastChurnDate;
        private String lastChurnReason;
        private Temporal.DateTime lastPaymentDataCreatedAt;
        private String lastPaymentDataId;
        private String lastPaymentStatus;
        private Double locationPeriodicFrequency;
        private Deal matchingDeal;
        private String nameOfBusiness;
        private Temporal.DateTime nextRenewalDateIfPaid;
        private String onboardingStatus;
        private String openAiApiKey;
        private Temporal.DateTime paidForTillDate;
        private Temporal.DateTime paidUpTo;
        private Integer partPaymentAmountIfAny;
        private List<String> permissions;
        private String plan;
        private Temporal.DateTime possibleReactivationDate;
        private Integer pricePerSeat;
        private List<String> productOrService;
        private List<String> relatedAccountIds;
        private List<String> salesmaxSalesContacts;
        private List<String> salesmaxSupportContacts;
        private Integer seatReductionMarkedForNextCycle;
        private Integer seats;
        private String taxId;
        private String taxIdType;
        private String timeFormat;
        private String timeZone;
        private Temporal.DateTime trialAccountEndDate;
        private Integer trialExtensionTimes;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private List<WebPreferences> webPreferences;
        private String website;
        private List<WorkingHour> workingHours;

        @Override // com.amplifyframework.datastore.generated.model.Account.AccountNameStep
        public AccountTypeStep accountName(String str) {
            Objects.requireNonNull(str);
            this.accountName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep accountStats(AccountStats accountStats) {
            this.accountStats = accountStats;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep accountStatus(AccountStatus accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.AccountTypeStep
        public BuildStep accountType(AccountType accountType) {
            Objects.requireNonNull(accountType);
            this.accountType = accountType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep allowAddingSeat(Boolean bool) {
            this.allowAddingSeat = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep allowAddingSeatTill(Temporal.DateTime dateTime) {
            this.allowAddingSeatTill = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep billingCurrency(String str) {
            this.billingCurrency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep billingEmail(String str) {
            this.billingEmail = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public Account build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new Account(string, this.accountName, this.accountType, this.deviceKey, this.deviceKeyLastUpdated, this.accountStatus, this.businessLogoUrl, this.createdById, this.dateFormat, this.dateTimeViewStyle, this.defaultCurrency, this.denomination, this.industry, this.nameOfBusiness, this.productOrService, this.timeFormat, this.timeZone, this.plan, this.paidUpTo, this.seats, this.freeSeats, this.currentTotalUsers, this.currentActiveUsers, this.extraActiveUsers, this.pricePerSeat, this.allowAddingSeat, this.allowAddingSeatTill, this.seatReductionMarkedForNextCycle, this.billingCurrency, this.billingEmail, this.taxId, this.taxIdType, this.trialAccountEndDate, this.trialExtensionTimes, this.eligibleForExtension, this.paidForTillDate, this.updatedById, this.website, this.workingHours, this.webPreferences, this.permissions, this.enableCustomCharts, this.createdAt, this.updatedAt, this.dealMode, this.openAiApiKey, this.salesmaxSalesContacts, this.salesmaxSupportContacts, this.chatWidgetConfig, this.onboardingStatus, this.integrationNeeded, this.matchingDeal, this.relatedAccountIds, this.accountStats, this.lastChurnDate, this.lastChurnReason, this.possibleReactivationDate, this.locationPeriodicFrequency, this.lastPaymentDataId, this.lastPaymentDataCreatedAt, this.nextRenewalDateIfPaid, this.lastPaymentStatus, this.partPaymentAmountIfAny);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep businessLogoUrl(String str) {
            this.businessLogoUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep chatWidgetConfig(String str) {
            this.chatWidgetConfig = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep currentActiveUsers(Integer num) {
            this.currentActiveUsers = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep currentTotalUsers(Integer num) {
            this.currentTotalUsers = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep dateFormat(String str) {
            this.dateFormat = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep dateTimeViewStyle(String str) {
            this.dateTimeViewStyle = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep dealMode(String str) {
            this.dealMode = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep defaultCurrency(String str) {
            this.defaultCurrency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep denomination(String str) {
            this.denomination = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep deviceKey(String str) {
            this.deviceKey = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep deviceKeyLastUpdated(Temporal.DateTime dateTime) {
            this.deviceKeyLastUpdated = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep eligibleForExtension(Boolean bool) {
            this.eligibleForExtension = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep enableCustomCharts(Boolean bool) {
            this.enableCustomCharts = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep extraActiveUsers(Integer num) {
            this.extraActiveUsers = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep freeSeats(Integer num) {
            this.freeSeats = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep industry(String str) {
            this.industry = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep integrationNeeded(String str) {
            this.integrationNeeded = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep lastChurnDate(Temporal.DateTime dateTime) {
            this.lastChurnDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep lastChurnReason(String str) {
            this.lastChurnReason = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep lastPaymentDataCreatedAt(Temporal.DateTime dateTime) {
            this.lastPaymentDataCreatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep lastPaymentDataId(String str) {
            this.lastPaymentDataId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep lastPaymentStatus(String str) {
            this.lastPaymentStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep locationPeriodicFrequency(Double d) {
            this.locationPeriodicFrequency = d;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep matchingDeal(Deal deal) {
            this.matchingDeal = deal;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep nameOfBusiness(String str) {
            this.nameOfBusiness = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep nextRenewalDateIfPaid(Temporal.DateTime dateTime) {
            this.nextRenewalDateIfPaid = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep onboardingStatus(String str) {
            this.onboardingStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep openAiApiKey(String str) {
            this.openAiApiKey = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep paidForTillDate(Temporal.DateTime dateTime) {
            this.paidForTillDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep paidUpTo(Temporal.DateTime dateTime) {
            this.paidUpTo = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep partPaymentAmountIfAny(Integer num) {
            this.partPaymentAmountIfAny = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep permissions(List<String> list) {
            this.permissions = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep plan(String str) {
            this.plan = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep possibleReactivationDate(Temporal.DateTime dateTime) {
            this.possibleReactivationDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep pricePerSeat(Integer num) {
            this.pricePerSeat = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep productOrService(List<String> list) {
            this.productOrService = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep relatedAccountIds(List<String> list) {
            this.relatedAccountIds = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep salesmaxSalesContacts(List<String> list) {
            this.salesmaxSalesContacts = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep salesmaxSupportContacts(List<String> list) {
            this.salesmaxSupportContacts = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep seatReductionMarkedForNextCycle(Integer num) {
            this.seatReductionMarkedForNextCycle = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep seats(Integer num) {
            this.seats = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep taxId(String str) {
            this.taxId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep taxIdType(String str) {
            this.taxIdType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep timeFormat(String str) {
            this.timeFormat = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep timeZone(String str) {
            this.timeZone = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep trialAccountEndDate(Temporal.DateTime dateTime) {
            this.trialAccountEndDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep trialExtensionTimes(Integer num) {
            this.trialExtensionTimes = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep webPreferences(List<WebPreferences> list) {
            this.webPreferences = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep website(String str) {
            this.website = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.BuildStep
        public BuildStep workingHours(List<WorkingHour> list) {
            this.workingHours = list;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, AccountType accountType, String str3, Temporal.DateTime dateTime, AccountStatus accountStatus, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<String> list, String str12, String str13, String str14, Temporal.DateTime dateTime2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool, Temporal.DateTime dateTime3, Integer num7, String str15, String str16, String str17, String str18, Temporal.DateTime dateTime4, Integer num8, Boolean bool2, Temporal.DateTime dateTime5, String str19, String str20, List<WorkingHour> list2, List<WebPreferences> list3, List<String> list4, Boolean bool3, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7, String str21, String str22, List<String> list5, List<String> list6, String str23, String str24, String str25, Deal deal, List<String> list7, AccountStats accountStats, Temporal.DateTime dateTime8, String str26, Temporal.DateTime dateTime9, Double d, String str27, Temporal.DateTime dateTime10, Temporal.DateTime dateTime11, String str28, Integer num9) {
            this.id = str;
            this.accountName = str2;
            this.accountType = accountType;
            this.deviceKey = str3;
            this.deviceKeyLastUpdated = dateTime;
            this.accountStatus = accountStatus;
            this.businessLogoUrl = str4;
            this.createdById = str5;
            this.dateFormat = str6;
            this.dateTimeViewStyle = str7;
            this.defaultCurrency = str8;
            this.denomination = str9;
            this.industry = str10;
            this.nameOfBusiness = str11;
            this.productOrService = list;
            this.timeFormat = str12;
            this.timeZone = str13;
            this.plan = str14;
            this.paidUpTo = dateTime2;
            this.seats = num;
            this.freeSeats = num2;
            this.currentTotalUsers = num3;
            this.currentActiveUsers = num4;
            this.extraActiveUsers = num5;
            this.pricePerSeat = num6;
            this.allowAddingSeat = bool;
            this.allowAddingSeatTill = dateTime3;
            this.seatReductionMarkedForNextCycle = num7;
            this.billingCurrency = str15;
            this.billingEmail = str16;
            this.taxId = str17;
            this.taxIdType = str18;
            this.trialAccountEndDate = dateTime4;
            this.trialExtensionTimes = num8;
            this.eligibleForExtension = bool2;
            this.paidForTillDate = dateTime5;
            this.updatedById = str19;
            this.website = str20;
            this.workingHours = list2;
            this.webPreferences = list3;
            this.permissions = list4;
            this.enableCustomCharts = bool3;
            this.createdAt = dateTime6;
            this.updatedAt = dateTime7;
            this.dealMode = str21;
            this.openAiApiKey = str22;
            this.salesmaxSalesContacts = list5;
            this.salesmaxSupportContacts = list6;
            this.chatWidgetConfig = str23;
            this.onboardingStatus = str24;
            this.integrationNeeded = str25;
            this.matchingDeal = deal;
            this.relatedAccountIds = list7;
            this.accountStats = accountStats;
            this.lastChurnDate = dateTime8;
            this.lastChurnReason = str26;
            this.possibleReactivationDate = dateTime9;
            this.locationPeriodicFrequency = d;
            this.lastPaymentDataId = str27;
            this.lastPaymentDataCreatedAt = dateTime10;
            this.nextRenewalDateIfPaid = dateTime11;
            this.lastPaymentStatus = str28;
            this.partPaymentAmountIfAny = num9;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public /* bridge */ /* synthetic */ BuildStep permissions(List list) {
            return permissions((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public /* bridge */ /* synthetic */ BuildStep productOrService(List list) {
            return productOrService((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public /* bridge */ /* synthetic */ BuildStep relatedAccountIds(List list) {
            return relatedAccountIds((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public /* bridge */ /* synthetic */ BuildStep salesmaxSalesContacts(List list) {
            return salesmaxSalesContacts((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public /* bridge */ /* synthetic */ BuildStep salesmaxSupportContacts(List list) {
            return salesmaxSupportContacts((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public /* bridge */ /* synthetic */ BuildStep webPreferences(List list) {
            return webPreferences((List<WebPreferences>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public /* bridge */ /* synthetic */ BuildStep workingHours(List list) {
            return workingHours((List<WorkingHour>) list);
        }

        private CopyOfBuilder(String str, String str2, AccountType accountType, String str3, Temporal.DateTime dateTime, AccountStatus accountStatus, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<String> list, String str12, String str13, String str14, Temporal.DateTime dateTime2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool, Temporal.DateTime dateTime3, Integer num7, String str15, String str16, String str17, String str18, Temporal.DateTime dateTime4, Integer num8, Boolean bool2, Temporal.DateTime dateTime5, String str19, String str20, List<WorkingHour> list2, List<WebPreferences> list3, List<String> list4, Boolean bool3, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7, String str21, String str22, List<String> list5, List<String> list6, String str23, String str24, String str25, Deal deal, List<String> list7, AccountStats accountStats, Temporal.DateTime dateTime8, String str26, Temporal.DateTime dateTime9, Double d, String str27, Temporal.DateTime dateTime10, Temporal.DateTime dateTime11, String str28, Integer num9) {
            super(str, str2, accountType, str3, dateTime, accountStatus, str4, str5, str6, str7, str8, str9, str10, str11, list, str12, str13, str14, dateTime2, num, num2, num3, num4, num5, num6, bool, dateTime3, num7, str15, str16, str17, str18, dateTime4, num8, bool2, dateTime5, str19, str20, list2, list3, list4, bool3, dateTime6, dateTime7, str21, str22, list5, list6, str23, str24, str25, deal, list7, accountStats, dateTime8, str26, dateTime9, d, str27, dateTime10, dateTime11, str28, num9);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(accountType);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.AccountNameStep
        public CopyOfBuilder accountName(String str) {
            return (CopyOfBuilder) super.accountName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder accountStats(AccountStats accountStats) {
            return (CopyOfBuilder) super.accountStats(accountStats);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder accountStatus(AccountStatus accountStatus) {
            return (CopyOfBuilder) super.accountStatus(accountStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.AccountTypeStep
        public CopyOfBuilder accountType(AccountType accountType) {
            return (CopyOfBuilder) super.accountType(accountType);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder allowAddingSeat(Boolean bool) {
            return (CopyOfBuilder) super.allowAddingSeat(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder allowAddingSeatTill(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.allowAddingSeatTill(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder billingCurrency(String str) {
            return (CopyOfBuilder) super.billingCurrency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder billingEmail(String str) {
            return (CopyOfBuilder) super.billingEmail(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder businessLogoUrl(String str) {
            return (CopyOfBuilder) super.businessLogoUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder chatWidgetConfig(String str) {
            return (CopyOfBuilder) super.chatWidgetConfig(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder currentActiveUsers(Integer num) {
            return (CopyOfBuilder) super.currentActiveUsers(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder currentTotalUsers(Integer num) {
            return (CopyOfBuilder) super.currentTotalUsers(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder dateFormat(String str) {
            return (CopyOfBuilder) super.dateFormat(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder dateTimeViewStyle(String str) {
            return (CopyOfBuilder) super.dateTimeViewStyle(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder dealMode(String str) {
            return (CopyOfBuilder) super.dealMode(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder defaultCurrency(String str) {
            return (CopyOfBuilder) super.defaultCurrency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder denomination(String str) {
            return (CopyOfBuilder) super.denomination(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder deviceKey(String str) {
            return (CopyOfBuilder) super.deviceKey(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder deviceKeyLastUpdated(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.deviceKeyLastUpdated(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder eligibleForExtension(Boolean bool) {
            return (CopyOfBuilder) super.eligibleForExtension(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder enableCustomCharts(Boolean bool) {
            return (CopyOfBuilder) super.enableCustomCharts(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder extraActiveUsers(Integer num) {
            return (CopyOfBuilder) super.extraActiveUsers(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder freeSeats(Integer num) {
            return (CopyOfBuilder) super.freeSeats(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder industry(String str) {
            return (CopyOfBuilder) super.industry(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder integrationNeeded(String str) {
            return (CopyOfBuilder) super.integrationNeeded(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder lastChurnDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastChurnDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder lastChurnReason(String str) {
            return (CopyOfBuilder) super.lastChurnReason(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder lastPaymentDataCreatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastPaymentDataCreatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder lastPaymentDataId(String str) {
            return (CopyOfBuilder) super.lastPaymentDataId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder lastPaymentStatus(String str) {
            return (CopyOfBuilder) super.lastPaymentStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder locationPeriodicFrequency(Double d) {
            return (CopyOfBuilder) super.locationPeriodicFrequency(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder matchingDeal(Deal deal) {
            return (CopyOfBuilder) super.matchingDeal(deal);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder nameOfBusiness(String str) {
            return (CopyOfBuilder) super.nameOfBusiness(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder nextRenewalDateIfPaid(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.nextRenewalDateIfPaid(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder onboardingStatus(String str) {
            return (CopyOfBuilder) super.onboardingStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder openAiApiKey(String str) {
            return (CopyOfBuilder) super.openAiApiKey(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder paidForTillDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.paidForTillDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder paidUpTo(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.paidUpTo(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder partPaymentAmountIfAny(Integer num) {
            return (CopyOfBuilder) super.partPaymentAmountIfAny(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder permissions(List<String> list) {
            return (CopyOfBuilder) super.permissions(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder plan(String str) {
            return (CopyOfBuilder) super.plan(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder possibleReactivationDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.possibleReactivationDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder pricePerSeat(Integer num) {
            return (CopyOfBuilder) super.pricePerSeat(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder productOrService(List<String> list) {
            return (CopyOfBuilder) super.productOrService(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder relatedAccountIds(List<String> list) {
            return (CopyOfBuilder) super.relatedAccountIds(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder salesmaxSalesContacts(List<String> list) {
            return (CopyOfBuilder) super.salesmaxSalesContacts(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder salesmaxSupportContacts(List<String> list) {
            return (CopyOfBuilder) super.salesmaxSupportContacts(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder seatReductionMarkedForNextCycle(Integer num) {
            return (CopyOfBuilder) super.seatReductionMarkedForNextCycle(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder seats(Integer num) {
            return (CopyOfBuilder) super.seats(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder taxId(String str) {
            return (CopyOfBuilder) super.taxId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder taxIdType(String str) {
            return (CopyOfBuilder) super.taxIdType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder timeFormat(String str) {
            return (CopyOfBuilder) super.timeFormat(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder timeZone(String str) {
            return (CopyOfBuilder) super.timeZone(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder trialAccountEndDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.trialAccountEndDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder trialExtensionTimes(Integer num) {
            return (CopyOfBuilder) super.trialExtensionTimes(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder webPreferences(List<WebPreferences> list) {
            return (CopyOfBuilder) super.webPreferences(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder website(String str) {
            return (CopyOfBuilder) super.website(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Account.Builder, com.amplifyframework.datastore.generated.model.Account.BuildStep
        public CopyOfBuilder workingHours(List<WorkingHour> list) {
            return (CopyOfBuilder) super.workingHours(list);
        }
    }

    public static AccountNameStep builder() {
        return new Builder();
    }

    public static Account justId(String str) {
        return new Account(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountName, this.accountType, this.deviceKey, this.deviceKeyLastUpdated, this.accountStatus, this.businessLogoUrl, this.createdById, this.dateFormat, this.dateTimeViewStyle, this.defaultCurrency, this.denomination, this.industry, this.nameOfBusiness, this.productOrService, this.timeFormat, this.timeZone, this.plan, this.paidUpTo, this.seats, this.freeSeats, this.currentTotalUsers, this.currentActiveUsers, this.extraActiveUsers, this.pricePerSeat, this.allowAddingSeat, this.allowAddingSeatTill, this.seatReductionMarkedForNextCycle, this.billingCurrency, this.billingEmail, this.taxId, this.taxIdType, this.trialAccountEndDate, this.trialExtensionTimes, this.eligibleForExtension, this.paidForTillDate, this.updatedById, this.website, this.workingHours, this.webPreferences, this.permissions, this.enableCustomCharts, this.createdAt, this.updatedAt, this.dealMode, this.openAiApiKey, this.salesmaxSalesContacts, this.salesmaxSupportContacts, this.chatWidgetConfig, this.onboardingStatus, this.integrationNeeded, this.matchingDeal, this.relatedAccountIds, this.accountStats, this.lastChurnDate, this.lastChurnReason, this.possibleReactivationDate, this.locationPeriodicFrequency, this.lastPaymentDataId, this.lastPaymentDataCreatedAt, this.nextRenewalDateIfPaid, this.lastPaymentStatus, this.partPaymentAmountIfAny);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Account.class != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return s6c.m47909a(getId(), account.getId()) && s6c.m47909a(getAccountName(), account.getAccountName()) && s6c.m47909a(getAccountType(), account.getAccountType()) && s6c.m47909a(getDeviceKey(), account.getDeviceKey()) && s6c.m47909a(getDeviceKeyLastUpdated(), account.getDeviceKeyLastUpdated()) && s6c.m47909a(getAccountStatus(), account.getAccountStatus()) && s6c.m47909a(getBusinessLogoUrl(), account.getBusinessLogoUrl()) && s6c.m47909a(getCreatedById(), account.getCreatedById()) && s6c.m47909a(getDateFormat(), account.getDateFormat()) && s6c.m47909a(getDateTimeViewStyle(), account.getDateTimeViewStyle()) && s6c.m47909a(getDefaultCurrency(), account.getDefaultCurrency()) && s6c.m47909a(getDenomination(), account.getDenomination()) && s6c.m47909a(getIndustry(), account.getIndustry()) && s6c.m47909a(getNameOfBusiness(), account.getNameOfBusiness()) && s6c.m47909a(getProductOrService(), account.getProductOrService()) && s6c.m47909a(getTimeFormat(), account.getTimeFormat()) && s6c.m47909a(getTimeZone(), account.getTimeZone()) && s6c.m47909a(getPlan(), account.getPlan()) && s6c.m47909a(getPaidUpTo(), account.getPaidUpTo()) && s6c.m47909a(getSeats(), account.getSeats()) && s6c.m47909a(getFreeSeats(), account.getFreeSeats()) && s6c.m47909a(getCurrentTotalUsers(), account.getCurrentTotalUsers()) && s6c.m47909a(getCurrentActiveUsers(), account.getCurrentActiveUsers()) && s6c.m47909a(getExtraActiveUsers(), account.getExtraActiveUsers()) && s6c.m47909a(getPricePerSeat(), account.getPricePerSeat()) && s6c.m47909a(getAllowAddingSeat(), account.getAllowAddingSeat()) && s6c.m47909a(getAllowAddingSeatTill(), account.getAllowAddingSeatTill()) && s6c.m47909a(getSeatReductionMarkedForNextCycle(), account.getSeatReductionMarkedForNextCycle()) && s6c.m47909a(getBillingCurrency(), account.getBillingCurrency()) && s6c.m47909a(getBillingEmail(), account.getBillingEmail()) && s6c.m47909a(getTaxId(), account.getTaxId()) && s6c.m47909a(getTaxIdType(), account.getTaxIdType()) && s6c.m47909a(getTrialAccountEndDate(), account.getTrialAccountEndDate()) && s6c.m47909a(getTrialExtensionTimes(), account.getTrialExtensionTimes()) && s6c.m47909a(getEligibleForExtension(), account.getEligibleForExtension()) && s6c.m47909a(getPaidForTillDate(), account.getPaidForTillDate()) && s6c.m47909a(getUpdatedById(), account.getUpdatedById()) && s6c.m47909a(getWebsite(), account.getWebsite()) && s6c.m47909a(getWorkingHours(), account.getWorkingHours()) && s6c.m47909a(getWebPreferences(), account.getWebPreferences()) && s6c.m47909a(getPermissions(), account.getPermissions()) && s6c.m47909a(getEnableCustomCharts(), account.getEnableCustomCharts()) && s6c.m47909a(getCreatedAt(), account.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), account.getUpdatedAt()) && s6c.m47909a(getDealMode(), account.getDealMode()) && s6c.m47909a(getOpenAiApiKey(), account.getOpenAiApiKey()) && s6c.m47909a(getSalesmaxSalesContacts(), account.getSalesmaxSalesContacts()) && s6c.m47909a(getSalesmaxSupportContacts(), account.getSalesmaxSupportContacts()) && s6c.m47909a(getChatWidgetConfig(), account.getChatWidgetConfig()) && s6c.m47909a(getOnboardingStatus(), account.getOnboardingStatus()) && s6c.m47909a(getIntegrationNeeded(), account.getIntegrationNeeded()) && s6c.m47909a(getMatchingDeal(), account.getMatchingDeal()) && s6c.m47909a(getRelatedAccountIds(), account.getRelatedAccountIds()) && s6c.m47909a(getAccountStats(), account.getAccountStats()) && s6c.m47909a(getLastChurnDate(), account.getLastChurnDate()) && s6c.m47909a(getLastChurnReason(), account.getLastChurnReason()) && s6c.m47909a(getPossibleReactivationDate(), account.getPossibleReactivationDate()) && s6c.m47909a(getLocationPeriodicFrequency(), account.getLocationPeriodicFrequency()) && s6c.m47909a(getLastPaymentDataId(), account.getLastPaymentDataId()) && s6c.m47909a(getLastPaymentDataCreatedAt(), account.getLastPaymentDataCreatedAt()) && s6c.m47909a(getNextRenewalDateIfPaid(), account.getNextRenewalDateIfPaid()) && s6c.m47909a(getLastPaymentStatus(), account.getLastPaymentStatus()) && s6c.m47909a(getPartPaymentAmountIfAny(), account.getPartPaymentAmountIfAny());
    }

    public String getAccountName() {
        return this.accountName;
    }

    public AccountStats getAccountStats() {
        return this.accountStats;
    }

    public AccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public Boolean getAllowAddingSeat() {
        return this.allowAddingSeat;
    }

    public Temporal.DateTime getAllowAddingSeatTill() {
        return this.allowAddingSeatTill;
    }

    public String getBillingCurrency() {
        return this.billingCurrency;
    }

    public String getBillingEmail() {
        return this.billingEmail;
    }

    public String getBusinessLogoUrl() {
        return this.businessLogoUrl;
    }

    public String getChatWidgetConfig() {
        return this.chatWidgetConfig;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public User getCreatedByUser() {
        return this.createdByUser;
    }

    public Integer getCurrentActiveUsers() {
        return this.currentActiveUsers;
    }

    public Integer getCurrentTotalUsers() {
        return this.currentTotalUsers;
    }

    public String getDateFormat() {
        return this.dateFormat;
    }

    public String getDateTimeViewStyle() {
        return this.dateTimeViewStyle;
    }

    public String getDealMode() {
        return this.dealMode;
    }

    public String getDefaultCurrency() {
        return this.defaultCurrency;
    }

    public String getDenomination() {
        return this.denomination;
    }

    public String getDeviceKey() {
        return this.deviceKey;
    }

    public Temporal.DateTime getDeviceKeyLastUpdated() {
        return this.deviceKeyLastUpdated;
    }

    public Boolean getEligibleForExtension() {
        return this.eligibleForExtension;
    }

    public Boolean getEnableCustomCharts() {
        return this.enableCustomCharts;
    }

    public Integer getExtraActiveUsers() {
        return this.extraActiveUsers;
    }

    public Integer getFreeSeats() {
        return this.freeSeats;
    }

    public String getId() {
        return this.id;
    }

    public String getIndustry() {
        return this.industry;
    }

    public String getIntegrationNeeded() {
        return this.integrationNeeded;
    }

    public Temporal.DateTime getLastChurnDate() {
        return this.lastChurnDate;
    }

    public String getLastChurnReason() {
        return this.lastChurnReason;
    }

    public PaymentData getLastPaymentData() {
        return this.lastPaymentData;
    }

    public Temporal.DateTime getLastPaymentDataCreatedAt() {
        return this.lastPaymentDataCreatedAt;
    }

    public String getLastPaymentDataId() {
        return this.lastPaymentDataId;
    }

    public String getLastPaymentStatus() {
        return this.lastPaymentStatus;
    }

    public Double getLocationPeriodicFrequency() {
        return this.locationPeriodicFrequency;
    }

    public Deal getMatchingDeal() {
        return this.matchingDeal;
    }

    public String getNameOfBusiness() {
        return this.nameOfBusiness;
    }

    public Temporal.DateTime getNextRenewalDateIfPaid() {
        return this.nextRenewalDateIfPaid;
    }

    public String getOnboardingStatus() {
        return this.onboardingStatus;
    }

    public String getOpenAiApiKey() {
        return this.openAiApiKey;
    }

    public Temporal.DateTime getPaidForTillDate() {
        return this.paidForTillDate;
    }

    public Temporal.DateTime getPaidUpTo() {
        return this.paidUpTo;
    }

    public Integer getPartPaymentAmountIfAny() {
        return this.partPaymentAmountIfAny;
    }

    public List<String> getPermissions() {
        return this.permissions;
    }

    public String getPlan() {
        return this.plan;
    }

    public Temporal.DateTime getPossibleReactivationDate() {
        return this.possibleReactivationDate;
    }

    public Integer getPricePerSeat() {
        return this.pricePerSeat;
    }

    public List<String> getProductOrService() {
        return this.productOrService;
    }

    public List<String> getRelatedAccountIds() {
        return this.relatedAccountIds;
    }

    public List<String> getSalesmaxSalesContacts() {
        return this.salesmaxSalesContacts;
    }

    public List<String> getSalesmaxSupportContacts() {
        return this.salesmaxSupportContacts;
    }

    public Integer getSeatReductionMarkedForNextCycle() {
        return this.seatReductionMarkedForNextCycle;
    }

    public Integer getSeats() {
        return this.seats;
    }

    public List<ProductPlanSubscription> getSubscriptions() {
        return this.subscriptions;
    }

    public String getTaxId() {
        return this.taxId;
    }

    public String getTaxIdType() {
        return this.taxIdType;
    }

    public String getTimeFormat() {
        return this.timeFormat;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public Temporal.DateTime getTrialAccountEndDate() {
        return this.trialAccountEndDate;
    }

    public Integer getTrialExtensionTimes() {
        return this.trialExtensionTimes;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public User getUpdatedByUser() {
        return this.updatedByUser;
    }

    public List<WebPreferences> getWebPreferences() {
        return this.webPreferences;
    }

    public String getWebsite() {
        return this.website;
    }

    public List<WorkingHour> getWorkingHours() {
        return this.workingHours;
    }

    public int hashCode() {
        return (getId() + getAccountName() + getAccountType() + getDeviceKey() + getDeviceKeyLastUpdated() + getAccountStatus() + getBusinessLogoUrl() + getCreatedById() + getDateFormat() + getDateTimeViewStyle() + getDefaultCurrency() + getDenomination() + getIndustry() + getNameOfBusiness() + getProductOrService() + getTimeFormat() + getTimeZone() + getPlan() + getPaidUpTo() + getSeats() + getFreeSeats() + getCurrentTotalUsers() + getCurrentActiveUsers() + getExtraActiveUsers() + getPricePerSeat() + getAllowAddingSeat() + getAllowAddingSeatTill() + getSeatReductionMarkedForNextCycle() + getBillingCurrency() + getBillingEmail() + getTaxId() + getTaxIdType() + getTrialAccountEndDate() + getTrialExtensionTimes() + getEligibleForExtension() + getPaidForTillDate() + getUpdatedById() + getWebsite() + getWorkingHours() + getWebPreferences() + getPermissions() + getEnableCustomCharts() + getCreatedAt() + getUpdatedAt() + getDealMode() + getOpenAiApiKey() + getSalesmaxSalesContacts() + getSalesmaxSupportContacts() + getChatWidgetConfig() + getOnboardingStatus() + getIntegrationNeeded() + getMatchingDeal() + getRelatedAccountIds() + getAccountStats() + getLastChurnDate() + getLastChurnReason() + getPossibleReactivationDate() + getLocationPeriodicFrequency() + getLastPaymentDataId() + getLastPaymentDataCreatedAt() + getNextRenewalDateIfPaid() + getLastPaymentStatus() + getPartPaymentAmountIfAny()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountName=" + String.valueOf(getAccountName()) + ", ");
        sb.append("accountType=" + String.valueOf(getAccountType()) + ", ");
        sb.append("deviceKey=" + String.valueOf(getDeviceKey()) + ", ");
        sb.append("deviceKeyLastUpdated=" + String.valueOf(getDeviceKeyLastUpdated()) + ", ");
        sb.append("accountStatus=" + String.valueOf(getAccountStatus()) + ", ");
        sb.append("businessLogoUrl=" + String.valueOf(getBusinessLogoUrl()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        sb.append("dateFormat=" + String.valueOf(getDateFormat()) + ", ");
        sb.append("dateTimeViewStyle=" + String.valueOf(getDateTimeViewStyle()) + ", ");
        sb.append("defaultCurrency=" + String.valueOf(getDefaultCurrency()) + ", ");
        sb.append("denomination=" + String.valueOf(getDenomination()) + ", ");
        sb.append("industry=" + String.valueOf(getIndustry()) + ", ");
        sb.append("nameOfBusiness=" + String.valueOf(getNameOfBusiness()) + ", ");
        sb.append("productOrService=" + String.valueOf(getProductOrService()) + ", ");
        sb.append("timeFormat=" + String.valueOf(getTimeFormat()) + ", ");
        sb.append("timeZone=" + String.valueOf(getTimeZone()) + ", ");
        sb.append("plan=" + String.valueOf(getPlan()) + ", ");
        sb.append("paidUpTo=" + String.valueOf(getPaidUpTo()) + ", ");
        sb.append("seats=" + String.valueOf(getSeats()) + ", ");
        sb.append("freeSeats=" + String.valueOf(getFreeSeats()) + ", ");
        sb.append("currentTotalUsers=" + String.valueOf(getCurrentTotalUsers()) + ", ");
        sb.append("currentActiveUsers=" + String.valueOf(getCurrentActiveUsers()) + ", ");
        sb.append("extraActiveUsers=" + String.valueOf(getExtraActiveUsers()) + ", ");
        sb.append("pricePerSeat=" + String.valueOf(getPricePerSeat()) + ", ");
        sb.append("allowAddingSeat=" + String.valueOf(getAllowAddingSeat()) + ", ");
        sb.append("allowAddingSeatTill=" + String.valueOf(getAllowAddingSeatTill()) + ", ");
        sb.append("seatReductionMarkedForNextCycle=" + String.valueOf(getSeatReductionMarkedForNextCycle()) + ", ");
        sb.append("billingCurrency=" + String.valueOf(getBillingCurrency()) + ", ");
        sb.append("billingEmail=" + String.valueOf(getBillingEmail()) + ", ");
        sb.append("taxId=" + String.valueOf(getTaxId()) + ", ");
        sb.append("taxIdType=" + String.valueOf(getTaxIdType()) + ", ");
        sb.append("trialAccountEndDate=" + String.valueOf(getTrialAccountEndDate()) + ", ");
        sb.append("trialExtensionTimes=" + String.valueOf(getTrialExtensionTimes()) + ", ");
        sb.append("eligibleForExtension=" + String.valueOf(getEligibleForExtension()) + ", ");
        sb.append("paidForTillDate=" + String.valueOf(getPaidForTillDate()) + ", ");
        sb.append("updatedById=" + String.valueOf(getUpdatedById()) + ", ");
        sb.append("website=" + String.valueOf(getWebsite()) + ", ");
        sb.append("workingHours=" + String.valueOf(getWorkingHours()) + ", ");
        sb.append("webPreferences=" + String.valueOf(getWebPreferences()) + ", ");
        sb.append("permissions=" + String.valueOf(getPermissions()) + ", ");
        sb.append("enableCustomCharts=" + String.valueOf(getEnableCustomCharts()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("dealMode=" + String.valueOf(getDealMode()) + ", ");
        sb.append("openAiApiKey=" + String.valueOf(getOpenAiApiKey()) + ", ");
        sb.append("salesmaxSalesContacts=" + String.valueOf(getSalesmaxSalesContacts()) + ", ");
        sb.append("salesmaxSupportContacts=" + String.valueOf(getSalesmaxSupportContacts()) + ", ");
        sb.append("chatWidgetConfig=" + String.valueOf(getChatWidgetConfig()) + ", ");
        sb.append("onboardingStatus=" + String.valueOf(getOnboardingStatus()) + ", ");
        sb.append("integrationNeeded=" + String.valueOf(getIntegrationNeeded()) + ", ");
        sb.append("matchingDeal=" + String.valueOf(getMatchingDeal()) + ", ");
        sb.append("relatedAccountIds=" + String.valueOf(getRelatedAccountIds()) + ", ");
        sb.append("accountStats=" + String.valueOf(getAccountStats()) + ", ");
        sb.append("lastChurnDate=" + String.valueOf(getLastChurnDate()) + ", ");
        sb.append("lastChurnReason=" + String.valueOf(getLastChurnReason()) + ", ");
        sb.append("possibleReactivationDate=" + String.valueOf(getPossibleReactivationDate()) + ", ");
        sb.append("locationPeriodicFrequency=" + String.valueOf(getLocationPeriodicFrequency()) + ", ");
        sb.append("lastPaymentDataId=" + String.valueOf(getLastPaymentDataId()) + ", ");
        sb.append("lastPaymentDataCreatedAt=" + String.valueOf(getLastPaymentDataCreatedAt()) + ", ");
        sb.append("nextRenewalDateIfPaid=" + String.valueOf(getNextRenewalDateIfPaid()) + ", ");
        sb.append("lastPaymentStatus=" + String.valueOf(getLastPaymentStatus()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("partPaymentAmountIfAny=");
        sb2.append(String.valueOf(getPartPaymentAmountIfAny()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private Account(String str, String str2, AccountType accountType, String str3, Temporal.DateTime dateTime, AccountStatus accountStatus, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<String> list, String str12, String str13, String str14, Temporal.DateTime dateTime2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool, Temporal.DateTime dateTime3, Integer num7, String str15, String str16, String str17, String str18, Temporal.DateTime dateTime4, Integer num8, Boolean bool2, Temporal.DateTime dateTime5, String str19, String str20, List<WorkingHour> list2, List<WebPreferences> list3, List<String> list4, Boolean bool3, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7, String str21, String str22, List<String> list5, List<String> list6, String str23, String str24, String str25, Deal deal, List<String> list7, AccountStats accountStats, Temporal.DateTime dateTime8, String str26, Temporal.DateTime dateTime9, Double d, String str27, Temporal.DateTime dateTime10, Temporal.DateTime dateTime11, String str28, Integer num9) {
        this.createdByUser = null;
        this.updatedByUser = null;
        this.subscriptions = null;
        this.lastPaymentData = null;
        this.id = str;
        this.accountName = str2;
        this.accountType = accountType;
        this.deviceKey = str3;
        this.deviceKeyLastUpdated = dateTime;
        this.accountStatus = accountStatus;
        this.businessLogoUrl = str4;
        this.createdById = str5;
        this.dateFormat = str6;
        this.dateTimeViewStyle = str7;
        this.defaultCurrency = str8;
        this.denomination = str9;
        this.industry = str10;
        this.nameOfBusiness = str11;
        this.productOrService = list;
        this.timeFormat = str12;
        this.timeZone = str13;
        this.plan = str14;
        this.paidUpTo = dateTime2;
        this.seats = num;
        this.freeSeats = num2;
        this.currentTotalUsers = num3;
        this.currentActiveUsers = num4;
        this.extraActiveUsers = num5;
        this.pricePerSeat = num6;
        this.allowAddingSeat = bool;
        this.allowAddingSeatTill = dateTime3;
        this.seatReductionMarkedForNextCycle = num7;
        this.billingCurrency = str15;
        this.billingEmail = str16;
        this.taxId = str17;
        this.taxIdType = str18;
        this.trialAccountEndDate = dateTime4;
        this.trialExtensionTimes = num8;
        this.eligibleForExtension = bool2;
        this.paidForTillDate = dateTime5;
        this.updatedById = str19;
        this.website = str20;
        this.workingHours = list2;
        this.webPreferences = list3;
        this.permissions = list4;
        this.enableCustomCharts = bool3;
        this.createdAt = dateTime6;
        this.updatedAt = dateTime7;
        this.dealMode = str21;
        this.openAiApiKey = str22;
        this.salesmaxSalesContacts = list5;
        this.salesmaxSupportContacts = list6;
        this.chatWidgetConfig = str23;
        this.onboardingStatus = str24;
        this.integrationNeeded = str25;
        this.matchingDeal = deal;
        this.relatedAccountIds = list7;
        this.accountStats = accountStats;
        this.lastChurnDate = dateTime8;
        this.lastChurnReason = str26;
        this.possibleReactivationDate = dateTime9;
        this.locationPeriodicFrequency = d;
        this.lastPaymentDataId = str27;
        this.lastPaymentDataCreatedAt = dateTime10;
        this.nextRenewalDateIfPaid = dateTime11;
        this.lastPaymentStatus = str28;
        this.partPaymentAmountIfAny = num9;
    }
}
