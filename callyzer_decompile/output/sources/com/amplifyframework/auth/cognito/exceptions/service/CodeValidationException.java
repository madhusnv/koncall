package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class CodeValidationException extends ServiceException {
    /* JADX WARN: Multi-variable type inference failed */
    public CodeValidationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CodeValidationException(String str, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? "Failed to parse code from the fetch token Uri" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeValidationException(String message) {
        super(message, "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
        AbstractC4154l.m8923f(message, "message");
    }
}
