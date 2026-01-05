package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"contactId", "accountId"}, name = "dealsByLinkedContact"), @Index(fields = {"businessId", "accountId"}, name = "dealsByLinkedBusiness"), @Index(fields = {"dealId", "accountId"}, name = "dealsByLinkedDeal")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "DealAssociations")
/* loaded from: classes5.dex */
public final class DealAssociation implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @BelongsTo(targetName = "businessId", type = Business.class)
    @ModelField(targetType = "Business")
    private final Business business;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @BelongsTo(targetName = "dealId", type = Deal.class)
    @ModelField(targetType = "Deal")
    private final Deal deal;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @BelongsTo(targetName = "productId", type = ProductService.class)
    @ModelField(targetType = "ProductService")
    private final ProductService product;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("DealAssociation", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("DealAssociation", "accountId");
    public static final QueryField DEAL = QueryField.field("DealAssociation", "dealId");
    public static final QueryField CONTACT = QueryField.field("DealAssociation", "contactId");
    public static final QueryField BUSINESS = QueryField.field("DealAssociation", "businessId");
    public static final QueryField PRODUCT = QueryField.field("DealAssociation", "productId");
    public static final QueryField CREATED_AT = QueryField.field("DealAssociation", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("DealAssociation", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        DealAssociation build();

        BuildStep business(Business business);

        BuildStep contact(Contact contact);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep deal(Deal deal);

        BuildStep id(String str);

        BuildStep product(ProductService productService);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private Business business;
        private Contact contact;
        private Temporal.DateTime createdAt;
        private Deal deal;
        private String id;
        private ProductService product;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public DealAssociation build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new DealAssociation(string, this.accountId, this.deal, this.contact, this.business, this.product, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public BuildStep business(Business business) {
            this.business = business;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public BuildStep deal(Deal deal) {
            this.deal = deal;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public BuildStep product(ProductService productService) {
            this.product = productService;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Deal deal, Contact contact, Business business, ProductService productService, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.deal = deal;
            this.contact = contact;
            this.business = business;
            this.product = productService;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Deal deal, Contact contact, Business business, ProductService productService, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, deal, contact, business, productService, dateTime, dateTime2);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.Builder, com.amplifyframework.datastore.generated.model.DealAssociation.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.Builder, com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public CopyOfBuilder business(Business business) {
            return (CopyOfBuilder) super.business(business);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.Builder, com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.Builder, com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.Builder, com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public CopyOfBuilder deal(Deal deal) {
            return (CopyOfBuilder) super.deal(deal);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.Builder, com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public CopyOfBuilder product(ProductService productService) {
            return (CopyOfBuilder) super.product(productService);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealAssociation.Builder, com.amplifyframework.datastore.generated.model.DealAssociation.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static DealAssociation justId(String str) {
        return new DealAssociation(str, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.deal, this.contact, this.business, this.product, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DealAssociation.class != obj.getClass()) {
            return false;
        }
        DealAssociation dealAssociation = (DealAssociation) obj;
        return s6c.m47909a(getId(), dealAssociation.getId()) && s6c.m47909a(getAccountId(), dealAssociation.getAccountId()) && s6c.m47909a(getDeal(), dealAssociation.getDeal()) && s6c.m47909a(getContact(), dealAssociation.getContact()) && s6c.m47909a(getBusiness(), dealAssociation.getBusiness()) && s6c.m47909a(getProduct(), dealAssociation.getProduct()) && s6c.m47909a(getCreatedAt(), dealAssociation.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), dealAssociation.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Business getBusiness() {
        return this.business;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Deal getDeal() {
        return this.deal;
    }

    public String getId() {
        return this.id;
    }

    public ProductService getProduct() {
        return this.product;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getDeal() + getContact() + getBusiness() + getProduct() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DealAssociation {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("deal=" + String.valueOf(getDeal()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("business=" + String.valueOf(getBusiness()) + ", ");
        sb.append("product=" + String.valueOf(getProduct()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private DealAssociation(String str, String str2, Deal deal, Contact contact, Business business, ProductService productService, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.deal = deal;
        this.contact = contact;
        this.business = business;
        this.product = productService;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
