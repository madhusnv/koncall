package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
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

@Index(fields = {"accountId", "planStatus"}, name = "byAccount")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "ProductPlans")
/* loaded from: classes5.dex */
public final class ProductPlan implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "String")
    private final String currency;

    @ModelField(isRequired = true, targetType = "Int")
    private final Integer fee;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(isRequired = true, targetType = "String")
    private final String period;

    @ModelField(targetType = "String")
    private final String planDescription;

    @ModelField(isRequired = true, targetType = "String")
    private final String planStatus;

    @ModelField(targetType = "Int")
    private final Integer proRataFee;

    @ModelField(isRequired = true, targetType = "ID")
    private final String productId;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("ProductPlan", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ProductPlan", "accountId");
    public static final QueryField PRODUCT_ID = QueryField.field("ProductPlan", "productId");
    public static final QueryField PLAN_DESCRIPTION = QueryField.field("ProductPlan", "planDescription");
    public static final QueryField PLAN_STATUS = QueryField.field("ProductPlan", "planStatus");
    public static final QueryField PERIOD = QueryField.field("ProductPlan", "period");
    public static final QueryField FEE = QueryField.field("ProductPlan", "fee");
    public static final QueryField PRO_RATA_FEE = QueryField.field("ProductPlan", "proRataFee");
    public static final QueryField CURRENCY = QueryField.field("ProductPlan", FirebaseAnalytics.Param.CURRENCY);
    public static final QueryField CREATED_AT = QueryField.field("ProductPlan", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ProductPlan", "updatedAt");

    public interface AccountIdStep {
        ProductIdStep accountId(String str);
    }

    public interface BuildStep {
        ProductPlan build();

        BuildStep id(String str);

        BuildStep planDescription(String str);

        BuildStep proRataFee(Integer num);
    }

    public static class Builder implements AccountIdStep, ProductIdStep, PlanStatusStep, PeriodStep, FeeStep, CurrencyStep, CreatedAtStep, UpdatedAtStep, BuildStep {
        private String accountId;
        private Temporal.DateTime createdAt;
        private String currency;
        private Integer fee;
        private String id;
        private String period;
        private String planDescription;
        private String planStatus;
        private Integer proRataFee;
        private String productId;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.AccountIdStep
        public ProductIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.BuildStep
        public ProductPlan build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ProductPlan(string, this.accountId, this.productId, this.planDescription, this.planStatus, this.period, this.fee, this.proRataFee, this.currency, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.CreatedAtStep
        public UpdatedAtStep createdAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.CurrencyStep
        public CreatedAtStep currency(String str) {
            Objects.requireNonNull(str);
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.FeeStep
        public CurrencyStep fee(Integer num) {
            Objects.requireNonNull(num);
            this.fee = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.PeriodStep
        public FeeStep period(String str) {
            Objects.requireNonNull(str);
            this.period = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.BuildStep
        public BuildStep planDescription(String str) {
            this.planDescription = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.PlanStatusStep
        public PeriodStep planStatus(String str) {
            Objects.requireNonNull(str);
            this.planStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.BuildStep
        public BuildStep proRataFee(Integer num) {
            this.proRataFee = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.ProductIdStep
        public PlanStatusStep productId(String str) {
            Objects.requireNonNull(str);
            this.productId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.UpdatedAtStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.productId = str3;
            this.planDescription = str4;
            this.planStatus = str5;
            this.period = str6;
            this.fee = num;
            this.proRataFee = num2;
            this.currency = str7;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, str5, str6, num, num2, str7, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str5);
            Objects.requireNonNull(str6);
            Objects.requireNonNull(num);
            Objects.requireNonNull(str7);
            Objects.requireNonNull(dateTime);
            Objects.requireNonNull(dateTime2);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.Builder, com.amplifyframework.datastore.generated.model.ProductPlan.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.Builder, com.amplifyframework.datastore.generated.model.ProductPlan.CreatedAtStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.Builder, com.amplifyframework.datastore.generated.model.ProductPlan.CurrencyStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.Builder, com.amplifyframework.datastore.generated.model.ProductPlan.FeeStep
        public CopyOfBuilder fee(Integer num) {
            return (CopyOfBuilder) super.fee(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.Builder, com.amplifyframework.datastore.generated.model.ProductPlan.PeriodStep
        public CopyOfBuilder period(String str) {
            return (CopyOfBuilder) super.period(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.Builder, com.amplifyframework.datastore.generated.model.ProductPlan.BuildStep
        public CopyOfBuilder planDescription(String str) {
            return (CopyOfBuilder) super.planDescription(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.Builder, com.amplifyframework.datastore.generated.model.ProductPlan.PlanStatusStep
        public CopyOfBuilder planStatus(String str) {
            return (CopyOfBuilder) super.planStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.Builder, com.amplifyframework.datastore.generated.model.ProductPlan.BuildStep
        public CopyOfBuilder proRataFee(Integer num) {
            return (CopyOfBuilder) super.proRataFee(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.Builder, com.amplifyframework.datastore.generated.model.ProductPlan.ProductIdStep
        public CopyOfBuilder productId(String str) {
            return (CopyOfBuilder) super.productId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlan.Builder, com.amplifyframework.datastore.generated.model.ProductPlan.UpdatedAtStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface CreatedAtStep {
        UpdatedAtStep createdAt(Temporal.DateTime dateTime);
    }

    public interface CurrencyStep {
        CreatedAtStep currency(String str);
    }

    public interface FeeStep {
        CurrencyStep fee(Integer num);
    }

    public interface PeriodStep {
        FeeStep period(String str);
    }

    public interface PlanStatusStep {
        PeriodStep planStatus(String str);
    }

    public interface ProductIdStep {
        PlanStatusStep productId(String str);
    }

    public interface UpdatedAtStep {
        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ProductPlan justId(String str) {
        return new ProductPlan(str, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.productId, this.planDescription, this.planStatus, this.period, this.fee, this.proRataFee, this.currency, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProductPlan.class != obj.getClass()) {
            return false;
        }
        ProductPlan productPlan = (ProductPlan) obj;
        return s6c.m47909a(getId(), productPlan.getId()) && s6c.m47909a(getAccountId(), productPlan.getAccountId()) && s6c.m47909a(getProductId(), productPlan.getProductId()) && s6c.m47909a(getPlanDescription(), productPlan.getPlanDescription()) && s6c.m47909a(getPlanStatus(), productPlan.getPlanStatus()) && s6c.m47909a(getPeriod(), productPlan.getPeriod()) && s6c.m47909a(getFee(), productPlan.getFee()) && s6c.m47909a(getProRataFee(), productPlan.getProRataFee()) && s6c.m47909a(getCurrency(), productPlan.getCurrency()) && s6c.m47909a(getCreatedAt(), productPlan.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), productPlan.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Integer getFee() {
        return this.fee;
    }

    public String getId() {
        return this.id;
    }

    public String getPeriod() {
        return this.period;
    }

    public String getPlanDescription() {
        return this.planDescription;
    }

    public String getPlanStatus() {
        return this.planStatus;
    }

    public Integer getProRataFee() {
        return this.proRataFee;
    }

    public String getProductId() {
        return this.productId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getProductId() + getPlanDescription() + getPlanStatus() + getPeriod() + getFee() + getProRataFee() + getCurrency() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductPlan {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("productId=" + String.valueOf(getProductId()) + ", ");
        sb.append("planDescription=" + String.valueOf(getPlanDescription()) + ", ");
        sb.append("planStatus=" + String.valueOf(getPlanStatus()) + ", ");
        sb.append("period=" + String.valueOf(getPeriod()) + ", ");
        sb.append("fee=" + String.valueOf(getFee()) + ", ");
        sb.append("proRataFee=" + String.valueOf(getProRataFee()) + ", ");
        sb.append("currency=" + String.valueOf(getCurrency()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ProductPlan(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.productId = str3;
        this.planDescription = str4;
        this.planStatus = str5;
        this.period = str6;
        this.fee = num;
        this.proRataFee = num2;
        this.currency = str7;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
