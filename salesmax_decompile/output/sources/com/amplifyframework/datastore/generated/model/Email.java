package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class Email {
    private final String email;
    private final String fullName;
    private final Boolean isDisposableEmail;
    private final Boolean isGenericEmail;
    private final Boolean isPrimary;
    private final Boolean isPublicEmail;
    private final Boolean isValid;
    private final Boolean isVerified;

    public interface BuildStep {
        Email build();

        BuildStep email(String str);

        BuildStep fullName(String str);

        BuildStep isDisposableEmail(Boolean bool);

        BuildStep isGenericEmail(Boolean bool);

        BuildStep isPrimary(Boolean bool);

        BuildStep isPublicEmail(Boolean bool);

        BuildStep isValid(Boolean bool);

        BuildStep isVerified(Boolean bool);
    }

    public static class Builder implements BuildStep {
        private String email;
        private String fullName;
        private Boolean isDisposableEmail;
        private Boolean isGenericEmail;
        private Boolean isPrimary;
        private Boolean isPublicEmail;
        private Boolean isValid;
        private Boolean isVerified;

        @Override // com.amplifyframework.datastore.generated.model.Email.BuildStep
        public Email build() {
            return new Email(this.email, this.fullName, this.isDisposableEmail, this.isPrimary, this.isPublicEmail, this.isValid, this.isVerified, this.isGenericEmail);
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.BuildStep
        public BuildStep email(String str) {
            this.email = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.BuildStep
        public BuildStep fullName(String str) {
            this.fullName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.BuildStep
        public BuildStep isDisposableEmail(Boolean bool) {
            this.isDisposableEmail = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.BuildStep
        public BuildStep isGenericEmail(Boolean bool) {
            this.isGenericEmail = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.BuildStep
        public BuildStep isPrimary(Boolean bool) {
            this.isPrimary = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.BuildStep
        public BuildStep isPublicEmail(Boolean bool) {
            this.isPublicEmail = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.BuildStep
        public BuildStep isValid(Boolean bool) {
            this.isValid = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.BuildStep
        public BuildStep isVerified(Boolean bool) {
            this.isVerified = bool;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
            this.email = str;
            this.fullName = str2;
            this.isDisposableEmail = bool;
            this.isPrimary = bool2;
            this.isPublicEmail = bool3;
            this.isValid = bool4;
            this.isVerified = bool5;
            this.isGenericEmail = bool6;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
            super(str, str2, bool, bool2, bool3, bool4, bool5, bool6);
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.Builder, com.amplifyframework.datastore.generated.model.Email.BuildStep
        public CopyOfBuilder email(String str) {
            return (CopyOfBuilder) super.email(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.Builder, com.amplifyframework.datastore.generated.model.Email.BuildStep
        public CopyOfBuilder fullName(String str) {
            return (CopyOfBuilder) super.fullName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.Builder, com.amplifyframework.datastore.generated.model.Email.BuildStep
        public CopyOfBuilder isDisposableEmail(Boolean bool) {
            return (CopyOfBuilder) super.isDisposableEmail(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.Builder, com.amplifyframework.datastore.generated.model.Email.BuildStep
        public CopyOfBuilder isGenericEmail(Boolean bool) {
            return (CopyOfBuilder) super.isGenericEmail(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.Builder, com.amplifyframework.datastore.generated.model.Email.BuildStep
        public CopyOfBuilder isPrimary(Boolean bool) {
            return (CopyOfBuilder) super.isPrimary(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.Builder, com.amplifyframework.datastore.generated.model.Email.BuildStep
        public CopyOfBuilder isPublicEmail(Boolean bool) {
            return (CopyOfBuilder) super.isPublicEmail(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.Builder, com.amplifyframework.datastore.generated.model.Email.BuildStep
        public CopyOfBuilder isValid(Boolean bool) {
            return (CopyOfBuilder) super.isValid(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.Email.Builder, com.amplifyframework.datastore.generated.model.Email.BuildStep
        public CopyOfBuilder isVerified(Boolean bool) {
            return (CopyOfBuilder) super.isVerified(bool);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.email, this.fullName, this.isDisposableEmail, this.isPrimary, this.isPublicEmail, this.isValid, this.isVerified, this.isGenericEmail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Email.class != obj.getClass()) {
            return false;
        }
        Email email = (Email) obj;
        return s6c.m47909a(getEmail(), email.getEmail()) && s6c.m47909a(getFullName(), email.getFullName()) && s6c.m47909a(getIsDisposableEmail(), email.getIsDisposableEmail()) && s6c.m47909a(getIsPrimary(), email.getIsPrimary()) && s6c.m47909a(getIsPublicEmail(), email.getIsPublicEmail()) && s6c.m47909a(getIsValid(), email.getIsValid()) && s6c.m47909a(getIsVerified(), email.getIsVerified()) && s6c.m47909a(getIsGenericEmail(), email.getIsGenericEmail());
    }

    public String getEmail() {
        return this.email;
    }

    public String getFullName() {
        return this.fullName;
    }

    public Boolean getIsDisposableEmail() {
        return this.isDisposableEmail;
    }

    public Boolean getIsGenericEmail() {
        return this.isGenericEmail;
    }

    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    public Boolean getIsPublicEmail() {
        return this.isPublicEmail;
    }

    public Boolean getIsValid() {
        return this.isValid;
    }

    public Boolean getIsVerified() {
        return this.isVerified;
    }

    public int hashCode() {
        return (getEmail() + getFullName() + getIsDisposableEmail() + getIsPrimary() + getIsPublicEmail() + getIsValid() + getIsVerified() + getIsGenericEmail()).hashCode();
    }

    private Email(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.email = str;
        this.fullName = str2;
        this.isDisposableEmail = bool;
        this.isPrimary = bool2;
        this.isPublicEmail = bool3;
        this.isValid = bool4;
        this.isVerified = bool5;
        this.isGenericEmail = bool6;
    }
}
