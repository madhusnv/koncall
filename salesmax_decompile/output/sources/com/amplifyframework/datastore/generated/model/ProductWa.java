package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class ProductWa {
    private final String product_retailer_id;

    public interface BuildStep {
        ProductWa build();

        BuildStep productRetailerId(String str);
    }

    public static class Builder implements BuildStep {
        private String product_retailer_id;

        @Override // com.amplifyframework.datastore.generated.model.ProductWa.BuildStep
        public ProductWa build() {
            return new ProductWa(this.product_retailer_id);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductWa.BuildStep
        public BuildStep productRetailerId(String str) {
            this.product_retailer_id = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str) {
            this.product_retailer_id = str;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str) {
            super(ProductWa.this.product_retailer_id);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductWa.Builder, com.amplifyframework.datastore.generated.model.ProductWa.BuildStep
        public CopyOfBuilder productRetailerId(String str) {
            return (CopyOfBuilder) super.productRetailerId(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.product_retailer_id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProductWa.class != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(getProductRetailerId(), ((ProductWa) obj).getProductRetailerId());
    }

    public String getProductRetailerId() {
        return this.product_retailer_id;
    }

    public int hashCode() {
        return (getProductRetailerId()).hashCode();
    }

    private ProductWa(String str) {
        this.product_retailer_id = str;
    }
}
