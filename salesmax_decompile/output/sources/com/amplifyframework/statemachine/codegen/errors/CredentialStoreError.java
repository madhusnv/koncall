package com.amplifyframework.statemachine.codegen.errors;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CredentialStoreError extends Exception {
    private final Throwable cause;
    private final String message;

    public /* synthetic */ CredentialStoreError(String str, Throwable th, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public static /* synthetic */ CredentialStoreError copy$default(CredentialStoreError credentialStoreError, String str, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialStoreError.message;
        }
        if ((i & 2) != 0) {
            th = credentialStoreError.cause;
        }
        return credentialStoreError.copy(str, th);
    }

    public final String component1() {
        return this.message;
    }

    public final Throwable component2() {
        return this.cause;
    }

    public final CredentialStoreError copy(String str, Throwable th) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        return new CredentialStoreError(str, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialStoreError)) {
            return false;
        }
        CredentialStoreError credentialStoreError = (CredentialStoreError) obj;
        return sq8.m48644c(this.message, credentialStoreError.message) && sq8.m48644c(this.cause, credentialStoreError.cause);
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
        Throwable th = this.cause;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CredentialStoreError(message=" + this.message + ", cause=" + this.cause + ")";
    }

    public CredentialStoreError(String str, Throwable th) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        this.message = str;
        this.cause = th;
    }
}
