package com.amplifyframework.api.aws;

import com.amplifyframework.api.aws.sigv4.ApiKeyAuthProvider;
import com.amplifyframework.api.aws.sigv4.CognitoUserPoolsAuthProvider;
import com.amplifyframework.api.aws.sigv4.FunctionAuthProvider;
import com.amplifyframework.api.aws.sigv4.OidcAuthProvider;
import com.amplifyframework.auth.CognitoCredentialsProvider;
import java.util.Objects;
import p001o.qc4;

/* loaded from: classes5.dex */
public final class ApiAuthProviders {
    private final ApiKeyAuthProvider apiKeyAuthProvider;
    private final qc4 awsCredentialsProvider;
    private final CognitoUserPoolsAuthProvider cognitoUserPoolsAuthProvider;
    private final FunctionAuthProvider functionAuthProvider;
    private final OidcAuthProvider oidcAuthProvider;

    public static final class Builder {
        private ApiKeyAuthProvider apiKeyAuthProvider;
        private qc4 awsCredentialsProvider = new CognitoCredentialsProvider();
        private CognitoUserPoolsAuthProvider cognitoUserPoolsAuthProvider;
        private FunctionAuthProvider functionAuthProvider;
        private OidcAuthProvider oidcAuthProvider;

        public Builder apiKeyAuthProvider(ApiKeyAuthProvider apiKeyAuthProvider) {
            Objects.requireNonNull(apiKeyAuthProvider);
            this.apiKeyAuthProvider = apiKeyAuthProvider;
            return this;
        }

        public Builder awsCredentialsProvider(qc4 qc4Var) {
            Objects.requireNonNull(qc4Var);
            this.awsCredentialsProvider = qc4Var;
            return this;
        }

        public ApiAuthProviders build() {
            return new ApiAuthProviders(this);
        }

        public Builder cognitoUserPoolsAuthProvider(CognitoUserPoolsAuthProvider cognitoUserPoolsAuthProvider) {
            Objects.requireNonNull(cognitoUserPoolsAuthProvider);
            this.cognitoUserPoolsAuthProvider = cognitoUserPoolsAuthProvider;
            return this;
        }

        public Builder functionAuthProvider(FunctionAuthProvider functionAuthProvider) {
            Objects.requireNonNull(functionAuthProvider);
            this.functionAuthProvider = functionAuthProvider;
            return this;
        }

        public qc4 getAWSCredentialsProvider() {
            return this.awsCredentialsProvider;
        }

        public ApiKeyAuthProvider getApiKeyAuthProvider() {
            return this.apiKeyAuthProvider;
        }

        public CognitoUserPoolsAuthProvider getCognitoUserPoolsAuthProvider() {
            return this.cognitoUserPoolsAuthProvider;
        }

        public FunctionAuthProvider getFunctionAuthProvider() {
            return this.functionAuthProvider;
        }

        public OidcAuthProvider getOidcAuthProvider() {
            return this.oidcAuthProvider;
        }

        public Builder oidcAuthProvider(OidcAuthProvider oidcAuthProvider) {
            Objects.requireNonNull(oidcAuthProvider);
            this.oidcAuthProvider = oidcAuthProvider;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiAuthProviders noProviderOverrides() {
        return builder().build();
    }

    public qc4 getAWSCredentialsProvider() {
        return this.awsCredentialsProvider;
    }

    public ApiKeyAuthProvider getApiKeyAuthProvider() {
        return this.apiKeyAuthProvider;
    }

    public CognitoUserPoolsAuthProvider getCognitoUserPoolsAuthProvider() {
        return this.cognitoUserPoolsAuthProvider;
    }

    public FunctionAuthProvider getFunctionAuthProvider() {
        return this.functionAuthProvider;
    }

    public OidcAuthProvider getOidcAuthProvider() {
        return this.oidcAuthProvider;
    }

    private ApiAuthProviders(Builder builder) {
        this.apiKeyAuthProvider = builder.getApiKeyAuthProvider();
        this.awsCredentialsProvider = builder.getAWSCredentialsProvider();
        this.oidcAuthProvider = builder.getOidcAuthProvider();
        this.cognitoUserPoolsAuthProvider = builder.getCognitoUserPoolsAuthProvider();
        this.functionAuthProvider = builder.getFunctionAuthProvider();
    }
}
