package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;
import kotlin.jvm.internal.AbstractC4148f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class CodeDeliveryFailureException extends ServiceException {
    /* JADX WARN: Multi-variable type inference failed */
    public CodeDeliveryFailureException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CodeDeliveryFailureException(Throwable th2, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : th2);
    }

    public CodeDeliveryFailureException(Throwable th2) {
        super("Error in delivering the confirmation code.", "Retry operation and send another confirmation code.", th2);
    }
}
