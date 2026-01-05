package com.websoptimization.callyzerbiz.data.model.request;

import ai.AbstractC0151h;
import j$.time.LocalDate;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class GetCallLogsRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7352b;

    @InterfaceC4485b("endDate")
    private final LocalDate endDate;

    @InterfaceC4485b("startDate")
    private final LocalDate startDate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCallLogsRequest(LocalDate startDate, LocalDate endDate, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(startDate, "startDate");
        AbstractC4154l.m8923f(endDate, "endDate");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.startDate = startDate;
        this.endDate = endDate;
        this.f7352b = userSimDetail;
    }

    /* renamed from: N */
    public final LocalDate m4661N() {
        return this.endDate;
    }

    /* renamed from: O */
    public final LocalDate m4662O() {
        return this.startDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCallLogsRequest)) {
            return false;
        }
        GetCallLogsRequest getCallLogsRequest = (GetCallLogsRequest) obj;
        return AbstractC4154l.m8918a(this.startDate, getCallLogsRequest.startDate) && AbstractC4154l.m8918a(this.endDate, getCallLogsRequest.endDate) && AbstractC4154l.m8918a(this.f7352b, getCallLogsRequest.f7352b);
    }

    public final int hashCode() {
        return this.f7352b.hashCode() + ((this.endDate.hashCode() + (this.startDate.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "GetCallLogsRequest(startDate=" + this.startDate + ", endDate=" + this.endDate + ", userSimDetail=" + this.f7352b + ")";
    }
}
