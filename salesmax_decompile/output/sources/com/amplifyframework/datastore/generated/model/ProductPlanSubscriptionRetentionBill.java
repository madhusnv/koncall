package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ProductPlanSubscriptionRetentionBill {
    private final String currency;
    private final Integer fee;
    private final Temporal.DateTime newSubscriptionEndDate;
    private final Temporal.DateTime newSubscriptionStartDate;
    private final Integer numberOfUsers;
    private final String productPlanSubscriptionId;
    private final Integer totalFees;

    public interface BuildStep {
        ProductPlanSubscriptionRetentionBill build();

        BuildStep currency(String str);

        BuildStep fee(Integer num);

        BuildStep newSubscriptionEndDate(Temporal.DateTime dateTime);

        BuildStep newSubscriptionStartDate(Temporal.DateTime dateTime);

        BuildStep numberOfUsers(Integer num);

        BuildStep totalFees(Integer num);
    }

    public static class Builder implements ProductPlanSubscriptionIdStep, BuildStep {
        private String currency;
        private Integer fee;
        private Temporal.DateTime newSubscriptionEndDate;
        private Temporal.DateTime newSubscriptionStartDate;
        private Integer numberOfUsers;
        private String productPlanSubscriptionId;
        private Integer totalFees;

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public ProductPlanSubscriptionRetentionBill build() {
            return new ProductPlanSubscriptionRetentionBill(this.productPlanSubscriptionId, this.numberOfUsers, this.newSubscriptionStartDate, this.newSubscriptionEndDate, this.fee, this.totalFees, this.currency);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public BuildStep fee(Integer num) {
            this.fee = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public BuildStep newSubscriptionEndDate(Temporal.DateTime dateTime) {
            this.newSubscriptionEndDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public BuildStep newSubscriptionStartDate(Temporal.DateTime dateTime) {
            this.newSubscriptionStartDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public BuildStep numberOfUsers(Integer num) {
            this.numberOfUsers = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.ProductPlanSubscriptionIdStep
        public BuildStep productPlanSubscriptionId(String str) {
            Objects.requireNonNull(str);
            this.productPlanSubscriptionId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public BuildStep totalFees(Integer num) {
            this.totalFees = num;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Integer num, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Integer num2, Integer num3, String str2) {
            this.productPlanSubscriptionId = str;
            this.numberOfUsers = num;
            this.newSubscriptionStartDate = dateTime;
            this.newSubscriptionEndDate = dateTime2;
            this.fee = num2;
            this.totalFees = num3;
            this.currency = str2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, Integer num, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Integer num2, Integer num3, String str2) {
            super(str, num, dateTime, dateTime2, num2, num3, str2);
            Objects.requireNonNull(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public CopyOfBuilder fee(Integer num) {
            return (CopyOfBuilder) super.fee(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public CopyOfBuilder newSubscriptionEndDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.newSubscriptionEndDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public CopyOfBuilder newSubscriptionStartDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.newSubscriptionStartDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public CopyOfBuilder numberOfUsers(Integer num) {
            return (CopyOfBuilder) super.numberOfUsers(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.ProductPlanSubscriptionIdStep
        public CopyOfBuilder productPlanSubscriptionId(String str) {
            return (CopyOfBuilder) super.productPlanSubscriptionId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionRetentionBill.BuildStep
        public CopyOfBuilder totalFees(Integer num) {
            return (CopyOfBuilder) super.totalFees(num);
        }
    }

    public interface ProductPlanSubscriptionIdStep {
        BuildStep productPlanSubscriptionId(String str);
    }

    public static ProductPlanSubscriptionIdStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.productPlanSubscriptionId, this.numberOfUsers, this.newSubscriptionStartDate, this.newSubscriptionEndDate, this.fee, this.totalFees, this.currency);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProductPlanSubscriptionRetentionBill.class != obj.getClass()) {
            return false;
        }
        ProductPlanSubscriptionRetentionBill productPlanSubscriptionRetentionBill = (ProductPlanSubscriptionRetentionBill) obj;
        return s6c.m47909a(getProductPlanSubscriptionId(), productPlanSubscriptionRetentionBill.getProductPlanSubscriptionId()) && s6c.m47909a(getNumberOfUsers(), productPlanSubscriptionRetentionBill.getNumberOfUsers()) && s6c.m47909a(getNewSubscriptionStartDate(), productPlanSubscriptionRetentionBill.getNewSubscriptionStartDate()) && s6c.m47909a(getNewSubscriptionEndDate(), productPlanSubscriptionRetentionBill.getNewSubscriptionEndDate()) && s6c.m47909a(getFee(), productPlanSubscriptionRetentionBill.getFee()) && s6c.m47909a(getTotalFees(), productPlanSubscriptionRetentionBill.getTotalFees()) && s6c.m47909a(getCurrency(), productPlanSubscriptionRetentionBill.getCurrency());
    }

    public String getCurrency() {
        return this.currency;
    }

    public Integer getFee() {
        return this.fee;
    }

    public Temporal.DateTime getNewSubscriptionEndDate() {
        return this.newSubscriptionEndDate;
    }

    public Temporal.DateTime getNewSubscriptionStartDate() {
        return this.newSubscriptionStartDate;
    }

    public Integer getNumberOfUsers() {
        return this.numberOfUsers;
    }

    public String getProductPlanSubscriptionId() {
        return this.productPlanSubscriptionId;
    }

    public Integer getTotalFees() {
        return this.totalFees;
    }

    public int hashCode() {
        return (getProductPlanSubscriptionId() + getNumberOfUsers() + getNewSubscriptionStartDate() + getNewSubscriptionEndDate() + getFee() + getTotalFees() + getCurrency()).hashCode();
    }

    private ProductPlanSubscriptionRetentionBill(String str, Integer num, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Integer num2, Integer num3, String str2) {
        this.productPlanSubscriptionId = str;
        this.numberOfUsers = num;
        this.newSubscriptionStartDate = dateTime;
        this.newSubscriptionEndDate = dateTime2;
        this.fee = num2;
        this.totalFees = num3;
        this.currency = str2;
    }
}
