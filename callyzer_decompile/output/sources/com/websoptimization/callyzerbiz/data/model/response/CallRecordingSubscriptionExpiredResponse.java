package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallRecordingSubscriptionExpiredResponse {

    @InterfaceC4485b("subscriptionDetails")
    private final Subscription callRecordingSubscription;

    @InterfaceC4485b("lastSyncCallTime")
    private final String lastSyncCallTime;

    @InterfaceC4485b("mobile")
    private final String mobile;

    public CallRecordingSubscriptionExpiredResponse(String mobile, String str, Subscription callRecordingSubscription) {
        AbstractC4154l.m8923f(mobile, "mobile");
        AbstractC4154l.m8923f(callRecordingSubscription, "callRecordingSubscription");
        this.mobile = mobile;
        this.lastSyncCallTime = str;
        this.callRecordingSubscription = callRecordingSubscription;
    }

    /* renamed from: a */
    public final Subscription m4763a() {
        return this.callRecordingSubscription;
    }

    /* renamed from: b */
    public final String m4764b() {
        return this.lastSyncCallTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallRecordingSubscriptionExpiredResponse)) {
            return false;
        }
        CallRecordingSubscriptionExpiredResponse callRecordingSubscriptionExpiredResponse = (CallRecordingSubscriptionExpiredResponse) obj;
        return AbstractC4154l.m8918a(this.mobile, callRecordingSubscriptionExpiredResponse.mobile) && AbstractC4154l.m8918a(this.lastSyncCallTime, callRecordingSubscriptionExpiredResponse.lastSyncCallTime) && AbstractC4154l.m8918a(this.callRecordingSubscription, callRecordingSubscriptionExpiredResponse.callRecordingSubscription);
    }

    public final int hashCode() {
        int iHashCode = this.mobile.hashCode() * 31;
        String str = this.lastSyncCallTime;
        return this.callRecordingSubscription.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.mobile;
        String str2 = this.lastSyncCallTime;
        Subscription subscription = this.callRecordingSubscription;
        StringBuilder sbM127r = AbstractC0030c.m127r("CallRecordingSubscriptionExpiredResponse(mobile=", str, ", lastSyncCallTime=", str2, ", callRecordingSubscription=");
        sbM127r.append(subscription);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
