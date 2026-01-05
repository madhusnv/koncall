package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.auth.cognito.asf.BuildDataCollector;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId"}, name = "byAccount")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "Products")
/* loaded from: classes5.dex */
public final class Product implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String name;

    @ModelField(targetType = "String")
    private final String productDescription;

    @ModelField(targetType = "String")
    private final String productType;
    public static final QueryField ID = QueryField.field(BuildDataCollector.PRODUCT, OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field(BuildDataCollector.PRODUCT, "accountId");
    public static final QueryField NAME = QueryField.field(BuildDataCollector.PRODUCT, "name");
    public static final QueryField PRODUCT_DESCRIPTION = QueryField.field(BuildDataCollector.PRODUCT, "productDescription");
    public static final QueryField PRODUCT_TYPE = QueryField.field(BuildDataCollector.PRODUCT, "productType");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        Product build();

        BuildStep id(String str);

        BuildStep name(String str);

        BuildStep productDescription(String str);

        BuildStep productType(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private String id;
        private String name;
        private String productDescription;
        private String productType;

        @Override // com.amplifyframework.datastore.generated.model.Product.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Product.BuildStep
        public Product build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new Product(string, this.accountId, this.name, this.productDescription, this.productType);
        }

        @Override // com.amplifyframework.datastore.generated.model.Product.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Product.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Product.BuildStep
        public BuildStep productDescription(String str) {
            this.productDescription = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Product.BuildStep
        public BuildStep productType(String str) {
            this.productType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5) {
            this.id = str;
            this.accountId = str2;
            this.name = str3;
            this.productDescription = str4;
            this.productType = str5;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5) {
            super(str, str2, str3, str4, str5);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.Product.Builder, com.amplifyframework.datastore.generated.model.Product.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Product.Builder, com.amplifyframework.datastore.generated.model.Product.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Product.Builder, com.amplifyframework.datastore.generated.model.Product.BuildStep
        public CopyOfBuilder productDescription(String str) {
            return (CopyOfBuilder) super.productDescription(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Product.Builder, com.amplifyframework.datastore.generated.model.Product.BuildStep
        public CopyOfBuilder productType(String str) {
            return (CopyOfBuilder) super.productType(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static Product justId(String str) {
        return new Product(str, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.name, this.productDescription, this.productType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Product.class != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return s6c.m47909a(getId(), product.getId()) && s6c.m47909a(getAccountId(), product.getAccountId()) && s6c.m47909a(getName(), product.getName()) && s6c.m47909a(getProductDescription(), product.getProductDescription()) && s6c.m47909a(getProductType(), product.getProductType());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getName() + getProductDescription() + getProductType()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("productDescription=" + String.valueOf(getProductDescription()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("productType=");
        sb2.append(String.valueOf(getProductType()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private Product(String str, String str2, String str3, String str4, String str5) {
        this.id = str;
        this.accountId = str2;
        this.name = str3;
        this.productDescription = str4;
        this.productType = str5;
    }
}
