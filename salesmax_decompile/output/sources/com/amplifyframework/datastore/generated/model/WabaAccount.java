package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.HasMany;
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

@Indexes({@Index(fields = {"accountId"}, name = "wabaByAccount"), @Index(fields = {"wabaAccountId"}, name = "accountByWaba")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "WabaAccounts")
/* loaded from: classes5.dex */
public final class WabaAccount implements Model {

    @ModelField(targetType = "String")
    private final String accessToken;

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "Float")
    private final Double blockedBalanceBroadcast;

    @ModelField(targetType = "Float")
    private final Double blockedBalanceOverall;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "String")
    private final String currentLimitCategory;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Int")
    private final Integer maxDailyConversationPerPhone;

    @ModelField(targetType = "Int")
    private final Integer maxPhoneNumbersPerBusiness;

    @ModelField(targetType = "Int")
    private final Integer maxPhoneNumbersPerWaba;

    @ModelField(targetType = "Float")
    private final Double promptForPaymentThreshold;

    @ModelField(targetType = "String")
    private final String rejectionReason;

    @ModelField(targetType = "Float")
    private final Double remainingBalanceBroadcast;

    @ModelField(targetType = "Float")
    private final Double remainingBalanceOverall;

    @ModelField(targetType = "Int")
    private final Integer remainingFreeTierConversationsOverall;

    @ModelField(targetType = "RestrictionInfo")
    private final List<RestrictionInfo> restrictionInfo;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(isRequired = true, targetType = "ID")
    private final String wabaAccountId;

    @ModelField(targetType = "String")
    private final String wabaAccountName;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime wabaBanDate;

    @ModelField(targetType = "String")
    private final String wabaBanState;

    @ModelField(targetType = "String")
    private final String wabaDecision;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime wabaDecisionTime;

    @ModelField(targetType = "WabaPhoneNumber")
    @HasMany(associatedWith = "accountId", type = WabaPhoneNumber.class)
    private final List<WabaPhoneNumber> wabaPhoneNumbers;
    public static final QueryField ID = QueryField.field("WabaAccount", OutcomeConstants.OUTCOME_ID);
    public static final QueryField WABA_ACCOUNT_ID = QueryField.field("WabaAccount", "wabaAccountId");
    public static final QueryField WABA_ACCOUNT_NAME = QueryField.field("WabaAccount", "wabaAccountName");
    public static final QueryField ACCESS_TOKEN = QueryField.field("WabaAccount", "accessToken");
    public static final QueryField ACCOUNT_ID = QueryField.field("WabaAccount", "accountId");
    public static final QueryField REMAINING_FREE_TIER_CONVERSATIONS_OVERALL = QueryField.field("WabaAccount", "remainingFreeTierConversationsOverall");
    public static final QueryField REMAINING_BALANCE_OVERALL = QueryField.field("WabaAccount", "remainingBalanceOverall");
    public static final QueryField REMAINING_BALANCE_BROADCAST = QueryField.field("WabaAccount", "remainingBalanceBroadcast");
    public static final QueryField BLOCKED_BALANCE_OVERALL = QueryField.field("WabaAccount", "blockedBalanceOverall");
    public static final QueryField BLOCKED_BALANCE_BROADCAST = QueryField.field("WabaAccount", "blockedBalanceBroadcast");
    public static final QueryField PROMPT_FOR_PAYMENT_THRESHOLD = QueryField.field("WabaAccount", "promptForPaymentThreshold");
    public static final QueryField CREATED_AT = QueryField.field("WabaAccount", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("WabaAccount", "updatedAt");
    public static final QueryField CURRENT_LIMIT_CATEGORY = QueryField.field("WabaAccount", "currentLimitCategory");
    public static final QueryField MAX_DAILY_CONVERSATION_PER_PHONE = QueryField.field("WabaAccount", "maxDailyConversationPerPhone");
    public static final QueryField MAX_PHONE_NUMBERS_PER_BUSINESS = QueryField.field("WabaAccount", "maxPhoneNumbersPerBusiness");
    public static final QueryField MAX_PHONE_NUMBERS_PER_WABA = QueryField.field("WabaAccount", "maxPhoneNumbersPerWaba");
    public static final QueryField RESTRICTION_INFO = QueryField.field("WabaAccount", "restrictionInfo");
    public static final QueryField WABA_BAN_STATE = QueryField.field("WabaAccount", "wabaBanState");
    public static final QueryField WABA_BAN_DATE = QueryField.field("WabaAccount", "wabaBanDate");
    public static final QueryField WABA_DECISION = QueryField.field("WabaAccount", "wabaDecision");
    public static final QueryField WABA_DECISION_TIME = QueryField.field("WabaAccount", "wabaDecisionTime");
    public static final QueryField REJECTION_REASON = QueryField.field("WabaAccount", "rejectionReason");
    public static final QueryField CREATED_BY_ID = QueryField.field("WabaAccount", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("WabaAccount", "updatedById");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep accessToken(String str);

        BuildStep blockedBalanceBroadcast(Double d);

        BuildStep blockedBalanceOverall(Double d);

        WabaAccount build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep currentLimitCategory(String str);

        BuildStep id(String str);

        BuildStep maxDailyConversationPerPhone(Integer num);

        BuildStep maxPhoneNumbersPerBusiness(Integer num);

        BuildStep maxPhoneNumbersPerWaba(Integer num);

        BuildStep promptForPaymentThreshold(Double d);

        BuildStep rejectionReason(String str);

        BuildStep remainingBalanceBroadcast(Double d);

        BuildStep remainingBalanceOverall(Double d);

        BuildStep remainingFreeTierConversationsOverall(Integer num);

        BuildStep restrictionInfo(List<RestrictionInfo> list);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);

        BuildStep wabaAccountName(String str);

        BuildStep wabaBanDate(Temporal.DateTime dateTime);

        BuildStep wabaBanState(String str);

        BuildStep wabaDecision(String str);

        BuildStep wabaDecisionTime(Temporal.DateTime dateTime);
    }

    public static class Builder implements WabaAccountIdStep, AccountIdStep, BuildStep {
        private String accessToken;
        private String accountId;
        private Double blockedBalanceBroadcast;
        private Double blockedBalanceOverall;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String currentLimitCategory;
        private String id;
        private Integer maxDailyConversationPerPhone;
        private Integer maxPhoneNumbersPerBusiness;
        private Integer maxPhoneNumbersPerWaba;
        private Double promptForPaymentThreshold;
        private String rejectionReason;
        private Double remainingBalanceBroadcast;
        private Double remainingBalanceOverall;
        private Integer remainingFreeTierConversationsOverall;
        private List<RestrictionInfo> restrictionInfo;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private String wabaAccountId;
        private String wabaAccountName;
        private Temporal.DateTime wabaBanDate;
        private String wabaBanState;
        private String wabaDecision;
        private Temporal.DateTime wabaDecisionTime;

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep accessToken(String str) {
            this.accessToken = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep blockedBalanceBroadcast(Double d) {
            this.blockedBalanceBroadcast = d;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep blockedBalanceOverall(Double d) {
            this.blockedBalanceOverall = d;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public WabaAccount build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new WabaAccount(string, this.wabaAccountId, this.wabaAccountName, this.accessToken, this.accountId, this.remainingFreeTierConversationsOverall, this.remainingBalanceOverall, this.remainingBalanceBroadcast, this.blockedBalanceOverall, this.blockedBalanceBroadcast, this.promptForPaymentThreshold, this.createdAt, this.updatedAt, this.currentLimitCategory, this.maxDailyConversationPerPhone, this.maxPhoneNumbersPerBusiness, this.maxPhoneNumbersPerWaba, this.restrictionInfo, this.wabaBanState, this.wabaBanDate, this.wabaDecision, this.wabaDecisionTime, this.rejectionReason, this.createdById, this.updatedById);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep currentLimitCategory(String str) {
            this.currentLimitCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep maxDailyConversationPerPhone(Integer num) {
            this.maxDailyConversationPerPhone = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep maxPhoneNumbersPerBusiness(Integer num) {
            this.maxPhoneNumbersPerBusiness = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep maxPhoneNumbersPerWaba(Integer num) {
            this.maxPhoneNumbersPerWaba = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep promptForPaymentThreshold(Double d) {
            this.promptForPaymentThreshold = d;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep rejectionReason(String str) {
            this.rejectionReason = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep remainingBalanceBroadcast(Double d) {
            this.remainingBalanceBroadcast = d;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep remainingBalanceOverall(Double d) {
            this.remainingBalanceOverall = d;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep remainingFreeTierConversationsOverall(Integer num) {
            this.remainingFreeTierConversationsOverall = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep restrictionInfo(List<RestrictionInfo> list) {
            this.restrictionInfo = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.WabaAccountIdStep
        public AccountIdStep wabaAccountId(String str) {
            Objects.requireNonNull(str);
            this.wabaAccountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep wabaAccountName(String str) {
            this.wabaAccountName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep wabaBanDate(Temporal.DateTime dateTime) {
            this.wabaBanDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep wabaBanState(String str) {
            this.wabaBanState = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep wabaDecision(String str) {
            this.wabaDecision = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public BuildStep wabaDecisionTime(Temporal.DateTime dateTime) {
            this.wabaDecisionTime = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, Integer num, Double d, Double d2, Double d3, Double d4, Double d5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str6, Integer num2, Integer num3, Integer num4, List<RestrictionInfo> list, String str7, Temporal.DateTime dateTime3, String str8, Temporal.DateTime dateTime4, String str9, String str10, String str11) {
            this.id = str;
            this.wabaAccountId = str2;
            this.wabaAccountName = str3;
            this.accessToken = str4;
            this.accountId = str5;
            this.remainingFreeTierConversationsOverall = num;
            this.remainingBalanceOverall = d;
            this.remainingBalanceBroadcast = d2;
            this.blockedBalanceOverall = d3;
            this.blockedBalanceBroadcast = d4;
            this.promptForPaymentThreshold = d5;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
            this.currentLimitCategory = str6;
            this.maxDailyConversationPerPhone = num2;
            this.maxPhoneNumbersPerBusiness = num3;
            this.maxPhoneNumbersPerWaba = num4;
            this.restrictionInfo = list;
            this.wabaBanState = str7;
            this.wabaBanDate = dateTime3;
            this.wabaDecision = str8;
            this.wabaDecisionTime = dateTime4;
            this.rejectionReason = str9;
            this.createdById = str10;
            this.updatedById = str11;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public /* bridge */ /* synthetic */ BuildStep restrictionInfo(List list) {
            return restrictionInfo((List<RestrictionInfo>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, Integer num, Double d, Double d2, Double d3, Double d4, Double d5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str6, Integer num2, Integer num3, Integer num4, List<RestrictionInfo> list, String str7, Temporal.DateTime dateTime3, String str8, Temporal.DateTime dateTime4, String str9, String str10, String str11) {
            super(str, str2, str3, str4, str5, num, d, d2, d3, d4, d5, dateTime, dateTime2, str6, num2, num3, num4, list, str7, dateTime3, str8, dateTime4, str9, str10, str11);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str5);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder accessToken(String str) {
            return (CopyOfBuilder) super.accessToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder blockedBalanceBroadcast(Double d) {
            return (CopyOfBuilder) super.blockedBalanceBroadcast(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder blockedBalanceOverall(Double d) {
            return (CopyOfBuilder) super.blockedBalanceOverall(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder currentLimitCategory(String str) {
            return (CopyOfBuilder) super.currentLimitCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder maxDailyConversationPerPhone(Integer num) {
            return (CopyOfBuilder) super.maxDailyConversationPerPhone(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder maxPhoneNumbersPerBusiness(Integer num) {
            return (CopyOfBuilder) super.maxPhoneNumbersPerBusiness(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder maxPhoneNumbersPerWaba(Integer num) {
            return (CopyOfBuilder) super.maxPhoneNumbersPerWaba(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder promptForPaymentThreshold(Double d) {
            return (CopyOfBuilder) super.promptForPaymentThreshold(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder rejectionReason(String str) {
            return (CopyOfBuilder) super.rejectionReason(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder remainingBalanceBroadcast(Double d) {
            return (CopyOfBuilder) super.remainingBalanceBroadcast(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder remainingBalanceOverall(Double d) {
            return (CopyOfBuilder) super.remainingBalanceOverall(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder remainingFreeTierConversationsOverall(Integer num) {
            return (CopyOfBuilder) super.remainingFreeTierConversationsOverall(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder restrictionInfo(List<RestrictionInfo> list) {
            return (CopyOfBuilder) super.restrictionInfo(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.WabaAccountIdStep
        public CopyOfBuilder wabaAccountId(String str) {
            return (CopyOfBuilder) super.wabaAccountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder wabaAccountName(String str) {
            return (CopyOfBuilder) super.wabaAccountName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder wabaBanDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.wabaBanDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder wabaBanState(String str) {
            return (CopyOfBuilder) super.wabaBanState(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder wabaDecision(String str) {
            return (CopyOfBuilder) super.wabaDecision(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaAccount.Builder, com.amplifyframework.datastore.generated.model.WabaAccount.BuildStep
        public CopyOfBuilder wabaDecisionTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.wabaDecisionTime(dateTime);
        }
    }

    public interface WabaAccountIdStep {
        AccountIdStep wabaAccountId(String str);
    }

    public static WabaAccountIdStep builder() {
        return new Builder();
    }

    public static WabaAccount justId(String str) {
        return new WabaAccount(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.wabaAccountId, this.wabaAccountName, this.accessToken, this.accountId, this.remainingFreeTierConversationsOverall, this.remainingBalanceOverall, this.remainingBalanceBroadcast, this.blockedBalanceOverall, this.blockedBalanceBroadcast, this.promptForPaymentThreshold, this.createdAt, this.updatedAt, this.currentLimitCategory, this.maxDailyConversationPerPhone, this.maxPhoneNumbersPerBusiness, this.maxPhoneNumbersPerWaba, this.restrictionInfo, this.wabaBanState, this.wabaBanDate, this.wabaDecision, this.wabaDecisionTime, this.rejectionReason, this.createdById, this.updatedById);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WabaAccount.class != obj.getClass()) {
            return false;
        }
        WabaAccount wabaAccount = (WabaAccount) obj;
        return s6c.m47909a(getId(), wabaAccount.getId()) && s6c.m47909a(getWabaAccountId(), wabaAccount.getWabaAccountId()) && s6c.m47909a(getWabaAccountName(), wabaAccount.getWabaAccountName()) && s6c.m47909a(getAccessToken(), wabaAccount.getAccessToken()) && s6c.m47909a(getAccountId(), wabaAccount.getAccountId()) && s6c.m47909a(getRemainingFreeTierConversationsOverall(), wabaAccount.getRemainingFreeTierConversationsOverall()) && s6c.m47909a(getRemainingBalanceOverall(), wabaAccount.getRemainingBalanceOverall()) && s6c.m47909a(getRemainingBalanceBroadcast(), wabaAccount.getRemainingBalanceBroadcast()) && s6c.m47909a(getBlockedBalanceOverall(), wabaAccount.getBlockedBalanceOverall()) && s6c.m47909a(getBlockedBalanceBroadcast(), wabaAccount.getBlockedBalanceBroadcast()) && s6c.m47909a(getPromptForPaymentThreshold(), wabaAccount.getPromptForPaymentThreshold()) && s6c.m47909a(getCreatedAt(), wabaAccount.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), wabaAccount.getUpdatedAt()) && s6c.m47909a(getCurrentLimitCategory(), wabaAccount.getCurrentLimitCategory()) && s6c.m47909a(getMaxDailyConversationPerPhone(), wabaAccount.getMaxDailyConversationPerPhone()) && s6c.m47909a(getMaxPhoneNumbersPerBusiness(), wabaAccount.getMaxPhoneNumbersPerBusiness()) && s6c.m47909a(getMaxPhoneNumbersPerWaba(), wabaAccount.getMaxPhoneNumbersPerWaba()) && s6c.m47909a(getRestrictionInfo(), wabaAccount.getRestrictionInfo()) && s6c.m47909a(getWabaBanState(), wabaAccount.getWabaBanState()) && s6c.m47909a(getWabaBanDate(), wabaAccount.getWabaBanDate()) && s6c.m47909a(getWabaDecision(), wabaAccount.getWabaDecision()) && s6c.m47909a(getWabaDecisionTime(), wabaAccount.getWabaDecisionTime()) && s6c.m47909a(getRejectionReason(), wabaAccount.getRejectionReason()) && s6c.m47909a(getCreatedById(), wabaAccount.getCreatedById()) && s6c.m47909a(getUpdatedById(), wabaAccount.getUpdatedById());
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Double getBlockedBalanceBroadcast() {
        return this.blockedBalanceBroadcast;
    }

    public Double getBlockedBalanceOverall() {
        return this.blockedBalanceOverall;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public String getCurrentLimitCategory() {
        return this.currentLimitCategory;
    }

    public String getId() {
        return this.id;
    }

    public Integer getMaxDailyConversationPerPhone() {
        return this.maxDailyConversationPerPhone;
    }

    public Integer getMaxPhoneNumbersPerBusiness() {
        return this.maxPhoneNumbersPerBusiness;
    }

    public Integer getMaxPhoneNumbersPerWaba() {
        return this.maxPhoneNumbersPerWaba;
    }

    public Double getPromptForPaymentThreshold() {
        return this.promptForPaymentThreshold;
    }

    public String getRejectionReason() {
        return this.rejectionReason;
    }

    public Double getRemainingBalanceBroadcast() {
        return this.remainingBalanceBroadcast;
    }

    public Double getRemainingBalanceOverall() {
        return this.remainingBalanceOverall;
    }

    public Integer getRemainingFreeTierConversationsOverall() {
        return this.remainingFreeTierConversationsOverall;
    }

    public List<RestrictionInfo> getRestrictionInfo() {
        return this.restrictionInfo;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public String getWabaAccountId() {
        return this.wabaAccountId;
    }

    public String getWabaAccountName() {
        return this.wabaAccountName;
    }

    public Temporal.DateTime getWabaBanDate() {
        return this.wabaBanDate;
    }

    public String getWabaBanState() {
        return this.wabaBanState;
    }

    public String getWabaDecision() {
        return this.wabaDecision;
    }

    public Temporal.DateTime getWabaDecisionTime() {
        return this.wabaDecisionTime;
    }

    public List<WabaPhoneNumber> getWabaPhoneNumbers() {
        return this.wabaPhoneNumbers;
    }

    public int hashCode() {
        return (getId() + getWabaAccountId() + getWabaAccountName() + getAccessToken() + getAccountId() + getRemainingFreeTierConversationsOverall() + getRemainingBalanceOverall() + getRemainingBalanceBroadcast() + getBlockedBalanceOverall() + getBlockedBalanceBroadcast() + getPromptForPaymentThreshold() + getCreatedAt() + getUpdatedAt() + getCurrentLimitCategory() + getMaxDailyConversationPerPhone() + getMaxPhoneNumbersPerBusiness() + getMaxPhoneNumbersPerWaba() + getRestrictionInfo() + getWabaBanState() + getWabaBanDate() + getWabaDecision() + getWabaDecisionTime() + getRejectionReason() + getCreatedById() + getUpdatedById()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WabaAccount {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("wabaAccountId=" + String.valueOf(getWabaAccountId()) + ", ");
        sb.append("wabaAccountName=" + String.valueOf(getWabaAccountName()) + ", ");
        sb.append("accessToken=" + String.valueOf(getAccessToken()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("remainingFreeTierConversationsOverall=" + String.valueOf(getRemainingFreeTierConversationsOverall()) + ", ");
        sb.append("remainingBalanceOverall=" + String.valueOf(getRemainingBalanceOverall()) + ", ");
        sb.append("remainingBalanceBroadcast=" + String.valueOf(getRemainingBalanceBroadcast()) + ", ");
        sb.append("blockedBalanceOverall=" + String.valueOf(getBlockedBalanceOverall()) + ", ");
        sb.append("blockedBalanceBroadcast=" + String.valueOf(getBlockedBalanceBroadcast()) + ", ");
        sb.append("promptForPaymentThreshold=" + String.valueOf(getPromptForPaymentThreshold()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("currentLimitCategory=" + String.valueOf(getCurrentLimitCategory()) + ", ");
        sb.append("maxDailyConversationPerPhone=" + String.valueOf(getMaxDailyConversationPerPhone()) + ", ");
        sb.append("maxPhoneNumbersPerBusiness=" + String.valueOf(getMaxPhoneNumbersPerBusiness()) + ", ");
        sb.append("maxPhoneNumbersPerWaba=" + String.valueOf(getMaxPhoneNumbersPerWaba()) + ", ");
        sb.append("restrictionInfo=" + String.valueOf(getRestrictionInfo()) + ", ");
        sb.append("wabaBanState=" + String.valueOf(getWabaBanState()) + ", ");
        sb.append("wabaBanDate=" + String.valueOf(getWabaBanDate()) + ", ");
        sb.append("wabaDecision=" + String.valueOf(getWabaDecision()) + ", ");
        sb.append("wabaDecisionTime=" + String.valueOf(getWabaDecisionTime()) + ", ");
        sb.append("rejectionReason=" + String.valueOf(getRejectionReason()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedById=");
        sb2.append(String.valueOf(getUpdatedById()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private WabaAccount(String str, String str2, String str3, String str4, String str5, Integer num, Double d, Double d2, Double d3, Double d4, Double d5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str6, Integer num2, Integer num3, Integer num4, List<RestrictionInfo> list, String str7, Temporal.DateTime dateTime3, String str8, Temporal.DateTime dateTime4, String str9, String str10, String str11) {
        this.wabaPhoneNumbers = null;
        this.id = str;
        this.wabaAccountId = str2;
        this.wabaAccountName = str3;
        this.accessToken = str4;
        this.accountId = str5;
        this.remainingFreeTierConversationsOverall = num;
        this.remainingBalanceOverall = d;
        this.remainingBalanceBroadcast = d2;
        this.blockedBalanceOverall = d3;
        this.blockedBalanceBroadcast = d4;
        this.promptForPaymentThreshold = d5;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.currentLimitCategory = str6;
        this.maxDailyConversationPerPhone = num2;
        this.maxPhoneNumbersPerBusiness = num3;
        this.maxPhoneNumbersPerWaba = num4;
        this.restrictionInfo = list;
        this.wabaBanState = str7;
        this.wabaBanDate = dateTime3;
        this.wabaDecision = str8;
        this.wabaDecisionTime = dateTime4;
        this.rejectionReason = str9;
        this.createdById = str10;
        this.updatedById = str11;
    }
}
