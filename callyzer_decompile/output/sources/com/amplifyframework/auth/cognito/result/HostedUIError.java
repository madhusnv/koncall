package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.statemachine.codegen.data.HostedUIErrorData;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HostedUIError {
    private final Exception exception;
    private final String url;

    public HostedUIError(HostedUIErrorData hostedUIErrorData) {
        AbstractC4154l.m8923f(hostedUIErrorData, "hostedUIErrorData");
        this.url = hostedUIErrorData.getUrl();
        this.exception = hostedUIErrorData.getError();
    }

    public final Exception getException() {
        return this.exception;
    }

    public final String getUrl() {
        return this.url;
    }
}
