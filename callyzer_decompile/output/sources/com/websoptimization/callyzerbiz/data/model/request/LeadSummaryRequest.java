package com.websoptimization.callyzerbiz.data.model.request;

import ai.AbstractC0151h;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadSummaryRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7358b;

    @InterfaceC4485b("leadId")
    private final String leadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadSummaryRequest(String leadId, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(leadId, "leadId");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.leadId = leadId;
        this.f7358b = userSimDetail;
    }

    /* renamed from: N */
    public final String m4679N() {
        return this.leadId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadSummaryRequest)) {
            return false;
        }
        LeadSummaryRequest leadSummaryRequest = (LeadSummaryRequest) obj;
        return AbstractC4154l.m8918a(this.leadId, leadSummaryRequest.leadId) && AbstractC4154l.m8918a(this.f7358b, leadSummaryRequest.f7358b);
    }

    public final int hashCode() {
        return this.f7358b.hashCode() + (this.leadId.hashCode() * 31);
    }

    public final String toString() {
        return "LeadSummaryRequest(leadId=" + this.leadId + ", userSimDetail=" + this.f7358b + ")";
    }
}
