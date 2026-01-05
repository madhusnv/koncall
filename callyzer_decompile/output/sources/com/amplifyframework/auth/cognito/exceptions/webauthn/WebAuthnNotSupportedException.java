package com.amplifyframework.auth.cognito.exceptions.webauthn;

import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class WebAuthnNotSupportedException extends WebAuthnFailedException {
    public /* synthetic */ WebAuthnNotSupportedException(String str, Throwable th2, int i10, AbstractC4148f abstractC4148f) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebAuthnNotSupportedException(String message, Throwable th2) {
        super(message, th2 != null ? "See the attached exception for more details" : "Sorry, we don’t have a recovery suggestion for this error.", th2);
        AbstractC4154l.m8923f(message, "message");
    }

    public WebAuthnNotSupportedException(Throwable th2) {
        this("WebAuthn is not supported on this device", th2);
    }
}
