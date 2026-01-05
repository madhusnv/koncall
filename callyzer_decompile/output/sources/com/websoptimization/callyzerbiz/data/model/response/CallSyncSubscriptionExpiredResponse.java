package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallSyncSubscriptionExpiredResponse {

    @InterfaceC4485b("subscriptionDetails")
    private final Subscription callSyncSubscription;

    @InterfaceC4485b("lastSyncCallTime")
    private final String lastSyncCallTime;

    @InterfaceC4485b("mobile")
    private final String phoneNumber;

    public CallSyncSubscriptionExpiredResponse(String phoneNumber, String str, Subscription callSyncSubscription) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        AbstractC4154l.m8923f(callSyncSubscription, "callSyncSubscription");
        this.phoneNumber = phoneNumber;
        this.lastSyncCallTime = str;
        this.callSyncSubscription = callSyncSubscription;
    }

    /* renamed from: a */
    public final Subscription m4766a() {
        return this.callSyncSubscription;
    }

    /* renamed from: b */
    public final LocalDateTime m4767b() {
        String str = this.lastSyncCallTime;
        if (str == null || str.length() <= 0) {
            return null;
        }
        C8800o c8800o = C8800o.f42459a;
        return C8800o.m16183G(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallSyncSubscriptionExpiredResponse)) {
            return false;
        }
        CallSyncSubscriptionExpiredResponse callSyncSubscriptionExpiredResponse = (CallSyncSubscriptionExpiredResponse) obj;
        return AbstractC4154l.m8918a(this.phoneNumber, callSyncSubscriptionExpiredResponse.phoneNumber) && AbstractC4154l.m8918a(this.lastSyncCallTime, callSyncSubscriptionExpiredResponse.lastSyncCallTime) && AbstractC4154l.m8918a(this.callSyncSubscription, callSyncSubscriptionExpiredResponse.callSyncSubscription);
    }

    public final int hashCode() {
        int iHashCode = this.phoneNumber.hashCode() * 31;
        String str = this.lastSyncCallTime;
        return this.callSyncSubscription.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.phoneNumber;
        String str2 = this.lastSyncCallTime;
        Subscription subscription = this.callSyncSubscription;
        StringBuilder sbM127r = AbstractC0030c.m127r("CallSyncSubscriptionExpiredResponse(phoneNumber=", str, ", lastSyncCallTime=", str2, ", callSyncSubscription=");
        sbM127r.append(subscription);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
