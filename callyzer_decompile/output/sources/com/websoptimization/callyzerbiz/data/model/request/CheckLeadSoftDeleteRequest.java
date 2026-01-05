package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import ai.AbstractC0151h;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CheckLeadSoftDeleteRequest extends AbstractC0151h {

    @InterfaceC4485b("secondaryNumber")
    private final String alternativeNumber;

    /* renamed from: b */
    public final C4802m f7347b;

    @InterfaceC4485b("number")
    private final String phoneNumber;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckLeadSoftDeleteRequest(String phoneNumber, String alternativeNumber, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        AbstractC4154l.m8923f(alternativeNumber, "alternativeNumber");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.phoneNumber = phoneNumber;
        this.alternativeNumber = alternativeNumber;
        this.f7347b = userSimDetail;
    }

    /* renamed from: N */
    public final String m4644N() {
        return this.alternativeNumber;
    }

    /* renamed from: O */
    public final String m4645O() {
        return this.phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckLeadSoftDeleteRequest)) {
            return false;
        }
        CheckLeadSoftDeleteRequest checkLeadSoftDeleteRequest = (CheckLeadSoftDeleteRequest) obj;
        return AbstractC4154l.m8918a(this.phoneNumber, checkLeadSoftDeleteRequest.phoneNumber) && AbstractC4154l.m8918a(this.alternativeNumber, checkLeadSoftDeleteRequest.alternativeNumber) && AbstractC4154l.m8918a(this.f7347b, checkLeadSoftDeleteRequest.f7347b);
    }

    public final int hashCode() {
        return this.f7347b.hashCode() + AbstractC0030c.m113d(this.phoneNumber.hashCode() * 31, 31, this.alternativeNumber);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("CheckLeadSoftDeleteRequest(phoneNumber=", this.phoneNumber, ", alternativeNumber=", this.alternativeNumber, ", userSimDetail=");
        sbM127r.append(this.f7347b);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
