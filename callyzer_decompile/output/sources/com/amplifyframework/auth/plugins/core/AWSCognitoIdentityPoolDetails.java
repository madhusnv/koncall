package com.amplifyframework.auth.plugins.core;

import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.auth.result.AuthSessionResult;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoIdentityPoolDetails {
    public static final Companion Companion = new Companion(null);
    private static final ConfigurationException configurationException = new ConfigurationException("Identity Pool not configured.", "Please check Cognito identity pool configuration.", null, 4, null);
    private final AuthSessionResult<AWSCredentials> awsCredentialsResult;
    private final AuthSessionResult<String> identityIdResult;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final AWSCognitoIdentityPoolDetails configErrorResult() {
            AuthSessionResult authSessionResultFailure = AuthSessionResult.failure(AWSCognitoIdentityPoolDetails.configurationException);
            AbstractC4154l.m8922e(authSessionResultFailure, "failure(...)");
            AuthSessionResult authSessionResultFailure2 = AuthSessionResult.failure(AWSCognitoIdentityPoolDetails.configurationException);
            AbstractC4154l.m8922e(authSessionResultFailure2, "failure(...)");
            return new AWSCognitoIdentityPoolDetails(authSessionResultFailure, authSessionResultFailure2);
        }

        private Companion() {
        }
    }

    public AWSCognitoIdentityPoolDetails(AuthSessionResult<String> identityIdResult, AuthSessionResult<AWSCredentials> awsCredentialsResult) {
        AbstractC4154l.m8923f(identityIdResult, "identityIdResult");
        AbstractC4154l.m8923f(awsCredentialsResult, "awsCredentialsResult");
        this.identityIdResult = identityIdResult;
        this.awsCredentialsResult = awsCredentialsResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoIdentityPoolDetails copy$aws_auth_plugins_core_release$default(AWSCognitoIdentityPoolDetails aWSCognitoIdentityPoolDetails, AuthSessionResult authSessionResult, AuthSessionResult authSessionResult2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            authSessionResult = aWSCognitoIdentityPoolDetails.identityIdResult;
        }
        if ((i10 & 2) != 0) {
            authSessionResult2 = aWSCognitoIdentityPoolDetails.awsCredentialsResult;
        }
        return aWSCognitoIdentityPoolDetails.copy$aws_auth_plugins_core_release(authSessionResult, authSessionResult2);
    }

    public final AuthSessionResult<String> component1() {
        return this.identityIdResult;
    }

    public final AuthSessionResult<AWSCredentials> component2() {
        return this.awsCredentialsResult;
    }

    public final AWSCognitoIdentityPoolDetails copy$aws_auth_plugins_core_release(AuthSessionResult<String> identityIdResult, AuthSessionResult<AWSCredentials> awsCredentialsResult) {
        AbstractC4154l.m8923f(identityIdResult, "identityIdResult");
        AbstractC4154l.m8923f(awsCredentialsResult, "awsCredentialsResult");
        return new AWSCognitoIdentityPoolDetails(identityIdResult, awsCredentialsResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoIdentityPoolDetails)) {
            return false;
        }
        AWSCognitoIdentityPoolDetails aWSCognitoIdentityPoolDetails = (AWSCognitoIdentityPoolDetails) obj;
        return AbstractC4154l.m8918a(this.identityIdResult, aWSCognitoIdentityPoolDetails.identityIdResult) && AbstractC4154l.m8918a(this.awsCredentialsResult, aWSCognitoIdentityPoolDetails.awsCredentialsResult);
    }

    public final AuthSessionResult<AWSCredentials> getAwsCredentialsResult() {
        return this.awsCredentialsResult;
    }

    public final AuthSessionResult<String> getIdentityIdResult() {
        return this.identityIdResult;
    }

    public int hashCode() {
        return this.awsCredentialsResult.hashCode() + (this.identityIdResult.hashCode() * 31);
    }

    public String toString() {
        return "AWSCognitoIdentityPoolDetails(identityIdResult=" + this.identityIdResult + ", awsCredentialsResult=" + this.awsCredentialsResult + ")";
    }
}
