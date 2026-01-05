package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;
import p001o.id5;

/* loaded from: classes5.dex */
public class InvalidParameterException extends ServiceException {
    /* JADX WARN: Multi-variable type inference failed */
    public InvalidParameterException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ InvalidParameterException(String str, Throwable th, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public InvalidParameterException(String str, Throwable th) {
        super(str == null ? "One or more parameters are incorrect." : str, "Enter correct parameters.", th);
    }
}
