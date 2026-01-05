package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import ai.AbstractC0151h;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadCallHistoryRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7354b;

    @InterfaceC4485b("leadId")
    private final String leadId;

    @InterfaceC4485b("pageNo")
    private final int pageNo;

    @InterfaceC4485b("pageSize")
    private final int pageSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadCallHistoryRequest(String leadId, int i10, int i11, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(leadId, "leadId");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.leadId = leadId;
        this.pageNo = i10;
        this.pageSize = i11;
        this.f7354b = userSimDetail;
    }

    /* renamed from: N */
    public final String m4664N() {
        return this.leadId;
    }

    /* renamed from: O */
    public final int m4665O() {
        return this.pageNo;
    }

    /* renamed from: P */
    public final int m4666P() {
        return this.pageSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadCallHistoryRequest)) {
            return false;
        }
        LeadCallHistoryRequest leadCallHistoryRequest = (LeadCallHistoryRequest) obj;
        return AbstractC4154l.m8918a(this.leadId, leadCallHistoryRequest.leadId) && this.pageNo == leadCallHistoryRequest.pageNo && this.pageSize == leadCallHistoryRequest.pageSize && AbstractC4154l.m8918a(this.f7354b, leadCallHistoryRequest.f7354b);
    }

    public final int hashCode() {
        return this.f7354b.hashCode() + AbstractC1452a.m4556c(this.pageSize, AbstractC1452a.m4556c(this.pageNo, this.leadId.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.leadId;
        int i10 = this.pageNo;
        int i11 = this.pageSize;
        StringBuilder sbM125p = AbstractC0030c.m125p(i10, "LeadCallHistoryRequest(leadId=", str, ", pageNo=", ", pageSize=");
        sbM125p.append(i11);
        sbM125p.append(", userSimDetail=");
        sbM125p.append(this.f7354b);
        sbM125p.append(")");
        return sbM125p.toString();
    }
}
