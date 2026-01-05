package com.websoptimization.callyzerbiz.data.model.response.lead_form_response;

import com.websoptimization.callyzerbiz.data.model.response.AllSubscriptions;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class AllSubscriptionResponse {

    @InterfaceC4485b("subscriptions")
    private AllSubscriptions allSubscriptions;

    public AllSubscriptionResponse(AllSubscriptions allSubscriptions) {
        AbstractC4154l.m8923f(allSubscriptions, "allSubscriptions");
        this.allSubscriptions = allSubscriptions;
    }

    /* renamed from: a */
    public final AllSubscriptions m4937a() {
        return this.allSubscriptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllSubscriptionResponse) && AbstractC4154l.m8918a(this.allSubscriptions, ((AllSubscriptionResponse) obj).allSubscriptions);
    }

    public final int hashCode() {
        return this.allSubscriptions.hashCode();
    }

    public final String toString() {
        return "AllSubscriptionResponse(allSubscriptions=" + this.allSubscriptions + ")";
    }
}
