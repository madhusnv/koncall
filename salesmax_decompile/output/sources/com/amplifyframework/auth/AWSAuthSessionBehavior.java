package com.amplifyframework.auth;

import com.amplifyframework.auth.result.AuthSessionResult;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class AWSAuthSessionBehavior<TokensType> extends AuthSession {
    private final AuthSessionResult<AWSCredentials> awsCredentialsResult;
    private final AuthSessionResult<String> identityIdResult;
    private final AuthSessionResult<TokensType> tokensResult;
    private final AuthSessionResult<String> userSubResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSAuthSessionBehavior(boolean z, AuthSessionResult<String> authSessionResult, AuthSessionResult<AWSCredentials> authSessionResult2, AuthSessionResult<String> authSessionResult3, AuthSessionResult<TokensType> authSessionResult4) {
        super(z);
        sq8.m48649h(authSessionResult, "identityIdResult");
        sq8.m48649h(authSessionResult2, "awsCredentialsResult");
        sq8.m48649h(authSessionResult3, "userSubResult");
        sq8.m48649h(authSessionResult4, "tokensResult");
        this.identityIdResult = authSessionResult;
        this.awsCredentialsResult = authSessionResult2;
        this.userSubResult = authSessionResult3;
        this.tokensResult = authSessionResult4;
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
