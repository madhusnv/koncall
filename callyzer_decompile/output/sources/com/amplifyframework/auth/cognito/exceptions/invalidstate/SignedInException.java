package com.amplifyframework.auth.cognito.exceptions.invalidstate;

import com.amplifyframework.auth.exceptions.InvalidStateException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SignedInException extends InvalidStateException {
    /* JADX WARN: Multi-variable type inference failed */
    public SignedInException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SignedInException(String str, String str2, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? "There is already a user signed in." : str, (i10 & 2) != 0 ? "Sign out the user first before signing in again." : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignedInException(String message, String recoverySuggestion) {
        super(message, recoverySuggestion, null, 4, null);
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(recoverySuggestion, "recoverySuggestion");
    }
}
