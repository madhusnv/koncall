package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class WaProductItem {
    private final String currency;
    private final Integer item_price;
    private final String product_retailer_id;
    private final Integer quantity;

    public interface BuildStep {
        WaProductItem build();

        BuildStep currency(String str);

        BuildStep itemPrice(Integer num);

        BuildStep productRetailerId(String str);

        BuildStep quantity(Integer num);
    }

    public static class Builder implements BuildStep {
        private String currency;
        private Integer item_price;
        private String product_retailer_id;
        private Integer quantity;

        @Override // com.amplifyframework.datastore.generated.model.WaProductItem.BuildStep
        public WaProductItem build() {
            return new WaProductItem(this.product_retailer_id, this.quantity, this.item_price, this.currency);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaProductItem.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaProductItem.BuildStep
        public BuildStep itemPrice(Integer num) {
            this.item_price = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaProductItem.BuildStep
        public BuildStep productRetailerId(String str) {
            this.product_retailer_id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WaProductItem.BuildStep
        public BuildStep quantity(Integer num) {
            this.quantity = num;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Integer num, Integer num2, String str2) {
            this.product_retailer_id = str;
            this.quantity = num;
            this.item_price = num2;
            this.currency = str2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, Integer num, Integer num2, String str2) {
            super(WaProductItem.this.product_retailer_id, num, WaProductItem.this.item_price, str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaProductItem.Builder, com.amplifyframework.datastore.generated.model.WaProductItem.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaProductItem.Builder, com.amplifyframework.datastore.generated.model.WaProductItem.BuildStep
        public CopyOfBuilder itemPrice(Integer num) {
            return (CopyOfBuilder) super.itemPrice(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaProductItem.Builder, com.amplifyframework.datastore.generated.model.WaProductItem.BuildStep
        public CopyOfBuilder productRetailerId(String str) {
            return (CopyOfBuilder) super.productRetailerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WaProductItem.Builder, com.amplifyframework.datastore.generated.model.WaProductItem.BuildStep
        public CopyOfBuilder quantity(Integer num) {
            return (CopyOfBuilder) super.quantity(num);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.product_retailer_id, this.quantity, this.item_price, this.currency);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WaProductItem.class != obj.getClass()) {
            return false;
        }
        WaProductItem waProductItem = (WaProductItem) obj;
        return s6c.m47909a(getProductRetailerId(), waProductItem.getProductRetailerId()) && s6c.m47909a(getQuantity(), waProductItem.getQuantity()) && s6c.m47909a(getItemPrice(), waProductItem.getItemPrice()) && s6c.m47909a(getCurrency(), waProductItem.getCurrency());
    }

    public String getCurrency() {
        return this.currency;
    }

    public Integer getItemPrice() {
        return this.item_price;
    }

    public String getProductRetailerId() {
        return this.product_retailer_id;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return (getProductRetailerId() + getQuantity() + getItemPrice() + getCurrency()).hashCode();
    }

    private WaProductItem(String str, Integer num, Integer num2, String str2) {
        this.product_retailer_id = str;
        this.quantity = num;
        this.item_price = num2;
        this.currency = str2;
    }
}
