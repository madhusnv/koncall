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
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthSessionKt {
    public static final AWSAuthSessionBehavior<AWSCognitoUserPoolTokens> getCognitoSession(AmplifyCredential amplifyCredential, AuthException authException) {
        sq8.m48649h(amplifyCredential, "<this>");
        if (amplifyCredential instanceof AmplifyCredential.UserPool) {
            AuthSessionResult authSessionResultFailure = AuthSessionResult.failure(new ConfigurationException("Could not retrieve Identity ID", "Cognito Identity not configured. Please check amplifyconfiguration.json file.", null, 4, null));
            sq8.m48648g(authSessionResultFailure, "failure(...)");
            AuthSessionResult authSessionResultFailure2 = AuthSessionResult.failure(new ConfigurationException("Could not fetch AWS Cognito credentials", "Cognito Identity not configured. Please check amplifyconfiguration.json file.", null, 4, null));
            sq8.m48648g(authSessionResultFailure2, "failure(...)");
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
            AuthSessionResult authSessionResultFailure3 = AuthSessionResult.failure(new SignedOutException(null, null, null, 7, null));
            sq8.m48648g(authSessionResultFailure3, "failure(...)");
            AuthSessionResult authSessionResultFailure4 = AuthSessionResult.failure(new SignedOutException(null, null, null, 7, null));
            sq8.m48648g(authSessionResultFailure4, "failure(...)");
            return new AWSCognitoAuthSession(false, cognitoSession$getIdentityIdResult, cognitoSession$getCredentialsResult, authSessionResultFailure3, authSessionResultFailure4);
        }
        if (amplifyCredential instanceof AmplifyCredential.IdentityPoolFederated) {
            InvalidStateException invalidStateException = new InvalidStateException("Users Federated to Identity Pool do not have User Pool access.", "To access User Pool data, you must use a Sign In method.", null, 4, null);
            AmplifyCredential.IdentityPoolFederated identityPoolFederated = (AmplifyCredential.IdentityPoolFederated) amplifyCredential;
            AuthSessionResult<String> cognitoSession$getIdentityIdResult2 = getCognitoSession$getIdentityIdResult(identityPoolFederated.getIdentityId(), authException);
            AuthSessionResult<AWSCredentials> cognitoSession$getCredentialsResult2 = getCognitoSession$getCredentialsResult(identityPoolFederated.getCredentials(), authException);
            AuthSessionResult authSessionResultFailure5 = AuthSessionResult.failure(invalidStateException);
            sq8.m48648g(authSessionResultFailure5, "failure(...)");
            AuthSessionResult authSessionResultFailure6 = AuthSessionResult.failure(invalidStateException);
            sq8.m48648g(authSessionResultFailure6, "failure(...)");
            return new AWSCognitoAuthSession(true, cognitoSession$getIdentityIdResult2, cognitoSession$getCredentialsResult2, authSessionResultFailure5, authSessionResultFailure6);
        }
        AuthSessionResult authSessionResultFailure7 = AuthSessionResult.failure(authException);
        sq8.m48648g(authSessionResultFailure7, "failure(...)");
        AuthSessionResult authSessionResultFailure8 = AuthSessionResult.failure(authException);
        sq8.m48648g(authSessionResultFailure8, "failure(...)");
        AuthSessionResult authSessionResultFailure9 = AuthSessionResult.failure(authException);
        sq8.m48648g(authSessionResultFailure9, "failure(...)");
        AuthSessionResult authSessionResultFailure10 = AuthSessionResult.failure(authException);
        sq8.m48648g(authSessionResultFailure10, "failure(...)");
        return new AWSCognitoAuthSession(false, authSessionResultFailure7, authSessionResultFailure8, authSessionResultFailure9, authSessionResultFailure10);
    }

    public static /* synthetic */ AWSAuthSessionBehavior getCognitoSession$default(AmplifyCredential amplifyCredential, AuthException authException, int i, Object obj) {
        if ((i & 1) != 0) {
            authException = null;
        }
        return getCognitoSession(amplifyCredential, authException);
    }

    private static final AuthSessionResult<AWSCredentials> getCognitoSession$getCredentialsResult(com.amplifyframework.statemachine.codegen.data.AWSCredentials aWSCredentials, AuthException authException) {
        if (authException != null && !(authException instanceof SignedOutException)) {
            AuthSessionResult<AWSCredentials> authSessionResultFailure = AuthSessionResult.failure(authException);
            sq8.m48648g(authSessionResultFailure, "failure(...)");
            return authSessionResultFailure;
        }
        AWSCredentials aWSCredentialsCreateAWSCredentials = AWSCredentials.Factory.createAWSCredentials(aWSCredentials.getAccessKeyId(), aWSCredentials.getSecretAccessKey(), aWSCredentials.getSessionToken(), aWSCredentials.getExpiration());
        AuthSessionResult<AWSCredentials> authSessionResultSuccess = aWSCredentialsCreateAWSCredentials != null ? AuthSessionResult.success(aWSCredentialsCreateAWSCredentials) : null;
        if (authSessionResultSuccess != null) {
            return authSessionResultSuccess;
        }
        AuthSessionResult<AWSCredentials> authSessionResultFailure2 = AuthSessionResult.failure(new UnknownException("Failed to fetch AWS credentials.", null, 2, null));
        sq8.m48648g(authSessionResultFailure2, "failure(...)");
        return authSessionResultFailure2;
    }

    private static final AuthSessionResult<String> getCognitoSession$getIdentityIdResult(String str, AuthException authException) {
        if (authException != null && !(authException instanceof SignedOutException)) {
            AuthSessionResult<String> authSessionResultFailure = AuthSessionResult.failure(authException);
            sq8.m48646e(authSessionResultFailure);
            return authSessionResultFailure;
        }
        if (str.length() > 0) {
            AuthSessionResult<String> authSessionResultSuccess = AuthSessionResult.success(str);
            sq8.m48646e(authSessionResultSuccess);
            return authSessionResultSuccess;
        }
        AuthSessionResult<String> authSessionResultFailure2 = AuthSessionResult.failure(new UnknownException("Failed to fetch identity id.", null, 2, null));
        sq8.m48646e(authSessionResultFailure2);
        return authSessionResultFailure2;
    }

    private static final AuthSessionResult<AWSCognitoUserPoolTokens> getCognitoSession$getUserPoolTokensResult(CognitoUserPoolTokens cognitoUserPoolTokens, AuthException authException) {
        if (authException == null || (authException instanceof SignedOutException)) {
            AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResultSuccess = AuthSessionResult.success(new AWSCognitoUserPoolTokens(cognitoUserPoolTokens.getAccessToken(), cognitoUserPoolTokens.getIdToken(), cognitoUserPoolTokens.getRefreshToken()));
            sq8.m48648g(authSessionResultSuccess, "success(...)");
            return authSessionResultSuccess;
        }
        AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResultFailure = AuthSessionResult.failure(authException);
        sq8.m48648g(authSessionResultFailure, "failure(...)");
        return authSessionResultFailure;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final AuthSessionResult<String> getCognitoSession$getUserSubResult(CognitoUserPoolTokens cognitoUserPoolTokens, AuthException authException) {
        String userSub;
        if (authException != null && !(authException instanceof SignedOutException)) {
            AuthSessionResult<String> authSessionResultFailure = AuthSessionResult.failure(authException);
            sq8.m48648g(authSessionResultFailure, "failure(...)");
            return authSessionResultFailure;
        }
        if (cognitoUserPoolTokens != null) {
            try {
                String accessToken = cognitoUserPoolTokens.getAccessToken();
                userSub = accessToken != null ? SessionHelper.INSTANCE.getUserSub(accessToken) : null;
            } catch (Exception e) {
                AuthSessionResult<String> authSessionResultFailure2 = AuthSessionResult.failure(new UnknownException(null, e, 1, null));
                sq8.m48646e(authSessionResultFailure2);
                return authSessionResultFailure2;
            }
        }
        AuthSessionResult<String> authSessionResultSuccess = AuthSessionResult.success(userSub);
        sq8.m48646e(authSessionResultSuccess);
        return authSessionResultSuccess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isValid(AmplifyCredential amplifyCredential) {
        sq8.m48649h(amplifyCredential, "<this>");
        if (amplifyCredential instanceof AmplifyCredential.UserPool) {
            return SessionHelper.INSTANCE.isValidTokens(((AmplifyCredential.UserPool) amplifyCredential).getSignedInData().getCognitoUserPoolTokens());
        }
        if (amplifyCredential instanceof AmplifyCredential.UserAndIdentityPool) {
            SessionHelper sessionHelper = SessionHelper.INSTANCE;
            AmplifyCredential.UserAndIdentityPool userAndIdentityPool = (AmplifyCredential.UserAndIdentityPool) amplifyCredential;
            if (sessionHelper.isValidTokens(userAndIdentityPool.getSignedInData().getCognitoUserPoolTokens()) && sessionHelper.isValidSession(userAndIdentityPool.getCredentials())) {
                return true;
            }
        } else if (amplifyCredential instanceof AmplifyCredential.IdentityPoolTypeCredential) {
            return SessionHelper.INSTANCE.isValidSession(((AmplifyCredential.IdentityPoolTypeCredential) amplifyCredential).getCredentials());
        }
        return false;
    }

    public static final String requireAccessToken(AWSCognitoAuthSession aWSCognitoAuthSession) {
        sq8.m48649h(aWSCognitoAuthSession, "<this>");
        String accessToken = aWSCognitoAuthSession.getAccessToken();
        if (accessToken != null) {
            return accessToken;
        }
        throw new InvalidUserPoolConfigurationException();
    }
}
