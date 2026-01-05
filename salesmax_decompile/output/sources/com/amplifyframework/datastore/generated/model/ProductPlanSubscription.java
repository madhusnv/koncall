package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "status", "subscriptionPaymentStatus"}, name = "byAccount")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "ProductPlanSubscriptions")
/* loaded from: classes5.dex */
public final class ProductPlanSubscription implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String addedById;

    @ModelField(targetType = "Int")
    private final Integer amount;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final String currency;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Int")
    private final Integer numberOfFreeUnits;

    @ModelField(targetType = "Int")
    private final Integer numberOfUnits;

    @ModelField(targetType = "String")
    private final String period;

    @ModelField(targetType = "String")
    private final String planDescription;

    @ModelField(targetType = "Int")
    private final Integer planFeePerUnit;

    @ModelField(targetType = "Int")
    private final Integer planFeeProRataPerUnit;

    @ModelField(targetType = "String")
    private final String planStatus;

    @ModelField(targetType = "ID")
    private final String productAccountId;

    @ModelField(targetType = "ProductPlan")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = ProductPlan.class)
    private final ProductPlan productPlan;

    @ModelField(isRequired = true, targetType = "ID")
    private final String productPlanId;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime subscriptionEndDate;

    @ModelField(targetType = "String")
    private final String subscriptionPaymentStatus;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime subscriptionStartDate;

    @ModelField(targetType = "String")
    private final String unitType;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("ProductPlanSubscription", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ProductPlanSubscription", "accountId");
    public static final QueryField ADDED_BY_ID = QueryField.field("ProductPlanSubscription", "addedById");
    public static final QueryField PRODUCT_ACCOUNT_ID = QueryField.field("ProductPlanSubscription", "productAccountId");
    public static final QueryField PRODUCT_PLAN_ID = QueryField.field("ProductPlanSubscription", "productPlanId");
    public static final QueryField PLAN_DESCRIPTION = QueryField.field("ProductPlanSubscription", "planDescription");
    public static final QueryField PLAN_STATUS = QueryField.field("ProductPlanSubscription", "planStatus");
    public static final QueryField PLAN_FEE_PER_UNIT = QueryField.field("ProductPlanSubscription", "planFeePerUnit");
    public static final QueryField PLAN_FEE_PRO_RATA_PER_UNIT = QueryField.field("ProductPlanSubscription", "planFeeProRataPerUnit");
    public static final QueryField PERIOD = QueryField.field("ProductPlanSubscription", "period");
    public static final QueryField AMOUNT = QueryField.field("ProductPlanSubscription", "amount");
    public static final QueryField CURRENCY = QueryField.field("ProductPlanSubscription", FirebaseAnalytics.Param.CURRENCY);
    public static final QueryField STATUS = QueryField.field("ProductPlanSubscription", "status");
    public static final QueryField NUMBER_OF_UNITS = QueryField.field("ProductPlanSubscription", "numberOfUnits");
    public static final QueryField NUMBER_OF_FREE_UNITS = QueryField.field("ProductPlanSubscription", "numberOfFreeUnits");
    public static final QueryField UNIT_TYPE = QueryField.field("ProductPlanSubscription", "unitType");
    public static final QueryField SUBSCRIPTION_PAYMENT_STATUS = QueryField.field("ProductPlanSubscription", "subscriptionPaymentStatus");
    public static final QueryField SUBSCRIPTION_START_DATE = QueryField.field("ProductPlanSubscription", "subscriptionStartDate");
    public static final QueryField SUBSCRIPTION_END_DATE = QueryField.field("ProductPlanSubscription", "subscriptionEndDate");
    public static final QueryField CREATED_AT = QueryField.field("ProductPlanSubscription", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ProductPlanSubscription", "updatedAt");

    public interface AccountIdStep {
        AddedByIdStep accountId(String str);
    }

    public interface AddedByIdStep {
        ProductPlanIdStep addedById(String str);
    }

    public interface BuildStep {
        BuildStep amount(Integer num);

        ProductPlanSubscription build();

        BuildStep currency(String str);

        BuildStep id(String str);

        BuildStep numberOfFreeUnits(Integer num);

        BuildStep numberOfUnits(Integer num);

        BuildStep period(String str);

        BuildStep planDescription(String str);

        BuildStep planFeePerUnit(Integer num);

        BuildStep planFeeProRataPerUnit(Integer num);

        BuildStep planStatus(String str);

        BuildStep productAccountId(String str);

        BuildStep status(String str);

        BuildStep subscriptionEndDate(Temporal.DateTime dateTime);

        BuildStep subscriptionPaymentStatus(String str);

        BuildStep unitType(String str);
    }

    public static class Builder implements AccountIdStep, AddedByIdStep, ProductPlanIdStep, SubscriptionStartDateStep, CreatedAtStep, UpdatedAtStep, BuildStep {
        private String accountId;
        private String addedById;
        private Integer amount;
        private Temporal.DateTime createdAt;
        private String currency;
        private String id;
        private Integer numberOfFreeUnits;
        private Integer numberOfUnits;
        private String period;
        private String planDescription;
        private Integer planFeePerUnit;
        private Integer planFeeProRataPerUnit;
        private String planStatus;
        private String productAccountId;
        private String productPlanId;
        private String status;
        private Temporal.DateTime subscriptionEndDate;
        private String subscriptionPaymentStatus;
        private Temporal.DateTime subscriptionStartDate;
        private String unitType;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.AccountIdStep
        public AddedByIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.AddedByIdStep
        public ProductPlanIdStep addedById(String str) {
            Objects.requireNonNull(str);
            this.addedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep amount(Integer num) {
            this.amount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public ProductPlanSubscription build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ProductPlanSubscription(string, this.accountId, this.addedById, this.productAccountId, this.productPlanId, this.planDescription, this.planStatus, this.planFeePerUnit, this.planFeeProRataPerUnit, this.period, this.amount, this.currency, this.status, this.numberOfUnits, this.numberOfFreeUnits, this.unitType, this.subscriptionPaymentStatus, this.subscriptionStartDate, this.subscriptionEndDate, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.CreatedAtStep
        public UpdatedAtStep createdAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep numberOfFreeUnits(Integer num) {
            this.numberOfFreeUnits = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep numberOfUnits(Integer num) {
            this.numberOfUnits = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep period(String str) {
            this.period = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep planDescription(String str) {
            this.planDescription = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep planFeePerUnit(Integer num) {
            this.planFeePerUnit = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep planFeeProRataPerUnit(Integer num) {
            this.planFeeProRataPerUnit = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep planStatus(String str) {
            this.planStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep productAccountId(String str) {
            this.productAccountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.ProductPlanIdStep
        public SubscriptionStartDateStep productPlanId(String str) {
            Objects.requireNonNull(str);
            this.productPlanId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep subscriptionEndDate(Temporal.DateTime dateTime) {
            this.subscriptionEndDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep subscriptionPaymentStatus(String str) {
            this.subscriptionPaymentStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.SubscriptionStartDateStep
        public CreatedAtStep subscriptionStartDate(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.subscriptionStartDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public BuildStep unitType(String str) {
            this.unitType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.UpdatedAtStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, Integer num3, String str9, String str10, Integer num4, Integer num5, String str11, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            this.id = str;
            this.accountId = str2;
            this.addedById = str3;
            this.productAccountId = str4;
            this.productPlanId = str5;
            this.planDescription = str6;
            this.planStatus = str7;
            this.planFeePerUnit = num;
            this.planFeeProRataPerUnit = num2;
            this.period = str8;
            this.amount = num3;
            this.currency = str9;
            this.status = str10;
            this.numberOfUnits = num4;
            this.numberOfFreeUnits = num5;
            this.unitType = str11;
            this.subscriptionPaymentStatus = str12;
            this.subscriptionStartDate = dateTime;
            this.subscriptionEndDate = dateTime2;
            this.createdAt = dateTime3;
            this.updatedAt = dateTime4;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, Integer num3, String str9, String str10, Integer num4, Integer num5, String str11, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            super(str, str2, str3, str4, str5, str6, str7, num, num2, str8, num3, str9, str10, num4, num5, str11, str12, dateTime, dateTime2, dateTime3, dateTime4);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str5);
            Objects.requireNonNull(dateTime);
            Objects.requireNonNull(dateTime3);
            Objects.requireNonNull(dateTime4);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.AddedByIdStep
        public CopyOfBuilder addedById(String str) {
            return (CopyOfBuilder) super.addedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder amount(Integer num) {
            return (CopyOfBuilder) super.amount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.CreatedAtStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder numberOfFreeUnits(Integer num) {
            return (CopyOfBuilder) super.numberOfFreeUnits(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder numberOfUnits(Integer num) {
            return (CopyOfBuilder) super.numberOfUnits(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder period(String str) {
            return (CopyOfBuilder) super.period(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder planDescription(String str) {
            return (CopyOfBuilder) super.planDescription(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder planFeePerUnit(Integer num) {
            return (CopyOfBuilder) super.planFeePerUnit(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder planFeeProRataPerUnit(Integer num) {
            return (CopyOfBuilder) super.planFeeProRataPerUnit(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder planStatus(String str) {
            return (CopyOfBuilder) super.planStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder productAccountId(String str) {
            return (CopyOfBuilder) super.productAccountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.ProductPlanIdStep
        public CopyOfBuilder productPlanId(String str) {
            return (CopyOfBuilder) super.productPlanId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder subscriptionEndDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.subscriptionEndDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder subscriptionPaymentStatus(String str) {
            return (CopyOfBuilder) super.subscriptionPaymentStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.SubscriptionStartDateStep
        public CopyOfBuilder subscriptionStartDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.subscriptionStartDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.BuildStep
        public CopyOfBuilder unitType(String str) {
            return (CopyOfBuilder) super.unitType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscription.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscription.UpdatedAtStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface CreatedAtStep {
        UpdatedAtStep createdAt(Temporal.DateTime dateTime);
    }

    public interface ProductPlanIdStep {
        SubscriptionStartDateStep productPlanId(String str);
    }

    public interface SubscriptionStartDateStep {
        CreatedAtStep subscriptionStartDate(Temporal.DateTime dateTime);
    }

    public interface UpdatedAtStep {
        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ProductPlanSubscription justId(String str) {
        return new ProductPlanSubscription(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.addedById, this.productAccountId, this.productPlanId, this.planDescription, this.planStatus, this.planFeePerUnit, this.planFeeProRataPerUnit, this.period, this.amount, this.currency, this.status, this.numberOfUnits, this.numberOfFreeUnits, this.unitType, this.subscriptionPaymentStatus, this.subscriptionStartDate, this.subscriptionEndDate, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProductPlanSubscription.class != obj.getClass()) {
            return false;
        }
        ProductPlanSubscription productPlanSubscription = (ProductPlanSubscription) obj;
        return s6c.m47909a(getId(), productPlanSubscription.getId()) && s6c.m47909a(getAccountId(), productPlanSubscription.getAccountId()) && s6c.m47909a(getAddedById(), productPlanSubscription.getAddedById()) && s6c.m47909a(getProductAccountId(), productPlanSubscription.getProductAccountId()) && s6c.m47909a(getProductPlanId(), productPlanSubscription.getProductPlanId()) && s6c.m47909a(getPlanDescription(), productPlanSubscription.getPlanDescription()) && s6c.m47909a(getPlanStatus(), productPlanSubscription.getPlanStatus()) && s6c.m47909a(getPlanFeePerUnit(), productPlanSubscription.getPlanFeePerUnit()) && s6c.m47909a(getPlanFeeProRataPerUnit(), productPlanSubscription.getPlanFeeProRataPerUnit()) && s6c.m47909a(getPeriod(), productPlanSubscription.getPeriod()) && s6c.m47909a(getAmount(), productPlanSubscription.getAmount()) && s6c.m47909a(getCurrency(), productPlanSubscription.getCurrency()) && s6c.m47909a(getStatus(), productPlanSubscription.getStatus()) && s6c.m47909a(getNumberOfUnits(), productPlanSubscription.getNumberOfUnits()) && s6c.m47909a(getNumberOfFreeUnits(), productPlanSubscription.getNumberOfFreeUnits()) && s6c.m47909a(getUnitType(), productPlanSubscription.getUnitType()) && s6c.m47909a(getSubscriptionPaymentStatus(), productPlanSubscription.getSubscriptionPaymentStatus()) && s6c.m47909a(getSubscriptionStartDate(), productPlanSubscription.getSubscriptionStartDate()) && s6c.m47909a(getSubscriptionEndDate(), productPlanSubscription.getSubscriptionEndDate()) && s6c.m47909a(getCreatedAt(), productPlanSubscription.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), productPlanSubscription.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAddedById() {
        return this.addedById;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getId() {
        return this.id;
    }

    public Integer getNumberOfFreeUnits() {
        return this.numberOfFreeUnits;
    }

    public Integer getNumberOfUnits() {
        return this.numberOfUnits;
    }

    public String getPeriod() {
        return this.period;
    }

    public String getPlanDescription() {
        return this.planDescription;
    }

    public Integer getPlanFeePerUnit() {
        return this.planFeePerUnit;
    }

    public Integer getPlanFeeProRataPerUnit() {
        return this.planFeeProRataPerUnit;
    }

    public String getPlanStatus() {
        return this.planStatus;
    }

    public String getProductAccountId() {
        return this.productAccountId;
    }

    public ProductPlan getProductPlan() {
        return this.productPlan;
    }

    public String getProductPlanId() {
        return this.productPlanId;
    }

    public String getStatus() {
        return this.status;
    }

    public Temporal.DateTime getSubscriptionEndDate() {
        return this.subscriptionEndDate;
    }

    public String getSubscriptionPaymentStatus() {
        return this.subscriptionPaymentStatus;
    }

    public Temporal.DateTime getSubscriptionStartDate() {
        return this.subscriptionStartDate;
    }

    public String getUnitType() {
        return this.unitType;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getAddedById() + getProductAccountId() + getProductPlanId() + getPlanDescription() + getPlanStatus() + getPlanFeePerUnit() + getPlanFeeProRataPerUnit() + getPeriod() + getAmount() + getCurrency() + getStatus() + getNumberOfUnits() + getNumberOfFreeUnits() + getUnitType() + getSubscriptionPaymentStatus() + getSubscriptionStartDate() + getSubscriptionEndDate() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductPlanSubscription {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("addedById=" + String.valueOf(getAddedById()) + ", ");
        sb.append("productAccountId=" + String.valueOf(getProductAccountId()) + ", ");
        sb.append("productPlanId=" + String.valueOf(getProductPlanId()) + ", ");
        sb.append("planDescription=" + String.valueOf(getPlanDescription()) + ", ");
        sb.append("planStatus=" + String.valueOf(getPlanStatus()) + ", ");
        sb.append("planFeePerUnit=" + String.valueOf(getPlanFeePerUnit()) + ", ");
        sb.append("planFeeProRataPerUnit=" + String.valueOf(getPlanFeeProRataPerUnit()) + ", ");
        sb.append("period=" + String.valueOf(getPeriod()) + ", ");
        sb.append("amount=" + String.valueOf(getAmount()) + ", ");
        sb.append("currency=" + String.valueOf(getCurrency()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("numberOfUnits=" + String.valueOf(getNumberOfUnits()) + ", ");
        sb.append("numberOfFreeUnits=" + String.valueOf(getNumberOfFreeUnits()) + ", ");
        sb.append("unitType=" + String.valueOf(getUnitType()) + ", ");
        sb.append("subscriptionPaymentStatus=" + String.valueOf(getSubscriptionPaymentStatus()) + ", ");
        sb.append("subscriptionStartDate=" + String.valueOf(getSubscriptionStartDate()) + ", ");
        sb.append("subscriptionEndDate=" + String.valueOf(getSubscriptionEndDate()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ProductPlanSubscription(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, Integer num3, String str9, String str10, Integer num4, Integer num5, String str11, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
        this.productPlan = null;
        this.id = str;
        this.accountId = str2;
        this.addedById = str3;
        this.productAccountId = str4;
        this.productPlanId = str5;
        this.planDescription = str6;
        this.planStatus = str7;
        this.planFeePerUnit = num;
        this.planFeeProRataPerUnit = num2;
        this.period = str8;
        this.amount = num3;
        this.currency = str9;
        this.status = str10;
        this.numberOfUnits = num4;
        this.numberOfFreeUnits = num5;
        this.unitType = str11;
        this.subscriptionPaymentStatus = str12;
        this.subscriptionStartDate = dateTime;
        this.subscriptionEndDate = dateTime2;
        this.createdAt = dateTime3;
        this.updatedAt = dateTime4;
    }
}
