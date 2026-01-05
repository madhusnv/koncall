package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.cognito.exceptions.service.RevokeTokenException;
import com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class RevokeTokenError {
    private final RevokeTokenException exception;
    private final String refreshToken;

    public RevokeTokenError(RevokeTokenErrorData revokeTokenErrorData) {
        AbstractC4154l.m8923f(revokeTokenErrorData, "revokeTokenErrorData");
        this.refreshToken = revokeTokenErrorData.getRefreshToken();
        this.exception = new RevokeTokenException(revokeTokenErrorData.getError());
    }

    public final RevokeTokenException getException() {
        return this.exception;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }
}
