package com.websoptimization.callyzerbiz.data.model.response;

import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class DeviceDeleteResponse {

    @InterfaceC4485b("lastSyncCallTime")
    private final String lastSyncCallTime;

    @InterfaceC4485b("mobile")
    private final String mobile;

    public DeviceDeleteResponse(String mobile, String str) {
        AbstractC4154l.m8923f(mobile, "mobile");
        this.mobile = mobile;
        this.lastSyncCallTime = str;
    }

    /* renamed from: a */
    public final String m4768a() {
        return this.mobile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceDeleteResponse)) {
            return false;
        }
        DeviceDeleteResponse deviceDeleteResponse = (DeviceDeleteResponse) obj;
        return AbstractC4154l.m8918a(this.mobile, deviceDeleteResponse.mobile) && AbstractC4154l.m8918a(this.lastSyncCallTime, deviceDeleteResponse.lastSyncCallTime);
    }

    public final int hashCode() {
        int iHashCode = this.mobile.hashCode() * 31;
        String str = this.lastSyncCallTime;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a1.m14333m("DeviceDeleteResponse(mobile=", this.mobile, ", lastSyncCallTime=", this.lastSyncCallTime, ")");
    }
}
