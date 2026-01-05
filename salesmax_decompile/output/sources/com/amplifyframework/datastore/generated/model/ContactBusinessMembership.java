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

@Indexes({@Index(fields = {"contactId", "accountId"}, name = "byLinkedContact"), @Index(fields = {"businessId", "accountId"}, name = "byLinkedBusiness")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "ContactBusinessMemberships")
/* loaded from: classes5.dex */
public final class ContactBusinessMembership implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AssociatedCreationType")
    private final AssociatedCreationType associatedCreationType;

    @BelongsTo(targetName = "businessId", type = Business.class)
    @ModelField(targetType = "Business")
    private final Business business;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "String")
    private final String contactRelationship;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final String department;

    @ModelField(targetType = "String")
    private final String designation;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("ContactBusinessMembership", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ContactBusinessMembership", "accountId");
    public static final QueryField BUSINESS = QueryField.field("ContactBusinessMembership", "businessId");
    public static final QueryField CONTACT = QueryField.field("ContactBusinessMembership", "contactId");
    public static final QueryField CONTACT_RELATIONSHIP = QueryField.field("ContactBusinessMembership", "contactRelationship");
    public static final QueryField DEPARTMENT = QueryField.field("ContactBusinessMembership", "department");
    public static final QueryField DESIGNATION = QueryField.field("ContactBusinessMembership", "designation");
    public static final QueryField ASSOCIATED_CREATION_TYPE = QueryField.field("ContactBusinessMembership", "associatedCreationType");
    public static final QueryField CREATED_AT = QueryField.field("ContactBusinessMembership", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ContactBusinessMembership", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep associatedCreationType(AssociatedCreationType associatedCreationType);

        ContactBusinessMembership build();

        BuildStep business(Business business);

        BuildStep contact(Contact contact);

        BuildStep contactRelationship(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep department(String str);

        BuildStep designation(String str);

        BuildStep id(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private AssociatedCreationType associatedCreationType;
        private Business business;
        private Contact contact;
        private String contactRelationship;
        private Temporal.DateTime createdAt;
        private String department;
        private String designation;
        private String id;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public BuildStep associatedCreationType(AssociatedCreationType associatedCreationType) {
            this.associatedCreationType = associatedCreationType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public ContactBusinessMembership build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ContactBusinessMembership(string, this.accountId, this.business, this.contact, this.contactRelationship, this.department, this.designation, this.associatedCreationType, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public BuildStep business(Business business) {
            this.business = business;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public BuildStep contactRelationship(String str) {
            this.contactRelationship = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public BuildStep department(String str) {
            this.department = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public BuildStep designation(String str) {
            this.designation = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Business business, Contact contact, String str3, String str4, String str5, AssociatedCreationType associatedCreationType, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.business = business;
            this.contact = contact;
            this.contactRelationship = str3;
            this.department = str4;
            this.designation = str5;
            this.associatedCreationType = associatedCreationType;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Business business, Contact contact, String str3, String str4, String str5, AssociatedCreationType associatedCreationType, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, business, contact, str3, str4, str5, associatedCreationType, dateTime, dateTime2);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.Builder, com.amplifyframework.datastore.generated.model.ContactBusinessMembership.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.Builder, com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public CopyOfBuilder associatedCreationType(AssociatedCreationType associatedCreationType) {
            return (CopyOfBuilder) super.associatedCreationType(associatedCreationType);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.Builder, com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public CopyOfBuilder business(Business business) {
            return (CopyOfBuilder) super.business(business);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.Builder, com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.Builder, com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public CopyOfBuilder contactRelationship(String str) {
            return (CopyOfBuilder) super.contactRelationship(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.Builder, com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.Builder, com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public CopyOfBuilder department(String str) {
            return (CopyOfBuilder) super.department(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.Builder, com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public CopyOfBuilder designation(String str) {
            return (CopyOfBuilder) super.designation(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactBusinessMembership.Builder, com.amplifyframework.datastore.generated.model.ContactBusinessMembership.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ContactBusinessMembership justId(String str) {
        return new ContactBusinessMembership(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.business, this.contact, this.contactRelationship, this.department, this.designation, this.associatedCreationType, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContactBusinessMembership.class != obj.getClass()) {
            return false;
        }
        ContactBusinessMembership contactBusinessMembership = (ContactBusinessMembership) obj;
        return s6c.m47909a(getId(), contactBusinessMembership.getId()) && s6c.m47909a(getAccountId(), contactBusinessMembership.getAccountId()) && s6c.m47909a(getBusiness(), contactBusinessMembership.getBusiness()) && s6c.m47909a(getContact(), contactBusinessMembership.getContact()) && s6c.m47909a(getContactRelationship(), contactBusinessMembership.getContactRelationship()) && s6c.m47909a(getDepartment(), contactBusinessMembership.getDepartment()) && s6c.m47909a(getDesignation(), contactBusinessMembership.getDesignation()) && s6c.m47909a(getAssociatedCreationType(), contactBusinessMembership.getAssociatedCreationType()) && s6c.m47909a(getCreatedAt(), contactBusinessMembership.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), contactBusinessMembership.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public AssociatedCreationType getAssociatedCreationType() {
        return this.associatedCreationType;
    }

    public Business getBusiness() {
        return this.business;
    }

    public Contact getContact() {
        return this.contact;
    }

    public String getContactRelationship() {
        return this.contactRelationship;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getDesignation() {
        return this.designation;
    }

    public String getId() {
        return this.id;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getBusiness() + getContact() + getContactRelationship() + getDepartment() + getDesignation() + getAssociatedCreationType() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactBusinessMembership {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("business=" + String.valueOf(getBusiness()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("contactRelationship=" + String.valueOf(getContactRelationship()) + ", ");
        sb.append("department=" + String.valueOf(getDepartment()) + ", ");
        sb.append("designation=" + String.valueOf(getDesignation()) + ", ");
        sb.append("associatedCreationType=" + String.valueOf(getAssociatedCreationType()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ContactBusinessMembership(String str, String str2, Business business, Contact contact, String str3, String str4, String str5, AssociatedCreationType associatedCreationType, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.business = business;
        this.contact = contact;
        this.contactRelationship = str3;
        this.department = str4;
        this.designation = str5;
        this.associatedCreationType = associatedCreationType;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
