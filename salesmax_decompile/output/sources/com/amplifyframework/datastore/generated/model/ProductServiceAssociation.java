package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "ProductServiceAssociations")
/* loaded from: classes5.dex */
public final class ProductServiceAssociation implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ID")
    private final String contactId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(isRequired = true, targetType = "ID")
    private final String productId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;
    public static final QueryField ID = QueryField.field("ProductServiceAssociation", OutcomeConstants.OUTCOME_ID);
    public static final QueryField PRODUCT_ID = QueryField.field("ProductServiceAssociation", "productId");
    public static final QueryField ACCOUNT_ID = QueryField.field("ProductServiceAssociation", "accountId");
    public static final QueryField CONTACT_ID = QueryField.field("ProductServiceAssociation", "contactId");
    public static final QueryField CREATED_AT = QueryField.field("ProductServiceAssociation", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ProductServiceAssociation", "updatedAt");
    public static final QueryField CREATED_BY_ID = QueryField.field("ProductServiceAssociation", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("ProductServiceAssociation", "updatedById");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        ProductServiceAssociation build();

        BuildStep contactId(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep id(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);
    }

    public static class Builder implements ProductIdStep, AccountIdStep, BuildStep {
        private String accountId;
        private String contactId;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String id;
        private String productId;
        private Temporal.DateTime updatedAt;
        private String updatedById;

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.BuildStep
        public ProductServiceAssociation build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ProductServiceAssociation(string, this.productId, this.accountId, this.contactId, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.BuildStep
        public BuildStep contactId(String str) {
            this.contactId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.ProductIdStep
        public AccountIdStep productId(String str) {
            Objects.requireNonNull(str);
            this.productId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str5, String str6) {
            this.id = str;
            this.productId = str2;
            this.accountId = str3;
            this.contactId = str4;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
            this.createdById = str5;
            this.updatedById = str6;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str5, String str6) {
            super(str, str2, str3, str4, dateTime, dateTime2, str5, str6);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.Builder, com.amplifyframework.datastore.generated.model.ProductServiceAssociation.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.Builder, com.amplifyframework.datastore.generated.model.ProductServiceAssociation.BuildStep
        public CopyOfBuilder contactId(String str) {
            return (CopyOfBuilder) super.contactId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.Builder, com.amplifyframework.datastore.generated.model.ProductServiceAssociation.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.Builder, com.amplifyframework.datastore.generated.model.ProductServiceAssociation.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.Builder, com.amplifyframework.datastore.generated.model.ProductServiceAssociation.ProductIdStep
        public CopyOfBuilder productId(String str) {
            return (CopyOfBuilder) super.productId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.Builder, com.amplifyframework.datastore.generated.model.ProductServiceAssociation.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ProductServiceAssociation.Builder, com.amplifyframework.datastore.generated.model.ProductServiceAssociation.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }
    }

    public interface ProductIdStep {
        AccountIdStep productId(String str);
    }

    public static ProductIdStep builder() {
        return new Builder();
    }

    public static ProductServiceAssociation justId(String str) {
        return new ProductServiceAssociation(str, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.productId, this.accountId, this.contactId, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProductServiceAssociation.class != obj.getClass()) {
            return false;
        }
        ProductServiceAssociation productServiceAssociation = (ProductServiceAssociation) obj;
        return s6c.m47909a(getId(), productServiceAssociation.getId()) && s6c.m47909a(getProductId(), productServiceAssociation.getProductId()) && s6c.m47909a(getAccountId(), productServiceAssociation.getAccountId()) && s6c.m47909a(getContactId(), productServiceAssociation.getContactId()) && s6c.m47909a(getCreatedAt(), productServiceAssociation.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), productServiceAssociation.getUpdatedAt()) && s6c.m47909a(getCreatedById(), productServiceAssociation.getCreatedById()) && s6c.m47909a(getUpdatedById(), productServiceAssociation.getUpdatedById());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getContactId() {
        return this.contactId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public String getId() {
        return this.id;
    }

    public String getProductId() {
        return this.productId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public int hashCode() {
        return (getId() + getProductId() + getAccountId() + getContactId() + getCreatedAt() + getUpdatedAt() + getCreatedById() + getUpdatedById()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductServiceAssociation {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("productId=" + String.valueOf(getProductId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("contactId=" + String.valueOf(getContactId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedById=");
        sb2.append(String.valueOf(getUpdatedById()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ProductServiceAssociation(String str, String str2, String str3, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str5, String str6) {
        this.id = str;
        this.productId = str2;
        this.accountId = str3;
        this.contactId = str4;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.createdById = str5;
        this.updatedById = str6;
    }
}
