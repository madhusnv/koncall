package com.amplifyframework.datastore.generated.model;

import java.util.List;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ProductAccountBill {
    private final String accountId;
    private final AdditionalProductUsageBill additionalProductUsageBill;
    private final String currency;
    private final String productId;
    private final List<ProductPlanSubscriptionExtensionBill> productSubscriptionExtensionBillOptions;
    private final List<ProductPlanSubscriptionRetentionBill> productSubscriptionRetentionBills;
    private final Integer totalFees;

    public interface AccountIdStep {
        ProductIdStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep additionalProductUsageBill(AdditionalProductUsageBill additionalProductUsageBill);

        ProductAccountBill build();

        BuildStep currency(String str);

        BuildStep productSubscriptionExtensionBillOptions(List<ProductPlanSubscriptionExtensionBill> list);

        BuildStep productSubscriptionRetentionBills(List<ProductPlanSubscriptionRetentionBill> list);

        BuildStep totalFees(Integer num);
    }

    public static class Builder implements AccountIdStep, ProductIdStep, BuildStep {
        private String accountId;
        private AdditionalProductUsageBill additionalProductUsageBill;
        private String currency;
        private String productId;
        private List<ProductPlanSubscriptionExtensionBill> productSubscriptionExtensionBillOptions;
        private List<ProductPlanSubscriptionRetentionBill> productSubscriptionRetentionBills;
        private Integer totalFees;

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.AccountIdStep
        public ProductIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public BuildStep additionalProductUsageBill(AdditionalProductUsageBill additionalProductUsageBill) {
            this.additionalProductUsageBill = additionalProductUsageBill;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public ProductAccountBill build() {
            return new ProductAccountBill(this.accountId, this.productId, this.additionalProductUsageBill, this.productSubscriptionExtensionBillOptions, this.productSubscriptionRetentionBills, this.totalFees, this.currency);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.ProductIdStep
        public BuildStep productId(String str) {
            Objects.requireNonNull(str);
            this.productId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public BuildStep productSubscriptionExtensionBillOptions(List<ProductPlanSubscriptionExtensionBill> list) {
            this.productSubscriptionExtensionBillOptions = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public BuildStep productSubscriptionRetentionBills(List<ProductPlanSubscriptionRetentionBill> list) {
            this.productSubscriptionRetentionBills = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public BuildStep totalFees(Integer num) {
            this.totalFees = num;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, AdditionalProductUsageBill additionalProductUsageBill, List<ProductPlanSubscriptionExtensionBill> list, List<ProductPlanSubscriptionRetentionBill> list2, Integer num, String str3) {
            this.accountId = str;
            this.productId = str2;
            this.additionalProductUsageBill = additionalProductUsageBill;
            this.productSubscriptionExtensionBillOptions = list;
            this.productSubscriptionRetentionBills = list2;
            this.totalFees = num;
            this.currency = str3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public /* bridge */ /* synthetic */ BuildStep productSubscriptionExtensionBillOptions(List list) {
            return productSubscriptionExtensionBillOptions((List<ProductPlanSubscriptionExtensionBill>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public /* bridge */ /* synthetic */ BuildStep productSubscriptionRetentionBills(List list) {
            return productSubscriptionRetentionBills((List<ProductPlanSubscriptionRetentionBill>) list);
        }

        private CopyOfBuilder(String str, String str2, AdditionalProductUsageBill additionalProductUsageBill, List<ProductPlanSubscriptionExtensionBill> list, List<ProductPlanSubscriptionRetentionBill> list2, Integer num, String str3) {
            super(str, str2, additionalProductUsageBill, list, list2, num, str3);
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBill.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public CopyOfBuilder additionalProductUsageBill(AdditionalProductUsageBill additionalProductUsageBill) {
            return (CopyOfBuilder) super.additionalProductUsageBill(additionalProductUsageBill);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBill.ProductIdStep
        public CopyOfBuilder productId(String str) {
            return (CopyOfBuilder) super.productId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public CopyOfBuilder productSubscriptionExtensionBillOptions(List<ProductPlanSubscriptionExtensionBill> list) {
            return (CopyOfBuilder) super.productSubscriptionExtensionBillOptions(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public CopyOfBuilder productSubscriptionRetentionBills(List<ProductPlanSubscriptionRetentionBill> list) {
            return (CopyOfBuilder) super.productSubscriptionRetentionBills(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductAccountBill.Builder, com.amplifyframework.datastore.generated.model.ProductAccountBill.BuildStep
        public CopyOfBuilder totalFees(Integer num) {
            return (CopyOfBuilder) super.totalFees(num);
        }
    }

    public interface ProductIdStep {
        BuildStep productId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.accountId, this.productId, this.additionalProductUsageBill, this.productSubscriptionExtensionBillOptions, this.productSubscriptionRetentionBills, this.totalFees, this.currency);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProductAccountBill.class != obj.getClass()) {
            return false;
        }
        ProductAccountBill productAccountBill = (ProductAccountBill) obj;
        return s6c.m47909a(getAccountId(), productAccountBill.getAccountId()) && s6c.m47909a(getProductId(), productAccountBill.getProductId()) && s6c.m47909a(getAdditionalProductUsageBill(), productAccountBill.getAdditionalProductUsageBill()) && s6c.m47909a(getProductSubscriptionExtensionBillOptions(), productAccountBill.getProductSubscriptionExtensionBillOptions()) && s6c.m47909a(getProductSubscriptionRetentionBills(), productAccountBill.getProductSubscriptionRetentionBills()) && s6c.m47909a(getTotalFees(), productAccountBill.getTotalFees()) && s6c.m47909a(getCurrency(), productAccountBill.getCurrency());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public AdditionalProductUsageBill getAdditionalProductUsageBill() {
        return this.additionalProductUsageBill;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getProductId() {
        return this.productId;
    }

    public List<ProductPlanSubscriptionExtensionBill> getProductSubscriptionExtensionBillOptions() {
        return this.productSubscriptionExtensionBillOptions;
    }

    public List<ProductPlanSubscriptionRetentionBill> getProductSubscriptionRetentionBills() {
        return this.productSubscriptionRetentionBills;
    }

    public Integer getTotalFees() {
        return this.totalFees;
    }

    public int hashCode() {
        return (getAccountId() + getProductId() + getAdditionalProductUsageBill() + getProductSubscriptionExtensionBillOptions() + getProductSubscriptionRetentionBills() + getTotalFees() + getCurrency()).hashCode();
    }

    private ProductAccountBill(String str, String str2, AdditionalProductUsageBill additionalProductUsageBill, List<ProductPlanSubscriptionExtensionBill> list, List<ProductPlanSubscriptionRetentionBill> list2, Integer num, String str3) {
        this.accountId = str;
        this.productId = str2;
        this.additionalProductUsageBill = additionalProductUsageBill;
        this.productSubscriptionExtensionBillOptions = list;
        this.productSubscriptionRetentionBills = list2;
        this.totalFees = num;
        this.currency = str3;
    }
}
