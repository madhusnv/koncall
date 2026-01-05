package com.amplifyframework.auth.cognito.options;

import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class FederateToIdentityPoolOptions {
    public static final Companion Companion = new Companion(null);
    private final String developerProvidedIdentityId;

    public static final class CognitoBuilder {
        private String developerProvidedIdentityId;

        public final FederateToIdentityPoolOptions build() {
            return new FederateToIdentityPoolOptions(this.developerProvidedIdentityId);
        }

        public final CognitoBuilder developerProvidedIdentityId(String str) {
            sq8.m48649h(str, "developerProvidedIdentityId");
            this.developerProvidedIdentityId = str;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final CognitoBuilder builder() {
            return new CognitoBuilder();
        }

        public final FederateToIdentityPoolOptions invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            xk7Var.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }

    public FederateToIdentityPoolOptions(String str) {
        this.developerProvidedIdentityId = str;
    }

    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    public static /* synthetic */ FederateToIdentityPoolOptions copy$default(FederateToIdentityPoolOptions federateToIdentityPoolOptions, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = federateToIdentityPoolOptions.developerProvidedIdentityId;
        }
        return federateToIdentityPoolOptions.copy(str);
    }

    public final String component1() {
        return this.developerProvidedIdentityId;
    }

    public final FederateToIdentityPoolOptions copy(String str) {
        return new FederateToIdentityPoolOptions(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FederateToIdentityPoolOptions) && sq8.m48644c(this.developerProvidedIdentityId, ((FederateToIdentityPoolOptions) obj).developerProvidedIdentityId);
    }

    public final String getDeveloperProvidedIdentityId() {
        return this.developerProvidedIdentityId;
    }

    public int hashCode() {
        String str = this.developerProvidedIdentityId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FederateToIdentityPoolOptions(developerProvidedIdentityId=" + this.developerProvidedIdentityId + ")";
    }
}
