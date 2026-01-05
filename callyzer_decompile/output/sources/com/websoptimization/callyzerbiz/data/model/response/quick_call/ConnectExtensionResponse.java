package com.websoptimization.callyzerbiz.data.model.response.quick_call;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class ConnectExtensionResponse {

    @InterfaceC4485b("isConnected")
    private boolean isConnected;

    @InterfaceC4485b("lastActiveTime")
    private LocalDateTime lastActiveTime;

    public ConnectExtensionResponse(boolean z6, LocalDateTime lastActiveTime) {
        AbstractC4154l.m8923f(lastActiveTime, "lastActiveTime");
        this.isConnected = z6;
        this.lastActiveTime = lastActiveTime;
    }

    /* renamed from: a */
    public final LocalDateTime m4999a() {
        return this.lastActiveTime;
    }

    /* renamed from: b */
    public final boolean m5000b() {
        return this.isConnected;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectExtensionResponse)) {
            return false;
        }
        ConnectExtensionResponse connectExtensionResponse = (ConnectExtensionResponse) obj;
        return this.isConnected == connectExtensionResponse.isConnected && AbstractC4154l.m8918a(this.lastActiveTime, connectExtensionResponse.lastActiveTime);
    }

    public final int hashCode() {
        return this.lastActiveTime.hashCode() + (Boolean.hashCode(this.isConnected) * 31);
    }

    public final String toString() {
        return "ConnectExtensionResponse(isConnected=" + this.isConnected + ", lastActiveTime=" + this.lastActiveTime + ")";
    }
}
