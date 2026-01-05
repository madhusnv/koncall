package com.amplifyframework.auth.plugins.core;

import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.auth.result.AuthSessionResult;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSCognitoIdentityPoolDetails {
    public static final Companion Companion = new Companion(null);
    private static final ConfigurationException configurationException = new ConfigurationException("Identity Pool not configured.", "Please check Cognito identity pool configuration.", null, 4, null);
    private final AuthSessionResult<AWSCredentials> awsCredentialsResult;
    private final AuthSessionResult<String> identityIdResult;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final AWSCognitoIdentityPoolDetails configErrorResult() {
            AuthSessionResult authSessionResultFailure = AuthSessionResult.failure(AWSCognitoIdentityPoolDetails.configurationException);
            sq8.m48648g(authSessionResultFailure, "failure(...)");
            AuthSessionResult authSessionResultFailure2 = AuthSessionResult.failure(AWSCognitoIdentityPoolDetails.configurationException);
            sq8.m48648g(authSessionResultFailure2, "failure(...)");
            return new AWSCognitoIdentityPoolDetails(authSessionResultFailure, authSessionResultFailure2);
        }
    }

    public AWSCognitoIdentityPoolDetails(AuthSessionResult<String> authSessionResult, AuthSessionResult<AWSCredentials> authSessionResult2) {
        sq8.m48649h(authSessionResult, "identityIdResult");
        sq8.m48649h(authSessionResult2, "awsCredentialsResult");
        this.identityIdResult = authSessionResult;
        this.awsCredentialsResult = authSessionResult2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoIdentityPoolDetails copy$default(AWSCognitoIdentityPoolDetails aWSCognitoIdentityPoolDetails, AuthSessionResult authSessionResult, AuthSessionResult authSessionResult2, int i, Object obj) {
        if ((i & 1) != 0) {
            authSessionResult = aWSCognitoIdentityPoolDetails.identityIdResult;
        }
        if ((i & 2) != 0) {
            authSessionResult2 = aWSCognitoIdentityPoolDetails.awsCredentialsResult;
        }
        return aWSCognitoIdentityPoolDetails.copy(authSessionResult, authSessionResult2);
    }

    public final AuthSessionResult<String> component1() {
        return this.identityIdResult;
    }

    public final AuthSessionResult<AWSCredentials> component2() {
        return this.awsCredentialsResult;
    }

    public final AWSCognitoIdentityPoolDetails copy(AuthSessionResult<String> authSessionResult, AuthSessionResult<AWSCredentials> authSessionResult2) {
        sq8.m48649h(authSessionResult, "identityIdResult");
        sq8.m48649h(authSessionResult2, "awsCredentialsResult");
        return new AWSCognitoIdentityPoolDetails(authSessionResult, authSessionResult2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoIdentityPoolDetails)) {
            return false;
        }
        AWSCognitoIdentityPoolDetails aWSCognitoIdentityPoolDetails = (AWSCognitoIdentityPoolDetails) obj;
        return sq8.m48644c(this.identityIdResult, aWSCognitoIdentityPoolDetails.identityIdResult) && sq8.m48644c(this.awsCredentialsResult, aWSCognitoIdentityPoolDetails.awsCredentialsResult);
    }

    public final AuthSessionResult<AWSCredentials> getAwsCredentialsResult() {
        return this.awsCredentialsResult;
    }

    public final AuthSessionResult<String> getIdentityIdResult() {
        return this.identityIdResult;
    }

    public int hashCode() {
        return (this.identityIdResult.hashCode() * 31) + this.awsCredentialsResult.hashCode();
    }

    public String toString() {
        return "AWSCognitoIdentityPoolDetails(identityIdResult=" + this.identityIdResult + ", awsCredentialsResult=" + this.awsCredentialsResult + ")";
    }
}
