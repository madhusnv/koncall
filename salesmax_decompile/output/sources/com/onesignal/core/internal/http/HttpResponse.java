package com.onesignal.core.internal.http;

import p001o.id5;

/* loaded from: classes6.dex */
public final class HttpResponse {
    private final String payload;
    private final Integer retryAfterSeconds;
    private final Integer retryLimit;
    private final int statusCode;
    private final Throwable throwable;

    public HttpResponse(int i, String str, Throwable th, Integer num, Integer num2) {
        this.statusCode = i;
        this.payload = str;
        this.throwable = th;
        this.retryAfterSeconds = num;
        this.retryLimit = num2;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public final Integer getRetryLimit() {
        return this.retryLimit;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final boolean isSuccess() {
        int i = this.statusCode;
        return i == 200 || i == 202 || i == 304 || i == 201;
    }

    public /* synthetic */ HttpResponse(int i, String str, Throwable th, Integer num, Integer num2, int i2, id5 id5Var) {
        this(i, str, (i2 & 4) != 0 ? null : th, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2);
    }
}
