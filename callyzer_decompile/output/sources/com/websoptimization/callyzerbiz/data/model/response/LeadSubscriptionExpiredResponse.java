package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadSubscriptionExpiredResponse {

    @InterfaceC4485b("lastSyncCallTime")
    private final String lastSyncCallTime;

    @InterfaceC4485b("leadSubscription")
    private final Subscription leadSubscription;

    @InterfaceC4485b("mobile")
    private final String mobile;

    public LeadSubscriptionExpiredResponse(String mobile, String lastSyncCallTime, Subscription leadSubscription) {
        AbstractC4154l.m8923f(mobile, "mobile");
        AbstractC4154l.m8923f(lastSyncCallTime, "lastSyncCallTime");
        AbstractC4154l.m8923f(leadSubscription, "leadSubscription");
        this.mobile = mobile;
        this.lastSyncCallTime = lastSyncCallTime;
        this.leadSubscription = leadSubscription;
    }

    /* renamed from: a */
    public final String m4820a() {
        return this.mobile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadSubscriptionExpiredResponse)) {
            return false;
        }
        LeadSubscriptionExpiredResponse leadSubscriptionExpiredResponse = (LeadSubscriptionExpiredResponse) obj;
        return AbstractC4154l.m8918a(this.mobile, leadSubscriptionExpiredResponse.mobile) && AbstractC4154l.m8918a(this.lastSyncCallTime, leadSubscriptionExpiredResponse.lastSyncCallTime) && AbstractC4154l.m8918a(this.leadSubscription, leadSubscriptionExpiredResponse.leadSubscription);
    }

    public final int hashCode() {
        return this.leadSubscription.hashCode() + AbstractC0030c.m113d(this.mobile.hashCode() * 31, 31, this.lastSyncCallTime);
    }

    public final String toString() {
        String str = this.mobile;
        String str2 = this.lastSyncCallTime;
        Subscription subscription = this.leadSubscription;
        StringBuilder sbM127r = AbstractC0030c.m127r("LeadSubscriptionExpiredResponse(mobile=", str, ", lastSyncCallTime=", str2, ", leadSubscription=");
        sbM127r.append(subscription);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
