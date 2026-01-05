package com.websoptimization.callyzerbiz.data.model.request.quick_call;

import ai.AbstractC0151h;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class DisConnectExtensionRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7373b;

    @InterfaceC4485b("extensionCode")
    private final String extensionCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisConnectExtensionRequest(String extensionCode, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(extensionCode, "extensionCode");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.extensionCode = extensionCode;
        this.f7373b = userSimDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisConnectExtensionRequest)) {
            return false;
        }
        DisConnectExtensionRequest disConnectExtensionRequest = (DisConnectExtensionRequest) obj;
        return AbstractC4154l.m8918a(this.extensionCode, disConnectExtensionRequest.extensionCode) && AbstractC4154l.m8918a(this.f7373b, disConnectExtensionRequest.f7373b);
    }

    public final int hashCode() {
        return this.f7373b.hashCode() + (this.extensionCode.hashCode() * 31);
    }

    public final String toString() {
        return "DisConnectExtensionRequest(extensionCode=" + this.extensionCode + ", userSimDetail=" + this.f7373b + ")";
    }
}
