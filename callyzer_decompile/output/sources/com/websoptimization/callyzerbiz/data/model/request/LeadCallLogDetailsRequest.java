package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import ai.AbstractC0151h;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadCallLogDetailsRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7355b;

    @InterfaceC4485b("callLog")
    private final LeadCallLogNoteCallLog callLog;

    @InterfaceC4485b("leadId")
    private final String leadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadCallLogDetailsRequest(C4802m userSimDetails, String leadId, LeadCallLogNoteCallLog callLog) {
        super(userSimDetails);
        AbstractC4154l.m8923f(userSimDetails, "userSimDetails");
        AbstractC4154l.m8923f(leadId, "leadId");
        AbstractC4154l.m8923f(callLog, "callLog");
        this.f7355b = userSimDetails;
        this.leadId = leadId;
        this.callLog = callLog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadCallLogDetailsRequest)) {
            return false;
        }
        LeadCallLogDetailsRequest leadCallLogDetailsRequest = (LeadCallLogDetailsRequest) obj;
        return AbstractC4154l.m8918a(this.f7355b, leadCallLogDetailsRequest.f7355b) && AbstractC4154l.m8918a(this.leadId, leadCallLogDetailsRequest.leadId) && AbstractC4154l.m8918a(this.callLog, leadCallLogDetailsRequest.callLog);
    }

    public final int hashCode() {
        return this.callLog.hashCode() + AbstractC0030c.m113d(this.f7355b.hashCode() * 31, 31, this.leadId);
    }

    public final String toString() {
        return "LeadCallLogDetailsRequest(userSimDetails=" + this.f7355b + ", leadId=" + this.leadId + ", callLog=" + this.callLog + ")";
    }
}
