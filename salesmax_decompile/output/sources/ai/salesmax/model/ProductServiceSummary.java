package ai.salesmax.model;

import ai.salesmax.model.ProductServiceSummary;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.ProductService;
import com.amplifyframework.datastore.generated.model.ProductServiceType;
import java.io.IOException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import p001o.id5;
import p001o.lpi;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ProductServiceSummary {
    private final String accountId;
    private ProductService underlyerProductService;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final ProductService newInstance() {
            ProductService productServiceBuild = ProductService.builder().accountId("").id("").build();
            sq8.m48648g(productServiceBuild, "build(...)");
            return productServiceBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductServiceSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_createdAt_$lambda$15(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_updatedAt_$lambda$14(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final Long getCreatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyerProductService.getCreatedAt());
        final ProductServiceSummary$createdAt$1 productServiceSummary$createdAt$1 = ProductServiceSummary$createdAt$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.ukd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ProductServiceSummary._get_createdAt_$lambda$15(productServiceSummary$createdAt$1, obj);
            }
        }).orElse(null);
    }

    public final LeadsUser getCreatedBy() {
        return lpi.a0(this.underlyerProductService.getCreatedBy());
    }

    public final String getCurrency() {
        String currency = this.underlyerProductService.getCurrency();
        return currency == null ? "" : currency;
    }

    public final String getDescription() {
        String description = this.underlyerProductService.getDescription();
        return description == null ? "" : description;
    }

    public final String getHsCode() {
        String hsCode = this.underlyerProductService.getHsCode();
        return hsCode == null ? "" : hsCode;
    }

    public final String getId() {
        String id = this.underlyerProductService.getId();
        return id == null ? "" : id;
    }

    public final Integer getIncrementBy() {
        Integer incrementBy = this.underlyerProductService.getIncrementBy();
        if (incrementBy != null) {
            return Integer.valueOf(incrementBy.intValue() | 0);
        }
        return null;
    }

    public final String getMeasurementUnit() {
        String measurementUnit = this.underlyerProductService.getMeasurementUnit();
        return measurementUnit == null ? "" : measurementUnit;
    }

    public final String getName() {
        String name = this.underlyerProductService.getName();
        return name == null ? "" : name;
    }

    public final ProductServiceSummary getParentProduct() {
        ProductService parentProduct = this.underlyerProductService.getParentProduct();
        if (parentProduct != null) {
            return new ProductServiceSummary(parentProduct);
        }
        return null;
    }

    public final String getParentProductId() {
        ProductService parentProduct = this.underlyerProductService.getParentProduct();
        String id = parentProduct != null ? parentProduct.getId() : null;
        return id == null ? "" : id;
    }

    public final String getProductPicture() {
        String productPicture = this.underlyerProductService.getProductPicture();
        return productPicture == null ? "" : productPicture;
    }

    public final String getSkuCode() {
        String skuCode = this.underlyerProductService.getSkuCode();
        return skuCode == null ? "" : skuCode;
    }

    public final String getStandardPricePerUnit() {
        String standardPricePerUnit = this.underlyerProductService.getStandardPricePerUnit();
        return standardPricePerUnit == null ? "" : standardPricePerUnit;
    }

    public final String getType() {
        ProductServiceType type2 = this.underlyerProductService.getType();
        String strName = type2 != null ? type2.name() : null;
        return strName == null ? "" : strName;
    }

    public final ProductService getUnderlyerProductService() {
        return this.underlyerProductService;
    }

    public final Long getUpdatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyerProductService.getUpdatedAt());
        final ProductServiceSummary$updatedAt$1 productServiceSummary$updatedAt$1 = ProductServiceSummary$updatedAt$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.vkd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ProductServiceSummary._get_updatedAt_$lambda$14(productServiceSummary$updatedAt$1, obj);
            }
        }).orElse(null);
    }

    public final LeadsUser getUpdatedBy() {
        return lpi.a0(this.underlyerProductService.getUpdatedBy());
    }

    public final void setCurrency(String str) {
        if (StringUtils.isBlank(str) || str == null) {
            return;
        }
        ProductService productServiceBuild = this.underlyerProductService.copyOfBuilder().currency(str).build();
        sq8.m48648g(productServiceBuild, "build(...)");
        this.underlyerProductService = productServiceBuild;
    }

    public final void setDescription(String str) {
        if (str != null) {
            ProductService productServiceBuild = this.underlyerProductService.copyOfBuilder().description(str).build();
            sq8.m48648g(productServiceBuild, "build(...)");
            this.underlyerProductService = productServiceBuild;
        }
    }

    public final void setHsCode(String str) {
        if (StringUtils.isBlank(str) || str == null) {
            return;
        }
        ProductService productServiceBuild = this.underlyerProductService.copyOfBuilder().hsCode(str).build();
        sq8.m48648g(productServiceBuild, "build(...)");
        this.underlyerProductService = productServiceBuild;
    }

    public final void setIncrementBy(Integer num) {
        if (Objects.isNull(num) || num == null) {
            return;
        }
        ProductService productServiceBuild = this.underlyerProductService.copyOfBuilder().incrementBy(Integer.valueOf(num.intValue())).build();
        sq8.m48648g(productServiceBuild, "build(...)");
        this.underlyerProductService = productServiceBuild;
    }

    public final void setMeasurementUnit(String str) {
        if (StringUtils.isBlank(str) || str == null) {
            return;
        }
        ProductService productServiceBuild = this.underlyerProductService.copyOfBuilder().measurementUnit(str).build();
        sq8.m48648g(productServiceBuild, "build(...)");
        this.underlyerProductService = productServiceBuild;
    }

    public final void setName(String str) {
        if (str != null) {
            ProductService productServiceBuild = this.underlyerProductService.copyOfBuilder().name(str).build();
            sq8.m48648g(productServiceBuild, "build(...)");
            this.underlyerProductService = productServiceBuild;
        }
    }

    public final void setParentProductId(String str) throws IOException {
        if (StringUtils.isBlank(str) || str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            Character chValueOf = Character.valueOf(cCharAt);
            ProductService parentProduct = this.underlyerProductService.getParentProduct();
            if (Objects.equals(chValueOf, parentProduct != null ? parentProduct.getId() : null)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        if (string != null) {
            ProductService productServiceBuild = this.underlyerProductService.copyOfBuilder().parentProduct(ProductService.justId(string)).build();
            sq8.m48648g(productServiceBuild, "build(...)");
            this.underlyerProductService = productServiceBuild;
        }
    }

    public final void setProductPicture(String str) {
        if (str != null) {
            ProductService productServiceBuild = this.underlyerProductService.copyOfBuilder().productPicture(str).build();
            sq8.m48648g(productServiceBuild, "build(...)");
            this.underlyerProductService = productServiceBuild;
        }
    }

    public final void setSkuCode(String str) {
        if (StringUtils.isBlank(str) || str == null) {
            return;
        }
        ProductService productServiceBuild = this.underlyerProductService.copyOfBuilder().skuCode(str).build();
        sq8.m48648g(productServiceBuild, "build(...)");
        this.underlyerProductService = productServiceBuild;
    }

    public final void setStandardPricePerUnit(String str) {
        if (StringUtils.isBlank(str) || str == null) {
            return;
        }
        ProductService productServiceBuild = this.underlyerProductService.copyOfBuilder().standardPricePerUnit(str).build();
        sq8.m48648g(productServiceBuild, "build(...)");
        this.underlyerProductService = productServiceBuild;
    }

    public final void setType(String str) {
        ProductServiceType productServiceTypeValueOf;
        if (StringUtils.isBlank(str) || str == null || (productServiceTypeValueOf = ProductServiceType.valueOf(str)) == null) {
            return;
        }
        ProductService productServiceBuild = this.underlyerProductService.copyOfBuilder().type(productServiceTypeValueOf).build();
        sq8.m48648g(productServiceBuild, "build(...)");
        this.underlyerProductService = productServiceBuild;
    }

    public final void setUnderlyerProductService(ProductService productService) {
        sq8.m48649h(productService, "<set-?>");
        this.underlyerProductService = productService;
    }

    public final Product toProduct() {
        return new Product(getId(), getName(), getDescription(), getType(), getMeasurementUnit(), getIncrementBy(), getHsCode(), getSkuCode(), getStandardPricePerUnit(), getCurrency(), getParentProductId(), getProductPicture());
    }

    public ProductServiceSummary(ProductService productService) {
        sq8.m48649h(productService, "underlyerProductService");
        this.underlyerProductService = productService;
        String accountId = productService.getAccountId();
        sq8.m48648g(accountId, "getAccountId(...)");
        this.accountId = accountId;
    }

    public /* synthetic */ ProductServiceSummary(ProductService productService, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : productService);
    }
}
