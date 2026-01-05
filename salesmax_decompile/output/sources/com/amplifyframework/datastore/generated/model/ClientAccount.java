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
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "clientAccountId"}, name = SQLiteCommandFactory.UNDEFINED)
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "ClientAccounts")
/* loaded from: classes5.dex */
public final class ClientAccount implements Model {

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime accountCreationDate;

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User accountSalesOwner;

    @ModelField(targetType = "ID")
    private final String accountSalesOwnerId;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User accountSupportOwner;

    @ModelField(targetType = "ID")
    private final String accountSupportOwnerId;

    @BelongsTo(targetName = "alternateBillingContactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact alternateBillingContact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime billCycleEndDate;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime billCycleStartDate;

    @BelongsTo(targetName = "billingContactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact billingContact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime billingDate;

    @ModelField(targetType = "String")
    private final String billingPeriod;

    @BelongsTo(targetName = "clientAccountId", type = Account.class)
    @ModelField(targetType = "Account")
    private final Account clientAccount;

    @ModelField(targetType = "String")
    private final String clientAccountStatus;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime clientAccountTrialEndDate;

    @ModelField(targetType = "Int")
    private final Integer clientAccountTrialExtensionTimes;

    @ModelField(targetType = "String")
    private final String clientAccountType;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final String currency;

    @ModelField(targetType = "Int")
    private final Integer currentUserCount;

    @ModelField(targetType = "Int")
    private final Integer freeUserCount;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String lastBillStatus;

    @ModelField(targetType = "Int")
    private final Integer lastBilledAmmount;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastBilledCycleEndDate;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastBilledCycleStartDate;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastBilledDate;

    @ModelField(targetType = "Int")
    private final Integer lastBilledUserCount;

    @ModelField(targetType = "Int")
    private final Integer lastPaidAmount;

    @ModelField(targetType = "ID")
    private final String lastPaidProductAccountBillId;

    @ModelField(targetType = "ProductAccountBills")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = ProductAccountBills.class)
    private final ProductAccountBills lastPaidProductAccountBills;

    @ModelField(targetType = "Int")
    private final Integer lastPaidUserCount;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastPaymentDate;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastPaymentFollowupDoneOn;

    @ModelField(targetType = "String")
    private final String lastPaymentFollowupNote;

    @ModelField(targetType = "ID")
    private final String lastPendingProductAccountBillId;

    @ModelField(targetType = "ProductAccountBills")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = ProductAccountBills.class)
    private final ProductAccountBills lastPendingProductAccountBills;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime nextBillingCycleEndDate;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime nextBillingCycleStartDate;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime nextBillingDate;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime nextPaymentDueDate;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime paymentDueDate;

    @ModelField(targetType = "ProductPlanSubscription")
    @HasMany(associatedWith = "accountId", type = ProductPlanSubscription.class)
    private final List<ProductPlanSubscription> productPlanSubscriptions;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime subscriptionCreationDate;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("ClientAccount", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ClientAccount", "accountId");
    public static final QueryField CLIENT_ACCOUNT = QueryField.field("ClientAccount", "clientAccountId");
    public static final QueryField CLIENT_ACCOUNT_TYPE = QueryField.field("ClientAccount", "clientAccountType");
    public static final QueryField CLIENT_ACCOUNT_STATUS = QueryField.field("ClientAccount", "clientAccountStatus");
    public static final QueryField CLIENT_ACCOUNT_TRIAL_END_DATE = QueryField.field("ClientAccount", "clientAccountTrialEndDate");
    public static final QueryField CLIENT_ACCOUNT_TRIAL_EXTENSION_TIMES = QueryField.field("ClientAccount", "clientAccountTrialExtensionTimes");
    public static final QueryField BILLING_CONTACT = QueryField.field("ClientAccount", "billingContactId");
    public static final QueryField ALTERNATE_BILLING_CONTACT = QueryField.field("ClientAccount", "alternateBillingContactId");
    public static final QueryField LAST_PENDING_PRODUCT_ACCOUNT_BILL_ID = QueryField.field("ClientAccount", "lastPendingProductAccountBillId");
    public static final QueryField LAST_PAID_PRODUCT_ACCOUNT_BILL_ID = QueryField.field("ClientAccount", "lastPaidProductAccountBillId");
    public static final QueryField ACCOUNT_SALES_OWNER_ID = QueryField.field("ClientAccount", "accountSalesOwnerId");
    public static final QueryField ACCOUNT_SUPPORT_OWNER_ID = QueryField.field("ClientAccount", "accountSupportOwnerId");
    public static final QueryField CURRENT_USER_COUNT = QueryField.field("ClientAccount", "currentUserCount");
    public static final QueryField FREE_USER_COUNT = QueryField.field("ClientAccount", "freeUserCount");
    public static final QueryField CURRENCY = QueryField.field("ClientAccount", FirebaseAnalytics.Param.CURRENCY);
    public static final QueryField SUBSCRIPTION_CREATION_DATE = QueryField.field("ClientAccount", "subscriptionCreationDate");
    public static final QueryField ACCOUNT_CREATION_DATE = QueryField.field("ClientAccount", "accountCreationDate");
    public static final QueryField LAST_BILLED_CYCLE_START_DATE = QueryField.field("ClientAccount", "lastBilledCycleStartDate");
    public static final QueryField LAST_BILLED_CYCLE_END_DATE = QueryField.field("ClientAccount", "lastBilledCycleEndDate");
    public static final QueryField LAST_BILLED_DATE = QueryField.field("ClientAccount", "lastBilledDate");
    public static final QueryField LAST_BILLED_AMMOUNT = QueryField.field("ClientAccount", "lastBilledAmmount");
    public static final QueryField LAST_PAID_AMOUNT = QueryField.field("ClientAccount", "lastPaidAmount");
    public static final QueryField LAST_PAYMENT_DATE = QueryField.field("ClientAccount", "lastPaymentDate");
    public static final QueryField LAST_BILL_STATUS = QueryField.field("ClientAccount", "lastBillStatus");
    public static final QueryField LAST_PAYMENT_FOLLOWUP_NOTE = QueryField.field("ClientAccount", "lastPaymentFollowupNote");
    public static final QueryField LAST_PAYMENT_FOLLOWUP_DONE_ON = QueryField.field("ClientAccount", "lastPaymentFollowupDoneOn");
    public static final QueryField LAST_PAID_USER_COUNT = QueryField.field("ClientAccount", "lastPaidUserCount");
    public static final QueryField LAST_BILLED_USER_COUNT = QueryField.field("ClientAccount", "lastBilledUserCount");
    public static final QueryField BILLING_PERIOD = QueryField.field("ClientAccount", "billingPeriod");
    public static final QueryField BILL_CYCLE_START_DATE = QueryField.field("ClientAccount", "billCycleStartDate");
    public static final QueryField BILL_CYCLE_END_DATE = QueryField.field("ClientAccount", "billCycleEndDate");
    public static final QueryField BILLING_DATE = QueryField.field("ClientAccount", "billingDate");
    public static final QueryField PAYMENT_DUE_DATE = QueryField.field("ClientAccount", "paymentDueDate");
    public static final QueryField NEXT_BILLING_CYCLE_START_DATE = QueryField.field("ClientAccount", "nextBillingCycleStartDate");
    public static final QueryField NEXT_BILLING_CYCLE_END_DATE = QueryField.field("ClientAccount", "nextBillingCycleEndDate");
    public static final QueryField NEXT_BILLING_DATE = QueryField.field("ClientAccount", "nextBillingDate");
    public static final QueryField NEXT_PAYMENT_DUE_DATE = QueryField.field("ClientAccount", "nextPaymentDueDate");
    public static final QueryField CREATED_AT = QueryField.field("ClientAccount", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ClientAccount", "updatedAt");

    public interface AccountIdStep {
        CreatedAtStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep accountCreationDate(Temporal.DateTime dateTime);

        BuildStep accountSalesOwnerId(String str);

        BuildStep accountSupportOwnerId(String str);

        BuildStep alternateBillingContact(Contact contact);

        BuildStep billCycleEndDate(Temporal.DateTime dateTime);

        BuildStep billCycleStartDate(Temporal.DateTime dateTime);

        BuildStep billingContact(Contact contact);

        BuildStep billingDate(Temporal.DateTime dateTime);

        BuildStep billingPeriod(String str);

        ClientAccount build();

        BuildStep clientAccount(Account account);

        BuildStep clientAccountStatus(String str);

        BuildStep clientAccountTrialEndDate(Temporal.DateTime dateTime);

        BuildStep clientAccountTrialExtensionTimes(Integer num);

        BuildStep clientAccountType(String str);

        BuildStep currency(String str);

        BuildStep currentUserCount(Integer num);

        BuildStep freeUserCount(Integer num);

        BuildStep id(String str);

        BuildStep lastBillStatus(String str);

        BuildStep lastBilledAmmount(Integer num);

        BuildStep lastBilledCycleEndDate(Temporal.DateTime dateTime);

        BuildStep lastBilledCycleStartDate(Temporal.DateTime dateTime);

        BuildStep lastBilledDate(Temporal.DateTime dateTime);

        BuildStep lastBilledUserCount(Integer num);

        BuildStep lastPaidAmount(Integer num);

        BuildStep lastPaidProductAccountBillId(String str);

        BuildStep lastPaidUserCount(Integer num);

        BuildStep lastPaymentDate(Temporal.DateTime dateTime);

        BuildStep lastPaymentFollowupDoneOn(Temporal.DateTime dateTime);

        BuildStep lastPaymentFollowupNote(String str);

        BuildStep lastPendingProductAccountBillId(String str);

        BuildStep nextBillingCycleEndDate(Temporal.DateTime dateTime);

        BuildStep nextBillingCycleStartDate(Temporal.DateTime dateTime);

        BuildStep nextBillingDate(Temporal.DateTime dateTime);

        BuildStep nextPaymentDueDate(Temporal.DateTime dateTime);

        BuildStep paymentDueDate(Temporal.DateTime dateTime);

        BuildStep subscriptionCreationDate(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, CreatedAtStep, UpdatedAtStep, BuildStep {
        private Temporal.DateTime accountCreationDate;
        private String accountId;
        private String accountSalesOwnerId;
        private String accountSupportOwnerId;
        private Contact alternateBillingContact;
        private Temporal.DateTime billCycleEndDate;
        private Temporal.DateTime billCycleStartDate;
        private Contact billingContact;
        private Temporal.DateTime billingDate;
        private String billingPeriod;
        private Account clientAccount;
        private String clientAccountStatus;
        private Temporal.DateTime clientAccountTrialEndDate;
        private Integer clientAccountTrialExtensionTimes;
        private String clientAccountType;
        private Temporal.DateTime createdAt;
        private String currency;
        private Integer currentUserCount;
        private Integer freeUserCount;
        private String id;
        private String lastBillStatus;
        private Integer lastBilledAmmount;
        private Temporal.DateTime lastBilledCycleEndDate;
        private Temporal.DateTime lastBilledCycleStartDate;
        private Temporal.DateTime lastBilledDate;
        private Integer lastBilledUserCount;
        private Integer lastPaidAmount;
        private String lastPaidProductAccountBillId;
        private Integer lastPaidUserCount;
        private Temporal.DateTime lastPaymentDate;
        private Temporal.DateTime lastPaymentFollowupDoneOn;
        private String lastPaymentFollowupNote;
        private String lastPendingProductAccountBillId;
        private Temporal.DateTime nextBillingCycleEndDate;
        private Temporal.DateTime nextBillingCycleStartDate;
        private Temporal.DateTime nextBillingDate;
        private Temporal.DateTime nextPaymentDueDate;
        private Temporal.DateTime paymentDueDate;
        private Temporal.DateTime subscriptionCreationDate;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep accountCreationDate(Temporal.DateTime dateTime) {
            this.accountCreationDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.AccountIdStep
        public CreatedAtStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep accountSalesOwnerId(String str) {
            this.accountSalesOwnerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep accountSupportOwnerId(String str) {
            this.accountSupportOwnerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep alternateBillingContact(Contact contact) {
            this.alternateBillingContact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep billCycleEndDate(Temporal.DateTime dateTime) {
            this.billCycleEndDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep billCycleStartDate(Temporal.DateTime dateTime) {
            this.billCycleStartDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep billingContact(Contact contact) {
            this.billingContact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep billingDate(Temporal.DateTime dateTime) {
            this.billingDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep billingPeriod(String str) {
            this.billingPeriod = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public ClientAccount build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ClientAccount(string, this.accountId, this.clientAccount, this.clientAccountType, this.clientAccountStatus, this.clientAccountTrialEndDate, this.clientAccountTrialExtensionTimes, this.billingContact, this.alternateBillingContact, this.lastPendingProductAccountBillId, this.lastPaidProductAccountBillId, this.accountSalesOwnerId, this.accountSupportOwnerId, this.currentUserCount, this.freeUserCount, this.currency, this.subscriptionCreationDate, this.accountCreationDate, this.lastBilledCycleStartDate, this.lastBilledCycleEndDate, this.lastBilledDate, this.lastBilledAmmount, this.lastPaidAmount, this.lastPaymentDate, this.lastBillStatus, this.lastPaymentFollowupNote, this.lastPaymentFollowupDoneOn, this.lastPaidUserCount, this.lastBilledUserCount, this.billingPeriod, this.billCycleStartDate, this.billCycleEndDate, this.billingDate, this.paymentDueDate, this.nextBillingCycleStartDate, this.nextBillingCycleEndDate, this.nextBillingDate, this.nextPaymentDueDate, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep clientAccount(Account account) {
            this.clientAccount = account;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep clientAccountStatus(String str) {
            this.clientAccountStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep clientAccountTrialEndDate(Temporal.DateTime dateTime) {
            this.clientAccountTrialEndDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep clientAccountTrialExtensionTimes(Integer num) {
            this.clientAccountTrialExtensionTimes = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep clientAccountType(String str) {
            this.clientAccountType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.CreatedAtStep
        public UpdatedAtStep createdAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep currentUserCount(Integer num) {
            this.currentUserCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep freeUserCount(Integer num) {
            this.freeUserCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastBillStatus(String str) {
            this.lastBillStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastBilledAmmount(Integer num) {
            this.lastBilledAmmount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastBilledCycleEndDate(Temporal.DateTime dateTime) {
            this.lastBilledCycleEndDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastBilledCycleStartDate(Temporal.DateTime dateTime) {
            this.lastBilledCycleStartDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastBilledDate(Temporal.DateTime dateTime) {
            this.lastBilledDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastBilledUserCount(Integer num) {
            this.lastBilledUserCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastPaidAmount(Integer num) {
            this.lastPaidAmount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastPaidProductAccountBillId(String str) {
            this.lastPaidProductAccountBillId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastPaidUserCount(Integer num) {
            this.lastPaidUserCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastPaymentDate(Temporal.DateTime dateTime) {
            this.lastPaymentDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastPaymentFollowupDoneOn(Temporal.DateTime dateTime) {
            this.lastPaymentFollowupDoneOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastPaymentFollowupNote(String str) {
            this.lastPaymentFollowupNote = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep lastPendingProductAccountBillId(String str) {
            this.lastPendingProductAccountBillId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep nextBillingCycleEndDate(Temporal.DateTime dateTime) {
            this.nextBillingCycleEndDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep nextBillingCycleStartDate(Temporal.DateTime dateTime) {
            this.nextBillingCycleStartDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep nextBillingDate(Temporal.DateTime dateTime) {
            this.nextBillingDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep nextPaymentDueDate(Temporal.DateTime dateTime) {
            this.nextPaymentDueDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep paymentDueDate(Temporal.DateTime dateTime) {
            this.paymentDueDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public BuildStep subscriptionCreationDate(Temporal.DateTime dateTime) {
            this.subscriptionCreationDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.UpdatedAtStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Account account, String str3, String str4, Temporal.DateTime dateTime, Integer num, Contact contact, Contact contact2, String str5, String str6, String str7, String str8, Integer num2, Integer num3, String str9, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Temporal.DateTime dateTime6, Integer num4, Integer num5, Temporal.DateTime dateTime7, String str10, String str11, Temporal.DateTime dateTime8, Integer num6, Integer num7, String str12, Temporal.DateTime dateTime9, Temporal.DateTime dateTime10, Temporal.DateTime dateTime11, Temporal.DateTime dateTime12, Temporal.DateTime dateTime13, Temporal.DateTime dateTime14, Temporal.DateTime dateTime15, Temporal.DateTime dateTime16, Temporal.DateTime dateTime17, Temporal.DateTime dateTime18) {
            this.id = str;
            this.accountId = str2;
            this.clientAccount = account;
            this.clientAccountType = str3;
            this.clientAccountStatus = str4;
            this.clientAccountTrialEndDate = dateTime;
            this.clientAccountTrialExtensionTimes = num;
            this.billingContact = contact;
            this.alternateBillingContact = contact2;
            this.lastPendingProductAccountBillId = str5;
            this.lastPaidProductAccountBillId = str6;
            this.accountSalesOwnerId = str7;
            this.accountSupportOwnerId = str8;
            this.currentUserCount = num2;
            this.freeUserCount = num3;
            this.currency = str9;
            this.subscriptionCreationDate = dateTime2;
            this.accountCreationDate = dateTime3;
            this.lastBilledCycleStartDate = dateTime4;
            this.lastBilledCycleEndDate = dateTime5;
            this.lastBilledDate = dateTime6;
            this.lastBilledAmmount = num4;
            this.lastPaidAmount = num5;
            this.lastPaymentDate = dateTime7;
            this.lastBillStatus = str10;
            this.lastPaymentFollowupNote = str11;
            this.lastPaymentFollowupDoneOn = dateTime8;
            this.lastPaidUserCount = num6;
            this.lastBilledUserCount = num7;
            this.billingPeriod = str12;
            this.billCycleStartDate = dateTime9;
            this.billCycleEndDate = dateTime10;
            this.billingDate = dateTime11;
            this.paymentDueDate = dateTime12;
            this.nextBillingCycleStartDate = dateTime13;
            this.nextBillingCycleEndDate = dateTime14;
            this.nextBillingDate = dateTime15;
            this.nextPaymentDueDate = dateTime16;
            this.createdAt = dateTime17;
            this.updatedAt = dateTime18;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Account account, String str3, String str4, Temporal.DateTime dateTime, Integer num, Contact contact, Contact contact2, String str5, String str6, String str7, String str8, Integer num2, Integer num3, String str9, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Temporal.DateTime dateTime6, Integer num4, Integer num5, Temporal.DateTime dateTime7, String str10, String str11, Temporal.DateTime dateTime8, Integer num6, Integer num7, String str12, Temporal.DateTime dateTime9, Temporal.DateTime dateTime10, Temporal.DateTime dateTime11, Temporal.DateTime dateTime12, Temporal.DateTime dateTime13, Temporal.DateTime dateTime14, Temporal.DateTime dateTime15, Temporal.DateTime dateTime16, Temporal.DateTime dateTime17, Temporal.DateTime dateTime18) {
            super(str, str2, account, str3, str4, dateTime, num, contact, contact2, str5, str6, str7, str8, num2, num3, str9, dateTime2, dateTime3, dateTime4, dateTime5, dateTime6, num4, num5, dateTime7, str10, str11, dateTime8, num6, num7, str12, dateTime9, dateTime10, dateTime11, dateTime12, dateTime13, dateTime14, dateTime15, dateTime16, dateTime17, dateTime18);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(dateTime17);
            Objects.requireNonNull(dateTime18);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder accountCreationDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.accountCreationDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder accountSalesOwnerId(String str) {
            return (CopyOfBuilder) super.accountSalesOwnerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder accountSupportOwnerId(String str) {
            return (CopyOfBuilder) super.accountSupportOwnerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder alternateBillingContact(Contact contact) {
            return (CopyOfBuilder) super.alternateBillingContact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder billCycleEndDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.billCycleEndDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder billCycleStartDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.billCycleStartDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder billingContact(Contact contact) {
            return (CopyOfBuilder) super.billingContact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder billingDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.billingDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder billingPeriod(String str) {
            return (CopyOfBuilder) super.billingPeriod(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder clientAccount(Account account) {
            return (CopyOfBuilder) super.clientAccount(account);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder clientAccountStatus(String str) {
            return (CopyOfBuilder) super.clientAccountStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder clientAccountTrialEndDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.clientAccountTrialEndDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder clientAccountTrialExtensionTimes(Integer num) {
            return (CopyOfBuilder) super.clientAccountTrialExtensionTimes(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder clientAccountType(String str) {
            return (CopyOfBuilder) super.clientAccountType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.CreatedAtStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder currentUserCount(Integer num) {
            return (CopyOfBuilder) super.currentUserCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder freeUserCount(Integer num) {
            return (CopyOfBuilder) super.freeUserCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastBillStatus(String str) {
            return (CopyOfBuilder) super.lastBillStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastBilledAmmount(Integer num) {
            return (CopyOfBuilder) super.lastBilledAmmount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastBilledCycleEndDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastBilledCycleEndDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastBilledCycleStartDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastBilledCycleStartDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastBilledDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastBilledDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastBilledUserCount(Integer num) {
            return (CopyOfBuilder) super.lastBilledUserCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastPaidAmount(Integer num) {
            return (CopyOfBuilder) super.lastPaidAmount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastPaidProductAccountBillId(String str) {
            return (CopyOfBuilder) super.lastPaidProductAccountBillId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastPaidUserCount(Integer num) {
            return (CopyOfBuilder) super.lastPaidUserCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastPaymentDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastPaymentDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastPaymentFollowupDoneOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastPaymentFollowupDoneOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastPaymentFollowupNote(String str) {
            return (CopyOfBuilder) super.lastPaymentFollowupNote(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder lastPendingProductAccountBillId(String str) {
            return (CopyOfBuilder) super.lastPendingProductAccountBillId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder nextBillingCycleEndDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.nextBillingCycleEndDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder nextBillingCycleStartDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.nextBillingCycleStartDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder nextBillingDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.nextBillingDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder nextPaymentDueDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.nextPaymentDueDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder paymentDueDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.paymentDueDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.BuildStep
        public CopyOfBuilder subscriptionCreationDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.subscriptionCreationDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ClientAccount.Builder, com.amplifyframework.datastore.generated.model.ClientAccount.UpdatedAtStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface CreatedAtStep {
        UpdatedAtStep createdAt(Temporal.DateTime dateTime);
    }

    public interface UpdatedAtStep {
        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ClientAccount justId(String str) {
        return new ClientAccount(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.clientAccount, this.clientAccountType, this.clientAccountStatus, this.clientAccountTrialEndDate, this.clientAccountTrialExtensionTimes, this.billingContact, this.alternateBillingContact, this.lastPendingProductAccountBillId, this.lastPaidProductAccountBillId, this.accountSalesOwnerId, this.accountSupportOwnerId, this.currentUserCount, this.freeUserCount, this.currency, this.subscriptionCreationDate, this.accountCreationDate, this.lastBilledCycleStartDate, this.lastBilledCycleEndDate, this.lastBilledDate, this.lastBilledAmmount, this.lastPaidAmount, this.lastPaymentDate, this.lastBillStatus, this.lastPaymentFollowupNote, this.lastPaymentFollowupDoneOn, this.lastPaidUserCount, this.lastBilledUserCount, this.billingPeriod, this.billCycleStartDate, this.billCycleEndDate, this.billingDate, this.paymentDueDate, this.nextBillingCycleStartDate, this.nextBillingCycleEndDate, this.nextBillingDate, this.nextPaymentDueDate, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClientAccount.class != obj.getClass()) {
            return false;
        }
        ClientAccount clientAccount = (ClientAccount) obj;
        return s6c.m47909a(getId(), clientAccount.getId()) && s6c.m47909a(getAccountId(), clientAccount.getAccountId()) && s6c.m47909a(getClientAccount(), clientAccount.getClientAccount()) && s6c.m47909a(getClientAccountType(), clientAccount.getClientAccountType()) && s6c.m47909a(getClientAccountStatus(), clientAccount.getClientAccountStatus()) && s6c.m47909a(getClientAccountTrialEndDate(), clientAccount.getClientAccountTrialEndDate()) && s6c.m47909a(getClientAccountTrialExtensionTimes(), clientAccount.getClientAccountTrialExtensionTimes()) && s6c.m47909a(getBillingContact(), clientAccount.getBillingContact()) && s6c.m47909a(getAlternateBillingContact(), clientAccount.getAlternateBillingContact()) && s6c.m47909a(getLastPendingProductAccountBillId(), clientAccount.getLastPendingProductAccountBillId()) && s6c.m47909a(getLastPaidProductAccountBillId(), clientAccount.getLastPaidProductAccountBillId()) && s6c.m47909a(getAccountSalesOwnerId(), clientAccount.getAccountSalesOwnerId()) && s6c.m47909a(getAccountSupportOwnerId(), clientAccount.getAccountSupportOwnerId()) && s6c.m47909a(getCurrentUserCount(), clientAccount.getCurrentUserCount()) && s6c.m47909a(getFreeUserCount(), clientAccount.getFreeUserCount()) && s6c.m47909a(getCurrency(), clientAccount.getCurrency()) && s6c.m47909a(getSubscriptionCreationDate(), clientAccount.getSubscriptionCreationDate()) && s6c.m47909a(getAccountCreationDate(), clientAccount.getAccountCreationDate()) && s6c.m47909a(getLastBilledCycleStartDate(), clientAccount.getLastBilledCycleStartDate()) && s6c.m47909a(getLastBilledCycleEndDate(), clientAccount.getLastBilledCycleEndDate()) && s6c.m47909a(getLastBilledDate(), clientAccount.getLastBilledDate()) && s6c.m47909a(getLastBilledAmmount(), clientAccount.getLastBilledAmmount()) && s6c.m47909a(getLastPaidAmount(), clientAccount.getLastPaidAmount()) && s6c.m47909a(getLastPaymentDate(), clientAccount.getLastPaymentDate()) && s6c.m47909a(getLastBillStatus(), clientAccount.getLastBillStatus()) && s6c.m47909a(getLastPaymentFollowupNote(), clientAccount.getLastPaymentFollowupNote()) && s6c.m47909a(getLastPaymentFollowupDoneOn(), clientAccount.getLastPaymentFollowupDoneOn()) && s6c.m47909a(getLastPaidUserCount(), clientAccount.getLastPaidUserCount()) && s6c.m47909a(getLastBilledUserCount(), clientAccount.getLastBilledUserCount()) && s6c.m47909a(getBillingPeriod(), clientAccount.getBillingPeriod()) && s6c.m47909a(getBillCycleStartDate(), clientAccount.getBillCycleStartDate()) && s6c.m47909a(getBillCycleEndDate(), clientAccount.getBillCycleEndDate()) && s6c.m47909a(getBillingDate(), clientAccount.getBillingDate()) && s6c.m47909a(getPaymentDueDate(), clientAccount.getPaymentDueDate()) && s6c.m47909a(getNextBillingCycleStartDate(), clientAccount.getNextBillingCycleStartDate()) && s6c.m47909a(getNextBillingCycleEndDate(), clientAccount.getNextBillingCycleEndDate()) && s6c.m47909a(getNextBillingDate(), clientAccount.getNextBillingDate()) && s6c.m47909a(getNextPaymentDueDate(), clientAccount.getNextPaymentDueDate()) && s6c.m47909a(getCreatedAt(), clientAccount.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), clientAccount.getUpdatedAt());
    }

    public Temporal.DateTime getAccountCreationDate() {
        return this.accountCreationDate;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public User getAccountSalesOwner() {
        return this.accountSalesOwner;
    }

    public String getAccountSalesOwnerId() {
        return this.accountSalesOwnerId;
    }

    public User getAccountSupportOwner() {
        return this.accountSupportOwner;
    }

    public String getAccountSupportOwnerId() {
        return this.accountSupportOwnerId;
    }

    public Contact getAlternateBillingContact() {
        return this.alternateBillingContact;
    }

    public Temporal.DateTime getBillCycleEndDate() {
        return this.billCycleEndDate;
    }

    public Temporal.DateTime getBillCycleStartDate() {
        return this.billCycleStartDate;
    }

    public Contact getBillingContact() {
        return this.billingContact;
    }

    public Temporal.DateTime getBillingDate() {
        return this.billingDate;
    }

    public String getBillingPeriod() {
        return this.billingPeriod;
    }

    public Account getClientAccount() {
        return this.clientAccount;
    }

    public String getClientAccountStatus() {
        return this.clientAccountStatus;
    }

    public Temporal.DateTime getClientAccountTrialEndDate() {
        return this.clientAccountTrialEndDate;
    }

    public Integer getClientAccountTrialExtensionTimes() {
        return this.clientAccountTrialExtensionTimes;
    }

    public String getClientAccountType() {
        return this.clientAccountType;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Integer getCurrentUserCount() {
        return this.currentUserCount;
    }

    public Integer getFreeUserCount() {
        return this.freeUserCount;
    }

    public String getId() {
        return this.id;
    }

    public String getLastBillStatus() {
        return this.lastBillStatus;
    }

    public Integer getLastBilledAmmount() {
        return this.lastBilledAmmount;
    }

    public Temporal.DateTime getLastBilledCycleEndDate() {
        return this.lastBilledCycleEndDate;
    }

    public Temporal.DateTime getLastBilledCycleStartDate() {
        return this.lastBilledCycleStartDate;
    }

    public Temporal.DateTime getLastBilledDate() {
        return this.lastBilledDate;
    }

    public Integer getLastBilledUserCount() {
        return this.lastBilledUserCount;
    }

    public Integer getLastPaidAmount() {
        return this.lastPaidAmount;
    }

    public String getLastPaidProductAccountBillId() {
        return this.lastPaidProductAccountBillId;
    }

    public ProductAccountBills getLastPaidProductAccountBills() {
        return this.lastPaidProductAccountBills;
    }

    public Integer getLastPaidUserCount() {
        return this.lastPaidUserCount;
    }

    public Temporal.DateTime getLastPaymentDate() {
        return this.lastPaymentDate;
    }

    public Temporal.DateTime getLastPaymentFollowupDoneOn() {
        return this.lastPaymentFollowupDoneOn;
    }

    public String getLastPaymentFollowupNote() {
        return this.lastPaymentFollowupNote;
    }

    public String getLastPendingProductAccountBillId() {
        return this.lastPendingProductAccountBillId;
    }

    public ProductAccountBills getLastPendingProductAccountBills() {
        return this.lastPendingProductAccountBills;
    }

    public Temporal.DateTime getNextBillingCycleEndDate() {
        return this.nextBillingCycleEndDate;
    }

    public Temporal.DateTime getNextBillingCycleStartDate() {
        return this.nextBillingCycleStartDate;
    }

    public Temporal.DateTime getNextBillingDate() {
        return this.nextBillingDate;
    }

    public Temporal.DateTime getNextPaymentDueDate() {
        return this.nextPaymentDueDate;
    }

    public Temporal.DateTime getPaymentDueDate() {
        return this.paymentDueDate;
    }

    public List<ProductPlanSubscription> getProductPlanSubscriptions() {
        return this.productPlanSubscriptions;
    }

    public Temporal.DateTime getSubscriptionCreationDate() {
        return this.subscriptionCreationDate;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getClientAccount() + getClientAccountType() + getClientAccountStatus() + getClientAccountTrialEndDate() + getClientAccountTrialExtensionTimes() + getBillingContact() + getAlternateBillingContact() + getLastPendingProductAccountBillId() + getLastPaidProductAccountBillId() + getAccountSalesOwnerId() + getAccountSupportOwnerId() + getCurrentUserCount() + getFreeUserCount() + getCurrency() + getSubscriptionCreationDate() + getAccountCreationDate() + getLastBilledCycleStartDate() + getLastBilledCycleEndDate() + getLastBilledDate() + getLastBilledAmmount() + getLastPaidAmount() + getLastPaymentDate() + getLastBillStatus() + getLastPaymentFollowupNote() + getLastPaymentFollowupDoneOn() + getLastPaidUserCount() + getLastBilledUserCount() + getBillingPeriod() + getBillCycleStartDate() + getBillCycleEndDate() + getBillingDate() + getPaymentDueDate() + getNextBillingCycleStartDate() + getNextBillingCycleEndDate() + getNextBillingDate() + getNextPaymentDueDate() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClientAccount {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("clientAccount=" + String.valueOf(getClientAccount()) + ", ");
        sb.append("clientAccountType=" + String.valueOf(getClientAccountType()) + ", ");
        sb.append("clientAccountStatus=" + String.valueOf(getClientAccountStatus()) + ", ");
        sb.append("clientAccountTrialEndDate=" + String.valueOf(getClientAccountTrialEndDate()) + ", ");
        sb.append("clientAccountTrialExtensionTimes=" + String.valueOf(getClientAccountTrialExtensionTimes()) + ", ");
        sb.append("billingContact=" + String.valueOf(getBillingContact()) + ", ");
        sb.append("alternateBillingContact=" + String.valueOf(getAlternateBillingContact()) + ", ");
        sb.append("lastPendingProductAccountBillId=" + String.valueOf(getLastPendingProductAccountBillId()) + ", ");
        sb.append("lastPaidProductAccountBillId=" + String.valueOf(getLastPaidProductAccountBillId()) + ", ");
        sb.append("accountSalesOwnerId=" + String.valueOf(getAccountSalesOwnerId()) + ", ");
        sb.append("accountSupportOwnerId=" + String.valueOf(getAccountSupportOwnerId()) + ", ");
        sb.append("currentUserCount=" + String.valueOf(getCurrentUserCount()) + ", ");
        sb.append("freeUserCount=" + String.valueOf(getFreeUserCount()) + ", ");
        sb.append("currency=" + String.valueOf(getCurrency()) + ", ");
        sb.append("subscriptionCreationDate=" + String.valueOf(getSubscriptionCreationDate()) + ", ");
        sb.append("accountCreationDate=" + String.valueOf(getAccountCreationDate()) + ", ");
        sb.append("lastBilledCycleStartDate=" + String.valueOf(getLastBilledCycleStartDate()) + ", ");
        sb.append("lastBilledCycleEndDate=" + String.valueOf(getLastBilledCycleEndDate()) + ", ");
        sb.append("lastBilledDate=" + String.valueOf(getLastBilledDate()) + ", ");
        sb.append("lastBilledAmmount=" + String.valueOf(getLastBilledAmmount()) + ", ");
        sb.append("lastPaidAmount=" + String.valueOf(getLastPaidAmount()) + ", ");
        sb.append("lastPaymentDate=" + String.valueOf(getLastPaymentDate()) + ", ");
        sb.append("lastBillStatus=" + String.valueOf(getLastBillStatus()) + ", ");
        sb.append("lastPaymentFollowupNote=" + String.valueOf(getLastPaymentFollowupNote()) + ", ");
        sb.append("lastPaymentFollowupDoneOn=" + String.valueOf(getLastPaymentFollowupDoneOn()) + ", ");
        sb.append("lastPaidUserCount=" + String.valueOf(getLastPaidUserCount()) + ", ");
        sb.append("lastBilledUserCount=" + String.valueOf(getLastBilledUserCount()) + ", ");
        sb.append("billingPeriod=" + String.valueOf(getBillingPeriod()) + ", ");
        sb.append("billCycleStartDate=" + String.valueOf(getBillCycleStartDate()) + ", ");
        sb.append("billCycleEndDate=" + String.valueOf(getBillCycleEndDate()) + ", ");
        sb.append("billingDate=" + String.valueOf(getBillingDate()) + ", ");
        sb.append("paymentDueDate=" + String.valueOf(getPaymentDueDate()) + ", ");
        sb.append("nextBillingCycleStartDate=" + String.valueOf(getNextBillingCycleStartDate()) + ", ");
        sb.append("nextBillingCycleEndDate=" + String.valueOf(getNextBillingCycleEndDate()) + ", ");
        sb.append("nextBillingDate=" + String.valueOf(getNextBillingDate()) + ", ");
        sb.append("nextPaymentDueDate=" + String.valueOf(getNextPaymentDueDate()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ClientAccount(String str, String str2, Account account, String str3, String str4, Temporal.DateTime dateTime, Integer num, Contact contact, Contact contact2, String str5, String str6, String str7, String str8, Integer num2, Integer num3, String str9, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Temporal.DateTime dateTime6, Integer num4, Integer num5, Temporal.DateTime dateTime7, String str10, String str11, Temporal.DateTime dateTime8, Integer num6, Integer num7, String str12, Temporal.DateTime dateTime9, Temporal.DateTime dateTime10, Temporal.DateTime dateTime11, Temporal.DateTime dateTime12, Temporal.DateTime dateTime13, Temporal.DateTime dateTime14, Temporal.DateTime dateTime15, Temporal.DateTime dateTime16, Temporal.DateTime dateTime17, Temporal.DateTime dateTime18) {
        this.productPlanSubscriptions = null;
        this.lastPendingProductAccountBills = null;
        this.lastPaidProductAccountBills = null;
        this.accountSalesOwner = null;
        this.accountSupportOwner = null;
        this.id = str;
        this.accountId = str2;
        this.clientAccount = account;
        this.clientAccountType = str3;
        this.clientAccountStatus = str4;
        this.clientAccountTrialEndDate = dateTime;
        this.clientAccountTrialExtensionTimes = num;
        this.billingContact = contact;
        this.alternateBillingContact = contact2;
        this.lastPendingProductAccountBillId = str5;
        this.lastPaidProductAccountBillId = str6;
        this.accountSalesOwnerId = str7;
        this.accountSupportOwnerId = str8;
        this.currentUserCount = num2;
        this.freeUserCount = num3;
        this.currency = str9;
        this.subscriptionCreationDate = dateTime2;
        this.accountCreationDate = dateTime3;
        this.lastBilledCycleStartDate = dateTime4;
        this.lastBilledCycleEndDate = dateTime5;
        this.lastBilledDate = dateTime6;
        this.lastBilledAmmount = num4;
        this.lastPaidAmount = num5;
        this.lastPaymentDate = dateTime7;
        this.lastBillStatus = str10;
        this.lastPaymentFollowupNote = str11;
        this.lastPaymentFollowupDoneOn = dateTime8;
        this.lastPaidUserCount = num6;
        this.lastBilledUserCount = num7;
        this.billingPeriod = str12;
        this.billCycleStartDate = dateTime9;
        this.billCycleEndDate = dateTime10;
        this.billingDate = dateTime11;
        this.paymentDueDate = dateTime12;
        this.nextBillingCycleStartDate = dateTime13;
        this.nextBillingCycleEndDate = dateTime14;
        this.nextBillingDate = dateTime15;
        this.nextPaymentDueDate = dateTime16;
        this.createdAt = dateTime17;
        this.updatedAt = dateTime18;
    }
}
