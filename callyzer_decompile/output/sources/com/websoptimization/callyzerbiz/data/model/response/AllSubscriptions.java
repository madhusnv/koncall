package com.websoptimization.callyzerbiz.data.model.response;

import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class AllSubscriptions {

    @InterfaceC4485b("callRecordingSubscription")
    private final Subscription callRecordingSubscription;

    @InterfaceC4485b("callSyncSubscription")
    private final Subscription callSyncSubscription;

    @InterfaceC4485b("leadSubscription")
    private final Subscription leadSubscription;

    public AllSubscriptions(Subscription callSyncSubscription, Subscription leadSubscription, Subscription callRecordingSubscription) {
        AbstractC4154l.m8923f(callSyncSubscription, "callSyncSubscription");
        AbstractC4154l.m8923f(leadSubscription, "leadSubscription");
        AbstractC4154l.m8923f(callRecordingSubscription, "callRecordingSubscription");
        this.callSyncSubscription = callSyncSubscription;
        this.leadSubscription = leadSubscription;
        this.callRecordingSubscription = callRecordingSubscription;
    }

    /* renamed from: a */
    public final Subscription m4719a() {
        return this.callRecordingSubscription;
    }

    /* renamed from: b */
    public final Subscription m4720b() {
        return this.callSyncSubscription;
    }

    /* renamed from: c */
    public final Subscription m4721c() {
        return this.leadSubscription;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllSubscriptions)) {
            return false;
        }
        AllSubscriptions allSubscriptions = (AllSubscriptions) obj;
        return AbstractC4154l.m8918a(this.callSyncSubscription, allSubscriptions.callSyncSubscription) && AbstractC4154l.m8918a(this.leadSubscription, allSubscriptions.leadSubscription) && AbstractC4154l.m8918a(this.callRecordingSubscription, allSubscriptions.callRecordingSubscription);
    }

    public final int hashCode() {
        return this.callRecordingSubscription.hashCode() + ((this.leadSubscription.hashCode() + (this.callSyncSubscription.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AllSubscriptions(callSyncSubscription=" + this.callSyncSubscription + ", leadSubscription=" + this.leadSubscription + ", callRecordingSubscription=" + this.callRecordingSubscription + ")";
    }
}
