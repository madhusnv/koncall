package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class VerifyEmailOutput {
    private final String emailToVerify;
    private final Boolean isVerified;
    private final String onErrorMessage;
    private final String phoneToVerify;
    private final String verifyId;

    public interface BuildStep {
        VerifyEmailOutput build();

        BuildStep emailToVerify(String str);

        BuildStep isVerified(Boolean bool);

        BuildStep onErrorMessage(String str);

        BuildStep phoneToVerify(String str);

        BuildStep verifyId(String str);
    }

    public static class Builder implements BuildStep {
        private String emailToVerify;
        private Boolean isVerified;
        private String onErrorMessage;
        private String phoneToVerify;
        private String verifyId;

        @Override // com.amplifyframework.datastore.generated.model.VerifyEmailOutput.BuildStep
        public VerifyEmailOutput build() {
            return new VerifyEmailOutput(this.verifyId, this.emailToVerify, this.phoneToVerify, this.isVerified, this.onErrorMessage);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerifyEmailOutput.BuildStep
        public BuildStep emailToVerify(String str) {
            this.emailToVerify = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.VerifyEmailOutput.BuildStep
        public BuildStep isVerified(Boolean bool) {
            this.isVerified = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.VerifyEmailOutput.BuildStep
        public BuildStep onErrorMessage(String str) {
            this.onErrorMessage = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.VerifyEmailOutput.BuildStep
        public BuildStep phoneToVerify(String str) {
            this.phoneToVerify = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.VerifyEmailOutput.BuildStep
        public BuildStep verifyId(String str) {
            this.verifyId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, Boolean bool, String str4) {
            this.verifyId = str;
            this.emailToVerify = str2;
            this.phoneToVerify = str3;
            this.isVerified = bool;
            this.onErrorMessage = str4;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, Boolean bool, String str4) {
            super(str, str2, str3, bool, str4);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerifyEmailOutput.Builder, com.amplifyframework.datastore.generated.model.VerifyEmailOutput.BuildStep
        public CopyOfBuilder emailToVerify(String str) {
            return (CopyOfBuilder) super.emailToVerify(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerifyEmailOutput.Builder, com.amplifyframework.datastore.generated.model.VerifyEmailOutput.BuildStep
        public CopyOfBuilder isVerified(Boolean bool) {
            return (CopyOfBuilder) super.isVerified(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerifyEmailOutput.Builder, com.amplifyframework.datastore.generated.model.VerifyEmailOutput.BuildStep
        public CopyOfBuilder onErrorMessage(String str) {
            return (CopyOfBuilder) super.onErrorMessage(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerifyEmailOutput.Builder, com.amplifyframework.datastore.generated.model.VerifyEmailOutput.BuildStep
        public CopyOfBuilder phoneToVerify(String str) {
            return (CopyOfBuilder) super.phoneToVerify(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerifyEmailOutput.Builder, com.amplifyframework.datastore.generated.model.VerifyEmailOutput.BuildStep
        public CopyOfBuilder verifyId(String str) {
            return (CopyOfBuilder) super.verifyId(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.verifyId, this.emailToVerify, this.phoneToVerify, this.isVerified, this.onErrorMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VerifyEmailOutput.class != obj.getClass()) {
            return false;
        }
        VerifyEmailOutput verifyEmailOutput = (VerifyEmailOutput) obj;
        return s6c.m47909a(getVerifyId(), verifyEmailOutput.getVerifyId()) && s6c.m47909a(getEmailToVerify(), verifyEmailOutput.getEmailToVerify()) && s6c.m47909a(getPhoneToVerify(), verifyEmailOutput.getPhoneToVerify()) && s6c.m47909a(getIsVerified(), verifyEmailOutput.getIsVerified()) && s6c.m47909a(getOnErrorMessage(), verifyEmailOutput.getOnErrorMessage());
    }

    public String getEmailToVerify() {
        return this.emailToVerify;
    }

    public Boolean getIsVerified() {
        return this.isVerified;
    }

    public String getOnErrorMessage() {
        return this.onErrorMessage;
    }

    public String getPhoneToVerify() {
        return this.phoneToVerify;
    }

    public String getVerifyId() {
        return this.verifyId;
    }

    public int hashCode() {
        return (getVerifyId() + getEmailToVerify() + getPhoneToVerify() + getIsVerified() + getOnErrorMessage()).hashCode();
    }

    private VerifyEmailOutput(String str, String str2, String str3, Boolean bool, String str4) {
        this.verifyId = str;
        this.emailToVerify = str2;
        this.phoneToVerify = str3;
        this.isVerified = bool;
        this.onErrorMessage = str4;
    }
}
