package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthListWebAuthnCredentialsOptions;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthListWebAuthnCredentialsOptions extends AuthListWebAuthnCredentialsOptions {
    public static final Companion Companion = new Companion(null);
    private final Integer maxResults;
    private final String nextToken;

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

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
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
            sq8.m48649h(authListWebAuthnCredentialsOptions, "<this>");
            AWSCognitoAuthListWebAuthnCredentialsOptions aWSCognitoAuthListWebAuthnCredentialsOptionsAsCognitoOptions = asCognitoOptions(authListWebAuthnCredentialsOptions);
            if (aWSCognitoAuthListWebAuthnCredentialsOptionsAsCognitoOptions != null) {
                return aWSCognitoAuthListWebAuthnCredentialsOptionsAsCognitoOptions.getMaxResults();
            }
            return null;
        }

        public final String getNextToken$aws_auth_cognito_release(AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions) {
            sq8.m48649h(authListWebAuthnCredentialsOptions, "<this>");
            AWSCognitoAuthListWebAuthnCredentialsOptions aWSCognitoAuthListWebAuthnCredentialsOptionsAsCognitoOptions = asCognitoOptions(authListWebAuthnCredentialsOptions);
            if (aWSCognitoAuthListWebAuthnCredentialsOptionsAsCognitoOptions != null) {
                return aWSCognitoAuthListWebAuthnCredentialsOptionsAsCognitoOptions.getNextToken();
            }
            return null;
        }

        public final /* synthetic */ AWSCognitoAuthListWebAuthnCredentialsOptions invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "func");
            Builder builder = new Builder();
            xk7Var.invoke(builder);
            return builder.build();
        }
    }

    public AWSCognitoAuthListWebAuthnCredentialsOptions(String str, Integer num) {
        this.nextToken = str;
        this.maxResults = num;
    }

    public static final Builder builder() {
        return Companion.builder();
    }

    public static /* synthetic */ AWSCognitoAuthListWebAuthnCredentialsOptions copy$default(AWSCognitoAuthListWebAuthnCredentialsOptions aWSCognitoAuthListWebAuthnCredentialsOptions, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aWSCognitoAuthListWebAuthnCredentialsOptions.nextToken;
        }
        if ((i & 2) != 0) {
            num = aWSCognitoAuthListWebAuthnCredentialsOptions.maxResults;
        }
        return aWSCognitoAuthListWebAuthnCredentialsOptions.copy(str, num);
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

    public final AWSCognitoAuthListWebAuthnCredentialsOptions copy(String str, Integer num) {
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
        return sq8.m48644c(this.nextToken, aWSCognitoAuthListWebAuthnCredentialsOptions.nextToken) && sq8.m48644c(this.maxResults, aWSCognitoAuthListWebAuthnCredentialsOptions.maxResults);
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
