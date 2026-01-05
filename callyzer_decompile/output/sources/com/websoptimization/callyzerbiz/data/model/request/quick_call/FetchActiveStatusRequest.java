package com.websoptimization.callyzerbiz.data.model.request.quick_call;

import ai.AbstractC0151h;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FetchActiveStatusRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7374b;

    @InterfaceC4485b("employeeIds")
    private final List<String> employeeIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchActiveStatusRequest(List<String> employeeIds, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(employeeIds, "employeeIds");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.employeeIds = employeeIds;
        this.f7374b = userSimDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchActiveStatusRequest)) {
            return false;
        }
        FetchActiveStatusRequest fetchActiveStatusRequest = (FetchActiveStatusRequest) obj;
        return AbstractC4154l.m8918a(this.employeeIds, fetchActiveStatusRequest.employeeIds) && AbstractC4154l.m8918a(this.f7374b, fetchActiveStatusRequest.f7374b);
    }

    public final int hashCode() {
        return this.f7374b.hashCode() + (this.employeeIds.hashCode() * 31);
    }

    public final String toString() {
        return "FetchActiveStatusRequest(employeeIds=" + this.employeeIds + ", userSimDetail=" + this.f7374b + ")";
    }
}
