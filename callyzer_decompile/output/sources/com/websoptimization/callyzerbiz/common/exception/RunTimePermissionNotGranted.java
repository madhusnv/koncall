package com.websoptimization.callyzerbiz.common.exception;

import kotlin.jvm.internal.AbstractC4154l;
import pg.b8;
import xw.InterfaceC8493a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class RunTimePermissionNotGranted extends Exception {

    /* renamed from: a */
    public final String f7328a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.websoptimization.callyzerbiz.common.exception.RunTimePermissionNotGranted$a */
    public static final class EnumC1455a {
        private static final /* synthetic */ InterfaceC8493a $ENTRIES;
        private static final /* synthetic */ EnumC1455a[] $VALUES;
        public static final EnumC1455a READ_CALL_LOG = new EnumC1455a("READ_CALL_LOG", 0);
        public static final EnumC1455a READ_PHONE_STATE = new EnumC1455a("READ_PHONE_STATE", 1);
        public static final EnumC1455a READ_CONTACT = new EnumC1455a("READ_CONTACT", 2);

        private static final /* synthetic */ EnumC1455a[] $values() {
            return new EnumC1455a[]{READ_CALL_LOG, READ_PHONE_STATE, READ_CONTACT};
        }

        static {
            EnumC1455a[] enumC1455aArr$values = $values();
            $VALUES = enumC1455aArr$values;
            $ENTRIES = b8.m11548b(enumC1455aArr$values);
        }

        private EnumC1455a(String str, int i10) {
        }

        public static InterfaceC8493a getEntries() {
            return $ENTRIES;
        }

        public static EnumC1455a valueOf(String str) {
            return (EnumC1455a) Enum.valueOf(EnumC1455a.class, str);
        }

        public static EnumC1455a[] values() {
            return (EnumC1455a[]) $VALUES.clone();
        }
    }

    public RunTimePermissionNotGranted(EnumC1455a runTimePermission) {
        AbstractC4154l.m8923f(runTimePermission, "runTimePermission");
        this.f7328a = "FetchCallLogUseCase >>> on manual check ";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return String.valueOf(this.f7328a);
    }
}
