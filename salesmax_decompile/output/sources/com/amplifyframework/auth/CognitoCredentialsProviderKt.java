package com.amplifyframework.auth;

/* loaded from: classes5.dex */
public final class CognitoCredentialsProviderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final AWSAuthSessionBehavior<?> toAWSAuthSession(AuthSession authSession) {
        if (authSession instanceof AWSAuthSessionBehavior) {
            return (AWSAuthSessionBehavior) authSession;
        }
        return null;
    }
}
