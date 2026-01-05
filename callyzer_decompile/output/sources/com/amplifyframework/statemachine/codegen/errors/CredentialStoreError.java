package com.amplifyframework.statemachine.codegen.errors;

import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialStoreError extends Exception {
    private final Throwable cause;
    private final String message;

    public /* synthetic */ CredentialStoreError(String str, Throwable th2, int i10, AbstractC4148f abstractC4148f) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    public static /* synthetic */ CredentialStoreError copy$default(CredentialStoreError credentialStoreError, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = credentialStoreError.message;
        }
        if ((i10 & 2) != 0) {
            th2 = credentialStoreError.cause;
        }
        return credentialStoreError.copy(str, th2);
    }

    public final String component1() {
        return this.message;
    }

    public final Throwable component2() {
        return this.cause;
    }

    public final CredentialStoreError copy(String message, Throwable th2) {
        AbstractC4154l.m8923f(message, "message");
        return new CredentialStoreError(message, th2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialStoreError)) {
            return false;
        }
        CredentialStoreError credentialStoreError = (CredentialStoreError) obj;
        return AbstractC4154l.m8918a(this.message, credentialStoreError.message) && AbstractC4154l.m8918a(this.cause, credentialStoreError.cause);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        Throwable th2 = this.cause;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CredentialStoreError(message=" + this.message + ", cause=" + this.cause + ")";
    }

    public CredentialStoreError(String message, Throwable th2) {
        AbstractC4154l.m8923f(message, "message");
        this.message = message;
        this.cause = th2;
    }
}
