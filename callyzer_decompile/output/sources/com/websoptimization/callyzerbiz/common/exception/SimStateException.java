package com.websoptimization.callyzerbiz.common.exception;

import kotlin.jvm.internal.AbstractC4154l;
import pg.b8;
import xw.InterfaceC8493a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class SimStateException extends Exception {

    /* renamed from: a */
    public final EnumC1456a f7329a;

    /* renamed from: b */
    public final String f7330b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.websoptimization.callyzerbiz.common.exception.SimStateException$a */
    public static final class EnumC1456a {
        private static final /* synthetic */ InterfaceC8493a $ENTRIES;
        private static final /* synthetic */ EnumC1456a[] $VALUES;
        public static final EnumC1456a NO_SIM_FOUND = new EnumC1456a("NO_SIM_FOUND", 0);
        public static final EnumC1456a NO_CONNECTED_SIM_FOUND = new EnumC1456a("NO_CONNECTED_SIM_FOUND", 1);
        public static final EnumC1456a CONNECTED_SIM_NOT_EXIST_ON_DEVICE = new EnumC1456a("CONNECTED_SIM_NOT_EXIST_ON_DEVICE", 2);
        public static final EnumC1456a NO_AVAILABLE_SIM_IN_DB = new EnumC1456a("NO_AVAILABLE_SIM_IN_DB", 3);
        public static final EnumC1456a IDENTIFY_FROM_DATA_STORE_STATE = new EnumC1456a("IDENTIFY_FROM_DATA_STORE_STATE", 4);
        public static final EnumC1456a NO_LEAD_CONNECTED_SIM_FOUND = new EnumC1456a("NO_LEAD_CONNECTED_SIM_FOUND", 5);

        private static final /* synthetic */ EnumC1456a[] $values() {
            return new EnumC1456a[]{NO_SIM_FOUND, NO_CONNECTED_SIM_FOUND, CONNECTED_SIM_NOT_EXIST_ON_DEVICE, NO_AVAILABLE_SIM_IN_DB, IDENTIFY_FROM_DATA_STORE_STATE, NO_LEAD_CONNECTED_SIM_FOUND};
        }

        static {
            EnumC1456a[] enumC1456aArr$values = $values();
            $VALUES = enumC1456aArr$values;
            $ENTRIES = b8.m11548b(enumC1456aArr$values);
        }

        private EnumC1456a(String str, int i10) {
        }

        public static InterfaceC8493a getEntries() {
            return $ENTRIES;
        }

        public static EnumC1456a valueOf(String str) {
            return (EnumC1456a) Enum.valueOf(EnumC1456a.class, str);
        }

        public static EnumC1456a[] values() {
            return (EnumC1456a[]) $VALUES.clone();
        }
    }

    public SimStateException(EnumC1456a errorCode, String msg) {
        AbstractC4154l.m8923f(errorCode, "errorCode");
        AbstractC4154l.m8923f(msg, "msg");
        this.f7329a = errorCode;
        this.f7330b = msg;
    }
}
