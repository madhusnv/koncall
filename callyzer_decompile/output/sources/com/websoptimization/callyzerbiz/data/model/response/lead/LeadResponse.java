package com.websoptimization.callyzerbiz.data.model.response.lead;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadResponse {

    @InterfaceC4485b("leads")
    private final List<Leads> leads;

    @InterfaceC4485b("totalLeads")
    private final int totalLeads;

    public LeadResponse(List<Leads> leads, int i10) {
        AbstractC4154l.m8923f(leads, "leads");
        this.leads = leads;
        this.totalLeads = i10;
    }

    /* renamed from: a */
    public final List m4912a() {
        return this.leads;
    }

    /* renamed from: b */
    public final int m4913b() {
        return this.totalLeads;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadResponse)) {
            return false;
        }
        LeadResponse leadResponse = (LeadResponse) obj;
        return AbstractC4154l.m8918a(this.leads, leadResponse.leads) && this.totalLeads == leadResponse.totalLeads;
    }

    public final int hashCode() {
        return Integer.hashCode(this.totalLeads) + (this.leads.hashCode() * 31);
    }

    public final String toString() {
        return "LeadResponse(leads=" + this.leads + ", totalLeads=" + this.totalLeads + ")";
    }
}
