package com.onesignal.common.exceptions;

import p001o.id5;

/* loaded from: classes6.dex */
public final class BackendException extends Exception {
    private final String response;
    private final Integer retryAfterSeconds;
    private final int statusCode;

    public /* synthetic */ BackendException(int i, String str, Integer num, int i2, id5 id5Var) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : num);
    }

    public final String getResponse() {
        return this.response;
    }

    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public BackendException(int i, String str, Integer num) {
        this.statusCode = i;
        this.response = str;
        this.retryAfterSeconds = num;
    }
}
