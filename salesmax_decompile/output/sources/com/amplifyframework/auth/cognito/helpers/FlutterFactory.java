package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.AWSCognitoUserPoolTokens;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.result.AuthSessionResult;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class FlutterFactory {
    public static final FlutterFactory INSTANCE = new FlutterFactory();

    private FlutterFactory() {
    }

    public final AWSCognitoAuthSession createAWSCognitoAuthSession(boolean z, AuthSessionResult<String> authSessionResult, AuthSessionResult<AWSCredentials> authSessionResult2, AuthSessionResult<String> authSessionResult3, AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResult4) {
        sq8.m48649h(authSessionResult, "identityIdResult");
        sq8.m48649h(authSessionResult2, "awsCredentialsResult");
        sq8.m48649h(authSessionResult3, "userSubResult");
        sq8.m48649h(authSessionResult4, "userPoolTokensResult");
        return new AWSCognitoAuthSession(z, authSessionResult, authSessionResult2, authSessionResult3, authSessionResult4);
    }

    public final AWSCognitoUserPoolTokens createAWSCognitoUserPoolTokens(String str, String str2, String str3) {
        return new AWSCognitoUserPoolTokens(str, str2, str3);
    }
}
