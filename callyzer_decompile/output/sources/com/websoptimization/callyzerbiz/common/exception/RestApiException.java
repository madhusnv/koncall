package com.websoptimization.callyzerbiz.common.exception;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import pg.b8;
import xw.InterfaceC8493a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class RestApiException extends Exception {

    /* renamed from: a */
    public final EnumC1454a f7325a;

    /* renamed from: b */
    public final String f7326b;

    /* renamed from: c */
    public String f7327c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.websoptimization.callyzerbiz.common.exception.RestApiException$a */
    public static final class EnumC1454a {
        private static final /* synthetic */ InterfaceC8493a $ENTRIES;
        private static final /* synthetic */ EnumC1454a[] $VALUES;
        public static final EnumC1454a SERVER_ERROR = new EnumC1454a("SERVER_ERROR", 0);
        public static final EnumC1454a SUBSCRIPTION_EXPIRED = new EnumC1454a("SUBSCRIPTION_EXPIRED", 1);
        public static final EnumC1454a DEVICE_DELETED = new EnumC1454a("DEVICE_DELETED", 2);
        public static final EnumC1454a DEVICE_DELETED_REGISTER = new EnumC1454a("DEVICE_DELETED_REGISTER", 3);
        public static final EnumC1454a UNAUTHORIZED = new EnumC1454a("UNAUTHORIZED", 4);
        public static final EnumC1454a NETWORK_ERROR = new EnumC1454a("NETWORK_ERROR", 5);
        public static final EnumC1454a BAD_REQUEST = new EnumC1454a("BAD_REQUEST", 6);
        public static final EnumC1454a Lead_BAD_REQUEST = new EnumC1454a("Lead_BAD_REQUEST", 7);
        public static final EnumC1454a RESTORE_LEAD = new EnumC1454a("RESTORE_LEAD", 8);
        public static final EnumC1454a OTHER = new EnumC1454a("OTHER", 9);

        private static final /* synthetic */ EnumC1454a[] $values() {
            return new EnumC1454a[]{SERVER_ERROR, SUBSCRIPTION_EXPIRED, DEVICE_DELETED, DEVICE_DELETED_REGISTER, UNAUTHORIZED, NETWORK_ERROR, BAD_REQUEST, Lead_BAD_REQUEST, RESTORE_LEAD, OTHER};
        }

        static {
            EnumC1454a[] enumC1454aArr$values = $values();
            $VALUES = enumC1454aArr$values;
            $ENTRIES = b8.m11548b(enumC1454aArr$values);
        }

        private EnumC1454a(String str, int i10) {
        }

        public static InterfaceC8493a getEntries() {
            return $ENTRIES;
        }

        public static EnumC1454a valueOf(String str) {
            return (EnumC1454a) Enum.valueOf(EnumC1454a.class, str);
        }

        public static EnumC1454a[] values() {
            return (EnumC1454a[]) $VALUES.clone();
        }
    }

    public RestApiException(EnumC1454a apiExceptionType, String str) {
        AbstractC4154l.m8923f(apiExceptionType, "apiExceptionType");
        this.f7325a = apiExceptionType;
        this.f7326b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strName = this.f7325a.name();
        String message = this.f7326b;
        if (message == null) {
            message = super.getMessage();
        }
        return AbstractC0030c.m121l("Type:= ", strName, " >>> ", message);
    }
}
