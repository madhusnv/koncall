package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.AWSAuthSessionBehavior;
import com.amplifyframework.auth.AWSCognitoUserPoolTokens;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException;
import com.amplifyframework.auth.cognito.helpers.SessionHelper;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.auth.exceptions.SignedOutException;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.auth.result.AuthSessionResult;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthSessionKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final AWSAuthSessionBehavior<AWSCognitoUserPoolTokens> getCognitoSession(AmplifyCredential amplifyCredential, AuthException authException) {
        AbstractC4154l.m8923f(amplifyCredential, "<this>");
        if (amplifyCredential instanceof AmplifyCredential.UserPool) {
            AuthSessionResult authSessionResultFailure = AuthSessionResult.failure(new ConfigurationException("Could not retrieve Identity ID", "Cognito Identity not configured. Please check amplifyconfiguration.json file.", null, 4, null));
            AbstractC4154l.m8922e(authSessionResultFailure, "failure(...)");
            AuthSessionResult authSessionResultFailure2 = AuthSessionResult.failure(new ConfigurationException("Could not fetch AWS Cognito credentials", "Cognito Identity not configured. Please check amplifyconfiguration.json file.", 0 == true ? 1 : 0, 4, null));
            AbstractC4154l.m8922e(authSessionResultFailure2, "failure(...)");
            AmplifyCredential.UserPool userPool = (AmplifyCredential.UserPool) amplifyCredential;
            return new AWSCognitoAuthSession(true, authSessionResultFailure, authSessionResultFailure2, getCognitoSession$getUserSubResult(userPool.getSignedInData().getCognitoUserPoolTokens(), authException), getCognitoSession$getUserPoolTokensResult(userPool.getSignedInData().getCognitoUserPoolTokens(), authException));
        }
        if (amplifyCredential instanceof AmplifyCredential.UserAndIdentityPool) {
            AmplifyCredential.UserAndIdentityPool userAndIdentityPool = (AmplifyCredential.UserAndIdentityPool) amplifyCredential;
            return new AWSCognitoAuthSession(true, getCognitoSession$getIdentityIdResult(userAndIdentityPool.getIdentityId(), authException), getCognitoSession$getCredentialsResult(userAndIdentityPool.getCredentials(), authException), getCognitoSession$getUserSubResult(userAndIdentityPool.getSignedInData().getCognitoUserPoolTokens(), authException), getCognitoSession$getUserPoolTokensResult(userAndIdentityPool.getSignedInData().getCognitoUserPoolTokens(), authException));
        }
        if (amplifyCredential instanceof AmplifyCredential.IdentityPool) {
            AmplifyCredential.IdentityPool identityPool = (AmplifyCredential.IdentityPool) amplifyCredential;
            AuthSessionResult<String> cognitoSession$getIdentityIdResult = getCognitoSession$getIdentityIdResult(identityPool.getIdentityId(), authException);
            AuthSessionResult<AWSCredentials> cognitoSession$getCredentialsResult = getCognitoSession$getCredentialsResult(identityPool.getCredentials(), authException);
            String str = null;
            AuthSessionResult authSessionResultFailure3 = AuthSessionResult.failure(new SignedOutException(null, str, null, 7, null));
            AbstractC4154l.m8922e(authSessionResultFailure3, "failure(...)");
            Object[] objArr = 0 == true ? 1 : 0;
            AuthSessionResult authSessionResultFailure4 = AuthSessionResult.failure(new SignedOutException(str, objArr, null, 7, null));
            AbstractC4154l.m8922e(authSessionResultFailure4, "failure(...)");
            return new AWSCognitoAuthSession(false, cognitoSession$getIdentityIdResult, cognitoSession$getCredentialsResult, authSessionResultFailure3, authSessionResultFailure4);
        }
        if (!(amplifyCredential instanceof AmplifyCredential.IdentityPoolFederated)) {
            AuthSessionResult authSessionResultFailure5 = AuthSessionResult.failure(authException);
            AbstractC4154l.m8922e(authSessionResultFailure5, "failure(...)");
            AuthSessionResult authSessionResultFailure6 = AuthSessionResult.failure(authException);
            AbstractC4154l.m8922e(authSessionResultFailure6, "failure(...)");
            AuthSessionResult authSessionResultFailure7 = AuthSessionResult.failure(authException);
            AbstractC4154l.m8922e(authSessionResultFailure7, "failure(...)");
            AuthSessionResult authSessionResultFailure8 = AuthSessionResult.failure(authException);
            AbstractC4154l.m8922e(authSessionResultFailure8, "failure(...)");
            return new AWSCognitoAuthSession(false, authSessionResultFailure5, authSessionResultFailure6, authSessionResultFailure7, authSessionResultFailure8);
        }
        InvalidStateException invalidStateException = new InvalidStateException("Users Federated to Identity Pool do not have User Pool access.", "To access User Pool data, you must use a Sign In method.", null, 4, null);
        AmplifyCredential.IdentityPoolFederated identityPoolFederated = (AmplifyCredential.IdentityPoolFederated) amplifyCredential;
        AuthSessionResult<String> cognitoSession$getIdentityIdResult2 = getCognitoSession$getIdentityIdResult(identityPoolFederated.getIdentityId(), authException);
        AuthSessionResult<AWSCredentials> cognitoSession$getCredentialsResult2 = getCognitoSession$getCredentialsResult(identityPoolFederated.getCredentials(), authException);
        AuthSessionResult authSessionResultFailure9 = AuthSessionResult.failure(invalidStateException);
        AbstractC4154l.m8922e(authSessionResultFailure9, "failure(...)");
        AuthSessionResult authSessionResultFailure10 = AuthSessionResult.failure(invalidStateException);
        AbstractC4154l.m8922e(authSessionResultFailure10, "failure(...)");
        return new AWSCognitoAuthSession(true, cognitoSession$getIdentityIdResult2, cognitoSession$getCredentialsResult2, authSessionResultFailure9, authSessionResultFailure10);
    }

    public static /* synthetic */ AWSAuthSessionBehavior getCognitoSession$default(AmplifyCredential amplifyCredential, AuthException authException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            authException = null;
        }
        return getCognitoSession(amplifyCredential, authException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final AuthSessionResult<AWSCredentials> getCognitoSession$getCredentialsResult(com.amplifyframework.statemachine.codegen.data.AWSCredentials aWSCredentials, AuthException authException) {
        AuthSessionResult<AWSCredentials> authSessionResultSuccess;
        if (authException != null && !(authException instanceof SignedOutException)) {
            AuthSessionResult<AWSCredentials> authSessionResultFailure = AuthSessionResult.failure(authException);
            AbstractC4154l.m8922e(authSessionResultFailure, "failure(...)");
            return authSessionResultFailure;
        }
        AWSCredentials aWSCredentialsCreateAWSCredentials = AWSCredentials.Factory.createAWSCredentials(aWSCredentials.getAccessKeyId(), aWSCredentials.getSecretAccessKey(), aWSCredentials.getSessionToken(), aWSCredentials.getExpiration());
        if (aWSCredentialsCreateAWSCredentials != null && (authSessionResultSuccess = AuthSessionResult.success(aWSCredentialsCreateAWSCredentials)) != null) {
            return authSessionResultSuccess;
        }
        AuthSessionResult<AWSCredentials> authSessionResultFailure2 = AuthSessionResult.failure(new UnknownException("Failed to fetch AWS credentials.", null, 2, 0 == true ? 1 : 0));
        AbstractC4154l.m8922e(authSessionResultFailure2, "failure(...)");
        return authSessionResultFailure2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final AuthSessionResult<String> getCognitoSession$getIdentityIdResult(String str, AuthException authException) {
        if (authException != null && !(authException instanceof SignedOutException)) {
            AuthSessionResult<String> authSessionResultFailure = AuthSessionResult.failure(authException);
            AbstractC4154l.m8920c(authSessionResultFailure);
            return authSessionResultFailure;
        }
        if (str.length() > 0) {
            AuthSessionResult<String> authSessionResultSuccess = AuthSessionResult.success(str);
            AbstractC4154l.m8920c(authSessionResultSuccess);
            return authSessionResultSuccess;
        }
        AuthSessionResult<String> authSessionResultFailure2 = AuthSessionResult.failure(new UnknownException("Failed to fetch identity id.", null, 2, 0 == true ? 1 : 0));
        AbstractC4154l.m8920c(authSessionResultFailure2);
        return authSessionResultFailure2;
    }

    private static final AuthSessionResult<AWSCognitoUserPoolTokens> getCognitoSession$getUserPoolTokensResult(CognitoUserPoolTokens cognitoUserPoolTokens, AuthException authException) {
        if (authException == null || (authException instanceof SignedOutException)) {
            AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResultSuccess = AuthSessionResult.success(new AWSCognitoUserPoolTokens(cognitoUserPoolTokens.getAccessToken(), cognitoUserPoolTokens.getIdToken(), cognitoUserPoolTokens.getRefreshToken()));
            AbstractC4154l.m8922e(authSessionResultSuccess, "success(...)");
            return authSessionResultSuccess;
        }
        AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResultFailure = AuthSessionResult.failure(authException);
        AbstractC4154l.m8922e(authSessionResultFailure, "failure(...)");
        return authSessionResultFailure;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.amplifyframework.auth.result.AuthSessionResult<java.lang.String> getCognitoSession$getUserSubResult(com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens r2, com.amplifyframework.auth.AuthException r3) {
        /*
            if (r3 == 0) goto L10
            boolean r0 = r3 instanceof com.amplifyframework.auth.exceptions.SignedOutException
            if (r0 != 0) goto L10
            com.amplifyframework.auth.result.AuthSessionResult r2 = com.amplifyframework.auth.result.AuthSessionResult.failure(r3)
            java.lang.String r3 = "failure(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r2, r3)
            return r2
        L10:
            r3 = 0
            if (r2 == 0) goto L22
            java.lang.String r2 = r2.getAccessToken()     // Catch: java.lang.Exception -> L20
            if (r2 == 0) goto L22
            com.amplifyframework.auth.cognito.helpers.SessionHelper r0 = com.amplifyframework.auth.cognito.helpers.SessionHelper.INSTANCE     // Catch: java.lang.Exception -> L20
            java.lang.String r2 = r0.getUserSub(r2)     // Catch: java.lang.Exception -> L20
            goto L23
        L20:
            r2 = move-exception
            goto L2b
        L22:
            r2 = r3
        L23:
            com.amplifyframework.auth.result.AuthSessionResult r2 = com.amplifyframework.auth.result.AuthSessionResult.success(r2)     // Catch: java.lang.Exception -> L20
            kotlin.jvm.internal.AbstractC4154l.m8920c(r2)     // Catch: java.lang.Exception -> L20
            return r2
        L2b:
            com.amplifyframework.auth.exceptions.UnknownException r0 = new com.amplifyframework.auth.exceptions.UnknownException
            r1 = 1
            r0.<init>(r3, r2, r1, r3)
            com.amplifyframework.auth.result.AuthSessionResult r2 = com.amplifyframework.auth.result.AuthSessionResult.failure(r0)
            kotlin.jvm.internal.AbstractC4154l.m8920c(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.AWSCognitoAuthSessionKt.getCognitoSession$getUserSubResult(com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens, com.amplifyframework.auth.AuthException):com.amplifyframework.auth.result.AuthSessionResult");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isValid(AmplifyCredential amplifyCredential) {
        AbstractC4154l.m8923f(amplifyCredential, "<this>");
        if (amplifyCredential instanceof AmplifyCredential.UserPool) {
            return SessionHelper.INSTANCE.isValidTokens(((AmplifyCredential.UserPool) amplifyCredential).getSignedInData().getCognitoUserPoolTokens());
        }
        if (amplifyCredential instanceof AmplifyCredential.UserAndIdentityPool) {
            SessionHelper sessionHelper = SessionHelper.INSTANCE;
            AmplifyCredential.UserAndIdentityPool userAndIdentityPool = (AmplifyCredential.UserAndIdentityPool) amplifyCredential;
            return sessionHelper.isValidTokens(userAndIdentityPool.getSignedInData().getCognitoUserPoolTokens()) && sessionHelper.isValidSession(userAndIdentityPool.getCredentials());
        }
        if (amplifyCredential instanceof AmplifyCredential.IdentityPoolTypeCredential) {
            return SessionHelper.INSTANCE.isValidSession(((AmplifyCredential.IdentityPoolTypeCredential) amplifyCredential).getCredentials());
        }
        return false;
    }

    public static final String requireAccessToken(AWSCognitoAuthSession aWSCognitoAuthSession) throws InvalidUserPoolConfigurationException {
        AbstractC4154l.m8923f(aWSCognitoAuthSession, "<this>");
        String accessToken = aWSCognitoAuthSession.getAccessToken();
        if (accessToken != null) {
            return accessToken;
        }
        throw new InvalidUserPoolConfigurationException();
    }
}
