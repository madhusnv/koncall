package com.websoptimization.callyzerbiz.data.model.request.lead_request;

import a2.AbstractC0030c;
import ai.AbstractC0151h;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadListRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7367b;

    @InterfaceC4485b("employeeIds")
    private final List<String> employeeIds;

    @InterfaceC4485b("filters")
    private final LeadFilterRequest filters;

    @InterfaceC4485b("pageNo")
    private final int pageNo;

    @InterfaceC4485b("pageSize")
    private final int pageSize;

    @InterfaceC4485b("sortBy")
    private final String sortBy;

    @InterfaceC4485b("sortOrder")
    private final String sortOrder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadListRequest(C4802m userSimDetails, int i10, int i11, String sortBy, String sortOrder, List<String> employeeIds, LeadFilterRequest leadFilterRequest) {
        super(userSimDetails);
        AbstractC4154l.m8923f(userSimDetails, "userSimDetails");
        AbstractC4154l.m8923f(sortBy, "sortBy");
        AbstractC4154l.m8923f(sortOrder, "sortOrder");
        AbstractC4154l.m8923f(employeeIds, "employeeIds");
        this.f7367b = userSimDetails;
        this.pageNo = i10;
        this.pageSize = i11;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.employeeIds = employeeIds;
        this.filters = leadFilterRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadListRequest)) {
            return false;
        }
        LeadListRequest leadListRequest = (LeadListRequest) obj;
        return AbstractC4154l.m8918a(this.f7367b, leadListRequest.f7367b) && this.pageNo == leadListRequest.pageNo && this.pageSize == leadListRequest.pageSize && AbstractC4154l.m8918a(this.sortBy, leadListRequest.sortBy) && AbstractC4154l.m8918a(this.sortOrder, leadListRequest.sortOrder) && AbstractC4154l.m8918a(this.employeeIds, leadListRequest.employeeIds) && AbstractC4154l.m8918a(this.filters, leadListRequest.filters);
    }

    public final int hashCode() {
        int iM4559f = AbstractC1452a.m4559f(this.employeeIds, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4556c(this.pageSize, AbstractC1452a.m4556c(this.pageNo, this.f7367b.hashCode() * 31, 31), 31), 31, this.sortBy), 31, this.sortOrder), 31);
        LeadFilterRequest leadFilterRequest = this.filters;
        return iM4559f + (leadFilterRequest == null ? 0 : leadFilterRequest.hashCode());
    }

    public final String toString() {
        int i10 = this.pageNo;
        int i11 = this.pageSize;
        String str = this.sortBy;
        String str2 = this.sortOrder;
        List<String> list = this.employeeIds;
        LeadFilterRequest leadFilterRequest = this.filters;
        StringBuilder sb2 = new StringBuilder("LeadListRequest(userSimDetails=");
        sb2.append(this.f7367b);
        sb2.append(", pageNo=");
        sb2.append(i10);
        sb2.append(", pageSize=");
        AbstractC1452a.m4550A(sb2, i11, ", sortBy=", str, ", sortOrder=");
        sb2.append(str2);
        sb2.append(", employeeIds=");
        sb2.append(list);
        sb2.append(", filters=");
        sb2.append(leadFilterRequest);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ LeadListRequest(C4802m c4802m, int i10, int i11, String str, String str2, List list, LeadFilterRequest leadFilterRequest, int i12, AbstractC4148f abstractC4148f) {
        this(c4802m, i10, i11, str, (i12 & 16) != 0 ? "desc" : str2, list, leadFilterRequest);
    }
}
