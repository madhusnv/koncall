package com.amplifyframework.api.aws;

import android.annotation.SuppressLint;
import java.util.Objects;

/* loaded from: classes5.dex */
final class ApiConfiguration {
    private final String apiKey;
    private final AuthorizationType authorizationType;
    private final String endpoint;
    private final EndpointType endpointType;
    private final String region;

    public static final class Builder {
        private String apiKey;
        private AuthorizationType authorizationType;
        private String endpoint;
        private EndpointType endpointType;
        private String region;

        public Builder apiKey(String str) {
            this.apiKey = str;
            return this;
        }

        public Builder authorizationType(String str) {
            return authorizationType(AuthorizationType.from(str));
        }

        @SuppressLint({"SyntheticAccessor"})
        public ApiConfiguration build() {
            Objects.requireNonNull(this.endpoint);
            Objects.requireNonNull(this.region);
            Objects.requireNonNull(this.authorizationType);
            return new ApiConfiguration(this);
        }

        public Builder endpoint(String str) {
            Objects.requireNonNull(str);
            this.endpoint = str;
            return this;
        }

        public Builder endpointType(EndpointType endpointType) {
            Objects.requireNonNull(endpointType);
            this.endpointType = endpointType;
            return this;
        }

        public Builder region(String str) {
            Objects.requireNonNull(str);
            this.region = str;
            return this;
        }

        public Builder authorizationType(AuthorizationType authorizationType) {
            Objects.requireNonNull(authorizationType);
            this.authorizationType = authorizationType;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public AuthorizationType getAuthorizationType() {
        return this.authorizationType;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public EndpointType getEndpointType() {
        return this.endpointType;
    }

    public String getRegion() {
        return this.region;
    }

    @SuppressLint({"SyntheticAccessor"})
    private ApiConfiguration(Builder builder) {
        this.endpointType = builder.endpointType;
        this.endpoint = builder.endpoint;
        this.region = builder.region;
        this.authorizationType = builder.authorizationType;
        this.apiKey = builder.apiKey;
    }
}
