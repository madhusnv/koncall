package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.AWSAuthSessionBehavior;
import com.amplifyframework.auth.AWSCognitoUserPoolTokens;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.result.AuthSessionResult;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthSession extends AWSAuthSessionBehavior<AWSCognitoUserPoolTokens> {
    private final String accessToken;
    private final AuthSessionResult<AWSCredentials> awsCredentialsResult;
    private final AuthSessionResult<String> identityIdResult;
    private final boolean isSignedIn;
    private final AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult;
    private final AuthSessionResult<String> userSubResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSCognitoAuthSession(boolean z6, AuthSessionResult<String> identityIdResult, AuthSessionResult<AWSCredentials> awsCredentialsResult, AuthSessionResult<String> userSubResult, AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult) {
        super(z6, identityIdResult, awsCredentialsResult, userSubResult, userPoolTokensResult);
        AbstractC4154l.m8923f(identityIdResult, "identityIdResult");
        AbstractC4154l.m8923f(awsCredentialsResult, "awsCredentialsResult");
        AbstractC4154l.m8923f(userSubResult, "userSubResult");
        AbstractC4154l.m8923f(userPoolTokensResult, "userPoolTokensResult");
        this.isSignedIn = z6;
        this.identityIdResult = identityIdResult;
        this.awsCredentialsResult = awsCredentialsResult;
        this.userSubResult = userSubResult;
        this.userPoolTokensResult = userPoolTokensResult;
        AWSCognitoUserPoolTokens value = userPoolTokensResult.getValue();
        this.accessToken = value != null ? value.getAccessToken() : null;
    }

    public static /* synthetic */ AWSCognitoAuthSession copy$aws_auth_cognito_release$default(AWSCognitoAuthSession aWSCognitoAuthSession, boolean z6, AuthSessionResult authSessionResult, AuthSessionResult authSessionResult2, AuthSessionResult authSessionResult3, AuthSessionResult authSessionResult4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = aWSCognitoAuthSession.isSignedIn;
        }
        if ((i10 & 2) != 0) {
            authSessionResult = aWSCognitoAuthSession.identityIdResult;
        }
        if ((i10 & 4) != 0) {
            authSessionResult2 = aWSCognitoAuthSession.awsCredentialsResult;
        }
        if ((i10 & 8) != 0) {
            authSessionResult3 = aWSCognitoAuthSession.userSubResult;
        }
        if ((i10 & 16) != 0) {
            authSessionResult4 = aWSCognitoAuthSession.userPoolTokensResult;
        }
        AuthSessionResult authSessionResult5 = authSessionResult4;
        AuthSessionResult authSessionResult6 = authSessionResult2;
        return aWSCognitoAuthSession.copy$aws_auth_cognito_release(z6, authSessionResult, authSessionResult6, authSessionResult3, authSessionResult5);
    }

    public final boolean component1() {
        return this.isSignedIn;
    }

    public final AuthSessionResult<String> component2() {
        return this.identityIdResult;
    }

    public final AuthSessionResult<AWSCredentials> component3() {
        return this.awsCredentialsResult;
    }

    public final AuthSessionResult<String> component4() {
        return this.userSubResult;
    }

    public final AuthSessionResult<AWSCognitoUserPoolTokens> component5() {
        return this.userPoolTokensResult;
    }

    public final AWSCognitoAuthSession copy$aws_auth_cognito_release(boolean z6, AuthSessionResult<String> identityIdResult, AuthSessionResult<AWSCredentials> awsCredentialsResult, AuthSessionResult<String> userSubResult, AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult) {
        AbstractC4154l.m8923f(identityIdResult, "identityIdResult");
        AbstractC4154l.m8923f(awsCredentialsResult, "awsCredentialsResult");
        AbstractC4154l.m8923f(userSubResult, "userSubResult");
        AbstractC4154l.m8923f(userPoolTokensResult, "userPoolTokensResult");
        return new AWSCognitoAuthSession(z6, identityIdResult, awsCredentialsResult, userSubResult, userPoolTokensResult);
    }

    @Override // com.amplifyframework.auth.AuthSession
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoAuthSession)) {
            return false;
        }
        AWSCognitoAuthSession aWSCognitoAuthSession = (AWSCognitoAuthSession) obj;
        return this.isSignedIn == aWSCognitoAuthSession.isSignedIn && AbstractC4154l.m8918a(this.identityIdResult, aWSCognitoAuthSession.identityIdResult) && AbstractC4154l.m8918a(this.awsCredentialsResult, aWSCognitoAuthSession.awsCredentialsResult) && AbstractC4154l.m8918a(this.userSubResult, aWSCognitoAuthSession.userSubResult) && AbstractC4154l.m8918a(this.userPoolTokensResult, aWSCognitoAuthSession.userPoolTokensResult);
    }

    @Override // com.amplifyframework.auth.AWSAuthSessionBehavior
    public String getAccessToken() {
        return this.accessToken;
    }

    @Override // com.amplifyframework.auth.AWSAuthSessionBehavior
    public AuthSessionResult<AWSCredentials> getAwsCredentialsResult() {
        return this.awsCredentialsResult;
    }

    @Override // com.amplifyframework.auth.AWSAuthSessionBehavior
    public AuthSessionResult<String> getIdentityIdResult() {
        return this.identityIdResult;
    }

    public final AuthSessionResult<AWSCognitoUserPoolTokens> getUserPoolTokensResult() {
        return this.userPoolTokensResult;
    }

    @Override // com.amplifyframework.auth.AWSAuthSessionBehavior
    public AuthSessionResult<String> getUserSubResult() {
        return this.userSubResult;
    }

    @Override // com.amplifyframework.auth.AuthSession
    public int hashCode() {
        return this.userPoolTokensResult.hashCode() + ((this.userSubResult.hashCode() + ((this.awsCredentialsResult.hashCode() + ((this.identityIdResult.hashCode() + (Boolean.hashCode(this.isSignedIn) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.amplifyframework.auth.AuthSession
    public boolean isSignedIn() {
        return this.isSignedIn;
    }

    @Override // com.amplifyframework.auth.AuthSession
    public String toString() {
        return "AWSCognitoAuthSession(isSignedIn=" + this.isSignedIn + ", identityIdResult=" + this.identityIdResult + ", awsCredentialsResult=" + this.awsCredentialsResult + ", userSubResult=" + this.userSubResult + ", userPoolTokensResult=" + this.userPoolTokensResult + ")";
    }
}
