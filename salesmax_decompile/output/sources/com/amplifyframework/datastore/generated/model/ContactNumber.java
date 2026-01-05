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

@Indexes({@Index(fields = {"contactId", "phoneNumber"}, name = "byContact"), @Index(fields = {"phoneNumber", "accountId"}, name = "byNumber")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "ContactNumbers")
/* loaded from: classes5.dex */
public final class ContactNumber implements Model {

    @BelongsTo(targetName = "accountId", type = Account.class)
    @ModelField(targetType = "Account")
    private final Account account;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "ContactNumberType")
    private final ContactNumberType contactNumberType;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "Boolean")
    private final Boolean doNotTrack;

    @ModelField(targetType = "ID")
    private final String doNotTrackSetBy;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean isPrimary;

    @ModelField(targetType = "Boolean")
    private final Boolean isSpam;

    @ModelField(targetType = "Boolean")
    private final Boolean isValid;

    @ModelField(targetType = "Boolean")
    private final Boolean isVerified;

    @ModelField(targetType = "Boolean")
    private final Boolean isWhatsappNumber;

    @ModelField(targetType = "Boolean")
    private final Boolean isWrongNumber;

    @ModelField(isRequired = true, targetType = "AWSPhone")
    private final String phoneNumber;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("ContactNumber", OutcomeConstants.OUTCOME_ID);
    public static final QueryField CONTACT = QueryField.field("ContactNumber", "contactId");
    public static final QueryField ACCOUNT = QueryField.field("ContactNumber", "accountId");
    public static final QueryField CONTACT_NUMBER_TYPE = QueryField.field("ContactNumber", "contactNumberType");
    public static final QueryField IS_PRIMARY = QueryField.field("ContactNumber", "isPrimary");
    public static final QueryField IS_VALID = QueryField.field("ContactNumber", "isValid");
    public static final QueryField IS_VERIFIED = QueryField.field("ContactNumber", "isVerified");
    public static final QueryField IS_WHATSAPP_NUMBER = QueryField.field("ContactNumber", "isWhatsappNumber");
    public static final QueryField IS_WRONG_NUMBER = QueryField.field("ContactNumber", "isWrongNumber");
    public static final QueryField IS_SPAM = QueryField.field("ContactNumber", "isSpam");
    public static final QueryField DO_NOT_TRACK = QueryField.field("ContactNumber", "doNotTrack");
    public static final QueryField DO_NOT_TRACK_SET_BY = QueryField.field("ContactNumber", "doNotTrackSetBy");
    public static final QueryField PHONE_NUMBER = QueryField.field("ContactNumber", "phoneNumber");
    public static final QueryField CREATED_AT = QueryField.field("ContactNumber", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ContactNumber", "updatedAt");

    public interface BuildStep {
        BuildStep account(Account account);

        ContactNumber build();

        BuildStep contact(Contact contact);

        BuildStep contactNumberType(ContactNumberType contactNumberType);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep doNotTrack(Boolean bool);

        BuildStep doNotTrackSetBy(String str);

        BuildStep id(String str);

        BuildStep isPrimary(Boolean bool);

        BuildStep isSpam(Boolean bool);

        BuildStep isValid(Boolean bool);

        BuildStep isVerified(Boolean bool);

        BuildStep isWhatsappNumber(Boolean bool);

        BuildStep isWrongNumber(Boolean bool);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements PhoneNumberStep, BuildStep {
        private Account account;
        private Contact contact;
        private ContactNumberType contactNumberType;
        private Temporal.DateTime createdAt;
        private Boolean doNotTrack;
        private String doNotTrackSetBy;
        private String id;
        private Boolean isPrimary;
        private Boolean isSpam;
        private Boolean isValid;
        private Boolean isVerified;
        private Boolean isWhatsappNumber;
        private Boolean isWrongNumber;
        private String phoneNumber;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep account(Account account) {
            this.account = account;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public ContactNumber build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ContactNumber(string, this.contact, this.account, this.contactNumberType, this.isPrimary, this.isValid, this.isVerified, this.isWhatsappNumber, this.isWrongNumber, this.isSpam, this.doNotTrack, this.doNotTrackSetBy, this.phoneNumber, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep contactNumberType(ContactNumberType contactNumberType) {
            this.contactNumberType = contactNumberType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep doNotTrack(Boolean bool) {
            this.doNotTrack = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep doNotTrackSetBy(String str) {
            this.doNotTrackSetBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep isPrimary(Boolean bool) {
            this.isPrimary = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep isSpam(Boolean bool) {
            this.isSpam = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep isValid(Boolean bool) {
            this.isValid = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep isVerified(Boolean bool) {
            this.isVerified = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep isWhatsappNumber(Boolean bool) {
            this.isWhatsappNumber = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep isWrongNumber(Boolean bool) {
            this.isWrongNumber = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.PhoneNumberStep
        public BuildStep phoneNumber(String str) {
            Objects.requireNonNull(str);
            this.phoneNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Contact contact, Account account, ContactNumberType contactNumberType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str2, String str3, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.contact = contact;
            this.account = account;
            this.contactNumberType = contactNumberType;
            this.isPrimary = bool;
            this.isValid = bool2;
            this.isVerified = bool3;
            this.isWhatsappNumber = bool4;
            this.isWrongNumber = bool5;
            this.isSpam = bool6;
            this.doNotTrack = bool7;
            this.doNotTrackSetBy = str2;
            this.phoneNumber = str3;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, Contact contact, Account account, ContactNumberType contactNumberType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str2, String str3, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, contact, account, contactNumberType, bool, bool2, bool3, bool4, bool5, bool6, bool7, str2, str3, dateTime, dateTime2);
            Objects.requireNonNull(str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder account(Account account) {
            return (CopyOfBuilder) super.account(account);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder contactNumberType(ContactNumberType contactNumberType) {
            return (CopyOfBuilder) super.contactNumberType(contactNumberType);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder doNotTrack(Boolean bool) {
            return (CopyOfBuilder) super.doNotTrack(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder doNotTrackSetBy(String str) {
            return (CopyOfBuilder) super.doNotTrackSetBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder isPrimary(Boolean bool) {
            return (CopyOfBuilder) super.isPrimary(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder isSpam(Boolean bool) {
            return (CopyOfBuilder) super.isSpam(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder isValid(Boolean bool) {
            return (CopyOfBuilder) super.isValid(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder isVerified(Boolean bool) {
            return (CopyOfBuilder) super.isVerified(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder isWhatsappNumber(Boolean bool) {
            return (CopyOfBuilder) super.isWhatsappNumber(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder isWrongNumber(Boolean bool) {
            return (CopyOfBuilder) super.isWrongNumber(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.PhoneNumberStep
        public CopyOfBuilder phoneNumber(String str) {
            return (CopyOfBuilder) super.phoneNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumber.Builder, com.amplifyframework.datastore.generated.model.ContactNumber.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface PhoneNumberStep {
        BuildStep phoneNumber(String str);
    }

    public static PhoneNumberStep builder() {
        return new Builder();
    }

    public static ContactNumber justId(String str) {
        return new ContactNumber(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.contact, this.account, this.contactNumberType, this.isPrimary, this.isValid, this.isVerified, this.isWhatsappNumber, this.isWrongNumber, this.isSpam, this.doNotTrack, this.doNotTrackSetBy, this.phoneNumber, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContactNumber.class != obj.getClass()) {
            return false;
        }
        ContactNumber contactNumber = (ContactNumber) obj;
        return s6c.m47909a(getId(), contactNumber.getId()) && s6c.m47909a(getContact(), contactNumber.getContact()) && s6c.m47909a(getAccount(), contactNumber.getAccount()) && s6c.m47909a(getContactNumberType(), contactNumber.getContactNumberType()) && s6c.m47909a(getIsPrimary(), contactNumber.getIsPrimary()) && s6c.m47909a(getIsValid(), contactNumber.getIsValid()) && s6c.m47909a(getIsVerified(), contactNumber.getIsVerified()) && s6c.m47909a(getIsWhatsappNumber(), contactNumber.getIsWhatsappNumber()) && s6c.m47909a(getIsWrongNumber(), contactNumber.getIsWrongNumber()) && s6c.m47909a(getIsSpam(), contactNumber.getIsSpam()) && s6c.m47909a(getDoNotTrack(), contactNumber.getDoNotTrack()) && s6c.m47909a(getDoNotTrackSetBy(), contactNumber.getDoNotTrackSetBy()) && s6c.m47909a(getPhoneNumber(), contactNumber.getPhoneNumber()) && s6c.m47909a(getCreatedAt(), contactNumber.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), contactNumber.getUpdatedAt());
    }

    public Account getAccount() {
        return this.account;
    }

    public Contact getContact() {
        return this.contact;
    }

    public ContactNumberType getContactNumberType() {
        return this.contactNumberType;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Boolean getDoNotTrack() {
        return this.doNotTrack;
    }

    public String getDoNotTrackSetBy() {
        return this.doNotTrackSetBy;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    public Boolean getIsSpam() {
        return this.isSpam;
    }

    public Boolean getIsValid() {
        return this.isValid;
    }

    public Boolean getIsVerified() {
        return this.isVerified;
    }

    public Boolean getIsWhatsappNumber() {
        return this.isWhatsappNumber;
    }

    public Boolean getIsWrongNumber() {
        return this.isWrongNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getContact() + getAccount() + getContactNumberType() + getIsPrimary() + getIsValid() + getIsVerified() + getIsWhatsappNumber() + getIsWrongNumber() + getIsSpam() + getDoNotTrack() + getDoNotTrackSetBy() + getPhoneNumber() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactNumber {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("account=" + String.valueOf(getAccount()) + ", ");
        sb.append("contactNumberType=" + String.valueOf(getContactNumberType()) + ", ");
        sb.append("isPrimary=" + String.valueOf(getIsPrimary()) + ", ");
        sb.append("isValid=" + String.valueOf(getIsValid()) + ", ");
        sb.append("isVerified=" + String.valueOf(getIsVerified()) + ", ");
        sb.append("isWhatsappNumber=" + String.valueOf(getIsWhatsappNumber()) + ", ");
        sb.append("isWrongNumber=" + String.valueOf(getIsWrongNumber()) + ", ");
        sb.append("isSpam=" + String.valueOf(getIsSpam()) + ", ");
        sb.append("doNotTrack=" + String.valueOf(getDoNotTrack()) + ", ");
        sb.append("doNotTrackSetBy=" + String.valueOf(getDoNotTrackSetBy()) + ", ");
        sb.append("phoneNumber=" + String.valueOf(getPhoneNumber()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ContactNumber(String str, Contact contact, Account account, ContactNumberType contactNumberType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str2, String str3, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.contact = contact;
        this.account = account;
        this.contactNumberType = contactNumberType;
        this.isPrimary = bool;
        this.isValid = bool2;
        this.isVerified = bool3;
        this.isWhatsappNumber = bool4;
        this.isWrongNumber = bool5;
        this.isSpam = bool6;
        this.doNotTrack = bool7;
        this.doNotTrackSetBy = str2;
        this.phoneNumber = str3;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
