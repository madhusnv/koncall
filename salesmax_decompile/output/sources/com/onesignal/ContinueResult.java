package com.onesignal;

/* loaded from: classes6.dex */
public final class ContinueResult<R> {
    private final R data;
    private final boolean isSuccess;
    private final Throwable throwable;

    public ContinueResult(boolean z, R r, Throwable th) {
        this.isSuccess = z;
        this.data = r;
        this.throwable = th;
    }

    public final R getData() {
        return this.data;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }
}
