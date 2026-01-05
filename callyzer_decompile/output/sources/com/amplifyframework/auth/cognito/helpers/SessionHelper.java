package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SessionHelper {
    public static final SessionHelper INSTANCE = new SessionHelper();

    private SessionHelper() {
    }

    public final Instant getExpiration$aws_auth_cognito_release(String token) throws UnknownException {
        AbstractC4154l.m8923f(token, "token");
        String claim = JWTParser.INSTANCE.getClaim(token, "exp");
        if (claim != null) {
            return Instant.ofEpochSecond(Long.parseLong(claim));
        }
        return null;
    }

    public final String getUserSub(String token) {
        AbstractC4154l.m8923f(token, "token");
        return JWTParser.INSTANCE.getClaim(token, "sub");
    }

    public final String getUsername(String token) {
        AbstractC4154l.m8923f(token, "token");
        return JWTParser.INSTANCE.getClaim(token, "username");
    }

    public final boolean isValidSession(AWSCredentials awsCredentials) {
        AbstractC4154l.m8923f(awsCredentials, "awsCredentials");
        Instant instantNow = Instant.now();
        Long expiration = awsCredentials.getExpiration();
        Instant instantOfEpochSecond = expiration != null ? Instant.ofEpochSecond(expiration.longValue()) : null;
        return instantNow.compareTo(instantOfEpochSecond) < 0 && instantNow.mo7820b(365L, ChronoUnit.DAYS).compareTo(instantOfEpochSecond) > 0;
    }

    public final boolean isValidTokens(CognitoUserPoolTokens userPoolTokens) {
        AbstractC4154l.m8923f(userPoolTokens, "userPoolTokens");
        Instant instantNow = Instant.now();
        return userPoolTokens.getIdToken() != null && userPoolTokens.getAccessToken() != null && instantNow.compareTo(getExpiration$aws_auth_cognito_release(userPoolTokens.getIdToken())) < 0 && instantNow.compareTo(getExpiration$aws_auth_cognito_release(userPoolTokens.getAccessToken())) < 0;
    }
}
