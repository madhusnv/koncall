package com.amplifyframework.auth;

import com.amplifyframework.auth.result.AuthSessionResult;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AWSAuthSessionBehavior<TokensType> extends AuthSession {
    private final AuthSessionResult<AWSCredentials> awsCredentialsResult;
    private final AuthSessionResult<String> identityIdResult;
    private final AuthSessionResult<TokensType> tokensResult;
    private final AuthSessionResult<String> userSubResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSAuthSessionBehavior(boolean z6, AuthSessionResult<String> identityIdResult, AuthSessionResult<AWSCredentials> awsCredentialsResult, AuthSessionResult<String> userSubResult, AuthSessionResult<TokensType> tokensResult) {
        super(z6);
        AbstractC4154l.m8923f(identityIdResult, "identityIdResult");
        AbstractC4154l.m8923f(awsCredentialsResult, "awsCredentialsResult");
        AbstractC4154l.m8923f(userSubResult, "userSubResult");
        AbstractC4154l.m8923f(tokensResult, "tokensResult");
        this.identityIdResult = identityIdResult;
        this.awsCredentialsResult = awsCredentialsResult;
        this.userSubResult = userSubResult;
        this.tokensResult = tokensResult;
    }

    public abstract String getAccessToken();

    public AuthSessionResult<AWSCredentials> getAwsCredentialsResult() {
        return this.awsCredentialsResult;
    }

    public AuthSessionResult<String> getIdentityIdResult() {
        return this.identityIdResult;
    }

    public final AuthSessionResult<TokensType> getTokensResult() {
        return this.tokensResult;
    }

    public AuthSessionResult<String> getUserSubResult() {
        return this.userSubResult;
    }
}
