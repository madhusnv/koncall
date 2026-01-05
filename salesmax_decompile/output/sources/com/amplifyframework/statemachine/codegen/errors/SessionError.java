package com.amplifyframework.statemachine.codegen.errors;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SessionError extends Exception {
    private final AmplifyCredential amplifyCredential;
    private final Exception exception;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionError(Exception exc, AmplifyCredential amplifyCredential) {
        super(exc.getMessage(), exc.getCause());
        sq8.m48649h(exc, "exception");
        sq8.m48649h(amplifyCredential, "amplifyCredential");
        this.exception = exc;
        this.amplifyCredential = amplifyCredential;
    }

    public static /* synthetic */ SessionError copy$default(SessionError sessionError, Exception exc, AmplifyCredential amplifyCredential, int i, Object obj) {
        if ((i & 1) != 0) {
            exc = sessionError.exception;
        }
        if ((i & 2) != 0) {
            amplifyCredential = sessionError.amplifyCredential;
        }
        return sessionError.copy(exc, amplifyCredential);
    }

    public final Exception component1() {
        return this.exception;
    }

    public final AmplifyCredential component2() {
        return this.amplifyCredential;
    }

    public final SessionError copy(Exception exc, AmplifyCredential amplifyCredential) {
        sq8.m48649h(exc, "exception");
        sq8.m48649h(amplifyCredential, "amplifyCredential");
        return new SessionError(exc, amplifyCredential);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionError)) {
            return false;
        }
        SessionError sessionError = (SessionError) obj;
        return sq8.m48644c(this.exception, sessionError.exception) && sq8.m48644c(this.amplifyCredential, sessionError.amplifyCredential);
    }

    public final AmplifyCredential getAmplifyCredential() {
        return this.amplifyCredential;
    }

    public final Exception getException() {
        return this.exception;
    }

    public int hashCode() {
        return (this.exception.hashCode() * 31) + this.amplifyCredential.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SessionError(exception=" + this.exception + ", amplifyCredential=" + this.amplifyCredential + ")";
    }
}
