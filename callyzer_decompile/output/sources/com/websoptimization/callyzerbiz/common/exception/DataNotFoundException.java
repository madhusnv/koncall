package com.websoptimization.callyzerbiz.common.exception;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class DataNotFoundException extends Exception {

    /* renamed from: a */
    public final String f7321a;

    public DataNotFoundException(String error) {
        AbstractC4154l.m8923f(error, "error");
        this.f7321a = error;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f7321a;
    }

    @Override // java.lang.Throwable
    public final void setStackTrace(StackTraceElement[] stackTrace) {
        AbstractC4154l.m8923f(stackTrace, "stackTrace");
        super.setStackTrace(stackTrace);
    }
}
