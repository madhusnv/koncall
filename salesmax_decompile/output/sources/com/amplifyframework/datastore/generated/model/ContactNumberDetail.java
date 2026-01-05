package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class ContactNumberDetail {
    private final ContactNumberType contactNumberType;
    private final Boolean isPrimary;
    private final Boolean isValid;
    private final Boolean isVerified;
    private final Boolean isWhatsappNumber;
    private final Boolean isWrongNumber;
    private final String phoneNumber;

    public interface BuildStep {
        ContactNumberDetail build();

        BuildStep contactNumberType(ContactNumberType contactNumberType);

        BuildStep isPrimary(Boolean bool);

        BuildStep isValid(Boolean bool);

        BuildStep isVerified(Boolean bool);

        BuildStep isWhatsappNumber(Boolean bool);

        BuildStep isWrongNumber(Boolean bool);

        BuildStep phoneNumber(String str);
    }

    public static class Builder implements BuildStep {
        private ContactNumberType contactNumberType;
        private Boolean isPrimary;
        private Boolean isValid;
        private Boolean isVerified;
        private Boolean isWhatsappNumber;
        private Boolean isWrongNumber;
        private String phoneNumber;

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public ContactNumberDetail build() {
            return new ContactNumberDetail(this.contactNumberType, this.isPrimary, this.isValid, this.isWhatsappNumber, this.isVerified, this.isWrongNumber, this.phoneNumber);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public BuildStep contactNumberType(ContactNumberType contactNumberType) {
            this.contactNumberType = contactNumberType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public BuildStep isPrimary(Boolean bool) {
            this.isPrimary = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public BuildStep isValid(Boolean bool) {
            this.isValid = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public BuildStep isVerified(Boolean bool) {
            this.isVerified = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public BuildStep isWhatsappNumber(Boolean bool) {
            this.isWhatsappNumber = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public BuildStep isWrongNumber(Boolean bool) {
            this.isWrongNumber = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public BuildStep phoneNumber(String str) {
            this.phoneNumber = str;
            return this;
        }

        public Builder() {
        }

        private Builder(ContactNumberType contactNumberType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str) {
            this.contactNumberType = contactNumberType;
            this.isPrimary = bool;
            this.isValid = bool2;
            this.isWhatsappNumber = bool3;
            this.isVerified = bool4;
            this.isWrongNumber = bool5;
            this.phoneNumber = str;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(ContactNumberType contactNumberType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str) {
            super(contactNumberType, bool, bool2, bool3, bool4, bool5, str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.Builder, com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public CopyOfBuilder contactNumberType(ContactNumberType contactNumberType) {
            return (CopyOfBuilder) super.contactNumberType(contactNumberType);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.Builder, com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public CopyOfBuilder isPrimary(Boolean bool) {
            return (CopyOfBuilder) super.isPrimary(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.Builder, com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public CopyOfBuilder isValid(Boolean bool) {
            return (CopyOfBuilder) super.isValid(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.Builder, com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public CopyOfBuilder isVerified(Boolean bool) {
            return (CopyOfBuilder) super.isVerified(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.Builder, com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public CopyOfBuilder isWhatsappNumber(Boolean bool) {
            return (CopyOfBuilder) super.isWhatsappNumber(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.Builder, com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public CopyOfBuilder isWrongNumber(Boolean bool) {
            return (CopyOfBuilder) super.isWrongNumber(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.ContactNumberDetail.Builder, com.amplifyframework.datastore.generated.model.ContactNumberDetail.BuildStep
        public CopyOfBuilder phoneNumber(String str) {
            return (CopyOfBuilder) super.phoneNumber(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.contactNumberType, this.isPrimary, this.isValid, this.isWhatsappNumber, this.isVerified, this.isWrongNumber, this.phoneNumber);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContactNumberDetail.class != obj.getClass()) {
            return false;
        }
        ContactNumberDetail contactNumberDetail = (ContactNumberDetail) obj;
        return s6c.m47909a(getContactNumberType(), contactNumberDetail.getContactNumberType()) && s6c.m47909a(getIsPrimary(), contactNumberDetail.getIsPrimary()) && s6c.m47909a(getIsValid(), contactNumberDetail.getIsValid()) && s6c.m47909a(getIsWhatsappNumber(), contactNumberDetail.getIsWhatsappNumber()) && s6c.m47909a(getIsVerified(), contactNumberDetail.getIsVerified()) && s6c.m47909a(getIsWrongNumber(), contactNumberDetail.getIsWrongNumber()) && s6c.m47909a(getPhoneNumber(), contactNumberDetail.getPhoneNumber());
    }

    public ContactNumberType getContactNumberType() {
        return this.contactNumberType;
    }

    public Boolean getIsPrimary() {
        return this.isPrimary;
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

    public int hashCode() {
        return (getContactNumberType() + getIsPrimary() + getIsValid() + getIsWhatsappNumber() + getIsVerified() + getIsWrongNumber() + getPhoneNumber()).hashCode();
    }

    private ContactNumberDetail(ContactNumberType contactNumberType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str) {
        this.contactNumberType = contactNumberType;
        this.isPrimary = bool;
        this.isValid = bool2;
        this.isWhatsappNumber = bool3;
        this.isVerified = bool4;
        this.isWrongNumber = bool5;
        this.phoneNumber = str;
    }
}
