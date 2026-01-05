package com.websoptimization.callyzerbiz.data.model.request;

import ai.AbstractC0151h;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class RecentNotesRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7360b;

    @InterfaceC4485b("leadId")
    private final String leadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentNotesRequest(C4802m userSimDetails, String leadId) {
        super(userSimDetails);
        AbstractC4154l.m8923f(userSimDetails, "userSimDetails");
        AbstractC4154l.m8923f(leadId, "leadId");
        this.f7360b = userSimDetails;
        this.leadId = leadId;
    }

    /* renamed from: N */
    public final String m4681N() {
        return this.leadId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentNotesRequest)) {
            return false;
        }
        RecentNotesRequest recentNotesRequest = (RecentNotesRequest) obj;
        return AbstractC4154l.m8918a(this.f7360b, recentNotesRequest.f7360b) && AbstractC4154l.m8918a(this.leadId, recentNotesRequest.leadId);
    }

    public final int hashCode() {
        return this.leadId.hashCode() + (this.f7360b.hashCode() * 31);
    }

    public final String toString() {
        return "RecentNotesRequest(userSimDetails=" + this.f7360b + ", leadId=" + this.leadId + ")";
    }
}
