package com.websoptimization.callyzerbiz.data.model.response.quick_call;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FetchActiveStatusResponse {

    @InterfaceC4485b("extensionCode")
    private String extensionCode;

    @InterfaceC4485b("lastActiveTime")
    private LocalDateTime lastActiveTime;

    public FetchActiveStatusResponse(LocalDateTime lastActiveTime, String extensionCode) {
        AbstractC4154l.m8923f(lastActiveTime, "lastActiveTime");
        AbstractC4154l.m8923f(extensionCode, "extensionCode");
        this.lastActiveTime = lastActiveTime;
        this.extensionCode = extensionCode;
    }

    /* renamed from: a */
    public final String m5001a() {
        return this.extensionCode;
    }

    /* renamed from: b */
    public final LocalDateTime m5002b() {
        return this.lastActiveTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchActiveStatusResponse)) {
            return false;
        }
        FetchActiveStatusResponse fetchActiveStatusResponse = (FetchActiveStatusResponse) obj;
        return AbstractC4154l.m8918a(this.lastActiveTime, fetchActiveStatusResponse.lastActiveTime) && AbstractC4154l.m8918a(this.extensionCode, fetchActiveStatusResponse.extensionCode);
    }

    public final int hashCode() {
        return this.extensionCode.hashCode() + (this.lastActiveTime.hashCode() * 31);
    }

    public final String toString() {
        return "FetchActiveStatusResponse(lastActiveTime=" + this.lastActiveTime + ", extensionCode=" + this.extensionCode + ")";
    }
}
