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
public final class ServiceQuotaExceededException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final String message;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return ServiceQuotaExceededException$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ServiceQuotaExceededException(int i, String str, fff fffVar) {
        if (1 != (i & 1)) {
            tbd.m49692a(i, 1, ServiceQuotaExceededException$$serializer.INSTANCE.getDescriptor());
        }
        this.message = str;
    }

    public static /* synthetic */ ServiceQuotaExceededException copy$default(ServiceQuotaExceededException serviceQuotaExceededException, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceQuotaExceededException.message;
        }
        return serviceQuotaExceededException.copy(str);
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public final String component1() {
        return this.message;
    }

    public final ServiceQuotaExceededException copy(String str) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        return new ServiceQuotaExceededException(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServiceQuotaExceededException) && sq8.m48644c(this.message, ((ServiceQuotaExceededException) obj).message);
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
        return "ServiceQuotaExceededException(message=" + this.message + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceQuotaExceededException(String str) {
        super(str);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        this.message = str;
    }
}
