package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthListWebAuthnCredentialsOptions;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthListWebAuthnCredentialsOptions extends AuthListWebAuthnCredentialsOptions {
    public static final Companion Companion = new Companion(null);
    private final Integer maxResults;
    private final String nextToken;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends AuthListWebAuthnCredentialsOptions.Builder<Builder> {
        private Integer maxResults;
        private String nextToken;

        public final Integer getMaxResults() {
            return this.maxResults;
        }

        public final String getNextToken() {
            return this.nextToken;
        }

        @Override // com.amplifyframework.auth.options.AuthListWebAuthnCredentialsOptions.Builder
        public Builder getThis() {
            return this;
        }

        public final Builder maxResults(Integer num) {
            this.maxResults = num;
            return this;
        }

        public final Builder nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public final /* synthetic */ void setMaxResults(Integer num) {
            this.maxResults = num;
        }

        public final /* synthetic */ void setNextToken(String str) {
            this.nextToken = str;
        }

        @Override // com.amplifyframework.auth.options.AuthListWebAuthnCredentialsOptions.Builder
        public AWSCognitoAuthListWebAuthnCredentialsOptions build() {
            return new AWSCognitoAuthListWebAuthnCredentialsOptions(this.nextToken, this.maxResults);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private final AWSCognitoAuthListWebAuthnCredentialsOptions asCognitoOptions(AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions) {
            if (authListWebAuthnCredentialsOptions instanceof AWSCognitoAuthListWebAuthnCredentialsOptions) {
                return (AWSCognitoAuthListWebAuthnCredentialsOptions) authListWebAuthnCredentialsOptions;
            }
            return null;
        }

        public final Builder builder() {
            return new Builder();
        }

        public final AWSCognitoAuthListWebAuthnCredentialsOptions defaults() {
            return builder().build();
        }

        public final Integer getMaxResults$aws_auth_cognito_release(AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions) {
            AbstractC4154l.m8923f(authListWebAuthnCredentialsOptions, "<this>");
            AWSCognitoAuthListWebAuthnCredentialsOptions aWSCognitoAuthListWebAuthnCredentialsOptionsAsCognitoOptions = asCognitoOptions(authListWebAuthnCredentialsOptions);
            if (aWSCognitoAuthListWebAuthnCredentialsOptionsAsCognitoOptions != null) {
                return aWSCognitoAuthListWebAuthnCredentialsOptionsAsCognitoOptions.getMaxResults();
            }
            return null;
        }

        public final String getNextToken$aws_auth_cognito_release(AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions) {
            AbstractC4154l.m8923f(authListWebAuthnCredentialsOptions, "<this>");
            AWSCognitoAuthListWebAuthnCredentialsOptions aWSCognitoAuthListWebAuthnCredentialsOptionsAsCognitoOptions = asCognitoOptions(authListWebAuthnCredentialsOptions);
            if (aWSCognitoAuthListWebAuthnCredentialsOptionsAsCognitoOptions != null) {
                return aWSCognitoAuthListWebAuthnCredentialsOptionsAsCognitoOptions.getNextToken();
            }
            return null;
        }

        public final /* synthetic */ AWSCognitoAuthListWebAuthnCredentialsOptions invoke(InterfaceC2139c func) {
            AbstractC4154l.m8923f(func, "func");
            Builder builder = new Builder();
            func.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public AWSCognitoAuthListWebAuthnCredentialsOptions(String str, Integer num) {
        this.nextToken = str;
        this.maxResults = num;
    }

    public static final Builder builder() {
        return Companion.builder();
    }

    public static /* synthetic */ AWSCognitoAuthListWebAuthnCredentialsOptions copy$aws_auth_cognito_release$default(AWSCognitoAuthListWebAuthnCredentialsOptions aWSCognitoAuthListWebAuthnCredentialsOptions, String str, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aWSCognitoAuthListWebAuthnCredentialsOptions.nextToken;
        }
        if ((i10 & 2) != 0) {
            num = aWSCognitoAuthListWebAuthnCredentialsOptions.maxResults;
        }
        return aWSCognitoAuthListWebAuthnCredentialsOptions.copy$aws_auth_cognito_release(str, num);
    }

    public static final AWSCognitoAuthListWebAuthnCredentialsOptions defaults() {
        return Companion.defaults();
    }

    public final String component1() {
        return this.nextToken;
    }

    public final Integer component2() {
        return this.maxResults;
    }

    public final AWSCognitoAuthListWebAuthnCredentialsOptions copy$aws_auth_cognito_release(String str, Integer num) {
        return new AWSCognitoAuthListWebAuthnCredentialsOptions(str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoAuthListWebAuthnCredentialsOptions)) {
            return false;
        }
        AWSCognitoAuthListWebAuthnCredentialsOptions aWSCognitoAuthListWebAuthnCredentialsOptions = (AWSCognitoAuthListWebAuthnCredentialsOptions) obj;
        return AbstractC4154l.m8918a(this.nextToken, aWSCognitoAuthListWebAuthnCredentialsOptions.nextToken) && AbstractC4154l.m8918a(this.maxResults, aWSCognitoAuthListWebAuthnCredentialsOptions.maxResults);
    }

    public final Integer getMaxResults() {
        return this.maxResults;
    }

    public final String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        String str = this.nextToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.maxResults;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AWSCognitoAuthListWebAuthnCredentialsOptions(nextToken=" + this.nextToken + ", maxResults=" + this.maxResults + ")";
    }
}
