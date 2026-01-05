package com.websoptimization.callyzerbiz.data.model.request.quick_call;

import a2.AbstractC0030c;
import ai.AbstractC0151h;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class ConnectExtensionRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7372b;

    @InterfaceC4485b("employeeIds")
    private final List<String> employeeIds;

    @InterfaceC4485b("extensionCode")
    private final String extensionCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectExtensionRequest(List<String> employeeIds, String extensionCode, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(employeeIds, "employeeIds");
        AbstractC4154l.m8923f(extensionCode, "extensionCode");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.employeeIds = employeeIds;
        this.extensionCode = extensionCode;
        this.f7372b = userSimDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectExtensionRequest)) {
            return false;
        }
        ConnectExtensionRequest connectExtensionRequest = (ConnectExtensionRequest) obj;
        return AbstractC4154l.m8918a(this.employeeIds, connectExtensionRequest.employeeIds) && AbstractC4154l.m8918a(this.extensionCode, connectExtensionRequest.extensionCode) && AbstractC4154l.m8918a(this.f7372b, connectExtensionRequest.f7372b);
    }

    public final int hashCode() {
        return this.f7372b.hashCode() + AbstractC0030c.m113d(this.employeeIds.hashCode() * 31, 31, this.extensionCode);
    }

    public final String toString() {
        return "ConnectExtensionRequest(employeeIds=" + this.employeeIds + ", extensionCode=" + this.extensionCode + ", userSimDetail=" + this.f7372b + ")";
    }
}
