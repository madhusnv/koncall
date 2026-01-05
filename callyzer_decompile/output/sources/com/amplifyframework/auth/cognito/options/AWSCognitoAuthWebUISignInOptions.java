package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.util.Immutable;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthWebUISignInOptions extends AuthWebUISignInOptions {
    private final String browserPackage;
    private final String idpIdentifier;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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
        if (obj != null && AWSCognitoAuthWebUISignInOptions.class == obj.getClass()) {
            AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptions = (AWSCognitoAuthWebUISignInOptions) obj;
            if (Objects.equals(getScopes(), aWSCognitoAuthWebUISignInOptions.getScopes()) && Objects.equals(getIdpIdentifier(), aWSCognitoAuthWebUISignInOptions.getIdpIdentifier()) && Objects.equals(getBrowserPackage(), aWSCognitoAuthWebUISignInOptions.getBrowserPackage())) {
                return true;
            }
        }
        return false;
    }

    public String getBrowserPackage() {
        return this.browserPackage;
    }

    public String getIdpIdentifier() {
        return this.idpIdentifier;
    }

    @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions
    public int hashCode() {
        return Objects.hash(getScopes(), getIdpIdentifier(), getBrowserPackage());
    }

    @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions
    public String toString() {
        return "AWSCognitoAuthWebUISignInOptions{scopes=" + getScopes() + ", idpIdentifier=" + getIdpIdentifier() + ", browserPackage=" + getBrowserPackage() + '}';
    }
}
