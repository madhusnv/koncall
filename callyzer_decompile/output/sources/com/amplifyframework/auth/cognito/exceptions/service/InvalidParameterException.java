package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;
import kotlin.jvm.internal.AbstractC4148f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class InvalidParameterException extends ServiceException {
    /* JADX WARN: Multi-variable type inference failed */
    public InvalidParameterException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ InvalidParameterException(String str, Throwable th2, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2);
    }

    public InvalidParameterException(String str, Throwable th2) {
        super(str == null ? "One or more parameters are incorrect." : str, "Enter correct parameters.", th2);
    }
}
