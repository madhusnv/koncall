package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.AWSCognitoUserPoolTokens;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.result.AuthSessionResult;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FlutterFactory {
    public static final FlutterFactory INSTANCE = new FlutterFactory();

    private FlutterFactory() {
    }

    public final AWSCognitoAuthSession createAWSCognitoAuthSession(boolean z6, AuthSessionResult<String> identityIdResult, AuthSessionResult<AWSCredentials> awsCredentialsResult, AuthSessionResult<String> userSubResult, AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult) {
        AbstractC4154l.m8923f(identityIdResult, "identityIdResult");
        AbstractC4154l.m8923f(awsCredentialsResult, "awsCredentialsResult");
        AbstractC4154l.m8923f(userSubResult, "userSubResult");
        AbstractC4154l.m8923f(userPoolTokensResult, "userPoolTokensResult");
        return new AWSCognitoAuthSession(z6, identityIdResult, awsCredentialsResult, userSubResult, userPoolTokensResult);
    }

    public final AWSCognitoUserPoolTokens createAWSCognitoUserPoolTokens(String str, String str2, String str3) {
        return new AWSCognitoUserPoolTokens(str, str2, str3);
    }
}
