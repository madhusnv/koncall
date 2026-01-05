package com.amplifyframework.datastore.generated.model;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ProductServiceUnit {
    private final Integer negotiatedPricePerUnit;
    private final String productId;
    private final Integer units;

    public interface BuildStep {
        ProductServiceUnit build();

        BuildStep negotiatedPricePerUnit(Integer num);

        BuildStep units(Integer num);
    }

    public static class Builder implements ProductIdStep, BuildStep {
        private Integer negotiatedPricePerUnit;
        private String productId;
        private Integer units;

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceUnit.BuildStep
        public ProductServiceUnit build() {
            return new ProductServiceUnit(this.productId, this.units, this.negotiatedPricePerUnit);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceUnit.BuildStep
        public BuildStep negotiatedPricePerUnit(Integer num) {
            this.negotiatedPricePerUnit = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceUnit.ProductIdStep
        public BuildStep productId(String str) {
            Objects.requireNonNull(str);
            this.productId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceUnit.BuildStep
        public BuildStep units(Integer num) {
            this.units = num;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Integer num, Integer num2) {
            this.productId = str;
            this.units = num;
            this.negotiatedPricePerUnit = num2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, Integer num, Integer num2) {
            super(str, num, num2);
            Objects.requireNonNull(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceUnit.Builder, com.amplifyframework.datastore.generated.model.ProductServiceUnit.BuildStep
        public CopyOfBuilder negotiatedPricePerUnit(Integer num) {
            return (CopyOfBuilder) super.negotiatedPricePerUnit(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceUnit.Builder, com.amplifyframework.datastore.generated.model.ProductServiceUnit.ProductIdStep
        public CopyOfBuilder productId(String str) {
            return (CopyOfBuilder) super.productId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceUnit.Builder, com.amplifyframework.datastore.generated.model.ProductServiceUnit.BuildStep
        public CopyOfBuilder units(Integer num) {
            return (CopyOfBuilder) super.units(num);
        }
    }

    public interface ProductIdStep {
        BuildStep productId(String str);
    }

    public static ProductIdStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.productId, this.units, this.negotiatedPricePerUnit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProductServiceUnit.class != obj.getClass()) {
            return false;
        }
        ProductServiceUnit productServiceUnit = (ProductServiceUnit) obj;
        return s6c.m47909a(getProductId(), productServiceUnit.getProductId()) && s6c.m47909a(getUnits(), productServiceUnit.getUnits()) && s6c.m47909a(getNegotiatedPricePerUnit(), productServiceUnit.getNegotiatedPricePerUnit());
    }

    public Integer getNegotiatedPricePerUnit() {
        return this.negotiatedPricePerUnit;
    }

    public String getProductId() {
        return this.productId;
    }

    public Integer getUnits() {
        return this.units;
    }

    public int hashCode() {
        return (getProductId() + getUnits() + getNegotiatedPricePerUnit()).hashCode();
    }

    private ProductServiceUnit(String str, Integer num, Integer num2) {
        this.productId = str;
        this.units = num;
        this.negotiatedPricePerUnit = num2;
    }
}
