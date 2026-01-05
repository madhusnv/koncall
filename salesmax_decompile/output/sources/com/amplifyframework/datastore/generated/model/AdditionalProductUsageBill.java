package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class AdditionalProductUsageBill {
    private final String currency;
    private final Integer fee;
    private final String numUsersRemovedOnDayCurve;
    private final Integer numberOfUnits;
    private final String productPlanId;
    private final Integer totalFees;

    public interface BuildStep {
        AdditionalProductUsageBill build();

        BuildStep currency(String str);

        BuildStep fee(Integer num);

        BuildStep numUsersRemovedOnDayCurve(String str);

        BuildStep numberOfUnits(Integer num);

        BuildStep productPlanId(String str);

        BuildStep totalFees(Integer num);
    }

    public static class Builder implements BuildStep {
        private String currency;
        private Integer fee;
        private String numUsersRemovedOnDayCurve;
        private Integer numberOfUnits;
        private String productPlanId;
        private Integer totalFees;

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public AdditionalProductUsageBill build() {
            return new AdditionalProductUsageBill(this.productPlanId, this.numUsersRemovedOnDayCurve, this.fee, this.numberOfUnits, this.totalFees, this.currency);
        }

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public BuildStep fee(Integer num) {
            this.fee = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public BuildStep numUsersRemovedOnDayCurve(String str) {
            this.numUsersRemovedOnDayCurve = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public BuildStep numberOfUnits(Integer num) {
            this.numberOfUnits = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public BuildStep productPlanId(String str) {
            this.productPlanId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public BuildStep totalFees(Integer num) {
            this.totalFees = num;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Integer num, Integer num2, Integer num3, String str3) {
            this.productPlanId = str;
            this.numUsersRemovedOnDayCurve = str2;
            this.fee = num;
            this.numberOfUnits = num2;
            this.totalFees = num3;
            this.currency = str3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Integer num, Integer num2, Integer num3, String str3) {
            super(str, str2, num, num2, num3, str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.Builder, com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.Builder, com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public CopyOfBuilder fee(Integer num) {
            return (CopyOfBuilder) super.fee(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.Builder, com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public CopyOfBuilder numUsersRemovedOnDayCurve(String str) {
            return (CopyOfBuilder) super.numUsersRemovedOnDayCurve(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.Builder, com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public CopyOfBuilder numberOfUnits(Integer num) {
            return (CopyOfBuilder) super.numberOfUnits(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.Builder, com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public CopyOfBuilder productPlanId(String str) {
            return (CopyOfBuilder) super.productPlanId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.Builder, com.amplifyframework.datastore.generated.model.AdditionalProductUsageBill.BuildStep
        public CopyOfBuilder totalFees(Integer num) {
            return (CopyOfBuilder) super.totalFees(num);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.productPlanId, this.numUsersRemovedOnDayCurve, this.fee, this.numberOfUnits, this.totalFees, this.currency);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdditionalProductUsageBill.class != obj.getClass()) {
            return false;
        }
        AdditionalProductUsageBill additionalProductUsageBill = (AdditionalProductUsageBill) obj;
        return s6c.m47909a(getProductPlanId(), additionalProductUsageBill.getProductPlanId()) && s6c.m47909a(getNumUsersRemovedOnDayCurve(), additionalProductUsageBill.getNumUsersRemovedOnDayCurve()) && s6c.m47909a(getFee(), additionalProductUsageBill.getFee()) && s6c.m47909a(getNumberOfUnits(), additionalProductUsageBill.getNumberOfUnits()) && s6c.m47909a(getTotalFees(), additionalProductUsageBill.getTotalFees()) && s6c.m47909a(getCurrency(), additionalProductUsageBill.getCurrency());
    }

    public String getCurrency() {
        return this.currency;
    }

    public Integer getFee() {
        return this.fee;
    }

    public String getNumUsersRemovedOnDayCurve() {
        return this.numUsersRemovedOnDayCurve;
    }

    public Integer getNumberOfUnits() {
        return this.numberOfUnits;
    }

    public String getProductPlanId() {
        return this.productPlanId;
    }

    public Integer getTotalFees() {
        return this.totalFees;
    }

    public int hashCode() {
        return (getProductPlanId() + getNumUsersRemovedOnDayCurve() + getFee() + getNumberOfUnits() + getTotalFees() + getCurrency()).hashCode();
    }

    private AdditionalProductUsageBill(String str, String str2, Integer num, Integer num2, Integer num3, String str3) {
        this.productPlanId = str;
        this.numUsersRemovedOnDayCurve = str2;
        this.fee = num;
        this.numberOfUnits = num2;
        this.totalFees = num3;
        this.currency = str3;
    }
}
