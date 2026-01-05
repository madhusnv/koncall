package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthSignOutOptions;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthSignOutOptions extends AuthSignOutOptions {
    private final String browserPackage;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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

    public AWSCognitoAuthSignOutOptions(boolean z6, String str) {
        super(z6);
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
        if (obj != null && AWSCognitoAuthSignOutOptions.class == obj.getClass()) {
            AWSCognitoAuthSignOutOptions aWSCognitoAuthSignOutOptions = (AWSCognitoAuthSignOutOptions) obj;
            if (Boolean.valueOf(isGlobalSignOut()).equals(Boolean.valueOf(aWSCognitoAuthSignOutOptions.isGlobalSignOut())) && Objects.equals(getBrowserPackage(), aWSCognitoAuthSignOutOptions.getBrowserPackage())) {
                return true;
            }
        }
        return false;
    }

    public String getBrowserPackage() {
        return this.browserPackage;
    }

    @Override // com.amplifyframework.auth.options.AuthSignOutOptions
    public int hashCode() {
        return Objects.hash(Boolean.valueOf(isGlobalSignOut()), getBrowserPackage());
    }

    @Override // com.amplifyframework.auth.options.AuthSignOutOptions
    public String toString() {
        return "AWSCognitoAuthSignOutOptions{isGlobalSignOut=" + isGlobalSignOut() + ", browserPackage=" + getBrowserPackage() + '}';
    }
}
