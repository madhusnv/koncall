package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SessionHelper {
    public static final SessionHelper INSTANCE = new SessionHelper();

    private SessionHelper() {
    }

    public final Instant getExpiration$aws_auth_cognito_release(String str) throws UnknownException {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        String claim = JWTParser.INSTANCE.getClaim(str, "exp");
        if (claim != null) {
            return Instant.ofEpochSecond(Long.parseLong(claim));
        }
        return null;
    }

    public final String getUserSub(String str) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        return JWTParser.INSTANCE.getClaim(str, "sub");
    }

    public final String getUsername(String str) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        return JWTParser.INSTANCE.getClaim(str, "username");
    }

    public final boolean isValidSession(AWSCredentials aWSCredentials) {
        sq8.m48649h(aWSCredentials, "awsCredentials");
        Instant instantNow = Instant.now();
        Long expiration = aWSCredentials.getExpiration();
        Instant instantOfEpochSecond = expiration != null ? Instant.ofEpochSecond(expiration.longValue()) : null;
        return instantNow.compareTo(instantOfEpochSecond) < 0 && instantNow.plus(365L, (TemporalUnit) ChronoUnit.DAYS).compareTo(instantOfEpochSecond) > 0;
    }

    public final boolean isValidTokens(CognitoUserPoolTokens cognitoUserPoolTokens) {
        sq8.m48649h(cognitoUserPoolTokens, "userPoolTokens");
        Instant instantNow = Instant.now();
        return cognitoUserPoolTokens.getIdToken() != null && cognitoUserPoolTokens.getAccessToken() != null && instantNow.compareTo(getExpiration$aws_auth_cognito_release(cognitoUserPoolTokens.getIdToken())) < 0 && instantNow.compareTo(getExpiration$aws_auth_cognito_release(cognitoUserPoolTokens.getAccessToken())) < 0;
    }
}
