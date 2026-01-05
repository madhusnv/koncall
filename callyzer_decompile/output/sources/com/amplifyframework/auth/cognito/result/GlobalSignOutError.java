package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.cognito.exceptions.service.GlobalSignOutException;
import com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class GlobalSignOutError {
    private final String accessToken;
    private final GlobalSignOutException exception;

    public GlobalSignOutError(GlobalSignOutErrorData globalSignOutErrorData) {
        AbstractC4154l.m8923f(globalSignOutErrorData, "globalSignOutErrorData");
        this.accessToken = globalSignOutErrorData.getAccessToken();
        this.exception = new GlobalSignOutException(globalSignOutErrorData.getError());
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final GlobalSignOutException getException() {
        return this.exception;
    }
}
