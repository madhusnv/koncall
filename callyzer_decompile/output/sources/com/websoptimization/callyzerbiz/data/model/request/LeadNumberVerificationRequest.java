package com.websoptimization.callyzerbiz.data.model.request;

import ai.AbstractC0151h;
import com.websoptimization.callyzerbiz.data.model.common.PhoneNumber;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadNumberVerificationRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7357b;

    @InterfaceC4485b("verificationNumbers")
    private final List<PhoneNumber> verificationNumbers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadNumberVerificationRequest(C4802m userSimDetails, List<PhoneNumber> verificationNumbers) {
        super(userSimDetails);
        AbstractC4154l.m8923f(userSimDetails, "userSimDetails");
        AbstractC4154l.m8923f(verificationNumbers, "verificationNumbers");
        this.f7357b = userSimDetails;
        this.verificationNumbers = verificationNumbers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadNumberVerificationRequest)) {
            return false;
        }
        LeadNumberVerificationRequest leadNumberVerificationRequest = (LeadNumberVerificationRequest) obj;
        return AbstractC4154l.m8918a(this.f7357b, leadNumberVerificationRequest.f7357b) && AbstractC4154l.m8918a(this.verificationNumbers, leadNumberVerificationRequest.verificationNumbers);
    }

    public final int hashCode() {
        return this.verificationNumbers.hashCode() + (this.f7357b.hashCode() * 31);
    }

    public final String toString() {
        return "LeadNumberVerificationRequest(userSimDetails=" + this.f7357b + ", verificationNumbers=" + this.verificationNumbers + ")";
    }
}
