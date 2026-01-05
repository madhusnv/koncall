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
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "billStatus", "updatedAt"}, name = "byAccount")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "ProductAccountBills")
/* loaded from: classes5.dex */
public final class ProductAccountBills implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime billGeneratedFrom;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime billGeneratedTo;

    @ModelField(targetType = "String")
    private final String billStatus;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final String currency;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "ProductAccountBill")
    private final List<ProductAccountBill> productAccountBills;

    @ModelField(isRequired = true, targetType = "ID")
    private final String productAccountId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String productPlanId;

    @ModelField(targetType = "Int")
    private final Integer totalFees;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("ProductAccountBills", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ProductAccountBills", "accountId");
    public static final QueryField PRODUCT_ACCOUNT_ID = QueryField.field("ProductAccountBills", "productAccountId");
    public static final QueryField PRODUCT_PLAN_ID = QueryField.field("ProductAccountBills", "productPlanId");
    public static final QueryField PRODUCT_ACCOUNT_BILLS = QueryField.field("ProductAccountBills", "productAccountBills");
    public static final QueryField TOTAL_FEES = QueryField.field("ProductAccountBills", "totalFees");
    public static final QueryField CURRENCY = QueryField.field("ProductAccountBills", FirebaseAnalytics.Param.CURRENCY);
    public static final QueryField BILL_STATUS = QueryField.field("ProductAccountBills", "billStatus");
    public static final QueryField BILL_GENERATED_FROM = QueryField.field("ProductAccountBills", "billGeneratedFrom");
    public static final QueryField BILL_GENERATED_TO = QueryField.field("ProductAccountBills", "billGeneratedTo");
    public static final QueryField CREATED_AT = QueryField.field("ProductAccountBills", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ProductAccountBills", "updatedAt");

    public interface AccountIdStep {
        ProductAccountIdStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep billGeneratedFrom(Temporal.DateTime dateTime);

        BuildStep billGeneratedTo(Temporal.DateTime dateTime);

        BuildStep billStatus(String str);

        ProductAccountBills build();

        BuildStep currency(String str);

        BuildStep id(String str);

        BuildStep productAccountBills(List<ProductAccountBill> list);

        BuildStep totalFees(Integer num);
    }

    public static class Builder implements AccountIdStep, ProductAccountIdStep, ProductPlanIdStep, CreatedAtStep, UpdatedAtStep, BuildStep {
        private String accountId;
        private Temporal.DateTime billGeneratedFrom;
        private Temporal.DateTime billGeneratedTo;
        private String billStatus;
        private Temporal.DateTime createdAt;
        private String currency;
        private String id;
        private List<ProductAccountBill> productAccountBills;
        private String productAccountId;
        private String productPlanId;
        private Integer totalFees;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.AccountIdStep
        public ProductAccountIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public BuildStep billGeneratedFrom(Temporal.DateTime dateTime) {
            this.billGeneratedFrom = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public BuildStep billGeneratedTo(Temporal.DateTime dateTime) {
            this.billGeneratedTo = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public BuildStep billStatus(String str) {
            this.billStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public ProductAccountBills build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ProductAccountBills(string, this.accountId, this.productAccountId, this.productPlanId, this.productAccountBills, this.totalFees, this.currency, this.billStatus, this.billGeneratedFrom, this.billGeneratedTo, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.CreatedAtStep
        public UpdatedAtStep createdAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public BuildStep productAccountBills(List<ProductAccountBill> list) {
            this.productAccountBills = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.ProductAccountIdStep
        public ProductPlanIdStep productAccountId(String str) {
            Objects.requireNonNull(str);
            this.productAccountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.ProductPlanIdStep
        public CreatedAtStep productPlanId(String str) {
            Objects.requireNonNull(str);
            this.productPlanId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public BuildStep totalFees(Integer num) {
            this.totalFees = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.UpdatedAtStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, List<ProductAccountBill> list, Integer num, String str5, String str6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            this.id = str;
            this.accountId = str2;
            this.productAccountId = str3;
            this.productPlanId = str4;
            this.productAccountBills = list;
            this.totalFees = num;
            this.currency = str5;
            this.billStatus = str6;
            this.billGeneratedFrom = dateTime;
            this.billGeneratedTo = dateTime2;
            this.createdAt = dateTime3;
            this.updatedAt = dateTime4;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public /* bridge */ /* synthetic */ BuildStep productAccountBills(List list) {
            return productAccountBills((List<ProductAccountBill>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, List<ProductAccountBill> list, Integer num, String str5, String str6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            super(str, str2, str3, str4, list, num, str5, str6, dateTime, dateTime2, dateTime3, dateTime4);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(dateTime3);
            Objects.requireNonNull(dateTime4);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBills.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public CopyOfBuilder billGeneratedFrom(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.billGeneratedFrom(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public CopyOfBuilder billGeneratedTo(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.billGeneratedTo(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public CopyOfBuilder billStatus(String str) {
            return (CopyOfBuilder) super.billStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBills.CreatedAtStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public CopyOfBuilder productAccountBills(List<ProductAccountBill> list) {
            return (CopyOfBuilder) super.productAccountBills(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBills.ProductAccountIdStep
        public CopyOfBuilder productAccountId(String str) {
            return (CopyOfBuilder) super.productAccountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBills.ProductPlanIdStep
        public CopyOfBuilder productPlanId(String str) {
            return (CopyOfBuilder) super.productPlanId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBills.BuildStep
        public CopyOfBuilder totalFees(Integer num) {
            return (CopyOfBuilder) super.totalFees(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBills.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBills.UpdatedAtStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface CreatedAtStep {
        UpdatedAtStep createdAt(Temporal.DateTime dateTime);
    }

    public interface ProductAccountIdStep {
        ProductPlanIdStep productAccountId(String str);
    }

    public interface ProductPlanIdStep {
        CreatedAtStep productPlanId(String str);
    }

    public interface UpdatedAtStep {
        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ProductAccountBills justId(String str) {
        return new ProductAccountBills(str, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.productAccountId, this.productPlanId, this.productAccountBills, this.totalFees, this.currency, this.billStatus, this.billGeneratedFrom, this.billGeneratedTo, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProductAccountBills.class != obj.getClass()) {
            return false;
        }
        ProductAccountBills productAccountBills = (ProductAccountBills) obj;
        return s6c.m47909a(getId(), productAccountBills.getId()) && s6c.m47909a(getAccountId(), productAccountBills.getAccountId()) && s6c.m47909a(getProductAccountId(), productAccountBills.getProductAccountId()) && s6c.m47909a(getProductPlanId(), productAccountBills.getProductPlanId()) && s6c.m47909a(getProductAccountBills(), productAccountBills.getProductAccountBills()) && s6c.m47909a(getTotalFees(), productAccountBills.getTotalFees()) && s6c.m47909a(getCurrency(), productAccountBills.getCurrency()) && s6c.m47909a(getBillStatus(), productAccountBills.getBillStatus()) && s6c.m47909a(getBillGeneratedFrom(), productAccountBills.getBillGeneratedFrom()) && s6c.m47909a(getBillGeneratedTo(), productAccountBills.getBillGeneratedTo()) && s6c.m47909a(getCreatedAt(), productAccountBills.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), productAccountBills.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getBillGeneratedFrom() {
        return this.billGeneratedFrom;
    }

    public Temporal.DateTime getBillGeneratedTo() {
        return this.billGeneratedTo;
    }

    public String getBillStatus() {
        return this.billStatus;
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

    public List<ProductAccountBill> getProductAccountBills() {
        return this.productAccountBills;
    }

    public String getProductAccountId() {
        return this.productAccountId;
    }

    public String getProductPlanId() {
        return this.productPlanId;
    }

    public Integer getTotalFees() {
        return this.totalFees;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getProductAccountId() + getProductPlanId() + getProductAccountBills() + getTotalFees() + getCurrency() + getBillStatus() + getBillGeneratedFrom() + getBillGeneratedTo() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductAccountBills {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("productAccountId=" + String.valueOf(getProductAccountId()) + ", ");
        sb.append("productPlanId=" + String.valueOf(getProductPlanId()) + ", ");
        sb.append("productAccountBills=" + String.valueOf(getProductAccountBills()) + ", ");
        sb.append("totalFees=" + String.valueOf(getTotalFees()) + ", ");
        sb.append("currency=" + String.valueOf(getCurrency()) + ", ");
        sb.append("billStatus=" + String.valueOf(getBillStatus()) + ", ");
        sb.append("billGeneratedFrom=" + String.valueOf(getBillGeneratedFrom()) + ", ");
        sb.append("billGeneratedTo=" + String.valueOf(getBillGeneratedTo()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ProductAccountBills(String str, String str2, String str3, String str4, List<ProductAccountBill> list, Integer num, String str5, String str6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
        this.id = str;
        this.accountId = str2;
        this.productAccountId = str3;
        this.productPlanId = str4;
        this.productAccountBills = list;
        this.totalFees = num;
        this.currency = str5;
        this.billStatus = str6;
        this.billGeneratedFrom = dateTime;
        this.billGeneratedTo = dateTime2;
        this.createdAt = dateTime3;
        this.updatedAt = dateTime4;
    }
}
