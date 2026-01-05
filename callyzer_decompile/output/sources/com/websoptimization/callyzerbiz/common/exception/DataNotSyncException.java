package com.websoptimization.callyzerbiz.common.exception;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class DataNotSyncException extends Exception {

    /* renamed from: a */
    public final String f7322a;

    public DataNotSyncException(String errorMessage) {
        AbstractC4154l.m8923f(errorMessage, "errorMessage");
        this.f7322a = errorMessage;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f7322a;
    }
}
