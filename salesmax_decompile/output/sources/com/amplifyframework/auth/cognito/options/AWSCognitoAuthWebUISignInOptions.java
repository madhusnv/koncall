package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.util.Immutable;
import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthWebUISignInOptions extends AuthWebUISignInOptions {
    private final String browserPackage;
    private final String idpIdentifier;

    public static final class CognitoBuilder extends AuthWebUISignInOptions.Builder<CognitoBuilder> {
        private String browserPackage;
        private String idpIdentifier;

        public CognitoBuilder browserPackage(String str) {
            this.browserPackage = str;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public CognitoBuilder idpIdentifier(String str) {
            this.idpIdentifier = str;
            return getThis();
        }

        @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions.Builder
        public AWSCognitoAuthWebUISignInOptions build() {
            return new AWSCognitoAuthWebUISignInOptions(Immutable.of(super.getScopes()), this.idpIdentifier, this.browserPackage);
        }
    }

    public AWSCognitoAuthWebUISignInOptions(List<String> list, String str, String str2) {
        super(list);
        this.idpIdentifier = str;
        this.browserPackage = str2;
    }

    public static CognitoBuilder builder() {
        return new CognitoBuilder();
    }

    @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthWebUISignInOptions.class != obj.getClass()) {
            return false;
        }
        AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptions = (AWSCognitoAuthWebUISignInOptions) obj;
        return s6c.m47909a(getScopes(), aWSCognitoAuthWebUISignInOptions.getScopes()) && s6c.m47909a(getIdpIdentifier(), aWSCognitoAuthWebUISignInOptions.getIdpIdentifier()) && s6c.m47909a(getBrowserPackage(), aWSCognitoAuthWebUISignInOptions.getBrowserPackage());
    }

    public String getBrowserPackage() {
        return this.browserPackage;
    }

    public String getIdpIdentifier() {
        return this.idpIdentifier;
    }

    @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions
    public int hashCode() {
        return s6c.m47910b(getScopes(), getIdpIdentifier(), getBrowserPackage());
    }

    @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions
    public String toString() {
        return "AWSCognitoAuthWebUISignInOptions{scopes=" + getScopes() + ", idpIdentifier=" + getIdpIdentifier() + ", browserPackage=" + getBrowserPackage() + '}';
    }
}
