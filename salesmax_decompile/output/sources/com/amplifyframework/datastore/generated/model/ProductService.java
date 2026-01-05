package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"parentProductId"}, name = "ByParentProduct")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "ProductServices")
/* loaded from: classes5.dex */
public final class ProductService implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ProductService")
    @HasMany(associatedWith = "parentProduct", type = ProductService.class)
    private final List<ProductService> childProductss;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdBy;

    @ModelField(targetType = "String")
    private final String currency;

    @ModelField(targetType = "String")
    private final String description;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime endDate;

    @ModelField(targetType = "ExternalReference")
    private final List<ExternalReference> externalReference;

    @ModelField(targetType = "String")
    private final String hsCode;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Int")
    private final Integer incrementBy;

    @ModelField(targetType = "Boolean")
    private final Boolean isArchived;

    @ModelField(targetType = "fileObjectRelationship")
    @HasMany(associatedWith = "productService", type = fileObjectRelationship.class)
    private final List<fileObjectRelationship> linkedProductFiles;

    @ModelField(targetType = "String")
    private final String measurementUnit;

    @ModelField(targetType = "String")
    private final String name;

    @BelongsTo(targetName = "parentProductId", type = ProductService.class)
    @ModelField(targetType = "ProductService")
    private final ProductService parentProduct;

    @ModelField(targetType = "String")
    private final String productPicture;

    @ModelField(targetType = "String")
    private final String skuCode;

    @ModelField(targetType = "String")
    private final String standardPricePerUnit;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime startDate;

    /* renamed from: type, reason: collision with root package name */
    @ModelField(targetType = "ProductServiceType")
    private final ProductServiceType f58105type;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedBy;
    public static final QueryField ID = QueryField.field("ProductService", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ProductService", "accountId");
    public static final QueryField EXTERNAL_REFERENCE = QueryField.field("ProductService", "externalReference");
    public static final QueryField NAME = QueryField.field("ProductService", "name");
    public static final QueryField DESCRIPTION = QueryField.field("ProductService", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField TYPE = QueryField.field("ProductService", "type");
    public static final QueryField MEASUREMENT_UNIT = QueryField.field("ProductService", "measurementUnit");
    public static final QueryField INCREMENT_BY = QueryField.field("ProductService", "incrementBy");
    public static final QueryField HS_CODE = QueryField.field("ProductService", "hsCode");
    public static final QueryField SKU_CODE = QueryField.field("ProductService", "skuCode");
    public static final QueryField STANDARD_PRICE_PER_UNIT = QueryField.field("ProductService", "standardPricePerUnit");
    public static final QueryField CURRENCY = QueryField.field("ProductService", FirebaseAnalytics.Param.CURRENCY);
    public static final QueryField PARENT_PRODUCT = QueryField.field("ProductService", "parentProductId");
    public static final QueryField PRODUCT_PICTURE = QueryField.field("ProductService", "productPicture");
    public static final QueryField START_DATE = QueryField.field("ProductService", "startDate");
    public static final QueryField END_DATE = QueryField.field("ProductService", "endDate");
    public static final QueryField IS_ARCHIVED = QueryField.field("ProductService", "isArchived");
    public static final QueryField CREATED_BY = QueryField.field("ProductService", "createdBy");
    public static final QueryField UPDATED_BY = QueryField.field("ProductService", "updatedBy");
    public static final QueryField CREATED_AT = QueryField.field("ProductService", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ProductService", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        ProductService build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdBy(String str);

        BuildStep currency(String str);

        BuildStep description(String str);

        BuildStep endDate(Temporal.DateTime dateTime);

        BuildStep externalReference(List<ExternalReference> list);

        BuildStep hsCode(String str);

        BuildStep id(String str);

        BuildStep incrementBy(Integer num);

        BuildStep isArchived(Boolean bool);

        BuildStep measurementUnit(String str);

        BuildStep name(String str);

        BuildStep parentProduct(ProductService productService);

        BuildStep productPicture(String str);

        BuildStep skuCode(String str);

        BuildStep standardPricePerUnit(String str);

        BuildStep startDate(Temporal.DateTime dateTime);

        BuildStep type(ProductServiceType productServiceType);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedBy(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private Temporal.DateTime createdAt;
        private String createdBy;
        private String currency;
        private String description;
        private Temporal.DateTime endDate;
        private List<ExternalReference> externalReference;
        private String hsCode;
        private String id;
        private Integer incrementBy;
        private Boolean isArchived;
        private String measurementUnit;
        private String name;
        private ProductService parentProduct;
        private String productPicture;
        private String skuCode;
        private String standardPricePerUnit;
        private Temporal.DateTime startDate;

        /* renamed from: type, reason: collision with root package name */
        private ProductServiceType f58106type;
        private Temporal.DateTime updatedAt;
        private String updatedBy;

        @Override // com.amplifyframework.datastore.generated.model.ProductService.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public ProductService build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ProductService(string, this.accountId, this.externalReference, this.name, this.description, this.f58106type, this.measurementUnit, this.incrementBy, this.hsCode, this.skuCode, this.standardPricePerUnit, this.currency, this.parentProduct, this.productPicture, this.startDate, this.endDate, this.isArchived, this.createdBy, this.updatedBy, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep createdBy(String str) {
            this.createdBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep description(String str) {
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep endDate(Temporal.DateTime dateTime) {
            this.endDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep externalReference(List<ExternalReference> list) {
            this.externalReference = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep hsCode(String str) {
            this.hsCode = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep incrementBy(Integer num) {
            this.incrementBy = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep isArchived(Boolean bool) {
            this.isArchived = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep measurementUnit(String str) {
            this.measurementUnit = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep parentProduct(ProductService productService) {
            this.parentProduct = productService;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep productPicture(String str) {
            this.productPicture = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep skuCode(String str) {
            this.skuCode = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep standardPricePerUnit(String str) {
            this.standardPricePerUnit = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep startDate(Temporal.DateTime dateTime) {
            this.startDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep type(ProductServiceType productServiceType) {
            this.f58106type = productServiceType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public BuildStep updatedBy(String str) {
            this.updatedBy = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, List<ExternalReference> list, String str3, String str4, ProductServiceType productServiceType, String str5, Integer num, String str6, String str7, String str8, String str9, ProductService productService, String str10, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Boolean bool, String str11, String str12, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            this.id = str;
            this.accountId = str2;
            this.externalReference = list;
            this.name = str3;
            this.description = str4;
            this.f58106type = productServiceType;
            this.measurementUnit = str5;
            this.incrementBy = num;
            this.hsCode = str6;
            this.skuCode = str7;
            this.standardPricePerUnit = str8;
            this.currency = str9;
            this.parentProduct = productService;
            this.productPicture = str10;
            this.startDate = dateTime;
            this.endDate = dateTime2;
            this.isArchived = bool;
            this.createdBy = str11;
            this.updatedBy = str12;
            this.createdAt = dateTime3;
            this.updatedAt = dateTime4;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public /* bridge */ /* synthetic */ BuildStep externalReference(List list) {
            return externalReference((List<ExternalReference>) list);
        }

        private CopyOfBuilder(String str, String str2, List<ExternalReference> list, String str3, String str4, ProductServiceType productServiceType, String str5, Integer num, String str6, String str7, String str8, String str9, ProductService productService, String str10, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Boolean bool, String str11, String str12, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            super(str, str2, list, str3, str4, productServiceType, str5, num, str6, str7, str8, str9, productService, str10, dateTime, dateTime2, bool, str11, str12, dateTime3, dateTime4);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder createdBy(String str) {
            return (CopyOfBuilder) super.createdBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder endDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.endDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder externalReference(List<ExternalReference> list) {
            return (CopyOfBuilder) super.externalReference(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder hsCode(String str) {
            return (CopyOfBuilder) super.hsCode(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder incrementBy(Integer num) {
            return (CopyOfBuilder) super.incrementBy(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder isArchived(Boolean bool) {
            return (CopyOfBuilder) super.isArchived(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder measurementUnit(String str) {
            return (CopyOfBuilder) super.measurementUnit(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder parentProduct(ProductService productService) {
            return (CopyOfBuilder) super.parentProduct(productService);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder productPicture(String str) {
            return (CopyOfBuilder) super.productPicture(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder skuCode(String str) {
            return (CopyOfBuilder) super.skuCode(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder standardPricePerUnit(String str) {
            return (CopyOfBuilder) super.standardPricePerUnit(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder startDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.startDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder type(ProductServiceType productServiceType) {
            return (CopyOfBuilder) super.type(productServiceType);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductService.Builder, com.amplifyframework.datastore.generated.model.ProductService.BuildStep
        public CopyOfBuilder updatedBy(String str) {
            return (CopyOfBuilder) super.updatedBy(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ProductService justId(String str) {
        return new ProductService(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.externalReference, this.name, this.description, this.f58105type, this.measurementUnit, this.incrementBy, this.hsCode, this.skuCode, this.standardPricePerUnit, this.currency, this.parentProduct, this.productPicture, this.startDate, this.endDate, this.isArchived, this.createdBy, this.updatedBy, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProductService.class != obj.getClass()) {
            return false;
        }
        ProductService productService = (ProductService) obj;
        return s6c.m47909a(getId(), productService.getId()) && s6c.m47909a(getAccountId(), productService.getAccountId()) && s6c.m47909a(getExternalReference(), productService.getExternalReference()) && s6c.m47909a(getName(), productService.getName()) && s6c.m47909a(getDescription(), productService.getDescription()) && s6c.m47909a(getType(), productService.getType()) && s6c.m47909a(getMeasurementUnit(), productService.getMeasurementUnit()) && s6c.m47909a(getIncrementBy(), productService.getIncrementBy()) && s6c.m47909a(getHsCode(), productService.getHsCode()) && s6c.m47909a(getSkuCode(), productService.getSkuCode()) && s6c.m47909a(getStandardPricePerUnit(), productService.getStandardPricePerUnit()) && s6c.m47909a(getCurrency(), productService.getCurrency()) && s6c.m47909a(getParentProduct(), productService.getParentProduct()) && s6c.m47909a(getProductPicture(), productService.getProductPicture()) && s6c.m47909a(getStartDate(), productService.getStartDate()) && s6c.m47909a(getEndDate(), productService.getEndDate()) && s6c.m47909a(getIsArchived(), productService.getIsArchived()) && s6c.m47909a(getCreatedBy(), productService.getCreatedBy()) && s6c.m47909a(getUpdatedBy(), productService.getUpdatedBy()) && s6c.m47909a(getCreatedAt(), productService.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), productService.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public List<ProductService> getChildProductss() {
        return this.childProductss;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getDescription() {
        return this.description;
    }

    public Temporal.DateTime getEndDate() {
        return this.endDate;
    }

    public List<ExternalReference> getExternalReference() {
        return this.externalReference;
    }

    public String getHsCode() {
        return this.hsCode;
    }

    public String getId() {
        return this.id;
    }

    public Integer getIncrementBy() {
        return this.incrementBy;
    }

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    public List<fileObjectRelationship> getLinkedProductFiles() {
        return this.linkedProductFiles;
    }

    public String getMeasurementUnit() {
        return this.measurementUnit;
    }

    public String getName() {
        return this.name;
    }

    public ProductService getParentProduct() {
        return this.parentProduct;
    }

    public String getProductPicture() {
        return this.productPicture;
    }

    public String getSkuCode() {
        return this.skuCode;
    }

    public String getStandardPricePerUnit() {
        return this.standardPricePerUnit;
    }

    public Temporal.DateTime getStartDate() {
        return this.startDate;
    }

    public ProductServiceType getType() {
        return this.f58105type;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getExternalReference() + getName() + getDescription() + getType() + getMeasurementUnit() + getIncrementBy() + getHsCode() + getSkuCode() + getStandardPricePerUnit() + getCurrency() + getParentProduct() + getProductPicture() + getStartDate() + getEndDate() + getIsArchived() + getCreatedBy() + getUpdatedBy() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductService {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("externalReference=" + String.valueOf(getExternalReference()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("type=" + String.valueOf(getType()) + ", ");
        sb.append("measurementUnit=" + String.valueOf(getMeasurementUnit()) + ", ");
        sb.append("incrementBy=" + String.valueOf(getIncrementBy()) + ", ");
        sb.append("hsCode=" + String.valueOf(getHsCode()) + ", ");
        sb.append("skuCode=" + String.valueOf(getSkuCode()) + ", ");
        sb.append("standardPricePerUnit=" + String.valueOf(getStandardPricePerUnit()) + ", ");
        sb.append("currency=" + String.valueOf(getCurrency()) + ", ");
        sb.append("parentProduct=" + String.valueOf(getParentProduct()) + ", ");
        sb.append("productPicture=" + String.valueOf(getProductPicture()) + ", ");
        sb.append("startDate=" + String.valueOf(getStartDate()) + ", ");
        sb.append("endDate=" + String.valueOf(getEndDate()) + ", ");
        sb.append("isArchived=" + String.valueOf(getIsArchived()) + ", ");
        sb.append("createdBy=" + String.valueOf(getCreatedBy()) + ", ");
        sb.append("updatedBy=" + String.valueOf(getUpdatedBy()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ProductService(String str, String str2, List<ExternalReference> list, String str3, String str4, ProductServiceType productServiceType, String str5, Integer num, String str6, String str7, String str8, String str9, ProductService productService, String str10, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Boolean bool, String str11, String str12, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
        this.childProductss = null;
        this.linkedProductFiles = null;
        this.id = str;
        this.accountId = str2;
        this.externalReference = list;
        this.name = str3;
        this.description = str4;
        this.f58105type = productServiceType;
        this.measurementUnit = str5;
        this.incrementBy = num;
        this.hsCode = str6;
        this.skuCode = str7;
        this.standardPricePerUnit = str8;
        this.currency = str9;
        this.parentProduct = productService;
        this.productPicture = str10;
        this.startDate = dateTime;
        this.endDate = dateTime2;
        this.isArchived = bool;
        this.createdBy = str11;
        this.updatedBy = str12;
        this.createdAt = dateTime3;
        this.updatedAt = dateTime4;
    }
}
