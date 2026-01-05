package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import ai.AbstractC0151h;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class SaveLeadRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7361b;

    @InterfaceC4485b("leadDetails")
    private final LeadDetails leadDetails;

    @InterfaceC4485b("versionId")
    private final String versionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveLeadRequest(LeadDetails leadDetails, String versionId, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(leadDetails, "leadDetails");
        AbstractC4154l.m8923f(versionId, "versionId");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.leadDetails = leadDetails;
        this.versionId = versionId;
        this.f7361b = userSimDetail;
    }

    /* renamed from: N */
    public final LeadDetails m4682N() {
        return this.leadDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveLeadRequest)) {
            return false;
        }
        SaveLeadRequest saveLeadRequest = (SaveLeadRequest) obj;
        return AbstractC4154l.m8918a(this.leadDetails, saveLeadRequest.leadDetails) && AbstractC4154l.m8918a(this.versionId, saveLeadRequest.versionId) && AbstractC4154l.m8918a(this.f7361b, saveLeadRequest.f7361b);
    }

    public final int hashCode() {
        return this.f7361b.hashCode() + AbstractC0030c.m113d(this.leadDetails.hashCode() * 31, 31, this.versionId);
    }

    public final String toString() {
        return "SaveLeadRequest(leadDetails=" + this.leadDetails + ", versionId=" + this.versionId + ", userSimDetail=" + this.f7361b + ")";
    }
}
