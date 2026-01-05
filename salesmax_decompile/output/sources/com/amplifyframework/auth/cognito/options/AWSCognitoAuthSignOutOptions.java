package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthSignOutOptions;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthSignOutOptions extends AuthSignOutOptions {
    private final String browserPackage;

    public static final class CognitoBuilder extends AuthSignOutOptions.Builder<CognitoBuilder> {
        private String browserPackage;

        public CognitoBuilder browserPackage(String str) {
            this.browserPackage = str;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthSignOutOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthSignOutOptions.Builder
        public AWSCognitoAuthSignOutOptions build() {
            return new AWSCognitoAuthSignOutOptions(super.isGlobalSignOut(), this.browserPackage);
        }
    }

    public AWSCognitoAuthSignOutOptions(boolean z, String str) {
        super(z);
        this.browserPackage = str;
    }

    public static CognitoBuilder builder() {
        return new CognitoBuilder();
    }

    @Override // com.amplifyframework.auth.options.AuthSignOutOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthSignOutOptions.class != obj.getClass()) {
            return false;
        }
        AWSCognitoAuthSignOutOptions aWSCognitoAuthSignOutOptions = (AWSCognitoAuthSignOutOptions) obj;
        return s6c.m47909a(Boolean.valueOf(isGlobalSignOut()), Boolean.valueOf(aWSCognitoAuthSignOutOptions.isGlobalSignOut())) && s6c.m47909a(getBrowserPackage(), aWSCognitoAuthSignOutOptions.getBrowserPackage());
    }

    public String getBrowserPackage() {
        return this.browserPackage;
    }

    @Override // com.amplifyframework.auth.options.AuthSignOutOptions
    public int hashCode() {
        return s6c.m47910b(Boolean.valueOf(isGlobalSignOut()), getBrowserPackage());
    }

    @Override // com.amplifyframework.auth.options.AuthSignOutOptions
    public String toString() {
        return "AWSCognitoAuthSignOutOptions{isGlobalSignOut=" + isGlobalSignOut() + ", browserPackage=" + getBrowserPackage() + '}';
    }
}
