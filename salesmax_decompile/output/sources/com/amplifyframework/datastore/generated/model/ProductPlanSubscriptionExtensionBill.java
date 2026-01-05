package com.amplifyframework.datastore.generated.model;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ProductPlanSubscriptionExtensionBill {
    private final String currency;
    private final Integer fee;
    private final Integer newNumberOfUsers;
    private final String numUsersIncrementOnDayCurve;
    private final Integer oldNumberOfUsers;
    private final Integer proRataCharges;
    private final Integer proRataNumDays;
    private final String productPlanSubscriptionId;
    private final Integer totalFees;

    public interface BuildStep {
        ProductPlanSubscriptionExtensionBill build();

        BuildStep currency(String str);

        BuildStep fee(Integer num);

        BuildStep newNumberOfUsers(Integer num);

        BuildStep numUsersIncrementOnDayCurve(String str);

        BuildStep oldNumberOfUsers(Integer num);

        BuildStep proRataCharges(Integer num);

        BuildStep proRataNumDays(Integer num);

        BuildStep totalFees(Integer num);
    }

    public static class Builder implements ProductPlanSubscriptionIdStep, BuildStep {
        private String currency;
        private Integer fee;
        private Integer newNumberOfUsers;
        private String numUsersIncrementOnDayCurve;
        private Integer oldNumberOfUsers;
        private Integer proRataCharges;
        private Integer proRataNumDays;
        private String productPlanSubscriptionId;
        private Integer totalFees;

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public ProductPlanSubscriptionExtensionBill build() {
            return new ProductPlanSubscriptionExtensionBill(this.productPlanSubscriptionId, this.oldNumberOfUsers, this.newNumberOfUsers, this.numUsersIncrementOnDayCurve, this.fee, this.proRataNumDays, this.proRataCharges, this.totalFees, this.currency);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public BuildStep fee(Integer num) {
            this.fee = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public BuildStep newNumberOfUsers(Integer num) {
            this.newNumberOfUsers = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public BuildStep numUsersIncrementOnDayCurve(String str) {
            this.numUsersIncrementOnDayCurve = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public BuildStep oldNumberOfUsers(Integer num) {
            this.oldNumberOfUsers = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public BuildStep proRataCharges(Integer num) {
            this.proRataCharges = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public BuildStep proRataNumDays(Integer num) {
            this.proRataNumDays = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.ProductPlanSubscriptionIdStep
        public BuildStep productPlanSubscriptionId(String str) {
            Objects.requireNonNull(str);
            this.productPlanSubscriptionId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public BuildStep totalFees(Integer num) {
            this.totalFees = num;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, Integer num5, Integer num6, String str3) {
            this.productPlanSubscriptionId = str;
            this.oldNumberOfUsers = num;
            this.newNumberOfUsers = num2;
            this.numUsersIncrementOnDayCurve = str2;
            this.fee = num3;
            this.proRataNumDays = num4;
            this.proRataCharges = num5;
            this.totalFees = num6;
            this.currency = str3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, Integer num5, Integer num6, String str3) {
            super(str, num, num2, str2, num3, num4, num5, num6, str3);
            Objects.requireNonNull(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public CopyOfBuilder fee(Integer num) {
            return (CopyOfBuilder) super.fee(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public CopyOfBuilder newNumberOfUsers(Integer num) {
            return (CopyOfBuilder) super.newNumberOfUsers(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public CopyOfBuilder numUsersIncrementOnDayCurve(String str) {
            return (CopyOfBuilder) super.numUsersIncrementOnDayCurve(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public CopyOfBuilder oldNumberOfUsers(Integer num) {
            return (CopyOfBuilder) super.oldNumberOfUsers(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public CopyOfBuilder proRataCharges(Integer num) {
            return (CopyOfBuilder) super.proRataCharges(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
        public CopyOfBuilder proRataNumDays(Integer num) {
            return (CopyOfBuilder) super.proRataNumDays(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.ProductPlanSubscriptionIdStep
        public CopyOfBuilder productPlanSubscriptionId(String str) {
            return (CopyOfBuilder) super.productPlanSubscriptionId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.Builder, com.amplifyframework.datastore.generated.model.ProductPlanSubscriptionExtensionBill.BuildStep
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
        return new CopyOfBuilder(this.productPlanSubscriptionId, this.oldNumberOfUsers, this.newNumberOfUsers, this.numUsersIncrementOnDayCurve, this.fee, this.proRataNumDays, this.proRataCharges, this.totalFees, this.currency);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProductPlanSubscriptionExtensionBill.class != obj.getClass()) {
            return false;
        }
        ProductPlanSubscriptionExtensionBill productPlanSubscriptionExtensionBill = (ProductPlanSubscriptionExtensionBill) obj;
        return s6c.m47909a(getProductPlanSubscriptionId(), productPlanSubscriptionExtensionBill.getProductPlanSubscriptionId()) && s6c.m47909a(getOldNumberOfUsers(), productPlanSubscriptionExtensionBill.getOldNumberOfUsers()) && s6c.m47909a(getNewNumberOfUsers(), productPlanSubscriptionExtensionBill.getNewNumberOfUsers()) && s6c.m47909a(getNumUsersIncrementOnDayCurve(), productPlanSubscriptionExtensionBill.getNumUsersIncrementOnDayCurve()) && s6c.m47909a(getFee(), productPlanSubscriptionExtensionBill.getFee()) && s6c.m47909a(getProRataNumDays(), productPlanSubscriptionExtensionBill.getProRataNumDays()) && s6c.m47909a(getProRataCharges(), productPlanSubscriptionExtensionBill.getProRataCharges()) && s6c.m47909a(getTotalFees(), productPlanSubscriptionExtensionBill.getTotalFees()) && s6c.m47909a(getCurrency(), productPlanSubscriptionExtensionBill.getCurrency());
    }

    public String getCurrency() {
        return this.currency;
    }

    public Integer getFee() {
        return this.fee;
    }

    public Integer getNewNumberOfUsers() {
        return this.newNumberOfUsers;
    }

    public String getNumUsersIncrementOnDayCurve() {
        return this.numUsersIncrementOnDayCurve;
    }

    public Integer getOldNumberOfUsers() {
        return this.oldNumberOfUsers;
    }

    public Integer getProRataCharges() {
        return this.proRataCharges;
    }

    public Integer getProRataNumDays() {
        return this.proRataNumDays;
    }

    public String getProductPlanSubscriptionId() {
        return this.productPlanSubscriptionId;
    }

    public Integer getTotalFees() {
        return this.totalFees;
    }

    public int hashCode() {
        return (getProductPlanSubscriptionId() + getOldNumberOfUsers() + getNewNumberOfUsers() + getNumUsersIncrementOnDayCurve() + getFee() + getProRataNumDays() + getProRataCharges() + getTotalFees() + getCurrency()).hashCode();
    }

    private ProductPlanSubscriptionExtensionBill(String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, Integer num5, Integer num6, String str3) {
        this.productPlanSubscriptionId = str;
        this.oldNumberOfUsers = num;
        this.newNumberOfUsers = num2;
        this.numUsersIncrementOnDayCurve = str2;
        this.fee = num3;
        this.proRataNumDays = num4;
        this.proRataCharges = num5;
        this.totalFees = num6;
        this.currency = str3;
    }
}
