package com.websoptimization.callyzerbiz.data.model.request;

import ai.AbstractC0151h;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class TotalDueLeadRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7365b;

    @InterfaceC4485b("employeeIds")
    private final List<String> employeeIds;

    @InterfaceC4485b("fromDate")
    private final LocalDate fromDate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalDueLeadRequest(LocalDate fromDate, List<String> employeeIds, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(fromDate, "fromDate");
        AbstractC4154l.m8923f(employeeIds, "employeeIds");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.fromDate = fromDate;
        this.employeeIds = employeeIds;
        this.f7365b = userSimDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalDueLeadRequest)) {
            return false;
        }
        TotalDueLeadRequest totalDueLeadRequest = (TotalDueLeadRequest) obj;
        return AbstractC4154l.m8918a(this.fromDate, totalDueLeadRequest.fromDate) && AbstractC4154l.m8918a(this.employeeIds, totalDueLeadRequest.employeeIds) && AbstractC4154l.m8918a(this.f7365b, totalDueLeadRequest.f7365b);
    }

    public final int hashCode() {
        return this.f7365b.hashCode() + AbstractC1452a.m4559f(this.employeeIds, this.fromDate.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TotalDueLeadRequest(fromDate=" + this.fromDate + ", employeeIds=" + this.employeeIds + ", userSimDetail=" + this.f7365b + ")";
    }
}
