package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.apache.http.cookie.ClientCookie;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "Businesses")
/* loaded from: classes5.dex */
public final class Business implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User addedBy;

    @ModelField(targetType = "ID")
    private final String addedById;

    @ModelField(targetType = "Address")
    private final List<Address> addresses;

    @ModelField(targetType = "ContactBusinessMembership")
    @HasMany(associatedWith = "business", type = ContactBusinessMembership.class)
    private final List<ContactBusinessMembership> contacts;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "DealAssociation")
    @HasMany(associatedWith = "business", type = DealAssociation.class)
    private final List<DealAssociation> deals;

    @ModelField(targetType = "String")
    private final String domain;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String industry;

    @ModelField(targetType = "String")
    private final String logo;

    @ModelField(isRequired = true, targetType = "String")
    private final String name;

    @ModelField(targetType = "String")
    private final String priority;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User updatedBy;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(targetType = "String")
    private final List<String> userDefinedTags;

    @ModelField(targetType = "AWSURL")
    private final String website;
    public static final QueryField ID = QueryField.field("Business", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("Business", "accountId");
    public static final QueryField NAME = QueryField.field("Business", "name");
    public static final QueryField ADDRESSES = QueryField.field("Business", "addresses");
    public static final QueryField INDUSTRY = QueryField.field("Business", "industry");
    public static final QueryField PRIORITY = QueryField.field("Business", "priority");
    public static final QueryField WEBSITE = QueryField.field("Business", "website");
    public static final QueryField DOMAIN = QueryField.field("Business", ClientCookie.DOMAIN_ATTR);
    public static final QueryField LOGO = QueryField.field("Business", "logo");
    public static final QueryField USER_DEFINED_TAGS = QueryField.field("Business", "userDefinedTags");
    public static final QueryField ADDED_BY_ID = QueryField.field("Business", "addedById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("Business", "updatedById");
    public static final QueryField CREATED_AT = QueryField.field("Business", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("Business", "updatedAt");

    public interface AccountIdStep {
        NameStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep addedById(String str);

        BuildStep addresses(List<Address> list);

        Business build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep domain(String str);

        BuildStep id(String str);

        BuildStep industry(String str);

        BuildStep logo(String str);

        BuildStep priority(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);

        BuildStep userDefinedTags(List<String> list);

        BuildStep website(String str);
    }

    public static class Builder implements AccountIdStep, NameStep, BuildStep {
        private String accountId;
        private String addedById;
        private List<Address> addresses;
        private Temporal.DateTime createdAt;
        private String domain;
        private String id;
        private String industry;
        private String logo;
        private String name;
        private String priority;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private List<String> userDefinedTags;
        private String website;

        @Override // com.amplifyframework.datastore.generated.model.Business.AccountIdStep
        public NameStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public BuildStep addedById(String str) {
            this.addedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public BuildStep addresses(List<Address> list) {
            this.addresses = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public Business build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new Business(string, this.accountId, this.name, this.addresses, this.industry, this.priority, this.website, this.domain, this.logo, this.userDefinedTags, this.addedById, this.updatedById, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public BuildStep domain(String str) {
            this.domain = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public BuildStep industry(String str) {
            this.industry = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public BuildStep logo(String str) {
            this.logo = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.NameStep
        public BuildStep name(String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public BuildStep priority(String str) {
            this.priority = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public BuildStep userDefinedTags(List<String> list) {
            this.userDefinedTags = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.BuildStep
        public BuildStep website(String str) {
            this.website = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, List<Address> list, String str4, String str5, String str6, String str7, String str8, List<String> list2, String str9, String str10, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.name = str3;
            this.addresses = list;
            this.industry = str4;
            this.priority = str5;
            this.website = str6;
            this.domain = str7;
            this.logo = str8;
            this.userDefinedTags = list2;
            this.addedById = str9;
            this.updatedById = str10;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public /* bridge */ /* synthetic */ BuildStep addresses(List list) {
            return addresses((List<Address>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public /* bridge */ /* synthetic */ BuildStep userDefinedTags(List list) {
            return userDefinedTags((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, List<Address> list, String str4, String str5, String str6, String str7, String str8, List<String> list2, String str9, String str10, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, list, str4, str5, str6, str7, str8, list2, str9, str10, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public CopyOfBuilder addedById(String str) {
            return (CopyOfBuilder) super.addedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public CopyOfBuilder addresses(List<Address> list) {
            return (CopyOfBuilder) super.addresses(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public CopyOfBuilder domain(String str) {
            return (CopyOfBuilder) super.domain(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public CopyOfBuilder industry(String str) {
            return (CopyOfBuilder) super.industry(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public CopyOfBuilder logo(String str) {
            return (CopyOfBuilder) super.logo(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.NameStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public CopyOfBuilder priority(String str) {
            return (CopyOfBuilder) super.priority(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public CopyOfBuilder userDefinedTags(List<String> list) {
            return (CopyOfBuilder) super.userDefinedTags(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Business.Builder, com.amplifyframework.datastore.generated.model.Business.BuildStep
        public CopyOfBuilder website(String str) {
            return (CopyOfBuilder) super.website(str);
        }
    }

    public interface NameStep {
        BuildStep name(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static Business justId(String str) {
        return new Business(str, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.name, this.addresses, this.industry, this.priority, this.website, this.domain, this.logo, this.userDefinedTags, this.addedById, this.updatedById, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Business.class != obj.getClass()) {
            return false;
        }
        Business business = (Business) obj;
        return s6c.m47909a(getId(), business.getId()) && s6c.m47909a(getAccountId(), business.getAccountId()) && s6c.m47909a(getName(), business.getName()) && s6c.m47909a(getAddresses(), business.getAddresses()) && s6c.m47909a(getIndustry(), business.getIndustry()) && s6c.m47909a(getPriority(), business.getPriority()) && s6c.m47909a(getWebsite(), business.getWebsite()) && s6c.m47909a(getDomain(), business.getDomain()) && s6c.m47909a(getLogo(), business.getLogo()) && s6c.m47909a(getUserDefinedTags(), business.getUserDefinedTags()) && s6c.m47909a(getAddedById(), business.getAddedById()) && s6c.m47909a(getUpdatedById(), business.getUpdatedById()) && s6c.m47909a(getCreatedAt(), business.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), business.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public User getAddedBy() {
        return this.addedBy;
    }

    public String getAddedById() {
        return this.addedById;
    }

    public List<Address> getAddresses() {
        return this.addresses;
    }

    public List<ContactBusinessMembership> getContacts() {
        return this.contacts;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public List<DealAssociation> getDeals() {
        return this.deals;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getId() {
        return this.id;
    }

    public String getIndustry() {
        return this.industry;
    }

    public String getLogo() {
        return this.logo;
    }

    public String getName() {
        return this.name;
    }

    public String getPriority() {
        return this.priority;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public User getUpdatedBy() {
        return this.updatedBy;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public List<String> getUserDefinedTags() {
        return this.userDefinedTags;
    }

    public String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getName() + getAddresses() + getIndustry() + getPriority() + getWebsite() + getDomain() + getLogo() + getUserDefinedTags() + getAddedById() + getUpdatedById() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Business {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("addresses=" + String.valueOf(getAddresses()) + ", ");
        sb.append("industry=" + String.valueOf(getIndustry()) + ", ");
        sb.append("priority=" + String.valueOf(getPriority()) + ", ");
        sb.append("website=" + String.valueOf(getWebsite()) + ", ");
        sb.append("domain=" + String.valueOf(getDomain()) + ", ");
        sb.append("logo=" + String.valueOf(getLogo()) + ", ");
        sb.append("userDefinedTags=" + String.valueOf(getUserDefinedTags()) + ", ");
        sb.append("addedById=" + String.valueOf(getAddedById()) + ", ");
        sb.append("updatedById=" + String.valueOf(getUpdatedById()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private Business(String str, String str2, String str3, List<Address> list, String str4, String str5, String str6, String str7, String str8, List<String> list2, String str9, String str10, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.contacts = null;
        this.addedBy = null;
        this.updatedBy = null;
        this.deals = null;
        this.id = str;
        this.accountId = str2;
        this.name = str3;
        this.addresses = list;
        this.industry = str4;
        this.priority = str5;
        this.website = str6;
        this.domain = str7;
        this.logo = str8;
        this.userDefinedTags = list2;
        this.addedById = str9;
        this.updatedById = str10;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
