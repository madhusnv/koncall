package com.websoptimization.callyzerbiz.data.model.request;

import ai.AbstractC0151h;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class GetLeadByNumberRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7353b;

    @InterfaceC4485b("leadNumber")
    private final String leadNumber;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLeadByNumberRequest(String leadNumber, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(leadNumber, "leadNumber");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.leadNumber = leadNumber;
        this.f7353b = userSimDetail;
    }

    /* renamed from: N */
    public final String m4663N() {
        return this.leadNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLeadByNumberRequest)) {
            return false;
        }
        GetLeadByNumberRequest getLeadByNumberRequest = (GetLeadByNumberRequest) obj;
        return AbstractC4154l.m8918a(this.leadNumber, getLeadByNumberRequest.leadNumber) && AbstractC4154l.m8918a(this.f7353b, getLeadByNumberRequest.f7353b);
    }

    public final int hashCode() {
        return this.f7353b.hashCode() + (this.leadNumber.hashCode() * 31);
    }

    public final String toString() {
        return "GetLeadByNumberRequest(leadNumber=" + this.leadNumber + ", userSimDetail=" + this.f7353b + ")";
    }
}
