package com.amplifyframework.predictions.aws.models.liveness;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.sq8;
import p001o.tbd;

@dff
/* loaded from: classes5.dex */
public final class InvalidSignatureException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final String message;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return InvalidSignatureException$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvalidSignatureException(int i, String str, fff fffVar) {
        if (1 != (i & 1)) {
            tbd.m49692a(i, 1, InvalidSignatureException$$serializer.INSTANCE.getDescriptor());
        }
        this.message = str;
    }

    public static /* synthetic */ InvalidSignatureException copy$default(InvalidSignatureException invalidSignatureException, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = invalidSignatureException.message;
        }
        return invalidSignatureException.copy(str);
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public final String component1() {
        return this.message;
    }

    public final InvalidSignatureException copy(String str) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        return new InvalidSignatureException(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvalidSignatureException) && sq8.m48644c(this.message, ((InvalidSignatureException) obj).message);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "InvalidSignatureException(message=" + this.message + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidSignatureException(String str) {
        super(str);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        this.message = str;
    }
}
