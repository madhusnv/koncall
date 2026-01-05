package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.statemachine.codegen.data.HostedUIErrorData;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class HostedUIError {
    private final Exception exception;
    private final String url;

    public HostedUIError(HostedUIErrorData hostedUIErrorData) {
        sq8.m48649h(hostedUIErrorData, "hostedUIErrorData");
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
