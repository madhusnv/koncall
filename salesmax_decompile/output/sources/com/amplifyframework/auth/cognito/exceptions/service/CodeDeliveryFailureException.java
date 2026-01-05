package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;
import p001o.id5;

/* loaded from: classes5.dex */
public class CodeDeliveryFailureException extends ServiceException {
    /* JADX WARN: Multi-variable type inference failed */
    public CodeDeliveryFailureException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CodeDeliveryFailureException(Throwable th, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : th);
    }

    public CodeDeliveryFailureException(Throwable th) {
        super("Error in delivering the confirmation code.", "Retry operation and send another confirmation code.", th);
    }
}
